package com.voltasit.obdeleven.presentation.controlUnit;

import B8.AbstractC0633j;
import B8.E0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.ui.dialogs.I0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: OnlineControlUnitFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OnlineControlUnitFragment extends ControlUnitFragment {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f31477E;

    /* JADX INFO: compiled from: OnlineControlUnitFragment.kt */
    public static final class a implements androidx.lifecycle.D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31478b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f31478b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31478b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31478b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31478b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31478b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$special$$inlined$viewModel$default$1] */
    public OnlineControlUnitFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$special$$inlined$viewModel$default$1
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
        this.f31477E = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<F>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlUnit.F] */
            @Override // Ia.a
            public final F invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(F.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        z(d0());
        d0().f31474x.e(getViewLifecycleOwner(), new a(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                this.this$0.e0();
                return p293xa.r.f47939a;
            }
        }));
        d0().f31472v.e(getViewLifecycleOwner(), new a(new Ia.l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                final OnlineControlUnitFragment onlineControlUnitFragment = this.this$0;
                onlineControlUnitFragment.getClass();
                onlineControlUnitFragment.K(new Ia.l<Object, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$showTryAgainDialog$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Object obj) {
                        OnlineControlUnitFragment onlineControlUnitFragment2 = onlineControlUnitFragment;
                        onlineControlUnitFragment2.getClass();
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type android.content.DialogInterface");
                        ((DialogInterface) obj).dismiss();
                        onlineControlUnitFragment2.r().h();
                        return p293xa.r.f47939a;
                    }
                }, new Ia.l<Object, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Object obj) {
                        OnlineControlUnitFragment onlineControlUnitFragment2 = onlineControlUnitFragment;
                        onlineControlUnitFragment2.getClass();
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type android.content.DialogInterface");
                        ((DialogInterface) obj).dismiss();
                        F fD0 = onlineControlUnitFragment2.d0();
                        fD0.getClass();
                        C2680e.c(Z.a(fD0), fD0.f32112a, null, new OnlineControlUnitViewModel$requestInfo$1(fD0, null), 2);
                        return p293xa.r.f47939a;
                    }
                });
                return p293xa.r.f47939a;
            }
        }));
        d0().f31476z.e(getViewLifecycleOwner(), new a(new Ia.l<Short, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$setupSfdObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Short sh) {
                SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                sfdWizardFullScreenDialog.F(sh);
                sfdWizardFullScreenDialog.v(this.this$0.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                return p293xa.r.f47939a;
            }
        }));
        d0().f31463B.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$setupSfdObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                kotlin.jvm.internal.i.b(num2);
                iVar.w(num2.intValue());
                iVar.v(this.this$0.getChildFragmentManager(), "SfdRateLimitDialog");
                return p293xa.r.f47939a;
            }
        }));
        View viewB = super.B(inflater, viewGroup, bundle);
        if (this.f31429o == null) {
            O.e.l("OnlineControlUnitFragment", "Control unit is null in OnlineControlUnitFragment");
            r().h();
        } else {
            f0();
        }
        getChildFragmentManager().b0("LockSfdDialog", getViewLifecycleOwner(), new androidx.fragment.app.E() { // from class: com.voltasit.obdeleven.presentation.controlUnit.A
            @Override // androidx.fragment.app.E
            public final void h(Bundle bundle2, String str) {
                OnlineControlUnitFragment this$0 = this.f31421b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
                ControlUnit controlUnit = this$0.f31429o;
                if (controlUnit != null) {
                    F fD0 = this$0.d0();
                    short sShortValue = controlUnit.n().shortValue();
                    fD0.getClass();
                    C2680e.c(Z.a(fD0), fD0.f32112a, null, new OnlineControlUnitViewModel$onLockSfdDialogResult$1(fD0, sShortValue, null), 2);
                }
            }
        });
        getChildFragmentManager().b0("UnlockSfdDialog", getViewLifecycleOwner(), new androidx.fragment.app.E() { // from class: com.voltasit.obdeleven.presentation.controlUnit.B
            @Override // androidx.fragment.app.E
            public final void h(Bundle bundle2, String str) {
                OnlineControlUnitFragment this$0 = this.f31422b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
                ControlUnit controlUnit = this$0.f31429o;
                if (controlUnit != null) {
                    F fD0 = this$0.d0();
                    String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
                    kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
                    short sShortValue = controlUnit.n().shortValue();
                    fD0.getClass();
                    C2680e.c(Z.a(fD0), fD0.f32112a, null, new OnlineControlUnitViewModel$onUnlockSfdDialogResult$1(fD0, objectId, sShortValue, null), 2);
                }
            }
        });
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new I4.l(new Ia.p<String, Bundle, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment$onCreateInnerView$3
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(String str, Bundle bundle2) {
                kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
                kotlin.jvm.internal.i.e(bundle2, "<anonymous parameter 1>");
                OnlineControlUnitFragment onlineControlUnitFragment = this.this$0;
                ControlUnit controlUnit = onlineControlUnitFragment.f31429o;
                if (controlUnit != null) {
                    F fD0 = onlineControlUnitFragment.d0();
                    String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
                    kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
                    short sShortValue = controlUnit.n().shortValue();
                    fD0.getClass();
                    C2680e.c(Z.a(fD0), fD0.f32112a, null, new OnlineControlUnitViewModel$onSfdWizardCompleted$1(fD0, objectId, sShortValue, null), 2);
                }
                return p293xa.r.f47939a;
            }
        }));
        return viewB;
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment
    public final boolean Z() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final F d0() {
        return (F) this.f31477E.getValue();
    }

    public final void e0() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "OnlineControlUnitFragment", "requestInfo()", Arrays.copyOf(new Object[0], 0));
        ControlUnit controlUnit = this.f31429o;
        kotlin.jvm.internal.i.b(controlUnit);
        p255u9.D dI = controlUnit.f29321c.f42726c.i();
        kotlin.jvm.internal.i.b(dI);
        ArrayList<Short> arrayListB = dI.b();
        H(R.string.common_loading_data);
        ControlUnit controlUnit2 = this.f31429o;
        kotlin.jvm.internal.i.b(controlUnit2);
        if (arrayListB.contains(controlUnit2.n())) {
            Bundle bundleA = Z3.o.a("key_tag", R.string.dialog_info_bl_cu, "info_blacklisted_cu", "key_title");
            bundleA.putInt("key_positive_text", R.string.common_ok);
            I0 i10 = new I0();
            i10.setArguments(bundleA);
            i10.f32261r = getFragmentManager();
            i10.setTargetFragment(this, 0);
            i10.A();
        }
        ControlUnit controlUnit3 = this.f31429o;
        kotlin.jvm.internal.i.b(controlUnit3);
        controlUnit3.D(false).continueWith(new V8.l(4, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void f0() {
        if (y()) {
            return;
        }
        a0();
        ControlUnit controlUnit = this.f31429o;
        kotlin.jvm.internal.i.b(controlUnit);
        if (!(controlUnit.f29329l != null)) {
            p279w9.b bVar = Application.f29634b;
            P8.c.a(4, "OnlineControlUnitFragment", "Supported functions not yet available", Arrays.copyOf(new Object[0], 0));
            F fD0 = d0();
            fD0.getClass();
            C2680e.c(Z.a(fD0), fD0.f32112a, null, new OnlineControlUnitViewModel$requestInfo$1(fD0, null), 2);
            return;
        }
        ControlUnit controlUnit2 = this.f31429o;
        kotlin.jvm.internal.i.b(controlUnit2);
        ArrayList arrayListM = controlUnit2.M();
        try {
            ControlUnit controlUnit3 = this.f31429o;
            kotlin.jvm.internal.i.b(controlUnit3);
            this.f31434t = controlUnit3.c0(true);
        } catch (ControlUnitException e10) {
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(e10);
        }
        V(arrayListM);
        W();
        if (this.f31436v || !q().E()) {
            return;
        }
        ArrayList<View> arrayList = this.f31432r;
        j(arrayList.get(0));
        arrayList.get(0).performClick();
        this.f31436v = true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OnlineControlUnitFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!W7.c.e() || this.f31429o == null) {
            r().o(false);
        } else {
            com.bumptech.glide.e eVarF = com.bumptech.glide.b.c(getContext()).f(this);
            ControlUnit controlUnit = this.f31429o;
            kotlin.jvm.internal.i.b(controlUnit);
            com.bumptech.glide.d<Drawable> dVarM = eVarF.m(controlUnit.a0());
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            dVarM.a(dVarJ).x(X().f1968s);
            ControlUnit controlUnit2 = this.f31429o;
            kotlin.jvm.internal.i.b(controlUnit2);
            X().f1970u.setText(controlUnit2.t());
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
            DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).c());
            AbstractC0633j abstractC0633jX = X();
            ControlUnit controlUnit3 = this.f31429o;
            kotlin.jvm.internal.i.b(controlUnit3);
            abstractC0633jX.f1969t.setText(controlUnit3.x(databaseLanguageValueOf.b()));
        }
        if (this.f31433s) {
            return;
        }
        this.f31433s = true;
    }
}
