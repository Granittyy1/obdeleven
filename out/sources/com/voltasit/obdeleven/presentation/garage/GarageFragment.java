package com.voltasit.obdeleven.presentation.garage;

import B8.K0;
import G8.H;
import V8.C0828b;
import V8.C0829c;
import V8.C0830d;
import X5.C;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.C1443h;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.parse.util.VehicleComparator$By;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.C2680e;
import p220r9.A;

/* JADX INFO: compiled from: GarageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GarageFragment extends BaseFragment<K0> implements DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f32299l = R.layout.fragment_vehicle_list;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q f32300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f32301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f32302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f32303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.t f32304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MenuItem f32305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public K0 f32306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f32307t;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.garage.GarageFragment$special$$inlined$viewModel$default$1] */
    public GarageFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.garage.GarageFragment$garageViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(this.this$0.r());
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.garage.GarageFragment$special$$inlined$viewModel$default$1
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
        this.f32307t = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<GarageViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.garage.GarageFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.garage.GarageViewModel] */
            @Override // Ia.a
            public final GarageViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(GarageViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        GarageViewModel garageViewModelO = O();
        if (garageViewModelO.f32347x.length() <= 0) {
            return super.A();
        }
        garageViewModelO.f32321N.j(Boolean.TRUE);
        garageViewModelO.f32347x = "";
        garageViewModelO.f32348y.j(EmptyList.f42983b);
        garageViewModelO.f(0, 50);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(M0.h hVar) {
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        K0 k10 = (K0) hVar;
        this.f32306s = k10;
        k10.t(O());
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f32303p = new a(A0.f.i(this) / 6, new Ia.p<H, Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.garage.GarageFragment$setupVehicleList$1
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(H h8, Integer num) {
                H vehicle = h8;
                int iIntValue = num.intValue();
                kotlin.jvm.internal.i.e(vehicle, "vehicle");
                GarageViewModel garageViewModelO = this.this$0.O();
                garageViewModelO.getClass();
                com.voltasit.obdeleven.domain.usecases.odx.a aVar = garageViewModelO.f32346w;
                aVar.f30890b.f("ClearOdxVersionCache", "ClearOdxVersionCache()");
                aVar.f30889a.b();
                garageViewModelO.f32333Z.j(new GarageViewModel.a(vehicle.f3427a, iIntValue));
                return p293xa.r.f47939a;
            }
        });
        this.f32301n = new s();
        s sVar = new s();
        this.f32302o = sVar;
        sVar.a(false);
        this.f32304q = new androidx.recyclerview.widget.t(new p(this));
        RecyclerView recyclerView = k10.f1738u;
        A.a(recyclerView, false);
        androidx.recyclerview.widget.t tVar = this.f32304q;
        if (tVar == null) {
            kotlin.jvm.internal.i.m("itemTouchHelper");
            throw null;
        }
        tVar.e(recyclerView);
        s sVar2 = this.f32302o;
        if (sVar2 == null) {
            kotlin.jvm.internal.i.m("headerAdapter");
            throw null;
        }
        a aVar = this.f32303p;
        if (aVar == null) {
            kotlin.jvm.internal.i.m("garageAdapter");
            throw null;
        }
        s sVar3 = this.f32301n;
        if (sVar3 == null) {
            kotlin.jvm.internal.i.m("preloaderAdapter");
            throw null;
        }
        recyclerView.setAdapter(new C1443h(sVar2, aVar, sVar3));
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.i.b(layoutManager);
        q qVar = new q(this, layoutManager);
        this.f32300m = qVar;
        recyclerView.j(qVar);
        k10.f1737t.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_in));
        O().f32311D.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.k(this, i12));
        O().f32349z.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.l(this, i10));
        O().f32318K.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.a(this, i10));
        O().f32322O.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.b(this, i12));
        O().f32320M.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.c(this, i12));
        O().f32316I.e(getViewLifecycleOwner(), new D() { // from class: com.voltasit.obdeleven.presentation.garage.k
            @Override // androidx.lifecycle.D
            public final void d(Object obj) {
                Boolean bool = (Boolean) obj;
                GarageFragment this$0 = this.f32376b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                a aVar2 = this$0.f32303p;
                if (aVar2 == null) {
                    kotlin.jvm.internal.i.m("garageAdapter");
                    throw null;
                }
                kotlin.jvm.internal.i.b(bool);
                aVar2.b(bool.booleanValue());
            }
        });
        O().f32332Y.e(getViewLifecycleOwner(), new D() { // from class: com.voltasit.obdeleven.presentation.garage.l
            @Override // androidx.lifecycle.D
            public final void d(Object obj) {
                GarageFragment this$0 = this.f32377b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                new Handler().postDelayed(new C(2, this$0), 100L);
            }
        });
        O().f32330W.e(getViewLifecycleOwner(), new X8.b(this, i12));
        O().f32336c0.e(getViewLifecycleOwner(), new g(this, i11));
        O().f32328U.e(getViewLifecycleOwner(), new C0828b(this, i12));
        O().f32324Q.e(getViewLifecycleOwner(), new C0829c(this, i12));
        O().f32334a0.e(getViewLifecycleOwner(), new C0830d(this, i12));
        O().f32326S.e(getViewLifecycleOwner(), new D() { // from class: com.voltasit.obdeleven.presentation.garage.h
            @Override // androidx.lifecycle.D
            public final void d(Object obj) {
                Pair pair = (Pair) obj;
                GarageFragment this$0 = this.f32371b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                DialogC2146g0 dialogC2146g0 = new DialogC2146g0(this$0.q(), (List) pair.d());
                dialogC2146g0.f33961k = new n(this$0, pair);
                dialogC2146g0.show();
            }
        });
        z(O());
        k10.f1739v.setColorSchemeResources(android.R.color.holo_green_dark, android.R.color.darker_gray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final GarageViewModel O() {
        return (GarageViewModel) this.f32307t.getValue();
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        if (dialogId.equals("AddVehicleDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
            String string = data.getString("vehicle_vin");
            if (string == null) {
                return;
            }
            GarageViewModel garageViewModelO = O();
            garageViewModelO.getClass();
            C2680e.c(Z.a(garageViewModelO), garageViewModelO.f32112a, null, new GarageViewModel$searchVehicle$1(garageViewModelO, string, null), 2);
            return;
        }
        if (dialogId.equals("complainDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
            GarageViewModel garageViewModelO2 = O();
            garageViewModelO2.f32323P.j(Boolean.TRUE);
        } else if (dialogId.equals("complainDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
            r().h();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "GarageFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.i.e(menu, "menu");
        kotlin.jvm.internal.i.e(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.sort_vehicles, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.search);
        kotlin.jvm.internal.i.c(menuItemFindItem, "null cannot be cast to non-null type android.view.MenuItem");
        this.f32305r = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        kotlin.jvm.internal.i.c(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setImeOptions(301989891);
        searchView.setIconifiedByDefault(true);
        searchView.setQueryHint(getString(R.string.common_search));
        searchView.setOnCloseListener(new p033c7.b0(this));
        searchView.setOnQueryTextListener(new com.google.gson.internal.a(this));
        if (O().f32347x.length() > 0) {
            searchView.c();
            searchView.t(O().f32347x);
            searchView.clearFocus();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MenuItem menuItem = this.f32305r;
        if (menuItem != null) {
            View actionView = menuItem.getActionView();
            kotlin.jvm.internal.i.c(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            SearchView searchView = (SearchView) actionView;
            searchView.setOnQueryTextListener(null);
            searchView.setOnQueryTextFocusChangeListener(null);
            searchView.setOnCloseListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.i.e(item, "item");
        GarageViewModel garageViewModelO = O();
        int itemId = item.getItemId();
        K8.o oVar = garageViewModelO.f32342s;
        switch (itemId) {
            case R.id.vehicle_byDateCreated /* 2131363443 */:
                oVar.T(VehicleComparator$By.DATE_CREATED);
                break;
            case R.id.vehicle_byDateUpdated /* 2131363444 */:
                oVar.T(VehicleComparator$By.DATE_UPDATED);
                break;
            case R.id.vehicle_byName /* 2131363445 */:
                oVar.T(VehicleComparator$By.NAME);
                break;
            case R.id.vehicle_byYear /* 2131363446 */:
                oVar.T(VehicleComparator$By.YEAR);
                break;
            default:
                return false;
        }
        garageViewModelO.g(true, true);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32299l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31106b;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_garage);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
