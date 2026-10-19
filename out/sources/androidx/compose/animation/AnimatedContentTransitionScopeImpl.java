package androidx.compose.animation;

import androidx.collection.K;
import androidx.collection.U;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.ui.layout.W;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.H;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements InterfaceC0927e<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Transition<S> f9239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.d f9240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutDirection f9241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f9242d = J0.f(new p013b0.l(0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K<S, N0<p013b0.l>> f9243e = U.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Transition.a.C0121a f9244f;

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class SizeModifierElement<S> extends H<SizeModifierNode<S>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Transition<S>.a<p013b0.l, C0910j> f9245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final X f9246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AnimatedContentTransitionScopeImpl<S> f9247d;

        public SizeModifierElement(Transition.a aVar, X x10, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.f9245b = aVar;
            this.f9246c = x10;
            this.f9247d = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.H
        public final androidx.compose.ui.h.c a() {
            SizeModifierNode sizeModifierNode = new SizeModifierNode();
            sizeModifierNode.f9248p = this.f9245b;
            sizeModifierNode.f9249q = this.f9246c;
            sizeModifierNode.f9250r = this.f9247d;
            sizeModifierNode.f9251s = AnimatedContentKt.f9230a;
            return sizeModifierNode;
        }

        @Override // androidx.compose.ui.node.H
        public final void e(androidx.compose.ui.h.c cVar) {
            SizeModifierNode sizeModifierNode = (SizeModifierNode) cVar;
            sizeModifierNode.f9248p = this.f9245b;
            sizeModifierNode.f9249q = this.f9246c;
            sizeModifierNode.f9250r = this.f9247d;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SizeModifierElement) {
                SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
                if (kotlin.jvm.internal.i.a(sizeModifierElement.f9245b, this.f9245b) && kotlin.jvm.internal.i.a(sizeModifierElement.f9246c, this.f9246c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f9247d.hashCode() * 31;
            Transition<S>.a<p013b0.l, C0910j> aVar = this.f9245b;
            return this.f9246c.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class SizeModifierNode<S> extends u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Transition<S>.a<p013b0.l, C0910j> f9248p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public X f9249q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public AnimatedContentTransitionScopeImpl<S> f9250r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f9251s;

        public SizeModifierNode() {
            throw null;
        }

        @Override // androidx.compose.ui.node.InterfaceC1198t
        public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
            final long j10;
            final Y yQ = d10.Q(j);
            if (h8.S0()) {
                j10 = (((long) yQ.f14220b) << 32) | (((long) yQ.f14221c) & 4294967295L);
            } else {
                Transition<S>.a<p013b0.l, C0910j> aVar = this.f9248p;
                if (aVar == null) {
                    j10 = (((long) yQ.f14220b) << 32) | (((long) yQ.f14221c) & 4294967295L);
                    this.f9251s = j10;
                } else {
                    final long j11 = (((long) yQ.f14221c) & 4294967295L) | (((long) yQ.f14220b) << 32);
                    Transition.a.C0121a c0121aA = aVar.a(new Ia.l<Transition.b<S>, InterfaceC0923x<p013b0.l>>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                        final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // Ia.l
                        public final InterfaceC0923x<p013b0.l> invoke(Object obj) {
                            long j12;
                            InterfaceC0923x<p013b0.l> interfaceC0923xB;
                            Transition.b bVar = (Transition.b) obj;
                            if (kotlin.jvm.internal.i.a(bVar.c(), this.this$0.f9250r.c())) {
                                AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode = this.this$0;
                                j12 = j11;
                                if (!p013b0.l.b(sizeModifierNode.f9251s, AnimatedContentKt.f9230a)) {
                                    j12 = sizeModifierNode.f9251s;
                                }
                            } else {
                                N0<p013b0.l> n0D = this.this$0.f9250r.f9243e.d((S) bVar.c());
                                j12 = n0D != null ? n0D.getValue().f20490a : 0L;
                            }
                            N0<p013b0.l> n0D2 = this.this$0.f9250r.f9243e.d((S) bVar.h());
                            long j13 = n0D2 != null ? n0D2.getValue().f20490a : 0L;
                            y yVar = (y) this.this$0.f9249q.getValue();
                            return (yVar == null || (interfaceC0923xB = yVar.b(j12, j13)) == null) ? C0907g.c(0.0f, 400.0f, null, 5) : interfaceC0923xB;
                        }
                    }, new Ia.l<S, p013b0.l>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                        final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // Ia.l
                        public final p013b0.l invoke(Object obj) {
                            long j12;
                            if (kotlin.jvm.internal.i.a(obj, this.this$0.f9250r.c())) {
                                AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode = this.this$0;
                                j12 = j11;
                                if (!p013b0.l.b(sizeModifierNode.f9251s, AnimatedContentKt.f9230a)) {
                                    j12 = sizeModifierNode.f9251s;
                                }
                            } else {
                                N0<p013b0.l> n0D = this.this$0.f9250r.f9243e.d(obj);
                                j12 = n0D != null ? n0D.getValue().f20490a : 0L;
                            }
                            return new p013b0.l(j12);
                        }
                    });
                    this.f9250r.f9244f = c0121aA;
                    j10 = ((p013b0.l) c0121aA.getValue()).f20490a;
                    this.f9251s = ((p013b0.l) c0121aA.getValue()).f20490a;
                }
            }
            return h8.y1((int) (j10 >> 32), (int) (4294967295L & j10), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // Ia.l
                public final p293xa.r invoke(Y.a aVar2) {
                    androidx.compose.ui.d dVar = this.this$0.f9250r.f9240b;
                    Y y10 = yQ;
                    Y.a.f(aVar2, yQ, dVar.a((((long) y10.f14220b) << 32) | (((long) y10.f14221c) & 4294967295L), j10, LayoutDirection.f15717b));
                    return p293xa.r.f47939a;
                }
            });
        }

        @Override // androidx.compose.ui.h.c
        public final void K1() {
            this.f9251s = AnimatedContentKt.f9230a;
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, androidx.compose.ui.d dVar, LayoutDirection layoutDirection) {
        this.f9239a = transition;
        this.f9240b = dVar;
        this.f9241c = layoutDirection;
    }

    public static final long i(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, long j, long j10) {
        return animatedContentTransitionScopeImpl.f9240b.a(j, j10, LayoutDirection.f15717b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long j(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        Transition.a.C0121a c0121a = animatedContentTransitionScopeImpl.f9244f;
        return c0121a != null ? ((p013b0.l) c0121a.getValue()).f20490a : ((p013b0.l) animatedContentTransitionScopeImpl.f9242d.getValue()).f20490a;
    }

    @Override // androidx.compose.animation.InterfaceC0927e
    public final j a(j jVar, z zVar) {
        jVar.f9649d = zVar;
        return jVar;
    }

    @Override // androidx.compose.animation.InterfaceC0927e
    public final n b(final Ia.l lVar, InterfaceC0923x interfaceC0923x) {
        if (k(2)) {
            return EnterExitTransitionKt.l(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    int iIntValue = num.intValue();
                    Ia.l<Integer, Integer> lVar2 = lVar;
                    int iJ = (int) (AnimatedContentTransitionScopeImpl.j(this) >> 32);
                    AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                    long j = iIntValue;
                    return lVar2.invoke(Integer.valueOf(iJ - ((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, (j & 4294967295L) | (j << 32), AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) >> 32))));
                }
            }, interfaceC0923x);
        }
        if (l(2)) {
            return EnterExitTransitionKt.l(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    int iIntValue = num.intValue();
                    Ia.l<Integer, Integer> lVar2 = lVar;
                    AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                    long j = iIntValue;
                    return lVar2.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, (j & 4294967295L) | (j << 32), AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) >> 32))) - iIntValue));
                }
            }, interfaceC0923x);
        }
        if (InterfaceC0927e.a.a(2, 2)) {
            return EnterExitTransitionKt.m(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    int iIntValue = num.intValue();
                    Ia.l<Integer, Integer> lVar2 = lVar;
                    int iJ = (int) (AnimatedContentTransitionScopeImpl.j(this) & 4294967295L);
                    AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                    long j = iIntValue;
                    return lVar2.invoke(Integer.valueOf(iJ - ((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, (j & 4294967295L) | (j << 32), AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) & 4294967295L))));
                }
            }, interfaceC0923x);
        }
        return InterfaceC0927e.a.a(2, 3) ? EnterExitTransitionKt.m(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final Integer invoke(Integer num) {
                int iIntValue = num.intValue();
                Ia.l<Integer, Integer> lVar2 = lVar;
                AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                long j = iIntValue;
                return lVar2.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, (j & 4294967295L) | (j << 32), AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) & 4294967295L))) - iIntValue));
            }
        }, interfaceC0923x) : m.f9657a;
    }

    @Override // androidx.compose.animation.core.Transition.b
    public final S c() {
        return this.f9239a.f().c();
    }

    @Override // androidx.compose.animation.InterfaceC0927e
    public final p e(final Ia.l lVar, InterfaceC0923x interfaceC0923x) {
        if (k(3)) {
            return EnterExitTransitionKt.o(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    int iIntValue = num.intValue();
                    AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                    N0<p013b0.l> n0D = animatedContentTransitionScopeImpl.f9243e.d(animatedContentTransitionScopeImpl.f9239a.f9432d.getValue());
                    long j = iIntValue;
                    return lVar.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(this, (j & 4294967295L) | (j << 32), n0D != null ? n0D.getValue().f20490a : 0L) >> 32))) - iIntValue));
                }
            }, interfaceC0923x);
        }
        if (l(3)) {
            return EnterExitTransitionKt.o(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    int iIntValue = num.intValue();
                    AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                    N0<p013b0.l> n0D = animatedContentTransitionScopeImpl.f9243e.d(animatedContentTransitionScopeImpl.f9239a.f9432d.getValue());
                    long j = n0D != null ? n0D.getValue().f20490a : 0L;
                    long j10 = iIntValue;
                    return lVar.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(this, (j10 & 4294967295L) | (j10 << 32), j) >> 32))) + ((int) (j >> 32))));
                }
            }, interfaceC0923x);
        }
        if (InterfaceC0927e.a.a(3, 2)) {
            return EnterExitTransitionKt.p(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    int iIntValue = num.intValue();
                    AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                    N0<p013b0.l> n0D = animatedContentTransitionScopeImpl.f9243e.d(animatedContentTransitionScopeImpl.f9239a.f9432d.getValue());
                    long j = iIntValue;
                    return lVar.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(this, (j & 4294967295L) | (j << 32), n0D != null ? n0D.getValue().f20490a : 0L) & 4294967295L))) - iIntValue));
                }
            }, interfaceC0923x);
        }
        return InterfaceC0927e.a.a(3, 3) ? EnterExitTransitionKt.p(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Integer invoke(Integer num) {
                int iIntValue = num.intValue();
                AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this;
                N0<p013b0.l> n0D = animatedContentTransitionScopeImpl.f9243e.d(animatedContentTransitionScopeImpl.f9239a.f9432d.getValue());
                long j = n0D != null ? n0D.getValue().f20490a : 0L;
                long j10 = iIntValue;
                return lVar.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(this, (j10 & 4294967295L) | (j10 << 32), j) & 4294967295L))) + ((int) (j & 4294967295L))));
            }
        }, interfaceC0923x) : o.f9659a;
    }

    @Override // androidx.compose.animation.core.Transition.b
    public final S h() {
        return this.f9239a.f().h();
    }

    public final boolean k(int i10) {
        return InterfaceC0927e.a.a(i10, 0) || (InterfaceC0927e.a.a(i10, 4) && this.f9241c == LayoutDirection.f15717b) || (InterfaceC0927e.a.a(i10, 5) && this.f9241c == LayoutDirection.f15718c);
    }

    public final boolean l(int i10) {
        if (InterfaceC0927e.a.a(i10, 1)) {
            return true;
        }
        if (InterfaceC0927e.a.a(i10, 4) && this.f9241c == LayoutDirection.f15718c) {
            return true;
        }
        return InterfaceC0927e.a.a(i10, 5) && this.f9241c == LayoutDirection.f15717b;
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class a implements W {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1085f0 f9252b;

        public a(boolean z10) {
            this.f9252b = J0.f(Boolean.valueOf(z10));
        }

        @Override // androidx.compose.ui.layout.W
        public final Object v() {
            return this;
        }
    }
}
