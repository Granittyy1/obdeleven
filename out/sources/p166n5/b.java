package p166n5;

import Fa.d;
import V4.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a implements g {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f44964d;

    public b() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.g
    public final Status d() {
        return this.f44963c == 0 ? Status.f25304f : Status.f25307i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.n(parcel, 1, 4);
        parcel.writeInt(this.f44962b);
        d.n(parcel, 2, 4);
        parcel.writeInt(this.f44963c);
        d.j(parcel, 3, this.f44964d, i10);
        d.p(parcel, iO);
    }

    public b(int i10, int i11, Intent intent) {
        this.f44962b = i10;
        this.f44963c = i11;
        this.f44964d = intent;
    }
}
