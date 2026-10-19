package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2708s;
import kotlinx.coroutines.C2709t;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.U;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D3.l f43481b;

    static {
        int i10 = 4;
        f43480a = new D3.l(i10, "UNDEFINED");
        f43481b = new D3.l(i10, "REUSABLE_CLAIMED");
    }

    public static final <T> void a(kotlin.coroutines.c<? super T> cVar, Object obj, Ia.l<? super Throwable, p293xa.r> lVar) {
        Object c2708s;
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        Throwable thA = Result.a(obj);
        if (thA == null) {
            c2708s = lVar != null ? new C2709t(obj, lVar) : obj;
        } else {
            c2708s = new C2708s(thA, false);
        }
        ContinuationImpl continuationImpl = hVar.f43477f;
        kotlin.coroutines.e context = continuationImpl.getContext();
        AbstractC2712w abstractC2712w = hVar.f43476e;
        if (abstractC2712w.b1(context)) {
            hVar.f43478g = c2708s;
            hVar.f43195d = 1;
            abstractC2712w.Z0(continuationImpl.getContext(), hVar);
            return;
        }
        U uA = D0.a();
        if (uA.g1()) {
            hVar.f43478g = c2708s;
            hVar.f43195d = 1;
            uA.e1(hVar);
            return;
        }
        uA.f1(true);
        try {
            InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) continuationImpl.getContext().get(InterfaceC2694i0.b.f43449b);
            if (interfaceC2694i0 == null || interfaceC2694i0.c()) {
                Object obj2 = hVar.f43479h;
                kotlin.coroutines.e context2 = continuationImpl.getContext();
                Object objC = ThreadContextKt.c(context2, obj2);
                I0<?> i0D = objC != ThreadContextKt.f43460a ? CoroutineContextKt.d(continuationImpl, context2, objC) : null;
                try {
                    continuationImpl.resumeWith(obj);
                    p293xa.r rVar = p293xa.r.f47939a;
                    if (i0D == null || i0D.w0()) {
                        ThreadContextKt.a(context2, objC);
                    }
                } catch (Throwable th) {
                    if (i0D == null || i0D.w0()) {
                        ThreadContextKt.a(context2, objC);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionM = interfaceC2694i0.M();
                hVar.a(c2708s, cancellationExceptionM);
                hVar.resumeWith(kotlin.b.a(cancellationExceptionM));
            }
            while (uA.i1()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.g(th2, null);
            } finally {
                uA.d1(true);
            }
        }
    }
}
