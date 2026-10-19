package p106i5;

import Fa.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends V4.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36740d;

    public a(ArrayList arrayList, boolean z10, boolean z11) {
        this.f36738b = arrayList;
        this.f36739c = z10;
        this.f36740d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.m(parcel, 1, Collections.unmodifiableList(this.f36738b));
        d.n(parcel, 2, 4);
        parcel.writeInt(this.f36739c ? 1 : 0);
        d.n(parcel, 3, 4);
        parcel.writeInt(this.f36740d ? 1 : 0);
        d.p(parcel, iO);
    }
}
