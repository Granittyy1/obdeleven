package S4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends V4.a {
    public static final Parcelable.Creator<B> CREATOR = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5509h;

    public B(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f5503b = str;
        this.f5504c = z10;
        this.f5505d = z11;
        this.f5506e = (Context) p018b5.b.b0(p018b5.a.AbstractBinderC0208a.g(iBinder));
        this.f5507f = z12;
        this.f5508g = z13;
        this.f5509h = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.k(parcel, 1, this.f5503b);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(this.f5504c ? 1 : 0);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f5505d ? 1 : 0);
        Fa.d.i(parcel, 4, new p018b5.b(this.f5506e));
        Fa.d.n(parcel, 5, 4);
        parcel.writeInt(this.f5507f ? 1 : 0);
        Fa.d.n(parcel, 6, 4);
        parcel.writeInt(this.f5508g ? 1 : 0);
        Fa.d.n(parcel, 8, 4);
        parcel.writeInt(this.f5509h ? 1 : 0);
        Fa.d.p(parcel, iO);
    }
}
