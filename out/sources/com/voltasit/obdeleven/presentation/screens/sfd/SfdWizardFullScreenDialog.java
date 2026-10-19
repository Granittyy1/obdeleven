package com.voltasit.obdeleven.presentation.screens.sfd;

import G8.C0707i;
import G8.G;
import H3.c;
import I.e;
import Ia.p;
import L4.b;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.colorspace.s;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.y;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.navigation.compose.Q;
import androidx.navigation.compose.u;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.domain.usecases.sfd.TrackSfdWizardCompletionUC;
import com.voltasit.obdeleven.presentation.BaseFullScreenDialog;
import com.voltasit.obdeleven.presentation.components.NavigationControllerKt;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt;
import com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt;
import com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt;
import com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.success.NumberConfirmationSuccessScreenKt;
import com.voltasit.obdeleven.presentation.twofactorauth.verify.d;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2748s;
import p141l2.C2749t;
import p141l2.F;
import p141l2.H;
import p141l2.L;
import p141l2.P;
import p293xa.r;

/* JADX INFO: compiled from: SfdWizardFullScreenDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdWizardFullScreenDialog extends BaseFullScreenDialog {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f33018s = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<TrackSfdWizardCompletionUC>(this) { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$special$$inlined$inject$default$1
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_inject = this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.domain.usecases.sfd.TrackSfdWizardCompletionUC, java.lang.Object] */
        @Override // Ia.a
        public final TrackSfdWizardCompletionUC invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            Pb.a aVar = this.$qualifier;
            return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(TrackSfdWizardCompletionUC.class));
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f33019t;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$special$$inlined$viewModel$default$1] */
    public SfdWizardFullScreenDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$viewModel$2
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
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$special$$inlined$viewModel$default$1
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
        this.f33019t = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<SfdWizardViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel] */
            @Override // Ia.a
            public final SfdWizardViewModel invoke() {
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
                return Gb.a.a(l.a(SfdWizardViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    public static final void D(final SfdWizardFullScreenDialog sfdWizardFullScreenDialog, final BaseFragment baseFragment, final Ia.l lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        sfdWizardFullScreenDialog.getClass();
        C1086g c1086gP = interfaceC1084f.p(-1080981412);
        y childFragmentManager = sfdWizardFullScreenDialog.getChildFragmentManager();
        String strO = baseFragment.o();
        InterfaceC1376t viewLifecycleOwner = sfdWizardFullScreenDialog.getViewLifecycleOwner();
        c1086gP.L(999603183);
        boolean z10 = (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && c1086gP.K(lVar)) || (i10 & 48) == 32;
        Object objF = c1086gP.f();
        if (z10 || objF == InterfaceC1084f.a.f12980a) {
            objF = new p<String, Bundle, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$FragmentRoute$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(String str, Bundle bundle) {
                    Bundle bundle2 = bundle;
                    i.e(str, "<anonymous parameter 0>");
                    i.e(bundle2, "bundle");
                    lVar.invoke(bundle2);
                    return r.f47939a;
                }
            };
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        childFragmentManager.b0(strO, viewLifecycleOwner, new s(2, (p) objF));
        AndroidView_androidKt.b(new Ia.l<Context, FragmentContainerView>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$FragmentRoute$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final FragmentContainerView invoke(Context context) {
                Context context2 = context;
                i.e(context2, "context");
                FragmentContainerView fragmentContainerView = new FragmentContainerView(context2);
                fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                fragmentContainerView.setId(View.generateViewId());
                y childFragmentManager2 = this.this$0.getChildFragmentManager();
                i.d(childFragmentManager2, "getChildFragmentManager(...)");
                BaseFragment<?> baseFragment2 = baseFragment;
                C1336a c1336a = new C1336a(childFragmentManager2);
                c1336a.f17498p = false;
                c1336a.e(fragmentContainerView.getId(), baseFragment2, null);
                c1336a.i();
                return fragmentContainerView;
            }
        }, null, null, c1086gP, 0, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$FragmentRoute$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdWizardFullScreenDialog.D(this.$tmp1_rcvr, baseFragment, lVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public final void C(final p293xa.p pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(738417879);
        A(Integer.valueOf(com.voltasit.obdeleven.R.string.view_sfd_intro_title), false, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(View view) {
                View it = view;
                i.e(it, "it");
                this.this$0.p(false, false);
                return r.f47939a;
            }
        });
        H hS = C1787c0.s(new P[0], c1086gP);
        final K8.i iVar = E().f33028s;
        Screen screen = Screen.SfdWizardHome;
        NavigationControllerKt.a(hS, iVar, screen, E().f33029t, new Ia.l<C0707i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(C0707i c0707i) {
                C0707i it = c0707i;
                i.e(it, "it");
                switch (it.f3504a.ordinal()) {
                    case 2:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog = this.this$0;
                        Integer numValueOf = Integer.valueOf(com.voltasit.obdeleven.R.string.common_enter_email);
                        final K8.i iVar2 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog, numValueOf, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.3
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                K8.i.a.a(iVar2, null, 3);
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog2 = this.this$0;
                        final K8.i iVar3 = iVar;
                        sfdWizardFullScreenDialog2.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.4
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                K8.i.a.a(iVar3, null, 3);
                                return r.f47939a;
                            }
                        });
                        break;
                    case 3:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog3 = this.this$0;
                        Integer numValueOf2 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_email_verification_confirm_email);
                        final K8.i iVar4 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog3, numValueOf2, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.5
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                K8.i.a.a(iVar4, Screen.SfdWizardHome, 2);
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog4 = this.this$0;
                        final K8.i iVar5 = iVar;
                        sfdWizardFullScreenDialog4.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.6
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                K8.i.a.a(iVar5, null, 3);
                                return r.f47939a;
                            }
                        });
                        break;
                    case 4:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog5 = this.this$0;
                        Integer numValueOf3 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_profile_personal_information);
                        final K8.i iVar6 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog5, numValueOf3, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.7
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                K8.i.a.a(iVar6, Screen.SfdWizardHome, 2);
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog6 = this.this$0;
                        final K8.i iVar7 = iVar;
                        sfdWizardFullScreenDialog6.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.8
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar7.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                return r.f47939a;
                            }
                        });
                        break;
                    case 5:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog7 = this.this$0;
                        Integer numValueOf4 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_sfd_intro_title);
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog8 = this.this$0;
                        sfdWizardFullScreenDialog7.A(numValueOf4, false, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                sfdWizardFullScreenDialog8.p(false, false);
                                return r.f47939a;
                            }
                        });
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog9 = this.this$0;
                        sfdWizardFullScreenDialog9.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.2
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                sfdWizardFullScreenDialog9.p(false, false);
                                return r.f47939a;
                            }
                        });
                        break;
                    case 6:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog10 = this.this$0;
                        Integer numValueOf5 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_profile_personal_information);
                        final K8.i iVar8 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog10, numValueOf5, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.16
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                iVar8.a(new C0707i(Screen.PersonalInfoExplanation, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog11 = this.this$0;
                        final K8.i iVar9 = iVar;
                        sfdWizardFullScreenDialog11.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.17
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar9.a(new C0707i(Screen.PersonalInfoExplanation, null, false, null, 14));
                                return r.f47939a;
                            }
                        });
                        break;
                    case 7:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog12 = this.this$0;
                        Integer numValueOf6 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_profile_2_step_auth);
                        final K8.i iVar10 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog12, numValueOf6, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.9
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                iVar10.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog13 = this.this$0;
                        final K8.i iVar11 = iVar;
                        sfdWizardFullScreenDialog13.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.10
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar11.a(new C0707i(Screen.SfdWizardHome, null, true, null, 10));
                                return r.f47939a;
                            }
                        });
                        break;
                    case 8:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog14 = this.this$0;
                        Integer numValueOf7 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_profile_2_step_auth);
                        final K8.i iVar12 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog14, numValueOf7, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.14
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                iVar12.a(new C0707i(Screen.TwoFactorAuthIntro, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog15 = this.this$0;
                        final K8.i iVar13 = iVar;
                        sfdWizardFullScreenDialog15.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.15
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar13.a(new C0707i(Screen.TwoFactorAuthIntro, null, false, null, 14));
                                return r.f47939a;
                            }
                        });
                        break;
                    case 9:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog16 = this.this$0;
                        Integer numValueOf8 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_profile_2_step_auth);
                        final K8.i iVar14 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog16, numValueOf8, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.11
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                iVar14.a(new C0707i(Screen.TwoFactorAuthSetup, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog17 = this.this$0;
                        final K8.i iVar15 = iVar;
                        sfdWizardFullScreenDialog17.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.12
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar15.a(new C0707i(Screen.TwoFactorAuthSetup, null, false, null, 14));
                                return r.f47939a;
                            }
                        });
                        break;
                    case 10:
                    case 11:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog18 = this.this$0;
                        Integer numValueOf9 = Integer.valueOf(com.voltasit.obdeleven.R.string.view_profile_2_step_auth);
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog19 = this.this$0;
                        sfdWizardFullScreenDialog18.A(numValueOf9, false, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.13
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                sfdWizardFullScreenDialog19.p(false, false);
                                return r.f47939a;
                            }
                        });
                        Dialog dialog = this.this$0.f17606m;
                        if (dialog != null) {
                            dialog.setOnKeyListener(null);
                        }
                        break;
                    case 12:
                    default:
                        O.e.D("SfdWizardFullScreenDialog", "Unknown route");
                        Fragment parentFragment = this.this$0.getParentFragment();
                        if (parentFragment != null) {
                            c.l(parentFragment, "SfdWizardFullScreenDialog", new Bundle());
                        }
                        this.this$0.p(false, false);
                        break;
                    case 13:
                    case 15:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog20 = this.this$0;
                        Integer numValueOf10 = Integer.valueOf(com.voltasit.obdeleven.R.string.common_sms_confirmation);
                        final K8.i iVar16 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog20, numValueOf10, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.20
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                iVar16.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog21 = this.this$0;
                        final K8.i iVar17 = iVar;
                        sfdWizardFullScreenDialog21.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.21
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar17.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                return r.f47939a;
                            }
                        });
                        break;
                    case 14:
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog22 = this.this$0;
                        Integer numValueOf11 = Integer.valueOf(com.voltasit.obdeleven.R.string.common_sms_confirmation);
                        final K8.i iVar18 = iVar;
                        BaseFullScreenDialog.B(sfdWizardFullScreenDialog22, numValueOf11, new Ia.l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.18
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(View view) {
                                View it2 = view;
                                i.e(it2, "it");
                                iVar18.a(new C0707i(Screen.EditPhoneNumber, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, 2);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog23 = this.this$0;
                        final K8.i iVar19 = iVar;
                        sfdWizardFullScreenDialog23.y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$3.19
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar19.a(new C0707i(Screen.EditPhoneNumber, null, false, null, 14));
                                return r.f47939a;
                            }
                        });
                        break;
                }
                return r.f47939a;
            }
        }, c1086gP, 4488, 0);
        Q.a(hS, screen.a(), null, null, null, null, null, null, null, null, new Ia.l<F, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(F f10) {
                F NavHost = f10;
                i.e(NavHost, "$this$NavHost");
                String strA = Screen.SfdWizardHome.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog = this.this$0;
                final p293xa.p pVar2 = pVar;
                u.a(NavHost, strA, null, null, null, null, null, new ComposableLambdaImpl(true, -1120514374, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, xa.g] */
                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        ((TrackSfdWizardCompletionUC) sfdWizardFullScreenDialog.f33018s.getValue()).a(pVar2, TrackSfdWizardCompletionUC.SfdWizardScreen.f30914b);
                        boolean zBooleanValue = ((Boolean) sfdWizardFullScreenDialog.E().f33031v.getValue()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) sfdWizardFullScreenDialog.E().f33032w.getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) sfdWizardFullScreenDialog.E().f33033x.getValue()).booleanValue();
                        PreloaderState preloaderState = (PreloaderState) androidx.compose.runtime.livedata.b.a(sfdWizardFullScreenDialog.E().f32114c, PreloaderState.d.f32643a, interfaceC1084f3).getValue();
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog2 = sfdWizardFullScreenDialog;
                        Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.1.1
                            {
                                super(0);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.a
                            public final r invoke() {
                                Screen screen2;
                                SfdWizardViewModel sfdWizardViewModelE = sfdWizardFullScreenDialog2.E();
                                G g10 = sfdWizardViewModelE.f33034y;
                                if (!((Boolean) sfdWizardViewModelE.f33031v.getValue()).booleanValue()) {
                                    screen2 = Screen.EmailVerificationInput;
                                } else if (!((Boolean) sfdWizardViewModelE.f33032w.getValue()).booleanValue()) {
                                    screen2 = Screen.TwoFactorAuthIntro;
                                } else if (g10 == null) {
                                    screen2 = Screen.PersonalInfoExplanation;
                                } else {
                                    screen2 = sfdWizardViewModelE.f33030u.a(g10) ? Screen.EditPhoneNumber : Screen.None;
                                }
                                sfdWizardViewModelE.f33028s.a(new C0707i(screen2, null, false, null, 14));
                                return r.f47939a;
                            }
                        };
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog3 = sfdWizardFullScreenDialog;
                        SfdWizardHomeKt.b(zBooleanValue, zBooleanValue2, zBooleanValue3, preloaderState, aVar, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.1.2
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                sfdWizardFullScreenDialog3.E().f33024o.g("https://support.obdeleven.com/en/collections/3195142-sfd");
                                return r.f47939a;
                            }
                        }, interfaceC1084f3, 0);
                        return r.f47939a;
                    }
                }), 254);
                String strA2 = Screen.EmailVerificationInput.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog2 = this.this$0;
                u.a(NavHost, strA2, null, null, null, null, null, new ComposableLambdaImpl(true, -379728911, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.2
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog3 = sfdWizardFullScreenDialog2;
                        EmailVerificationInputScreenKt.b(null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.2.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                Fragment parentFragment = sfdWizardFullScreenDialog3.getParentFragment();
                                if (parentFragment != null) {
                                    c.l(parentFragment, "SfdWizardFullScreenDialog", new Bundle());
                                }
                                sfdWizardFullScreenDialog3.p(false, false);
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 0, 1);
                        return r.f47939a;
                    }
                }), 254);
                String strA3 = Screen.f30525f.a();
                List listK = M1.k(b.e(new Ia.l<C2748s, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.3
                    @Override // Ia.l
                    public final r invoke(C2748s c2748s) {
                        C2748s navArgument = c2748s;
                        i.e(navArgument, "$this$navArgument");
                        navArgument.b(L.StringType);
                        return r.f47939a;
                    }
                }, "email"));
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog3 = this.this$0;
                u.a(NavHost, strA3, listK, null, null, null, null, new ComposableLambdaImpl(true, -740188622, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.4
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        String string;
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        Bundle bundleA = it.f44305i.a();
                        if (bundleA == null || (string = bundleA.getString("email")) == null) {
                            string = "";
                        }
                        String str = string;
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog4 = sfdWizardFullScreenDialog3;
                        Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.4.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                Fragment parentFragment = sfdWizardFullScreenDialog4.getParentFragment();
                                if (parentFragment != null) {
                                    c.l(parentFragment, "SfdWizardFullScreenDialog", new Bundle());
                                }
                                sfdWizardFullScreenDialog4.p(false, false);
                                return r.f47939a;
                            }
                        };
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog5 = sfdWizardFullScreenDialog3;
                        EmailVerificationConfirmationScreenKt.a(str, null, aVar, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.4.2
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                sfdWizardFullScreenDialog5.E().f33028s.a(new C0707i(Screen.SfdWizardHome, null, true, null, 10));
                                return r.f47939a;
                            }
                        }, interfaceC1084f3, 0, 2);
                        return r.f47939a;
                    }
                }), 252);
                String strA4 = Screen.PersonalInfoExplanation.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog4 = this.this$0;
                final p293xa.p pVar3 = pVar;
                final K8.i iVar2 = iVar;
                u.a(NavHost, strA4, null, null, null, null, null, new ComposableLambdaImpl(true, -1100648333, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xa.g] */
                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        ((TrackSfdWizardCompletionUC) sfdWizardFullScreenDialog4.f33018s.getValue()).a(pVar3, TrackSfdWizardCompletionUC.SfdWizardScreen.f30917e);
                        final K8.i iVar3 = iVar2;
                        Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.5.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                iVar3.a(new C0707i(Screen.SfdPersonalInfoForm, null, false, null, 14));
                                return r.f47939a;
                            }
                        };
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog5 = sfdWizardFullScreenDialog4;
                        SfdPersonalInfoExplanationKt.a(aVar, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.5.2
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                sfdWizardFullScreenDialog5.E().f33024o.g("https://support.obdeleven.com/en/collections/3195142-sfd");
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 0);
                        return r.f47939a;
                    }
                }), 254);
                String strA5 = Screen.SfdPersonalInfoForm.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog5 = this.this$0;
                u.a(NavHost, strA5, null, null, null, null, null, new ComposableLambdaImpl(true, -1461108044, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.6
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog6 = sfdWizardFullScreenDialog5;
                        Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.6.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                sfdWizardFullScreenDialog6.p(false, false);
                                return r.f47939a;
                            }
                        };
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog7 = sfdWizardFullScreenDialog5;
                        Ia.l<Integer, r> lVar = new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.6.2
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Integer num2) {
                                int iIntValue = num2.intValue();
                                r9.P.a aVar2 = new r9.P.a(sfdWizardFullScreenDialog7.requireActivity());
                                aVar2.b(iIntValue);
                                aVar2.f46434e = com.voltasit.obdeleven.R.color.snackbar_negative;
                                aVar2.f46435f = sfdWizardFullScreenDialog7.x().f4488d;
                                aVar2.a().i();
                                return r.f47939a;
                            }
                        };
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog8 = sfdWizardFullScreenDialog5;
                        SfdPersonalInfoFormScreenKt.d(aVar, lVar, true, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.6.3
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                SfdWizardViewModel sfdWizardViewModelE = sfdWizardFullScreenDialog8.E();
                                G g10 = sfdWizardViewModelE.f33034y;
                                K8.i iVar3 = sfdWizardViewModelE.f33028s;
                                if (g10 == null || !sfdWizardViewModelE.f33030u.a(g10)) {
                                    iVar3.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                } else {
                                    iVar3.a(new C0707i(Screen.PhoneNumberConfirmation, x.o(new Pair("mobile", g10.f3420d + g10.f3421e)), false, null, 12));
                                }
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 384);
                        return r.f47939a;
                    }
                }), 254);
                String strA6 = Screen.TwoFactorAuthIntro.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog6 = this.this$0;
                final p293xa.p pVar4 = pVar;
                final K8.i iVar3 = iVar;
                u.a(NavHost, strA6, null, null, null, null, null, new ComposableLambdaImpl(true, -1821567755, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xa.g] */
                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        ((TrackSfdWizardCompletionUC) sfdWizardFullScreenDialog6.f33018s.getValue()).a(pVar4, TrackSfdWizardCompletionUC.SfdWizardScreen.f30915c);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog7 = sfdWizardFullScreenDialog6;
                        p048d9.b bVar = new p048d9.b();
                        final K8.i iVar4 = iVar3;
                        SfdWizardFullScreenDialog.D(sfdWizardFullScreenDialog7, bVar, new Ia.l<Bundle, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.7.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Bundle bundle) {
                                Bundle it2 = bundle;
                                i.e(it2, "it");
                                iVar4.a(new C0707i(Screen.TwoFactorAuthSetup, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 512);
                        return r.f47939a;
                    }
                }), 254);
                String strA7 = Screen.TwoFactorAuthSetup.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog7 = this.this$0;
                final K8.i iVar4 = iVar;
                u.a(NavHost, strA7, null, null, null, null, null, new ComposableLambdaImpl(true, 2112939830, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog8 = sfdWizardFullScreenDialog7;
                        com.voltasit.obdeleven.presentation.twofactorauth.setup.a aVar = new com.voltasit.obdeleven.presentation.twofactorauth.setup.a();
                        final K8.i iVar5 = iVar4;
                        SfdWizardFullScreenDialog.D(sfdWizardFullScreenDialog8, aVar, new Ia.l<Bundle, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.8.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Bundle bundle) {
                                Bundle it2 = bundle;
                                i.e(it2, "it");
                                iVar5.a(new C0707i(Screen.TwoFactorAuthVerify, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 512);
                        return r.f47939a;
                    }
                }), 254);
                String strA8 = Screen.TwoFactorAuthVerify.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog8 = this.this$0;
                final K8.i iVar5 = iVar;
                u.a(NavHost, strA8, null, null, null, null, null, new ComposableLambdaImpl(true, 1752480119, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog9 = sfdWizardFullScreenDialog8;
                        d dVar = new d();
                        final K8.i iVar6 = iVar5;
                        SfdWizardFullScreenDialog.D(sfdWizardFullScreenDialog9, dVar, new Ia.l<Bundle, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.9.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Bundle bundle) {
                                Bundle it2 = bundle;
                                i.e(it2, "it");
                                String string = it2.getString("backup_code");
                                if (string == null) {
                                    string = "";
                                }
                                iVar6.a(new C0707i(Screen.TwoFactorAuthBackup, x.o(new Pair("backup_code", string)), false, null, 12));
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 512);
                        return r.f47939a;
                    }
                }), 254);
                String strA9 = Screen.TwoFactorAuthBackup.a();
                List listK2 = M1.k(b.e(new Ia.l<C2748s, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.10
                    @Override // Ia.l
                    public final r invoke(C2748s c2748s) {
                        C2748s navArgument = c2748s;
                        i.e(navArgument, "$this$navArgument");
                        navArgument.b(L.StringType);
                        return r.f47939a;
                    }
                }, "backup_code"));
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog9 = this.this$0;
                final K8.i iVar6 = iVar;
                u.a(NavHost, strA9, listK2, null, null, null, null, new ComposableLambdaImpl(true, 1392020408, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        String string;
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog10 = sfdWizardFullScreenDialog9;
                        com.voltasit.obdeleven.presentation.twofactorauth.backup.a aVar = new com.voltasit.obdeleven.presentation.twofactorauth.backup.a();
                        Bundle bundleA = it.f44305i.a();
                        if (bundleA == null || (string = bundleA.getString("backup_code")) == null) {
                            string = "";
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("key_backup_code", string);
                        aVar.setArguments(bundle);
                        final K8.i iVar7 = iVar6;
                        SfdWizardFullScreenDialog.D(sfdWizardFullScreenDialog10, aVar, new Ia.l<Bundle, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.11.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Bundle bundle2) {
                                Bundle it2 = bundle2;
                                i.e(it2, "it");
                                iVar7.a(new C0707i(Screen.TwoFactorAuthActivated, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, interfaceC1084f3, 520);
                        return r.f47939a;
                    }
                }), 252);
                String strA10 = Screen.TwoFactorAuthActivated.a();
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog10 = this.this$0;
                final p293xa.p pVar5 = pVar;
                final K8.i iVar7 = iVar;
                u.a(NavHost, strA10, null, null, null, null, null, new ComposableLambdaImpl(true, 1031560697, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xa.g] */
                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        ((TrackSfdWizardCompletionUC) sfdWizardFullScreenDialog10.f33018s.getValue()).a(pVar5, TrackSfdWizardCompletionUC.SfdWizardScreen.f30916d);
                        SfdWizardFullScreenDialog sfdWizardFullScreenDialog11 = sfdWizardFullScreenDialog10;
                        p035c9.d dVar = new p035c9.d();
                        final K8.i iVar8 = iVar7;
                        SfdWizardFullScreenDialog.D(sfdWizardFullScreenDialog11, dVar, new Ia.l<Bundle, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.12.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Bundle bundle) {
                                Bundle it2 = bundle;
                                i.e(it2, "it");
                                iVar8.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 512);
                        return r.f47939a;
                    }
                }), 254);
                u.a(NavHost, Screen.EditPhoneNumber.a(), null, null, null, null, null, ComposableSingletons$SfdWizardFullScreenDialogKt.f32995a, 254);
                String strA11 = Screen.PhoneNumberConfirmation.a();
                List listK3 = M1.k(b.e(new Ia.l<C2748s, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.13
                    @Override // Ia.l
                    public final r invoke(C2748s c2748s) {
                        C2748s navArgument = c2748s;
                        i.e(navArgument, "$this$navArgument");
                        navArgument.b(L.StringType);
                        return r.f47939a;
                    }
                }, "mobile"));
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog11 = this.this$0;
                u.a(NavHost, strA11, listK3, null, null, null, null, new ComposableLambdaImpl(true, -2102238426, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.14
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        String string;
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        Bundle bundleA = it.f44305i.a();
                        if (bundleA == null || (string = bundleA.getString("mobile")) == null) {
                            string = "";
                        }
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog12 = sfdWizardFullScreenDialog11;
                        NumberConfirmationScreenKt.d(string, new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.14.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String message = str;
                                i.e(message, "message");
                                r9.P.a aVar = new r9.P.a(sfdWizardFullScreenDialog12.requireActivity());
                                aVar.f46431b = message;
                                aVar.f46434e = com.voltasit.obdeleven.R.color.snackbar_positive;
                                aVar.f46435f = sfdWizardFullScreenDialog12.requireView();
                                aVar.a().i();
                                return r.f47939a;
                            }
                        }, interfaceC1084f3, 0);
                        return r.f47939a;
                    }
                }), 252);
                String strA12 = Screen.PhoneNumberConfirmationSuccess.a();
                List listK4 = M1.k(b.e(new Ia.l<C2748s, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.15
                    @Override // Ia.l
                    public final r invoke(C2748s c2748s) {
                        C2748s navArgument = c2748s;
                        i.e(navArgument, "$this$navArgument");
                        navArgument.b(L.StringType);
                        return r.f47939a;
                    }
                }, "mobile"));
                final SfdWizardFullScreenDialog sfdWizardFullScreenDialog12 = this.this$0;
                u.a(NavHost, strA12, listK4, null, null, null, null, new ComposableLambdaImpl(true, 1832269159, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$4.16
                    {
                        super(4);
                    }

                    @Override // Ia.r
                    public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                        String string;
                        InterfaceC0900c composable = interfaceC0900c;
                        C2749t it = c2749t;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        i.e(composable, "$this$composable");
                        i.e(it, "it");
                        Bundle bundleA = it.f44305i.a();
                        if (bundleA == null || (string = bundleA.getString("mobile")) == null) {
                            string = "";
                        }
                        final SfdWizardFullScreenDialog sfdWizardFullScreenDialog13 = sfdWizardFullScreenDialog12;
                        NumberConfirmationSuccessScreenKt.b(string, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog.ScreenContent.4.16.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                SfdWizardViewModel sfdWizardViewModelE = sfdWizardFullScreenDialog13.E();
                                sfdWizardViewModelE.f33033x.setValue(Boolean.TRUE);
                                sfdWizardViewModelE.f33028s.a(new C0707i(Screen.SfdWizardHome, null, false, null, 14));
                                return r.f47939a;
                            }
                        }, interfaceC1084f3, 0);
                        return r.f47939a;
                    }
                }), 252);
                return r.f47939a;
            }
        }, c1086gP, 56, 0, 1020);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.C(pVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final SfdWizardViewModel E() {
        return (SfdWizardViewModel) this.f33019t.getValue();
    }

    public final void F(Short sh) {
        Bundle bundle = new Bundle();
        if (sh != null) {
            bundle.putShort("kline_id", sh.shortValue());
        }
        setArguments(bundle);
    }

    @Override // com.voltasit.obdeleven.presentation.BaseFullScreenDialog
    public final void w(InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-253753442);
        C(requireArguments().containsKey("kline_id") ? new p293xa.p(requireArguments().getShort("kline_id")) : null, c1086gP, 64);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog$ScreenContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.w(interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
