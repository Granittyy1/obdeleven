package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalKt {
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
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
    public static final void a(final C1101n0<?> c1101n0, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        S0 s10;
        boolean z10;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1350970552);
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        c1086gP.s0(201, C1090i.f13039b);
        Object objF = c1086gP.f();
        if (kotlin.jvm.internal.i.a(objF, InterfaceC1084f.a.f12980a)) {
            s10 = null;
        } else {
            kotlin.jvm.internal.i.c(objF, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            s10 = (S0) objF;
        }
        AbstractC1099m0 abstractC1099m0 = c1101n0.f13098a;
        S0 s0C = abstractC1099m0.c(c1101n0, s10);
        boolean zEquals = s0C.equals(s10);
        if (!zEquals) {
            c1086gP.E(s0C);
        }
        if (!c1086gP.f12995O) {
            z0 z0Var = c1086gP.f12986F;
            Object objB = z0Var.b(z0Var.f13260b, z0Var.f13265g);
            kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1089h0 interfaceC1089h0 = (InterfaceC1089h0) objB;
            if (!(c1086gP.s() && zEquals) && (c1101n0.f13103f || !interfaceC1089h0P.containsKey(abstractC1099m0))) {
                interfaceC1089h0P = interfaceC1089h0P.s(abstractC1099m0, s0C);
            } else if ((zEquals && !c1086gP.f13018v) || !c1086gP.f13018v) {
                interfaceC1089h0P = interfaceC1089h0;
            }
            if (c1086gP.f13020x || interfaceC1089h0 != interfaceC1089h0P) {
                z10 = true;
            }
            if (z10 && !c1086gP.f12995O) {
                c1086gP.i0(interfaceC1089h0P);
            }
            boolean z11 = c1086gP.f13018v;
            T4.o0 o0Var = c1086gP.f13019w;
            o0Var.f(z11 ? 1 : 0);
            c1086gP.f13018v = z10;
            c1086gP.f12990J = interfaceC1089h0P;
            c1086gP.q0(202, 0, C1090i.f13040c, interfaceC1089h0P);
            pVar.invoke(c1086gP, Integer.valueOf((i10 >> 3) & 14));
            c1086gP.T(false);
            c1086gP.T(false);
            c1086gP.f13018v = o0Var.e() != 0;
            c1086gP.f12990J = null;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CompositionLocalKt.a(c1101n0, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        if (c1101n0.f13103f || !interfaceC1089h0P.containsKey(abstractC1099m0)) {
            interfaceC1089h0P = interfaceC1089h0P.s(abstractC1099m0, s0C);
        }
        c1086gP.f12989I = true;
        z10 = false;
        if (z10) {
            c1086gP.i0(interfaceC1089h0P);
        }
        boolean z12 = c1086gP.f13018v;
        T4.o0 o0Var2 = c1086gP.f13019w;
        o0Var2.f(z12 ? 1 : 0);
        c1086gP.f13018v = z10;
        c1086gP.f12990J = interfaceC1089h0P;
        c1086gP.q0(202, 0, C1090i.f13040c, interfaceC1089h0P);
        pVar.invoke(c1086gP, Integer.valueOf((i10 >> 3) & 14));
        c1086gP.T(false);
        c1086gP.T(false);
        c1086gP.f13018v = o0Var2.e() != 0;
        c1086gP.f12990J = null;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CompositionLocalKt.a(c1101n0, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(final C1101n0<?>[] c1101n0Arr, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        InterfaceC1089h0 interfaceC1089h0A;
        boolean z10;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1390796515);
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        c1086gP.s0(201, C1090i.f13039b);
        boolean z11 = c1086gP.f12995O;
        C1077b0 c1077b0 = C1090i.f13041d;
        if (z11) {
            InterfaceC1089h0 interfaceC1089h0B = C1109s.b(c1101n0Arr, interfaceC1089h0P, androidx.compose.runtime.internal.d.f13053e);
            androidx.compose.runtime.internal.d.a aVarI = interfaceC1089h0P.i();
            aVarI.putAll(interfaceC1089h0B);
            interfaceC1089h0A = aVarI.a();
            c1086gP.s0(204, c1077b0);
            c1086gP.c0();
            c1086gP.z0(interfaceC1089h0A);
            c1086gP.c0();
            c1086gP.z0(interfaceC1089h0B);
            c1086gP.T(false);
            c1086gP.f12989I = true;
        } else {
            z0 z0Var = c1086gP.f12986F;
            Object objH = z0Var.h(z0Var.f13265g, 0);
            kotlin.jvm.internal.i.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1089h0 interfaceC1089h0 = (InterfaceC1089h0) objH;
            z0 z0Var2 = c1086gP.f12986F;
            Object objH2 = z0Var2.h(z0Var2.f13265g, 1);
            kotlin.jvm.internal.i.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1089h0 interfaceC1089h1 = (InterfaceC1089h0) objH2;
            InterfaceC1089h0 interfaceC1089h0B2 = C1109s.b(c1101n0Arr, interfaceC1089h0P, interfaceC1089h1);
            if (!c1086gP.s() || c1086gP.f13020x || !interfaceC1089h1.equals(interfaceC1089h0B2)) {
                androidx.compose.runtime.internal.d.a aVarI2 = interfaceC1089h0P.i();
                aVarI2.putAll(interfaceC1089h0B2);
                interfaceC1089h0A = aVarI2.a();
                c1086gP.s0(204, c1077b0);
                c1086gP.c0();
                c1086gP.z0(interfaceC1089h0A);
                c1086gP.c0();
                c1086gP.z0(interfaceC1089h0B2);
                c1086gP.T(false);
                if (c1086gP.f13020x || !kotlin.jvm.internal.i.a(interfaceC1089h0A, interfaceC1089h0)) {
                    z10 = true;
                }
                if (z10 && !c1086gP.f12995O) {
                    c1086gP.i0(interfaceC1089h0A);
                }
                boolean z12 = c1086gP.f13018v;
                T4.o0 o0Var = c1086gP.f13019w;
                o0Var.f(z12 ? 1 : 0);
                c1086gP.f13018v = z10;
                c1086gP.f12990J = interfaceC1089h0A;
                c1086gP.q0(202, 0, C1090i.f13040c, interfaceC1089h0A);
                pVar.invoke(c1086gP, Integer.valueOf((i10 >> 3) & 14));
                c1086gP.T(false);
                c1086gP.T(false);
                c1086gP.f13018v = o0Var.e() != 0;
                c1086gP.f12990J = null;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1101n0<?>[] c1101n0Arr2 = c1101n0Arr;
                            CompositionLocalKt.b((C1101n0[]) Arrays.copyOf(c1101n0Arr2, c1101n0Arr2.length), pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            c1086gP.f13007k = c1086gP.f12986F.q() + c1086gP.f13007k;
            interfaceC1089h0A = interfaceC1089h0;
        }
        z10 = false;
        if (z10) {
            c1086gP.i0(interfaceC1089h0A);
        }
        boolean z13 = c1086gP.f13018v;
        T4.o0 o0Var2 = c1086gP.f13019w;
        o0Var2.f(z13 ? 1 : 0);
        c1086gP.f13018v = z10;
        c1086gP.f12990J = interfaceC1089h0A;
        c1086gP.q0(202, 0, C1090i.f13040c, interfaceC1089h0A);
        pVar.invoke(c1086gP, Integer.valueOf((i10 >> 3) & 14));
        c1086gP.T(false);
        c1086gP.T(false);
        c1086gP.f13018v = o0Var2.e() != 0;
        c1086gP.f12990J = null;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    C1101n0<?>[] c1101n0Arr2 = c1101n0Arr;
                    CompositionLocalKt.b((C1101n0[]) Arrays.copyOf(c1101n0Arr2, c1101n0Arr2.length), pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static C c(Ia.a aVar) {
        return new C(aVar, Q0.f12888a);
    }

    public static final O0 d(Ia.a aVar) {
        return new O0(aVar);
    }
}
