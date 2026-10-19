package com.google.android.gms.auth.api.signin;

import Fa.d;
import U4.C0804l;
import V4.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new P4.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f25289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f25291i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f25292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f25293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f25294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashSet f25295n = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f25284b = i10;
        this.f25285c = str;
        this.f25286d = str2;
        this.f25287e = str3;
        this.f25288f = str4;
        this.f25289g = uri;
        this.f25290h = str5;
        this.f25291i = j;
        this.j = str6;
        this.f25292k = arrayList;
        this.f25293l = str7;
        this.f25294m = str8;
    }

    public static GoogleSignInAccount k(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        C0804l.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f25290h = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet(this.f25292k);
        hashSet.addAll(this.f25295n);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.e().equals(e());
    }

    public final int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + e().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.n(parcel, 1, 4);
        parcel.writeInt(this.f25284b);
        d.k(parcel, 2, this.f25285c);
        d.k(parcel, 3, this.f25286d);
        d.k(parcel, 4, this.f25287e);
        d.k(parcel, 5, this.f25288f);
        d.j(parcel, 6, this.f25289g, i10);
        d.k(parcel, 7, this.f25290h);
        d.n(parcel, 8, 8);
        parcel.writeLong(this.f25291i);
        d.k(parcel, 9, this.j);
        d.m(parcel, 10, this.f25292k);
        d.k(parcel, 11, this.f25293l);
        d.k(parcel, 12, this.f25294m);
        d.p(parcel, iO);
    }
}
