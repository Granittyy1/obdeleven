package com.voltasit.obdeleven.presentation.controlUnit.uds.readdata;

import B8.x1;
import V8.x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.C1452q;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2150i0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p135k9.e;
import p220r9.C2783o;
import p220r9.P;

/* JADX INFO: compiled from: UDSReadDataFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends BaseFragment implements View.OnClickListener, DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2150i0 f31995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f31996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ControlUnit f31997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<COMPUSCALE> f31998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f31999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f32000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f32001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.obdeleven.service.odx.e.g f32002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x1 f32003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.obdeleven.service.odx.e f32004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f32005v = (f) KoinJavaComponent.a(f.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f32006w = KoinJavaComponent.b(b.class, null, null);

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if (this.f31997n == null) {
            r().o(false);
            return true;
        }
        O();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x1 x1Var = (x1) M0.e.a(layoutInflater, R.layout.uds_data_list_fragment, viewGroup, false, null);
        this.f32003t = x1Var;
        if (this.f31997n == null) {
            return x1Var.f4488d;
        }
        i.d(requireContext(), "requireContext(...)");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        C1452q c1452q = new C1452q(contextRequireContext, linearLayoutManager.f19521p);
        Drawable drawable = getResources().getDrawable(R.drawable.divider_list_transparent);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        c1452q.f19936a = drawable;
        this.f32003t.f2190s.setLayoutManager(linearLayoutManager);
        this.f32003t.f2190s.i(c1452q);
        C1445j c1445j = (C1445j) this.f32003t.f2190s.getItemAnimator();
        if (c1445j != null) {
            c1445j.f19555g = false;
        }
        this.f32003t.f2190s.setAdapter(this.f31996m);
        this.f32003t.f2189r.setOnClickListener(this);
        this.f32003t.f2189r.setBackgroundTintList(getResources().getColorStateList(R.color.fab_selector_green));
        O();
        return this.f32003t.f4488d;
    }

    public void O() {
        C2134a0.b(getActivity(), R.string.common_loading);
        this.f31997n.X().onSuccess(new com.parse.b(1, this), Task.BACKGROUND_EXECUTOR).continueWith(new x(2, this), Task.UI_THREAD_EXECUTOR);
    }

    public void P() {
        boolean zA = this.f32005v.a();
        ArrayList<String> arrayListB = C2783o.b(this.f31996m.f42900e, zA);
        C2150i0 c2150i0 = this.f31995l;
        if (c2150i0 == null || !c2150i0.isVisible()) {
            this.f31999p = C2783o.b(this.f31998o, zA);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("items", this.f31999p);
            bundle.putStringArrayList("key_selected_items", arrayListB);
            C2150i0 c2150i1 = new C2150i0();
            c2150i1.setArguments(bundle);
            c2150i1.f32261r = getFragmentManager();
            c2150i1.setTargetFragment(this, 0);
            this.f31995l = c2150i1;
            c2150i1.A();
            this.f31996m.a();
        }
    }

    public void Q() {
        MainActivity mainActivityQ = q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.common_not_available));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (!str.equals("MultiChoiceDialog") || callbackType != DialogCallback.CallbackType.f31102c) {
            if (str.equals("MultiChoiceDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
                r().h();
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("items");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            r().h();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31998o.get(this.f31999p.indexOf(it.next())));
        }
        e eVar = this.f31996m;
        com.obdeleven.service.odx.e.g gVar = this.f32002s;
        eVar.f42900e.addAll(arrayList);
        eVar.f42903h = gVar;
        eVar.notifyDataSetChanged();
        eVar.f42896a.T();
        eVar.j = true;
        eVar.b();
        Feature feature = this instanceof p182o9.f ? Feature.LiveData : Feature.AdvancedIdentification;
        b bVar = (b) this.f32006w.getValue();
        bVar.getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String ti = ((COMPUSCALE) it2.next()).getCOMPUCONST().getVT().getTI();
            if (ti == null) {
                ti = "";
            }
            bVar.f32008p.J(feature.a(), ti);
        }
        if (this.f32001r) {
            UserTrackingUtils.c(UserTrackingUtils.Key.f34246G, 1);
        } else {
            UserTrackingUtils.c(UserTrackingUtils.Key.f34256Q, 1);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "UDSReadDataFragment";
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        O.e.j("UDSReadDataFragment", "onClick");
        if (this.f31996m.f42900e != null && this.f31998o != null) {
            O.e.j("UDSReadDataFragment", "showing dialog");
            P();
            return;
        }
        O.e.j("UDSReadDataFragment", "if inside");
        b bVar = (b) this.f32006w.getValue();
        bVar.getClass();
        C2680e.c(C2673a0.f43223b, null, null, new UdsReadDataViewModel$reportError$1(bVar, null), 3);
        r().h();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f31996m = new e(q(), this.f31997n, this.f32001r);
        UserTrackingUtils.c(UserTrackingUtils.Key.f34246G, 1);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        e eVar = this.f31996m;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C2150i0 c2150i0 = this.f31995l;
        if (c2150i0 != null) {
            c2150i0.y();
            this.f31995l = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }
}
