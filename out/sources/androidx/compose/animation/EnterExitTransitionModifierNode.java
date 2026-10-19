package androidx.compose.animation;

import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionModifierNode extends u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<p013b0.j>> f9303A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Transition<EnterExitState> f9304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Transition<EnterExitState>.a<p013b0.l, C0910j> f9305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Transition<EnterExitState>.a<p013b0.j, C0910j> f9306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Transition<EnterExitState>.a<p013b0.j, C0910j> f9307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f9308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o f9309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Ia.a<Boolean> f9310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f9311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f9312x = h.f9641a;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.compose.ui.d f9313y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<p013b0.l>> f9314z;

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.a<p013b0.l, C0910j> aVar, Transition<EnterExitState>.a<p013b0.j, C0910j> aVar2, Transition<EnterExitState>.a<p013b0.j, C0910j> aVar3, m mVar, o oVar, Ia.a<Boolean> aVar4, t tVar) {
        this.f9304p = transition;
        this.f9305q = aVar;
        this.f9306r = aVar2;
        this.f9307s = aVar3;
        this.f9308t = mVar;
        this.f9309u = oVar;
        this.f9310v = aVar4;
        this.f9311w = tVar;
        p013b0.b.b(0, 0, 15);
        this.f9314z = new Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<p013b0.l>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // Ia.l
            public final InterfaceC0923x<p013b0.l> invoke(Transition.b<EnterExitState> bVar) {
                Transition.b<EnterExitState> bVar2 = bVar;
                EnterExitState enterExitState = EnterExitState.f9276b;
                EnterExitState enterExitState2 = EnterExitState.f9277c;
                InterfaceC0923x<p013b0.l> interfaceC0923x = null;
                if (bVar2.d(enterExitState, enterExitState2)) {
                    i iVar = this.this$0.f9308t.a().f9272c;
                    if (iVar != null) {
                        interfaceC0923x = iVar.f9644c;
                    }
                } else if (bVar2.d(enterExitState2, EnterExitState.f9278d)) {
                    i iVar2 = this.this$0.f9309u.a().f9272c;
                    if (iVar2 != null) {
                        interfaceC0923x = iVar2.f9644c;
                    }
                } else {
                    interfaceC0923x = EnterExitTransitionKt.f9291d;
                }
                return interfaceC0923x == null ? EnterExitTransitionKt.f9291d : interfaceC0923x;
            }
        };
        this.f9303A = new Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<p013b0.j>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // Ia.l
            public final InterfaceC0923x<p013b0.j> invoke(Transition.b<EnterExitState> bVar) {
                InterfaceC0923x<p013b0.j> interfaceC0923x;
                InterfaceC0923x<p013b0.j> interfaceC0923x2;
                Transition.b<EnterExitState> bVar2 = bVar;
                EnterExitState enterExitState = EnterExitState.f9276b;
                EnterExitState enterExitState2 = EnterExitState.f9277c;
                if (bVar2.d(enterExitState, enterExitState2)) {
                    A a10 = this.this$0.f9308t.a().f9271b;
                    return (a10 == null || (interfaceC0923x2 = a10.f9229b) == null) ? EnterExitTransitionKt.f9290c : interfaceC0923x2;
                }
                if (!bVar2.d(enterExitState2, EnterExitState.f9278d)) {
                    return EnterExitTransitionKt.f9290c;
                }
                A a11 = this.this$0.f9309u.a().f9271b;
                return (a11 == null || (interfaceC0923x = a11.f9229b) == null) ? EnterExitTransitionKt.f9290c : interfaceC0923x;
            }
        };
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(H h8, androidx.compose.ui.layout.D d10, long j) {
        if (this.f9304p.f9429a.a() == this.f9304p.f9432d.getValue()) {
            this.f9313y = null;
        } else if (this.f9313y == null) {
            androidx.compose.ui.d dVarQ1 = Q1();
            if (dVarQ1 == null) {
                dVarQ1 = androidx.compose.ui.d.a.f13335a;
            }
            this.f9313y = dVarQ1;
        }
        if (h8.S0()) {
            final Y yQ = d10.Q(j);
            long j10 = (((long) yQ.f14220b) << 32) | (((long) yQ.f14221c) & 4294967295L);
            this.f9312x = j10;
            return h8.y1((int) (j10 >> 32), (int) (j10 & 4294967295L), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Y.a aVar) {
                    aVar.d(yQ, 0, 0, 0.0f);
                    return p293xa.r.f47939a;
                }
            });
        }
        if (!this.f9310v.invoke().booleanValue()) {
            final Y yQ2 = d10.Q(j);
            return h8.y1(yQ2.f14220b, yQ2.f14221c, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Y.a aVar) {
                    aVar.d(yQ2, 0, 0, 0.0f);
                    return p293xa.r.f47939a;
                }
            });
        }
        final Ia.l<U, p293xa.r> lVarA = this.f9311w.a();
        final Y yQ3 = d10.Q(j);
        long j11 = (((long) yQ3.f14220b) << 32) | (((long) yQ3.f14221c) & 4294967295L);
        final long j12 = !p013b0.l.b(this.f9312x, h.f9641a) ? this.f9312x : j11;
        Transition<EnterExitState>.a<p013b0.l, C0910j> aVar = this.f9305q;
        Transition.a.C0121a c0121aA = aVar != null ? aVar.a(this.f9314z, new Ia.l<EnterExitState, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.l invoke(EnterExitState enterExitState) {
                Ia.l<p013b0.l, p013b0.l> lVar;
                Ia.l<p013b0.l, p013b0.l> lVar2;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                long j13 = j12;
                enterExitTransitionModifierNode.getClass();
                int iOrdinal = enterExitState.ordinal();
                if (iOrdinal == 0) {
                    i iVar = enterExitTransitionModifierNode.f9308t.a().f9272c;
                    if (iVar != null && (lVar = iVar.f9643b) != null) {
                        j13 = lVar.invoke(new p013b0.l(j13)).f20490a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i iVar2 = enterExitTransitionModifierNode.f9309u.a().f9272c;
                    if (iVar2 != null && (lVar2 = iVar2.f9643b) != null) {
                        j13 = lVar2.invoke(new p013b0.l(j13)).f20490a;
                    }
                }
                return new p013b0.l(j13);
            }
        }) : null;
        if (c0121aA != null) {
            j11 = ((p013b0.l) c0121aA.getValue()).f20490a;
        }
        long jD = p013b0.b.d(j, j11);
        Transition<EnterExitState>.a<p013b0.j, C0910j> aVar2 = this.f9306r;
        long j13 = aVar2 != null ? ((p013b0.j) aVar2.a(new Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<p013b0.j>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // Ia.l
            public final InterfaceC0923x<p013b0.j> invoke(Transition.b<EnterExitState> bVar) {
                return EnterExitTransitionKt.f9290c;
            }
        }, new Ia.l<EnterExitState, p013b0.j>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.j invoke(EnterExitState enterExitState) {
                int iOrdinal;
                EnterExitState enterExitState2 = enterExitState;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                long j14 = j12;
                long jC = 0;
                if (enterExitTransitionModifierNode.f9313y != null && enterExitTransitionModifierNode.Q1() != null && !kotlin.jvm.internal.i.a(enterExitTransitionModifierNode.f9313y, enterExitTransitionModifierNode.Q1()) && (iOrdinal = enterExitState2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i iVar = enterExitTransitionModifierNode.f9309u.a().f9272c;
                    if (iVar != null) {
                        long j15 = iVar.f9643b.invoke(new p013b0.l(j14)).f20490a;
                        androidx.compose.ui.d dVarQ2 = enterExitTransitionModifierNode.Q1();
                        kotlin.jvm.internal.i.b(dVarQ2);
                        LayoutDirection layoutDirection = LayoutDirection.f15717b;
                        long jA = dVarQ2.a(j14, j15, layoutDirection);
                        androidx.compose.ui.d dVar = enterExitTransitionModifierNode.f9313y;
                        kotlin.jvm.internal.i.b(dVar);
                        jC = p013b0.j.c(jA, dVar.a(j14, j15, layoutDirection));
                    }
                }
                return new p013b0.j(jC);
            }
        }).getValue()).f20484a : 0L;
        Transition<EnterExitState>.a<p013b0.j, C0910j> aVar3 = this.f9307s;
        long j14 = aVar3 != null ? ((p013b0.j) aVar3.a(this.f9303A, new Ia.l<EnterExitState, p013b0.j>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r3v4, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final p013b0.j invoke(EnterExitState enterExitState) {
                EnterExitState enterExitState2 = enterExitState;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                long j15 = j12;
                A a10 = enterExitTransitionModifierNode.f9308t.a().f9271b;
                long j16 = 0;
                long j17 = a10 != null ? ((p013b0.j) a10.f9228a.invoke(new p013b0.l(j15))).f20484a : 0L;
                A a11 = enterExitTransitionModifierNode.f9309u.a().f9271b;
                long j18 = a11 != null ? ((p013b0.j) a11.f9228a.invoke(new p013b0.l(j15))).f20484a : 0L;
                int iOrdinal = enterExitState2.ordinal();
                if (iOrdinal == 0) {
                    j16 = j17;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j16 = j18;
                }
                return new p013b0.j(j16);
            }
        }).getValue()).f20484a : 0L;
        androidx.compose.ui.d dVar = this.f9313y;
        final long jD2 = p013b0.j.d(dVar != null ? dVar.a(j12, jD, LayoutDirection.f15717b) : 0L, j14);
        final long j15 = j13;
        return h8.y1((int) (jD >> 32), (int) (4294967295L & jD), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar4) {
                Y.a aVar5 = aVar4;
                Y y10 = yQ3;
                long j16 = jD2;
                long j17 = j15;
                Ia.l<U, p293xa.r> lVar = lVarA;
                aVar5.getClass();
                Y.a.a(aVar5, y10);
                y10.q0(p013b0.j.d((((long) (((int) (j16 >> 32)) + ((int) (j17 >> 32)))) << 32) | (((long) (((int) (j16 & 4294967295L)) + ((int) (j17 & 4294967295L)))) & 4294967295L), y10.f14224f), 0.0f, lVar);
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        this.f9312x = h.f9641a;
    }

    public final androidx.compose.ui.d Q1() {
        androidx.compose.ui.d dVar;
        if (this.f9304p.f().d(EnterExitState.f9276b, EnterExitState.f9277c)) {
            i iVar = this.f9308t.a().f9272c;
            if (iVar == null || (dVar = iVar.f9642a) == null) {
                i iVar2 = this.f9309u.a().f9272c;
                if (iVar2 != null) {
                    return iVar2.f9642a;
                }
                return null;
            }
        } else {
            i iVar3 = this.f9309u.a().f9272c;
            if (iVar3 == null || (dVar = iVar3.f9642a) == null) {
                i iVar4 = this.f9308t.a().f9272c;
                if (iVar4 != null) {
                    return iVar4.f9642a;
                }
                return null;
            }
        }
        return dVar;
    }
}
