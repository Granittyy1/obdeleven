package Z3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: compiled from: Profile.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f7912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f7913h;

    /* JADX INFO: compiled from: Profile.kt */
    public static final class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new y(source);
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        p165n4.t.d(str, "id");
        this.f7907b = str;
        this.f7908c = str2;
        this.f7909d = str3;
        this.f7910e = str4;
        this.f7911f = str5;
        this.f7912g = uri;
        this.f7913h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        String str5 = this.f7907b;
        return ((str5 == null && ((y) obj).f7907b == null) || kotlin.jvm.internal.i.a(str5, ((y) obj).f7907b)) && (((str = this.f7908c) == null && ((y) obj).f7908c == null) || kotlin.jvm.internal.i.a(str, ((y) obj).f7908c)) && ((((str2 = this.f7909d) == null && ((y) obj).f7909d == null) || kotlin.jvm.internal.i.a(str2, ((y) obj).f7909d)) && ((((str3 = this.f7910e) == null && ((y) obj).f7910e == null) || kotlin.jvm.internal.i.a(str3, ((y) obj).f7910e)) && ((((str4 = this.f7911f) == null && ((y) obj).f7911f == null) || kotlin.jvm.internal.i.a(str4, ((y) obj).f7911f)) && ((((uri = this.f7912g) == null && ((y) obj).f7912g == null) || kotlin.jvm.internal.i.a(uri, ((y) obj).f7912g)) && (((uri2 = this.f7913h) == null && ((y) obj).f7913h == null) || kotlin.jvm.internal.i.a(uri2, ((y) obj).f7913h))))));
    }

    public final int hashCode() {
        String str = this.f7907b;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f7908c;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f7909d;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f7910e;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f7911f;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f7912g;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f7913h;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeString(this.f7907b);
        dest.writeString(this.f7908c);
        dest.writeString(this.f7909d);
        dest.writeString(this.f7910e);
        dest.writeString(this.f7911f);
        Uri uri = this.f7912g;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f7913h;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public y(JSONObject jSONObject) {
        this.f7907b = jSONObject.optString("id", null);
        this.f7908c = jSONObject.optString("first_name", null);
        this.f7909d = jSONObject.optString("middle_name", null);
        this.f7910e = jSONObject.optString("last_name", null);
        this.f7911f = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f7912g = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f7913h = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public y(Parcel parcel) {
        this.f7907b = parcel.readString();
        this.f7908c = parcel.readString();
        this.f7909d = parcel.readString();
        this.f7910e = parcel.readString();
        this.f7911f = parcel.readString();
        String string = parcel.readString();
        this.f7912g = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f7913h = string2 != null ? Uri.parse(string2) : null;
    }
}
