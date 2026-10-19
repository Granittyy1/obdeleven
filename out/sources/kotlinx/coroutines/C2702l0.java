package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: kotlinx.coroutines.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2702l0 {
    public static C2700k0 a() {
        return new C2700k0(null);
    }

    public static final void b(kotlin.coroutines.e eVar, CancellationException cancellationException) {
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(cancellationException);
        }
    }

    public static final Object c(InterfaceC2694i0 interfaceC2694i0, ContinuationImpl continuationImpl) {
        interfaceC2694i0.i(null);
        Object objC = interfaceC2694i0.C(continuationImpl);
        return objC == CoroutineSingletons.f43038b ? objC : p293xa.r.f47939a;
    }

    public static void d(kotlin.coroutines.e eVar) {
        kotlin.sequences.g<InterfaceC2694i0> gVarX;
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 == null || (gVarX = interfaceC2694i0.x()) == null) {
            return;
        }
        Iterator<InterfaceC2694i0> it = gVarX.iterator();
        while (it.hasNext()) {
            it.next().i(null);
        }
    }

    public static final void e(kotlin.coroutines.e eVar) {
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 != null && !interfaceC2694i0.c()) {
            throw interfaceC2694i0.M();
        }
    }

    public static final InterfaceC2694i0 f(kotlin.coroutines.e eVar) {
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 != null) {
            return interfaceC2694i0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + eVar).toString());
    }

    public static P g(InterfaceC2694i0 interfaceC2694i0, boolean z10, m0 m0Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        return interfaceC2694i0 instanceof JobSupport ? ((JobSupport) interfaceC2694i0).a0(z10, z11, m0Var) : interfaceC2694i0.f0(z10, z11, new JobKt__JobKt$invokeOnCompletion$1(1, m0Var, InterfaceC2681e0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean h(kotlin.coroutines.e eVar) {
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 != null) {
            return interfaceC2694i0.c();
        }
        return true;
    }
}
