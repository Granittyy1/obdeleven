package kotlinx.coroutines;

import com.google.android.gms.internal.measurement.M1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class B {
    public static final kotlinx.coroutines.internal.f a(kotlin.coroutines.e eVar) {
        if (eVar.get(InterfaceC2694i0.b.f43449b) == null) {
            eVar = eVar.plus(C2702l0.a());
        }
        return new kotlinx.coroutines.internal.f(eVar);
    }

    public static final kotlinx.coroutines.internal.f b() {
        B0 b0A = M1.a();
        Sa.b bVar = N.f43198a;
        return new kotlinx.coroutines.internal.f(kotlin.coroutines.e.a.C0479a.d(b0A, kotlinx.coroutines.internal.q.f43500a));
    }

    public static final void c(A a10, CancellationException cancellationException) {
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) a10.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + a10).toString());
        }
    }

    public static final <R> Object d(Ia.p<? super A, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super R> cVar) {
        kotlinx.coroutines.internal.u uVar = new kotlinx.coroutines.internal.u(cVar, cVar.getContext());
        Object objL = com.google.android.gms.internal.measurement.Y.l(uVar, uVar, pVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objL;
    }

    public static final boolean e(A a10) {
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) a10.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 != null) {
            return interfaceC2694i0.c();
        }
        return true;
    }
}
