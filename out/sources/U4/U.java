package U4;

import S4.C0762d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class U extends V4.a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f6373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0762d[] f6374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0796d f6376e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.h(parcel, 1, this.f6373b);
        Fa.d.l(parcel, 2, this.f6374c, i10);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f6375d);
        Fa.d.j(parcel, 4, this.f6376e, i10);
        Fa.d.p(parcel, iO);
    }
}
