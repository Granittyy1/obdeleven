package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import com.parse.ParseObject;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseRelation<T extends ParseObject> implements Parcelable {
    public static final Parcelable.Creator<ParseRelation> CREATOR = new Parcelable.Creator<ParseRelation>() { // from class: com.parse.ParseRelation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseRelation createFromParcel(Parcel parcel) {
            return new ParseRelation(parcel, new ParseObjectParcelDecoder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseRelation[] newArray(int i10) {
            return new ParseRelation[i10];
        }
    };
    private String key;
    private Set<ParseObject> knownObjects;
    private final Object mutex;
    private WeakReference<ParseObject> parent;
    private String parentClassName;
    private String parentObjectId;
    private String targetClass;

    public ParseRelation(ParseObject parseObject, String str) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        this.parent = new WeakReference<>(parseObject);
        this.parentObjectId = parseObject.getObjectId();
        this.parentClassName = parseObject.getClassName();
        this.key = str;
        this.targetClass = null;
    }

    public void add(T t8) {
        synchronized (this.mutex) {
            ParseRelationOperation parseRelationOperation = new ParseRelationOperation(Collections.singleton(t8), null);
            this.targetClass = parseRelationOperation.getTargetClass();
            getParent().performOperation(this.key, parseRelationOperation);
            this.knownObjects.add(t8);
        }
    }

    public void addKnownObject(ParseObject parseObject) {
        synchronized (this.mutex) {
            this.knownObjects.add(parseObject);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject encodeToJSON(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject;
        synchronized (this.mutex) {
            jSONObject = new JSONObject();
            jSONObject.put("__type", "Relation");
            jSONObject.put("className", this.targetClass);
            JSONArray jSONArray = new JSONArray();
            Iterator<ParseObject> it = this.knownObjects.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(parseEncoder.encodeRelatedObject(it.next()));
                } catch (Exception unused) {
                }
            }
            jSONObject.put("objects", jSONArray);
        }
        return jSONObject;
    }

    public void ensureParentAndKey(ParseObject parseObject, String str) {
        synchronized (this.mutex) {
            try {
                if (this.parent == null) {
                    this.parent = new WeakReference<>(parseObject);
                    this.parentObjectId = parseObject.getObjectId();
                    this.parentClassName = parseObject.getClassName();
                }
                if (this.key == null) {
                    this.key = str;
                }
                if (this.parent.get() != parseObject) {
                    throw new IllegalStateException("Internal error. One ParseRelation retrieved from two different ParseObjects.");
                }
                if (!this.key.equals(str)) {
                    throw new IllegalStateException("Internal error. One ParseRelation retrieved from two different keys.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ParseObject getParent() {
        WeakReference<ParseObject> weakReference = this.parent;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get() == null ? ParseObject.createWithoutData(this.parentClassName, this.parentObjectId) : this.parent.get();
    }

    public ParseQuery<T> getQuery() {
        ParseQuery<T> parseQuery;
        synchronized (this.mutex) {
            try {
                String str = this.targetClass;
                ParseQuery.State.Builder<T> builderRedirectClassNameForKey = str == null ? new ParseQuery.State.Builder(this.parentClassName).redirectClassNameForKey(this.key) : new ParseQuery.State.Builder<>(str);
                builderRedirectClassNameForKey.whereRelatedTo(getParent(), this.key);
                parseQuery = new ParseQuery<>(builderRedirectClassNameForKey);
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseQuery;
    }

    public String getTargetClass() {
        String str;
        synchronized (this.mutex) {
            str = this.targetClass;
        }
        return str;
    }

    public boolean hasKnownObject(ParseObject parseObject) {
        boolean zContains;
        synchronized (this.mutex) {
            zContains = this.knownObjects.contains(parseObject);
        }
        return zContains;
    }

    public void remove(T t8) {
        synchronized (this.mutex) {
            ParseRelationOperation parseRelationOperation = new ParseRelationOperation(null, Collections.singleton(t8));
            this.targetClass = parseRelationOperation.getTargetClass();
            getParent().performOperation(this.key, parseRelationOperation);
            this.knownObjects.remove(t8);
        }
    }

    public void removeKnownObject(ParseObject parseObject) {
        synchronized (this.mutex) {
            this.knownObjects.remove(parseObject);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        writeToParcel(parcel, new ParseObjectParcelEncoder());
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        synchronized (this.mutex) {
            try {
                byte b10 = 0;
                parcel.writeByte(this.key != null ? (byte) 1 : (byte) 0);
                String str = this.key;
                if (str != null) {
                    parcel.writeString(str);
                }
                parcel.writeByte(this.targetClass != null ? (byte) 1 : (byte) 0);
                String str2 = this.targetClass;
                if (str2 != null) {
                    parcel.writeString(str2);
                }
                parcel.writeByte(this.parentClassName != null ? (byte) 1 : (byte) 0);
                String str3 = this.parentClassName;
                if (str3 != null) {
                    parcel.writeString(str3);
                }
                parcel.writeByte(this.parentObjectId != null ? (byte) 1 : (byte) 0);
                String str4 = this.parentObjectId;
                if (str4 != null) {
                    parcel.writeString(str4);
                }
                WeakReference<ParseObject> weakReference = this.parent;
                if (weakReference != null && weakReference.get() != null) {
                    b10 = 1;
                }
                parcel.writeByte(b10);
                if (b10 != 0) {
                    parseParcelEncoder.encode(this.parent.get(), parcel);
                }
                parcel.writeInt(this.knownObjects.size());
                Iterator<ParseObject> it = this.knownObjects.iterator();
                while (it.hasNext()) {
                    parseParcelEncoder.encode(it.next(), parcel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ParseRelation(String str) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        this.parent = null;
        this.parentObjectId = null;
        this.parentClassName = null;
        this.key = null;
        this.targetClass = str;
    }

    public ParseRelation(JSONObject jSONObject, ParseDecoder parseDecoder) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        this.parent = null;
        this.parentObjectId = null;
        this.parentClassName = null;
        this.key = null;
        this.targetClass = jSONObject.optString("className", null);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("objects");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.knownObjects.add((ParseObject) parseDecoder.decode(jSONArrayOptJSONArray.optJSONObject(i10)));
            }
        }
    }

    public ParseRelation(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        this.mutex = new Object();
        this.knownObjects = new HashSet();
        if (parcel.readByte() == 1) {
            this.key = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.targetClass = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.parentClassName = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.parentObjectId = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.parent = new WeakReference<>((ParseObject) parseParcelDecoder.decode(parcel));
        }
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.knownObjects.add((ParseObject) parseParcelDecoder.decode(parcel));
        }
    }
}
