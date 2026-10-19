package p085g9;

import B7.b;
import W7.c;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.internal.measurement.Y;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.vehicle.gauges.GaugeFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.h1;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p220r9.A;
import p220r9.P;
import p220r9.Q;
import p255u9.D;
import p255u9.E;
import p255u9.h;
import p255u9.z;
import p279w9.a;
import p279w9.d;

/* JADX INFO: compiled from: GaugeListFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class j extends BaseFragment implements AdapterView.OnItemClickListener, DialogCallback, SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f35663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f35664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f35665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f35666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SwipeRefreshLayout f35669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h1 f35670s;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_gauge_list, viewGroup, false);
        this.f35663l = (RecyclerView) viewInflate.findViewById(R.id.gaugeListFragment_list);
        this.f35664m = (TextView) viewInflate.findViewById(R.id.gaugeListFragment_empty);
        if (bundle != null) {
            this.f35666o = (E) bundle.getParcelable("vehicle");
        }
        A.a(this.f35663l, q().E());
        this.f35663l.setHasFixedSize(true);
        this.f35663l.setAdapter(this.f35665n);
        if (this.f35666o == null) {
            P.b(getActivity(), R.string.common_something_went_wrong);
            r().h();
            return viewInflate;
        }
        O(false);
        if (this.f35668q) {
            this.f35668q = false;
        }
        SwipeRefreshLayout swipeRefreshLayoutC = Q.c(viewInflate);
        this.f35669r = swipeRefreshLayoutC;
        Q.a(swipeRefreshLayoutC, this);
        return this.f35669r;
    }

    public final void O(final boolean z10) {
        if (!z10) {
            C2134a0.b(q(), R.string.view_gauge_list_loading_gauges);
        }
        Task.forResult(Boolean.valueOf(!this.f35667p && c.e())).continueWithTask(new f()).continueWith(new Continuation() { // from class: g9.g
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                final j jVar = this.f35656a;
                jVar.getClass();
                final List list = (List) task.getResult();
                D dI = jVar.f35666o.i();
                int i10 = h.f47472b;
                ParseQuery query = ParseQuery.getQuery(h.class);
                query.whereContainedIn("platform", Arrays.asList(dI.getString("platform"), "OBDII"));
                query.whereContainedIn("models", Arrays.asList(dI.a(), "all"));
                int i11 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && ((z) ParseUser.getCurrentUser()).getInt("role") < 2) {
                    query.whereEqualTo("production", Boolean.TRUE);
                }
                query.addDescendingOrder("createdAt");
                a aVar = new a(b.c("GAUGES", jVar.f35666o.i().getObjectId()), 86400000L);
                final boolean z11 = z10;
                if (z11) {
                    Application.f29634b.a(aVar);
                }
                d.a(query, aVar, new d.b() { // from class: g9.h
                    @Override // w9.d.b
                    public final void g(List list2, ParseException parseException) {
                        List list3;
                        j jVar2 = jVar;
                        if (jVar2.y()) {
                            return;
                        }
                        if (z11) {
                            jVar2.f35669r.setRefreshing(false);
                        } else {
                            C2134a0.a();
                        }
                        if (parseException != null) {
                            if (parseException.getCode() == 120 || jVar2.f35665n.f35643a.size() != 0) {
                                return;
                            }
                            if (parseException.getCode() == 100) {
                                Y.k(jVar2, R.string.common_check_network, "TryAgainDialog");
                                return;
                            }
                            MainActivity mainActivityQ = jVar2.q();
                            P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
                            jVar2.r().h();
                            return;
                        }
                        if (list2.isEmpty()) {
                            if (jVar2.f35665n.f35643a.size() == 0) {
                                c cVar = jVar2.f35665n;
                                cVar.f35643a.clear();
                                cVar.notifyDataSetChanged();
                                jVar2.f35663l.setVisibility(8);
                                jVar2.f35664m.setVisibility(0);
                                jVar2.f35664m.setText(R.string.view_gauge_list_gauges_not_available);
                                return;
                            }
                            return;
                        }
                        if (!jVar2.f35667p && c.e()) {
                            for (p255u9.h hVar : new ArrayList(list2)) {
                                if (hVar.getString("platform").equals("OBDII") && ((list3 = list) == null || !list3.contains(hVar.getString("control_unit")))) {
                                    list2.remove(hVar);
                                }
                            }
                        }
                        if (jVar2.f35665n.f35643a.size() != list2.size()) {
                            c cVar2 = jVar2.f35665n;
                            cVar2.f35643a.clear();
                            cVar2.notifyDataSetChanged();
                            c cVar3 = jVar2.f35665n;
                            cVar3.f35643a.addAll(list2);
                            cVar3.notifyDataSetChanged();
                            jVar2.f35663l.setVisibility(0);
                            jVar2.f35664m.setVisibility(8);
                        }
                    }
                });
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("TryAgainDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                O(false);
                return;
            } else {
                if (callbackType == DialogCallback.CallbackType.f31101b) {
                    r().h();
                    return;
                }
                return;
            }
        }
        if (str.equals("WarningDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
            boolean z10 = bundle.getBoolean("key_checkbox_bool");
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            com.voltasit.obdeleven.a.C0320a.a(activity).j("show_offline_meas_warning", !z10);
            this.f35670s = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "GaugeListFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = new c(getActivity(), getResources().getDisplayMetrics().heightPixels / 6);
        this.f35665n = cVar;
        cVar.f35647e = this;
        this.f35668q = true;
        if (this.f35667p || !c.e()) {
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            if (com.voltasit.obdeleven.a.C0320a.a(activity).b("show_offline_meas_warning", true) && this.f35670s == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_message", R.string.view_gauge_warning);
                bundle2.putInt("key_positive_text", R.string.common_ok);
                h1 h1Var = new h1();
                h1Var.setArguments(bundle2);
                h1Var.f32261r = getParentFragmentManager();
                h1Var.setTargetFragment(this, 0);
                this.f35670s = h1Var;
                h1Var.A();
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        h1 h1Var = this.f35670s;
        if (h1Var != null) {
            h1Var.y();
            this.f35670s = null;
        }
        this.f35665n.f35647e = null;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C2134a0.a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        GaugeFragment gaugeFragment = new GaugeFragment();
        gaugeFragment.Q((h) this.f35665n.f35643a.get(i10), this.f35667p);
        AutoTransition autoTransition = new AutoTransition();
        gaugeFragment.setSharedElementEnterTransition(autoTransition);
        autoTransition.addListener((Transition.TransitionListener) new a());
        L(gaugeFragment, view, "gaugeImageTransition");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        O(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("vehicle", this.f35666o);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_gauges);
    }

    /* JADX INFO: compiled from: GaugeListFragment.java */
    public class a implements Transition.TransitionListener {
        public a() {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            j.this.f35665n.f35646d = true;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            c cVar = j.this.f35665n;
            cVar.f35646d = false;
            ArrayList arrayList = cVar.f35648f;
            for (View view : new ArrayList(arrayList)) {
                arrayList.remove(view);
                view.clearAnimation();
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }
}
