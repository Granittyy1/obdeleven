package com.voltasit.obdeleven.presentation.history.vehicle;

import B8.E0;
import B8.G0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.models.HistoryTypeLegacy;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.presentation.history.HistoryAdapter;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.parse.model.HistoryDB;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.m;
import p134k8.C2642q1;
import p134k8.a2;
import p170n9.n;
import p220r9.B;
import p220r9.v;
import p220r9.x;
import p220r9.z;
import p255u9.E;

/* JADX INFO: compiled from: VehicleHistoryFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/97/history")
public final class VehicleHistoryFragment extends BaseFragment<G0> implements AdapterView.OnItemClickListener, DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HistoryAdapter f32475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E f32476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ControlUnitDB f32477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f32478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem f32479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem f32480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public G0 f32481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f32482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f32483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f32484u = R.layout.fragment_vehicle_history;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f32485v;

    /* JADX INFO: compiled from: VehicleHistoryFragment.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32486a;

        static {
            int[] iArr = new int[HistoryTypeLegacy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[17] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[15] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[14] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[16] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[3] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[5] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[6] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[7] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[8] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[9] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[10] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[11] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[12] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[13] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f32486a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment$special$$inlined$viewModel$default$1] */
    public VehicleHistoryFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment$special$$inlined$viewModel$default$1
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
        this.f32485v = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<l>(this) { // from class: com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.history.vehicle.l] */
            @Override // Ia.a
            public final l invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(l.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    public static boolean Q(HistoryDB historyDB) {
        return (historyDB.c() == null || historyDB.c().getControlUnitBase() == null || historyDB.c().getControlUnitBase().getParseObject("texttable") != null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(M0.h hVar) {
        String strF;
        G0 g10 = (G0) hVar;
        this.f32481r = g10;
        this.f32483t = true;
        if (this.f32476m == null) {
            r().o(false);
            return;
        }
        RecyclerView recyclerView = g10.f1678u;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.i(new p110i9.g(recyclerView.getContext(), 2));
        recyclerView.setAdapter(this.f32475l);
        k kVar = new k(this, recyclerView.getLayoutManager());
        this.f32478o = kVar;
        recyclerView.j(kVar);
        HistoryAdapter historyAdapter = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter);
        historyAdapter.f32398m.clear();
        historyAdapter.d();
        historyAdapter.notifyDataSetChanged();
        FrameLayout vehicleHistoryFragmentImageFrame = g10.f1677t;
        kotlin.jvm.internal.i.d(vehicleHistoryFragmentImageFrame, "vehicleHistoryFragmentImageFrame");
        if (q().E()) {
            vehicleHistoryFragmentImageFrame.setVisibility(8);
            G0 g11 = this.f32481r;
            if (g11 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = g11.f1678u.getLayoutParams();
            kotlin.jvm.internal.i.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            G0 g12 = this.f32481r;
            if (g12 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            RecyclerView recyclerView2 = g12.f1678u;
            int paddingLeft = recyclerView2.getPaddingLeft();
            G0 g13 = this.f32481r;
            if (g13 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            int paddingRight = g13.f1678u.getPaddingRight();
            G0 g14 = this.f32481r;
            if (g14 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            recyclerView2.setPadding(paddingLeft, 0, paddingRight, g14.f1678u.getPaddingBottom());
        } else {
            ControlUnitDB controlUnitDB = this.f32477n;
            if (controlUnitDB != null) {
                ParseFile parseFile = controlUnitDB.getControlUnitBase().getParseFile("picture");
                strF = parseFile != null ? parseFile.getUrl() : null;
                if (strF == null) {
                    strF = "";
                }
            } else {
                E e10 = this.f32476m;
                kotlin.jvm.internal.i.b(e10);
                strF = e10.f();
            }
            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(strF);
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            com.bumptech.glide.d<Drawable> dVarA = dVarM.a(dVarJ);
            G0 g15 = this.f32481r;
            if (g15 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            dVarA.x(g15.f1676s);
            E e11 = this.f32476m;
            kotlin.jvm.internal.i.b(e11);
            String strE = e11.e();
            kotlin.jvm.internal.i.d(strE, "getModel(...)");
            if (strE.length() == 0) {
                E e12 = this.f32476m;
                kotlin.jvm.internal.i.b(e12);
                strE = e12.d();
                kotlin.jvm.internal.i.d(strE, "getMake(...)");
            }
            if (strE.length() == 0) {
                E e13 = this.f32476m;
                kotlin.jvm.internal.i.b(e13);
                strE = e13.k();
            }
            if (strE.length() == 0) {
                strE = getString(R.string.common_unknown);
                kotlin.jvm.internal.i.d(strE, "getString(...)");
            }
            G0 g16 = this.f32481r;
            if (g16 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            E e14 = this.f32476m;
            kotlin.jvm.internal.i.b(e14);
            g16.f1680w.setText(e14.getString("year"));
            ControlUnitDB controlUnitDB2 = this.f32477n;
            if (controlUnitDB2 != null) {
                G0 g17 = this.f32481r;
                if (g17 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                g17.f1679v.setText(controlUnitDB2.getName());
                G0 g18 = this.f32481r;
                if (g18 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                g18.f1680w.setVisibility(8);
            } else {
                G0 g19 = this.f32481r;
                if (g19 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                g19.f1679v.setText(strE);
            }
        }
        ?? r10 = this.f32485v;
        ((l) r10.getValue()).f32513p.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.k(this, 2));
        ((l) r10.getValue()).f32515r.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.l(this, 3));
        ((l) r10.getValue()).f32516s.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.a(this, 3));
        ((l) r10.getValue()).f32514q.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.b(this, 2));
    }

    public final Bundle O(int i10) {
        HistoryAdapter historyAdapter = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter);
        HistoryDB historyDB = (HistoryDB) historyAdapter.f36795b.get(i10);
        Bundle bundle = new Bundle();
        bundle.putParcelable("vehicleDb", this.f32476m);
        bundle.putParcelable("historyDb", historyDB);
        return bundle;
    }

    public final ArrayList P() {
        ArrayList arrayList = new ArrayList();
        HistoryAdapter historyAdapter = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter);
        Iterator<HistoryTypeFilter> it = historyAdapter.f32394h.b().iterator();
        while (it.hasNext()) {
            Iterator<HistoryTypeFilter> it2 = it.next().c().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().d());
            }
        }
        return arrayList;
    }

    public final void R(int i10) {
        v vVar = new v();
        vVar.f46492f = i10;
        vVar.f46491e = this.f32477n;
        vVar.f46490d = this.f32476m;
        HistoryAdapter historyAdapter = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter);
        vVar.f46489c = historyAdapter.l();
        vVar.f46493g = P();
        HistoryAdapter historyAdapter2 = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter2);
        vVar.f46494h = historyAdapter2.j;
        vVar.f46495i = !this.f32482s;
        p279w9.d.a(vVar.a(), null, new com.google.gson.internal.a(this));
    }

    public final void S(List<? extends HistoryDB> list) {
        HistoryAdapter historyAdapter = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter);
        historyAdapter.b(list);
        if (list.isEmpty()) {
            HistoryAdapter historyAdapter2 = this.f32475l;
            kotlin.jvm.internal.i.b(historyAdapter2);
            if (historyAdapter2.f36795b.size() == 0) {
                String string = getString(R.string.common_no_history_available);
                kotlin.jvm.internal.i.d(string, "getString(...)");
                T(string, false);
                return;
            }
        }
        HistoryAdapter historyAdapter3 = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter3);
        if (historyAdapter3.f32398m.isEmpty()) {
            String string2 = getString(R.string.view_history_filter_no_results);
            kotlin.jvm.internal.i.d(string2, "getString(...)");
            T(string2, false);
            return;
        }
        G0 g10 = this.f32481r;
        if (g10 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        g10.f1678u.setVisibility(0);
        G0 g11 = this.f32481r;
        if (g11 != null) {
            g11.f1675r.setVisibility(8);
        } else {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
    }

    public final void T(String str, boolean z10) {
        G0 g10 = this.f32481r;
        if (g10 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        g10.f1675r.setText(str);
        G0 g11 = this.f32481r;
        if (g11 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        g11.f1675r.setClickable(z10);
        G0 g12 = this.f32481r;
        if (g12 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        g12.f1675r.setVisibility(0);
        G0 g13 = this.f32481r;
        if (g13 != null) {
            g13.f1678u.setVisibility(8);
        } else {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        if (callbackType != DialogCallback.CallbackType.f31102c) {
            if (callbackType == DialogCallback.CallbackType.f31101b) {
                r().h();
                return;
            }
            return;
        }
        this.f32483t = false;
        J();
        R(0);
        G0 g10 = this.f32481r;
        if (g10 != null) {
            g10.f1675r.setVisibility(8);
        } else {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "VehicleHistoryFragment";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.history.vehicle.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.voltasit.obdeleven.presentation.history.vehicle.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.history.vehicle.c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.voltasit.obdeleven.presentation.history.vehicle.h] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f32476m = (E) bundle.getParcelable("vehicle");
            this.f32477n = (ControlUnitDB) bundle.getParcelable("control_unit");
        } else if (getArguments() != null) {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.b(arguments);
            this.f32476m = (E) arguments.getParcelable("vehicle");
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.b(arguments2);
            this.f32477n = (ControlUnitDB) arguments2.getParcelable("control_unit");
        }
        ?? r10 = new AdapterView.OnItemClickListener() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.h
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                VehicleHistoryFragment this$0 = this.f32507b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                NavigationManager navigationManagerR = this$0.r();
                p060e9.d dVar = new p060e9.d();
                dVar.setArguments(this$0.O(i10));
                navigationManagerR.n(dVar, null);
            }
        };
        ?? r11 = new AdapterView.OnItemClickListener() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.i
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                VehicleHistoryFragment this$0 = this.f32508b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                NavigationManager navigationManagerR = this$0.r();
                p060e9.a aVar = new p060e9.a();
                aVar.setArguments(this$0.O(i10));
                navigationManagerR.n(aVar, null);
            }
        };
        ?? r12 = new AdapterView.OnItemClickListener() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                VehicleHistoryFragment this$0 = this.f32492b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                NavigationManager navigationManagerR = this$0.r();
                p060e9.b bVar = new p060e9.b();
                bVar.setArguments(this$0.O(i10));
                navigationManagerR.n(bVar, null);
            }
        };
        ?? r13 = new AdapterView.OnItemClickListener() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                VehicleHistoryFragment this$0 = this.f32493b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                HistoryDB historyDB = (HistoryDB) this$0.O(i10).getParcelable("historyDb");
                if (historyDB == null) {
                    historyDB = new HistoryDB();
                }
                String strH = historyDB.h();
                kotlin.jvm.internal.i.d(strH, "getLiveDataType(...)");
                if (m.I(strH, "KWP", false)) {
                    n nVar = new n();
                    nVar.setArguments(this$0.O(i10));
                    nVar.f31783u = new ControlUnit(historyDB.c(), new a2(this$0.f32476m), null, null);
                    this$0.r().n(nVar, null);
                    return;
                }
                NavigationManager navigationManagerR = this$0.r();
                p060e9.f fVar = new p060e9.f();
                fVar.setArguments(this$0.O(i10));
                navigationManagerR.n(fVar, null);
            }
        };
        this.f32482s = this.f32477n != null;
        HistoryAdapter historyAdapter = new HistoryAdapter(getActivity(), this.f32482s);
        this.f32475l = historyAdapter;
        historyAdapter.f32399n = this;
        historyAdapter.f32400o = r10;
        historyAdapter.f32401p = r11;
        historyAdapter.f32402q = r12;
        historyAdapter.f32403r = r13;
        HistoryTypeFilter.a();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.i.e(menu, "menu");
        kotlin.jvm.internal.i.e(inflater, "inflater");
        MenuItem menuItemAdd = menu.add(R.string.common_filter);
        this.f32479p = menuItemAdd;
        if (menuItemAdd != null) {
            menuItemAdd.setIcon(2131231154);
        }
        MenuItem menuItem = this.f32479p;
        if (menuItem != null) {
            menuItem.setShowAsAction(2);
        }
        MenuItem menuItem2 = this.f32479p;
        if (menuItem2 != null) {
            menuItem2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.f
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem3) {
                    VehicleHistoryFragment this$0 = this.f32505a;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    HistoryAdapter historyAdapter = this$0.f32475l;
                    kotlin.jvm.internal.i.b(historyAdapter);
                    historyAdapter.k(new R0.j(1, this$0));
                    return true;
                }
            });
        }
        MenuItem menuItemAdd2 = menu.add(R.string.common_share);
        this.f32480q = menuItemAdd2;
        if (menuItemAdd2 != null) {
            menuItemAdd2.setIcon(2131231719);
        }
        MenuItem menuItem3 = this.f32480q;
        if (menuItem3 != null) {
            menuItem3.setShowAsAction(2);
        }
        MenuItem menuItem4 = this.f32480q;
        if (menuItem4 != null) {
            menuItem4.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.g
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem5) {
                    final VehicleHistoryFragment this$0 = this.f32506a;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.H(R.string.common_generating_log);
                    final Context applicationContext = this$0.q().getApplicationContext();
                    final ArrayList arrayListP = this$0.P();
                    HistoryAdapter historyAdapter = this$0.f32475l;
                    kotlin.jvm.internal.i.b(historyAdapter);
                    final Date dateL = historyAdapter.l();
                    kotlin.jvm.internal.i.d(dateL, "getDateFilter(...)");
                    HistoryAdapter historyAdapter2 = this$0.f32475l;
                    kotlin.jvm.internal.i.b(historyAdapter2);
                    final boolean z10 = historyAdapter2.j;
                    Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.e
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws ParseException {
                            List<T> list;
                            Context context;
                            VehicleHistoryFragment this$1 = this$0;
                            kotlin.jvm.internal.i.e(this$1, "this$0");
                            Date date = dateL;
                            ArrayList arrayList = arrayListP;
                            File fileA = null;
                            int i10 = 0;
                            do {
                                v vVar = new v();
                                vVar.f46491e = this$1.f32477n;
                                vVar.f46490d = this$1.f32476m;
                                vVar.f46489c = date;
                                vVar.f46493g = arrayList;
                                vVar.f46494h = z10;
                                vVar.f46492f = i10;
                                vVar.f46499n = t.d.DEFAULT_DRAG_ANIMATION_DURATION;
                                vVar.f46495i = !this$1.f32482s;
                                w9.d.a aVarD = p279w9.d.d(vVar.a(), null);
                                ParseException parseException = aVarD.f47830a;
                                if (parseException != null) {
                                    throw parseException;
                                }
                                list = aVarD.f47831b;
                                boolean zIsEmpty = list.isEmpty();
                                context = applicationContext;
                                if (zIsEmpty) {
                                    break;
                                }
                                E e10 = this$1.f32476m;
                                kotlin.jvm.internal.i.b(e10);
                                List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                                DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
                                StringBuilder sb2 = new StringBuilder();
                                if (i10 == 0) {
                                    B.c(context, e10, sb2, context.getString(R.string.common_history_log));
                                }
                                StringBuilder sb3 = new StringBuilder(sb2);
                                for (T t8 : list) {
                                    t8.setVehicle(e10);
                                    B.a(context, t8, databaseLanguageValueOf.b(), sb3, null);
                                }
                                fileA = x.a(context, sb3.toString(), i10 != 0);
                                i10++;
                            } while (list.size() >= 200);
                            E e11 = this$1.f32476m;
                            kotlin.jvm.internal.i.b(e11);
                            StringBuilder sb4 = new StringBuilder();
                            B.c(context, e11, sb4, context.getString(R.string.common_history_log));
                            List<String> list3 = com.voltasit.obdeleven.a.f29638c;
                            String strG = com.voltasit.obdeleven.a.C0320a.a(context).g();
                            z zVar = new z(context);
                            zVar.f46510c = strG;
                            zVar.f46515h = e11.k();
                            zVar.f46513f = e11.d();
                            zVar.f46514g = e11.e();
                            zVar.b(sb4.toString());
                            zVar.f46509b = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", fileA);
                            zVar.c(R.string.common_send_history);
                            return zVar.a();
                        }
                    }).continueWith(new com.voltasit.obdeleven.core.app.B(2, this$0));
                    return true;
                }
            });
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        w();
        MenuItem menuItem = this.f32480q;
        if (menuItem != null) {
            kotlin.jvm.internal.i.b(menuItem);
            menuItem.setOnMenuItemClickListener(null);
        }
        MenuItem menuItem2 = this.f32479p;
        if (menuItem2 != null) {
            kotlin.jvm.internal.i.b(menuItem2);
            menuItem2.setOnMenuItemClickListener(null);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        kotlin.jvm.internal.i.e(view, "view");
        HistoryAdapter historyAdapter = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter);
        final HistoryDB historyDB = (HistoryDB) historyAdapter.f36795b.get(i10);
        Bundle bundle = new Bundle();
        int i11 = a.f32486a[HistoryTypeLegacy.d(historyDB.getString("type")).ordinal()];
        if (i11 == 1) {
            final ControlUnit controlUnit = new ControlUnit(historyDB.c(), new a2(this.f32476m), null, null);
            final p170n9.e eVar = new p170n9.e();
            final Handler handler = new Handler(Looper.getMainLooper());
            J();
            Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    p121j8.e eVarA;
                    ControlUnit controlUnit2 = controlUnit;
                    kotlin.jvm.internal.i.e(controlUnit2, "$controlUnit");
                    VehicleHistoryFragment this$0 = this;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    HistoryDB historyDB2 = historyDB;
                    kotlin.jvm.internal.i.e(historyDB2, "$historyDB");
                    Handler handler2 = handler;
                    kotlin.jvm.internal.i.e(handler2, "$handler");
                    p170n9.e fragment = eVar;
                    kotlin.jvm.internal.i.e(fragment, "$fragment");
                    try {
                        eVarA = p121j8.e.a(controlUnit2);
                    } catch (Exception e10) {
                        O.e.l("VehicleHistoryFragment", "Unable to get long coding labels");
                        O.e.m(e10);
                        eVarA = null;
                    }
                    handler2.post(new d(this$0, fragment, controlUnit2, new C2642q1(historyDB2.d().optString("newValue"), eVarA), new C2642q1(historyDB2.d().optString("oldValue"), eVarA), 0));
                    return null;
                }
            });
            return;
        }
        if (i11 == 2) {
            HistoryAdapter historyAdapter2 = this.f32475l;
            kotlin.jvm.internal.i.b(historyAdapter2);
            bundle.putParcelable("historyItem", (Parcelable) historyAdapter2.f36795b.get(i10));
            NavigationManager navigationManagerR = r();
            p060e9.j jVar = new p060e9.j();
            jVar.setArguments(bundle);
            navigationManagerR.n(jVar, null);
            return;
        }
        if (i11 == 3) {
            HistoryAdapter historyAdapter3 = this.f32475l;
            kotlin.jvm.internal.i.b(historyAdapter3);
            bundle.putParcelable("historyItem", (Parcelable) historyAdapter3.f36795b.get(i10));
            NavigationManager navigationManagerR2 = r();
            com.voltasit.obdeleven.presentation.history.l lVar = new com.voltasit.obdeleven.presentation.history.l();
            lVar.setArguments(bundle);
            navigationManagerR2.n(lVar, null);
            return;
        }
        if (i11 != 4) {
            if (i11 != 5) {
                return;
            }
            EepromFragment eepromFragment = new EepromFragment();
            bundle.putParcelable("key_history_db", historyDB);
            eepromFragment.setArguments(bundle);
            r().n(eepromFragment, null);
            return;
        }
        HistoryAdapter historyAdapter4 = this.f32475l;
        kotlin.jvm.internal.i.b(historyAdapter4);
        bundle.putParcelable("historyItem", (Parcelable) historyAdapter4.f36795b.get(i10));
        NavigationManager navigationManagerR3 = r();
        p170n9.i iVar = new p170n9.i();
        iVar.setArguments(bundle);
        navigationManagerR3.n(iVar, null);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("vehicle", this.f32476m);
        ControlUnitDB controlUnitDB = this.f32477n;
        if (controlUnitDB != null) {
            outState.putParcelable("control_unit", controlUnitDB);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32484u;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_history);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
