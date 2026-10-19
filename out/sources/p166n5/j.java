package p166n5;

import Fa.d;
import U4.B;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f44968c;

    public j(int i10, B b10) {
        this.f44967b = i10;
        this.f44968c = b10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.n(parcel, 1, 4);
        parcel.writeInt(this.f44967b);
        d.j(parcel, 2, this.f44968c, i10);
        d.p(parcel, iO);
    }
}
