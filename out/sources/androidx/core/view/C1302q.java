package androidx.core.view;

import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: MenuHostHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1302q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f16983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC1303s> f16984b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16985c = new HashMap();

    /* JADX INFO: renamed from: androidx.core.view.q$a */
    /* JADX INFO: compiled from: MenuHostHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f16986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.r f16987b;

        public a(Lifecycle lifecycle, androidx.lifecycle.r rVar) {
            this.f16986a = lifecycle;
            this.f16987b = rVar;
            lifecycle.a(rVar);
        }
    }

    public C1302q(Runnable runnable) {
        this.f16983a = runnable;
    }

    public final void a(final InterfaceC1303s interfaceC1303s, InterfaceC1376t interfaceC1376t) {
        this.f16984b.add(interfaceC1303s);
        this.f16983a.run();
        Lifecycle lifecycle = interfaceC1376t.getLifecycle();
        HashMap map = this.f16985c;
        a aVar = (a) map.remove(interfaceC1303s);
        if (aVar != null) {
            aVar.f16986a.c(aVar.f16987b);
            aVar.f16987b = null;
        }
        map.put(interfaceC1303s, new a(lifecycle, new androidx.lifecycle.r() { // from class: androidx.core.view.p
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t2, Lifecycle.Event event) {
                C1302q c1302q = this.f16981b;
                c1302q.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c1302q.c(interfaceC1303s);
                }
            }
        }));
    }

    public final void b(final InterfaceC1303s interfaceC1303s, InterfaceC1376t interfaceC1376t, final Lifecycle.State state) {
        Lifecycle lifecycle = interfaceC1376t.getLifecycle();
        HashMap map = this.f16985c;
        a aVar = (a) map.remove(interfaceC1303s);
        if (aVar != null) {
            aVar.f16986a.c(aVar.f16987b);
            aVar.f16987b = null;
        }
        map.put(interfaceC1303s, new a(lifecycle, new androidx.lifecycle.r() { // from class: androidx.core.view.o
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t2, Lifecycle.Event event) {
                C1302q c1302q = this.f16978b;
                c1302q.getClass();
                Lifecycle.Event.Companion.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event eventC = Lifecycle.Event.a.c(state2);
                Runnable runnable = c1302q.f16983a;
                CopyOnWriteArrayList<InterfaceC1303s> copyOnWriteArrayList = c1302q.f16984b;
                InterfaceC1303s interfaceC1303s2 = interfaceC1303s;
                if (event == eventC) {
                    copyOnWriteArrayList.add(interfaceC1303s2);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    c1302q.c(interfaceC1303s2);
                } else if (event == Lifecycle.Event.a.a(state2)) {
                    copyOnWriteArrayList.remove(interfaceC1303s2);
                    runnable.run();
                }
            }
        }));
    }

    public final void c(InterfaceC1303s interfaceC1303s) {
        this.f16984b.remove(interfaceC1303s);
        a aVar = (a) this.f16985c.remove(interfaceC1303s);
        if (aVar != null) {
            aVar.f16986a.c(aVar.f16987b);
            aVar.f16987b = null;
        }
        this.f16983a.run();
    }
}
