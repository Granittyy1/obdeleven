package androidx.compose.animation;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.P;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.c0;
import androidx.compose.animation.core.e0;
import androidx.compose.ui.graphics.q0;
import p114j1.C2479a;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P<Float> f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P<p013b0.j> f9290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P<p013b0.l> f9291d;

    static {
        e0 e0Var = VectorConvertersKt.f9477a;
        f9288a = new e0(new Ia.l<q0, C0910j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
            @Override // Ia.l
            public final C0910j invoke(q0 q0Var) {
                long j = q0Var.f13793a;
                return new C0910j(q0.b(j), q0.c(j));
            }
        }, new Ia.l<C0910j, q0>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
            @Override // Ia.l
            public final q0 invoke(C0910j c0910j) {
                C0910j c0910j2 = c0910j;
                return new q0(C2479a.b(c0910j2.f9554a, c0910j2.f9555b));
            }
        });
        f9289b = C0907g.c(0.0f, 400.0f, null, 5);
        long j = 1;
        long j10 = (j & 4294967295L) | (j << 32);
        f9290c = C0907g.c(0.0f, 400.0f, new p013b0.j(j10), 1);
        f9291d = C0907g.c(0.0f, 400.0f, new p013b0.l(j10), 1);
    }

    public static n a(c0 c0Var) {
        androidx.compose.ui.f fVar;
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13346m;
        if (kotlin.jvm.internal.i.a(aVar, aVar)) {
            fVar = androidx.compose.ui.d.a.f13338d;
        } else {
            fVar = kotlin.jvm.internal.i.a(aVar, androidx.compose.ui.d.a.f13348o) ? androidx.compose.ui.d.a.f13340f : androidx.compose.ui.d.a.f13339e;
        }
        final EnterExitTransitionKt$expandHorizontally$1 enterExitTransitionKt$expandHorizontally$1 = new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                num.intValue();
                return 0;
            }
        };
        return b(new Ia.l<p013b0.l, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.l invoke(p013b0.l lVar) {
                long j = lVar.f20490a;
                return new p013b0.l((((long) enterExitTransitionKt$expandHorizontally$1.invoke(Integer.valueOf((int) (j >> 32))).intValue()) << 32) | (4294967295L & ((long) ((int) (j & 4294967295L)))));
            }
        }, c0Var, fVar, true);
    }

    public static final n b(Ia.l lVar, InterfaceC0923x interfaceC0923x, androidx.compose.ui.d dVar, boolean z10) {
        return new n(new E(null, null, new i(lVar, interfaceC0923x, dVar, z10), null, false, null, 59));
    }

    public static n c(c0 c0Var, androidx.compose.ui.f fVar, int i10) {
        InterfaceC0923x interfaceC0923xC = c0Var;
        if ((i10 & 1) != 0) {
            long j = 1;
            interfaceC0923xC = C0907g.c(0.0f, 400.0f, new p013b0.l((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i10 & 2) != 0) {
            fVar = androidx.compose.ui.d.a.f13343i;
        }
        return b(new Ia.l<p013b0.l, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
            @Override // Ia.l
            public final p013b0.l invoke(p013b0.l lVar) {
                long j10 = lVar.f20490a;
                long j11 = 0;
                return new p013b0.l((j11 & 4294967295L) | (j11 << 32));
            }
        }, interfaceC0923xC, fVar, true);
    }

    public static n d(androidx.compose.ui.f.b bVar, int i10) {
        androidx.compose.ui.f fVar;
        long j = 1;
        P pC = C0907g.c(0.0f, 400.0f, new p013b0.l((j & 4294967295L) | (j << 32)), 1);
        int i11 = i10 & 2;
        androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13345l;
        if (i11 != 0) {
            bVar = bVar2;
        }
        if (kotlin.jvm.internal.i.a(bVar, androidx.compose.ui.d.a.j)) {
            fVar = androidx.compose.ui.d.a.f13336b;
        } else {
            fVar = kotlin.jvm.internal.i.a(bVar, bVar2) ? androidx.compose.ui.d.a.f13342h : androidx.compose.ui.d.a.f13339e;
        }
        final EnterExitTransitionKt$expandVertically$1 enterExitTransitionKt$expandVertically$1 = new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                num.intValue();
                return 0;
            }
        };
        return b(new Ia.l<p013b0.l, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.l invoke(p013b0.l lVar) {
                long j10 = lVar.f20490a;
                return new p013b0.l((((long) ((int) (j10 >> 32))) << 32) | (((long) enterExitTransitionKt$expandVertically$1.invoke(Integer.valueOf((int) (j10 & 4294967295L))).intValue()) & 4294967295L));
            }
        }, pC, fVar, true);
    }

    public static n e(c0 c0Var, float f10, int i10) {
        InterfaceC0923x interfaceC0923xC = c0Var;
        if ((i10 & 1) != 0) {
            interfaceC0923xC = C0907g.c(0.0f, 400.0f, null, 5);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return new n(new E(new q(f10, interfaceC0923xC), null, null, null, false, null, 62));
    }

    public static p f(c0 c0Var, int i10) {
        InterfaceC0923x interfaceC0923xC = c0Var;
        if ((i10 & 1) != 0) {
            interfaceC0923xC = C0907g.c(0.0f, 400.0f, null, 5);
        }
        return new p(new E(new q(0.0f, interfaceC0923xC), null, null, null, false, null, 62));
    }

    public static n g(c0 c0Var, float f10, int i10) {
        InterfaceC0923x interfaceC0923xC = c0Var;
        if ((i10 & 1) != 0) {
            interfaceC0923xC = C0907g.c(0.0f, 400.0f, null, 5);
        }
        return new n(new E(null, null, null, new w(f10, q0.f13791b, interfaceC0923xC), false, null, 55));
    }

    public static p h(c0 c0Var) {
        androidx.compose.ui.f fVar;
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13346m;
        if (kotlin.jvm.internal.i.a(aVar, aVar)) {
            fVar = androidx.compose.ui.d.a.f13338d;
        } else {
            fVar = kotlin.jvm.internal.i.a(aVar, androidx.compose.ui.d.a.f13348o) ? androidx.compose.ui.d.a.f13340f : androidx.compose.ui.d.a.f13339e;
        }
        final EnterExitTransitionKt$shrinkHorizontally$1 enterExitTransitionKt$shrinkHorizontally$1 = new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                num.intValue();
                return 0;
            }
        };
        return i(new Ia.l<p013b0.l, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.l invoke(p013b0.l lVar) {
                long j = lVar.f20490a;
                return new p013b0.l((((long) enterExitTransitionKt$shrinkHorizontally$1.invoke(Integer.valueOf((int) (j >> 32))).intValue()) << 32) | (4294967295L & ((long) ((int) (j & 4294967295L)))));
            }
        }, c0Var, fVar, true);
    }

    public static final p i(Ia.l lVar, InterfaceC0923x interfaceC0923x, androidx.compose.ui.d dVar, boolean z10) {
        return new p(new E(null, null, new i(lVar, interfaceC0923x, dVar, z10), null, false, null, 59));
    }

    public static p j(c0 c0Var, androidx.compose.ui.f fVar, int i10) {
        InterfaceC0923x interfaceC0923xC = c0Var;
        if ((i10 & 1) != 0) {
            long j = 1;
            interfaceC0923xC = C0907g.c(0.0f, 400.0f, new p013b0.l((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i10 & 2) != 0) {
            fVar = androidx.compose.ui.d.a.f13343i;
        }
        return i(new Ia.l<p013b0.l, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
            @Override // Ia.l
            public final p013b0.l invoke(p013b0.l lVar) {
                long j10 = lVar.f20490a;
                long j11 = 0;
                return new p013b0.l((j11 & 4294967295L) | (j11 << 32));
            }
        }, interfaceC0923xC, fVar, true);
    }

    public static p k() {
        androidx.compose.ui.f fVar;
        long j = 1;
        P pC = C0907g.c(0.0f, 400.0f, new p013b0.l((j & 4294967295L) | (j << 32)), 1);
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13345l;
        if (kotlin.jvm.internal.i.a(bVar, androidx.compose.ui.d.a.j)) {
            fVar = androidx.compose.ui.d.a.f13336b;
        } else {
            fVar = kotlin.jvm.internal.i.a(bVar, bVar) ? androidx.compose.ui.d.a.f13342h : androidx.compose.ui.d.a.f13339e;
        }
        final EnterExitTransitionKt$shrinkVertically$1 enterExitTransitionKt$shrinkVertically$1 = new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                num.intValue();
                return 0;
            }
        };
        return i(new Ia.l<p013b0.l, p013b0.l>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.l invoke(p013b0.l lVar) {
                long j10 = lVar.f20490a;
                return new p013b0.l((((long) ((int) (j10 >> 32))) << 32) | (((long) enterExitTransitionKt$shrinkVertically$1.invoke(Integer.valueOf((int) (j10 & 4294967295L))).intValue()) & 4294967295L));
            }
        }, pC, fVar, true);
    }

    public static final n l(final Ia.l lVar, InterfaceC0923x interfaceC0923x) {
        return new n(new E(null, new A(new Ia.l<p013b0.l, p013b0.j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.j invoke(p013b0.l lVar2) {
                return new p013b0.j((((long) lVar.invoke(Integer.valueOf((int) (lVar2.f20490a >> 32))).intValue()) << 32) | (((long) 0) & 4294967295L));
            }
        }, interfaceC0923x), null, null, false, null, 61));
    }

    public static final n m(final Ia.l lVar, InterfaceC0923x interfaceC0923x) {
        return new n(new E(null, new A(new Ia.l<p013b0.l, p013b0.j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.j invoke(p013b0.l lVar2) {
                return new p013b0.j((((long) 0) << 32) | (4294967295L & ((long) lVar.invoke(Integer.valueOf((int) (lVar2.f20490a & 4294967295L))).intValue())));
            }
        }, interfaceC0923x), null, null, false, null, 61));
    }

    public static n n(Ia.l lVar) {
        long j = 1;
        return m(lVar, C0907g.c(0.0f, 400.0f, new p013b0.j((j & 4294967295L) | (j << 32)), 1));
    }

    public static final p o(final Ia.l lVar, InterfaceC0923x interfaceC0923x) {
        return new p(new E(null, new A(new Ia.l<p013b0.l, p013b0.j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.j invoke(p013b0.l lVar2) {
                return new p013b0.j((((long) lVar.invoke(Integer.valueOf((int) (lVar2.f20490a >> 32))).intValue()) << 32) | (((long) 0) & 4294967295L));
            }
        }, interfaceC0923x), null, null, false, null, 61));
    }

    public static final p p(final Ia.l lVar, InterfaceC0923x interfaceC0923x) {
        return new p(new E(null, new A(new Ia.l<p013b0.l, p013b0.j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p013b0.j invoke(p013b0.l lVar2) {
                return new p013b0.j((((long) 0) << 32) | (4294967295L & ((long) lVar.invoke(Integer.valueOf((int) (lVar2.f20490a & 4294967295L))).intValue())));
            }
        }, interfaceC0923x), null, null, false, null, 61));
    }

    public static p q(Ia.l lVar, int i10) {
        long j = 1;
        P pC = C0907g.c(0.0f, 400.0f, new p013b0.j((j & 4294967295L) | (j << 32)), 1);
        if ((i10 & 2) != 0) {
            lVar = new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                @Override // Ia.l
                public final Integer invoke(Integer num) {
                    return Integer.valueOf((-num.intValue()) / 2);
                }
            };
        }
        return p(lVar, pC);
    }
}
