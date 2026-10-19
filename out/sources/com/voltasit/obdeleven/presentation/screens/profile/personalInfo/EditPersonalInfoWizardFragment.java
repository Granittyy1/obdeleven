package com.voltasit.obdeleven.presentation.screens.profile.personalInfo;

import G8.C0707i;
import Ia.p;
import K8.i;
import L4.b;
import android.os.Bundle;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import androidx.navigation.compose.Q;
import androidx.navigation.compose.u;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.BaseComposeFragment;
import com.voltasit.obdeleven.presentation.components.NavigationControllerKt;
import com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt;
import com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.List;
import kotlin.jvm.internal.l;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p014b1.a;
import p141l2.C2748s;
import p141l2.C2749t;
import p141l2.F;
import p141l2.H;
import p141l2.L;
import p141l2.P;
import p293xa.r;

/* JADX INFO: compiled from: EditPersonalInfoWizardFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EditPersonalInfoWizardFragment extends BaseComposeFragment {
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        r().h();
        return true;
    }

    @Override // com.voltasit.obdeleven.presentation.BaseComposeFragment
    public final void O(InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(738041624);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            P(null, c1086gP, (i11 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$RootComposable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.O(interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    public final void P(EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel2;
        boolean z10;
        Object objF;
        final EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel3;
        C1086g c1086gP = interfaceC1084f.p(33406481);
        int i12 = i11 & 1;
        int i13 = i12 != 0 ? i10 | 2 : i10;
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.K(this) ? 32 : 16;
        }
        if (i12 == 1 && (i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            editPersonalInfoWizardViewModel3 = editPersonalInfoWizardViewModel;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if (i12 != 0) {
                    c1086gP.e(667488325);
                    c0 c0VarA = p027c1.b.a(c1086gP);
                    if (c0VarA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    a aVarA = Fb.a.a(c0VarA, c1086gP);
                    org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
                    c1086gP.e(-1614864554);
                    Y yA = Gb.a.a(l.a(EditPersonalInfoWizardViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
                    c1086gP.T(false);
                    c1086gP.T(false);
                    i13 &= -15;
                    editPersonalInfoWizardViewModel2 = (EditPersonalInfoWizardViewModel) yA;
                }
                c1086gP.U();
                H hS = C1787c0.s(new P[0], c1086gP);
                i iVar = editPersonalInfoWizardViewModel2.f32960o;
                Screen screen = Screen.Loading;
                c1086gP.L(485449625);
                z10 = (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
                objF = c1086gP.f();
                if (z10 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l<C0707i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$1$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(C0707i c0707i) {
                            int i14;
                            p100i.a supportActionBar;
                            C0707i it = c0707i;
                            kotlin.jvm.internal.i.e(it, "it");
                            int iOrdinal = it.f3504a.ordinal();
                            if (iOrdinal != 2) {
                                i14 = iOrdinal != 3 ? com.voltasit.obdeleven.R.string.view_profile_personal_information : com.voltasit.obdeleven.R.string.view_email_verification_confirm_email;
                            } else {
                                i14 = com.voltasit.obdeleven.R.string.common_enter_email;
                            }
                            MainActivity mainActivityQ = this.this$0.q();
                            mainActivityQ.f33565u = mainActivityQ.getString(i14);
                            if (mainActivityQ.f33534C && (supportActionBar = mainActivityQ.getSupportActionBar()) != null) {
                                supportActionBar.o();
                                String str = mainActivityQ.f33565u;
                                if (str != null) {
                                    supportActionBar.s(str);
                                }
                            }
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                NavigationControllerKt.a(hS, iVar, screen, editPersonalInfoWizardViewModel2.f32962q, (Ia.l) objF, c1086gP, 4488, 0);
                Q.a(hS, screen.a(), null, null, null, null, null, null, null, null, new Ia.l<F, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(F f10) {
                        F NavHost = f10;
                        kotlin.jvm.internal.i.e(NavHost, "$this$NavHost");
                        u.a(NavHost, Screen.Loading.a(), null, null, null, null, null, ComposableSingletons$EditPersonalInfoWizardFragmentKt.f32953a, 254);
                        String strA = Screen.SfdPersonalInfoForm.a();
                        final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment = this.this$0;
                        u.a(NavHost, strA, null, null, null, null, null, new ComposableLambdaImpl(true, 1456852907, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.1
                            {
                                super(4);
                            }

                            @Override // Ia.r
                            public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC0900c composable = interfaceC0900c;
                                C2749t it = c2749t;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                num.intValue();
                                kotlin.jvm.internal.i.e(composable, "$this$composable");
                                kotlin.jvm.internal.i.e(it, "it");
                                interfaceC1084f3.L(-318733252);
                                boolean zK = interfaceC1084f3.K(editPersonalInfoWizardFragment);
                                final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment2 = editPersonalInfoWizardFragment;
                                Object objF2 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (zK || objF2 == c0153a) {
                                    objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final r invoke() {
                                            editPersonalInfoWizardFragment2.r().h();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                Ia.a aVar = (Ia.a) objF2;
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-318733177);
                                boolean zK2 = interfaceC1084f3.K(editPersonalInfoWizardFragment);
                                final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment3 = editPersonalInfoWizardFragment;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK2 || objF3 == c0153a) {
                                    objF3 = new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$1$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final r invoke(Integer num2) {
                                            int iIntValue = num2.intValue();
                                            r9.P.a aVar2 = new r9.P.a(editPersonalInfoWizardFragment3.requireActivity());
                                            aVar2.b(iIntValue);
                                            aVar2.f46434e = com.voltasit.obdeleven.R.color.snackbar_negative;
                                            aVar2.f46435f = editPersonalInfoWizardFragment3.requireView();
                                            aVar2.a().i();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-318732794);
                                boolean zK3 = interfaceC1084f3.K(editPersonalInfoWizardFragment);
                                final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment4 = editPersonalInfoWizardFragment;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK3 || objF4 == c0153a) {
                                    objF4 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$1$3$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final r invoke() {
                                            editPersonalInfoWizardFragment4.r().h();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                interfaceC1084f3.D();
                                SfdPersonalInfoFormScreenKt.d(aVar, lVar, false, (Ia.a) objF4, interfaceC1084f3, 384);
                                return r.f47939a;
                            }
                        }), 254);
                        String strA2 = Screen.EmailVerificationInput.a();
                        final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment2 = this.this$0;
                        u.a(NavHost, strA2, null, null, null, null, null, new ComposableLambdaImpl(true, 1534973996, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.2
                            {
                                super(4);
                            }

                            @Override // Ia.r
                            public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC0900c composable = interfaceC0900c;
                                C2749t it = c2749t;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                num.intValue();
                                kotlin.jvm.internal.i.e(composable, "$this$composable");
                                kotlin.jvm.internal.i.e(it, "it");
                                interfaceC1084f3.L(-318732589);
                                boolean zK = interfaceC1084f3.K(editPersonalInfoWizardFragment2);
                                final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment3 = editPersonalInfoWizardFragment2;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$2$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final r invoke() {
                                            editPersonalInfoWizardFragment3.r().h();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                interfaceC1084f3.D();
                                EmailVerificationInputScreenKt.b(null, (Ia.a) objF2, interfaceC1084f3, 0, 1);
                                return r.f47939a;
                            }
                        }), 254);
                        String strA3 = Screen.f30525f.a();
                        List listK = M1.k(b.e(new Ia.l<C2748s, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.3
                            @Override // Ia.l
                            public final r invoke(C2748s c2748s) {
                                C2748s navArgument = c2748s;
                                kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
                                navArgument.b(L.StringType);
                                return r.f47939a;
                            }
                        }, "email"));
                        final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment3 = this.this$0;
                        final EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel4 = editPersonalInfoWizardViewModel2;
                        u.a(NavHost, strA3, listK, null, null, null, null, new ComposableLambdaImpl(true, 1613095085, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.4
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
                                kotlin.jvm.internal.i.e(composable, "$this$composable");
                                kotlin.jvm.internal.i.e(it, "it");
                                Bundle bundleA = it.f44305i.a();
                                if (bundleA == null || (string = bundleA.getString("email")) == null) {
                                    string = "";
                                }
                                String str = string;
                                interfaceC1084f3.L(-318732083);
                                boolean zK = interfaceC1084f3.K(editPersonalInfoWizardFragment3);
                                final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment4 = editPersonalInfoWizardFragment3;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$4$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final r invoke() {
                                            editPersonalInfoWizardFragment4.r().h();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                interfaceC1084f3.D();
                                final EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel5 = editPersonalInfoWizardViewModel4;
                                EmailVerificationConfirmationScreenKt.a(str, null, (Ia.a) objF2, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment.Content.2.4.2
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel6 = editPersonalInfoWizardViewModel5;
                                        editPersonalInfoWizardViewModel6.getClass();
                                        editPersonalInfoWizardViewModel6.f32960o.a(new C0707i(Screen.SfdPersonalInfoForm, null, true, null, 10));
                                        return r.f47939a;
                                    }
                                }, interfaceC1084f3, 0, 2);
                                return r.f47939a;
                            }
                        }), 252);
                        return r.f47939a;
                    }
                }, c1086gP, 56, 0, 1020);
                editPersonalInfoWizardViewModel3 = editPersonalInfoWizardViewModel2;
            } else {
                c1086gP.w();
                if (i12 != 0) {
                    i13 &= -15;
                }
            }
            editPersonalInfoWizardViewModel2 = editPersonalInfoWizardViewModel;
            c1086gP.U();
            H hS2 = C1787c0.s(new P[0], c1086gP);
            i iVar2 = editPersonalInfoWizardViewModel2.f32960o;
            Screen screen2 = Screen.Loading;
            c1086gP.L(485449625);
            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new Ia.l<C0707i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C0707i c0707i) {
                        int i14;
                        p100i.a supportActionBar;
                        C0707i it = c0707i;
                        kotlin.jvm.internal.i.e(it, "it");
                        int iOrdinal = it.f3504a.ordinal();
                        if (iOrdinal != 2) {
                            i14 = iOrdinal != 3 ? com.voltasit.obdeleven.R.string.view_profile_personal_information : com.voltasit.obdeleven.R.string.view_email_verification_confirm_email;
                        } else {
                            i14 = com.voltasit.obdeleven.R.string.common_enter_email;
                        }
                        MainActivity mainActivityQ = this.this$0.q();
                        mainActivityQ.f33565u = mainActivityQ.getString(i14);
                        if (mainActivityQ.f33534C && (supportActionBar = mainActivityQ.getSupportActionBar()) != null) {
                            supportActionBar.o();
                            String str = mainActivityQ.f33565u;
                            if (str != null) {
                                supportActionBar.s(str);
                            }
                        }
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<C0707i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C0707i c0707i) {
                        int i14;
                        p100i.a supportActionBar;
                        C0707i it = c0707i;
                        kotlin.jvm.internal.i.e(it, "it");
                        int iOrdinal = it.f3504a.ordinal();
                        if (iOrdinal != 2) {
                            i14 = iOrdinal != 3 ? com.voltasit.obdeleven.R.string.view_profile_personal_information : com.voltasit.obdeleven.R.string.view_email_verification_confirm_email;
                        } else {
                            i14 = com.voltasit.obdeleven.R.string.common_enter_email;
                        }
                        MainActivity mainActivityQ = this.this$0.q();
                        mainActivityQ.f33565u = mainActivityQ.getString(i14);
                        if (mainActivityQ.f33534C && (supportActionBar = mainActivityQ.getSupportActionBar()) != null) {
                            supportActionBar.o();
                            String str = mainActivityQ.f33565u;
                            if (str != null) {
                                supportActionBar.s(str);
                            }
                        }
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            NavigationControllerKt.a(hS2, iVar2, screen2, editPersonalInfoWizardViewModel2.f32962q, (Ia.l) objF, c1086gP, 4488, 0);
            Q.a(hS2, screen2.a(), null, null, null, null, null, null, null, null, new Ia.l<F, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(F f10) {
                    F NavHost = f10;
                    kotlin.jvm.internal.i.e(NavHost, "$this$NavHost");
                    u.a(NavHost, Screen.Loading.a(), null, null, null, null, null, ComposableSingletons$EditPersonalInfoWizardFragmentKt.f32953a, 254);
                    String strA = Screen.SfdPersonalInfoForm.a();
                    final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment = this.this$0;
                    u.a(NavHost, strA, null, null, null, null, null, new ComposableLambdaImpl(true, 1456852907, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.1
                        {
                            super(4);
                        }

                        @Override // Ia.r
                        public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC0900c composable = interfaceC0900c;
                            C2749t it = c2749t;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            kotlin.jvm.internal.i.e(composable, "$this$composable");
                            kotlin.jvm.internal.i.e(it, "it");
                            interfaceC1084f3.L(-318733252);
                            boolean zK = interfaceC1084f3.K(editPersonalInfoWizardFragment);
                            final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment2 = editPersonalInfoWizardFragment;
                            Object objF2 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                            if (zK || objF2 == c0153a) {
                                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        editPersonalInfoWizardFragment2.r().h();
                                        return r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            Ia.a aVar = (Ia.a) objF2;
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-318733177);
                            boolean zK2 = interfaceC1084f3.K(editPersonalInfoWizardFragment);
                            final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment3 = editPersonalInfoWizardFragment;
                            Object objF3 = interfaceC1084f3.f();
                            if (zK2 || objF3 == c0153a) {
                                objF3 = new Ia.l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$1$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final r invoke(Integer num2) {
                                        int iIntValue = num2.intValue();
                                        r9.P.a aVar2 = new r9.P.a(editPersonalInfoWizardFragment3.requireActivity());
                                        aVar2.b(iIntValue);
                                        aVar2.f46434e = com.voltasit.obdeleven.R.color.snackbar_negative;
                                        aVar2.f46435f = editPersonalInfoWizardFragment3.requireView();
                                        aVar2.a().i();
                                        return r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-318732794);
                            boolean zK3 = interfaceC1084f3.K(editPersonalInfoWizardFragment);
                            final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment4 = editPersonalInfoWizardFragment;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK3 || objF4 == c0153a) {
                                objF4 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$1$3$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        editPersonalInfoWizardFragment4.r().h();
                                        return r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            interfaceC1084f3.D();
                            SfdPersonalInfoFormScreenKt.d(aVar, lVar, false, (Ia.a) objF4, interfaceC1084f3, 384);
                            return r.f47939a;
                        }
                    }), 254);
                    String strA2 = Screen.EmailVerificationInput.a();
                    final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment2 = this.this$0;
                    u.a(NavHost, strA2, null, null, null, null, null, new ComposableLambdaImpl(true, 1534973996, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.2
                        {
                            super(4);
                        }

                        @Override // Ia.r
                        public final r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC0900c composable = interfaceC0900c;
                            C2749t it = c2749t;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            kotlin.jvm.internal.i.e(composable, "$this$composable");
                            kotlin.jvm.internal.i.e(it, "it");
                            interfaceC1084f3.L(-318732589);
                            boolean zK = interfaceC1084f3.K(editPersonalInfoWizardFragment2);
                            final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment3 = editPersonalInfoWizardFragment2;
                            Object objF2 = interfaceC1084f3.f();
                            if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$2$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        editPersonalInfoWizardFragment3.r().h();
                                        return r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            interfaceC1084f3.D();
                            EmailVerificationInputScreenKt.b(null, (Ia.a) objF2, interfaceC1084f3, 0, 1);
                            return r.f47939a;
                        }
                    }), 254);
                    String strA3 = Screen.f30525f.a();
                    List listK = M1.k(b.e(new Ia.l<C2748s, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.3
                        @Override // Ia.l
                        public final r invoke(C2748s c2748s) {
                            C2748s navArgument = c2748s;
                            kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
                            navArgument.b(L.StringType);
                            return r.f47939a;
                        }
                    }, "email"));
                    final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment3 = this.this$0;
                    final EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel4 = editPersonalInfoWizardViewModel2;
                    u.a(NavHost, strA3, listK, null, null, null, null, new ComposableLambdaImpl(true, 1613095085, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2.4
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
                            kotlin.jvm.internal.i.e(composable, "$this$composable");
                            kotlin.jvm.internal.i.e(it, "it");
                            Bundle bundleA = it.f44305i.a();
                            if (bundleA == null || (string = bundleA.getString("email")) == null) {
                                string = "";
                            }
                            String str = string;
                            interfaceC1084f3.L(-318732083);
                            boolean zK = interfaceC1084f3.K(editPersonalInfoWizardFragment3);
                            final EditPersonalInfoWizardFragment editPersonalInfoWizardFragment4 = editPersonalInfoWizardFragment3;
                            Object objF2 = interfaceC1084f3.f();
                            if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$2$4$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final r invoke() {
                                        editPersonalInfoWizardFragment4.r().h();
                                        return r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            interfaceC1084f3.D();
                            final EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel5 = editPersonalInfoWizardViewModel4;
                            EmailVerificationConfirmationScreenKt.a(str, null, (Ia.a) objF2, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment.Content.2.4.2
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    EditPersonalInfoWizardViewModel editPersonalInfoWizardViewModel6 = editPersonalInfoWizardViewModel5;
                                    editPersonalInfoWizardViewModel6.getClass();
                                    editPersonalInfoWizardViewModel6.f32960o.a(new C0707i(Screen.SfdPersonalInfoForm, null, true, null, 10));
                                    return r.f47939a;
                                }
                            }, interfaceC1084f3, 0, 2);
                            return r.f47939a;
                        }
                    }), 252);
                    return r.f47939a;
                }
            }, c1086gP, 56, 0, 1020);
            editPersonalInfoWizardViewModel3 = editPersonalInfoWizardViewModel2;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment$Content$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp1_rcvr.P(editPersonalInfoWizardViewModel3, interfaceC1084f2, b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "EditPersonalInfoWizard";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return null;
    }
}
