package p106i5;

import Fa.d;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36748g;

    public c(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f36743b = z10;
        this.f36744c = z11;
        this.f36745d = z12;
        this.f36746e = z13;
        this.f36747f = z14;
        this.f36748g = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.n(parcel, 1, 4);
        parcel.writeInt(this.f36743b ? 1 : 0);
        d.n(parcel, 2, 4);
        parcel.writeInt(this.f36744c ? 1 : 0);
        d.n(parcel, 3, 4);
        parcel.writeInt(this.f36745d ? 1 : 0);
        d.n(parcel, 4, 4);
        parcel.writeInt(this.f36746e ? 1 : 0);
        d.n(parcel, 5, 4);
        parcel.writeInt(this.f36747f ? 1 : 0);
        d.n(parcel, 6, 4);
        parcel.writeInt(this.f36748g ? 1 : 0);
        d.p(parcel, iO);
    }
}
