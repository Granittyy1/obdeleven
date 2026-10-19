package p131k5;

import Fa.d;
import U4.C0804l;
import V4.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2496d extends a {
    public static final Parcelable.Creator<C2496d> CREATOR = new C2506f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v3 f42125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2588z f42129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f42130i;
    public C2588z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f42131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2588z f42132l;

    public C2496d(C2496d c2496d) {
        C0804l.h(c2496d);
        this.f42123b = c2496d.f42123b;
        this.f42124c = c2496d.f42124c;
        this.f42125d = c2496d.f42125d;
        this.f42126e = c2496d.f42126e;
        this.f42127f = c2496d.f42127f;
        this.f42128g = c2496d.f42128g;
        this.f42129h = c2496d.f42129h;
        this.f42130i = c2496d.f42130i;
        this.j = c2496d.j;
        this.f42131k = c2496d.f42131k;
        this.f42132l = c2496d.f42132l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = d.o(parcel, 20293);
        d.k(parcel, 2, this.f42123b);
        d.k(parcel, 3, this.f42124c);
        d.j(parcel, 4, this.f42125d, i10);
        long j = this.f42126e;
        d.n(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z10 = this.f42127f;
        d.n(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d.k(parcel, 7, this.f42128g);
        d.j(parcel, 8, this.f42129h, i10);
        long j10 = this.f42130i;
        d.n(parcel, 9, 8);
        parcel.writeLong(j10);
        d.j(parcel, 10, this.j, i10);
        d.n(parcel, 11, 8);
        parcel.writeLong(this.f42131k);
        d.j(parcel, 12, this.f42132l, i10);
        d.p(parcel, iO);
    }

    public C2496d(String str, String str2, v3 v3Var, long j, boolean z10, String str3, C2588z c2588z, long j10, C2588z c2588z2, long j11, C2588z c2588z3) {
        this.f42123b = str;
        this.f42124c = str2;
        this.f42125d = v3Var;
        this.f42126e = j;
        this.f42127f = z10;
        this.f42128g = str3;
        this.f42129h = c2588z;
        this.f42130i = j10;
        this.j = c2588z2;
        this.f42131k = j11;
        this.f42132l = c2588z3;
    }
}
