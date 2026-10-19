package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import G8.C0707i;
import Ia.l;
import Ia.p;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.navigation.compose.Q;
import androidx.navigation.compose.u;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.presentation.BaseFullScreenDialog;
import com.voltasit.obdeleven.presentation.components.NavigationControllerKt;
import com.voltasit.obdeleven.presentation.components.dialog.AreYouSureDialogKt;
import com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import p141l2.C2749t;
import p141l2.F;
import p141l2.H;
import p220r9.P;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdateDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PersonalInformationUpdateDialog extends BaseFullScreenDialog {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f32963s;

    /* JADX INFO: compiled from: PersonalInformationUpdateDialog.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32964a;

        static {
            int[] iArr = new int[Screen.values().length];
            try {
                iArr[Screen.SfdPersonalInfoForm.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32964a = iArr;
        }
    }

    /* JADX INFO: compiled from: PersonalInformationUpdateDialog.kt */
    public static final class b implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32965b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar) {
            this.f32965b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f32965b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32965b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32965b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32965b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$special$$inlined$stateViewModel$default$1] */
    public PersonalInformationUpdateDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(Boolean.valueOf(this.this$0.requireArguments().getBoolean("should_logout_user", false)));
            }
        };
        final Ia.a<Bundle> aVarA = ScopeExtKt.a();
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$special$$inlined$stateViewModel$default$1
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_stateViewModel;
            }
        };
        this.f32963s = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a>(this) { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$special$$inlined$stateViewModel$default$2
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a] */
            @Override // Ia.a
            public final a invoke() {
                Fragment fragment = this.$this_stateViewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = aVarA;
                Ia.a aVar4 = r10;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar4.invoke()).getViewModelStore();
                p014b1.a aVarA2 = Hb.a.a((Bundle) aVar3.invoke(), fragment);
                if (aVarA2 == null) {
                    aVarA2 = fragment.getDefaultViewModelCreationExtras();
                    i.d(aVarA2, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(a.class), viewModelStore, null, aVarA2, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(final H h8, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-161299858);
        C1085f0 c1085f0 = D().f32972t;
        LoaderDialogKt.a((PreloaderState) androidx.compose.runtime.livedata.b.a(D().f32114c, PreloaderState.d.f32643a, c1086gP).getValue(), c1086gP, 0);
        c1086gP.L(2141798571);
        if (((Boolean) c1085f0.getValue()).booleanValue()) {
            AreYouSureDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    a aVarD = this.this$0.D();
                    aVarD.f32971s.setValue(Boolean.FALSE);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    a aVarD = this.this$0.D();
                    aVarD.f32971s.setValue(Boolean.FALSE);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$3
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    a aVarD = this.this$0.D();
                    aVarD.getClass();
                    C2680e.c(Z.a(aVarD), null, null, new PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1(aVarD, null), 3);
                    return r.f47939a;
                }
            }, c1086gP, 0);
        }
        c1086gP.T(false);
        Q.a(h8, Screen.UpdatePersonalInfo.a(), null, null, null, null, null, null, null, null, new l<F, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(F f10) {
                F NavHost = f10;
                i.e(NavHost, "$this$NavHost");
                String strA = Screen.SfdPersonalInfoForm.a();
                final PersonalInformationUpdateDialog personalInformationUpdateDialog = this.this$0;
                u.a(NavHost, strA, null, null, null, null, null, new ComposableLambdaImpl(true, 238316715, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$4.1
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
                        final PersonalInformationUpdateDialog personalInformationUpdateDialog2 = personalInformationUpdateDialog;
                        Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog.PersonalInformationUpdateDialogScreen.4.1.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                personalInformationUpdateDialog2.D().b();
                                return r.f47939a;
                            }
                        };
                        final PersonalInformationUpdateDialog personalInformationUpdateDialog3 = personalInformationUpdateDialog;
                        l<Integer, r> lVar = new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog.PersonalInformationUpdateDialogScreen.4.1.2
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Integer num2) {
                                int iIntValue = num2.intValue();
                                P.a aVar2 = new P.a(personalInformationUpdateDialog3.requireActivity());
                                aVar2.b(iIntValue);
                                aVar2.f46434e = R.color.snackbar_negative;
                                aVar2.f46435f = personalInformationUpdateDialog3.x().f4488d;
                                aVar2.a().i();
                                return r.f47939a;
                            }
                        };
                        final PersonalInformationUpdateDialog personalInformationUpdateDialog4 = personalInformationUpdateDialog;
                        SfdPersonalInfoFormScreenKt.d(aVar, lVar, false, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog.PersonalInformationUpdateDialogScreen.4.1.3
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                personalInformationUpdateDialog4.p(false, false);
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 384);
                        return r.f47939a;
                    }
                }), 254);
                String strA2 = Screen.UpdatePersonalInfo.a();
                final PersonalInformationUpdateDialog personalInformationUpdateDialog2 = this.this$0;
                u.a(NavHost, strA2, null, null, null, null, null, new ComposableLambdaImpl(true, -808481004, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$4.2
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
                        final PersonalInformationUpdateDialog personalInformationUpdateDialog3 = personalInformationUpdateDialog2;
                        Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog.PersonalInformationUpdateDialogScreen.4.2.1
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                personalInformationUpdateDialog3.D().b();
                                return r.f47939a;
                            }
                        };
                        final PersonalInformationUpdateDialog personalInformationUpdateDialog4 = personalInformationUpdateDialog2;
                        l<Integer, r> lVar = new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog.PersonalInformationUpdateDialogScreen.4.2.2
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(Integer num2) {
                                int iIntValue = num2.intValue();
                                P.a aVar2 = new P.a(personalInformationUpdateDialog4.requireActivity());
                                aVar2.b(iIntValue);
                                aVar2.f46434e = R.color.snackbar_negative;
                                aVar2.f46435f = personalInformationUpdateDialog4.x().f4488d;
                                aVar2.a().i();
                                return r.f47939a;
                            }
                        };
                        final PersonalInformationUpdateDialog personalInformationUpdateDialog5 = personalInformationUpdateDialog2;
                        PersonalInformationUpdateKt.c(null, null, aVar, lVar, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog.PersonalInformationUpdateDialogScreen.4.2.3
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                personalInformationUpdateDialog5.p(false, false);
                                return r.f47939a;
                            }
                        }, interfaceC1084f2, 0, 3);
                        return r.f47939a;
                    }
                }), 254);
                return r.f47939a;
            }
        }, c1086gP, 56, 0, 1020);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$PersonalInformationUpdateDialogScreen$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.C(h8, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a D() {
        return (com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a) this.f32963s.getValue();
    }

    @Override // com.voltasit.obdeleven.presentation.BaseFullScreenDialog
    public final void w(InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(1356003103);
        H hS = C1787c0.s(new p141l2.P[0], c1086gP);
        final K8.i iVar = D().f32967o;
        NavigationControllerKt.a(hS, iVar, Screen.UpdatePersonalInfo, D().f32969q, new l<C0707i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$ScreenContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(C0707i c0707i) {
                C0707i it = c0707i;
                i.e(it, "it");
                final PersonalInformationUpdateDialog personalInformationUpdateDialog = this.this$0;
                personalInformationUpdateDialog.getClass();
                if (PersonalInformationUpdateDialog.a.f32964a[it.f3504a.ordinal()] == 1) {
                    personalInformationUpdateDialog.A(Integer.valueOf(R.string.common_personal_information_update), false, new l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$onNavigateCallback$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(View view) {
                            View it2 = view;
                            i.e(it2, "it");
                            personalInformationUpdateDialog.D().b();
                            return r.f47939a;
                        }
                    });
                } else {
                    BaseFullScreenDialog.B(personalInformationUpdateDialog, null, new l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$onNavigateCallback$2
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(View view) {
                            View it2 = view;
                            i.e(it2, "it");
                            personalInformationUpdateDialog.D().b();
                            return r.f47939a;
                        }
                    }, 1);
                }
                return r.f47939a;
            }
        }, c1086gP, 4488, 0);
        C(hS, c1086gP, 72);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$ScreenContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.w(interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    @Override // com.voltasit.obdeleven.presentation.BaseFullScreenDialog
    public final void z() {
        y(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$setup$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                this.this$0.D().b();
                return r.f47939a;
            }
        });
        A(null, false, new l<View, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$setup$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(View view) {
                View it = view;
                i.e(it, "it");
                this.this$0.D().b();
                return r.f47939a;
            }
        });
        D().f32974v.e(this, new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$setup$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.p(false, false);
                return r.f47939a;
            }
        }));
        D().f32976x.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialog$setup$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                ActivityC1347l activity = this.this$0.getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.G(null);
                }
                this.this$0.p(false, false);
                return r.f47939a;
            }
        }));
    }
}
