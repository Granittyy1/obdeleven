package androidx.activity.compose;

import Ia.l;
import Ia.p;
import androidx.activity.C;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import p293xa.r;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BackHandlerKt {

    /* JADX INFO: compiled from: BackHandler.kt */
    public static final class a extends y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ X f8204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(X x10, boolean z10) {
            super(z10);
            this.f8204d = x10;
        }

        @Override // androidx.activity.y
        public final void b() {
            ((Ia.a) this.f8204d.getValue()).invoke();
        }
    }

    public static final void a(final boolean z10, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            X xI = J0.i(aVar, c1086gP);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new a(xI, z10);
                c1086gP.E(objF);
            }
            final a aVar2 = (a) objF;
            boolean z11 = (i12 & 14) == 4;
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                objF2 = new Ia.a<r>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [Ia.a, kotlin.jvm.internal.FunctionReferenceImpl] */
                    @Override // Ia.a
                    public final r invoke() {
                        BackHandlerKt.a aVar3 = aVar2;
                        aVar3.f8270a = z10;
                        ?? r10 = aVar3.f8272c;
                        if (r10 != 0) {
                            r10.invoke();
                        }
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            B b10 = E.f12831a;
            c1086gP.l((Ia.a) objF2);
            C cA = LocalOnBackPressedDispatcherOwner.a(c1086gP);
            if (cA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = cA.getOnBackPressedDispatcher();
            final InterfaceC1376t interfaceC1376t = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zK = c1086gP.k(onBackPressedDispatcher) | c1086gP.k(interfaceC1376t);
            Object objF3 = c1086gP.f();
            if (zK || objF3 == c0153a) {
                objF3 = new l<B, A>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b11) {
                        onBackPressedDispatcher.a(interfaceC1376t, aVar2);
                        return new c(aVar2);
                    }
                };
                c1086gP.E(objF3);
            }
            E.b(interfaceC1376t, onBackPressedDispatcher, (l) objF3, c1086gP);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BackHandlerKt.a(z10, aVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
