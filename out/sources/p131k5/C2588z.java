package p131k5;

import Fa.d;
import U4.C0804l;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k5.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2588z extends a {
    public static final Parcelable.Creator<C2588z> CREATOR = new C2584y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2568u f42543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42545e;

    public C2588z(C2588z c2588z, long j) {
        C0804l.h(c2588z);
        this.f42542b = c2588z.f42542b;
        this.f42543c = c2588z.f42543c;
        this.f42544d = c2588z.f42544d;
        this.f42545e = j;
    }

    public final String toString() {
        return "origin=" + this.f42544d + ",name=" + this.f42542b + ",params=" + String.valueOf(this.f42543c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.k(parcel, 2, this.f42542b);
        d.j(parcel, 3, this.f42543c, i10);
        d.k(parcel, 4, this.f42544d);
        d.n(parcel, 5, 8);
        parcel.writeLong(this.f42545e);
        d.p(parcel, iO);
    }

    public C2588z(String str, C2568u c2568u, String str2, long j) {
        this.f42542b = str;
        this.f42543c = c2568u;
        this.f42544d = str2;
        this.f42545e = j;
    }
}
