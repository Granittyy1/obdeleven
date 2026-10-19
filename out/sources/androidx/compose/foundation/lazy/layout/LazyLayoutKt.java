package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.animation.core.Z;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutKt {
    public static final void a(final Ia.a<? extends InterfaceC0985u> aVar, final androidx.compose.ui.h hVar, final H h8, final Ia.p<? super InterfaceC0988x, ? super p013b0.a, ? extends androidx.compose.ui.layout.F> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.K(hVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.K(h8) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c1086gP.k(pVar) ? 2048 : 1024;
        }
        if (c1086gP.C(i12 & 1, (i12 & 1171) != 1170)) {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            if (i14 != 0) {
                h8 = null;
            }
            final androidx.compose.runtime.X xI = J0.i(aVar, c1086gP);
            LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.a.b(-1488997347, new Ia.q<androidx.compose.runtime.saveable.c, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final p293xa.r invoke(androidx.compose.runtime.saveable.c cVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    androidx.compose.ui.h hVarI;
                    androidx.compose.runtime.saveable.c cVar2 = cVar;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    N0<Ia.a<InterfaceC0985u>> n10 = xI;
                    Object objF = interfaceC1084f3.f();
                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new C0983s(cVar2, new LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(n10));
                        interfaceC1084f3.E(objF);
                    }
                    final C0983s c0983s = (C0983s) objF;
                    Object objF2 = interfaceC1084f3.f();
                    if (objF2 == c0153a) {
                        objF2 = new SubcomposeLayoutState(new C0986v(c0983s));
                        interfaceC1084f3.E(objF2);
                    }
                    final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objF2;
                    if (h8 != null) {
                        interfaceC1084f3.L(204281539);
                        final V v10 = h8.f10584a;
                        if (v10 == null) {
                            interfaceC1084f3.L(6591363);
                            v10 = W.f10697a;
                            if (v10 != null) {
                                interfaceC1084f3.L(1213893039);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(1213931944);
                                View view = (View) interfaceC1084f3.x(AndroidCompositionLocals_androidKt.f14797f);
                                boolean zK = interfaceC1084f3.K(view);
                                Object objF3 = interfaceC1084f3.f();
                                if (zK || objF3 == c0153a) {
                                    objF3 = new RunnableC0966a(view);
                                    interfaceC1084f3.E(objF3);
                                }
                                interfaceC1084f3.D();
                                v10 = (RunnableC0966a) objF3;
                            }
                        } else {
                            interfaceC1084f3.L(6590278);
                        }
                        interfaceC1084f3.D();
                        H h10 = h8;
                        Object[] objArr = {h10, c0983s, subcomposeLayoutState, v10};
                        boolean zK2 = interfaceC1084f3.K(h10) | interfaceC1084f3.k(c0983s) | interfaceC1084f3.k(subcomposeLayoutState) | interfaceC1084f3.k(v10);
                        final H h11 = h8;
                        Object objF4 = interfaceC1084f3.f();
                        if (zK2 || objF4 == c0153a) {
                            objF4 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                                    H h12 = h11;
                                    h12.f10587d = new PrefetchHandleProvider(c0983s, subcomposeLayoutState, v10);
                                    return new Z(1, h12);
                                }
                            };
                            interfaceC1084f3.E(objF4);
                        }
                        androidx.compose.runtime.E.c(objArr, (Ia.l) objF4, interfaceC1084f3);
                        interfaceC1084f3.D();
                    } else {
                        interfaceC1084f3.L(204710145);
                        interfaceC1084f3.D();
                    }
                    androidx.compose.ui.h hVar2 = hVar;
                    H h12 = h8;
                    int i15 = I.f10591b;
                    if (h12 == null || (hVarI = hVar2.i(new TraversablePrefetchStateModifierElement(h12))) == null) {
                        hVarI = hVar2;
                    }
                    boolean zK3 = interfaceC1084f3.K(c0983s) | interfaceC1084f3.K(pVar);
                    final Ia.p<InterfaceC0988x, p013b0.a, androidx.compose.ui.layout.F> pVar2 = pVar;
                    Object objF5 = interfaceC1084f3.f();
                    if (zK3 || objF5 == c0153a) {
                        objF5 = new Ia.p<e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final androidx.compose.ui.layout.F invoke(e0 e0Var, p013b0.a aVar2) {
                                long j = aVar2.f20475a;
                                return pVar2.invoke(new C0989y(c0983s, e0Var), new p013b0.a(j));
                            }
                        };
                        interfaceC1084f3.E(objF5);
                    }
                    SubcomposeLayoutKt.b(subcomposeLayoutState, hVarI, (Ia.p) objF5, interfaceC1084f3, 8, 0);
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 6);
        } else {
            c1086gP.w();
        }
        final androidx.compose.ui.h hVar2 = hVar;
        final H h10 = h8;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyLayoutKt.a(aVar, hVar2, h10, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
