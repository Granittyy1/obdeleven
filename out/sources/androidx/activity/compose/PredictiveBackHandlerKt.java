package androidx.activity.compose;

import Ia.l;
import Ia.p;
import androidx.activity.C;
import androidx.activity.C0845b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.C1113u;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2686c;
import p293xa.r;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PredictiveBackHandlerKt {
    public static final void a(final boolean z10, final p<InterfaceC2686c<C0845b>, ? super kotlin.coroutines.c<r>, ? extends Object> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-642000585);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            X xI = J0.i(pVar, c1086gP);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                C1113u c1113u = new C1113u(E.f(EmptyCoroutineContext.f43032b, c1086gP));
                c1086gP.E(c1113u);
                objF = c1113u;
            }
            A a10 = ((C1113u) objF).f13246b;
            Object objF2 = c1086gP.f();
            Object obj = objF2;
            if (objF2 == c0153a) {
                p<? super InterfaceC2686c<C0845b>, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar2 = (p) xI.getValue();
                g gVar = new g(z10);
                gVar.f8220d = a10;
                gVar.f8221e = pVar2;
                c1086gP.E(gVar);
                obj = gVar;
            }
            final g gVar2 = (g) obj;
            boolean zK = c1086gP.K((p) xI.getValue()) | c1086gP.K(a10);
            Object objF3 = c1086gP.f();
            if (zK || objF3 == c0153a) {
                gVar2.f8221e = (p) xI.getValue();
                gVar2.f8220d = a10;
                c1086gP.E(r.f47939a);
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            boolean zK2 = c1086gP.k(gVar2) | ((i12 & 14) == 4);
            Object objF4 = c1086gP.f();
            if (zK2 || objF4 == c0153a) {
                objF4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(gVar2, z10, null);
                c1086gP.E(objF4);
            }
            E.d((p) objF4, c1086gP, boolValueOf);
            C cA = LocalOnBackPressedDispatcherOwner.a(c1086gP);
            if (cA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = cA.getOnBackPressedDispatcher();
            final InterfaceC1376t interfaceC1376t = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zK3 = c1086gP.k(onBackPressedDispatcher) | c1086gP.k(interfaceC1376t) | c1086gP.k(gVar2);
            Object objF5 = c1086gP.f();
            if (zK3 || objF5 == c0153a) {
                objF5 = new l<B, androidx.compose.runtime.A>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(B b10) {
                        onBackPressedDispatcher.a(interfaceC1376t, gVar2);
                        return new h(gVar2);
                    }
                };
                c1086gP.E(objF5);
            }
            E.b(interfaceC1376t, onBackPressedDispatcher, (l) objF5, c1086gP);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PredictiveBackHandlerKt.a(z10, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
