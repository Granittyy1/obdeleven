package com.google.android.gms.measurement.internal;

import U4.C0804l;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import p131k5.AbstractC2589z0;
import p131k5.C2523i1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC2589z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<String> f26554i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f26559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26560p;

    @Override // p131k5.AbstractC2589z0
    public final boolean v() {
        return true;
    }

    public final String w() {
        t();
        C0804l.h(this.f26548c);
        return this.f26548c;
    }

    public final String y() {
        p();
        t();
        C0804l.h(this.f26556l);
        return this.f26556l;
    }

    public final void z() {
        String str;
        p();
        if (n().A().i(zziq.zza.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            o().E0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            d().f41718m.c("Analytics Storage consent is not granted");
            str = null;
        }
        d().f41718m.c("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f26558n = str;
        ((C2523i1) this.f3968a).f42224n.getClass();
        this.f26559o = System.currentTimeMillis();
    }
}
