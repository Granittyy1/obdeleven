package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y1 f25641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V7.a f25642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25643c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f25644d = new HashMap();

    public Y1(Y1 y10, V7.a aVar) {
        this.f25641a = y10;
        this.f25642b = aVar;
    }

    public final InterfaceC1884q a(C1814g c1814g) {
        InterfaceC1884q interfaceC1884qC = InterfaceC1884q.f25814f0;
        Iterator<Integer> itK = c1814g.K();
        while (itK.hasNext()) {
            interfaceC1884qC = this.f25642b.c(this, c1814g.d(itK.next().intValue()));
            if (interfaceC1884qC instanceof C1842k) {
                break;
            }
        }
        return interfaceC1884qC;
    }

    public final InterfaceC1884q b(InterfaceC1884q interfaceC1884q) {
        return this.f25642b.c(this, interfaceC1884q);
    }

    public final InterfaceC1884q c(String str) {
        Y1 y10 = this;
        while (!y10.f25643c.containsKey(str)) {
            y10 = y10.f25641a;
            if (y10 == null) {
                throw new IllegalArgumentException(androidx.compose.ui.text.font.s.b(str, " is not defined"));
            }
        }
        return (InterfaceC1884q) y10.f25643c.get(str);
    }

    public final Y1 d() {
        return new Y1(this, this.f25642b);
    }

    public final void e(String str, InterfaceC1884q interfaceC1884q) {
        if (this.f25644d.containsKey(str)) {
            return;
        }
        HashMap map = this.f25643c;
        if (interfaceC1884q == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1884q);
        }
    }

    public final boolean f(String str) {
        Y1 y10 = this;
        while (!y10.f25643c.containsKey(str)) {
            y10 = y10.f25641a;
            if (y10 == null) {
                return false;
            }
        }
        return true;
    }

    public final void g(String str, InterfaceC1884q interfaceC1884q) {
        Y1 y10;
        Y1 y11 = this;
        while (!y11.f25643c.containsKey(str) && (y10 = y11.f25641a) != null && y10.f(str)) {
            y11 = y10;
        }
        if (y11.f25644d.containsKey(str)) {
            return;
        }
        HashMap map = y11.f25643c;
        if (interfaceC1884q == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1884q);
        }
    }
}
