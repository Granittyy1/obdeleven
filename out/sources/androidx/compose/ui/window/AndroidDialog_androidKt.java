package androidx.compose.ui.window;

import Ia.p;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:70:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void a(final Ia.a<r> aVar, f fVar, final p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final f fVar2;
        int i13;
        int i14;
        boolean z10;
        C1086g c1086g;
        C1105p0 c1105p0V;
        f fVar3;
        View view;
        p013b0.c cVar;
        final LayoutDirection layoutDirection;
        C1086g.b bVarG;
        final X xI;
        UUID uuid;
        boolean zK;
        final f fVar4;
        boolean z11;
        Object obj;
        C1086g c1086g2;
        final DialogWrapper dialogWrapper;
        boolean zK2;
        Object objF;
        boolean z12;
        boolean z13;
        boolean zK3;
        Object objF2;
        C1086g c1086gP = interfaceC1084f.p(-2032877254);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                fVar2 = fVar;
                i12 |= c1086gP.K(fVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (c1086gP.k(pVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i15 != 0) {
                    fVar3 = new f(7);
                } else {
                    fVar3 = fVar2;
                }
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                bVarG = c1086gP.G();
                xI = J0.i(pVar, c1086gP);
                uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1
                    @Override // Ia.a
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                }, c1086gP, 3072, 6);
                zK = c1086gP.K(view) | c1086gP.K(cVar);
                Object objF3 = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (!zK || objF3 == c0153a) {
                    fVar4 = fVar3;
                    C1086g c1086g3 = c1086gP;
                    DialogWrapper dialogWrapper2 = new DialogWrapper(aVar, fVar4, view, layoutDirection, cVar, uuid);
                    z11 = true;
                    ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(true, 488261145, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AndroidDialog_androidKt.b(androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                                    @Override // Ia.l
                                    public final r invoke(w wVar) {
                                        Oa.l<Object>[] lVarArr = t.f15251a;
                                        v<r> vVar = SemanticsProperties.f15168v;
                                        r rVar = r.f47939a;
                                        wVar.e(vVar, rVar);
                                        return rVar;
                                    }
                                }), xI.getValue(), interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return r.f47939a;
                        }
                    });
                    e eVar = dialogWrapper2.f15800h;
                    eVar.setParentCompositionContext(bVarG);
                    eVar.f15827c.setValue(composableLambdaImpl);
                    eVar.f15831g = true;
                    eVar.createComposition();
                    c1086g3.E(dialogWrapper2);
                    c1086g2 = c1086g3;
                    obj = dialogWrapper2;
                } else {
                    fVar4 = fVar3;
                    c1086g2 = c1086gP;
                    z11 = true;
                    obj = objF3;
                }
                dialogWrapper = (DialogWrapper) obj;
                zK2 = c1086g2.k(dialogWrapper);
                objF = c1086g2.f();
                if (zK2 || objF == c0153a) {
                    objF = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            dialogWrapper.show();
                            return new a(dialogWrapper);
                        }
                    };
                    c1086g2.E(objF);
                }
                E.a(dialogWrapper, (Ia.l) objF, c1086g2);
                boolean zK4 = c1086g2.k(dialogWrapper);
                if ((i14 & 14) == 4) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z14 = zK4 | z12;
                if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zK3 = z14 | z13 | c1086g2.K(layoutDirection);
                objF2 = c1086g2.f();
                if (zK3 || objF2 == c0153a) {
                    objF2 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            dialogWrapper.e(aVar, fVar4, layoutDirection);
                            return r.f47939a;
                        }
                    };
                    c1086g2.E(objF2);
                }
                c1086g2.l((Ia.a) objF2);
                fVar2 = fVar4;
                c1086g = c1086g2;
            } else {
                C1086g c1086g4 = c1086gP;
                c1086g4.w();
                c1086g = c1086g4;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidDialog_androidKt.a(aVar, fVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        fVar2 = fVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (c1086gP.k(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i14 & 1, z10)) {
            if (i15 != 0) {
                fVar3 = new f(7);
            } else {
                fVar3 = fVar2;
            }
            view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            bVarG = c1086gP.G();
            xI = J0.i(pVar, c1086gP);
            uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1
                @Override // Ia.a
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, c1086gP, 3072, 6);
            zK = c1086gP.K(view) | c1086gP.K(cVar);
            Object objF4 = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (zK) {
                fVar4 = fVar3;
                C1086g c1086g5 = c1086gP;
                DialogWrapper dialogWrapper3 = new DialogWrapper(aVar, fVar4, view, layoutDirection, cVar, uuid);
                z11 = true;
                ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(true, 488261145, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            AndroidDialog_androidKt.b(androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                                @Override // Ia.l
                                public final r invoke(w wVar) {
                                    Oa.l<Object>[] lVarArr = t.f15251a;
                                    v<r> vVar = SemanticsProperties.f15168v;
                                    r rVar = r.f47939a;
                                    wVar.e(vVar, rVar);
                                    return rVar;
                                }
                            }), xI.getValue(), interfaceC1084f3, 0, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return r.f47939a;
                    }
                });
                e eVar2 = dialogWrapper3.f15800h;
                eVar2.setParentCompositionContext(bVarG);
                eVar2.f15827c.setValue(composableLambdaImpl2);
                eVar2.f15831g = true;
                eVar2.createComposition();
                c1086g5.E(dialogWrapper3);
                c1086g2 = c1086g5;
                obj = dialogWrapper3;
            } else {
                fVar4 = fVar3;
                C1086g c1086g6 = c1086gP;
                DialogWrapper dialogWrapper4 = new DialogWrapper(aVar, fVar4, view, layoutDirection, cVar, uuid);
                z11 = true;
                ComposableLambdaImpl composableLambdaImpl3 = new ComposableLambdaImpl(true, 488261145, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            AndroidDialog_androidKt.b(androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                                @Override // Ia.l
                                public final r invoke(w wVar) {
                                    Oa.l<Object>[] lVarArr = t.f15251a;
                                    v<r> vVar = SemanticsProperties.f15168v;
                                    r rVar = r.f47939a;
                                    wVar.e(vVar, rVar);
                                    return rVar;
                                }
                            }), xI.getValue(), interfaceC1084f3, 0, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return r.f47939a;
                    }
                });
                e eVar3 = dialogWrapper4.f15800h;
                eVar3.setParentCompositionContext(bVarG);
                eVar3.f15827c.setValue(composableLambdaImpl3);
                eVar3.f15831g = true;
                eVar3.createComposition();
                c1086g6.E(dialogWrapper4);
                c1086g2 = c1086g6;
                obj = dialogWrapper4;
            }
            dialogWrapper = (DialogWrapper) obj;
            zK2 = c1086g2.k(dialogWrapper);
            objF = c1086g2.f();
            if (zK2) {
                objF = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b10) {
                        dialogWrapper.show();
                        return new a(dialogWrapper);
                    }
                };
                c1086g2.E(objF);
            } else {
                objF = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b10) {
                        dialogWrapper.show();
                        return new a(dialogWrapper);
                    }
                };
                c1086g2.E(objF);
            }
            E.a(dialogWrapper, (Ia.l) objF, c1086g2);
            boolean zK5 = c1086g2.k(dialogWrapper);
            if ((i14 & 14) == 4) {
                z12 = z11;
            } else {
                z12 = false;
            }
            boolean z15 = zK5 | z12;
            if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z13 = z11;
            } else {
                z13 = false;
            }
            zK3 = z15 | z13 | c1086g2.K(layoutDirection);
            objF2 = c1086g2.f();
            if (zK3) {
                objF2 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        dialogWrapper.e(aVar, fVar4, layoutDirection);
                        return r.f47939a;
                    }
                };
                c1086g2.E(objF2);
            } else {
                objF2 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        dialogWrapper.e(aVar, fVar4, layoutDirection);
                        return r.f47939a;
                    }
                };
                c1086g2.E(objF2);
            }
            c1086g2.l((Ia.a) objF2);
            fVar2 = fVar4;
            c1086g = c1086g2;
        } else {
            C1086g c1086g7 = c1086gP;
            c1086g7.w();
            c1086g = c1086g7;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidDialog_androidKt.a(aVar, fVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.h hVar, final p pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if (c1086gP.C(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.f15782a;
            int i14 = ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 >> 3) & 14) | 384;
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            int i16 = ((i14 << 6) & 896) | 6;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, androidDialog_androidKt$DialogLayout$1);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C7.g.b((i16 >> 6) & 14, pVar, c1086gP, true);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidDialog_androidKt.b(hVar, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
