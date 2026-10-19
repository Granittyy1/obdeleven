package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f12831a = new B();

    public static final void a(Object obj, Ia.l lVar, InterfaceC1084f interfaceC1084f) {
        boolean zK = interfaceC1084f.K(obj);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new C1118z(lVar);
            interfaceC1084f.E(objF);
        }
    }

    public static final void b(Object obj, Object obj2, Ia.l lVar, InterfaceC1084f interfaceC1084f) {
        boolean zK = interfaceC1084f.K(obj) | interfaceC1084f.K(obj2);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new C1118z(lVar);
            interfaceC1084f.E(objF);
        }
    }

    public static final void c(Object[] objArr, Ia.l lVar, InterfaceC1084f interfaceC1084f) {
        boolean zK = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zK |= interfaceC1084f.K(obj);
        }
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            interfaceC1084f.E(new C1118z(lVar));
        }
    }

    public static final void d(Ia.p pVar, InterfaceC1084f interfaceC1084f, Object obj) {
        kotlin.coroutines.e eVarY = interfaceC1084f.y();
        boolean zK = interfaceC1084f.K(obj);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new M(eVarY, pVar);
            interfaceC1084f.E(objF);
        }
    }

    public static final void e(Object obj, Object obj2, Ia.p pVar, InterfaceC1084f interfaceC1084f) {
        kotlin.coroutines.e eVarY = interfaceC1084f.y();
        boolean zK = interfaceC1084f.K(obj) | interfaceC1084f.K(obj2);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new M(eVarY, pVar);
            interfaceC1084f.E(objF);
        }
    }

    public static final kotlinx.coroutines.A f(EmptyCoroutineContext emptyCoroutineContext, InterfaceC1084f interfaceC1084f) {
        emptyCoroutineContext.getClass();
        return new v0(interfaceC1084f.y(), emptyCoroutineContext);
    }
}
