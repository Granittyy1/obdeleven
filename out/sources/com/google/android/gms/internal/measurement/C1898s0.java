package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1898s0 extends V4.a {
    public static final Parcelable.Creator<C1898s0> CREATOR = new C1891r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f25840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f25841i;

    public C1898s0(long j, long j10, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f25834b = j;
        this.f25835c = j10;
        this.f25836d = z10;
        this.f25837e = str;
        this.f25838f = str2;
        this.f25839g = str3;
        this.f25840h = bundle;
        this.f25841i = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 8);
        parcel.writeLong(this.f25834b);
        Fa.d.n(parcel, 2, 8);
        parcel.writeLong(this.f25835c);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f25836d ? 1 : 0);
        Fa.d.k(parcel, 4, this.f25837e);
        Fa.d.k(parcel, 5, this.f25838f);
        Fa.d.k(parcel, 6, this.f25839g);
        Fa.d.h(parcel, 7, this.f25840h);
        Fa.d.k(parcel, 8, this.f25841i);
        Fa.d.p(parcel, iO);
    }
}
