package U4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0796d extends V4.a {
    public static final Parcelable.Creator<C0796d> CREATOR = new W();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0806n f6436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f6439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6441g;

    public C0796d(C0806n c0806n, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f6436b = c0806n;
        this.f6437c = z10;
        this.f6438d = z11;
        this.f6439e = iArr;
        this.f6440f = i10;
        this.f6441g = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.j(parcel, 1, this.f6436b, i10);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(this.f6437c ? 1 : 0);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f6438d ? 1 : 0);
        int[] iArr = this.f6439e;
        if (iArr != null) {
            int iO2 = Fa.d.o(parcel, 4);
            parcel.writeIntArray(iArr);
            Fa.d.p(parcel, iO2);
        }
        Fa.d.n(parcel, 5, 4);
        parcel.writeInt(this.f6440f);
        int[] iArr2 = this.f6441g;
        if (iArr2 != null) {
            int iO3 = Fa.d.o(parcel, 6);
            parcel.writeIntArray(iArr2);
            Fa.d.p(parcel, iO3);
        }
        Fa.d.p(parcel, iO);
    }
}
