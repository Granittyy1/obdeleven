package p106i5;

import Fa.d;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a implements g {
    public static final Parcelable.Creator<b> CREATOR = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f36741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f36742c;

    public b(Status status, c cVar) {
        this.f36741b = status;
        this.f36742c = cVar;
    }

    @Override // com.google.android.gms.common.api.g
    public final Status d() {
        return this.f36741b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.j(parcel, 1, this.f36741b, i10);
        d.j(parcel, 2, this.f36742c, i10);
        d.p(parcel, iO);
    }
}
