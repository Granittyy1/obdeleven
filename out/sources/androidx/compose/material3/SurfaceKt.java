package androidx.compose.material3;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.runtime.C f12322a = CompositionLocalKt.c(new Ia.a<p013b0.f>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // Ia.a
        public final p013b0.f invoke() {
            return new p013b0.f(0);
        }
    });

    public static final void a(androidx.compose.ui.h hVar, androidx.compose.ui.graphics.l0 l0Var, long j, long j10, float f10, float f11, C0937i c0937i, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        androidx.compose.ui.graphics.l0 l0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.h0.f13629a : l0Var;
        long j11 = (i11 & 4) != 0 ? ((C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a)).f12634p : j;
        long jB = (i11 & 8) != 0 ? ColorSchemeKt.b(j11, interfaceC1084f) : j10;
        float f12 = (i11 & 16) != 0 ? 0 : f10;
        float f13 = (i11 & 32) != 0 ? 0 : f11;
        C0937i c0937i2 = (i11 & 64) != 0 ? null : c0937i;
        androidx.compose.runtime.C c10 = f12322a;
        final float f14 = f12 + ((p013b0.f) interfaceC1084f.x(c10)).f20481b;
        final androidx.compose.ui.h hVar3 = hVar2;
        final androidx.compose.ui.graphics.l0 l0Var3 = l0Var2;
        final long j12 = j11;
        final C0937i c0937i3 = c0937i2;
        final float f15 = f13;
        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f12125a), c10.b(new p013b0.f(f14))}, androidx.compose.runtime.internal.a.b(-70914509, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            /* JADX INFO: renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: Surface.kt */
            @Aa.c(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
            final class AnonymousClass3 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                int label;

                public AnonymousClass3() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass3(2, cVar);
                }

                @Override // Ia.p
                public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    return ((AnonymousClass3) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return p293xa.r.f47939a;
                }
            }

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
                    androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.d(hVar3, l0Var3, SurfaceKt.e(j12, f14, interfaceC1084f3), c0937i3, ((p013b0.c) interfaceC1084f3.x(CompositionLocalsKt.f14847h)).T0(f15)), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.f(wVar);
                            return p293xa.r.f47939a;
                        }
                    }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass3(2, null)), 6));
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                    int iF = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f3.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar);
                    } else {
                        interfaceC1084f3.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 56);
    }

    public static final void b(final boolean z10, final Ia.a aVar, final androidx.compose.ui.h hVar, boolean z11, final androidx.compose.ui.graphics.l0 l0Var, final long j, long j10, C0937i c0937i, final ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        final boolean z12 = (i11 & 8) != 0 ? true : z11;
        long jB = (i11 & 64) != 0 ? ColorSchemeKt.b(j, interfaceC1084f) : j10;
        float f10 = 0;
        final float f11 = 0;
        final C0937i c0937i2 = (i11 & 512) != 0 ? null : c0937i;
        androidx.compose.runtime.C c10 = f12322a;
        final float f12 = ((p013b0.f) interfaceC1084f.x(c10)).f20481b + f10;
        final androidx.compose.foundation.interaction.k kVar = null;
        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f12125a), c10.b(new p013b0.f(f12))}, androidx.compose.runtime.internal.a.b(-1164547968, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
                    androidx.compose.ui.h hVar2 = hVar;
                    O0 o10 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarA = androidx.compose.foundation.selection.a.a(SurfaceKt.d(hVar2.i(MinimumInteractiveModifier.f12219b), l0Var, SurfaceKt.e(j, f12, interfaceC1084f3), c0937i2, ((p013b0.c) interfaceC1084f3.x(CompositionLocalsKt.f14847h)).T0(f11)), z10, kVar, RippleKt.c(false, 0.0f, interfaceC1084f3, 0, 7), z12, aVar);
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar = composableLambdaImpl;
                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                    int iF = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
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
                    androidx.compose.foundation.gestures.d.c(pVar, interfaceC1084f3, 0);
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 56);
    }

    public static final void c(final Ia.a aVar, final androidx.compose.ui.h hVar, boolean z10, final androidx.compose.ui.graphics.l0 l0Var, final long j, long j10, float f10, float f11, C0937i c0937i, final androidx.compose.foundation.interaction.k kVar, final ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        final boolean z11 = (i11 & 4) != 0 ? true : z10;
        float f12 = (i11 & 64) != 0 ? 0 : f10;
        final float f13 = (i11 & 128) != 0 ? 0 : f11;
        final C0937i c0937i2 = (i11 & 256) != 0 ? null : c0937i;
        androidx.compose.runtime.C c10 = f12322a;
        final float f14 = ((p013b0.f) interfaceC1084f.x(c10)).f20481b + f12;
        CompositionLocalKt.b(new C1101n0[]{B7.b.b(j10, ContentColorKt.f12125a), c10.b(new p013b0.f(f14))}, androidx.compose.runtime.internal.a.b(1279702876, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
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
                    androidx.compose.ui.h hVar2 = hVar;
                    O0 o10 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.d(hVar2.i(MinimumInteractiveModifier.f12219b), l0Var, SurfaceKt.e(j, f14, interfaceC1084f3), c0937i2, ((p013b0.c) interfaceC1084f3.x(CompositionLocalsKt.f14847h)).T0(f13)), kVar, RippleKt.c(false, 0.0f, interfaceC1084f3, 0, 7), z11, null, aVar, 24);
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar = composableLambdaImpl;
                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
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
                    androidx.compose.foundation.gestures.d.c(pVar, interfaceC1084f3, 0);
                }
                return p293xa.r.f47939a;
            }
        }, interfaceC1084f), interfaceC1084f, 56);
    }

    public static final androidx.compose.ui.h d(androidx.compose.ui.h hVar, androidx.compose.ui.graphics.l0 l0Var, long j, C0937i c0937i, float f10) {
        androidx.compose.ui.h hVarB = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarI = hVar.i(f10 > 0.0f ? androidx.compose.ui.graphics.T.b(hVarB, 0.0f, 0.0f, 0.0f, f10, 0.0f, l0Var, false, 124895) : hVarB);
        if (c0937i != null) {
            hVarB = C0935g.b(hVarB, c0937i.f10065a, c0937i.f10066b, l0Var);
        }
        return A8.p.r(C0932d.b(hVarI.i(hVarB), j, l0Var), l0Var);
    }

    public static final long e(long j, float f10, InterfaceC1084f interfaceC1084f) {
        C1061m c1061m = (C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a);
        boolean zBooleanValue = ((Boolean) interfaceC1084f.x(ColorSchemeKt.f12088b)).booleanValue();
        if (!androidx.compose.ui.graphics.H.c(j, c1061m.f12634p) || !zBooleanValue) {
            return j;
        }
        boolean zA = p013b0.f.a(f10, 0);
        long j10 = c1061m.f12634p;
        return zA ? j10 : Q3.d.i(androidx.compose.ui.graphics.H.b(((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, c1061m.f12638t), j10);
    }
}
