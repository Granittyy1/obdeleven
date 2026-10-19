package p097h9;

import A0.f;
import B7.b;
import D2.F;
import D2.I;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.internal.measurement.Y;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.u;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.interfaces.SimpleTransitionListener;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.autocodeprogress.a;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p220r9.A;
import p220r9.Q;
import p255u9.D;
import p255u9.i;
import p255u9.z;
import p279w9.d;

/* JADX INFO: compiled from: ManualListFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class x extends BaseFragment implements AdapterView.OnItemClickListener, DialogCallback, SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f36248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f36249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f36250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D f36251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f36252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SwipeRefreshLayout f36253q;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 1;
        View viewInflate = layoutInflater.inflate(R.layout.manuallist_fragment, viewGroup, false);
        this.f36248l = (RecyclerView) viewInflate.findViewById(R.id.manualListFragment_list);
        this.f36249m = (TextView) viewInflate.findViewById(R.id.manualListFragment_empty);
        if (bundle != null) {
            this.f36251o = (D) bundle.getParcelable("vehicleBase");
            this.f36252p = bundle.getBoolean("demo");
        } else if (getArguments() != null) {
            this.f36251o = (D) getArguments().getParcelable("vehicleBase");
            this.f36252p = getArguments().getBoolean("demo");
        }
        A.a(this.f36248l, q().E());
        this.f36248l.setHasFixedSize(true);
        this.f36248l.setAdapter(this.f36250n);
        O(false);
        int i11 = z.f47484b;
        if (((z) ParseUser.getCurrentUser()) == null) {
            viewInflate.findViewById(R.id.manualListFragment_add).setVisibility(8);
        } else {
            viewInflate.findViewById(R.id.manualListFragment_add).setOnClickListener(new a(this, i10));
        }
        SwipeRefreshLayout swipeRefreshLayoutC = Q.c(viewInflate);
        this.f36253q = swipeRefreshLayoutC;
        Q.a(swipeRefreshLayoutC, this);
        return this.f36253q;
    }

    public final void O(final boolean z10) {
        if (!z10) {
            C2134a0.b(q(), R.string.view_manual_list_loading_manuals);
        }
        D d10 = this.f36251o;
        int i10 = i.f47473b;
        ParseQuery query = ParseQuery.getQuery(i.class);
        int i11 = z.f47484b;
        if (((z) ParseUser.getCurrentUser()) != null && ((z) ParseUser.getCurrentUser()).getInt("role") < 2) {
            query.whereEqualTo("production", Boolean.TRUE);
        }
        ParseQuery query2 = ParseQuery.getQuery(i.class);
        query2.whereEqualTo(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
        ParseQuery parseQueryOr = ParseQuery.or(Arrays.asList(query, query2));
        parseQueryOr.whereEqualTo("vehicleBase", d10);
        parseQueryOr.include("vehicleBase");
        parseQueryOr.addDescendingOrder("createdAt");
        p279w9.a aVar = new p279w9.a(b.c("MANUALS", this.f36251o.getObjectId()), 86400000L);
        if (z10) {
            Application.f29634b.a(aVar);
        }
        d.a(parseQueryOr, aVar, new d.b() { // from class: h9.v
            @Override // w9.d.b
            public final void g(List list, ParseException parseException) {
                x xVar = this.f36245b;
                if (xVar.y()) {
                    return;
                }
                if (z10) {
                    xVar.f36253q.setRefreshing(false);
                } else {
                    C2134a0.a();
                }
                if (parseException != null) {
                    if (parseException.getCode() == 120 || xVar.f36250n.f36182a.size() != 0) {
                        return;
                    }
                    Y.k(xVar, R.string.common_check_network, "TryAgainDialog");
                    return;
                }
                if (list.isEmpty()) {
                    if (!u.k(xVar.getContext())) {
                        Y.k(xVar, R.string.common_check_network, "TryAgainDialog");
                        return;
                    }
                    d dVar = xVar.f36250n;
                    dVar.f36182a.clear();
                    dVar.notifyDataSetChanged();
                    xVar.f36248l.setVisibility(8);
                    xVar.f36249m.setVisibility(0);
                    xVar.f36249m.setText(R.string.view_manual_list_manuals_not_available);
                    return;
                }
                if (xVar.f36250n.f36182a.size() != list.size()) {
                    d dVar2 = xVar.f36250n;
                    ArrayList<i> arrayList = dVar2.f36182a;
                    arrayList.clear();
                    arrayList.addAll(list);
                    final String language = Locale.getDefault().getLanguage();
                    Collections.sort(arrayList, Collections.reverseOrder(new Comparator() { // from class: h9.b
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            i iVar = (i) obj;
                            i iVar2 = (i) obj2;
                            if (iVar.a().equals(iVar2.a())) {
                                return iVar.getCreatedAt().compareTo(iVar2.getCreatedAt());
                            }
                            String strA = iVar.a();
                            String str = language;
                            if (str.equals(strA)) {
                                return 1;
                            }
                            if (str.equals(iVar2.a())) {
                                return -1;
                            }
                            return iVar.a().compareTo(iVar2.a());
                        }
                    }));
                    dVar2.notifyDataSetChanged();
                    xVar.f36248l.setVisibility(0);
                    xVar.f36249m.setVisibility(8);
                }
            }
        });
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            O(false);
        } else if (callbackType == DialogCallback.CallbackType.f31101b) {
            r().h();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ManualListFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = new d(getActivity(), f.i(this) / 6);
        this.f36250n = dVar;
        dVar.f36185d = this;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C2134a0.a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        BaseFragment<?> uVar = new u();
        Bundle bundle = new Bundle();
        bundle.putParcelable(i.class.getName(), this.f36250n.f36182a.get(i10));
        uVar.setArguments(bundle);
        F fC = new I(requireContext()).c();
        uVar.setSharedElementEnterTransition(fC);
        fC.a(new SimpleTransitionListener() { // from class: h9.w
            @Override // com.voltasit.obdeleven.interfaces.SimpleTransitionListener
            public final void f(SimpleTransitionListener.TransitionState transitionState) {
                x xVar = this.f36247b;
                xVar.getClass();
                boolean z10 = transitionState == SimpleTransitionListener.TransitionState.f31118b;
                d dVar = xVar.f36250n;
                dVar.f36186e = !z10;
                if (z10) {
                    ArrayList arrayList = dVar.f36187f;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).clearAnimation();
                    }
                    arrayList.clear();
                }
            }
        });
        view.setTag("appImageTransition");
        r().n(uVar, view);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        O(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("vehicleBase", this.f36251o);
        bundle.putBoolean("demo", this.f36252p);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_manuals);
    }
}
