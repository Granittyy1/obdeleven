package p131k5;

import Fa.d;
import V4.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k5.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2525j extends a {
    public static final Parcelable.Creator<C2525j> CREATOR = new C2521i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f42242b;

    public C2525j(Bundle bundle) {
        this.f42242b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.h(parcel, 1, this.f42242b);
        d.p(parcel, iO);
    }
}
