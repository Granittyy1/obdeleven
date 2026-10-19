package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Z3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessToken.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0835a implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f7785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f7786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f7787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f7788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessTokenSource f7790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Date f7791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7792i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Date f7793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Date f7782m = new Date(Long.MAX_VALUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Date f7783n = new Date();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AccessTokenSource f7784o = AccessTokenSource.f24729b;
    public static final Parcelable.Creator<C0835a> CREATOR = new C0111a();

    /* JADX INFO: renamed from: Z3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessToken.kt */
    public static final class C0111a implements Parcelable.Creator<C0835a> {
        @Override // android.os.Parcelable.Creator
        public final C0835a createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new C0835a(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0835a[] newArray(int i10) {
            return new C0835a[i10];
        }
    }

    /* JADX INFO: renamed from: Z3.a$b */
    /* JADX INFO: compiled from: AccessToken.kt */
    public static final class b {
        public static C0835a a(JSONObject jSONObject) throws JSONException {
            if (jSONObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray permissionsArray = jSONObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string = jSONObject.getString("source");
            kotlin.jvm.internal.i.d(string, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
            String applicationId = jSONObject.getString("application_id");
            String userId = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            kotlin.jvm.internal.i.d(token, "token");
            kotlin.jvm.internal.i.d(applicationId, "applicationId");
            kotlin.jvm.internal.i.d(userId, "userId");
            kotlin.jvm.internal.i.d(permissionsArray, "permissionsArray");
            ArrayList arrayListZ = p165n4.s.z(permissionsArray);
            kotlin.jvm.internal.i.d(declinedPermissionsArray, "declinedPermissionsArray");
            return new C0835a(token, applicationId, userId, arrayListZ, p165n4.s.z(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : p165n4.s.z(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        public static C0835a b() {
            return C0841g.f7810f.a().f7814c;
        }

        public static boolean c() {
            C0835a c0835a = C0841g.f7810f.a().f7814c;
            return (c0835a == null || new Date().after(c0835a.f7785b)) ? false : true;
        }
    }

    public C0835a(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.i.e(accessToken, "accessToken");
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        kotlin.jvm.internal.i.e(userId, "userId");
        p165n4.t.b(accessToken, "accessToken");
        p165n4.t.b(applicationId, "applicationId");
        p165n4.t.b(userId, "userId");
        Date date4 = f7782m;
        this.f7785b = date == null ? date4 : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.i.d(setUnmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f7786c = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.i.d(setUnmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f7787d = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.i.d(setUnmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f7788e = setUnmodifiableSet3;
        this.f7789f = accessToken;
        accessTokenSource = accessTokenSource == null ? f7784o : accessTokenSource;
        if (str != null && str.equals("instagram")) {
            int iOrdinal = accessTokenSource.ordinal();
            if (iOrdinal == 1) {
                accessTokenSource = AccessTokenSource.f24734g;
            } else if (iOrdinal == 4) {
                accessTokenSource = AccessTokenSource.f24736i;
            } else if (iOrdinal == 5) {
                accessTokenSource = AccessTokenSource.f24735h;
            }
        }
        this.f7790g = accessTokenSource;
        this.f7791h = date2 == null ? f7783n : date2;
        this.f7792i = applicationId;
        this.j = userId;
        this.f7793k = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f7794l = str == null ? "facebook" : str;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f7789f);
        jSONObject.put("expires_at", this.f7785b.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f7786c));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f7787d));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f7788e));
        jSONObject.put("last_refresh", this.f7791h.getTime());
        jSONObject.put("source", this.f7790g.name());
        jSONObject.put("application_id", this.f7792i);
        jSONObject.put("user_id", this.j);
        jSONObject.put("data_access_expiration_time", this.f7793k.getTime());
        String str = this.f7794l;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0835a)) {
            return false;
        }
        C0835a c0835a = (C0835a) obj;
        if (kotlin.jvm.internal.i.a(this.f7785b, c0835a.f7785b) && kotlin.jvm.internal.i.a(this.f7786c, c0835a.f7786c) && kotlin.jvm.internal.i.a(this.f7787d, c0835a.f7787d) && kotlin.jvm.internal.i.a(this.f7788e, c0835a.f7788e) && kotlin.jvm.internal.i.a(this.f7789f, c0835a.f7789f) && this.f7790g == c0835a.f7790g && kotlin.jvm.internal.i.a(this.f7791h, c0835a.f7791h) && kotlin.jvm.internal.i.a(this.f7792i, c0835a.f7792i) && kotlin.jvm.internal.i.a(this.j, c0835a.j) && kotlin.jvm.internal.i.a(this.f7793k, c0835a.f7793k)) {
            String str = this.f7794l;
            String str2 = c0835a.f7794l;
            if (str == null) {
                zA = str2 == null;
            } else {
                zA = kotlin.jvm.internal.i.a(str, str2);
            }
            if (zA) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f7793k.hashCode() + B1.a.b(this.j, B1.a.b(this.f7792i, (this.f7791h.hashCode() + ((this.f7790g.hashCode() + B1.a.b(this.f7789f, (this.f7788e.hashCode() + ((this.f7787d.hashCode() + ((this.f7786c.hashCode() + ((this.f7785b.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.f7794l;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        q qVar = q.f7852a;
        synchronized (q.f7853b) {
        }
        sb2.append(TextUtils.join(", ", this.f7786c));
        sb2.append("]}");
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeLong(this.f7785b.getTime());
        dest.writeStringList(new ArrayList(this.f7786c));
        dest.writeStringList(new ArrayList(this.f7787d));
        dest.writeStringList(new ArrayList(this.f7788e));
        dest.writeString(this.f7789f);
        dest.writeString(this.f7790g.name());
        dest.writeLong(this.f7791h.getTime());
        dest.writeString(this.f7792i);
        dest.writeString(this.j);
        dest.writeLong(this.f7793k.getTime());
        dest.writeString(this.f7794l);
    }

    public C0835a(Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        kotlin.jvm.internal.i.e(parcel, "parcel");
        this.f7785b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.i.d(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f7786c = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.i.d(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f7787d = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.i.d(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f7788e = setUnmodifiableSet3;
        String string = parcel.readString();
        p165n4.t.d(string, "token");
        this.f7789f = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
        } else {
            accessTokenSourceValueOf = f7784o;
        }
        this.f7790g = accessTokenSourceValueOf;
        this.f7791h = new Date(parcel.readLong());
        String string3 = parcel.readString();
        p165n4.t.d(string3, "applicationId");
        this.f7792i = string3;
        String string4 = parcel.readString();
        p165n4.t.d(string4, "userId");
        this.j = string4;
        this.f7793k = new Date(parcel.readLong());
        this.f7794l = parcel.readString();
    }
}
