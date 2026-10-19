package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A0 f26102d = new A0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2000q1 f26103a = new C2000q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26105c;

    public A0() {
    }

    public static int a(InterfaceC2025z0 interfaceC2025z0, Object obj) {
        interfaceC2025z0.x();
        throw null;
    }

    public static boolean e(Map.Entry entry) {
        ((InterfaceC2025z0) entry.getKey()).y();
        throw null;
    }

    public static final int f(Map.Entry entry) {
        InterfaceC2025z0 interfaceC2025z0 = (InterfaceC2025z0) entry.getKey();
        entry.getValue();
        interfaceC2025z0.y();
        throw null;
    }

    public final Iterator b() {
        C2000q1 c2000q1 = this.f26103a;
        if (c2000q1.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f26105c ? new Q0(((C2011u1) c2000q1.entrySet()).iterator()) : ((C2011u1) c2000q1.entrySet()).iterator();
    }

    public final void c() {
        if (this.f26104b) {
            return;
        }
        C2000q1 c2000q1 = this.f26103a;
        int i10 = c2000q1.f26281c;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = c2000q1.f(i11).f26247c;
            if (obj instanceof I0) {
                ((I0) obj).l();
            }
        }
        Iterator it = c2000q1.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof I0) {
                ((I0) value).l();
            }
        }
        c2000q1.a();
        this.f26104b = true;
    }

    public final Object clone() throws CloneNotSupportedException {
        A0 a10 = new A0();
        C2000q1 c2000q1 = this.f26103a;
        if (c2000q1.f26281c > 0) {
            C2002r1 c2002r1F = c2000q1.f(0);
            InterfaceC2025z0 interfaceC2025z0 = (InterfaceC2025z0) c2002r1F.f26246b;
            Object obj = c2002r1F.f26247c;
            interfaceC2025z0.z();
            throw null;
        }
        Iterator it = c2000q1.c().iterator();
        if (!it.hasNext()) {
            a10.f26105c = this.f26105c;
            return a10;
        }
        Map.Entry entry = (Map.Entry) it.next();
        InterfaceC2025z0 interfaceC2025z1 = (InterfaceC2025z0) entry.getKey();
        entry.getValue();
        interfaceC2025z1.z();
        throw null;
    }

    public final boolean d() {
        C2000q1 c2000q1 = this.f26103a;
        if (c2000q1.f26281c > 0) {
            e(c2000q1.f(0));
            throw null;
        }
        Iterator it = c2000q1.c().iterator();
        if (!it.hasNext()) {
            return true;
        }
        e((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A0) {
            return this.f26103a.equals(((A0) obj).f26103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26103a.hashCode();
    }

    public A0(int i10) {
        c();
        c();
    }
}
