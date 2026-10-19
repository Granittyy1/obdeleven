package androidx.compose.runtime;

import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {
    public static final X a(kotlinx.coroutines.flow.A a10, InterfaceC1084f interfaceC1084f, int i10) {
        return b(a10, a10.getValue(), EmptyCoroutineContext.f43032b, interfaceC1084f, i10 & 14, 0);
    }

    public static final X b(kotlinx.coroutines.flow.A a10, Object obj, kotlin.coroutines.e eVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        if ((i11 & 2) != 0) {
            eVar = EmptyCoroutineContext.f43032b;
        }
        boolean zK = interfaceC1084f.k(eVar) | interfaceC1084f.k(a10);
        Object objF = interfaceC1084f.f();
        Object obj2 = InterfaceC1084f.a.f12980a;
        if (zK || objF == obj2) {
            objF = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(eVar, a10, null);
            interfaceC1084f.E(objF);
        }
        Ia.p pVar = (Ia.p) objF;
        Object objF2 = interfaceC1084f.f();
        if (objF2 == obj2) {
            objF2 = f(obj);
            interfaceC1084f.E(objF2);
        }
        X x10 = (X) objF2;
        boolean zK2 = interfaceC1084f.k(pVar);
        Object objF3 = interfaceC1084f.f();
        if (zK2 || objF3 == obj2) {
            objF3 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(pVar, x10, null);
            interfaceC1084f.E(objF3);
        }
        E.e(a10, eVar, (Ia.p) objF3, interfaceC1084f);
        return x10;
    }

    public static final androidx.compose.runtime.collection.c<InterfaceC1117y> c() {
        androidx.compose.runtime.internal.f fVar = K0.f12864b;
        androidx.compose.runtime.collection.c<InterfaceC1117y> cVar = (androidx.compose.runtime.collection.c) fVar.a();
        if (cVar != null) {
            return cVar;
        }
        androidx.compose.runtime.collection.c<InterfaceC1117y> cVar2 = new androidx.compose.runtime.collection.c<>(new InterfaceC1117y[0]);
        fVar.b(cVar2);
        return cVar2;
    }

    public static final DerivedSnapshotState d(Ia.a aVar) {
        androidx.compose.runtime.internal.f fVar = K0.f12863a;
        return new DerivedSnapshotState(aVar, null);
    }

    public static final DerivedSnapshotState e(Ia.a aVar, I0 i10) {
        androidx.compose.runtime.internal.f fVar = K0.f12863a;
        return new DerivedSnapshotState(aVar, i10);
    }

    public static C1085f0 f(Object obj) {
        return new C1085f0(obj, Q0.f12888a);
    }

    public static final X g(Ia.p pVar, InterfaceC1084f interfaceC1084f, Object obj) {
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = f(obj);
            interfaceC1084f.E(objF);
        }
        X x10 = (X) objF;
        p293xa.r rVar = p293xa.r.f47939a;
        boolean zK = interfaceC1084f.k(pVar);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == c0153a) {
            objF2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(pVar, x10, null);
            interfaceC1084f.E(objF2);
        }
        E.d((Ia.p) objF2, interfaceC1084f, rVar);
        return x10;
    }

    public static final X h(EmptyList emptyList, IntercomPreviewFile intercomPreviewFile, Ia.p pVar, InterfaceC1084f interfaceC1084f) {
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = f(emptyList);
            interfaceC1084f.E(objF);
        }
        X x10 = (X) objF;
        boolean zK = interfaceC1084f.k(pVar);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == c0153a) {
            objF2 = new SnapshotStateKt__ProduceStateKt$produceState$2$1(pVar, x10, null);
            interfaceC1084f.E(objF2);
        }
        E.d((Ia.p) objF2, interfaceC1084f, intercomPreviewFile);
        return x10;
    }

    public static final X i(Object obj, InterfaceC1084f interfaceC1084f) {
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = f(obj);
            interfaceC1084f.E(objF);
        }
        X x10 = (X) objF;
        x10.setValue(obj);
        return x10;
    }

    public static final kotlinx.coroutines.flow.t j(Ia.a aVar) {
        return new kotlinx.coroutines.flow.t(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, null));
    }
}
