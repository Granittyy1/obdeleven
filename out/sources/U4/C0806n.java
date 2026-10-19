package U4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0806n extends V4.a {
    public static final Parcelable.Creator<C0806n> CREATOR = new L();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6482f;

    public C0806n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f6478b = i10;
        this.f6479c = z10;
        this.f6480d = z11;
        this.f6481e = i11;
        this.f6482f = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f6478b);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(this.f6479c ? 1 : 0);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f6480d ? 1 : 0);
        Fa.d.n(parcel, 4, 4);
        parcel.writeInt(this.f6481e);
        Fa.d.n(parcel, 5, 4);
        parcel.writeInt(this.f6482f);
        Fa.d.p(parcel, iO);
    }
}
