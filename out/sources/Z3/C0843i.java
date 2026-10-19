package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.braze.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Z3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0843i implements Parcelable {
    public static final Parcelable.Creator<C0843i> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7834i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<String> f7839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f7840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map<String, Integer> f7841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map<String, String> f7842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map<String, String> f7843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f7845u;

    /* JADX INFO: renamed from: Z3.i$a */
    /* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
    public static final class a implements Parcelable.Creator<C0843i> {
        @Override // android.os.Parcelable.Creator
        public final C0843i createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new C0843i(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0843i[] newArray(int i10) {
            return new C0843i[i10];
        }
    }

    /* JADX INFO: renamed from: Z3.i$b */
    /* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
    public static final class b {
        public static String a(String str, JSONObject jSONObject) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public C0843i(String encodedClaims, String expectedNonce) throws JSONException {
        Set<String> setUnmodifiableSet;
        kotlin.jvm.internal.i.e(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.i.e(expectedNonce, "expectedNonce");
        p165n4.t.b(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.i.d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, kotlin.text.a.f43120b));
        String jti = jSONObject.optString("jti");
        kotlin.jvm.internal.i.d(jti, "jti");
        if (jti.length() != 0) {
            try {
                String iss = jSONObject.optString("iss");
                kotlin.jvm.internal.i.d(iss, "iss");
                if (iss.length() != 0 && (kotlin.jvm.internal.i.a(new URL(iss).getHost(), "facebook.com") || kotlin.jvm.internal.i.a(new URL(iss).getHost(), "www.facebook.com"))) {
                    String aud = jSONObject.optString("aud");
                    kotlin.jvm.internal.i.d(aud, "aud");
                    if (aud.length() != 0 && aud.equals(q.b())) {
                        long jOptLong = jSONObject.optLong("exp");
                        long j = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                        if (!new Date().after(new Date(jOptLong * j))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * j) + 600000))) {
                                String sub = jSONObject.optString("sub");
                                kotlin.jvm.internal.i.d(sub, "sub");
                                if (sub.length() != 0) {
                                    String nonce = jSONObject.optString("nonce");
                                    kotlin.jvm.internal.i.d(nonce, "nonce");
                                    if (nonce.length() != 0 && nonce.equals(expectedNonce)) {
                                        String string = jSONObject.getString("jti");
                                        kotlin.jvm.internal.i.d(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.f7827b = string;
                                        String string2 = jSONObject.getString("iss");
                                        kotlin.jvm.internal.i.d(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.f7828c = string2;
                                        String string3 = jSONObject.getString("aud");
                                        kotlin.jvm.internal.i.d(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.f7829d = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        kotlin.jvm.internal.i.d(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.f7830e = string4;
                                        this.f7831f = jSONObject.getLong("exp");
                                        this.f7832g = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        kotlin.jvm.internal.i.d(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.f7833h = string5;
                                        this.f7834i = b.a("name", jSONObject);
                                        this.j = b.a("given_name", jSONObject);
                                        this.f7835k = b.a("middle_name", jSONObject);
                                        this.f7836l = b.a("family_name", jSONObject);
                                        this.f7837m = b.a("email", jSONObject);
                                        this.f7838n = b.a("picture", jSONObject);
                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (jSONArrayOptJSONArray == null) {
                                            setUnmodifiableSet = null;
                                        } else {
                                            HashSet hashSet = new HashSet();
                                            int length = jSONArrayOptJSONArray.length();
                                            if (length > 0) {
                                                int i10 = 0;
                                                while (true) {
                                                    int i11 = i10 + 1;
                                                    String string6 = jSONArrayOptJSONArray.getString(i10);
                                                    kotlin.jvm.internal.i.d(string6, "jsonArray.getString(i)");
                                                    hashSet.add(string6);
                                                    if (i11 >= length) {
                                                        break;
                                                    } else {
                                                        i10 = i11;
                                                    }
                                                }
                                            }
                                            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.f7839o = setUnmodifiableSet;
                                        this.f7840p = b.a("user_birthday", jSONObject);
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.f7841q = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(p165n4.s.h(jSONObjectOptJSONObject));
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.f7842r = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(p165n4.s.i(jSONObjectOptJSONObject2));
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.f7843s = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(p165n4.s.i(jSONObjectOptJSONObject3)) : null;
                                        this.f7844t = b.a("user_gender", jSONObject);
                                        this.f7845u = b.a("user_link", jSONObject);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f7827b);
        jSONObject.put("iss", this.f7828c);
        jSONObject.put("aud", this.f7829d);
        jSONObject.put("nonce", this.f7830e);
        jSONObject.put("exp", this.f7831f);
        jSONObject.put("iat", this.f7832g);
        String str = this.f7833h;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f7834i;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f7835k;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f7836l;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f7837m;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f7838n;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set<String> set = this.f7839o;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f7840p;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map<String, Integer> map = this.f7841q;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map<String, String> map2 = this.f7842r;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map<String, String> map3 = this.f7843s;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f7844t;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f7845u;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843i)) {
            return false;
        }
        C0843i c0843i = (C0843i) obj;
        return kotlin.jvm.internal.i.a(this.f7827b, c0843i.f7827b) && kotlin.jvm.internal.i.a(this.f7828c, c0843i.f7828c) && kotlin.jvm.internal.i.a(this.f7829d, c0843i.f7829d) && kotlin.jvm.internal.i.a(this.f7830e, c0843i.f7830e) && this.f7831f == c0843i.f7831f && this.f7832g == c0843i.f7832g && kotlin.jvm.internal.i.a(this.f7833h, c0843i.f7833h) && kotlin.jvm.internal.i.a(this.f7834i, c0843i.f7834i) && kotlin.jvm.internal.i.a(this.j, c0843i.j) && kotlin.jvm.internal.i.a(this.f7835k, c0843i.f7835k) && kotlin.jvm.internal.i.a(this.f7836l, c0843i.f7836l) && kotlin.jvm.internal.i.a(this.f7837m, c0843i.f7837m) && kotlin.jvm.internal.i.a(this.f7838n, c0843i.f7838n) && kotlin.jvm.internal.i.a(this.f7839o, c0843i.f7839o) && kotlin.jvm.internal.i.a(this.f7840p, c0843i.f7840p) && kotlin.jvm.internal.i.a(this.f7841q, c0843i.f7841q) && kotlin.jvm.internal.i.a(this.f7842r, c0843i.f7842r) && kotlin.jvm.internal.i.a(this.f7843s, c0843i.f7843s) && kotlin.jvm.internal.i.a(this.f7844t, c0843i.f7844t) && kotlin.jvm.internal.i.a(this.f7845u, c0843i.f7845u);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f7833h, C4.b.c(this.f7832g, C4.b.c(this.f7831f, B1.a.b(this.f7830e, B1.a.b(this.f7829d, B1.a.b(this.f7828c, B1.a.b(this.f7827b, 527, 31), 31), 31), 31), 31), 31), 31);
        String str = this.f7834i;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7835k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7836l;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7837m;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f7838n;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f7839o;
        int iHashCode7 = (iHashCode6 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f7840p;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.f7841q;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f7842r;
        int iHashCode10 = (iHashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f7843s;
        int iHashCode11 = (iHashCode10 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f7844t;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f7845u;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String string = a().toString();
        kotlin.jvm.internal.i.d(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeString(this.f7827b);
        dest.writeString(this.f7828c);
        dest.writeString(this.f7829d);
        dest.writeString(this.f7830e);
        dest.writeLong(this.f7831f);
        dest.writeLong(this.f7832g);
        dest.writeString(this.f7833h);
        dest.writeString(this.f7834i);
        dest.writeString(this.j);
        dest.writeString(this.f7835k);
        dest.writeString(this.f7836l);
        dest.writeString(this.f7837m);
        dest.writeString(this.f7838n);
        Set<String> set = this.f7839o;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.f7840p);
        dest.writeMap(this.f7841q);
        dest.writeMap(this.f7842r);
        dest.writeMap(this.f7843s);
        dest.writeString(this.f7844t);
        dest.writeString(this.f7845u);
    }

    public C0843i(Parcel parcel) {
        kotlin.jvm.internal.i.e(parcel, "parcel");
        String string = parcel.readString();
        p165n4.t.d(string, "jti");
        this.f7827b = string;
        String string2 = parcel.readString();
        p165n4.t.d(string2, "iss");
        this.f7828c = string2;
        String string3 = parcel.readString();
        p165n4.t.d(string3, "aud");
        this.f7829d = string3;
        String string4 = parcel.readString();
        p165n4.t.d(string4, "nonce");
        this.f7830e = string4;
        this.f7831f = parcel.readLong();
        this.f7832g = parcel.readLong();
        String string5 = parcel.readString();
        p165n4.t.d(string5, "sub");
        this.f7833h = string5;
        this.f7834i = parcel.readString();
        this.j = parcel.readString();
        this.f7835k = parcel.readString();
        this.f7836l = parcel.readString();
        this.f7837m = parcel.readString();
        this.f7838n = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f7839o = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f7840p = parcel.readString();
        HashMap hashMap = parcel.readHashMap(kotlin.jvm.internal.h.class.getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.f7841q = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(kotlin.jvm.internal.n.class.getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.f7842r = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(kotlin.jvm.internal.n.class.getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.f7843s = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f7844t = parcel.readString();
        this.f7845u = parcel.readString();
    }
}
