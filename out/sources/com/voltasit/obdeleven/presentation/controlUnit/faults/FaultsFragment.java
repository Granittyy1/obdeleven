package com.voltasit.obdeleven.presentation.controlUnit.faults;

import B8.AbstractC0629h;
import B8.E0;
import Ia.l;
import V8.k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.C1452q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bumptech.glide.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.messaging.U;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.obdeleven.service.util.FaultsUtils;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p134k8.a2;
import p220r9.B;
import p220r9.P;
import p220r9.Q;
import p220r9.z;
import p255u9.E;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: FaultsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/105/faults")
public class FaultsFragment extends BaseFragment<AbstractC0629h> implements View.OnClickListener, AdapterView.OnItemSelectedListener, View.OnLongClickListener, SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f31589l = R.layout.control_unit_faults_fragment;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p122j9.a f31590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ControlUnit f31591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DatabaseLanguage f31592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0629h f31593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f31594q;

    /* JADX INFO: compiled from: FaultsFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31595b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f31595b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f31595b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31595b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f31595b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f31595b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$special$$inlined$viewModel$default$1] */
    public FaultsFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$special$$inlined$viewModel$default$1
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
        this.f31594q = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlUnit.faults.b] */
            @Override // Ia.a
            public final b invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    public void O() {
        Q().f1928s.setEnabled(false);
        Q().f1934y.setRefreshing(true);
        ControlUnit controlUnit = this.f31591n;
        i.b(controlUnit);
        controlUnit.k().continueWith(new k(2, this), Task.UI_THREAD_EXECUTOR);
    }

    public void P() {
        a2 a2Var;
        ControlUnit controlUnit = this.f31591n;
        this.f31590m = new p122j9.a(q(), this.f31592o, (controlUnit == null || (a2Var = controlUnit.f29321c) == null) ? null : a2Var.f42726c, true);
    }

    public final AbstractC0629h Q() {
        AbstractC0629h abstractC0629h = this.f31593p;
        if (abstractC0629h != null) {
            return abstractC0629h;
        }
        i.m("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final b R() {
        return (b) this.f31594q.getValue();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void C(AbstractC0629h abstractC0629h) {
        R().f31609y.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                final FaultsFragment faultsFragment = this.this$0;
                faultsFragment.getClass();
                faultsFragment.K(new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$showTryAgainDialog$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        if (faultsFragment.getActivity() != null) {
                            faultsFragment.r().h();
                        }
                        return r.f47939a;
                    }
                }, new l<DialogInterface, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        it.dismiss();
                        faultsFragment.R().b();
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        }));
        R().f31604t.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.W();
                return r.f47939a;
            }
        }));
        R().f31606v.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.T(false);
                return r.f47939a;
            }
        }));
        R().f31607w.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment$setupObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                AbstractC0629h abstractC0629hQ = this.this$0.Q();
                ControlUnit controlUnit = this.this$0.f31591n;
                i.b(controlUnit);
                DatabaseLanguage databaseLanguage = this.this$0.f31592o;
                i.b(databaseLanguage);
                abstractC0629hQ.f1933x.setText(controlUnit.x(databaseLanguage.b()));
                FaultsFragment faultsFragment = this.this$0;
                com.bumptech.glide.e eVarF = com.bumptech.glide.b.c(faultsFragment.getContext()).f(faultsFragment);
                ControlUnit controlUnit2 = this.this$0.f31591n;
                i.b(controlUnit2);
                d<Drawable> dVarM = eVarF.m(controlUnit2.a0());
                T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
                i.d(dVarJ, "placeholder(...)");
                dVarM.a(dVarJ).x(this.this$0.Q().f1929t);
                return r.f47939a;
            }
        }));
        this.f31593p = abstractC0629h;
        ControlUnit controlUnit = this.f31591n;
        if (controlUnit != null) {
            b bVarR = R();
            bVarR.getClass();
            bVarR.f31610z = controlUnit;
            bVarR.b();
        }
        Q.a(abstractC0629h.f1934y, this);
        p110i9.i iVar = new p110i9.i(getActivity(), DatabaseLanguage.values());
        Spinner spinner = abstractC0629h.f1931v;
        spinner.setAdapter((SpinnerAdapter) iVar);
        DatabaseLanguage[] databaseLanguageArrValues = DatabaseLanguage.values();
        spinner.setSelection(Arrays.asList(Arrays.copyOf(databaseLanguageArrValues, databaseLanguageArrValues.length)).indexOf(this.f31592o));
        spinner.setOnItemSelectedListener(this);
        C1452q c1452q = new C1452q(getContext(), 1);
        Drawable drawable = getResources().getDrawable(R.drawable.divider_list_transparent);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        c1452q.f19936a = drawable;
        RecyclerView recyclerView = abstractC0629h.f1932w;
        recyclerView.i(c1452q);
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(this.f31590m);
        FloatingActionButton floatingActionButton = abstractC0629h.f1928s;
        floatingActionButton.setOnClickListener(this);
        floatingActionButton.setOnLongClickListener(this);
        floatingActionButton.h();
        if (q().E()) {
            abstractC0629h.f1929t.setVisibility(8);
            abstractC0629h.f1930u.setBackground(getResources().getDrawable(R.drawable.white_card));
            abstractC0629h.f1933x.setTextColor(getResources().getColor(R.color.black));
        }
        z(R());
    }

    public void T(boolean z10) {
        if (this.f31591n == null) {
            return;
        }
        Q().f1928s.setEnabled(false);
        Q().f1934y.setRefreshing(true);
        ControlUnit controlUnit = this.f31591n;
        i.b(controlUnit);
        controlUnit.p0(true, R().f31597A).continueWith(new V8.l(5, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void U(List<? extends Fault> list) {
        Q().f1928s.setEnabled(false);
        Q().f1934y.setRefreshing(true);
        ControlUnit controlUnit = this.f31591n;
        i.b(controlUnit);
        i.b(list);
        FaultsUtils.f(controlUnit, list, new L9.a(this, 3, list));
    }

    public void V(Menu menu) {
        i.e(menu, "menu");
        MenuItem menuItemAdd = menu.add("Share");
        menuItemAdd.setIcon(2131231719);
        menuItemAdd.setShowAsAction(1);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.faults.a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                FaultsFragment this$0 = this.f31596a;
                i.e(this$0, "this$0");
                ControlUnit controlUnit = this$0.f31591n;
                i.b(controlUnit);
                a2 a2Var = controlUnit.f29321c;
                ActivityC1347l activity = this$0.getActivity();
                ControlUnit controlUnit2 = this$0.f31591n;
                Object obj = B.f46402a;
                String strH = B.h(activity, a2Var, Collections.singletonList(controlUnit2));
                String strH0 = this$0.R().f31602r.h0();
                z zVar = new z(this$0.requireContext());
                zVar.f46510c = strH0;
                zVar.c(R.string.share_dtcs);
                zVar.b(strH);
                E e10 = a2Var.f42726c;
                zVar.f46515h = e10.k();
                zVar.f46513f = e10.d();
                zVar.f46514g = e10.e();
                Intent intentA = zVar.a();
                UserTrackingUtils.c(UserTrackingUtils.Key.f34243D, 1);
                this$0.startActivity(intentA);
                return true;
            }
        });
    }

    public void W() {
        if (this.f31591n == null) {
            return;
        }
        AbstractC0629h abstractC0629hQ = Q();
        ControlUnit controlUnit = this.f31591n;
        i.b(controlUnit);
        DatabaseLanguage databaseLanguage = this.f31592o;
        i.b(databaseLanguage);
        abstractC0629hQ.f1933x.setText(controlUnit.x(databaseLanguage.b()));
        com.bumptech.glide.e eVarF = com.bumptech.glide.b.c(getContext()).f(this);
        ControlUnit controlUnit2 = this.f31591n;
        i.b(controlUnit2);
        d<Drawable> dVarM = eVarF.m(controlUnit2.a0());
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
        i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(Q().f1929t);
        ControlUnit controlUnit3 = R().f31610z;
        if (controlUnit3 == null) {
            i.m("controlUnit");
            throw null;
        }
        List<? extends Fault> listQ = controlUnit3.q();
        if (listQ == null) {
            listQ = EmptyList.f42983b;
        }
        U(listQ);
    }

    public final void X() {
        if (q().E()) {
            BaseFragment<?> baseFragment = r().f34233d;
            ControlUnitFragment controlUnitFragment = baseFragment instanceof ControlUnitFragment ? (ControlUnitFragment) baseFragment : null;
            if (controlUnitFragment != null) {
                U u10 = new U(1, baseFragment);
                if (controlUnitFragment.j) {
                    u10.run();
                } else {
                    controlUnitFragment.f34084d = u10;
                }
            }
        }
    }

    public final void Y() {
        ControlUnit controlUnit = this.f31591n;
        if (controlUnit != null) {
            short sShortValue = controlUnit.n().shortValue();
            b bVarR = R();
            bVarR.getClass();
            C2680e.c(Z.a(bVarR), bVarR.f32112a, null, new FaultsViewModel$updateControlUnitList$1(bVarR, sShortValue, null), 2);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "ControlUnitFaultsFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        i.e(v10, "v");
        if (v10.getId() == R.id.controlUnitFaultsFragment_fab) {
            p122j9.a aVar = this.f31590m;
            i.b(aVar);
            if (aVar.f41158b.size() == 0) {
                T(true);
            } else {
                P.b(requireActivity(), R.string.common_press_and_hold);
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        this.f31592o = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).c());
        P();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        V(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
        this.f31592o = DatabaseLanguage.values()[i10];
        p122j9.a aVar = this.f31590m;
        i.b(aVar);
        aVar.f41161e = this.f31592o;
        aVar.notifyDataSetChanged();
        if (this.f31591n == null) {
            O.e.D("ControlUnitFaultsFragment", "Control unit is null");
            r().o(false);
            return;
        }
        AbstractC0629h abstractC0629hQ = Q();
        ControlUnit controlUnit = this.f31591n;
        i.b(controlUnit);
        DatabaseLanguage databaseLanguage = this.f31592o;
        i.b(databaseLanguage);
        abstractC0629hQ.f1933x.setText(controlUnit.x(databaseLanguage.b()));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View v10) {
        i.e(v10, "v");
        if (v10.getId() != R.id.controlUnitFaultsFragment_fab) {
            return false;
        }
        p122j9.a aVar = this.f31590m;
        i.b(aVar);
        if (aVar.f41158b.size() == 0) {
            return true;
        }
        O();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ControlUnit controlUnit = this.f31591n;
        if (controlUnit != null) {
            controlUnit.a();
        }
        SwipeRefreshLayout swipeRefreshLayout = Q().f1934y;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.destroyDrawingCache();
            swipeRefreshLayout.clearAnimation();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        T(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f31589l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_faults);
        i.d(string, "getString(...)");
        return string;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
