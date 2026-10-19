package p131k5;

import Fa.d;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends a {
    public static final Parcelable.Creator<j3> CREATOR = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42258d;

    public j3(int i10, long j, String str) {
        this.f42256b = str;
        this.f42257c = j;
        this.f42258d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.k(parcel, 1, this.f42256b);
        d.n(parcel, 2, 8);
        parcel.writeLong(this.f42257c);
        d.n(parcel, 3, 4);
        parcel.writeInt(this.f42258d);
        d.p(parcel, iO);
    }
}
