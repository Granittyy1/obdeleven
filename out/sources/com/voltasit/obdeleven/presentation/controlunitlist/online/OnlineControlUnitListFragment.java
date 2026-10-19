package com.voltasit.obdeleven.presentation.controlunitlist.online;

import B8.AbstractC0613a0;
import C7.h;
import Ia.l;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.login.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment;
import com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.models.FragmentResult;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import p220r9.P;
import p220r9.Q;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitListFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OnlineControlUnitListFragment extends ControlUnitListFragment implements SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f32059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f32060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f32061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AutocodeProgressDialog f32062u;

    /* JADX INFO: compiled from: OnlineControlUnitListFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32063b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f32063b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f32063b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32063b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32063b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32063b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$viewModel$default$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$stateViewModel$default$1] */
    public OnlineControlUnitListFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(this.this$0.requireArguments().getString("vehicleId", ""));
            }
        };
        final Ia.a<Bundle> aVarA = ScopeExtKt.a();
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$stateViewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        this.f32059r = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<OnlineControlUnitListViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$stateViewModel$default$2
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel] */
            @Override // Ia.a
            public final OnlineControlUnitListViewModel invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(OnlineControlUnitListViewModel.class), viewModelStore, null, aVarA2, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
        final ?? r11 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$viewModel$default$1
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
        final OnlineControlUnitListFragment$sfdViewModel$2 onlineControlUnitListFragment$sfdViewModel$2 = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$sfdViewModel$2
            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(Feature.GatewayCoding);
            }
        };
        this.f32060s = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<SfdViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.SfdViewModel] */
            @Override // Ia.a
            public final SfdViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r11;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = onlineControlUnitListFragment$sfdViewModel$2;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(SfdViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
        this.f32061t = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<VagProRedirectPromoPresenter>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$special$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter, java.lang.Object] */
            @Override // Ia.a
            public final VagProRedirectPromoPresenter invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(VagProRedirectPromoPresenter.class));
            }
        });
    }

    @Override // com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void C(AbstractC0613a0 abstractC0613a0) {
        super.C(abstractC0613a0);
        T();
        z(Y());
        Y().f31220w.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupSfdObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.E(R.string.common_something_went_wrong);
                return r.f47939a;
            }
        }));
        Y().f31207A.e(getViewLifecycleOwner(), new a(new l<Short, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupSfdObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Short sh) {
                SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                sfdWizardFullScreenDialog.F(sh);
                sfdWizardFullScreenDialog.v(this.this$0.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                return r.f47939a;
            }
        }));
        Y().f31218u.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupSfdObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                i.b(num2);
                iVar.w(num2.intValue());
                iVar.v(this.this$0.getChildFragmentManager(), "SfdRateLimitDialog");
                return r.f47939a;
            }
        }));
        Y().f31222y.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupSfdObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                OnlineControlUnitListViewModel onlineControlUnitListViewModelV = this.this$0.V();
                onlineControlUnitListViewModelV.getClass();
                C2680e.c(Z.a(onlineControlUnitListViewModelV), onlineControlUnitListViewModelV.f32112a, null, new OnlineControlUnitListViewModel$onSfdUnlockSuccess$1(onlineControlUnitListViewModelV, null), 2);
                return r.f47939a;
            }
        }));
        Y().f31209C.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupSfdObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                OnlineControlUnitListViewModel onlineControlUnitListViewModelV = this.this$0.V();
                onlineControlUnitListViewModelV.getClass();
                onlineControlUnitListViewModelV.f32077L.j(SfdUnlockDialogOrigin.f32107b);
                return r.f47939a;
            }
        }));
        V().f32078M.e(getViewLifecycleOwner(), new a(new l<SfdUnlockDialogOrigin, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupSfdObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(SfdUnlockDialogOrigin sfdUnlockDialogOrigin) {
                new SfdAutoUnlockDialog().v(this.this$0.getChildFragmentManager(), "SfdAutoUnlockDialog");
                return r.f47939a;
            }
        }));
        V().f32092a0.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new com.voltasit.obdeleven.presentation.dialogs.f(0).J(this.this$0);
                return r.f47939a;
            }
        }));
        O().f32118g.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.r().o(false);
                return r.f47939a;
            }
        }));
        V().f32074I.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new AutocodeWarningDialog().v(this.this$0.getChildFragmentManager(), "AutocodeWarningDialog");
                return r.f47939a;
            }
        }));
        V().f32080O.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.i(this, 2));
        O().f32120i.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                MainActivity mainActivityQ = this.this$0.q();
                i.b(num2);
                P.a(mainActivityQ, mainActivityQ.getString(num2.intValue()));
                return r.f47939a;
            }
        }));
        V().f32082Q.e(getViewLifecycleOwner(), new a(new l<Map<Short, ? extends com.obdeleven.service.model.f>, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$6
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(Map<Short, ? extends com.obdeleven.service.model.f> map) {
                Map<Short, ? extends com.obdeleven.service.model.f> map2 = map;
                OnlineControlUnitListFragment onlineControlUnitListFragment = this.this$0;
                i.b(map2);
                ((VagProRedirectPromoPresenter) onlineControlUnitListFragment.f32061t.getValue()).a(onlineControlUnitListFragment, new androidx.compose.ui.contentcapture.i(onlineControlUnitListFragment, 1, map2));
                return r.f47939a;
            }
        }));
        V().f32072G.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                i.b(bool2);
                if (bool2.booleanValue()) {
                    this.this$0.U().f1854r.n();
                    AbstractC0613a0 abstractC0613a0U = this.this$0.U();
                    abstractC0613a0U.f1854r.startAnimation(AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.scale_in));
                }
                return r.f47939a;
            }
        }));
        V().f32084S.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$8
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                final OnlineControlUnitListFragment onlineControlUnitListFragment = this.this$0;
                onlineControlUnitListFragment.getClass();
                onlineControlUnitListFragment.K(new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$showTryAgainDialog$1
                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        return r.f47939a;
                    }
                }, new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        OnlineControlUnitListViewModel onlineControlUnitListViewModelV = onlineControlUnitListFragment.V();
                        onlineControlUnitListViewModelV.getClass();
                        C2680e.c(Z.a(onlineControlUnitListViewModelV), null, null, new OnlineControlUnitListViewModel$tryAgainDialogClickTryAgain$1(onlineControlUnitListViewModelV, null), 3);
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        }));
        V().f32076K.e(getViewLifecycleOwner(), new a(new l<List<? extends com.obdeleven.service.model.f>, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends com.obdeleven.service.model.f> list) {
                List<? extends com.obdeleven.service.model.f> list2 = list;
                OnlineControlUnitListFragment onlineControlUnitListFragment = this.this$0;
                i.b(list2);
                onlineControlUnitListFragment.getClass();
                new AutocodeProgressDialog();
                Bundle bundle = new Bundle();
                bundle.putInt("key_title", R.string.autocode_gateway);
                AutocodeProgressDialog autocodeProgressDialog = new AutocodeProgressDialog();
                autocodeProgressDialog.setArguments(bundle);
                autocodeProgressDialog.f32261r = onlineControlUnitListFragment.getFragmentManager();
                autocodeProgressDialog.setTargetFragment(onlineControlUnitListFragment, 0);
                autocodeProgressDialog.f33886s = list2;
                onlineControlUnitListFragment.f32062u = autocodeProgressDialog;
                autocodeProgressDialog.A();
                return r.f47939a;
            }
        }));
        O().f32795C.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.V().o();
                return r.f47939a;
            }
        }));
        V().f32086U.e(getViewLifecycleOwner(), new a(new l<OnlineControlUnitListViewModel.b, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(OnlineControlUnitListViewModel.b bVar) {
                OnlineControlUnitListViewModel.b bVar2 = bVar;
                this.this$0.Y().b(bVar2.f32105a, bVar2.f32106b);
                return r.f47939a;
            }
        }));
        V().f32088W.e(getViewLifecycleOwner(), new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment$setupObservers$12
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                i.b(bool2);
                if (bool2.booleanValue()) {
                    OnlineControlUnitListFragment onlineControlUnitListFragment = this.this$0;
                    p033c7.b0 b0Var = new p033c7.b0(onlineControlUnitListFragment);
                    onlineControlUnitListFragment.getClass();
                    if (onlineControlUnitListFragment.getActivity() != null) {
                        ActivityC1347l activityC1347lRequireActivity = onlineControlUnitListFragment.requireActivity();
                        String string = activityC1347lRequireActivity.getString(R.string.view_cu_list_gateway_list_coding_accepted);
                        P.a aVar = new P.a(activityC1347lRequireActivity);
                        aVar.f46431b = string;
                        aVar.f46434e = R.color.snackbar_positive;
                        aVar.f46436g = b0Var;
                        aVar.a().i();
                    }
                } else {
                    this.this$0.G(R.string.view_cu_list_gateway_list_coding_accepted);
                }
                return r.f47939a;
            }
        }));
        z(V());
        O().c(true);
        FloatingActionButton controlUnitListFragmentFab = abstractC0613a0.f1854r;
        i.d(controlUnitListFragmentFab, "controlUnitListFragmentFab");
        R(controlUnitListFragmentFab, 2131231151, true);
        controlUnitListFragmentFab.setOnClickListener(new d(this, 1));
        Q.a(abstractC0613a0.f1856t, this);
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new Q6.d(this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new h(this));
        getChildFragmentManager().b0("AutocodeWarningDialog", this, new E() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.a
            @Override // androidx.fragment.app.E
            public final void h(Bundle bundle, String str) {
                FragmentResult fragmentResult;
                OnlineControlUnitListFragment this$0 = this.f32110b;
                i.e(this$0, "this$0");
                i.e(str, "<anonymous parameter 0>");
                FragmentResult.a aVar = FragmentResult.f32636b;
                String string = bundle.getString("key_result", "");
                i.d(string, "getString(...)");
                aVar.getClass();
                FragmentResult[] fragmentResultArrValues = FragmentResult.values();
                int length = fragmentResultArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        fragmentResult = null;
                        break;
                    }
                    fragmentResult = fragmentResultArrValues[i10];
                    if (i.a(fragmentResult.a(), string)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (fragmentResult == null) {
                    fragmentResult = FragmentResult.Unknown;
                }
                OnlineControlUnitListViewModel onlineControlUnitListViewModelV = this$0.V();
                onlineControlUnitListViewModelV.getClass();
                C2680e.c(Z.a(onlineControlUnitListViewModelV), null, null, new OnlineControlUnitListViewModel$onAutocodeDialogResult$1(fragmentResult, onlineControlUnitListViewModelV, null), 3);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final SfdViewModel Y() {
        return (SfdViewModel) this.f32060s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final OnlineControlUnitListViewModel V() {
        return (OnlineControlUnitListViewModel) this.f32059r.getValue();
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        if (!dialogId.equals("AutocodeProgressDialog")) {
            if (dialogId.equals("PopTheHoodDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                V().o();
                return;
            }
            return;
        }
        boolean z10 = data.getBoolean("HasSaveFailed", false);
        OnlineControlUnitListViewModel onlineControlUnitListViewModelV = V();
        onlineControlUnitListViewModelV.getClass();
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            C2673a0 c2673a0 = C2673a0.f43223b;
            OnlineControlUnitListViewModel$notifySubscriptionFunctionUsed$1 onlineControlUnitListViewModel$notifySubscriptionFunctionUsed$1 = new OnlineControlUnitListViewModel$notifySubscriptionFunctionUsed$1(onlineControlUnitListViewModelV, null);
            com.voltasit.obdeleven.presentation.d.a aVar = onlineControlUnitListViewModelV.f32112a;
            C2680e.c(c2673a0, aVar, null, onlineControlUnitListViewModel$notifySubscriptionFunctionUsed$1, 2);
            C2680e.c(Z.a(onlineControlUnitListViewModelV), aVar, null, new OnlineControlUnitListViewModel$onAutocodeProgressDialogResult$1(onlineControlUnitListViewModelV, z10, null), 2);
        }
        AutocodeProgressDialog autocodeProgressDialog = this.f32062u;
        if (autocodeProgressDialog != null) {
            autocodeProgressDialog.y();
        }
        this.f32062u = null;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.sort_control_units, menu);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        U().f1856t.setRefreshing(false);
        OnlineControlUnitListViewModel onlineControlUnitListViewModelV = V();
        onlineControlUnitListViewModelV.getClass();
        C2680e.c(Z.a(onlineControlUnitListViewModelV), onlineControlUnitListViewModelV.f32112a, null, new OnlineControlUnitListViewModel$swipeRefresh$1(onlineControlUnitListViewModelV, null), 2);
    }

    @Override // com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment, com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator<? extends ControlUnit> it = V().f32089X.iterator();
        while (it.hasNext()) {
            it.next().A0();
        }
    }
}
