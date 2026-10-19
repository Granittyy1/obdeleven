package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0901a;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0922w;
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
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6 A[LOOP:0: B:49:0x00a4->B:50:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf A[LOOP:1: B:55:0x00cd->B:56:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152 A[LOOP:2: B:69:0x0150->B:70:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x019a  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
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
    public static final void a(final f0 f0Var, androidx.compose.ui.h hVar, final Ia.q<? super f0, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        final androidx.compose.ui.h hVar3;
        Object objF;
        final H h8;
        boolean zA;
        ArrayList arrayList;
        int i14;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        C1105p0 c1105p0B;
        int size;
        int i15;
        ArrayList arrayList2;
        int size2;
        int i16;
        final ArrayList arrayListP0;
        ArrayList arrayListA;
        int size3;
        int i17;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1316639904);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(f0Var) ? 4 : 2) | i10;
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
            if ((i12 & 147) == 146 || !c1086gP.s()) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new H();
                    c1086gP.E(objF);
                }
                h8 = (H) objF;
                c1086gP.L(-1256811491);
                zA = kotlin.jvm.internal.i.a(f0Var, h8.f12182a);
                arrayList = h8.f12183b;
                if (!zA) {
                    h8.f12182a = f0Var;
                    arrayList2 = new ArrayList(arrayList.size());
                    size2 = arrayList.size();
                    for (i16 = 0; i16 < size2; i16++) {
                        arrayList2.add(((G) arrayList.get(i16)).f12180a);
                    }
                    arrayListP0 = kotlin.collections.q.p0(arrayList2);
                    if (!arrayListP0.contains(f0Var)) {
                        arrayListP0.add(f0Var);
                    }
                    arrayList.clear();
                    arrayListA = p039d0.a.a(arrayListP0);
                    size3 = arrayListA.size();
                    for (i17 = 0; i17 < size3; i17++) {
                        final f0 f0Var2 = (f0) arrayListA.get(i17);
                        arrayList.add(new G(f0Var2, androidx.compose.runtime.internal.a.b(-1654683077, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
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
                                if ((iIntValue & 19) == 18 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    boolean zA2 = kotlin.jvm.internal.i.a(f0Var2, f0Var);
                                    int i19 = zA2 ? 150 : 75;
                                    int i20 = (!zA2 || p039d0.a.a(arrayListP0).size() == 1) ? 0 : 75;
                                    androidx.compose.animation.core.c0 c0Var = new androidx.compose.animation.core.c0(i19, i20, C0922w.f9638d);
                                    boolean zK = interfaceC1084f3.K(f0Var2) | interfaceC1084f3.k(h8);
                                    final f0 f0Var3 = f0Var2;
                                    final H<f0> h10 = h8;
                                    Object objF2 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                    if (zK || objF2 == c0153a) {
                                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                if (!kotlin.jvm.internal.i.a(f0Var3, h10.f12182a)) {
                                                    ArrayList arrayList3 = h10.f12183b;
                                                    final f0 f0Var4 = f0Var3;
                                                    kotlin.collections.p.C(new Ia.l<G<f0>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // Ia.l
                                                        public final Boolean invoke(G<f0> g10) {
                                                            return Boolean.valueOf(kotlin.jvm.internal.i.a(g10.f12180a, f0Var4));
                                                        }
                                                    }, arrayList3);
                                                    InterfaceC1103o0 interfaceC1103o0 = h10.f12184c;
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
                                    androidx.compose.animation.core.c0 c0Var2 = new androidx.compose.animation.core.c0(i19, i20, C0922w.f9635a);
                                    Object objF5 = interfaceC1084f3.f();
                                    if (objF5 == c0153a) {
                                        objF5 = C0901a.a(!zA2 ? 1.0f : 0.8f);
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
                                    boolean zK4 = interfaceC1084f3.K(f0Var2);
                                    final f0 f0Var4 = f0Var2;
                                    Object objF7 = interfaceC1084f3.f();
                                    if (zK4 || objF7 == c0153a) {
                                        objF7 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                androidx.compose.ui.semantics.t.i(wVar2);
                                                final f0 f0Var5 = f0Var4;
                                                wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // Ia.a
                                                    public final Boolean invoke() {
                                                        f0Var5.dismiss();
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
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP)));
                    }
                }
                c1086gP.T(false);
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
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
                if (c1105p0B == null) {
                    throw new IllegalStateException("no recompose scope found");
                }
                c1086gP.B(c1105p0B);
                h8.f12184c = c1105p0B;
                c1086gP.L(1748085441);
                size = arrayList.size();
                for (i15 = 0; i15 < size; i15++) {
                    G g10 = (G) arrayList.get(i15);
                    final f0 f0Var3 = g10.f12180a;
                    c1086gP.q(1201076541, f0Var3);
                    g10.f12181b.invoke(androidx.compose.runtime.internal.a.b(-1135367807, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                Ia.q<f0, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                f0 f0Var4 = f0Var3;
                                kotlin.jvm.internal.i.b(f0Var4);
                                qVar2.invoke(f0Var4, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 6);
                    c1086gP.T(false);
                }
                c1086gP.T(false);
                c1086gP.T(true);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarHostKt.a(f0Var, hVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
        if ((i12 & 147) == 146) {
            if (i18 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new H();
                c1086gP.E(objF);
            }
            h8 = (H) objF;
            c1086gP.L(-1256811491);
            zA = kotlin.jvm.internal.i.a(f0Var, h8.f12182a);
            arrayList = h8.f12183b;
            if (!zA) {
                h8.f12182a = f0Var;
                arrayList2 = new ArrayList(arrayList.size());
                size2 = arrayList.size();
                while (i16 < size2) {
                    arrayList2.add(((G) arrayList.get(i16)).f12180a);
                }
                arrayListP0 = kotlin.collections.q.p0(arrayList2);
                if (!arrayListP0.contains(f0Var)) {
                    arrayListP0.add(f0Var);
                }
                arrayList.clear();
                arrayListA = p039d0.a.a(arrayListP0);
                size3 = arrayListA.size();
                while (i17 < size3) {
                    final f0 f0Var4 = (f0) arrayListA.get(i17);
                    arrayList.add(new G(f0Var4, androidx.compose.runtime.internal.a.b(-1654683077, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
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
                            if ((iIntValue & 19) == 18 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                boolean zA2 = kotlin.jvm.internal.i.a(f0Var4, f0Var);
                                int i19 = zA2 ? 150 : 75;
                                int i20 = (!zA2 || p039d0.a.a(arrayListP0).size() == 1) ? 0 : 75;
                                androidx.compose.animation.core.c0 c0Var = new androidx.compose.animation.core.c0(i19, i20, C0922w.f9638d);
                                boolean zK = interfaceC1084f3.K(f0Var4) | interfaceC1084f3.k(h8);
                                final f0 f0Var5 = f0Var4;
                                final H<f0> h10 = h8;
                                Object objF2 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (zK || objF2 == c0153a) {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (!kotlin.jvm.internal.i.a(f0Var5, h10.f12182a)) {
                                                ArrayList arrayList3 = h10.f12183b;
                                                final f0 f0Var6 = f0Var5;
                                                kotlin.collections.p.C(new Ia.l<G<f0>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final Boolean invoke(G<f0> g11) {
                                                        return Boolean.valueOf(kotlin.jvm.internal.i.a(g11.f12180a, f0Var6));
                                                    }
                                                }, arrayList3);
                                                InterfaceC1103o0 interfaceC1103o0 = h10.f12184c;
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
                                androidx.compose.animation.core.c0 c0Var2 = new androidx.compose.animation.core.c0(i19, i20, C0922w.f9635a);
                                Object objF5 = interfaceC1084f3.f();
                                if (objF5 == c0153a) {
                                    objF5 = C0901a.a(!zA2 ? 1.0f : 0.8f);
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
                                boolean zK4 = interfaceC1084f3.K(f0Var4);
                                final f0 f0Var6 = f0Var4;
                                Object objF7 = interfaceC1084f3.f();
                                if (zK4 || objF7 == c0153a) {
                                    objF7 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.i(wVar2);
                                            final f0 f0Var7 = f0Var6;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    f0Var7.dismiss();
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
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP)));
                }
            }
            c1086gP.T(false);
            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
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
            if (c1105p0B == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c1086gP.B(c1105p0B);
            h8.f12184c = c1105p0B;
            c1086gP.L(1748085441);
            size = arrayList.size();
            while (i15 < size) {
                G g11 = (G) arrayList.get(i15);
                final f0 f0Var5 = g11.f12180a;
                c1086gP.q(1201076541, f0Var5);
                g11.f12181b.invoke(androidx.compose.runtime.internal.a.b(-1135367807, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            Ia.q<f0, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            f0 f0Var6 = f0Var5;
                            kotlin.jvm.internal.i.b(f0Var6);
                            qVar2.invoke(f0Var6, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 6);
                c1086gP.T(false);
            }
            c1086gP.T(false);
            c1086gP.T(true);
        } else {
            if (i18 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new H();
                c1086gP.E(objF);
            }
            h8 = (H) objF;
            c1086gP.L(-1256811491);
            zA = kotlin.jvm.internal.i.a(f0Var, h8.f12182a);
            arrayList = h8.f12183b;
            if (!zA) {
                h8.f12182a = f0Var;
                arrayList2 = new ArrayList(arrayList.size());
                size2 = arrayList.size();
                while (i16 < size2) {
                    arrayList2.add(((G) arrayList.get(i16)).f12180a);
                }
                arrayListP0 = kotlin.collections.q.p0(arrayList2);
                if (!arrayListP0.contains(f0Var)) {
                    arrayListP0.add(f0Var);
                }
                arrayList.clear();
                arrayListA = p039d0.a.a(arrayListP0);
                size3 = arrayListA.size();
                while (i17 < size3) {
                    final f0 f0Var6 = (f0) arrayListA.get(i17);
                    arrayList.add(new G(f0Var6, androidx.compose.runtime.internal.a.b(-1654683077, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
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
                            if ((iIntValue & 19) == 18 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                boolean zA2 = kotlin.jvm.internal.i.a(f0Var6, f0Var);
                                int i19 = zA2 ? 150 : 75;
                                int i20 = (!zA2 || p039d0.a.a(arrayListP0).size() == 1) ? 0 : 75;
                                androidx.compose.animation.core.c0 c0Var = new androidx.compose.animation.core.c0(i19, i20, C0922w.f9638d);
                                boolean zK = interfaceC1084f3.K(f0Var6) | interfaceC1084f3.k(h8);
                                final f0 f0Var7 = f0Var6;
                                final H<f0> h10 = h8;
                                Object objF2 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (zK || objF2 == c0153a) {
                                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            if (!kotlin.jvm.internal.i.a(f0Var7, h10.f12182a)) {
                                                ArrayList arrayList3 = h10.f12183b;
                                                final f0 f0Var8 = f0Var7;
                                                kotlin.collections.p.C(new Ia.l<G<f0>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final Boolean invoke(G<f0> g12) {
                                                        return Boolean.valueOf(kotlin.jvm.internal.i.a(g12.f12180a, f0Var8));
                                                    }
                                                }, arrayList3);
                                                InterfaceC1103o0 interfaceC1103o0 = h10.f12184c;
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
                                androidx.compose.animation.core.c0 c0Var2 = new androidx.compose.animation.core.c0(i19, i20, C0922w.f9635a);
                                Object objF5 = interfaceC1084f3.f();
                                if (objF5 == c0153a) {
                                    objF5 = C0901a.a(!zA2 ? 1.0f : 0.8f);
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
                                boolean zK4 = interfaceC1084f3.K(f0Var6);
                                final f0 f0Var8 = f0Var6;
                                Object objF7 = interfaceC1084f3.f();
                                if (zK4 || objF7 == c0153a) {
                                    objF7 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.i(wVar2);
                                            final f0 f0Var9 = f0Var8;
                                            wVar2.e(androidx.compose.ui.semantics.k.f15228u, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    f0Var9.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF7);
                                }
                                androidx.compose.ui.h hVarB2 = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF7);
                                androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarB2);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD3);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar4);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC3);
                                androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f3, iIntValue & 14);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP)));
                }
            }
            c1086gP.T(false);
            androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            c1105p0B = c1086gP.b();
            if (c1105p0B == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c1086gP.B(c1105p0B);
            h8.f12184c = c1105p0B;
            c1086gP.L(1748085441);
            size = arrayList.size();
            while (i15 < size) {
                G g12 = (G) arrayList.get(i15);
                final f0 f0Var7 = g12.f12180a;
                c1086gP.q(1201076541, f0Var7);
                g12.f12181b.invoke(androidx.compose.runtime.internal.a.b(-1135367807, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            Ia.q<f0, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            f0 f0Var8 = f0Var7;
                            kotlin.jvm.internal.i.b(f0Var8);
                            qVar2.invoke(f0Var8, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 6);
                c1086gP.T(false);
            }
            c1086gP.T(false);
            c1086gP.T(true);
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarHostKt.a(f0Var, hVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
    /* JADX WARN: Code duplicated, block: B:41:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void b(final g0 g0Var, androidx.compose.ui.h hVar, Ia.q<? super f0, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.ui.h hVar2;
        Ia.q<? super f0, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2;
        f0 f0Var;
        InterfaceC1218f interfaceC1218f;
        boolean zK;
        Object objF;
        final androidx.compose.ui.h hVar3;
        final Ia.q<? super f0, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(464178177);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(g0Var) ? 4 : 2) | i10;
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
                if ((i12 & 147) == 146 || !c1086gP.s()) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
                    } else {
                        qVar2 = qVar;
                    }
                    f0Var = (f0) g0Var.f12455b.getValue();
                    interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                    zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
                    objF = c1086gP.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                        c1086gP.E(objF);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
                    a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
                    hVar3 = hVar2;
                    qVar3 = qVar2;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    qVar3 = qVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarHostKt.b(g0Var, hVar3, qVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i12 & 147) == 146) {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
                } else {
                    qVar2 = qVar;
                }
                f0Var = (f0) g0Var.f12455b.getValue();
                interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
                objF = c1086gP.f();
                if (zK) {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                } else {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
                a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
                hVar3 = hVar2;
                qVar3 = qVar2;
            } else {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
                } else {
                    qVar2 = qVar;
                }
                f0Var = (f0) g0Var.f12455b.getValue();
                interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
                objF = c1086gP.f();
                if (zK) {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                } else {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
                a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
                hVar3 = hVar2;
                qVar3 = qVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarHostKt.b(g0Var, hVar3, qVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
            if ((i12 & 147) == 146) {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
                } else {
                    qVar2 = qVar;
                }
                f0Var = (f0) g0Var.f12455b.getValue();
                interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
                objF = c1086gP.f();
                if (zK) {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                } else {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
                a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
                hVar3 = hVar2;
                qVar3 = qVar2;
            } else {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
                } else {
                    qVar2 = qVar;
                }
                f0Var = (f0) g0Var.f12455b.getValue();
                interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
                zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
                objF = c1086gP.f();
                if (zK) {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                } else {
                    objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
                a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
                hVar3 = hVar2;
                qVar3 = qVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarHostKt.b(g0Var, hVar3, qVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i12 & 147) == 146) {
            if (i15 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i13 != 0) {
                qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
            } else {
                qVar2 = qVar;
            }
            f0Var = (f0) g0Var.f12455b.getValue();
            interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
            zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
            objF = c1086gP.f();
            if (zK) {
                objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                c1086gP.E(objF);
            } else {
                objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                c1086gP.E(objF);
            }
            androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
            a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
            hVar3 = hVar2;
            qVar3 = qVar2;
        } else {
            if (i15 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i13 != 0) {
                qVar2 = ComposableSingletons$SnackbarHostKt.f12117a;
            } else {
                qVar2 = qVar;
            }
            f0Var = (f0) g0Var.f12455b.getValue();
            interfaceC1218f = (InterfaceC1218f) c1086gP.x(CompositionLocalsKt.f14840a);
            zK = c1086gP.K(f0Var) | c1086gP.k(interfaceC1218f);
            objF = c1086gP.f();
            if (zK) {
                objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                c1086gP.E(objF);
            } else {
                objF = new SnackbarHostKt$SnackbarHost$1$1(f0Var, interfaceC1218f, null);
                c1086gP.E(objF);
            }
            androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, f0Var);
            a((f0) g0Var.f12455b.getValue(), hVar2, qVar2, c1086gP, i12 & 1008, 0);
            hVar3 = hVar2;
            qVar3 = qVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarHostKt.b(g0Var, hVar3, qVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
