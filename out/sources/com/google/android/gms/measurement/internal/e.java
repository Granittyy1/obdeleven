package com.google.android.gms.measurement.internal;

import U4.C0804l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.internal.measurement.C1812f4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.N4;
import com.google.android.gms.internal.measurement.P4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p131k5.AbstractC2589z0;
import p131k5.B;
import p131k5.B0;
import p131k5.C2493c1;
import p131k5.C2500d3;
import p131k5.C2501e;
import p131k5.C2507f0;
import p131k5.C2523i1;
import p131k5.C2536l2;
import p131k5.C2557r0;
import p131k5.C2559r2;
import p131k5.C2567t2;
import p131k5.C2568u;
import p131k5.C2573v0;
import p131k5.C2577w0;
import p131k5.C2587y2;
import p131k5.C2588z;
import p131k5.D0;
import p131k5.D2;
import p131k5.D3;
import p131k5.F1;
import p131k5.G2;
import p131k5.H1;
import p131k5.I2;
import p131k5.J1;
import p131k5.K1;
import p131k5.K2;
import p131k5.L0;
import p131k5.L1;
import p131k5.M1;
import p131k5.N;
import p131k5.O1;
import p131k5.P;
import p131k5.P1;
import p131k5.Q;
import p131k5.Q1;
import p131k5.RunnableC2494c2;
import p131k5.RunnableC2524i2;
import p131k5.RunnableC2528j2;
import p131k5.RunnableC2563s2;
import p131k5.RunnableC2578w1;
import p131k5.T0;
import p131k5.T1;
import p131k5.V1;
import p131k5.W1;
import p131k5.X1;
import p131k5.Y2;
import p131k5.Z1;
import p131k5.j3;
import p131k5.o3;
import p131k5.v3;
import p131k5.z3;
import p293xa.r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends AbstractC2589z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2536l2 f26571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F1 f26572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f26573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<String> f26575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f26576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26577i;
    public PriorityQueue<j3> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zziq f26578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f26579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D3 f26581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Z1 f26583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O1 f26584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W1 f26585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final P3.b f26586s;

    public e(C2523i1 c2523i1) {
        super(c2523i1);
        this.f26573e = new CopyOnWriteArraySet();
        this.f26576h = new Object();
        this.f26577i = false;
        this.f26582o = true;
        this.f26586s = new P3.b(4, this);
        this.f26575g = new AtomicReference<>();
        this.f26578k = zziq.f26646c;
        this.f26580m = -1L;
        this.f26579l = new AtomicLong(0L);
        this.f26581n = new D3(c2523i1);
    }

    public static void G(e eVar, zziq zziqVar, long j, boolean z10, boolean z11) {
        eVar.p();
        eVar.t();
        zziq zziqVarA = eVar.n().A();
        long j10 = eVar.f26580m;
        int i10 = zziqVar.f26648b;
        if (j <= j10 && zziq.h(zziqVarA.f26648b, i10)) {
            eVar.d().f41717l.b(zziqVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        L0 l0N = eVar.n();
        l0N.p();
        if (!l0N.t(i10)) {
            B0 b0D = eVar.d();
            b0D.f41717l.b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = l0N.y().edit();
        editorEdit.putString("consent_settings", zziqVar.o());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        eVar.f26580m = j;
        C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
        c2523i1.r().B(z10);
        if (z11) {
            c2523i1.r().y(new AtomicReference<>());
        }
    }

    public static void H(e eVar, zziq zziqVar, zziq zziqVar2) {
        zziq.zza zzaVar = zziq.zza.ANALYTICS_STORAGE;
        zziq.zza zzaVar2 = zziq.zza.AD_STORAGE;
        zziq.zza[] zzaVarArr = {zzaVar, zzaVar2};
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zziq.zza zzaVar3 = zzaVarArr[i10];
            if (!zziqVar2.i(zzaVar3) && zziqVar.i(zzaVar3)) {
                z10 = true;
                break;
            }
        }
        boolean zK = zziqVar.k(zziqVar2, zzaVar, zzaVar2);
        if (z10 || zK) {
            ((C2523i1) eVar.f3968a).o().z();
        }
    }

    public final void A(Bundle bundle, int i10, long j) {
        String string;
        Boolean bool;
        t();
        zziq zziqVar = zziq.f26646c;
        zziq.zza[] zzaVarArr = zzir.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                string = null;
                break;
            }
            zziq.zza zzaVar = zzaVarArr[i11];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else {
                    bool = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool == null) {
                    break;
                }
            }
            i11++;
        }
        if (string != null) {
            d().f41716k.b(string, "Ignoring invalid consent setting");
            d().f41716k.c("Valid consent values are 'granted', 'denied'");
        }
        zziq zziqVarD = zziq.d(i10, bundle);
        C1930w4.a();
        if (!((C2523i1) this.f3968a).f42218g.B(null, B.f41628L0)) {
            F(zziqVarD, j, false);
            return;
        }
        if (zziqVarD.q()) {
            F(zziqVarD, j, false);
        }
        b bVarA = b.a(i10, bundle);
        Iterator<zzip> it = bVarA.f26547e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzip.f26641b) {
                D(bVarA, false);
                break;
            }
        }
        Boolean boolC = b.c(bundle);
        if (boolC != null) {
            M(i10 == -30 ? "tcf" : "app", "allow_personalized_ads", boolC.toString(), false);
        }
    }

    public final void B(Bundle bundle, long j) {
        C0804l.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            d().f41715i.c("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        N.b(bundle2, "app_id", String.class, null);
        N.b(bundle2, "origin", String.class, null);
        N.b(bundle2, "name", String.class, null);
        N.b(bundle2, "value", Object.class, null);
        N.b(bundle2, "trigger_event_name", String.class, null);
        N.b(bundle2, "trigger_timeout", Long.class, 0L);
        N.b(bundle2, "timed_out_event_name", String.class, null);
        N.b(bundle2, "timed_out_event_params", Bundle.class, null);
        N.b(bundle2, "triggered_event_name", String.class, null);
        N.b(bundle2, "triggered_event_params", Bundle.class, null);
        N.b(bundle2, "time_to_live", Long.class, 0L);
        N.b(bundle2, "expired_event_name", String.class, null);
        N.b(bundle2, "expired_event_params", Bundle.class, null);
        C0804l.e(bundle2.getString("name"));
        C0804l.e(bundle2.getString("origin"));
        C0804l.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int iI0 = o().i0(string);
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (iI0 != 0) {
            B0 b0D = d();
            b0D.f41712f.b(c2523i1.f42223m.g(string), "Invalid conditional user property name");
            return;
        }
        if (o().t(obj, string) != 0) {
            B0 b0D2 = d();
            b0D2.f41712f.a(c2523i1.f42223m.g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objO0 = o().o0(obj, string);
        if (objO0 == null) {
            B0 b0D3 = d();
            b0D3.f41712f.a(c2523i1.f42223m.g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        N.c(bundle2, objO0);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            B0 b0D4 = d();
            b0D4.f41712f.a(c2523i1.f42223m.g(string), Long.valueOf(j10), "Invalid conditional user property timeout");
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 <= 15552000000L && j11 >= 1) {
            i().z(new RunnableC2578w1(this, bundle2, 1));
            return;
        }
        B0 b0D5 = d();
        b0D5.f41712f.a(c2523i1.f42223m.g(string), Long.valueOf(j11), "Invalid conditional user property time to live");
    }

    public final void C(Bundle bundle, String str, String str2) {
        ((C2523i1) this.f3968a).f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0804l.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        i().z(new RunnableC2494c2(this, 0, bundle2));
    }

    public final void D(b bVar, boolean z10) {
        T0 t8 = new T0(this, 1, bVar);
        if (!z10) {
            i().z(t8);
        } else {
            p();
            t8.run();
        }
    }

    public final void E(zziq zziqVar) {
        p();
        boolean z10 = (zziqVar.i(zziq.zza.ANALYTICS_STORAGE) && zziqVar.i(zziq.zza.AD_STORAGE)) || ((C2523i1) this.f3968a).r().F();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        C2493c1 c2493c1 = c2523i1.j;
        C2523i1.g(c2493c1);
        c2493c1.p();
        if (z10 != c2523i1.f42207D) {
            C2523i1 c2523i2 = (C2523i1) this.f3968a;
            C2493c1 c2493c2 = c2523i2.j;
            C2523i1.g(c2493c2);
            c2493c2.p();
            c2523i2.f42207D = z10;
            L0 l0N = n();
            l0N.p();
            Boolean boolValueOf = l0N.y().contains("measurement_enabled_from_api") ? Boolean.valueOf(l0N.y().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                I(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void F(zziq zziqVar, long j, boolean z10) {
        zziq zziqVar2;
        boolean z11;
        boolean zK;
        boolean z12;
        zziq zziqVarJ = zziqVar;
        t();
        int i10 = zziqVarJ.f26648b;
        C1812f4.a();
        if (((C2523i1) this.f3968a).f42218g.B(null, B.f41654Y0)) {
            if (i10 != -10) {
                zzip zzipVar = zziqVarJ.f26647a.get(zziq.zza.AD_STORAGE);
                if (zzipVar == null) {
                    zzipVar = zzip.f26641b;
                }
                zzip zzipVar2 = zzip.f26641b;
                if (zzipVar == zzipVar2) {
                    zzip zzipVar3 = zziqVarJ.f26647a.get(zziq.zza.ANALYTICS_STORAGE);
                    if (zzipVar3 == null) {
                        zzipVar3 = zzipVar2;
                    }
                    if (zzipVar3 == zzipVar2) {
                        d().f41716k.c("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i10 != -10 && zziqVar.l() == null && zziqVar.m() == null) {
            d().f41716k.c("Discarding empty consent settings");
            return;
        }
        synchronized (this.f26576h) {
            try {
                zziqVar2 = this.f26578k;
                z11 = false;
                if (zziq.h(i10, zziqVar2.f26648b)) {
                    zK = zziqVar.k(this.f26578k, (zziq.zza[]) zziqVarJ.f26647a.keySet().toArray(new zziq.zza[0]));
                    zziq.zza zzaVar = zziq.zza.ANALYTICS_STORAGE;
                    if (zziqVar.i(zzaVar) && !this.f26578k.i(zzaVar)) {
                        z11 = true;
                    }
                    zziqVarJ = zziqVar.j(this.f26578k);
                    this.f26578k = zziqVarJ;
                    z12 = z11;
                    z11 = true;
                } else {
                    zK = false;
                    z12 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            d().f41717l.b(zziqVarJ, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f26579l.getAndIncrement();
        if (zK) {
            J(null);
            RunnableC2528j2 runnableC2528j2 = new RunnableC2528j2(this, zziqVarJ, j, andIncrement, z12, zziqVar2);
            if (!z10) {
                i().A(runnableC2528j2);
                return;
            } else {
                p();
                runnableC2528j2.run();
                return;
            }
        }
        RunnableC2524i2 runnableC2524i2 = new RunnableC2524i2(this, zziqVarJ, andIncrement, z12, zziqVar2);
        if (z10) {
            p();
            runnableC2524i2.run();
        } else if (i10 == 30 || i10 == -10) {
            i().A(runnableC2524i2);
        } else {
            i().z(runnableC2524i2);
        }
    }

    public final void I(Boolean bool, boolean z10) {
        p();
        t();
        d().f41718m.b(bool, "Setting app measurement enabled (FE)");
        L0 l0N = n();
        l0N.p();
        SharedPreferences.Editor editorEdit = l0N.y().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z10) {
            L0 l0N2 = n();
            l0N2.p();
            SharedPreferences.Editor editorEdit2 = l0N2.y().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        C2493c1 c2493c1 = c2523i1.j;
        C2523i1.g(c2493c1);
        c2493c1.p();
        if (c2523i1.f42207D || !(bool == null || bool.booleanValue())) {
            U();
        }
    }

    public final void J(String str) {
        this.f26575g.set(str);
    }

    public final void K(String str, String str2, long j, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean zB;
        long j10;
        C2523i1 c2523i1;
        int i10;
        boolean zY;
        Bundle[] bundleArr;
        e eVar = this;
        String str3 = str;
        C0804l.e(str);
        C0804l.h(bundle);
        p();
        t();
        C2523i1 c2523i2 = (C2523i1) eVar.f3968a;
        if (!c2523i2.h()) {
            d().f41718m.c("Event not sent since app measurement is disabled");
            return;
        }
        List<String> list = c2523i2.o().f26554i;
        if (list != null && !list.contains(str2)) {
            d().f41718m.a(str2, str3, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!eVar.f26574f) {
            eVar.f26574f = true;
            try {
                boolean z14 = c2523i2.f42216e;
                Context context = c2523i2.f42212a;
                try {
                    (!z14 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e10) {
                    d().f41715i.b(e10, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                d().f41717l.c("Tag Manager is not found and thus will not be used");
            }
        }
        boolean zEquals = "_cmp".equals(str2);
        C2501e c2501e = c2523i2.f42218g;
        Y4.c cVar = c2523i2.f42224n;
        if (zEquals) {
            if (bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                cVar.getClass();
                y(System.currentTimeMillis(), string, "auto", "_lgclid");
            }
            P4.a();
            if (c2501e.B(0, B.f41642S0) && bundle.containsKey("gbraid")) {
                String string2 = bundle.getString("gbraid");
                cVar.getClass();
                y(System.currentTimeMillis(), string2, "auto", "_gbraid");
            }
        } else {
            cVar = cVar;
            c2501e = c2501e;
        }
        if (z10 && !z3.j[0].equals(str2)) {
            o().I(bundle, n().f41883z.a());
        }
        C2577w0 c2577w0 = c2523i2.f42223m;
        P3.b bVar = eVar.f26586s;
        if (!z12 && !"_iap".equals(str2)) {
            z3 z3Var = c2523i2.f42222l;
            C2523i1.e(z3Var);
            int i11 = 2;
            if (z3Var.q0("event", str2)) {
                if (!z3Var.f0("event", P.f41945e, str2, P.f41946f)) {
                    i11 = 13;
                } else if (z3Var.W(40, "event", str2)) {
                    i11 = 0;
                }
            }
            if (i11 != 0) {
                d().f41714h.b(c2577w0.b(str2), "Invalid public event name. Event will not be logged (FE)");
                c2523i2.s();
                String strE = z3.E(40, str2, true);
                int length = str2 != null ? str2.length() : 0;
                c2523i2.s();
                z3.U(bVar, null, i11, "_ev", strE, length);
                return;
            }
        }
        C2559r2 c2559r2Y = r().y(false);
        if (c2559r2Y != null && !bundle.containsKey("_sc")) {
            c2559r2Y.f42438d = true;
        }
        z3.T(c2559r2Y, bundle, z10 && !z12);
        boolean zEquals2 = "am".equals(str3);
        boolean zV0 = z3.v0(str2);
        if (z10 && eVar.f26572d != null && !zV0 && !zEquals2) {
            d().f41718m.a(c2577w0.b(str2), c2577w0.a(bundle), "Passing event to registered event handler (FE)");
            C0804l.h(eVar.f26572d);
            AppMeasurementDynamiteService.a aVar = (AppMeasurementDynamiteService.a) eVar.f26572d;
            aVar.getClass();
            try {
                aVar.f26537a.M(j, bundle, str, str2);
                return;
            } catch (RemoteException e11) {
                C2523i1 c2523i3 = AppMeasurementDynamiteService.this.f26535c;
                if (c2523i3 != null) {
                    B0 b10 = c2523i3.f42220i;
                    C2523i1.g(b10);
                    b10.f41715i.b(e11, "Event interceptor threw exception");
                    return;
                }
                return;
            }
        }
        if (c2523i2.j()) {
            int iU = o().u(str2);
            if (iU != 0) {
                d().f41714h.b(c2577w0.b(str2), "Invalid event name. Event will not be logged (FE)");
                o();
                String strE2 = z3.E(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                c2523i2.s();
                z3.U(bVar, null, iU, "_ev", strE2, length2);
                return;
            }
            String str4 = "_o";
            Bundle bundleB = o().B(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
            C0804l.h(bundleB);
            if (r().y(false) == null || !"_ae".equals(str2)) {
                z13 = zEquals2;
            } else {
                C2500d3 c2500d3 = s().f42063f;
                ((C2523i1) c2500d3.f42144d.f3968a).f42224n.getClass();
                z13 = zEquals2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = jElapsedRealtime - c2500d3.f42142b;
                c2500d3.f42142b = jElapsedRealtime;
                if (j11 > 0) {
                    o().H(bundleB, j11);
                }
            }
            if (!"auto".equals(str3) && "_ssr".equals(str2)) {
                z3 z3VarO = o();
                String string3 = bundleB.getString("_ffr");
                int i12 = Y4.g.f7609a;
                if (string3 == null || string3.trim().isEmpty()) {
                    string3 = null;
                } else if (string3 != null) {
                    string3 = string3.trim();
                }
                if (Objects.equals(string3, z3VarO.n().f41880w.a())) {
                    z3VarO.d().f41718m.c("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                z3VarO.n().f41880w.b(string3);
            } else if ("_ae".equals(str2)) {
                String strA = o().n().f41880w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleB.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleB);
            if (c2501e.B(null, B.f41626K0)) {
                Y2 y2S = s();
                y2S.p();
                zB = y2S.f42061d;
            } else {
                zB = n().f41877t.b();
            }
            if (n().f41874q.a() > 0 && n().u(j) && zB) {
                d().f41719n.c("Current session is expired, remove the session number, ID, and engagement time");
                cVar.getClass();
                j10 = 0;
                y(System.currentTimeMillis(), null, "auto", "_sid");
                cVar.getClass();
                y(System.currentTimeMillis(), null, "auto", "_sno");
                cVar.getClass();
                y(System.currentTimeMillis(), null, "auto", "_se");
                n().f41875r.b(0L);
            } else {
                j10 = 0;
            }
            if (bundleB.getLong("extend_session", j10) == 1) {
                d().f41719n.c("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c2523i1 = c2523i2;
                Y2 y10 = c2523i1.f42221k;
                C2523i1.f(y10);
                i10 = 1;
                y10.f42062e.b(j, true);
            } else {
                c2523i1 = c2523i2;
                i10 = 1;
            }
            ArrayList arrayList2 = new ArrayList(bundleB.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13 += i10;
                String str5 = (String) obj;
                if (str5 != null) {
                    o();
                    Object obj2 = bundleB.get(str5);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj2;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleB.putParcelableArray(str5, bundleArr);
                    }
                }
                i10 = 1;
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                Bundle bundleA = (Bundle) arrayList.get(i14);
                String str6 = i14 != 0 ? "_ep" : str2;
                String str7 = str4;
                bundleA.putString(str7, str3);
                if (z11) {
                    bundleA = o().A(bundleA);
                }
                Bundle bundle2 = bundleA;
                C2588z c2588z = new C2588z(str6, new C2568u(bundle2), str, j);
                C2587y2 c2587y2R = c2523i1.r();
                c2587y2R.getClass();
                c2587y2R.p();
                c2587y2R.t();
                C2573v0 c2573v0P = ((C2523i1) c2587y2R.f3968a).p();
                c2573v0P.getClass();
                Parcel parcelObtain = Parcel.obtain();
                boolean z15 = false;
                c2588z.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    c2573v0P.d().f41713g.c("Event is too long for local database. Sending event directly to service");
                    zY = false;
                } else {
                    zY = c2573v0P.y(0, bArrMarshall);
                }
                c2587y2R.w(new K2(c2587y2R, c2587y2R.J(true), zY, c2588z));
                if (!z13) {
                    Iterator it = eVar.f26573e.iterator();
                    while (it.hasNext()) {
                        ((H1) it.next()).a(j, new Bundle(bundle2), str, str2);
                        z15 = z15;
                    }
                }
                i14++;
                eVar = this;
                str3 = str;
                str4 = str7;
            }
            if (r().y(false) == null || !"_ae".equals(str2)) {
                return;
            }
            Y2 y2S2 = s();
            cVar.getClass();
            y2S2.f42063f.a(true, true, SystemClock.elapsedRealtime());
        }
    }

    public final void L(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        String strW;
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z12 = !z11 || this.f26572d == null || z3.v0(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            i().z(new V1(this, str3, str2, j, bundle3, z11, z12, z10));
            return;
        }
        C2567t2 c2567t2R = r();
        synchronized (c2567t2R.f42471l) {
            try {
                if (!c2567t2R.f42470k) {
                    c2567t2R.d().f41716k.c("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > ((C2523i1) c2567t2R.f3968a).f42218g.r(null, false))) {
                    c2567t2R.d().f41716k.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > ((C2523i1) c2567t2R.f3968a).f42218g.r(null, false))) {
                    c2567t2R.d().f41716k.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = c2567t2R.f42467g;
                    strW = activity != null ? c2567t2R.w(activity.getClass()) : "Activity";
                } else {
                    strW = string2;
                }
                C2559r2 c2559r2 = c2567t2R.f42463c;
                if (c2567t2R.f42468h && c2559r2 != null) {
                    c2567t2R.f42468h = false;
                    boolean zEquals = Objects.equals(c2559r2.f42436b, strW);
                    boolean zEquals2 = Objects.equals(c2559r2.f42435a, string);
                    if (zEquals && zEquals2) {
                        c2567t2R.d().f41716k.c("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                c2567t2R.d().f41719n.a(string == null ? "null" : string, strW == null ? "null" : strW, "Logging screen view with name, class");
                C2559r2 c2559r3 = c2567t2R.f42463c == null ? c2567t2R.f42464d : c2567t2R.f42463c;
                C2559r2 c2559r4 = new C2559r2(string, strW, c2567t2R.o().A0(), true, j);
                c2567t2R.f42463c = c2559r4;
                c2567t2R.f42464d = c2559r3;
                c2567t2R.f42469i = c2559r4;
                ((C2523i1) c2567t2R.f3968a).f42224n.getClass();
                c2567t2R.i().z(new RunnableC2563s2(c2567t2R, bundle2, c2559r4, c2559r3, SystemClock.elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void M(String str, String str2, Object obj, boolean z10) {
        ((C2523i1) this.f3968a).f42224n.getClass();
        N(str, str2, obj, z10, System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public final void N(String str, String str2, Object obj, boolean z10, long j) {
        int i10;
        int iI0;
        P3.b bVar;
        C2523i1 c2523i1;
        int iT;
        Object objO0;
        int length;
        String str3 = str == null ? "app" : str;
        if (!z10) {
            z3 z3VarO = o();
            i10 = 6;
            if (z3VarO.q0("user property", str2)) {
                if (!z3VarO.f0("user property", Q.f41962e, str2, null)) {
                    iI0 = 15;
                } else if (z3VarO.W(24, "user property", str2)) {
                    i10 = 0;
                }
            }
            bVar = this.f26586s;
            c2523i1 = (C2523i1) this.f3968a;
            if (i10 != 0) {
                o();
                String strE = z3.E(24, str2, true);
                length = str2 != null ? str2.length() : 0;
                c2523i1.s();
                z3.U(bVar, null, i10, "_ev", strE, length);
                return;
            }
            if (obj != null) {
                i().z(new X1(this, str3, str2, null, j));
                return;
            }
            iT = o().t(obj, str2);
            if (iT != 0) {
                objO0 = o().o0(obj, str2);
                if (objO0 != null) {
                    i().z(new X1(this, str3, str2, objO0, j));
                    return;
                }
                return;
            }
            o();
            String strE2 = z3.E(24, str2, true);
            length = (!(obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
            c2523i1.s();
            z3.U(bVar, null, iT, "_ev", strE2, length);
        }
        iI0 = o().i0(str2);
        i10 = iI0;
        bVar = this.f26586s;
        c2523i1 = (C2523i1) this.f3968a;
        if (i10 != 0) {
            o();
            String strE3 = z3.E(24, str2, true);
            if (str2 != null) {
            }
            c2523i1.s();
            z3.U(bVar, null, i10, "_ev", strE3, length);
            return;
        }
        if (obj != null) {
            i().z(new X1(this, str3, str2, null, j));
            return;
        }
        iT = o().t(obj, str2);
        if (iT != 0) {
            objO0 = o().o0(obj, str2);
            if (objO0 != null) {
                i().z(new X1(this, str3, str2, objO0, j));
                return;
            }
            return;
        }
        o();
        String strE4 = z3.E(24, str2, true);
        if (obj instanceof String) {
        }
        c2523i1.s();
        z3.U(bVar, null, iT, "_ev", strE4, length);
    }

    public final void O() {
        p();
        t();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (c2523i1.j()) {
            Boolean boolA = c2523i1.f42218g.A("google_analytics_deferred_deep_link_enabled");
            if (boolA != null && boolA.booleanValue()) {
                d().f41718m.c("Deferred Deep Link feature enabled.");
                C2493c1 c2493c1I = i();
                P1 p10 = new P1();
                p10.f41955b = this;
                c2493c1I.z(p10);
            }
            C2587y2 c2587y2R = c2523i1.r();
            c2587y2R.p();
            c2587y2R.t();
            o3 o3VarJ = c2587y2R.J(true);
            ((C2523i1) c2587y2R.f3968a).p().y(3, new byte[0]);
            c2587y2R.w(new G2(c2587y2R, o3VarJ));
            this.f26582o = false;
            L0 l0N = n();
            l0N.p();
            String string = l0N.y().getString("previous_os_version", null);
            ((C2523i1) l0N.f3968a).n().q();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = l0N.y().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c2523i1.n().q();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            V(bundle, "auto", "_ou");
        }
    }

    public final void P() {
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (!(c2523i1.f42212a.getApplicationContext() instanceof Application) || this.f26571c == null) {
            return;
        }
        ((Application) c2523i1.f42212a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f26571c);
    }

    public final void Q() {
        C1834i5.a();
        if (((C2523i1) this.f3968a).f42218g.B(null, B.f41616F0)) {
            if (i().B()) {
                d().f41712f.c("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C2507f0.b()) {
                d().f41712f.c("Cannot get trigger URIs from main thread");
                return;
            }
            t();
            d().f41719n.c("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C2493c1 c2493c1I = i();
            M1 m7 = new M1();
            m7.f41899b = this;
            m7.f41900c = atomicReference;
            c2493c1I.t(atomicReference, 5000L, "get trigger URIs", m7);
            List list = (List) atomicReference.get();
            if (list == null) {
                d().f41712f.c("Timed out waiting for get trigger URIs");
                return;
            }
            C2493c1 c2493c1I2 = i();
            L1 l10 = new L1();
            l10.f41884b = this;
            l10.f41885c = list;
            c2493c1I2.z(l10);
        }
    }

    public final void R() {
        String string;
        int i10;
        int i11;
        int i12;
        String string2;
        int i13;
        int i14;
        int i15;
        Bundle bundle;
        int i16;
        String str;
        p();
        d().f41718m.c("Handle tcf update.");
        SharedPreferences sharedPreferencesW = n().w();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesW.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i10 = sharedPreferencesW.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i10 = -1;
        }
        if (i10 != -1) {
            map.put("gdprApplies", String.valueOf(i10));
        }
        try {
            i11 = sharedPreferencesW.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i11 = -1;
        }
        if (i11 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i11));
        }
        try {
            i12 = sharedPreferencesW.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i12 = -1;
        }
        if (i12 != -1) {
            map.put("PolicyVersion", String.valueOf(i12));
        }
        try {
            string2 = sharedPreferencesW.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i13 = sharedPreferencesW.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i13 = -1;
        }
        if (i13 != -1) {
            map.put("CmpSdkID", String.valueOf(i13));
        }
        g gVar = new g(map);
        d().f41719n.b(gVar, "Tcf preferences read");
        L0 l0N = n();
        l0N.p();
        String string3 = l0N.y().getString("stored_tcf_param", "");
        String strA = gVar.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = l0N.y().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = gVar.f26590a;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = gVar.b();
            if (iB < 0) {
                bundle = Bundle.EMPTY;
            } else {
                String str2 = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    bundle = Bundle.EMPTY;
                } else {
                    Bundle bundle2 = new Bundle();
                    if (str2.length() > 0) {
                        bundle2.putString(zziq.zza.AD_STORAGE.zze, str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str2.length() > 3) {
                        str = "denied";
                        i15 = 2;
                        bundle2.putString(zziq.zza.AD_PERSONALIZATION.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : str);
                    } else {
                        str = "denied";
                        i15 = 2;
                    }
                    if (str2.length() <= 6 || iB < 4) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        bundle2.putString(zziq.zza.AD_USER_DATA.zze, (str2.charAt(0) == '1' && str2.charAt(6) == '1') ? "granted" : str);
                    }
                    bundle = bundle2;
                }
            }
            i14 = 0;
            i15 = 2;
        } else {
            i14 = 0;
            i15 = 2;
            bundle = Bundle.EMPTY;
        }
        d().f41719n.b(bundle, "Consent generated from Tcf");
        if (bundle != Bundle.EMPTY) {
            ((C2523i1) this.f3968a).f42224n.getClass();
            A(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle3 = new Bundle();
        StringBuilder sb2 = new StringBuilder("1");
        try {
            String str3 = (String) map2.get("CmpSdkID");
            i16 = !TextUtils.isEmpty(str3) ? Integer.parseInt(str3) : -1;
        } catch (NumberFormatException unused7) {
            i16 = -1;
        }
        if (i16 < 0 || i16 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i16 >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16 & 63));
        }
        int iB2 = gVar.b();
        if (iB2 < 0 || iB2 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        if ("1".equals(map2.get("gdprApplies"))) {
            i14 = i15;
        }
        int i17 = i14 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i17 = i14 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17));
        bundle3.putString("_tcfd", sb2.toString());
        V(bundle3, "auto", "_tcf");
    }

    public final void S() {
        j3 j3VarPoll;
        MeasurementManagerFutures measurementManagerFuturesB0;
        p();
        if (T().isEmpty() || this.f26577i || (j3VarPoll = T().poll()) == null || (measurementManagerFuturesB0 = o().B0()) == null) {
            return;
        }
        this.f26577i = true;
        D0 d10 = d().f41719n;
        String str = j3VarPoll.f42256b;
        d10.b(str, "Registering trigger URI");
        p107i6.f<r> fVarB = measurementManagerFuturesB0.b(Uri.parse(str));
        if (fVarB == null) {
            this.f26577i = false;
            T().add(j3VarPoll);
            return;
        }
        SparseArray<Long> sparseArrayZ = n().z();
        sparseArrayZ.put(j3VarPoll.f42258d, Long.valueOf(j3VarPoll.f42257c));
        L0 l0N = n();
        int[] iArr = new int[sparseArrayZ.size()];
        long[] jArr = new long[sparseArrayZ.size()];
        for (int i10 = 0; i10 < sparseArrayZ.size(); i10++) {
            iArr[i10] = sparseArrayZ.keyAt(i10);
            jArr[i10] = sparseArrayZ.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        l0N.f41872o.b(bundle);
        fVarB.a(new i6.d.a(fVarB, new T1(this, j3VarPoll)), new Q1(this));
    }

    public final PriorityQueue<j3> T() {
        if (this.j == null) {
            this.j = new PriorityQueue<>(Comparator.comparing(K1.f41852a, J1.f41840b));
        }
        return this.j;
    }

    public final void U() {
        p();
        String strA = n().f41871n.a();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (strA != null) {
            if ("unset".equals(strA)) {
                c2523i1.f42224n.getClass();
                y(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf("true".equals(strA) ? 1L : 0L);
                c2523i1.f42224n.getClass();
                y(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!c2523i1.h() || !this.f26582o) {
            d().f41718m.c("Updating Scion state (FE)");
            C2587y2 c2587y2R = c2523i1.r();
            c2587y2R.p();
            c2587y2R.t();
            c2587y2R.w(new I2(c2587y2R, c2587y2R.J(true)));
            return;
        }
        d().f41718m.c("Recording app launch after enabling measurement for the first time (FE)");
        O();
        ((N4) K4.f25500c.get()).getClass();
        if (c2523i1.f42218g.B(null, B.f41683m0)) {
            s().f42062e.a();
        }
        i().z(new R4.g(1, this));
    }

    public final void V(Bundle bundle, String str, String str2) {
        p();
        ((C2523i1) this.f3968a).f42224n.getClass();
        w(System.currentTimeMillis(), bundle, str, str2);
    }

    @Override // p131k5.AbstractC2589z0
    public final boolean v() {
        return false;
    }

    public final void w(long j, Bundle bundle, String str, String str2) {
        p();
        K(str, str2, j, bundle, true, this.f26572d == null || z3.v0(str2), true);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    public final void y(long j, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        C0804l.e(str);
        C0804l.e(str2);
        p();
        t();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    long j10 = "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
                    obj = Long.valueOf(j10);
                    n().f41871n.b(j10 == 1 ? "true" : "false");
                } else if (obj == null) {
                    n().f41871n.b("unset");
                } else {
                    obj2 = obj;
                    str3 = str2;
                }
            } else if (obj == null) {
                n().f41871n.b("unset");
            } else {
                obj2 = obj;
                str3 = str2;
            }
            obj2 = obj;
            str3 = "_npa";
        } else {
            obj2 = obj;
            str3 = str2;
        }
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (!c2523i1.h()) {
            d().f41719n.c("User property not set since app measurement is disabled");
            return;
        }
        if (c2523i1.j()) {
            v3 v3Var = new v3(j, obj2, str3, str);
            C2587y2 c2587y2R = c2523i1.r();
            c2587y2R.p();
            c2587y2R.t();
            C2573v0 c2573v0P = ((C2523i1) c2587y2R.f3968a).p();
            c2573v0P.getClass();
            Parcel parcelObtain = Parcel.obtain();
            boolean zY = false;
            v3Var.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                c2573v0P.d().f41713g.c("User property too long for local database. Sending directly to service");
            } else {
                zY = c2573v0P.y(1, bArrMarshall);
            }
            c2587y2R.w(new D2(c2587y2R, c2587y2R.J(true), zY, v3Var));
        }
    }

    public final void z(long j, boolean z10) {
        p();
        t();
        d().f41718m.c("Resetting analytics data (FE)");
        Y2 y2S = s();
        y2S.p();
        C2500d3 c2500d3 = y2S.f42063f;
        c2500d3.f42143c.a();
        c2500d3.f42141a = 0L;
        c2500d3.f42142b = 0L;
        C1924v5.a();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (c2523i1.f42218g.B(null, B.f41693r0)) {
            c2523i1.o().z();
        }
        boolean zH = c2523i1.h();
        L0 l0N = n();
        l0N.f41865g.b(j);
        if (!TextUtils.isEmpty(l0N.n().f41880w.a())) {
            l0N.f41880w.b(null);
        }
        ((N4) K4.f25500c.get()).getClass();
        C2523i1 c2523i2 = (C2523i1) l0N.f3968a;
        C2501e c2501e = c2523i2.f42218g;
        C2557r0<Boolean> c2557r0 = B.f41683m0;
        if (c2501e.B(null, c2557r0)) {
            l0N.f41874q.b(0L);
        }
        l0N.f41875r.b(0L);
        Boolean boolA = c2523i2.f42218g.A("firebase_analytics_collection_deactivated");
        if (boolA == null || !boolA.booleanValue()) {
            l0N.v(!zH);
        }
        l0N.f41881x.b(null);
        l0N.f41882y.b(0L);
        l0N.f41883z.b(null);
        if (z10) {
            C2587y2 c2587y2R = c2523i1.r();
            c2587y2R.p();
            c2587y2R.t();
            o3 o3VarJ = c2587y2R.J(false);
            ((C2523i1) c2587y2R.f3968a).p().z();
            c2587y2R.w(new androidx.work.i(c2587y2R, 1, o3VarJ));
        }
        ((N4) K4.f25500c.get()).getClass();
        if (c2523i1.f42218g.B(null, c2557r0)) {
            s().f42062e.a();
        }
        this.f26582o = !zH;
    }
}
