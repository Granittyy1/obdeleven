package p166n5;

import Fa.d;
import S4.C0760b;
import U4.D;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0760b f44970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f44971d;

    public l(int i10, C0760b c0760b, D d10) {
        this.f44969b = i10;
        this.f44970c = c0760b;
        this.f44971d = d10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.n(parcel, 1, 4);
        parcel.writeInt(this.f44969b);
        d.j(parcel, 2, this.f44970c, i10);
        d.j(parcel, 3, this.f44971d, i10);
        d.p(parcel, iO);
    }
}
