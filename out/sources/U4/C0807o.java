package U4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: U4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0807o extends V4.a {
    public static final Parcelable.Creator<C0807o> CREATOR = new C0809q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6484c;

    public C0807o(int i10, List list) {
        this.f6483b = i10;
        this.f6484c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f6483b);
        Fa.d.m(parcel, 2, this.f6484c);
        Fa.d.p(parcel, iO);
    }
}
