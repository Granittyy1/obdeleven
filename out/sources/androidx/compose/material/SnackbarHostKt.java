package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0901a;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.c0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.InterfaceC1103o0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InterfaceC1218f;
import java.util.ArrayList;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarHostKt {
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[LOOP:0: B:52:0x00b1->B:53:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc A[LOOP:1: B:58:0x00da->B:59:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[LOOP:2: B:74:0x0182->B:75:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final O o10, androidx.compose.ui.h hVar, final Ia.q<? super O, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.h hVar2;
        int i13;
        boolean z10;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        Object objF;
        final B b10;
        final String strK;
        boolean zA;
        ArrayList arrayList;
        boolean z11;
        int i14;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        C1105p0 c1105p0B;
        int size;
        int i15;
        ArrayList arrayList2;
        int size2;
        int i16;
        ArrayList arrayListP0;
        ArrayList arrayListA;
        int size3;
        int i17;
        C1086g c1086gP = interfaceC1084f.p(2036134589);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c1086gP.K(o10) : c1086gP.k(o10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (c1086gP.k(qVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new B();
                    c1086gP.E(objF);
                }
                b10 = (B) objF;
                strK = P3.d.k(c1086gP, 7);
                zA = kotlin.jvm.internal.i.a(o10, b10.f11682a);
                arrayList = b10.f11683b;
                if (zA) {
                    z11 = false;
                    c1086gP.L(1524617353);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1522020731);
                    b10.f11682a = o10;
                    arrayList2 = new ArrayList(arrayList.size());
                    size2 = arrayList.size();
                    for (i16 = 0; i16 < size2; i16++) {
                        arrayList2.add(((A) arrayList.get(i16)).f11655a);
                    }
                    arrayListP0 = kotlin.collections.q.p0(arrayList2);
                    if (!arrayListP0.contains(o10)) {
                        arrayListP0.add(o10);
                    }
                    arrayList.clear();
                    arrayListA = p039d0.a.a(arrayListP0);
                    size3 = arrayListA.size();
                    i17 = 0;
                    while (i17 < size3) {
                        final O o11 = (O) arrayListA.get(i17);
                        int i19 = size3;
                        final ArrayList arrayList3 = arrayListP0;
                        arrayList.add(new A(o11, androidx.compose.runtime.internal.a.b(1471040642, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.q
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar2, InterfaceC1084f interfaceC1084f2, Integer num) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar3 = pVar2;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.k(pVar3) ? 4 : 2;
                                }
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    final boolean zA2 = kotlin.jvm.internal.i.a(o11, o10);
                                    int i20 = zA2 ? 150 : 75;
                                    int i21 = (!zA2 || p039d0.a.a(arrayList3).size() == 1) ? 0 : 75;
                                    c0 c0Var = new c0(i20, i21, C0922w.f9638d);
                                    boolean zK = interfaceC1084f3.k(o11) | interfaceC1084f3.k(b10);
                                    final O o12 = o11;
                                    final B<O> b11 = b10;
                                    Object objF2 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                    if (zK || objF2 == c0153a) {
                                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                if (!kotlin.jvm.internal.i.a(o12, b11.f11682a)) {
                                                    ArrayList arrayList4 = b11.f11683b;
                                                    final O o13 = o12;
                                                    kotlin.collections.p.C(new Ia.l<A<O>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // Ia.l
                                                        public final Boolean invoke(A<O> a10) {
                                                            return Boolean.valueOf(kotlin.jvm.internal.i.a(a10.f11655a, o13));
                                                        }
                                                    }, arrayList4);
                                                    InterfaceC1103o0 interfaceC1103o0 = b11.f11684c;
                                                    if (interfaceC1103o0 != null) {
                                                        interfaceC1103o0.invalidate();
                                                    }
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    Ia.a aVar2 = (Ia.a) objF2;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (objF3 == c0153a) {
                                        objF3 = C0901a.a(!zA2 ? 1.0f : 0.0f);
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Animatable animatable = (Animatable) objF3;
                                    Boolean boolValueOf = Boolean.valueOf(zA2);
                                    boolean zK2 = interfaceC1084f3.k(animatable) | interfaceC1084f3.c(zA2) | interfaceC1084f3.k(c0Var) | interfaceC1084f3.K(aVar2);
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK2 || objF4 == c0153a) {
                                        SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, zA2, c0Var, aVar2, null);
                                        interfaceC1084f3.E(snackbarHostKt$animatedOpacity$2$1);
                                        objF4 = snackbarHostKt$animatedOpacity$2$1;
                                    }
                                    androidx.compose.runtime.E.d((Ia.p) objF4, interfaceC1084f3, boolValueOf);
                                    C0908h<T, V> c0908h = animatable.f9338c;
                                    c0 c0Var2 = new c0(i20, i21, C0922w.f9635a);
                                    Object objF5 = interfaceC1084f3.f();
                                    if (objF5 == c0153a) {
                                        objF5 = C0901a.a(zA2 ? 0.8f : 1.0f);
                                        interfaceC1084f3.E(objF5);
                                    }
                                    Animatable animatable2 = (Animatable) objF5;
                                    Boolean boolValueOf2 = Boolean.valueOf(zA2);
                                    boolean zK3 = interfaceC1084f3.k(animatable2) | interfaceC1084f3.c(zA2) | interfaceC1084f3.k(c0Var2);
                                    Object objF6 = interfaceC1084f3.f();
                                    if (zK3 || objF6 == c0153a) {
                                        objF6 = new SnackbarHostKt$animatedScale$1$1(animatable2, zA2, c0Var2, null);
                                        interfaceC1084f3.E(objF6);
                                    }
                                    androidx.compose.runtime.E.d((Ia.p) objF6, interfaceC1084f3, boolValueOf2);
                                    C0908h<T, V> c0908h2 = animatable2.f9338c;
                                    androidx.compose.ui.h hVarB = androidx.compose.ui.graphics.T.b(androidx.compose.ui.h.a.f13984b, ((Number) c0908h2.f9544c.getValue()).floatValue(), ((Number) c0908h2.f9544c.getValue()).floatValue(), ((Number) c0908h.f9544c.getValue()).floatValue(), 0.0f, 0.0f, null, false, 131064);
                                    boolean zC = interfaceC1084f3.c(zA2) | interfaceC1084f3.K(strK) | interfaceC1084f3.k(o11);
                                    final String str = strK;
                                    final O o13 = o11;
                                    Object objF7 = interfaceC1084f3.f();
                                    if (zC || objF7 == c0153a) {
                                        objF7 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                if (zA2) {
                                                    androidx.compose.ui.semantics.t.i(wVar2);
                                                }
                                                androidx.compose.ui.semantics.t.j(str, wVar2);
                                                final O o14 = o13;
                                                wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // Ia.a
                                                    public final Boolean invoke() {
                                                        o14.dismiss();
                                                        return Boolean.TRUE;
                                                    }
                                                }));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF7);
                                    }
                                    androidx.compose.ui.h hVarB2 = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF7);
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB2);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar3);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar4);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, iIntValue & 14);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP)));
                        i17++;
                        size3 = i19;
                        arrayListA = arrayListA;
                        arrayListP0 = arrayListP0;
                    }
                    z11 = false;
                    c1086gP.T(false);
                }
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, z11);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                c1105p0B = c1086gP.b();
                if (c1105p0B != null) {
                    throw new IllegalStateException("no recompose scope found");
                }
                c1086gP.B(c1105p0B);
                b10.f11684c = c1105p0B;
                c1086gP.L(1801449988);
                size = arrayList.size();
                for (i15 = 0; i15 < size; i15++) {
                    A a10 = (A) arrayList.get(i15);
                    final O o12 = a10.f11655a;
                    c1086gP.q(2123994112, o12);
                    a10.f11656b.invoke(androidx.compose.runtime.internal.a.b(2041982076, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Ia.q<O, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                O o13 = o12;
                                kotlin.jvm.internal.i.b(o13);
                                qVar2.invoke(o13, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 6);
                    c1086gP.T(false);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                hVar2 = hVar3;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarHostKt.a(o10, hVar2, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (c1086gP.k(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i18 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new B();
                c1086gP.E(objF);
            }
            b10 = (B) objF;
            strK = P3.d.k(c1086gP, 7);
            zA = kotlin.jvm.internal.i.a(o10, b10.f11682a);
            arrayList = b10.f11683b;
            if (zA) {
                c1086gP.L(1522020731);
                b10.f11682a = o10;
                arrayList2 = new ArrayList(arrayList.size());
                size2 = arrayList.size();
                while (i16 < size2) {
                    arrayList2.add(((A) arrayList.get(i16)).f11655a);
                }
                arrayListP0 = kotlin.collections.q.p0(arrayList2);
                if (!arrayListP0.contains(o10)) {
                    arrayListP0.add(o10);
                }
                arrayList.clear();
                arrayListA = p039d0.a.a(arrayListP0);
                size3 = arrayListA.size();
                i17 = 0;
                while (i17 < size3) {
                    final O o13 = (O) arrayListA.get(i17);
                    int i110 = size3;
                    final ArrayList arrayList4 = arrayListP0;
                    arrayList.add(new A(o13, androidx.compose.runtime.internal.a.b(1471040642, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar2, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar3 = pVar2;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar3) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final boolean zA2 = kotlin.jvm.internal.i.a(o13, o10);
                                int i20 = zA2 ? 150 : 75;
                                int i21 = (!zA2 || p039d0.a.a(arrayList4).size() == 1) ? 0 : 75;
                                c0 c0Var = new c0(i20, i21, C0922w.f9638d);
                                boolean zK = interfaceC1084f3.k(o13) | interfaceC1084f3.k(b10);
                                final O o14 = o13;
                                final B<O> b11 = b10;
                                Object objF2 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (zK || objF2 == c0153a) {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (!kotlin.jvm.internal.i.a(o14, b11.f11682a)) {
                                                ArrayList arrayList5 = b11.f11683b;
                                                final O o15 = o14;
                                                kotlin.collections.p.C(new Ia.l<A<O>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final Boolean invoke(A<O> a11) {
                                                        return Boolean.valueOf(kotlin.jvm.internal.i.a(a11.f11655a, o15));
                                                    }
                                                }, arrayList5);
                                                InterfaceC1103o0 interfaceC1103o0 = b11.f11684c;
                                                if (interfaceC1103o0 != null) {
                                                    interfaceC1103o0.invalidate();
                                                }
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                Ia.a aVar2 = (Ia.a) objF2;
                                Object objF3 = interfaceC1084f3.f();
                                if (objF3 == c0153a) {
                                    objF3 = C0901a.a(!zA2 ? 1.0f : 0.0f);
                                    interfaceC1084f3.E(objF3);
                                }
                                Animatable animatable = (Animatable) objF3;
                                Boolean boolValueOf = Boolean.valueOf(zA2);
                                boolean zK2 = interfaceC1084f3.k(animatable) | interfaceC1084f3.c(zA2) | interfaceC1084f3.k(c0Var) | interfaceC1084f3.K(aVar2);
                                Object objF4 = interfaceC1084f3.f();
                                if (zK2 || objF4 == c0153a) {
                                    SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, zA2, c0Var, aVar2, null);
                                    interfaceC1084f3.E(snackbarHostKt$animatedOpacity$2$1);
                                    objF4 = snackbarHostKt$animatedOpacity$2$1;
                                }
                                androidx.compose.runtime.E.d((Ia.p) objF4, interfaceC1084f3, boolValueOf);
                                C0908h<T, V> c0908h = animatable.f9338c;
                                c0 c0Var2 = new c0(i20, i21, C0922w.f9635a);
                                Object objF5 = interfaceC1084f3.f();
                                if (objF5 == c0153a) {
                                    objF5 = C0901a.a(zA2 ? 0.8f : 1.0f);
                                    interfaceC1084f3.E(objF5);
                                }
                                Animatable animatable2 = (Animatable) objF5;
                                Boolean boolValueOf2 = Boolean.valueOf(zA2);
                                boolean zK3 = interfaceC1084f3.k(animatable2) | interfaceC1084f3.c(zA2) | interfaceC1084f3.k(c0Var2);
                                Object objF6 = interfaceC1084f3.f();
                                if (zK3 || objF6 == c0153a) {
                                    objF6 = new SnackbarHostKt$animatedScale$1$1(animatable2, zA2, c0Var2, null);
                                    interfaceC1084f3.E(objF6);
                                }
                                androidx.compose.runtime.E.d((Ia.p) objF6, interfaceC1084f3, boolValueOf2);
                                C0908h<T, V> c0908h2 = animatable2.f9338c;
                                androidx.compose.ui.h hVarB = androidx.compose.ui.graphics.T.b(androidx.compose.ui.h.a.f13984b, ((Number) c0908h2.f9544c.getValue()).floatValue(), ((Number) c0908h2.f9544c.getValue()).floatValue(), ((Number) c0908h.f9544c.getValue()).floatValue(), 0.0f, 0.0f, null, false, 131064);
                                boolean zC = interfaceC1084f3.c(zA2) | interfaceC1084f3.K(strK) | interfaceC1084f3.k(o13);
                                final String str = strK;
                                final O o15 = o13;
                                Object objF7 = interfaceC1084f3.f();
                                if (zC || objF7 == c0153a) {
                                    objF7 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            if (zA2) {
                                                androidx.compose.ui.semantics.t.i(wVar2);
                                            }
                                            androidx.compose.ui.semantics.t.j(str, wVar2);
                                            final O o16 = o15;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    o16.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF7);
                                }
                                androidx.compose.ui.h hVarB2 = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF7);
                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarB2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD2);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar4);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC2);
                                androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, iIntValue & 14);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP)));
                    i17++;
                    size3 = i110;
                    arrayListA = arrayListA;
                    arrayListP0 = arrayListP0;
                }
                z11 = false;
                c1086gP.T(false);
            } else {
                z11 = false;
                c1086gP.L(1524617353);
                c1086gP.T(false);
            }
            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, z11);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            c1105p0B = c1086gP.b();
            if (c1105p0B != null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c1086gP.B(c1105p0B);
            b10.f11684c = c1105p0B;
            c1086gP.L(1801449988);
            size = arrayList.size();
            while (i15 < size) {
                A a11 = (A) arrayList.get(i15);
                final O o14 = a11.f11655a;
                c1086gP.q(2123994112, o14);
                a11.f11656b.invoke(androidx.compose.runtime.internal.a.b(2041982076, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Ia.q<O, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            O o15 = o14;
                            kotlin.jvm.internal.i.b(o15);
                            qVar2.invoke(o15, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 6);
                c1086gP.T(false);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            hVar2 = hVar3;
        } else {
            c1086gP.w();
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarHostKt.a(o10, hVar2, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x0047  */
    /* JADX WARN: Code duplicated, block: B:32:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    /* JADX WARN: Code duplicated, block: B:37:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0071  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void b(final P p10, androidx.compose.ui.h hVar, Ia.q<? super O, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final Ia.q<? super O, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        Ia.q<? super O, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        O o10;
        InterfaceC1218f interfaceC1218f;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(p10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.k(qVar)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 147) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        qVar3 = ComposableSingletons$SnackbarHostKt.f11711a;
                    } else {
                        qVar3 = qVar;
                    }
                    o10 = (O) p10.f11788a.getValue();
                    interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                    zK = c1086gP.k(o10) | c1086gP.k(interfaceC1218f);
                    objF = c1086gP.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                        c1086gP.E(objF);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, o10);
                    a((O) p10.f11788a.getValue(), hVar3, qVar3, c1086gP, i12 & 1008, 0);
                    hVar2 = hVar3;
                    qVar2 = qVar3;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    qVar2 = qVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarHostKt.b(p10, hVar2, qVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    qVar3 = ComposableSingletons$SnackbarHostKt.f11711a;
                } else {
                    qVar3 = qVar;
                }
                o10 = (O) p10.f11788a.getValue();
                interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                zK = c1086gP.k(o10) | c1086gP.k(interfaceC1218f);
                objF = c1086gP.f();
                if (zK) {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                    c1086gP.E(objF);
                } else {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, o10);
                a((O) p10.f11788a.getValue(), hVar3, qVar3, c1086gP, i12 & 1008, 0);
                hVar2 = hVar3;
                qVar2 = qVar3;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                qVar2 = qVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarHostKt.b(p10, hVar2, qVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.k(qVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    qVar3 = ComposableSingletons$SnackbarHostKt.f11711a;
                } else {
                    qVar3 = qVar;
                }
                o10 = (O) p10.f11788a.getValue();
                interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                zK = c1086gP.k(o10) | c1086gP.k(interfaceC1218f);
                objF = c1086gP.f();
                if (zK) {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                    c1086gP.E(objF);
                } else {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, o10);
                a((O) p10.f11788a.getValue(), hVar3, qVar3, c1086gP, i12 & 1008, 0);
                hVar2 = hVar3;
                qVar2 = qVar3;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                qVar2 = qVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarHostKt.b(p10, hVar2, qVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i15 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar;
            }
            if (i13 != 0) {
                qVar3 = ComposableSingletons$SnackbarHostKt.f11711a;
            } else {
                qVar3 = qVar;
            }
            o10 = (O) p10.f11788a.getValue();
            interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
            zK = c1086gP.k(o10) | c1086gP.k(interfaceC1218f);
            objF = c1086gP.f();
            if (zK) {
                objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                c1086gP.E(objF);
            } else {
                objF = new SnackbarHostKt$SnackbarHost$1$1(o10, interfaceC1218f, null);
                c1086gP.E(objF);
            }
            androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, o10);
            a((O) p10.f11788a.getValue(), hVar3, qVar3, c1086gP, i12 & 1008, 0);
            hVar2 = hVar3;
            qVar2 = qVar3;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            qVar2 = qVar;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarHostKt.b(p10, hVar2, qVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
