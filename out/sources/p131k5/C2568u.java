package p131k5;

import Fa.d;
import V4.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: renamed from: k5.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2568u extends a implements Iterable<String> {
    public static final Parcelable.Creator<C2568u> CREATOR = new C2576w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f42473b;

    public C2568u(Bundle bundle) {
        this.f42473b = bundle;
    }

    public final Double e() {
        return Double.valueOf(this.f42473b.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C2580x(this);
    }

    public final Bundle k() {
        return new Bundle(this.f42473b);
    }

    public final String toString() {
        return this.f42473b.toString();
    }

    public final String v() {
        return this.f42473b.getString("currency");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.h(parcel, 2, k());
        d.p(parcel, iO);
    }
}
