package coil.request;

import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import coil.RealImageLoader;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: RequestDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RealImageLoader f23129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f23130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p004a3.c<?> f23131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lifecycle f23132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2694i0 f23133f;

    public q(RealImageLoader realImageLoader, g gVar, p004a3.c cVar, Lifecycle lifecycle, InterfaceC2694i0 interfaceC2694i0) {
        this.f23129b = realImageLoader;
        this.f23130c = gVar;
        this.f23131d = cVar;
        this.f23132e = lifecycle;
        this.f23133f = interfaceC2694i0;
    }

    @Override // coil.request.m
    public final void i() {
        p004a3.c<?> cVar = this.f23131d;
        if (cVar.a().isAttachedToWindow()) {
            return;
        }
        r rVarC = coil.util.k.c(cVar.a());
        q qVar = rVarC.f23137e;
        if (qVar != null) {
            qVar.f23133f.i(null);
            p004a3.c<?> cVar2 = qVar.f23131d;
            boolean z10 = cVar2 instanceof InterfaceC1375s;
            Lifecycle lifecycle = qVar.f23132e;
            if (z10) {
                lifecycle.c((InterfaceC1375s) cVar2);
            }
            lifecycle.c(qVar);
        }
        rVarC.f23137e = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void s(InterfaceC1376t interfaceC1376t) {
        r rVarC = coil.util.k.c(this.f23131d.a());
        synchronized (rVarC) {
            z0 z0Var = rVarC.f23136d;
            if (z0Var != null) {
                z0Var.i(null);
            }
            C2673a0 c2673a0 = C2673a0.f43223b;
            Sa.b bVar = N.f43198a;
            rVarC.f23136d = C2680e.c(c2673a0, kotlinx.coroutines.internal.q.f43500a.d1(), null, new ViewTargetRequestManager$dispose$1(rVarC, null), 2);
            rVarC.f23135c = null;
        }
    }

    @Override // coil.request.m
    public final void start() {
        Lifecycle lifecycle = this.f23132e;
        lifecycle.a(this);
        p004a3.c<?> cVar = this.f23131d;
        if (cVar instanceof InterfaceC1375s) {
            InterfaceC1375s interfaceC1375s = (InterfaceC1375s) cVar;
            lifecycle.c(interfaceC1375s);
            lifecycle.a(interfaceC1375s);
        }
        r rVarC = coil.util.k.c(cVar.a());
        q qVar = rVarC.f23137e;
        if (qVar != null) {
            qVar.f23133f.i(null);
            p004a3.c<?> cVar2 = qVar.f23131d;
            boolean z10 = cVar2 instanceof InterfaceC1375s;
            Lifecycle lifecycle2 = qVar.f23132e;
            if (z10) {
                lifecycle2.c((InterfaceC1375s) cVar2);
            }
            lifecycle2.c(qVar);
        }
        rVarC.f23137e = this;
    }
}
