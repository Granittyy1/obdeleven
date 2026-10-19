package S4;

import U4.C0803k;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: S4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0760b extends V4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f5528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f5530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0760b f5525g = new C0760b(0, null, null);
    public static final Parcelable.Creator<C0760b> CREATOR = new m();

    public C0760b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f5526b = i10;
        this.f5527c = i11;
        this.f5528d = pendingIntent;
        this.f5529e = str;
        this.f5530f = num;
    }

    public static String v(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean e() {
        return (this.f5527c == 0 || this.f5528d == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0760b)) {
            return false;
        }
        C0760b c0760b = (C0760b) obj;
        return this.f5527c == c0760b.f5527c && C0803k.a(this.f5528d, c0760b.f5528d) && C0803k.a(this.f5529e, c0760b.f5529e) && C0803k.a(this.f5530f, c0760b.f5530f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5527c), this.f5528d, this.f5529e, this.f5530f});
    }

    public final boolean k() {
        return this.f5527c == 0;
    }

    public final String toString() {
        C0803k.a aVar = new C0803k.a(this);
        aVar.a(v(this.f5527c), "statusCode");
        aVar.a(this.f5528d, "resolution");
        aVar.a(this.f5529e, "message");
        aVar.a(this.f5530f, "clientMethodKey");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f5526b);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(this.f5527c);
        Fa.d.j(parcel, 3, this.f5528d, i10);
        Fa.d.k(parcel, 4, this.f5529e);
        Integer num = this.f5530f;
        if (num != null) {
            Fa.d.n(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        Fa.d.p(parcel, iO);
    }

    public C0760b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
