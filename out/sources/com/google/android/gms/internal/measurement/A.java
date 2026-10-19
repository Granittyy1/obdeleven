package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q0 f25391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y1 f25392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1793d f25393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1779b f25394d;

    public A() {
        Q0 q10 = new Q0();
        this.f25391a = q10;
        this.f25392b = q10.f25558b.d();
        C1793d c1793d = new C1793d();
        c1793d.f25671a = new C1800e("", 0L, null);
        c1793d.f25672b = new C1800e("", 0L, null);
        c1793d.f25673c = new ArrayList();
        this.f25393c = c1793d;
        this.f25394d = new C1779b();
        CallableC1772a callableC1772a = new CallableC1772a();
        callableC1772a.f25651b = this;
        C1860m3 c1860m3 = q10.f25560d;
        c1860m3.f25798a.put("internal.registerCallback", callableC1772a);
        CallableC1794d0 callableC1794d0 = new CallableC1794d0();
        callableC1794d0.f25674b = this;
        c1860m3.f25798a.put("internal.eventLogger", callableC1794d0);
    }

    public final void a(H1 h8) throws zzc {
        AbstractC1856m abstractC1856m;
        Q0 q10 = this.f25391a;
        try {
            this.f25392b = q10.f25558b.d();
            if (q10.a(this.f25392b, (zzgb$zzd[]) h8.w().toArray(new zzgb$zzd[0])) instanceof C1842k) {
                throw new IllegalStateException("Program loading failed");
            }
            for (G1 g10 : h8.v().x()) {
                V2 v2W = g10.w();
                String strV = g10.v();
                Iterator<E> it = v2W.iterator();
                while (it.hasNext()) {
                    InterfaceC1884q interfaceC1884qA = q10.a(this.f25392b, (zzgb$zzd) it.next());
                    if (!(interfaceC1884qA instanceof C1877p)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Y1 y10 = this.f25392b;
                    if (y10.f(strV)) {
                        InterfaceC1884q interfaceC1884qC = y10.c(strV);
                        if (!(interfaceC1884qC instanceof AbstractC1856m)) {
                            throw new IllegalStateException("Invalid function name: " + strV);
                        }
                        abstractC1856m = (AbstractC1856m) interfaceC1884qC;
                    } else {
                        abstractC1856m = null;
                    }
                    if (abstractC1856m == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strV);
                    }
                    abstractC1856m.a(this.f25392b, Collections.singletonList(interfaceC1884qA));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final boolean b(C1800e c1800e) throws zzc {
        C1793d c1793d = this.f25393c;
        try {
            c1793d.f25671a = c1800e;
            c1793d.f25672b = (C1800e) c1800e.clone();
            c1793d.f25673c.clear();
            this.f25391a.f25559c.g("runtime.counter", new C1835j(Double.valueOf(0.0d)));
            this.f25394d.a(this.f25392b.d(), c1793d);
            C1793d c1793d2 = this.f25393c;
            return (c1793d2.f25672b.equals(c1793d2.f25671a) && this.f25393c.f25673c.isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }
}
