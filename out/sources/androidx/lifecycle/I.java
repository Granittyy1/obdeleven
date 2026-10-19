package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: ReflectiveGenericLifecycleObserver.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class I implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1375s f17738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1360c.a f17739c;

    public I(InterfaceC1375s interfaceC1375s) {
        this.f17738b = interfaceC1375s;
        C1360c c1360c = C1360c.f17809c;
        Class<?> cls = interfaceC1375s.getClass();
        C1360c.a aVar = (C1360c.a) c1360c.f17810a.get(cls);
        this.f17739c = aVar == null ? c1360c.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        HashMap map = this.f17739c.f17812a;
        List list = (List) map.get(event);
        InterfaceC1375s interfaceC1375s = this.f17738b;
        C1360c.a.a(list, interfaceC1376t, event, interfaceC1375s);
        C1360c.a.a((List) map.get(Lifecycle.Event.ON_ANY), interfaceC1376t, event, interfaceC1375s);
    }
}
