package com.voltasit.obdeleven.presentation.basicsettings;

import B8.B0;
import Ia.l;
import M0.h;
import W7.c;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.usecases.odx.d;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.O0;
import com.voltasit.obdeleven.ui.dialogs.Z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import p220r9.P;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: UDSBasicSettingsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UDSBasicSettingsFragment extends BaseProFragment<B0> implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f31324n = R.layout.fragment_uds_data;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f31325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f31326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B0 f31327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O0 f31328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p135k9.a f31329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ControlUnit f31330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f31331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.voltasit.obdeleven.ui.dialogs.B0 f31333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Z0 f31334x;

    /* JADX INFO: compiled from: UDSBasicSettingsFragment.kt */
    public static final class a<TTaskResult, TContinuationResult> implements Continuation {
        public a() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            i.e(task, "task");
            Object result = task.getResult();
            i.d(result, "getResult(...)");
            if (!((Boolean) result).booleanValue()) {
                return null;
            }
            p135k9.a aVar = UDSBasicSettingsFragment.this.f31329s;
            i.b(aVar);
            aVar.notifyDataSetChanged();
            return null;
        }
    }

    /* JADX INFO: compiled from: UDSBasicSettingsFragment.kt */
    public static final class b implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31336b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar) {
            this.f31336b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f31336b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31336b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f31336b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f31336b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$special$$inlined$viewModel$default$3] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$special$$inlined$viewModel$default$1] */
    public UDSBasicSettingsFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(this.this$0.r());
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        this.f31325o = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<com.voltasit.obdeleven.presentation.basicsettings.a>(this) { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.basicsettings.a] */
            @Override // Ia.a
            public final a invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(a.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
        final ?? r11 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$special$$inlined$viewModel$default$3
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
        final UDSBasicSettingsFragment$sfdViewModel$2 uDSBasicSettingsFragment$sfdViewModel$2 = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$sfdViewModel$2
            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(Feature.BasicSettings);
            }
        };
        this.f31326p = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<SfdViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$special$$inlined$viewModel$default$4
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
                Ia.a aVar5 = uDSBasicSettingsFragment$sfdViewModel$2;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(SfdViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
        this.f31334x = new Z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        O0 o10 = this.f31328r;
        if (o10 == null || !o10.isVisible()) {
            W();
            ControlUnit controlUnit = this.f31330t;
            if (controlUnit != null) {
                com.voltasit.obdeleven.presentation.basicsettings.a aVarV = V();
                aVarV.getClass();
                com.voltasit.obdeleven.presentation.basicsettings.a.C0329a c0329a = (com.voltasit.obdeleven.presentation.basicsettings.a.C0329a) aVarV.f31339B.d();
                if (c0329a != null && c0329a.f31370b) {
                    C2680e.c(Z.a(aVarV), null, null, new UDSBasicSettingsViewModel$onReopenBasicSettingList$1(aVarV, controlUnit, null), 3);
                }
            }
        } else {
            O0 o11 = this.f31328r;
            i.b(o11);
            o11.y();
            r().h();
        }
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        B0 b10 = (B0) hVar;
        this.f31327q = b10;
        T();
        z(U());
        U().f31218u.e(getViewLifecycleOwner(), new b(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupSfdObservers$1
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
        U().f31207A.e(getViewLifecycleOwner(), new b(new l<Short, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupSfdObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Short sh) {
                UDSBasicSettingsFragment uDSBasicSettingsFragment = this.this$0;
                ControlUnit controlUnit = uDSBasicSettingsFragment.f31330t;
                if (controlUnit != null) {
                    SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                    sfdWizardFullScreenDialog.F(controlUnit.n());
                    sfdWizardFullScreenDialog.v(uDSBasicSettingsFragment.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                }
                return r.f47939a;
            }
        }));
        U().f31222y.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupSfdObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                UDSBasicSettingsFragment uDSBasicSettingsFragment = this.this$0;
                ControlUnit controlUnit = uDSBasicSettingsFragment.f31330t;
                if (controlUnit != null) {
                    a aVarV = uDSBasicSettingsFragment.V();
                    aVarV.getClass();
                    C2680e.c(Z.a(aVarV), null, null, new UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1(aVarV, controlUnit, null), 3);
                }
                return r.f47939a;
            }
        }));
        U().f31220w.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupSfdObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                UDSBasicSettingsFragment uDSBasicSettingsFragment = this.this$0;
                com.voltasit.obdeleven.ui.dialogs.B0 b11 = uDSBasicSettingsFragment.f31333w;
                if (b11 == null || !b11.isVisible()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("key_login_finder_enabled", false);
                    com.voltasit.obdeleven.ui.dialogs.B0 b12 = new com.voltasit.obdeleven.ui.dialogs.B0();
                    b12.setArguments(bundle);
                    b12.setTargetFragment(uDSBasicSettingsFragment, 0);
                    b12.f32261r = uDSBasicSettingsFragment.getFragmentManager();
                    uDSBasicSettingsFragment.f31333w = b12;
                    b12.f33753w = uDSBasicSettingsFragment.f31330t;
                    b12.A();
                }
                return r.f47939a;
            }
        }));
        U().f31209C.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupSfdObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new SfdAutoUnlockDialog().v(this.this$0.getChildFragmentManager(), "SfdAutoUnlockDialog");
                return r.f47939a;
            }
        }));
        V().f31356S.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new com.voltasit.obdeleven.presentation.dialogs.f(0).J(this.this$0);
                return r.f47939a;
            }
        }));
        V().f31354Q.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                UDSBasicSettingsFragment uDSBasicSettingsFragment = this.this$0;
                ControlUnit controlUnit = uDSBasicSettingsFragment.f31330t;
                if (controlUnit != null) {
                    SfdViewModel sfdViewModelU = uDSBasicSettingsFragment.U();
                    String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
                    i.d(objectId, "getObjectId(...)");
                    sfdViewModelU.b(objectId, controlUnit.n().shortValue());
                }
                return r.f47939a;
            }
        }));
        V().f31352O.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                UDSBasicSettingsFragment uDSBasicSettingsFragment = this.this$0;
                ControlUnit controlUnit = uDSBasicSettingsFragment.f31330t;
                if (controlUnit != null) {
                    a aVarV = uDSBasicSettingsFragment.V();
                    aVarV.getClass();
                    C2680e.c(Z.a(aVarV), null, null, new UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1(aVarV, controlUnit, null), 3);
                }
                return r.f47939a;
            }
        }));
        O().f32797E.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                U7.a<r> aVar = this.this$0.V().f31351N;
                r rVar2 = r.f47939a;
                aVar.j(rVar2);
                return rVar2;
            }
        }));
        O().f32795C.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                a aVarV = this.this$0.V();
                aVarV.f31364v.Q();
                aVarV.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                return r.f47939a;
            }
        }));
        V().f31366x.e(getViewLifecycleOwner(), new b(new l<List<? extends p207q8.a>, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$6
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends p207q8.a> list) {
                this.this$0.W();
                return r.f47939a;
            }
        }));
        V().f31341D.e(getViewLifecycleOwner(), new b(new l<Pair<? extends Integer, ? extends Boolean>, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$7
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Pair<? extends Integer, ? extends Boolean> pair) {
                Pair<? extends Integer, ? extends Boolean> pair2 = pair;
                MainActivity mainActivityQ = this.this$0.q();
                P.a(mainActivityQ, mainActivityQ.getString(pair2.c().intValue()));
                if (pair2.d().booleanValue()) {
                    this.this$0.r().h();
                }
                return r.f47939a;
            }
        }));
        V().f31345H.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$8
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                MainActivity mainActivityQ = this.this$0.q();
                String string = this.this$0.getString(R.string.common_basic_settings);
                String string2 = this.this$0.getString(R.string.common_not_available);
                i.d(string2, "getString(...)");
                String lowerCase = string2.toLowerCase(Locale.ROOT);
                i.d(lowerCase, "toLowerCase(...)");
                P.a(mainActivityQ, string + " " + lowerCase);
                this.this$0.r().h();
                return r.f47939a;
            }
        }));
        V().f31347J.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.P();
                P.f(this.this$0.requireActivity(), R.string.snackbar_basic_settings_started);
                return r.f47939a;
            }
        }));
        V().f32121k.e(getViewLifecycleOwner(), new b(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                P.a(this.this$0.requireActivity(), str);
                return r.f47939a;
            }
        }));
        V().f31368z.e(getViewLifecycleOwner(), new b(new l<Pair<? extends List<? extends Param>, ? extends Boolean>, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$11
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Pair<? extends List<? extends Param>, ? extends Boolean> pair) {
                Pair<? extends List<? extends Param>, ? extends Boolean> pair2 = pair;
                p135k9.a aVar = this.this$0.f31329s;
                if (aVar != null) {
                    aVar.b();
                    aVar.notifyDataSetChanged();
                    if (pair2.d().booleanValue()) {
                        aVar.a(pair2.c());
                    }
                }
                B0 b11 = this.this$0.f31327q;
                if (b11 == null) {
                    i.m("binding");
                    throw null;
                }
                b11.f1617r.setVisibility(0);
                B0 b12 = this.this$0.f31327q;
                if (b12 != null) {
                    b12.f1620u.n();
                    return r.f47939a;
                }
                i.m("binding");
                throw null;
            }
        }));
        V().f31343F.e(getViewLifecycleOwner(), new b(new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$12
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                String str2 = str;
                B0 b11 = this.this$0.f31327q;
                if (b11 != null) {
                    b11.f1619t.setText(str2);
                    return r.f47939a;
                }
                i.m("binding");
                throw null;
            }
        }));
        V().f31339B.e(getViewLifecycleOwner(), new b(new l<com.voltasit.obdeleven.presentation.basicsettings.a.C0329a, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment$setupObservers$13
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(a.C0329a c0329a) {
                SubscriptionType subscriptionType;
                a.C0329a c0329a2 = c0329a;
                B0 b11 = this.this$0.f31327q;
                if (b11 == null) {
                    i.m("binding");
                    throw null;
                }
                b11.f1623x.setText(c0329a2.f31369a);
                G8.D d10 = (G8.D) this.this$0.O().f32808y.d();
                if (d10 != null && (subscriptionType = d10.f3410a) != null && subscriptionType.c()) {
                    if (c0329a2.f31370b) {
                        B0 b12 = this.this$0.f31327q;
                        if (b12 == null) {
                            i.m("binding");
                            throw null;
                        }
                        b12.f1620u.setImageResource(2131231724);
                        UDSBasicSettingsFragment uDSBasicSettingsFragment = this.this$0;
                        B0 b13 = uDSBasicSettingsFragment.f31327q;
                        if (b13 == null) {
                            i.m("binding");
                            throw null;
                        }
                        b13.f1620u.setBackgroundTintList(p186p0.a.b(uDSBasicSettingsFragment.requireContext(), R.color.fab_selector_red));
                    } else {
                        B0 b14 = this.this$0.f31327q;
                        if (b14 == null) {
                            i.m("binding");
                            throw null;
                        }
                        b14.f1620u.setImageResource(2131231137);
                        UDSBasicSettingsFragment uDSBasicSettingsFragment2 = this.this$0;
                        B0 b15 = uDSBasicSettingsFragment2.f31327q;
                        if (b15 == null) {
                            i.m("binding");
                            throw null;
                        }
                        b15.f1620u.setBackgroundTintList(p186p0.a.b(uDSBasicSettingsFragment2.requireContext(), R.color.fab_selector_green));
                    }
                }
                return r.f47939a;
            }
        }));
        z(V());
        FloatingActionButton fragmentUdsDataFab = b10.f1620u;
        i.d(fragmentUdsDataFab, "fragmentUdsDataFab");
        BaseProFragment.S(this, fragmentUdsDataFab);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        RecyclerView fragmentUdsDataDataList = b10.f1618s;
        i.d(fragmentUdsDataDataList, "fragmentUdsDataDataList");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        p208q9.a aVar = new p208q9.a(getContext(), linearLayoutManager.f19521p);
        aVar.f46180a = getResources().getDrawable(R.drawable.divider_content);
        aVar.f46181b = dimensionPixelSize;
        aVar.f46182c = dimensionPixelSize;
        fragmentUdsDataDataList.setLayoutManager(linearLayoutManager);
        fragmentUdsDataDataList.i(aVar);
        fragmentUdsDataDataList.setHasFixedSize(true);
        b10.f1621v.setVisibility(0);
        b10.f1622w.setText(R.string.view_basic_settings_status);
        fragmentUdsDataFab.setEnabled(c.e());
        O().c(true);
        if (this.f31330t == null) {
            r().h();
        } else if (this.f31329s == null) {
            p135k9.a aVar2 = new p135k9.a(q(), V().f31358p.a());
            this.f31329s = aVar2;
            aVar2.f42885c = this;
            com.voltasit.obdeleven.presentation.basicsettings.a aVarV = V();
            ControlUnit controlUnit = this.f31330t;
            i.b(controlUnit);
            aVarV.getClass();
            C2680e.c(Z.a(aVarV), aVarV.f32112a, null, new UDSBasicSettingsViewModel$loadBasicSettings$1(aVarV, controlUnit, null), 2);
        }
        fragmentUdsDataDataList.setAdapter(this.f31329s);
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new I4.e(this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new I4.f(6, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final SfdViewModel U() {
        return (SfdViewModel) this.f31326p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final com.voltasit.obdeleven.presentation.basicsettings.a V() {
        return (com.voltasit.obdeleven.presentation.basicsettings.a) this.f31325o.getValue();
    }

    public final void W() {
        ArrayList arrayList;
        O0 o10 = this.f31328r;
        if (o10 == null || !o10.isVisible()) {
            com.voltasit.obdeleven.presentation.basicsettings.a aVarV = V();
            List<p207q8.a> basicSettings = aVarV.f31365w.d();
            if (basicSettings == null) {
                basicSettings = EmptyList.f42983b;
            }
            d dVar = aVarV.f31359q;
            dVar.getClass();
            i.e(basicSettings, "basicSettings");
            if (dVar.f30893a.a()) {
                List<p207q8.a> list = basicSettings;
                arrayList = new ArrayList(m.y(list, 10));
                for (p207q8.a aVar : list) {
                    StringBuilder sbF = C4.b.f(aVar.f46174a, " (");
                    sbF.append(aVar.f46178e);
                    sbF.append(")");
                    arrayList.add(sbF.toString());
                }
            } else {
                List<p207q8.a> list2 = basicSettings;
                arrayList = new ArrayList(m.y(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p207q8.a) it.next()).f46174a);
                }
            }
            this.f31331u = new ArrayList<>(arrayList);
            Bundle bundle = new Bundle();
            bundle.putInt("key_last_position", this.f31332v);
            bundle.putStringArrayList("items", this.f31331u);
            bundle.putStringArrayList("key_selected_items", new ArrayList<>());
            O0 o11 = new O0();
            o11.setArguments(bundle);
            o11.f32261r = getFragmentManager();
            o11.setTargetFragment(this, 0);
            this.f31328r = o11;
            o11.A();
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        ControlUnit controlUnit;
        Object next;
        p207q8.a aVar;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        int iHashCode = dialogId.hashCode();
        if (iHashCode == -1828132316) {
            if (dialogId.equals("PopTheHoodDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                B0 b10 = this.f31327q;
                if (b10 != null) {
                    b10.f1620u.performLongClick();
                    return;
                } else {
                    i.m("binding");
                    throw null;
                }
            }
            return;
        }
        if (iHashCode == 111107516) {
            if (dialogId.equals("SecurityAccessDialogFragment")) {
                if (callbackType == DialogCallback.CallbackType.f31102c && (controlUnit = this.f31330t) != null) {
                    com.voltasit.obdeleven.presentation.basicsettings.a aVarV = V();
                    aVarV.getClass();
                    C2680e.c(Z.a(aVarV), aVarV.f32112a, null, new UDSBasicSettingsViewModel$onSecurityAccessSuccess$1(aVarV, controlUnit, null), 2);
                }
                com.voltasit.obdeleven.ui.dialogs.B0 b11 = this.f31333w;
                if (b11 != null) {
                    b11.y();
                }
                this.f31333w = null;
                return;
            }
            return;
        }
        if (iHashCode == 818488834 && dialogId.equals("MultiChoiceDialog")) {
            if (callbackType != DialogCallback.CallbackType.f31102c) {
                if (callbackType == DialogCallback.CallbackType.f31101b) {
                    r().h();
                    return;
                }
                return;
            }
            ArrayList<String> stringArrayList = data.getStringArrayList("items");
            int i10 = data.getInt("key_last_position");
            this.f31332v = i10;
            p279w9.b bVar = Application.f29634b;
            P8.c.a(3, "UDSBasicSettingsFragment", "currentPosition:(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                r().h();
                return;
            }
            com.voltasit.obdeleven.presentation.basicsettings.a aVarV2 = V();
            ControlUnit controlUnit2 = this.f31330t;
            i.b(controlUnit2);
            String str = stringArrayList.get(0);
            i.d(str, "get(...)");
            String str2 = str;
            aVarV2.getClass();
            List<p207q8.a> listD = aVarV2.f31365w.d();
            if (listD == null) {
                listD = EmptyList.f42983b;
            }
            Iterator<T> it = listD.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                aVar = (p207q8.a) next;
                if (aVar.f46174a.equals(str2)) {
                    break;
                }
            } while (!i.a(aVar.f46174a + " (" + aVar.f46178e + ")", str2));
            p207q8.a aVar2 = (p207q8.a) next;
            if (aVar2 == null) {
                return;
            }
            aVarV2.f31350M.clear();
            aVarV2.f31342E.j(aVar2.f46174a);
            aVarV2.f31349L = aVar2;
            C2680e.c(Z.a(aVarV2), aVarV2.f32112a, null, new UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1(aVarV2, controlUnit2, aVar2.f46177d, null), 2);
            aVarV2.f31364v.J(Feature.BasicSettings.a(), aVar2.f46176c);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "UDSBasicSettingsFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ControlUnit controlUnit = this.f31330t;
        if (controlUnit != null) {
            com.voltasit.obdeleven.presentation.basicsettings.a aVarV = V();
            aVarV.getClass();
            C2680e.c(C2673a0.f43223b, null, null, new UDSBasicSettingsViewModel$onDestroyView$1(aVarV, controlUnit, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f31334x.a();
        O0 o10 = this.f31328r;
        if (o10 != null) {
            i.b(o10);
            o10.y();
            this.f31328r = null;
        }
        com.voltasit.obdeleven.ui.dialogs.B0 b10 = this.f31333w;
        if (b10 != null) {
            i.b(b10);
            b10.y();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        i.e(view, "view");
        p135k9.a aVar = this.f31329s;
        i.b(aVar);
        Param paramC = aVar.c(i10);
        Param.Type type = paramC.f29453a;
        if (type == Param.Type.f29473h || type == Param.Type.f29472g) {
            return;
        }
        String strD = paramC.d();
        if (strD == null || strD.length() == 0) {
            B0 b10 = this.f31327q;
            if (b10 == null) {
                i.m("binding");
                throw null;
            }
            strD = b10.f1619t.getText().toString();
        }
        String str = strD;
        this.f31334x.b(getActivity(), str, paramC, false, V().f31358p.a()).continueWith(new a(), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f31324n;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_basic_settings);
        i.d(string, "getString(...)");
        return string;
    }
}
