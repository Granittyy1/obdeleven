package com.google.android.gms.measurement;

import U4.C0804l;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.collection.C0873a;
import com.google.android.gms.measurement.internal.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p131k5.B0;
import p131k5.C2481a;
import p131k5.C2493c1;
import p131k5.C2507f0;
import p131k5.C2523i1;
import p131k5.C2559r2;
import p131k5.C2567t2;
import p131k5.RunnableC2489b2;
import p131k5.RunnableC2509f2;
import p131k5.v3;
import p131k5.z3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AppMeasurement.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2523i1 f26533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f26534b;

    public b(C2523i1 c2523i1) {
        C0804l.h(c2523i1);
        this.f26533a = c2523i1;
        e eVar = c2523i1.f42226p;
        C2523i1.f(eVar);
        this.f26534b = eVar;
    }

    @Override // p131k5.InterfaceC2544n2
    public final long A() {
        z3 z3Var = this.f26533a.f42222l;
        C2523i1.e(z3Var);
        return z3Var.A0();
    }

    @Override // p131k5.InterfaceC2544n2
    public final String B() {
        C2567t2 c2567t2 = ((C2523i1) this.f26534b.f3968a).f42225o;
        C2523i1.f(c2567t2);
        C2559r2 c2559r2 = c2567t2.f42463c;
        if (c2559r2 != null) {
            return c2559r2.f42436b;
        }
        return null;
    }

    @Override // p131k5.InterfaceC2544n2
    public final void a(Bundle bundle, String str, String str2) {
        e eVar = this.f26533a.f42226p;
        C2523i1.f(eVar);
        eVar.C(bundle, str, str2);
    }

    @Override // p131k5.InterfaceC2544n2
    public final void b(String str) {
        C2523i1 c2523i1 = this.f26533a;
        C2481a c2481aM = c2523i1.m();
        c2523i1.f42224n.getClass();
        c2481aM.u(SystemClock.elapsedRealtime(), str);
    }

    @Override // p131k5.InterfaceC2544n2
    public final String c() {
        return this.f26534b.f26575g.get();
    }

    @Override // p131k5.InterfaceC2544n2
    public final String d() {
        return this.f26534b.f26575g.get();
    }

    @Override // p131k5.InterfaceC2544n2
    public final int e(String str) {
        C0804l.e(str);
        return 25;
    }

    @Override // p131k5.InterfaceC2544n2
    public final void f(Bundle bundle) {
        e eVar = this.f26534b;
        ((C2523i1) eVar.f3968a).f42224n.getClass();
        eVar.B(bundle, System.currentTimeMillis());
    }

    @Override // p131k5.InterfaceC2544n2
    public final void g(String str) {
        C2523i1 c2523i1 = this.f26533a;
        C2481a c2481aM = c2523i1.m();
        c2523i1.f42224n.getClass();
        c2481aM.z(SystemClock.elapsedRealtime(), str);
    }

    @Override // p131k5.InterfaceC2544n2
    public final String h() {
        C2567t2 c2567t2 = ((C2523i1) this.f26534b.f3968a).f42225o;
        C2523i1.f(c2567t2);
        C2559r2 c2559r2 = c2567t2.f42463c;
        if (c2559r2 != null) {
            return c2559r2.f42435a;
        }
        return null;
    }

    @Override // p131k5.InterfaceC2544n2
    public final List<Bundle> i(String str, String str2) {
        e eVar = this.f26534b;
        if (eVar.i().B()) {
            eVar.d().f41712f.c("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C2507f0.b()) {
            eVar.d().f41712f.c("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C2493c1 c2493c1 = ((C2523i1) eVar.f3968a).j;
        C2523i1.g(c2493c1);
        c2493c1.t(atomicReference, 5000L, "get conditional user properties", new RunnableC2489b2(eVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return z3.k0(list);
        }
        eVar.d().f41712f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p131k5.InterfaceC2544n2
    public final Map<String, Object> j(String str, String str2, boolean z10) {
        e eVar = this.f26534b;
        if (eVar.i().B()) {
            eVar.d().f41712f.c("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C2507f0.b()) {
            eVar.d().f41712f.c("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        C2493c1 c2493c1 = ((C2523i1) eVar.f3968a).j;
        C2523i1.g(c2493c1);
        c2493c1.t(atomicReference, 5000L, "get user properties", new RunnableC2509f2(eVar, atomicReference, str, str2, z10));
        List<v3> list = (List) atomicReference.get();
        if (list == null) {
            B0 b0D = eVar.d();
            b0D.f41712f.b(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C0873a c0873a = new C0873a(list.size());
        for (v3 v3Var : list) {
            Object objA = v3Var.a();
            if (objA != null) {
                c0873a.put(v3Var.f42503c, objA);
            }
        }
        return c0873a;
    }

    @Override // p131k5.InterfaceC2544n2
    public final void k(Bundle bundle, String str, String str2) {
        e eVar = this.f26534b;
        ((C2523i1) eVar.f3968a).f42224n.getClass();
        eVar.L(str, str2, bundle, true, true, System.currentTimeMillis());
    }
}
