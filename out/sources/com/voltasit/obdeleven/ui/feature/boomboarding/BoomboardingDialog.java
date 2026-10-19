package com.voltasit.obdeleven.ui.feature.boomboarding;

import B8.M0;
import I.e;
import Ia.p;
import Ia.q;
import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.k;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.n;
import androidx.compose.foundation.pager.s;
import androidx.compose.material3.C1050e;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.f;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.F;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.K;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.common.collect.ImmutableList;
import com.obdeleven.feature.boomboarding.ui.BoomboardingVideoType;
import com.obdeleven.feature.boomboarding.ui.ComposableLifecycleKt;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.koin.compose.KoinApplicationKt;
import p078g1.v;
import p270w.g;
import p293xa.r;

/* JADX INFO: compiled from: BoomboardingDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BoomboardingDialog extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f34067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public M0 f34068s;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$special$$inlined$viewModel$default$1] */
    public BoomboardingDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                ActivityC1347l activity = this.this$0.getActivity();
                i.c(activity, "null cannot be cast to non-null type com.voltasit.obdeleven.ui.activity.MainActivity");
                return e.j(((MainActivity) activity).f33533B);
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$special$$inlined$viewModel$default$1
            final /* synthetic */ Fragment $this_viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_viewModel;
            }
        };
        this.f34067r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.ui.feature.boomboarding.b] */
            @Override // Ia.a
            public final b invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    public static final void L(final BoomboardingDialog boomboardingDialog, final PagerState pagerState, final com.obdeleven.feature.boomboarding.ui.c.b bVar, final com.obdeleven.feature.boomboarding.ui.a aVar, final com.obdeleven.feature.boomboarding.ui.b bVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        boomboardingDialog.getClass();
        C1086g c1086gP = interfaceC1084f.p(-618577985);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
            c1086gP.E(objF);
        }
        final A a10 = (A) objF;
        if (pagerState.j() == 0) {
            aVar.d(bVar);
        } else {
            aVar.c(bVar);
        }
        boomboardingDialog.K(bVar2.f29234a, c1086gP, 72);
        h.a aVar2 = h.a.f13984b;
        h hVarS = W.s(W.d(aVar2, 1.0f));
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarS);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        C0949i c0949i = C0949i.f10304a;
        h hVarC2 = W.c(W.d(aVar2, 1.0f), 0.8f);
        f fVar = androidx.compose.ui.d.a.f13342h;
        BoxKt.a(C0932d.a(c0949i.f(hVarC2, fVar), C.a.b(new Pair[]{new Pair(Float.valueOf(0.0f), new H(H.f13503k)), new Pair(Float.valueOf(0.65f), new H(Q3.d.e(4279308561L))), new Pair(Float.valueOf(1.0f), new H(Q3.d.e(4279308561L)))})), c1086gP, 0);
        h hVarC3 = W.c(c0949i.f(aVar2, fVar), 1.0f);
        float f10 = 24;
        h hVarM = O.h.m(PaddingKt.j(hVarC3, f10, 0.0f, f10, 56, 2));
        C0953m c0953mA = C0952l.a(C0945e.f10287d, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC4 = ComposedModifierKt.c(c1086gP, hVarM);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC4);
        C0955o c0955o = C0955o.f10310a;
        f.a aVar4 = androidx.compose.ui.d.a.f13347n;
        boomboardingDialog.y(c0955o, "Hi there 👋", aVar4, c1086gP, 4534, 0);
        boomboardingDialog.x(c0955o, "Scan, understand, and clear faults, unlock comfort features, and more – in a few clicks", aVar4, 3, 0.0f, c1086gP, 262582, 8);
        c.a(54, 28, 0L, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$IntroContent$1$1$1

            /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$IntroContent$1$1$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: BoomboardingDialog.kt */
            @Aa.c(c = "com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$IntroContent$1$1$1$1", f = "BoomboardingDialog.kt", l = {787}, m = "invokeSuspend")
            final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
                final /* synthetic */ PagerState $pagerState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PagerState pagerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$pagerState = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.$pagerState, cVar);
                }

                @Override // Ia.p
                public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.b.b(obj);
                        PagerState pagerState = this.$pagerState;
                        int iJ = pagerState.j() + 1;
                        this.label = 1;
                        if (pagerState.f(iJ, 0.0f, C0907g.c(0.0f, 0.0f, null, 7), this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return r.f47939a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                C2680e.c(a10, null, null, new AnonymousClass1(pagerState, null), 3);
                return r.f47939a;
            }
        }, c1086gP, PaddingKt.j(aVar2, 0.0f, 0.0f, 0.0f, 8, 7), "Show me how", false, false);
        d.a(54, 28, 0L, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$IntroContent$1$1$2
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                Dialog dialog = this.this$0.f17606m;
                if (dialog != null) {
                    dialog.dismiss();
                }
                return r.f47939a;
            }
        }, c1086gP, N0.a(aVar2, "onboarding_skip"), "I have OBDeleven device", false, false);
        C1105p0 c1105p0A = C4.a.a(c1086gP, true, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$IntroContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BoomboardingDialog.L(this.$tmp0_rcvr, pagerState, bVar, aVar, bVar2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void A(final PagerState pagerState, final com.obdeleven.feature.boomboarding.ui.c.a pageDetails, final com.obdeleven.feature.boomboarding.ui.a boomboardingPlayerViewModel, final com.obdeleven.feature.boomboarding.ui.b videoPlayerState, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(pagerState, "pagerState");
        i.e(pageDetails, "pageDetails");
        i.e(boomboardingPlayerViewModel, "boomboardingPlayerViewModel");
        i.e(videoPlayerState, "videoPlayerState");
        C1086g c1086gP = interfaceC1084f.p(-621056513);
        if (pagerState.j() == 2) {
            boomboardingPlayerViewModel.d(pageDetails);
        } else {
            boomboardingPlayerViewModel.c(pageDetails);
        }
        K(videoPlayerState.f29236c, c1086gP, 72);
        h.a aVar = h.a.f13984b;
        h hVarC = W.c(W.d(aVar, 1.0f), 1.0f);
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC2);
        BoxKt.a(C0932d.a(C0949i.f10304a.f(W.c(W.d(aVar, 1.0f), 0.8f), androidx.compose.ui.d.a.f13342h), C.a.b(new Pair[]{new Pair(Float.valueOf(0.0f), new H(H.f13503k)), new Pair(Float.valueOf(0.65f), new H(Q3.d.e(4279308561L))), new Pair(Float.valueOf(1.0f), new H(Q3.d.e(4279308561L)))})), c1086gP, 0);
        float f10 = 24;
        h hVarM = O.h.m(PaddingKt.j(W.d(W.c(aVar, 1.0f), 1.0f), f10, 0.0f, f10, 56, 2));
        C0945e.b bVar = C0945e.f10287d;
        f.a aVar3 = androidx.compose.ui.d.a.f13346m;
        C0953m c0953mA = C0952l.a(bVar, aVar3, c1086gP, 54);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, hVarM);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC3);
        C0955o c0955o = C0955o.f10310a;
        y(c0955o, "Enjoy easy diagnostics", aVar3, c1086gP, 4534, 0);
        x(c0955o, "Scan, read, and clear faults whenever, wherever you need", aVar3, 0, 0, c1086gP, 287158, 4);
        DividerKt.a(PaddingKt.h(aVar, 0.0f, 32, 1), 0.0f, Q3.d.d(452655866), c1086gP, 390, 2);
        B("Plug the device into vehicle’s OBD2 port", R.drawable.ic_obd_device, c1086gP, 566);
        B("Pair with OBDeleven app", R.drawable.ic_obd_app, c1086gP, 566);
        B("Tap \"Scan\" on your mobile app", R.drawable.ic_obd_scan, c1086gP, 566);
        C1105p0 c1105p0A = C4.a.a(c1086gP, true, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$DiagnosticsContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.A(pagerState, pageDetails, boomboardingPlayerViewModel, videoPlayerState, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void B(final String text, final int i10, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086g;
        i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(471181084);
        if ((i11 & 14) == 0) {
            i12 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(text) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar = h.a.f13984b;
            float f10 = 24;
            float f11 = 8;
            h hVarJ = PaddingKt.j(aVar, f11, 0.0f, f11, f10, 2);
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            ImageKt.a(U.c.a(i10, c1086gP, i13 & 14), null, W.e(W.q(aVar, f10), f10), null, null, 0.0f, null, c1086gP, 440, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            Lb.a.a(c1086gP, W.m(aVar, f11));
            TextKt.b(text, PaddingKt.j(aVar, 16, 0.0f, 0.0f, 0.0f, 14), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(4294967295L), G0.a.g(16), new androidx.compose.ui.text.font.l(510), 0L, 0, G0.a.g(20), 16646136), c1086gP, ((i13 >> 3) & 14) | 432, 0, 65528);
            c1086g = c1086gP;
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$DiagnosticsRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BoomboardingDialog boomboardingDialog = this.$tmp0_rcvr;
                    int i15 = i10;
                    boomboardingDialog.B(text, i15, interfaceC1084f2, L4.b.l(i11 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void C(final PagerState pagerState, final com.obdeleven.feature.boomboarding.ui.c.C0293c pageDetails, final com.obdeleven.feature.boomboarding.ui.a boomboardingPlayerViewModel, final com.obdeleven.feature.boomboarding.ui.b videoPlayerState, final Ia.a<r> onBoomBoardingWelcomeLightsClick, final Ia.a<r> onBoomBoardingUrbanJokeClick, final Ia.a<r> onBoomBoardingVideoInMotionClick, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(pagerState, "pagerState");
        i.e(pageDetails, "pageDetails");
        i.e(boomboardingPlayerViewModel, "boomboardingPlayerViewModel");
        i.e(videoPlayerState, "videoPlayerState");
        i.e(onBoomBoardingWelcomeLightsClick, "onBoomBoardingWelcomeLightsClick");
        i.e(onBoomBoardingUrbanJokeClick, "onBoomBoardingUrbanJokeClick");
        i.e(onBoomBoardingVideoInMotionClick, "onBoomBoardingVideoInMotionClick");
        C1086g c1086gP = interfaceC1084f.p(-609776735);
        if (pagerState.j() == 1) {
            boomboardingPlayerViewModel.d(pageDetails);
        } else {
            boomboardingPlayerViewModel.c(pageDetails);
        }
        K(videoPlayerState.f29235b, c1086gP, 72);
        h.a aVar = h.a.f13984b;
        h hVarS = W.s(W.d(aVar, 1.0f));
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarS);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        C0949i c0949i = C0949i.f10304a;
        h hVarC2 = W.c(W.d(aVar, 1.0f), 0.3f);
        f fVar = androidx.compose.ui.d.a.f13342h;
        BoxKt.a(C0932d.a(c0949i.f(hVarC2, fVar), C.a.b(new Pair[]{new Pair(Float.valueOf(0.0f), new H(H.f13503k)), new Pair(Float.valueOf(0.65f), new H(Q3.d.e(4279308561L))), new Pair(Float.valueOf(1.0f), new H(Q3.d.e(4279308561L)))})), c1086gP, 0);
        float f10 = 24;
        h hVarM = O.h.m(PaddingKt.j(c0949i.f(aVar, fVar), f10, 0.0f, f10, 56, 2));
        C0953m c0953mA = C0952l.a(C0945e.f10287d, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, hVarM);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC3);
        C0955o c0955o = C0955o.f10310a;
        y(c0955o, "Customize your car with a tap", null, c1086gP, 4150, 2);
        x(c0955o, "Explore our ready-to-use customizations.\nTap to see how some of them work:", null, 0, 0.0f, c1086gP, 262198, 14);
        BoomboardingVideoType boomboardingVideoType = BoomboardingVideoType.f29228b;
        BoomboardingVideoType boomboardingVideoType2 = pageDetails.f29237a;
        boolean z10 = boomboardingVideoType2 == boomboardingVideoType;
        boolean z11 = boomboardingVideoType2 == BoomboardingVideoType.f29229c;
        boolean z12 = boomboardingVideoType2 == BoomboardingVideoType.f29230d;
        T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 6);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        h hVarC4 = ComposedModifierKt.c(c1086gP, aVar);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC4);
        D(onBoomBoardingWelcomeLightsClick, "Welcome Lights", z10, c1086gP, ((i10 >> 12) & 14) | 4144);
        D(onBoomBoardingUrbanJokeClick, "Urban Joke", z11, c1086gP, ((i10 >> 15) & 14) | 4144);
        c1086gP.T(true);
        D(onBoomBoardingVideoInMotionClick, "Video in Motion", z12, c1086gP, ((i10 >> 18) & 14) | 4144);
        C1105p0 c1105p0A = C4.a.a(c1086gP, true, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OcaContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.C(pagerState, pageDetails, boomboardingPlayerViewModel, videoPlayerState, onBoomBoardingWelcomeLightsClick, onBoomBoardingUrbanJokeClick, onBoomBoardingVideoInMotionClick, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void D(final Ia.a<r> aVar, final String str, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(190107389);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar2 = h.a.f13984b;
            if (z10) {
                c1086gP.L(2119530007);
                float f10 = 8;
                androidx.compose.material3.ButtonKt.c(aVar, PaddingKt.j(aVar2, 0.0f, 0.0f, f10, 0.0f, 11), false, g.b(f10), new C1050e(Q3.d.e(4294638330L), Q3.d.e(4279308561L), Q3.d.e(4294638330L), Q3.d.e(4279308561L)), null, null, null, null, androidx.compose.runtime.internal.a.b(-1170863531, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OcaVideoButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        U TextButton = u10;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        i.e(TextButton, "$this$TextButton");
                        if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            IconKt.a(U.c.a(R.drawable.ic_play_filled, interfaceC1084f3, 6), null, PaddingKt.j(h.a.f13984b, 0.0f, 0.0f, 8, 0.0f, 11), Q3.d.e(4279308561L), interfaceC1084f3, 3512, 0);
                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(4279308561L), G0.a.g(14), new androidx.compose.ui.text.font.l(510), 0L, 3, G0.a.g(20), 16613368), interfaceC1084f3, 0, 384, 61438);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, (i11 & 14) | 805306416, 484);
                c1086gP.T(false);
            } else {
                c1086gP.L(2119531154);
                float f11 = 8;
                androidx.compose.material3.ButtonKt.c(aVar, PaddingKt.j(aVar2, 0.0f, 0.0f, f11, 0.0f, 11), false, g.b(f11), null, null, C1787c0.a(1, Q3.d.e(3002792698L)), null, null, androidx.compose.runtime.internal.a.b(-745908322, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OcaVideoButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        U TextButton = u10;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        i.e(TextButton, "$this$TextButton");
                        if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            IconKt.a(U.c.a(R.drawable.ic_play, interfaceC1084f3, 6), null, PaddingKt.j(h.a.f13984b, 0.0f, 0.0f, 8, 0.0f, 11), Q3.d.e(3002792698L), interfaceC1084f3, 3512, 0);
                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(3002792698L), G0.a.g(14), new androidx.compose.ui.text.font.l(510), 0L, 3, G0.a.g(20), 16613368), interfaceC1084f3, 0, 384, 61438);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, (i11 & 14) | 806879280, 436);
                c1086gP.T(false);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OcaVideoButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.D(aVar, str, z10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void E(final int i10, final String title, final String subtitle, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086g;
        i.e(title, "title");
        i.e(subtitle, "subtitle");
        C1086g c1086gP = interfaceC1084f.p(1111959149);
        if ((i11 & 14) == 0) {
            i12 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(title) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= c1086gP.K(subtitle) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar = h.a.f13984b;
            float f10 = 24;
            float f11 = 8;
            h hVarJ = PaddingKt.j(aVar, f11, 0.0f, f11, f10, 2);
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, tA);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            ImageKt.a(U.c.a(i10, c1086gP, i12 & 14), null, W.e(W.q(aVar, f10), f10), null, null, 0.0f, null, c1086gP, 440, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            Lb.a.a(c1086gP, W.m(aVar, f11));
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            float f12 = 16;
            int i15 = i12;
            TextKt.b(title, PaddingKt.j(aVar, f12, 0.0f, 0.0f, 0.0f, 14), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(4294967295L), G0.a.g(16), new androidx.compose.ui.text.font.l(510), 0L, 0, G0.a.g(20), 16646136), c1086gP, ((i15 >> 3) & 14) | 432, 0, 65528);
            Lb.a.a(c1086gP, W.m(aVar, 4));
            TextKt.b(subtitle, PaddingKt.j(aVar, f12, 0.0f, 0.0f, 0.0f, 14), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(3003121663L), G0.a.g(14), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), 0L, 0, G0.a.g(20), 16646136), c1086gP, ((i15 >> 6) & 14) | 432, 0, 65528);
            c1086g = c1086gP;
            c1086g.T(true);
            Lb.a.a(c1086g, W.m(aVar, f12));
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OrderNowRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.E(i10, title, subtitle, interfaceC1084f2, L4.b.l(i11 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void F(final Ia.a<r> onBoomBoardingOrderNowClick, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(onBoomBoardingOrderNowClick, "onBoomBoardingOrderNowClick");
        C1086g c1086gP = interfaceC1084f.p(968712600);
        C0945e.g gVar = C0945e.f10290g;
        h.a aVar = h.a.f13984b;
        f.a aVar2 = androidx.compose.ui.d.a.f13346m;
        C0953m c0953mA = C0952l.a(gVar, aVar2, c1086gP, 6);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, aVar);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, c0953mA);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar3);
        }
        p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        C0955o c0955o = C0955o.f10310a;
        h hVarA = c0955o.a(false);
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, eD);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        Painter painterA = U.c.a(R.drawable.background_can_logo, c1086gP, 6);
        FillElement fillElement = W.f10226c;
        ImageKt.a(painterA, null, fillElement, null, InterfaceC1161g.a.f14243a, 0.0f, null, c1086gP, 25016, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        float f10 = 24;
        float f11 = 56;
        h hVarJ = PaddingKt.j(ScrollKt.b(fillElement, ScrollKt.a(0, c1086gP, 0, 1), false, 14), f10, 0.0f, f10, f11, 2);
        C0945e.k kVar = C0945e.f10286c;
        C0953m c0953mA2 = C0952l.a(kVar, aVar2, c1086gP, 6);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, hVarJ);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA2);
        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC3);
        Lb.a.a(c1086gP, W.e(aVar, 50));
        ImageKt.a(U.c.a(R.drawable.obdeleven_v3_glow_front, c1086gP, 6), null, PaddingKt.f(W.d(aVar, 1.0f), f10), null, InterfaceC1161g.a.f14246d, 0.0f, null, c1086gP, 25016, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        DividerKt.a(PaddingKt.j(aVar, 0.0f, 0.0f, 0.0f, f10, 7), 0.0f, Q3.d.d(452655866), c1086gP, 390, 2);
        y(c0955o, "Meet OBDeleven 3", aVar2, c1086gP, 4534, 0);
        x(c0955o, "Take your diagnostics and customizations to a whole new level", aVar2, 0, 0.0f, c1086gP, 262582, 12);
        E(R.drawable.ic_check_white, "Officially licensed", "by Volkswagen, BMW, Toyota, and Ford Groups", c1086gP, 4534);
        E(R.drawable.ic_car_white, "3+ million", "Vehicles connected worldwide.", c1086gP, 4534);
        E(R.drawable.ic_eu, "Designed in Europe", "Developed in Lithuania.", c1086gP, 4534);
        E(R.drawable.ic_device, "Features for every driver", "Easy diagnostics, customizations, and more", c1086gP, 4534);
        c1086gP.T(true);
        c1086gP.T(true);
        h hVarJ2 = PaddingKt.j(C0932d.b(aVar, Q3.d.e(4279308561L), h0.f13629a), f10, 0.0f, f10, f11, 2);
        C0953m c0953mA3 = C0952l.a(kVar, aVar2, c1086gP, 0);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
        h hVarC4 = ComposedModifierKt.c(c1086gP, hVarJ2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA3);
        R0.a(pVar2, c1086gP, interfaceC1089h0P4);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC4);
        DividerKt.a(null, 0.0f, Q3.d.d(452655866), c1086gP, 384, 3);
        Lb.a.a(c1086gP, W.e(aVar, 16));
        h hVarB = c0955o.b(aVar, androidx.compose.ui.d.a.f13347n);
        long jG = G0.a.g(0);
        TextKt.b("14 days money-back guarantee", hVarB, Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(4294967295L), G0.a.g(12), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), jG, 0, G0.a.g(14), 16646008), c1086gP, 390, 0, 65528);
        float f12 = 8;
        Lb.a.a(c1086gP, W.e(aVar, f12));
        h hVarM = O.h.m(aVar);
        C0953m c0953mA4 = C0952l.a(kVar, aVar2, c1086gP, 0);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
        h hVarC5 = ComposedModifierKt.c(c1086gP, hVarM);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA4);
        R0.a(pVar2, c1086gP, interfaceC1089h0P5);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
            J4.i.d(i15, c1086gP, i15, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC5);
        c.a(54, 28, 0L, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OrderNowV3Content$1$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                onBoomBoardingOrderNowClick.invoke();
                Dialog dialog = this.f17606m;
                if (dialog != null) {
                    dialog.dismiss();
                }
                return r.f47939a;
            }
        }, c1086gP, PaddingKt.j(aVar, 0.0f, 0.0f, 0.0f, f12, 7), "Order now", false, false);
        d.a(6, 30, 0L, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OrderNowV3Content$1$2$1$2
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                Dialog dialog = this.this$0.f17606m;
                if (dialog != null) {
                    dialog.dismiss();
                }
                return r.f47939a;
            }
        }, c1086gP, null, "Continue without device", false, false);
        c1086gP.T(true);
        c1086gP.T(true);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$OrderNowV3Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.F(onBoomBoardingOrderNowClick, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void G(final PagerState pagerState, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(pagerState, "pagerState");
        C1086g c1086gP = interfaceC1084f.p(831836095);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(pagerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar = h.a.f13984b;
            h hVarD = W.d(W.s(aVar), 1.0f);
            T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.j, c1086gP, 6);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c1086gP.L(-1187760882);
            int iM = pagerState.m();
            int i13 = 0;
            while (i13 < iM) {
                float f10 = 8;
                BoxKt.a(W.m(C0932d.b(PaddingKt.f(aVar, f10), pagerState.j() == i13 ? H.f13498e : H.f13496c, g.f47680a), f10), c1086gP, 0);
                i13++;
            }
            c1086gP.T(false);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$PageIndication$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.G(pagerState, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void H(final PagerState pagerState, final List<? extends com.obdeleven.feature.boomboarding.ui.c> pageDetails, final com.obdeleven.feature.boomboarding.ui.a boomboardingPlayerViewModel, final com.obdeleven.feature.boomboarding.ui.b videoPlayerState, final Ia.a<r> onBoomBoardingOrderNowClick, final Ia.a<r> onBoomBoardingWelcomeLightsClick, final Ia.a<r> onBoomBoardingUrbanJokeClick, final Ia.a<r> onBoomBoardingVideoInMotionClick, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(pagerState, "pagerState");
        i.e(pageDetails, "pageDetails");
        i.e(boomboardingPlayerViewModel, "boomboardingPlayerViewModel");
        i.e(videoPlayerState, "videoPlayerState");
        i.e(onBoomBoardingOrderNowClick, "onBoomBoardingOrderNowClick");
        i.e(onBoomBoardingWelcomeLightsClick, "onBoomBoardingWelcomeLightsClick");
        i.e(onBoomBoardingUrbanJokeClick, "onBoomBoardingUrbanJokeClick");
        i.e(onBoomBoardingVideoInMotionClick, "onBoomBoardingVideoInMotionClick");
        C1086g c1086gP = interfaceC1084f.p(-1734041791);
        O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
        final Context context = (Context) c1086gP.x(o10);
        final String packageName = ((Context) c1086gP.x(o10)).getPackageName();
        ComposableLifecycleKt.a(null, new p<InterfaceC1376t, Lifecycle.Event, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$Pager$1

            /* JADX INFO: compiled from: BoomboardingDialog.kt */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f34073a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f34073a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                v vVar;
                Object value;
                Object value2;
                Lifecycle.Event event2 = event;
                i.e(interfaceC1376t, "<anonymous parameter 0>");
                i.e(event2, "event");
                int i11 = a.f34073a[event2.ordinal()];
                if (i11 == 1) {
                    com.obdeleven.feature.boomboarding.ui.a aVar = boomboardingPlayerViewModel;
                    Context context2 = context;
                    String packageName2 = packageName;
                    i.d(packageName2, "$packageName");
                    aVar.getClass();
                    i.e(context2, "context");
                    StateFlowImpl stateFlowImpl = aVar.f29232a;
                    v vVar2 = ((com.obdeleven.feature.boomboarding.ui.b) stateFlowImpl.getValue()).f29234a;
                    if (vVar2 == null) {
                        vVar = vVar2;
                        K kA = new ExoPlayer.b(context2).a();
                        kA.M(1);
                        kA.B0();
                        kA.y0(1, false);
                        kA.h0(ImmutableList.M(com.obdeleven.feature.boomboarding.ui.a.b(R.raw.intro_boomboarding, packageName2)));
                        kA.b();
                        vVar = kA;
                    }
                    vVar = vVar2;
                    v vVar3 = ((com.obdeleven.feature.boomboarding.ui.b) stateFlowImpl.getValue()).f29235b;
                    v vVar4 = vVar3;
                    if (vVar3 == null) {
                        K kA2 = new ExoPlayer.b(context2).a();
                        kA2.M(1);
                        kA2.B0();
                        kA2.y0(1, true);
                        kA2.h0(kotlin.collections.l.s(com.obdeleven.feature.boomboarding.ui.a.b(R.raw.welcome_lights, packageName2), com.obdeleven.feature.boomboarding.ui.a.b(R.raw.urban_joke, packageName2), com.obdeleven.feature.boomboarding.ui.a.b(R.raw.video_in_motion, packageName2)));
                        kA2.b();
                        vVar4 = kA2;
                    }
                    v vVar5 = ((com.obdeleven.feature.boomboarding.ui.b) stateFlowImpl.getValue()).f29236c;
                    v vVar6 = vVar5;
                    if (vVar5 == null) {
                        K kA3 = new ExoPlayer.b(context2).a();
                        kA3.M(1);
                        kA3.B0();
                        kA3.y0(1, true);
                        kA3.h0(ImmutableList.M(com.obdeleven.feature.boomboarding.ui.a.b(R.raw.diagnostics, packageName2)));
                        kA3.b();
                        vVar6 = kA3;
                    }
                    do {
                        value = stateFlowImpl.getValue();
                        ((com.obdeleven.feature.boomboarding.ui.b) value).getClass();
                    } while (!stateFlowImpl.d(value, new com.obdeleven.feature.boomboarding.ui.b(vVar, vVar4, vVar6)));
                } else if (i11 == 2) {
                    StateFlowImpl stateFlowImpl2 = boomboardingPlayerViewModel.f29232a;
                    do {
                        value2 = stateFlowImpl2.getValue();
                        com.obdeleven.feature.boomboarding.ui.b bVar = (com.obdeleven.feature.boomboarding.ui.b) value2;
                        v vVar7 = bVar.f29234a;
                        if (vVar7 != null) {
                            vVar7.a();
                        }
                        v vVar8 = bVar.f29235b;
                        if (vVar8 != null) {
                            vVar8.a();
                        }
                        v vVar9 = bVar.f29236c;
                        if (vVar9 != null) {
                            vVar9.a();
                        }
                    } while (!stateFlowImpl2.d(value2, new com.obdeleven.feature.boomboarding.ui.b(null, null, null)));
                }
                return r.f47939a;
            }
        }, c1086gP, 0, 1);
        PagerKt.a(pagerState, null, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, androidx.compose.runtime.internal.a.b(-431346080, new Ia.r<n, Integer, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$Pager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // Ia.r
            public final r invoke(n nVar, Integer num, InterfaceC1084f interfaceC1084f2, Integer num2) {
                n HorizontalPager = nVar;
                int iIntValue = num.intValue();
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                num2.intValue();
                i.e(HorizontalPager, "$this$HorizontalPager");
                f fVar = androidx.compose.ui.d.a.f13342h;
                h hVarB = C0932d.b(W.f10226c, Q3.d.e(4279308561L), h0.f13629a);
                List<com.obdeleven.feature.boomboarding.ui.c> list = pageDetails;
                BoomboardingDialog boomboardingDialog = this;
                PagerState pagerState2 = pagerState;
                com.obdeleven.feature.boomboarding.ui.a aVar = boomboardingPlayerViewModel;
                com.obdeleven.feature.boomboarding.ui.b bVar = videoPlayerState;
                Ia.a<r> aVar2 = onBoomBoardingWelcomeLightsClick;
                Ia.a<r> aVar3 = onBoomBoardingUrbanJokeClick;
                Ia.a<r> aVar4 = onBoomBoardingVideoInMotionClick;
                Ia.a<r> aVar5 = onBoomBoardingOrderNowClick;
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int iF = interfaceC1084f3.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f3.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f3.r();
                if (interfaceC1084f3.m()) {
                    interfaceC1084f3.v(aVar6);
                } else {
                    interfaceC1084f3.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                    k.b(iF, interfaceC1084f3, iF, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                com.obdeleven.feature.boomboarding.ui.c cVar = list.get(iIntValue);
                if (cVar instanceof com.obdeleven.feature.boomboarding.ui.c.b) {
                    interfaceC1084f3.L(1953432503);
                    BoomboardingDialog.L(boomboardingDialog, pagerState2, (com.obdeleven.feature.boomboarding.ui.c.b) cVar, aVar, bVar, interfaceC1084f3, 37376);
                    interfaceC1084f3.D();
                } else if (cVar instanceof com.obdeleven.feature.boomboarding.ui.c.C0293c) {
                    interfaceC1084f3.L(1953432749);
                    boomboardingDialog.C(pagerState2, (com.obdeleven.feature.boomboarding.ui.c.C0293c) cVar, aVar, bVar, aVar2, aVar3, aVar4, interfaceC1084f3, 16781824);
                    interfaceC1084f3.D();
                } else if (cVar instanceof com.obdeleven.feature.boomboarding.ui.c.a) {
                    interfaceC1084f3.L(1953433170);
                    boomboardingDialog.A(pagerState2, (com.obdeleven.feature.boomboarding.ui.c.a) cVar, aVar, bVar, interfaceC1084f3, 37376);
                    interfaceC1084f3.D();
                } else if (cVar instanceof com.obdeleven.feature.boomboarding.ui.c.d) {
                    interfaceC1084f3.L(1953433382);
                    boomboardingDialog.F(aVar5, interfaceC1084f3, 64);
                    interfaceC1084f3.D();
                } else {
                    interfaceC1084f3.L(1953433446);
                    interfaceC1084f3.D();
                }
                interfaceC1084f3.J();
                return r.f47939a;
            }
        }, c1086gP), c1086gP, i10 & 14, 24576, 16382);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$Pager$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.H(pagerState, pageDetails, boomboardingPlayerViewModel, videoPlayerState, onBoomBoardingOrderNowClick, onBoomBoardingWelcomeLightsClick, onBoomBoardingUrbanJokeClick, onBoomBoardingVideoInMotionClick, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    public final void I(InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(50145163);
        ?? r10 = this.f34067r;
        z((List) ((b) r10.getValue()).f34081g.getValue(), new BoomboardingDialog$ScreenContent$1(0, (b) r10.getValue(), b.class, "onBoomboardingWelcomeLightsClick", "onBoomboardingWelcomeLightsClick()V", 0), new BoomboardingDialog$ScreenContent$2(0, (b) r10.getValue(), b.class, "onBoomboardingUrbanJokeClick", "onBoomboardingUrbanJokeClick()V", 0), new BoomboardingDialog$ScreenContent$3(0, (b) r10.getValue(), b.class, "onBoomboardingVideoInMotionClick", "onBoomboardingVideoInMotionClick()V", 0), new BoomboardingDialog$ScreenContent$4(0, (b) r10.getValue(), b.class, "onBoomboardingOrderNowClick", "onBoomboardingOrderNowClick()V", 0), c1086gP, 262152);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$ScreenContent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.I(interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void J(final U u10, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(u10, "<this>");
        C1086g c1086gP = interfaceC1084f.p(18958067);
        h.a aVar = h.a.f13984b;
        float f10 = 16;
        h hVarA = u10.a(C0932d.b(A8.p.r(PaddingKt.j(aVar, 0.0f, 0.0f, f10, 0.0f, 11), g.b(20)), Q3.d.d(234552058), h0.f13629a));
        c1086gP.L(1293517044);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = new androidx.compose.foundation.interaction.l();
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        h hVarB = ClickableKt.b(hVarA, (androidx.compose.foundation.interaction.k) objF, RippleKt.b(0.0f, 7, false), false, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$SkipButton$2
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                Dialog dialog = this.this$0.f17606m;
                if (dialog != null) {
                    dialog.dismiss();
                }
                return r.f47939a;
            }
        }, 28);
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        TextKt.b("Skip", PaddingKt.g(f10, 8, aVar), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new F(Q3.d.e(4294967295L), G0.a.g(14), new androidx.compose.ui.text.font.l(590), 0L, 3, G0.a.g(20), 16613368), c1086gP, 54, 0, 65532);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$SkipButton$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp1_rcvr.J(u10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void K(final v vVar, InterfaceC1084f interfaceC1084f, final int i10) {
        Object obj;
        C1086g c1086gP = interfaceC1084f.p(-1903151335);
        FillElement fillElement = W.f10226c;
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, fillElement);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1538258667);
        if (vVar != null) {
            c1086gP.L(-1407330872);
            Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            c1086gP.L(1409735266);
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                obj = objF;
                androidx.media3.ui.d dVar = new androidx.media3.ui.d(context);
                dVar.setUseController(false);
                dVar.setResizeMode(3);
                dVar.setShowBuffering(0);
                dVar.setPlayer(vVar);
                c1086gP.E(dVar);
                obj = dVar;
            }
            obj = objF;
            final androidx.media3.ui.d dVar2 = (androidx.media3.ui.d) obj;
            c1086gP.T(false);
            E.a(vVar, new Ia.l<B, androidx.compose.runtime.A>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$rememberPlayerView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(B b10) {
                    B DisposableEffect = b10;
                    i.e(DisposableEffect, "$this$DisposableEffect");
                    dVar2.setPlayer(vVar);
                    return new a(dVar2);
                }
            }, c1086gP);
            c1086gP.T(false);
            AndroidView_androidKt.b(new Ia.l<Context, androidx.media3.ui.d>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$VideoView$1$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.media3.ui.d invoke(Context context2) {
                    Context it = context2;
                    i.e(it, "it");
                    return dVar2;
                }
            }, fillElement, null, c1086gP, 48, 4);
        }
        c1086gP.T(false);
        BoxKt.a(C0932d.a(fillElement, C.a.a(kotlin.collections.l.s(new H(H.f13503k), new H(H.f13495b)), 0.5f, 0.1f, 8)), c1086gP, 6);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$VideoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.K(vVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        LayoutInflater layoutInflater = getLayoutInflater();
        int i10 = M0.f1753t;
        M0 m7 = (M0) M0.e.a(layoutInflater, R.layout.full_screen_dialog, viewGroup, false, null);
        i.d(m7, "inflate(...)");
        this.f34068s = m7;
        Toolbar toolbar = m7.f1755s;
        i.d(toolbar, "toolbar");
        W8.d.f(toolbar, false);
        M0 m10 = this.f34068s;
        if (m10 == null) {
            i.m("binding");
            throw null;
        }
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f14973a;
        ComposeView composeView = m10.f1754r;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView.setContent(new ComposableLambdaImpl(true, -721849092, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$onCreateView$1$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    this.this$0.I(interfaceC1084f2, 8);
                }
                return r.f47939a;
            }
        }));
        M0 m11 = this.f34068s;
        if (m11 == null) {
            i.m("binding");
            throw null;
        }
        View view = m11.f4488d;
        i.d(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            ActionBar actionBar = dialog.getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.AppTheme_Slide);
            }
            Window window3 = dialog.getWindow();
            if (window3 == null) {
                return;
            }
            window3.setStatusBarColor(p0.a.b.a(requireContext(), R.color.black));
        }
    }

    public final void w(final U u10, final PagerState pagerState, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(u10, "<this>");
        i.e(pagerState, "pagerState");
        C1086g c1086gP = interfaceC1084f.p(-937480967);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(u10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(pagerState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF);
            }
            final A a10 = (A) objF;
            int iJ = pagerState.j();
            f fVar = androidx.compose.ui.d.a.f13335a;
            h.a aVar = h.a.f13984b;
            if (iJ == 0) {
                c1086gP.L(1577760236);
                h hVarA = u10.a(W.m(aVar, 40));
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int i12 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                    J4.i.d(i12, c1086gP, i12, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                c1086gP.L(1577760411);
                h hVarA2 = u10.a(C0932d.b(A8.p.r(W.m(PaddingKt.j(aVar, 16, 0.0f, 0.0f, 0.0f, 14), 40), g.b(20)), Q3.d.d(234552058), h0.f13629a));
                c1086gP.L(1577760764);
                Object objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                h hVarB = ClickableKt.b(hVarA2, (androidx.compose.foundation.interaction.k) objF2, RippleKt.b(0.0f, 7, false), false, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BackButton$3

                    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BackButton$3$1, reason: invalid class name */
                    /* JADX INFO: compiled from: BoomboardingDialog.kt */
                    @Aa.c(c = "com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BackButton$3$1", f = "BoomboardingDialog.kt", l = {289}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
                        final /* synthetic */ PagerState $pagerState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(PagerState pagerState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$pagerState = pagerState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.$pagerState, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.b.b(obj);
                                PagerState pagerState = this.$pagerState;
                                int iJ = pagerState.j() - 1;
                                this.label = 1;
                                if (pagerState.f(iJ, 0.0f, C0907g.c(0.0f, 0.0f, null, 7), this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                            }
                            return r.f47939a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        if (pagerState.c()) {
                            C2680e.c(a10, null, null, new AnonymousClass1(pagerState, null), 3);
                        }
                        return r.f47939a;
                    }
                }, 28);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                int i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                IconKt.a(U.c.a(R.drawable.baseline_arrow_back_24, c1086gP, 6), null, C0949i.f10304a.f(W.m(aVar, 24), androidx.compose.ui.d.a.f13339e), Q3.d.e(4294967295L), c1086gP, 3128, 0);
                c1086gP.T(true);
                c1086gP.T(false);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BackButton$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp1_rcvr.w(u10, pagerState, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4 A[PHI: r1 r8 r9
      0x00c4: PHI (r1v22 int) = (r1v18 int), (r1v17 int), (r1v24 int) binds: [B:77:0x00d6, B:69:0x00c0, B:70:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r8v11 androidx.compose.ui.d$b) = (r8v3 androidx.compose.ui.d$b), (r8v2 androidx.compose.ui.d$b), (r8v2 androidx.compose.ui.d$b) binds: [B:77:0x00d6, B:69:0x00c0, B:70:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r9v11 int) = (r9v7 int), (r9v6 int), (r9v6 int) binds: [B:77:0x00d6, B:69:0x00c0, B:70:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final void x(final InterfaceC0954n interfaceC0954n, final String str, androidx.compose.ui.d.b bVar, int i10, float f10, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.ui.d.b bVar2;
        int i15;
        int i16;
        int i17;
        float f11;
        int i18;
        int i19;
        final float f12;
        androidx.compose.ui.d.b bVar3;
        final int i20;
        final androidx.compose.ui.d.b bVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(369926266);
        if ((i12 & Integer.MIN_VALUE) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.K(interfaceC0954n) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) == 0) {
            if ((i11 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i13 |= c1086gP.K(str) ? 32 : 16;
            }
            i14 = i12 & 2;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    bVar2 = bVar;
                    if (c1086gP.K(bVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 7168) == 0) {
                    if ((i12 & 4) == 0) {
                        i16 = i10;
                        int i21 = c1086gP.h(i16) ? 2048 : 1024;
                        i13 |= i21;
                    } else {
                        i16 = i10;
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i17 = i12 & 8;
                if (i17 != 0) {
                    if ((57344 & i11) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i13 |= i18;
                    }
                    if ((46811 & i13) == 9362 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0 || c1086gP.a0()) {
                            if (i14 != 0) {
                                bVar2 = androidx.compose.ui.d.a.f13346m;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -7169;
                                i16 = 5;
                            }
                            if (i17 != 0) {
                                i19 = i13;
                                f12 = 32;
                                bVar3 = bVar2;
                                i20 = i16;
                            }
                            c1086gP.U();
                            TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                            bVar4 = bVar3;
                        } else {
                            c1086gP.w();
                            if ((i12 & 4) != 0) {
                                i13 &= -7169;
                            }
                        }
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                        c1086gP.U();
                        TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                        bVar4 = bVar3;
                    } else {
                        c1086gP.w();
                        bVar4 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                f11 = f10;
                if ((46811 & i13) == 9362) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    } else {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    }
                    c1086gP.U();
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                    bVar4 = bVar3;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    } else {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    }
                    c1086gP.U();
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                    bVar4 = bVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return r.f47939a;
                        }
                    };
                }
            }
            i13 |= 384;
            bVar2 = bVar;
            if ((i11 & 7168) == 0) {
                if ((i12 & 4) == 0) {
                    i16 = i10;
                    if (c1086gP.h(i16)) {
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            i17 = i12 & 8;
            if (i17 != 0) {
                if ((57344 & i11) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((46811 & i13) == 9362) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    } else {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    }
                    c1086gP.U();
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                    bVar4 = bVar3;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    } else {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    }
                    c1086gP.U();
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                    bVar4 = bVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            f11 = f10;
            if ((46811 & i13) == 9362) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                } else {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                bVar4 = bVar3;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                } else {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                bVar4 = bVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        i14 = i12 & 2;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                bVar2 = bVar;
                if (c1086gP.K(bVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 4) == 0) {
                    i16 = i10;
                    if (c1086gP.h(i16)) {
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            i17 = i12 & 8;
            if (i17 != 0) {
                if ((57344 & i11) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((46811 & i13) == 9362) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    } else {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    }
                    c1086gP.U();
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                    bVar4 = bVar3;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    } else {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.d.a.f13346m;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -7169;
                            i16 = 5;
                        }
                        if (i17 != 0) {
                            i19 = i13;
                            f12 = 32;
                            bVar3 = bVar2;
                            i20 = i16;
                        } else {
                            i19 = i13;
                            bVar3 = bVar2;
                            i20 = i16;
                            f12 = f11;
                        }
                    }
                    c1086gP.U();
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                    bVar4 = bVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            f11 = f10;
            if ((46811 & i13) == 9362) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                } else {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                bVar4 = bVar3;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                } else {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                bVar4 = bVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        bVar2 = bVar;
        if ((i11 & 7168) == 0) {
            if ((i12 & 4) == 0) {
                i16 = i10;
                if (c1086gP.h(i16)) {
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            i13 |= i21;
        } else {
            i16 = i10;
        }
        i17 = i12 & 8;
        if (i17 != 0) {
            if ((57344 & i11) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i13 |= i18;
            }
            if ((46811 & i13) == 9362) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                } else {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                bVar4 = bVar3;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                } else {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.d.a.f13346m;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -7169;
                        i16 = 5;
                    }
                    if (i17 != 0) {
                        i19 = i13;
                        f12 = 32;
                        bVar3 = bVar2;
                        i20 = i16;
                    } else {
                        i19 = i13;
                        bVar3 = bVar2;
                        i20 = i16;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
                bVar4 = bVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        f11 = f10;
        if ((46811 & i13) == 9362) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.d.a.f13346m;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -7169;
                    i16 = 5;
                }
                if (i17 != 0) {
                    i19 = i13;
                    f12 = 32;
                    bVar3 = bVar2;
                    i20 = i16;
                } else {
                    i19 = i13;
                    bVar3 = bVar2;
                    i20 = i16;
                    f12 = f11;
                }
            } else {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.d.a.f13346m;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -7169;
                    i16 = 5;
                }
                if (i17 != 0) {
                    i19 = i13;
                    f12 = 32;
                    bVar3 = bVar2;
                    i20 = i16;
                } else {
                    i19 = i13;
                    bVar3 = bVar2;
                    i20 = i16;
                    f12 = f11;
                }
            }
            c1086gP.U();
            TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
            bVar4 = bVar3;
        } else {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.d.a.f13346m;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -7169;
                    i16 = 5;
                }
                if (i17 != 0) {
                    i19 = i13;
                    f12 = 32;
                    bVar3 = bVar2;
                    i20 = i16;
                } else {
                    i19 = i13;
                    bVar3 = bVar2;
                    i20 = i16;
                    f12 = f11;
                }
            } else {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.d.a.f13346m;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -7169;
                    i16 = 5;
                }
                if (i17 != 0) {
                    i19 = i13;
                    f12 = 32;
                    bVar3 = bVar2;
                    i20 = i16;
                } else {
                    i19 = i13;
                    bVar3 = bVar2;
                    i20 = i16;
                    f12 = f11;
                }
            }
            c1086gP.U();
            TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, f12, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(i20), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(16), new androidx.compose.ui.text.font.l(CarouselScreenFragment.CAROUSEL_ANIMATION_MS), G0.a.g(0), 0, G0.a.g(18), 16646009), c1086gP, ((i19 >> 3) & 14) | 384 | ((i19 << 18) & 1879048192), 0, 65016);
            bVar4 = bVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingSubtitle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.x(interfaceC0954n, str, bVar4, i20, f12, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public final void y(final InterfaceC0954n interfaceC0954n, final String str, androidx.compose.ui.d.b bVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.d.b bVar2;
        int i14;
        androidx.compose.ui.d.b bVar3;
        final androidx.compose.ui.d.b bVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1822122708);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(interfaceC0954n) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) == 0) {
            if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.K(str) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    bVar2 = bVar;
                    if (c1086gP.K(bVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 731) == 146 || !c1086gP.s()) {
                    if (i13 != 0) {
                        bVar3 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar3 = bVar2;
                    }
                    TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
                    bVar4 = bVar3;
                } else {
                    c1086gP.w();
                    bVar4 = bVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingTitle$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.y(interfaceC0954n, str, bVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            bVar2 = bVar;
            if ((i12 & 731) == 146) {
                if (i13 != 0) {
                    bVar3 = androidx.compose.ui.d.a.f13346m;
                } else {
                    bVar3 = bVar2;
                }
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
                bVar4 = bVar3;
            } else {
                if (i13 != 0) {
                    bVar3 = androidx.compose.ui.d.a.f13346m;
                } else {
                    bVar3 = bVar2;
                }
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
                bVar4 = bVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingTitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.y(interfaceC0954n, str, bVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 2;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                bVar2 = bVar;
                if (c1086gP.K(bVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 731) == 146) {
                if (i13 != 0) {
                    bVar3 = androidx.compose.ui.d.a.f13346m;
                } else {
                    bVar3 = bVar2;
                }
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
                bVar4 = bVar3;
            } else {
                if (i13 != 0) {
                    bVar3 = androidx.compose.ui.d.a.f13346m;
                } else {
                    bVar3 = bVar2;
                }
                TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
                bVar4 = bVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingTitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.y(interfaceC0954n, str, bVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        bVar2 = bVar;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                bVar3 = androidx.compose.ui.d.a.f13346m;
            } else {
                bVar3 = bVar2;
            }
            TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
            bVar4 = bVar3;
        } else {
            if (i13 != 0) {
                bVar3 = androidx.compose.ui.d.a.f13346m;
            } else {
                bVar3 = bVar2;
            }
            TextKt.b(str, PaddingKt.j(interfaceC0954n.b(h.a.f13984b, bVar3), 0.0f, 0.0f, 0.0f, 8, 7), Q3.d.e(4294967295L), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, new F(0L, G0.a.g(32), new androidx.compose.ui.text.font.l(700), G0.a.g(0), 0, G0.a.g(38), 16646009), c1086gP, ((i12 >> 3) & 14) | 384, 0, 65016);
            bVar4 = bVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomBoardingTitle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.y(interfaceC0954n, str, bVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(final List<? extends com.obdeleven.feature.boomboarding.ui.c> pageDetails, final Ia.a<r> onBoomBoardingWelcomeLightsClick, final Ia.a<r> onBoomBoardingUrbanJokeClick, final Ia.a<r> onBoomBoardingVideoInMotionClick, final Ia.a<r> onBoomBoardingOrderNowClick, InterfaceC1084f interfaceC1084f, final int i10) {
        p<ComposeUiNode, Integer, r> pVar;
        i.e(pageDetails, "pageDetails");
        i.e(onBoomBoardingWelcomeLightsClick, "onBoomBoardingWelcomeLightsClick");
        i.e(onBoomBoardingUrbanJokeClick, "onBoomBoardingUrbanJokeClick");
        i.e(onBoomBoardingVideoInMotionClick, "onBoomBoardingVideoInMotionClick");
        i.e(onBoomBoardingOrderNowClick, "onBoomBoardingOrderNowClick");
        C1086g c1086gP = interfaceC1084f.p(1376221236);
        DefaultPagerState defaultPagerStateB = s.b(0, new Ia.a<Integer>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomboardingContent$pagerState$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ Integer invoke() {
                return 4;
            }
        }, c1086gP, 384, 3);
        c1086gP.e(-1614864554);
        c0 c0VarA = p027c1.b.a(c1086gP);
        if (c0VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
        androidx.compose.runtime.C c10 = KoinApplicationKt.f45751a;
        c1086gP.e(1668867238);
        org.koin.core.scope.a aVar = (org.koin.core.scope.a) c1086gP.x(KoinApplicationKt.f45751a);
        c1086gP.T(false);
        Y yA = Gb.a.a(l.a(com.obdeleven.feature.boomboarding.ui.a.class), c0VarA.getViewModelStore(), null, aVarA, null, aVar, null);
        c1086gP.T(false);
        com.obdeleven.feature.boomboarding.ui.a aVar2 = (com.obdeleven.feature.boomboarding.ui.a) yA;
        X xA = J0.a(aVar2.f29233b, c1086gP, 8);
        E.d(new BoomboardingDialog$BoomboardingContent$1(defaultPagerStateB, new Ref$IntRef(), null), c1086gP, defaultPagerStateB);
        h.a aVar3 = h.a.f13984b;
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, aVar3);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar4);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar2 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar2, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar3 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar3, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar4 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar4);
        }
        p<ComposeUiNode, h, r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC);
        f fVar = androidx.compose.ui.d.a.f13342h;
        h hVarB = androidx.compose.ui.semantics.p.b(aVar3, false, new Ia.l<w, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomboardingContent$2$1
            @Override // Ia.l
            public final r invoke(w wVar) {
                w semantics = wVar;
                i.e(semantics, "$this$semantics");
                Oa.l<Object>[] lVarArr = u.f15252a;
                androidx.compose.ui.semantics.v<Boolean> vVar = SemanticsPropertiesAndroid.f15186a;
                Oa.l<Object> lVar = u.f15252a[0];
                semantics.e(vVar, Boolean.TRUE);
                return r.f47939a;
            }
        });
        FillElement fillElement = W.f10226c;
        h hVarI = hVarB.i(fillElement);
        androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar4);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, eD2);
        R0.a(pVar3, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar4);
        }
        R0.a(pVar5, c1086gP, hVarC2);
        int i13 = i10 << 12;
        H(defaultPagerStateB, pageDetails, aVar2, (com.obdeleven.feature.boomboarding.ui.b) xA.getValue(), onBoomBoardingOrderNowClick, onBoomBoardingWelcomeLightsClick, onBoomBoardingUrbanJokeClick, onBoomBoardingVideoInMotionClick, c1086gP, (i10 & 57344) | 134222400 | (458752 & i13) | (3670016 & i13) | (i13 & 29360128));
        c1086gP.T(true);
        h hVarM = O.h.m(PaddingKt.j(fillElement, 0.0f, 24, 0.0f, 20, 5));
        C0945e.g gVar = C0945e.f10290g;
        C0953m c0953mA = C0952l.a(gVar, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        h hVarC3 = ComposedModifierKt.c(c1086gP, hVarM);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar4);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, c0953mA);
        R0.a(pVar3, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
            pVar = pVar4;
            J4.i.d(i14, c1086gP, i14, pVar);
        } else {
            pVar = pVar4;
        }
        R0.a(r32, c1086gP, hVarC3);
        h hVarD = W.d(aVar3, 1.0f);
        T tA = S.a(gVar, androidx.compose.ui.d.a.j, c1086gP, 6);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
        h hVarC4 = ComposedModifierKt.c(c1086gP, hVarD);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar4);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, tA);
        R0.a(pVar3, c1086gP, interfaceC1089h0P4);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
            J4.i.d(i15, c1086gP, i15, pVar);
        }
        R0.a(pVar5, c1086gP, hVarC4);
        V v10 = V.f10222a;
        w(v10, defaultPagerStateB, c1086gP, 518);
        J(v10, c1086gP, 70);
        c1086gP.T(true);
        G(defaultPagerStateB, c1086gP, 64);
        C1105p0 c1105p0A = C4.a.a(c1086gP, true, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.feature.boomboarding.BoomboardingDialog$BoomboardingContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.z(pageDetails, onBoomBoardingWelcomeLightsClick, onBoomBoardingUrbanJokeClick, onBoomBoardingVideoInMotionClick, onBoomBoardingOrderNowClick, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
