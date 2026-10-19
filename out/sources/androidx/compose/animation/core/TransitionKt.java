package androidx.compose.animation.core;

import androidx.compose.animation.EnterExitState;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ia.l<SeekableTransitionState<?>, p293xa.r> f9463a = new Ia.l<SeekableTransitionState<?>, p293xa.r>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xa.g] */
        @Override // Ia.l
        public final p293xa.r invoke(SeekableTransitionState<?> seekableTransitionState) {
            SeekableTransitionState<?> seekableTransitionState2 = seekableTransitionState;
            long j = seekableTransitionState2.f9409f;
            ((SnapshotStateObserver) TransitionKt.f9464b.getValue()).d(seekableTransitionState2, TransitionKt.f9463a, seekableTransitionState2.f9410g);
            long j10 = seekableTransitionState2.f9409f;
            if (j != j10) {
                SeekableTransitionState.a aVar = seekableTransitionState2.f9416n;
                if (aVar != null) {
                    if (aVar.f9420a > j10) {
                        seekableTransitionState2.m();
                    } else {
                        aVar.f9426g = j10;
                        if (aVar.f9421b == null) {
                            aVar.f9427h = Ka.a.c((1.0d - ((double) aVar.f9424e.a(0))) * seekableTransitionState2.f9409f);
                        }
                    }
                } else if (j10 != 0) {
                    seekableTransitionState2.o();
                }
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9464b = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<SnapshotStateObserver>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        @Override // Ia.a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Ia.l<Ia.a<? extends p293xa.r>, p293xa.r>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // Ia.l
                public final p293xa.r invoke(Ia.a<? extends p293xa.r> aVar) {
                    aVar.invoke();
                    return p293xa.r.f47939a;
                }
            });
            snapshotStateObserver.e();
            return snapshotStateObserver;
        }
    });

    public static final <S, T, V extends AbstractC0913m> void a(final Transition<S> transition, final Transition<S>.d<T, V> dVar, final T t8, final T t10, final InterfaceC0923x<T> interfaceC0923x, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(867041821);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c1086gP.K(t8) : c1086gP.k(t8) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c1086gP.K(t10) : c1086gP.k(t10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? c1086gP.K(interfaceC0923x) : c1086gP.k(interfaceC0923x) ? 16384 : 8192;
        }
        if (!c1086gP.C(i11 & 1, (i11 & 9363) != 9362)) {
            c1086gP.w();
        } else if (transition.g()) {
            dVar.s(t8, t10, interfaceC0923x);
        } else {
            dVar.v(t10, interfaceC0923x);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.core.TransitionKt$UpdateInitialAndTargetValues$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TransitionKt.a(transition, dVar, t8, t10, interfaceC0923x, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final Transition b(final Transition transition, EnterExitState enterExitState, EnterExitState enterExitState2, InterfaceC1084f interfaceC1084f, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && interfaceC1084f.K(transition)) || (i10 & 6) == 4;
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (z11 || objF == obj) {
            objF = new Transition(new K(enterExitState), transition, Q8.d.a(new StringBuilder(), transition.f9431c, " > EnterExitTransition"));
            interfaceC1084f.E(objF);
        }
        final Transition transition2 = (Transition) objF;
        if ((i11 <= 4 || !interfaceC1084f.K(transition)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zK = interfaceC1084f.K(transition2) | z10;
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == obj) {
            objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                    Transition<Object> transition3 = transition;
                    transition3.j.add(transition2);
                    return new W(transition, transition2);
                }
            };
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.E.a(transition2, (Ia.l) objF2, interfaceC1084f);
        if (transition.g()) {
            transition2.k(enterExitState, enterExitState2);
        } else {
            transition2.p(enterExitState2);
            transition2.f9438k.setValue(Boolean.FALSE);
        }
        return transition2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Transition.a c(final Transition transition, e0 e0Var, String str, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        Transition.a.C0121a c0121a;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && interfaceC1084f.K(transition)) || (i10 & 6) == 4;
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (z11 || objF == c0153a) {
            objF = new Transition.a(e0Var, str);
            interfaceC1084f.E(objF);
        }
        final Transition.a aVar = (Transition.a) objF;
        if ((i12 <= 4 || !interfaceC1084f.K(transition)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zK = interfaceC1084f.k(aVar) | z10;
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == c0153a) {
            objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                    return new X(transition, 0, aVar);
                }
            };
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.E.a(aVar, (Ia.l) objF2, interfaceC1084f);
        if (transition.g() && (c0121a = (Transition.a.C0121a) aVar.f9441b.getValue()) != null) {
            Lambda lambda = c0121a.f9445d;
            Transition<S> transition2 = Transition.this;
            c0121a.f9443b.s((T) lambda.invoke(transition2.f().c()), (T) c0121a.f9445d.invoke(transition2.f().h()), (InterfaceC0923x<T>) ((InterfaceC0923x) c0121a.f9444c.invoke(transition2.f())));
        }
        return aVar;
    }

    public static final Transition.d d(final Transition transition, Object obj, Object obj2, InterfaceC0923x interfaceC0923x, d0 d0Var, InterfaceC1084f interfaceC1084f, int i10) {
        boolean zK = interfaceC1084f.K(transition);
        Object objF = interfaceC1084f.f();
        Object obj3 = InterfaceC1084f.a.f12980a;
        if (zK || objF == obj3) {
            AbstractC0913m abstractC0913m = (AbstractC0913m) d0Var.a().invoke(obj2);
            abstractC0913m.d();
            objF = new Transition.d(obj, abstractC0913m, d0Var);
            interfaceC1084f.E(objF);
        }
        final Transition.d dVar = (Transition.d) objF;
        a(transition, dVar, obj, obj2, interfaceC0923x, interfaceC1084f, 0);
        boolean zK2 = interfaceC1084f.K(transition) | interfaceC1084f.K(dVar);
        Object objF2 = interfaceC1084f.f();
        if (zK2 || objF2 == obj3) {
            objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                    Transition<Object> transition2 = transition;
                    transition2.f9437i.add(dVar);
                    return new Y(transition, 0, dVar);
                }
            };
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.E.a(dVar, (Ia.l) objF2, interfaceC1084f);
        return dVar;
    }

    public static final Transition e(b0 b0Var, String str, InterfaceC1084f interfaceC1084f, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && interfaceC1084f.K(b0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (z11 || objF == obj) {
            objF = new Transition(b0Var, null, str);
            interfaceC1084f.E(objF);
        }
        final Transition transition = (Transition) objF;
        if (b0Var instanceof SeekableTransitionState) {
            interfaceC1084f.L(1030829284);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) b0Var;
            T value = seekableTransitionState.f9406c.getValue();
            T value2 = seekableTransitionState.f9405b.getValue();
            if ((i11 <= 4 || !interfaceC1084f.K(b0Var)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objF2 = interfaceC1084f.f();
            if (z10 || objF2 == obj) {
                objF2 = new TransitionKt$rememberTransition$1$1(b0Var, null);
                interfaceC1084f.E(objF2);
            }
            androidx.compose.runtime.E.e(value, value2, (Ia.p) objF2, interfaceC1084f);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1031290843);
            transition.a(0, interfaceC1084f, b0Var.b());
            interfaceC1084f.D();
        }
        boolean zK = interfaceC1084f.K(transition);
        Object objF3 = interfaceC1084f.f();
        if (zK || objF3 == obj) {
            objF3 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                    return new Z(0, transition);
                }
            };
            interfaceC1084f.E(objF3);
        }
        androidx.compose.runtime.E.a(transition, (Ia.l) objF3, interfaceC1084f);
        return transition;
    }

    public static final <T> Transition<T> f(T t8, String str, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = new Transition(new K(t8), null, str);
            interfaceC1084f.E(objF);
        }
        final Transition<T> transition = (Transition) objF;
        transition.a((i10 & 8) | 48 | (i10 & 14), interfaceC1084f, t8);
        Object objF2 = interfaceC1084f.f();
        if (objF2 == c0153a) {
            objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                    return new a0(transition);
                }
            };
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.E.a(transition, (Ia.l) objF2, interfaceC1084f);
        return transition;
    }
}
