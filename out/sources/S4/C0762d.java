package S4;

import U4.C0803k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: S4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0762d extends V4.a {
    public static final Parcelable.Creator<C0762d> CREATOR = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f5535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5537e;

    public C0762d(String str, int i10, long j, boolean z10) {
        this.f5534b = str;
        this.f5535c = i10;
        this.f5536d = j;
        this.f5537e = z10;
    }

    public final long e() {
        long j = this.f5536d;
        return j == -1 ? this.f5535c : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0762d) {
            C0762d c0762d = (C0762d) obj;
            if (C0803k.a(this.f5534b, c0762d.f5534b) && e() == c0762d.e() && this.f5537e == c0762d.f5537e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5534b, Long.valueOf(e()), Boolean.valueOf(this.f5537e)});
    }

    public final String toString() {
        C0803k.a aVar = new C0803k.a(this);
        aVar.a(this.f5534b, "name");
        aVar.a(Long.valueOf(e()), "version");
        aVar.a(Boolean.valueOf(this.f5537e), "is_fully_rolled_out");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.k(parcel, 1, this.f5534b);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(this.f5535c);
        long jE = e();
        Fa.d.n(parcel, 3, 8);
        parcel.writeLong(jE);
        Fa.d.n(parcel, 4, 4);
        parcel.writeInt(this.f5537e ? 1 : 0);
        Fa.d.p(parcel, iO);
    }

    public C0762d(String str, long j) {
        this(str, -1, j, false);
    }
}
