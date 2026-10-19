package S4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends V4.a {
    public static final Parcelable.Creator<D> CREATOR = new E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5514f;

    public D(boolean z10, String str, int i10, int i11, long j) {
        this.f5510b = z10;
        this.f5511c = str;
        this.f5512d = kotlinx.coroutines.C.x(i10) - 1;
        this.f5513e = o.s(i11) - 1;
        this.f5514f = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f5510b ? 1 : 0);
        Fa.d.k(parcel, 2, this.f5511c);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f5512d);
        Fa.d.n(parcel, 4, 4);
        parcel.writeInt(this.f5513e);
        Fa.d.n(parcel, 5, 8);
        parcel.writeLong(this.f5514f);
        Fa.d.p(parcel, iO);
    }
}
