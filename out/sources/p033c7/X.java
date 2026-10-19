package p033c7;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p096h7.b;
import p192p6.a;

/* JADX INFO: compiled from: ProxyAnalyticsConnector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class X implements p192p6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f22414a;

    /* JADX INFO: compiled from: ProxyAnalyticsConnector.java */
    public static class a implements p192p6.a.InterfaceC0518a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Object f22415c = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f22416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile p192p6.a.InterfaceC0518a f22417b;

        @Override // p192p6.a.InterfaceC0518a
        public final void a(HashSet hashSet) {
            p192p6.a.InterfaceC0518a interfaceC0518a = this.f22417b;
            if (interfaceC0518a == f22415c) {
                return;
            }
            if (interfaceC0518a != null) {
                interfaceC0518a.a(hashSet);
            } else {
                synchronized (this) {
                    this.f22416a.addAll(hashSet);
                }
            }
        }
    }

    @Override // p192p6.a
    public final void a(String str, String str2) {
        Object obj = this.f22414a;
        p192p6.a aVar = obj instanceof p192p6.a ? (p192p6.a) obj : null;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    @Override // p192p6.a
    public final Map<String, Object> b(boolean z10) {
        return Collections.emptyMap();
    }

    @Override // p192p6.a
    public final void c(Bundle bundle, String str, String str2) {
        Object obj = this.f22414a;
        p192p6.a aVar = obj instanceof p192p6.a ? (p192p6.a) obj : null;
        if (aVar != null) {
            aVar.c(bundle, str, str2);
        }
    }

    @Override // p192p6.a
    public final int e(String str) {
        return 0;
    }

    @Override // p192p6.a
    public final p192p6.a.InterfaceC0518a f(final String str, final p6.a.b bVar) {
        Object obj = this.f22414a;
        if (obj instanceof p192p6.a) {
            return ((p192p6.a) obj).f(str, bVar);
        }
        final a aVar = new a();
        aVar.f22416a = new HashSet();
        ((p096h7.a) obj).a(new p096h7.a.InterfaceC0377a() { // from class: c7.W
            @Override // p096h7.a.InterfaceC0377a
            public final void d(b bVar2) {
                X.a aVar2 = aVar;
                String str2 = str;
                a.b bVar3 = bVar;
                if (aVar2.f22417b == X.a.f22415c) {
                    return;
                }
                a.InterfaceC0518a interfaceC0518aF = ((a) bVar2.get()).f(str2, bVar3);
                aVar2.f22417b = interfaceC0518aF;
                synchronized (aVar2) {
                    try {
                        if (!aVar2.f22416a.isEmpty()) {
                            interfaceC0518aF.a(aVar2.f22416a);
                            aVar2.f22416a = new HashSet();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        return aVar;
    }

    @Override // p192p6.a
    public final List h(String str) {
        return Collections.emptyList();
    }

    @Override // p192p6.a
    public final void d(p6.a.c cVar) {
    }

    @Override // p192p6.a
    public final void g(String str) {
    }
}
