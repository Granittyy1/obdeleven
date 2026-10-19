package androidx.compose.animation;

import androidx.collection.K;
import androidx.collection.U;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.ListIterator;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0184 A[LOOP:0: B:97:0x0163->B:102:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x018b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4 A[LOOP:1: B:108:0x01a2->B:109:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x020a  */
    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0235  */
    /* JADX WARN: Code duplicated, block: B:127:0x023f  */
    /* JADX WARN: Code duplicated, block: B:131:0x025e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0269  */
    /* JADX WARN: Code duplicated, block: B:136:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0189 A[EDGE_INSN: B:137:0x0189->B:104:0x0189 BREAK  A[LOOP:0: B:97:0x0163->B:102:0x0184], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x0158  */
    /* JADX WARN: Code duplicated, block: B:99:0x016d  */
    public static final <T> void a(final Transition<T> transition, androidx.compose.ui.h hVar, InterfaceC0923x<Float> interfaceC0923x, Ia.l<? super T, ? extends Object> lVar, final Ia.q<? super T, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        final InterfaceC0923x<Float> interfaceC0923xD;
        int i14;
        int i15;
        Ia.l<? super T, ? extends Object> lVar2;
        int i16;
        int i17;
        boolean z10;
        final androidx.compose.ui.h hVar3;
        final InterfaceC0923x<Float> interfaceC0923x2;
        final Ia.l<? super T, ? extends Object> lVar3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        Object objF;
        Object obj;
        Object obj2;
        SnapshotStateList snapshotStateList;
        Object objF2;
        K k10;
        T tA;
        C1085f0 c1085f0;
        int i18;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        int size;
        int i19;
        Ia.p pVar2;
        ListIterator<T> listIterator;
        int i20;
        androidx.compose.runtime.snapshots.n nVar;
        int size2;
        int i21;
        boolean z11;
        Object obj3;
        C1086g c1086gP = interfaceC1084f.p(679005231);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(transition) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 1;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    interfaceC0923xD = interfaceC0923x;
                    if (c1086gP.k(interfaceC0923xD)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 4;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        lVar2 = lVar;
                        if (c1086gP.k(lVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 8) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c1086gP.k(qVar)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i22 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            interfaceC0923xD = C0907g.d(0, 0, null, 7);
                        }
                        if (i15 != 0) {
                            lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                                @Override // Ia.l
                                public final T invoke(T t8) {
                                    return t8;
                                }
                            };
                        }
                        objF = c1086gP.f();
                        obj = InterfaceC1084f.a.f12980a;
                        obj2 = objF;
                        if (objF == obj) {
                            SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                            snapshotStateList2.add(transition.f9429a.a());
                            c1086gP.E(snapshotStateList2);
                            obj2 = snapshotStateList2;
                        }
                        snapshotStateList = (SnapshotStateList) obj2;
                        objF2 = c1086gP.f();
                        if (objF2 == obj) {
                            objF2 = U.b();
                            c1086gP.E(objF2);
                        }
                        k10 = (K) objF2;
                        tA = transition.f9429a.a();
                        c1085f0 = transition.f9432d;
                        if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                            c1086gP.L(860925177);
                            if (snapshotStateList.size() == 1 || !kotlin.jvm.internal.i.a(snapshotStateList.get(0), c1085f0.getValue())) {
                                c1086gP.L(861059531);
                                if ((i12 & 14) == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                                if (z11 || obj3 == obj) {
                                    obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final Boolean invoke(Object obj4) {
                                            return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj4, transition.f9432d.getValue()));
                                        }
                                    };
                                    c1086gP.E(obj3);
                                }
                                kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                                k10.f();
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(861249809);
                                c1086gP.T(false);
                            }
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(861255761);
                            c1086gP.T(false);
                        }
                        if (k10.a(c1085f0.getValue())) {
                            c1086gP.L(862059281);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(861316428);
                            listIterator = snapshotStateList.listIterator();
                            i20 = 0;
                            while (true) {
                                nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                                if (nVar.hasNext()) {
                                    i20 = -1;
                                    break;
                                } else if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                    break;
                                } else {
                                    i20++;
                                }
                            }
                            if (i20 == -1) {
                                snapshotStateList.add(c1085f0.getValue());
                            } else {
                                snapshotStateList.set(i20, c1085f0.getValue());
                            }
                            k10.f();
                            size2 = snapshotStateList.size();
                            for (i21 = 0; i21 < size2; i21++) {
                                final Object obj4 = snapshotStateList.get(i21);
                                k10.l(obj4, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
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
                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        int iIntValue = num.intValue();
                                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            Transition<T> transition2 = transition;
                                            final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                            Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // Ia.q
                                                public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                    num2.intValue();
                                                    interfaceC1084f5.L(438406499);
                                                    InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                                    interfaceC1084f5.D();
                                                    return interfaceC0923x4;
                                                }
                                            };
                                            T t8 = obj4;
                                            e0 e0Var = VectorConvertersKt.f9477a;
                                            Object objA = transition2.f9429a.a();
                                            interfaceC1084f3.L(-438678252);
                                            float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                            interfaceC1084f3.D();
                                            Float fValueOf = Float.valueOf(f10);
                                            T value = transition2.f9432d.getValue();
                                            interfaceC1084f3.L(-438678252);
                                            float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                            interfaceC1084f3.D();
                                            final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                            boolean zK = interfaceC1084f3.K(dVarD);
                                            Object objF3 = interfaceC1084f3.f();
                                            if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                                objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                        u10.b(dVarD.getValue().floatValue());
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                interfaceC1084f3.E(objF3);
                                            }
                                            androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                            Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                            T t10 = obj4;
                                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF = interfaceC1084f3.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                                k.b(iF, interfaceC1084f3, iF, pVar3);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                            qVar3.invoke(t10, interfaceC1084f3, 0);
                                            interfaceC1084f3.J();
                                        } else {
                                            interfaceC1084f3.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP));
                            }
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i18 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar4);
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
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i18))) {
                            J4.i.d(i18, c1086gP, i18, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                        c1086gP.L(-187474512);
                        size = snapshotStateList.size();
                        for (i19 = 0; i19 < size; i19++) {
                            A1.B b10 = (Object) snapshotStateList.get(i19);
                            c1086gP.q(-1081865889, lVar2.invoke(b10));
                            pVar2 = (Ia.p) k10.d(b10);
                            if (pVar2 == null) {
                                c1086gP.L(821932266);
                            } else {
                                c1086gP.L(-1081864713);
                                pVar2.invoke(c1086gP, 0);
                            }
                            c1086gP.T(false);
                            c1086gP.T(false);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        hVar3 = hVar4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                    }
                    interfaceC0923x2 = interfaceC0923xD;
                    lVar3 = lVar2;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                lVar2 = lVar;
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i22 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        interfaceC0923xD = C0907g.d(0, 0, null, 7);
                    }
                    if (i15 != 0) {
                        lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                            @Override // Ia.l
                            public final T invoke(T t8) {
                                return t8;
                            }
                        };
                    }
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    obj2 = objF;
                    if (objF == obj) {
                        SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                        snapshotStateList3.add(transition.f9429a.a());
                        c1086gP.E(snapshotStateList3);
                        obj2 = snapshotStateList3;
                    }
                    snapshotStateList = (SnapshotStateList) obj2;
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = U.b();
                        c1086gP.E(objF2);
                    }
                    k10 = (K) objF2;
                    tA = transition.f9429a.a();
                    c1085f0 = transition.f9432d;
                    if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                        c1086gP.L(860925177);
                        if (snapshotStateList.size() == 1) {
                            c1086gP.L(861059531);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                            if (z11) {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj5) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj5, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            } else {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj5) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj5, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            }
                            kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                            k10.f();
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(861059531);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                            if (z11) {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj5) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj5, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            } else {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj5) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj5, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            }
                            kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                            k10.f();
                            c1086gP.T(false);
                        }
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(861255761);
                        c1086gP.T(false);
                    }
                    if (k10.a(c1085f0.getValue())) {
                        c1086gP.L(861316428);
                        listIterator = snapshotStateList.listIterator();
                        i20 = 0;
                        while (true) {
                            nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                            if (nVar.hasNext()) {
                                i20 = -1;
                                break;
                            } else {
                                if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                    break;
                                    break;
                                }
                                i20++;
                            }
                        }
                        if (i20 == -1) {
                            snapshotStateList.add(c1085f0.getValue());
                        } else {
                            snapshotStateList.set(i20, c1085f0.getValue());
                        }
                        k10.f();
                        size2 = snapshotStateList.size();
                        while (i21 < size2) {
                            final T obj5 = snapshotStateList.get(i21);
                            k10.l(obj5, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
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
                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        Transition<T> transition2 = transition;
                                        final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                        Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // Ia.q
                                            public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                num2.intValue();
                                                interfaceC1084f5.L(438406499);
                                                InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                                interfaceC1084f5.D();
                                                return interfaceC0923x4;
                                            }
                                        };
                                        T t8 = obj5;
                                        e0 e0Var = VectorConvertersKt.f9477a;
                                        Object objA = transition2.f9429a.a();
                                        interfaceC1084f3.L(-438678252);
                                        float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                        interfaceC1084f3.D();
                                        Float fValueOf = Float.valueOf(f10);
                                        T value = transition2.f9432d.getValue();
                                        interfaceC1084f3.L(-438678252);
                                        float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                        interfaceC1084f3.D();
                                        final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                        boolean zK = interfaceC1084f3.K(dVarD);
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                    u10.b(dVarD.getValue().floatValue());
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                        Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                        T t10 = obj5;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            k.b(iF, interfaceC1084f3, iF, pVar3);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC2);
                                        qVar3.invoke(t10, interfaceC1084f3, 0);
                                        interfaceC1084f3.J();
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP));
                        }
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(862059281);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i18 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVar4);
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
                        J4.i.d(i18, c1086gP, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086gP, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                    c1086gP.L(-187474512);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        A1.B b11 = (Object) snapshotStateList.get(i19);
                        c1086gP.q(-1081865889, lVar2.invoke(b11));
                        pVar2 = (Ia.p) k10.d(b11);
                        if (pVar2 == null) {
                            c1086gP.L(821932266);
                        } else {
                            c1086gP.L(-1081864713);
                            pVar2.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(false);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    hVar3 = hVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                }
                interfaceC0923x2 = interfaceC0923xD;
                lVar3 = lVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            interfaceC0923xD = interfaceC0923x;
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.k(lVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i22 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        interfaceC0923xD = C0907g.d(0, 0, null, 7);
                    }
                    if (i15 != 0) {
                        lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                            @Override // Ia.l
                            public final T invoke(T t8) {
                                return t8;
                            }
                        };
                    }
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    obj2 = objF;
                    if (objF == obj) {
                        SnapshotStateList snapshotStateList4 = new SnapshotStateList();
                        snapshotStateList4.add(transition.f9429a.a());
                        c1086gP.E(snapshotStateList4);
                        obj2 = snapshotStateList4;
                    }
                    snapshotStateList = (SnapshotStateList) obj2;
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = U.b();
                        c1086gP.E(objF2);
                    }
                    k10 = (K) objF2;
                    tA = transition.f9429a.a();
                    c1085f0 = transition.f9432d;
                    if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                        c1086gP.L(860925177);
                        if (snapshotStateList.size() == 1) {
                            c1086gP.L(861059531);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                            if (z11) {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj6) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj6, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            } else {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj6) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj6, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            }
                            kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                            k10.f();
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(861059531);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                            if (z11) {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj6) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj6, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            } else {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj6) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj6, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            }
                            kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                            k10.f();
                            c1086gP.T(false);
                        }
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(861255761);
                        c1086gP.T(false);
                    }
                    if (k10.a(c1085f0.getValue())) {
                        c1086gP.L(861316428);
                        listIterator = snapshotStateList.listIterator();
                        i20 = 0;
                        while (true) {
                            nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                            if (nVar.hasNext()) {
                                i20 = -1;
                                break;
                            } else {
                                if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                    break;
                                    break;
                                }
                                i20++;
                            }
                        }
                        if (i20 == -1) {
                            snapshotStateList.add(c1085f0.getValue());
                        } else {
                            snapshotStateList.set(i20, c1085f0.getValue());
                        }
                        k10.f();
                        size2 = snapshotStateList.size();
                        while (i21 < size2) {
                            final T obj6 = snapshotStateList.get(i21);
                            k10.l(obj6, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
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
                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        Transition<T> transition2 = transition;
                                        final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                        Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // Ia.q
                                            public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                num2.intValue();
                                                interfaceC1084f5.L(438406499);
                                                InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                                interfaceC1084f5.D();
                                                return interfaceC0923x4;
                                            }
                                        };
                                        T t8 = obj6;
                                        e0 e0Var = VectorConvertersKt.f9477a;
                                        Object objA = transition2.f9429a.a();
                                        interfaceC1084f3.L(-438678252);
                                        float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                        interfaceC1084f3.D();
                                        Float fValueOf = Float.valueOf(f10);
                                        T value = transition2.f9432d.getValue();
                                        interfaceC1084f3.L(-438678252);
                                        float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                        interfaceC1084f3.D();
                                        final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                        boolean zK = interfaceC1084f3.K(dVarD);
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                    u10.b(dVarD.getValue().floatValue());
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                        Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                        T t10 = obj6;
                                        androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            k.b(iF, interfaceC1084f3, iF, pVar3);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC3);
                                        qVar3.invoke(t10, interfaceC1084f3, 0);
                                        interfaceC1084f3.J();
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP));
                        }
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(862059281);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i18 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar4);
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
                        J4.i.d(i18, c1086gP, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086gP, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                    c1086gP.L(-187474512);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        A1.B b12 = (Object) snapshotStateList.get(i19);
                        c1086gP.q(-1081865889, lVar2.invoke(b12));
                        pVar2 = (Ia.p) k10.d(b12);
                        if (pVar2 == null) {
                            c1086gP.L(821932266);
                        } else {
                            c1086gP.L(-1081864713);
                            pVar2.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(false);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    hVar3 = hVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                }
                interfaceC0923x2 = interfaceC0923xD;
                lVar3 = lVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            lVar2 = lVar;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i22 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    interfaceC0923xD = C0907g.d(0, 0, null, 7);
                }
                if (i15 != 0) {
                    lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // Ia.l
                        public final T invoke(T t8) {
                            return t8;
                        }
                    };
                }
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                obj2 = objF;
                if (objF == obj) {
                    SnapshotStateList snapshotStateList5 = new SnapshotStateList();
                    snapshotStateList5.add(transition.f9429a.a());
                    c1086gP.E(snapshotStateList5);
                    obj2 = snapshotStateList5;
                }
                snapshotStateList = (SnapshotStateList) obj2;
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = U.b();
                    c1086gP.E(objF2);
                }
                k10 = (K) objF2;
                tA = transition.f9429a.a();
                c1085f0 = transition.f9432d;
                if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                    c1086gP.L(860925177);
                    if (snapshotStateList.size() == 1) {
                        c1086gP.L(861059531);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                        if (z11) {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj7) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj7, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        } else {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj7) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj7, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        }
                        kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                        k10.f();
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(861059531);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                        if (z11) {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj7) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj7, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        } else {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj7) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj7, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        }
                        kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                        k10.f();
                        c1086gP.T(false);
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.L(861255761);
                    c1086gP.T(false);
                }
                if (k10.a(c1085f0.getValue())) {
                    c1086gP.L(861316428);
                    listIterator = snapshotStateList.listIterator();
                    i20 = 0;
                    while (true) {
                        nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                        if (nVar.hasNext()) {
                            i20 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                break;
                                break;
                            }
                            i20++;
                        }
                    }
                    if (i20 == -1) {
                        snapshotStateList.add(c1085f0.getValue());
                    } else {
                        snapshotStateList.set(i20, c1085f0.getValue());
                    }
                    k10.f();
                    size2 = snapshotStateList.size();
                    while (i21 < size2) {
                        final T obj7 = snapshotStateList.get(i21);
                        k10.l(obj7, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
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
                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Transition<T> transition2 = transition;
                                    final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                    Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            num2.intValue();
                                            interfaceC1084f5.L(438406499);
                                            InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                            interfaceC1084f5.D();
                                            return interfaceC0923x4;
                                        }
                                    };
                                    T t8 = obj7;
                                    e0 e0Var = VectorConvertersKt.f9477a;
                                    Object objA = transition2.f9429a.a();
                                    interfaceC1084f3.L(-438678252);
                                    float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                    interfaceC1084f3.D();
                                    Float fValueOf = Float.valueOf(f10);
                                    T value = transition2.f9432d.getValue();
                                    interfaceC1084f3.L(-438678252);
                                    float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                    interfaceC1084f3.D();
                                    final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    boolean zK = interfaceC1084f3.K(dVarD);
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                u10.b(dVarD.getValue().floatValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                    Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                    T t10 = obj7;
                                    androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD4);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC4);
                                    qVar3.invoke(t10, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP));
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.L(862059281);
                    c1086gP.T(false);
                }
                androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i18, c1086gP, i18, pVar);
                } else {
                    J4.i.d(i18, c1086gP, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                c1086gP.L(-187474512);
                size = snapshotStateList.size();
                while (i19 < size) {
                    A1.B b13 = (Object) snapshotStateList.get(i19);
                    c1086gP.q(-1081865889, lVar2.invoke(b13));
                    pVar2 = (Ia.p) k10.d(b13);
                    if (pVar2 == null) {
                        c1086gP.L(821932266);
                    } else {
                        c1086gP.L(-1081864713);
                        pVar2.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(false);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                hVar3 = hVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            interfaceC0923x2 = interfaceC0923xD;
            lVar3 = lVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 2;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                interfaceC0923xD = interfaceC0923x;
                if (c1086gP.k(interfaceC0923xD)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.k(lVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i22 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        interfaceC0923xD = C0907g.d(0, 0, null, 7);
                    }
                    if (i15 != 0) {
                        lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                            @Override // Ia.l
                            public final T invoke(T t8) {
                                return t8;
                            }
                        };
                    }
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    obj2 = objF;
                    if (objF == obj) {
                        SnapshotStateList snapshotStateList6 = new SnapshotStateList();
                        snapshotStateList6.add(transition.f9429a.a());
                        c1086gP.E(snapshotStateList6);
                        obj2 = snapshotStateList6;
                    }
                    snapshotStateList = (SnapshotStateList) obj2;
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = U.b();
                        c1086gP.E(objF2);
                    }
                    k10 = (K) objF2;
                    tA = transition.f9429a.a();
                    c1085f0 = transition.f9432d;
                    if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                        c1086gP.L(860925177);
                        if (snapshotStateList.size() == 1) {
                            c1086gP.L(861059531);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                            if (z11) {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj8) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj8, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            } else {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj8) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj8, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            }
                            kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                            k10.f();
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(861059531);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                            if (z11) {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj8) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj8, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            } else {
                                obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Boolean invoke(Object obj8) {
                                        return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj8, transition.f9432d.getValue()));
                                    }
                                };
                                c1086gP.E(obj3);
                            }
                            kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                            k10.f();
                            c1086gP.T(false);
                        }
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(861255761);
                        c1086gP.T(false);
                    }
                    if (k10.a(c1085f0.getValue())) {
                        c1086gP.L(861316428);
                        listIterator = snapshotStateList.listIterator();
                        i20 = 0;
                        while (true) {
                            nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                            if (nVar.hasNext()) {
                                i20 = -1;
                                break;
                            } else {
                                if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                    break;
                                    break;
                                }
                                i20++;
                            }
                        }
                        if (i20 == -1) {
                            snapshotStateList.add(c1085f0.getValue());
                        } else {
                            snapshotStateList.set(i20, c1085f0.getValue());
                        }
                        k10.f();
                        size2 = snapshotStateList.size();
                        while (i21 < size2) {
                            final T obj8 = snapshotStateList.get(i21);
                            k10.l(obj8, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
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
                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        Transition<T> transition2 = transition;
                                        final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                        Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // Ia.q
                                            public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                num2.intValue();
                                                interfaceC1084f5.L(438406499);
                                                InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                                interfaceC1084f5.D();
                                                return interfaceC0923x4;
                                            }
                                        };
                                        T t8 = obj8;
                                        e0 e0Var = VectorConvertersKt.f9477a;
                                        Object objA = transition2.f9429a.a();
                                        interfaceC1084f3.L(-438678252);
                                        float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                        interfaceC1084f3.D();
                                        Float fValueOf = Float.valueOf(f10);
                                        T value = transition2.f9432d.getValue();
                                        interfaceC1084f3.L(-438678252);
                                        float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                        interfaceC1084f3.D();
                                        final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                        boolean zK = interfaceC1084f3.K(dVarD);
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                    u10.b(dVarD.getValue().floatValue());
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                        Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                        T t10 = obj8;
                                        androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD5);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            k.b(iF, interfaceC1084f3, iF, pVar3);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC5);
                                        qVar3.invoke(t10, interfaceC1084f3, 0);
                                        interfaceC1084f3.J();
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP));
                        }
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(862059281);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i18 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i18, c1086gP, i18, pVar);
                    } else {
                        J4.i.d(i18, c1086gP, i18, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                    c1086gP.L(-187474512);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        A1.B b14 = (Object) snapshotStateList.get(i19);
                        c1086gP.q(-1081865889, lVar2.invoke(b14));
                        pVar2 = (Ia.p) k10.d(b14);
                        if (pVar2 == null) {
                            c1086gP.L(821932266);
                        } else {
                            c1086gP.L(-1081864713);
                            pVar2.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(false);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    hVar3 = hVar4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                }
                interfaceC0923x2 = interfaceC0923xD;
                lVar3 = lVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            lVar2 = lVar;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i22 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    interfaceC0923xD = C0907g.d(0, 0, null, 7);
                }
                if (i15 != 0) {
                    lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // Ia.l
                        public final T invoke(T t8) {
                            return t8;
                        }
                    };
                }
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                obj2 = objF;
                if (objF == obj) {
                    SnapshotStateList snapshotStateList7 = new SnapshotStateList();
                    snapshotStateList7.add(transition.f9429a.a());
                    c1086gP.E(snapshotStateList7);
                    obj2 = snapshotStateList7;
                }
                snapshotStateList = (SnapshotStateList) obj2;
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = U.b();
                    c1086gP.E(objF2);
                }
                k10 = (K) objF2;
                tA = transition.f9429a.a();
                c1085f0 = transition.f9432d;
                if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                    c1086gP.L(860925177);
                    if (snapshotStateList.size() == 1) {
                        c1086gP.L(861059531);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                        if (z11) {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj9) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj9, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        } else {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj9) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj9, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        }
                        kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                        k10.f();
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(861059531);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                        if (z11) {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj9) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj9, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        } else {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj9) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj9, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        }
                        kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                        k10.f();
                        c1086gP.T(false);
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.L(861255761);
                    c1086gP.T(false);
                }
                if (k10.a(c1085f0.getValue())) {
                    c1086gP.L(861316428);
                    listIterator = snapshotStateList.listIterator();
                    i20 = 0;
                    while (true) {
                        nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                        if (nVar.hasNext()) {
                            i20 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                break;
                                break;
                            }
                            i20++;
                        }
                    }
                    if (i20 == -1) {
                        snapshotStateList.add(c1085f0.getValue());
                    } else {
                        snapshotStateList.set(i20, c1085f0.getValue());
                    }
                    k10.f();
                    size2 = snapshotStateList.size();
                    while (i21 < size2) {
                        final T obj9 = snapshotStateList.get(i21);
                        k10.l(obj9, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
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
                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Transition<T> transition2 = transition;
                                    final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                    Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            num2.intValue();
                                            interfaceC1084f5.L(438406499);
                                            InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                            interfaceC1084f5.D();
                                            return interfaceC0923x4;
                                        }
                                    };
                                    T t8 = obj9;
                                    e0 e0Var = VectorConvertersKt.f9477a;
                                    Object objA = transition2.f9429a.a();
                                    interfaceC1084f3.L(-438678252);
                                    float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                    interfaceC1084f3.D();
                                    Float fValueOf = Float.valueOf(f10);
                                    T value = transition2.f9432d.getValue();
                                    interfaceC1084f3.L(-438678252);
                                    float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                    interfaceC1084f3.D();
                                    final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    boolean zK = interfaceC1084f3.K(dVarD);
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                u10.b(dVarD.getValue().floatValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                    Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                    T t10 = obj9;
                                    androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD6);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC6);
                                    qVar3.invoke(t10, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP));
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.L(862059281);
                    c1086gP.T(false);
                }
                androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i18, c1086gP, i18, pVar);
                } else {
                    J4.i.d(i18, c1086gP, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                c1086gP.L(-187474512);
                size = snapshotStateList.size();
                while (i19 < size) {
                    A1.B b15 = (Object) snapshotStateList.get(i19);
                    c1086gP.q(-1081865889, lVar2.invoke(b15));
                    pVar2 = (Ia.p) k10.d(b15);
                    if (pVar2 == null) {
                        c1086gP.L(821932266);
                    } else {
                        c1086gP.L(-1081864713);
                        pVar2.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(false);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                hVar3 = hVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            interfaceC0923x2 = interfaceC0923xD;
            lVar3 = lVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        interfaceC0923xD = interfaceC0923x;
        i15 = i11 & 4;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                lVar2 = lVar;
                if (c1086gP.k(lVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i22 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    interfaceC0923xD = C0907g.d(0, 0, null, 7);
                }
                if (i15 != 0) {
                    lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // Ia.l
                        public final T invoke(T t8) {
                            return t8;
                        }
                    };
                }
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                obj2 = objF;
                if (objF == obj) {
                    SnapshotStateList snapshotStateList8 = new SnapshotStateList();
                    snapshotStateList8.add(transition.f9429a.a());
                    c1086gP.E(snapshotStateList8);
                    obj2 = snapshotStateList8;
                }
                snapshotStateList = (SnapshotStateList) obj2;
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = U.b();
                    c1086gP.E(objF2);
                }
                k10 = (K) objF2;
                tA = transition.f9429a.a();
                c1085f0 = transition.f9432d;
                if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                    c1086gP.L(860925177);
                    if (snapshotStateList.size() == 1) {
                        c1086gP.L(861059531);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                        if (z11) {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj10) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj10, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        } else {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj10) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj10, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        }
                        kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                        k10.f();
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(861059531);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                        if (z11) {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj10) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj10, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        } else {
                            obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Boolean invoke(Object obj10) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj10, transition.f9432d.getValue()));
                                }
                            };
                            c1086gP.E(obj3);
                        }
                        kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                        k10.f();
                        c1086gP.T(false);
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.L(861255761);
                    c1086gP.T(false);
                }
                if (k10.a(c1085f0.getValue())) {
                    c1086gP.L(861316428);
                    listIterator = snapshotStateList.listIterator();
                    i20 = 0;
                    while (true) {
                        nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                        if (nVar.hasNext()) {
                            i20 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                                break;
                                break;
                            }
                            i20++;
                        }
                    }
                    if (i20 == -1) {
                        snapshotStateList.add(c1085f0.getValue());
                    } else {
                        snapshotStateList.set(i20, c1085f0.getValue());
                    }
                    k10.f();
                    size2 = snapshotStateList.size();
                    while (i21 < size2) {
                        final T obj10 = snapshotStateList.get(i21);
                        k10.l(obj10, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
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
                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Transition<T> transition2 = transition;
                                    final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                    Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            num2.intValue();
                                            interfaceC1084f5.L(438406499);
                                            InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                            interfaceC1084f5.D();
                                            return interfaceC0923x4;
                                        }
                                    };
                                    T t8 = obj10;
                                    e0 e0Var = VectorConvertersKt.f9477a;
                                    Object objA = transition2.f9429a.a();
                                    interfaceC1084f3.L(-438678252);
                                    float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                    interfaceC1084f3.D();
                                    Float fValueOf = Float.valueOf(f10);
                                    T value = transition2.f9432d.getValue();
                                    interfaceC1084f3.L(-438678252);
                                    float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                    interfaceC1084f3.D();
                                    final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    boolean zK = interfaceC1084f3.K(dVarD);
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                                u10.b(dVarD.getValue().floatValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                    Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                    T t10 = obj10;
                                    androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD7);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC7);
                                    qVar3.invoke(t10, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP));
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.L(862059281);
                    c1086gP.T(false);
                }
                androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i18, c1086gP, i18, pVar);
                } else {
                    J4.i.d(i18, c1086gP, i18, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                c1086gP.L(-187474512);
                size = snapshotStateList.size();
                while (i19 < size) {
                    A1.B b16 = (Object) snapshotStateList.get(i19);
                    c1086gP.q(-1081865889, lVar2.invoke(b16));
                    pVar2 = (Ia.p) k10.d(b16);
                    if (pVar2 == null) {
                        c1086gP.L(821932266);
                    } else {
                        c1086gP.L(-1081864713);
                        pVar2.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(false);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                hVar3 = hVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            interfaceC0923x2 = interfaceC0923xD;
            lVar3 = lVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        lVar2 = lVar;
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c1086gP.k(qVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i22 != 0) {
                hVar4 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                interfaceC0923xD = C0907g.d(0, 0, null, 7);
            }
            if (i15 != 0) {
                lVar2 = new Ia.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                    @Override // Ia.l
                    public final T invoke(T t8) {
                        return t8;
                    }
                };
            }
            objF = c1086gP.f();
            obj = InterfaceC1084f.a.f12980a;
            obj2 = objF;
            if (objF == obj) {
                SnapshotStateList snapshotStateList9 = new SnapshotStateList();
                snapshotStateList9.add(transition.f9429a.a());
                c1086gP.E(snapshotStateList9);
                obj2 = snapshotStateList9;
            }
            snapshotStateList = (SnapshotStateList) obj2;
            objF2 = c1086gP.f();
            if (objF2 == obj) {
                objF2 = U.b();
                c1086gP.E(objF2);
            }
            k10 = (K) objF2;
            tA = transition.f9429a.a();
            c1085f0 = transition.f9432d;
            if (kotlin.jvm.internal.i.a(tA, c1085f0.getValue())) {
                c1086gP.L(860925177);
                if (snapshotStateList.size() == 1) {
                    c1086gP.L(861059531);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                    if (z11) {
                        obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final Boolean invoke(Object obj11) {
                                return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj11, transition.f9432d.getValue()));
                            }
                        };
                        c1086gP.E(obj3);
                    } else {
                        obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final Boolean invoke(Object obj11) {
                                return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj11, transition.f9432d.getValue()));
                            }
                        };
                        c1086gP.E(obj3);
                    }
                    kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                    k10.f();
                    c1086gP.T(false);
                } else {
                    c1086gP.L(861059531);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    obj3 = (Ia.l<T, Boolean>) c1086gP.f();
                    if (z11) {
                        obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final Boolean invoke(Object obj11) {
                                return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj11, transition.f9432d.getValue()));
                            }
                        };
                        c1086gP.E(obj3);
                    } else {
                        obj3 = (Ia.l<T, Boolean>) new Ia.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final Boolean invoke(Object obj11) {
                                return Boolean.valueOf(!kotlin.jvm.internal.i.a(obj11, transition.f9432d.getValue()));
                            }
                        };
                        c1086gP.E(obj3);
                    }
                    kotlin.collections.p.C((Ia.l) obj3, snapshotStateList);
                    k10.f();
                    c1086gP.T(false);
                }
                c1086gP.T(false);
            } else {
                c1086gP.L(861255761);
                c1086gP.T(false);
            }
            if (k10.a(c1085f0.getValue())) {
                c1086gP.L(861316428);
                listIterator = snapshotStateList.listIterator();
                i20 = 0;
                while (true) {
                    nVar = (androidx.compose.runtime.snapshots.n) listIterator;
                    if (nVar.hasNext()) {
                        i20 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.i.a(lVar2.invoke((Object) nVar.next()), lVar2.invoke(c1085f0.getValue()))) {
                            break;
                            break;
                        }
                        i20++;
                    }
                }
                if (i20 == -1) {
                    snapshotStateList.add(c1085f0.getValue());
                } else {
                    snapshotStateList.set(i20, c1085f0.getValue());
                }
                k10.f();
                size2 = snapshotStateList.size();
                while (i21 < size2) {
                    final T obj11 = snapshotStateList.get(i21);
                    k10.l(obj11, androidx.compose.runtime.internal.a.b(-1426421288, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
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
                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Transition<T> transition2 = transition;
                                final InterfaceC0923x<Float> interfaceC0923x3 = interfaceC0923xD;
                                Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = new Ia.q<Transition.b<Object>, InterfaceC1084f, Integer, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final InterfaceC0923x<Float> invoke(Transition.b<Object> bVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        num2.intValue();
                                        interfaceC1084f5.L(438406499);
                                        InterfaceC0923x<Float> interfaceC0923x4 = interfaceC0923x3;
                                        interfaceC1084f5.D();
                                        return interfaceC0923x4;
                                    }
                                };
                                T t8 = obj11;
                                e0 e0Var = VectorConvertersKt.f9477a;
                                Object objA = transition2.f9429a.a();
                                interfaceC1084f3.L(-438678252);
                                float f10 = kotlin.jvm.internal.i.a(objA, t8) ? 1.0f : 0.0f;
                                interfaceC1084f3.D();
                                Float fValueOf = Float.valueOf(f10);
                                T value = transition2.f9432d.getValue();
                                interfaceC1084f3.L(-438678252);
                                float f11 = kotlin.jvm.internal.i.a(value, t8) ? 1.0f : 0.0f;
                                interfaceC1084f3.D();
                                final Transition.d dVarD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f11), qVar2.invoke(transition2.f(), interfaceC1084f3, 0), e0Var, interfaceC1084f3, 0);
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                boolean zK = interfaceC1084f3.K(dVarD);
                                Object objF3 = interfaceC1084f3.f();
                                if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                                            u10.b(dVarD.getValue().floatValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                androidx.compose.ui.h hVarA = T.a(aVar2, (Ia.l) objF3);
                                Ia.q<T, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar;
                                T t10 = obj11;
                                androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD8);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC8);
                                qVar3.invoke(t10, interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP));
                }
                c1086gP.T(false);
            } else {
                c1086gP.L(862059281);
                c1086gP.T(false);
            }
            androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i18 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVar4);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD8);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i18, c1086gP, i18, pVar);
            } else {
                J4.i.d(i18, c1086gP, i18, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
            c1086gP.L(-187474512);
            size = snapshotStateList.size();
            while (i19 < size) {
                A1.B b17 = (Object) snapshotStateList.get(i19);
                c1086gP.q(-1081865889, lVar2.invoke(b17));
                pVar2 = (Ia.p) k10.d(b17);
                if (pVar2 == null) {
                    c1086gP.L(821932266);
                } else {
                    c1086gP.L(-1081864713);
                    pVar2.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(false);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            hVar3 = hVar4;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
        }
        interfaceC0923x2 = interfaceC0923xD;
        lVar3 = lVar2;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CrossfadeKt.a(transition, hVar3, interfaceC0923x2, lVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final <T> void b(final T t8, androidx.compose.ui.h hVar, InterfaceC0923x<Float> interfaceC0923x, String str, final Ia.q<? super T, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        InterfaceC0923x<Float> interfaceC0923x2;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        boolean z10;
        final androidx.compose.ui.h hVar3;
        final InterfaceC0923x<Float> interfaceC0923x3;
        final String str3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        InterfaceC0923x<Float> interfaceC0923xD;
        String str4;
        C1086g c1086gP = interfaceC1084f.p(-310686752);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c1086gP.K(t8) : c1086gP.k(t8) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    interfaceC0923x2 = interfaceC0923x;
                    if (c1086gP.k(interfaceC0923x2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c1086gP.k(qVar)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i18 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            interfaceC0923xD = C0907g.d(0, 0, null, 7);
                        } else {
                            interfaceC0923xD = interfaceC0923x2;
                        }
                        if (i15 != 0) {
                            str4 = "Crossfade";
                        } else {
                            str4 = str2;
                        }
                        a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                        hVar3 = hVar4;
                        interfaceC0923x3 = interfaceC0923xD;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        interfaceC0923x3 = interfaceC0923x2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                str2 = str;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        interfaceC0923xD = C0907g.d(0, 0, null, 7);
                    } else {
                        interfaceC0923xD = interfaceC0923x2;
                    }
                    if (i15 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                    hVar3 = hVar4;
                    interfaceC0923x3 = interfaceC0923xD;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    interfaceC0923x3 = interfaceC0923x2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            interfaceC0923x2 = interfaceC0923x;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        interfaceC0923xD = C0907g.d(0, 0, null, 7);
                    } else {
                        interfaceC0923xD = interfaceC0923x2;
                    }
                    if (i15 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                    hVar3 = hVar4;
                    interfaceC0923x3 = interfaceC0923xD;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    interfaceC0923x3 = interfaceC0923x2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            str2 = str;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i18 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    interfaceC0923xD = C0907g.d(0, 0, null, 7);
                } else {
                    interfaceC0923xD = interfaceC0923x2;
                }
                if (i15 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                hVar3 = hVar4;
                interfaceC0923x3 = interfaceC0923xD;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                interfaceC0923x3 = interfaceC0923x2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                interfaceC0923x2 = interfaceC0923x;
                if (c1086gP.k(interfaceC0923x2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i18 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        interfaceC0923xD = C0907g.d(0, 0, null, 7);
                    } else {
                        interfaceC0923xD = interfaceC0923x2;
                    }
                    if (i15 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                    hVar3 = hVar4;
                    interfaceC0923x3 = interfaceC0923xD;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    interfaceC0923x3 = interfaceC0923x2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            str2 = str;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i18 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    interfaceC0923xD = C0907g.d(0, 0, null, 7);
                } else {
                    interfaceC0923xD = interfaceC0923x2;
                }
                if (i15 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                hVar3 = hVar4;
                interfaceC0923x3 = interfaceC0923xD;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                interfaceC0923x3 = interfaceC0923x2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        interfaceC0923x2 = interfaceC0923x;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                str2 = str;
                if (c1086gP.K(str2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i18 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    interfaceC0923xD = C0907g.d(0, 0, null, 7);
                } else {
                    interfaceC0923xD = interfaceC0923x2;
                }
                if (i15 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
                hVar3 = hVar4;
                interfaceC0923x3 = interfaceC0923xD;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                interfaceC0923x3 = interfaceC0923x2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        str2 = str;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c1086gP.k(qVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i18 != 0) {
                hVar4 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                interfaceC0923xD = C0907g.d(0, 0, null, 7);
            } else {
                interfaceC0923xD = interfaceC0923x2;
            }
            if (i15 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            a(TransitionKt.f(t8, str4, c1086gP, (i12 & 14) | ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), hVar4, interfaceC0923xD, null, qVar, c1086gP, i12 & 58352, 4);
            hVar3 = hVar4;
            interfaceC0923x3 = interfaceC0923xD;
            str3 = str4;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            interfaceC0923x3 = interfaceC0923x2;
            str3 = str2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CrossfadeKt.b(t8, hVar3, interfaceC0923x3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
