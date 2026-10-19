package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.C1113u;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.coroutines.EmptyCoroutineContext;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {
    public static final void a(final Ia.a<p293xa.r> aVar, final S s10, final Animatable<Float, C0909i> animatable, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        InterfaceC1084f.a.C0153a c0153a;
        boolean z10;
        C1086g c1086gP = interfaceC1084f.p(1254951810);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(s10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c1086gP.K(animatable) : c1086gP.k(animatable) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(pVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            View view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
            p013b0.c cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
            final LayoutDirection layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            C1086g.b bVarG = c1086gP.G();
            final androidx.compose.runtime.X xI = J0.i(pVar, c1086gP);
            UUID uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1
                @Override // Ia.a
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, c1086gP, 3072, 6);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (objF == c0153a2) {
                C1113u c1113u = new C1113u(androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP));
                c1086gP.E(c1113u);
                objF = c1113u;
            }
            kotlinx.coroutines.A a10 = ((C1113u) objF).f13246b;
            boolean zW = O.e.w(c1086gP);
            boolean zK = c1086gP.K(view) | c1086gP.K(cVar);
            Object objF2 = c1086gP.f();
            if (zK || objF2 == c0153a2) {
                c0153a = c0153a2;
                z10 = true;
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(aVar, s10, view, layoutDirection, cVar, uuid, animatable, a10, zW);
                ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(true, -1560960657, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1.1
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                    androidx.compose.ui.semantics.v<p293xa.r> vVar = SemanticsProperties.f15168v;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    wVar.e(vVar, rVar);
                                    return rVar;
                                }
                            });
                            N0<Ia.p<InterfaceC1084f, Integer, p293xa.r>> n10 = xI;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(n10.getValue(), interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                });
                ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = modalBottomSheetDialogWrapper.f12234h;
                modalBottomSheetDialogLayout.setParentCompositionContext(bVarG);
                modalBottomSheetDialogLayout.f12225g.setValue(composableLambdaImpl);
                modalBottomSheetDialogLayout.f12227i = true;
                modalBottomSheetDialogLayout.createComposition();
                c1086gP.E(modalBottomSheetDialogWrapper);
                objF2 = modalBottomSheetDialogWrapper;
            } else {
                z10 = true;
                c0153a = c0153a2;
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) objF2;
            boolean zK2 = c1086gP.k(modalBottomSheetDialogWrapper2);
            Object objF3 = c1086gP.f();
            if (zK2 || objF3 == c0153a) {
                objF3 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        modalBottomSheetDialogWrapper2.show();
                        return new T(0, modalBottomSheetDialogWrapper2);
                    }
                };
                c1086gP.E(objF3);
            }
            androidx.compose.runtime.E.a(modalBottomSheetDialogWrapper2, (Ia.l) objF3, c1086gP);
            boolean zK3 = c1086gP.k(modalBottomSheetDialogWrapper2) | ((i11 & 14) == 4 ? z10 : false);
            if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 32) {
                z10 = false;
            }
            boolean zK4 = zK3 | z10 | c1086gP.K(layoutDirection);
            Object objF4 = c1086gP.f();
            if (zK4 || objF4 == c0153a) {
                objF4 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        modalBottomSheetDialogWrapper2.d(aVar, s10, layoutDirection);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            c1086gP.l((Ia.a) objF4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ModalBottomSheet_androidKt.a(aVar, s10, animatable, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
