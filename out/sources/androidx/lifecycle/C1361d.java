package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1361d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1368k[] f17816b;

    public C1361d(InterfaceC1368k[] interfaceC1368kArr) {
        this.f17816b = interfaceC1368kArr;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        new HashMap();
        InterfaceC1368k[] interfaceC1368kArr = this.f17816b;
        for (InterfaceC1368k interfaceC1368k : interfaceC1368kArr) {
            interfaceC1368k.a();
        }
        for (InterfaceC1368k interfaceC1368k2 : interfaceC1368kArr) {
            interfaceC1368k2.a();
        }
    }
}
