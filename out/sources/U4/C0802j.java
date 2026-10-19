package U4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0802j extends V4.a {
    public static final Parcelable.Creator<C0802j> CREATOR = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6472i;
    public final int j;

    public C0802j(int i10, int i11, int i12, long j, long j10, String str, String str2, int i13, int i14) {
        this.f6465b = i10;
        this.f6466c = i11;
        this.f6467d = i12;
        this.f6468e = j;
        this.f6469f = j10;
        this.f6470g = str;
        this.f6471h = str2;
        this.f6472i = i13;
        this.j = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f6465b);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(this.f6466c);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f6467d);
        Fa.d.n(parcel, 4, 8);
        parcel.writeLong(this.f6468e);
        Fa.d.n(parcel, 5, 8);
        parcel.writeLong(this.f6469f);
        Fa.d.k(parcel, 6, this.f6470g);
        Fa.d.k(parcel, 7, this.f6471h);
        Fa.d.n(parcel, 8, 4);
        parcel.writeInt(this.f6472i);
        Fa.d.n(parcel, 9, 4);
        parcel.writeInt(this.j);
        Fa.d.p(parcel, iO);
    }
}
