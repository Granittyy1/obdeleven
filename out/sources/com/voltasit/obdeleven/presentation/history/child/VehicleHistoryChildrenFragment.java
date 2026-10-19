package com.voltasit.obdeleven.presentation.history.child;

import B8.z1;
import M0.h;
import O.e;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.media3.exoplayer.C1406y;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.models.HistoryTypeLegacy;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.j;
import com.voltasit.obdeleven.presentation.history.k;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.parse.model.HistoryDB;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p220r9.A;
import p220r9.v;
import p255u9.E;

/* JADX INFO: compiled from: VehicleHistoryChildrenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class VehicleHistoryChildrenFragment extends BaseFragment<z1> implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f32423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HistoryDB f32424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E f32425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f32426o = R.layout.vehicle_history_scan_fragment;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f32427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f32428q;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment$special$$inlined$viewModel$default$1] */
    public VehicleHistoryChildrenFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment$special$$inlined$viewModel$default$1
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
        this.f32427p = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<d>(this) { // from class: com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.history.child.d] */
            @Override // Ia.a
            public final d invoke() {
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
                return Gb.a.a(l.a(d.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<GetUserDetailsUC>(this) { // from class: com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment$special$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC, java.lang.Object] */
            @Override // Ia.a
            public final GetUserDetailsUC invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(GetUserDetailsUC.class));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        z1 z1Var = (z1) hVar;
        setHasOptionsMenu(true);
        if (this.f32424m == null) {
            r().o(false);
            return;
        }
        RecyclerView vehicleHistoryScanFragmentList = z1Var.f2218r;
        i.d(vehicleHistoryScanFragmentList, "vehicleHistoryScanFragmentList");
        A.a(vehicleHistoryScanFragmentList, false);
        vehicleHistoryScanFragmentList.setAdapter(this.f32423l);
        k kVar = this.f32423l;
        i.b(kVar);
        if (kVar.f36795b.isEmpty()) {
            v vVar = new v();
            HistoryDB historyDB = this.f32424m;
            i.b(historyDB);
            vVar.f46490d = historyDB.getVehicle();
            vVar.j = this.f32424m;
            vVar.f46496k = true;
            vVar.f46497l = true;
            vVar.f46498m = true;
            vVar.f46494h = true;
            p279w9.d.a(vVar.a(), null, new C1406y(this));
        }
        ?? r10 = this.f32427p;
        ((d) r10.getValue()).f32438o.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.i(this, 3));
        ((d) r10.getValue()).f32440q.e(getViewLifecycleOwner(), new j(this, 1));
        ((d) r10.getValue()).f32439p.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.k(this, 1));
    }

    public abstract k O();

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "VehicleHistoryScanFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = this.f34090k;
        i.b(bundle2);
        HistoryDB historyDB = (HistoryDB) bundle2.getParcelable("historyItem");
        this.f32424m = historyDB;
        if (historyDB != null) {
            this.f32425n = historyDB.getVehicle();
        } else {
            e.l("VehicleHistoryScanFragment", "scanHistoryDb is null");
            r().h();
        }
        k kVarO = O();
        this.f32423l = kVarO;
        kVarO.j = this;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        MenuItem menuItemAdd = menu.add(R.string.common_share);
        menuItemAdd.setIcon(2131231719);
        menuItemAdd.setShowAsAction(1);
        menuItemAdd.setOnMenuItemClickListener(new a(this, 0));
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        i.e(view, "view");
        k kVar = this.f32423l;
        i.b(kVar);
        if (HistoryTypeLegacy.d(((HistoryDB) kVar.f36795b.get(i10)).getString("type")) == HistoryTypeLegacy.f31145f) {
            Bundle bundle = new Bundle();
            k kVar2 = this.f32423l;
            i.b(kVar2);
            bundle.putParcelable("historyItem", (Parcelable) kVar2.f36795b.get(i10));
            NavigationManager navigationManagerR = r();
            p170n9.i iVar = new p170n9.i();
            iVar.setArguments(bundle);
            navigationManagerR.n(iVar, null);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        HistoryDB historyDB = this.f32424m;
        if (historyDB != null) {
            outState.putParcelable("historyItem", historyDB);
        }
        E e10 = this.f32425n;
        if (e10 != null) {
            outState.putParcelable("vehicleDb", e10);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32426o;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String u() {
        String string = getString(R.string.common_full_scan);
        i.d(string, "getString(...)");
        return string;
    }
}
