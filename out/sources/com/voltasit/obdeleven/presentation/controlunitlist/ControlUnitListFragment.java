package com.voltasit.obdeleven.presentation.controlunitlist;

import B8.AbstractC0613a0;
import B8.AbstractC0630h0;
import D2.F;
import D2.I;
import Ia.p;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.interfaces.SimpleTransitionListener;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.presentation.main.MainFragment;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import kotlin.jvm.internal.i;
import p220r9.A;
import p220r9.N;
import p293xa.r;

/* JADX INFO: compiled from: ControlUnitListFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ControlUnitListFragment extends BaseProFragment<AbstractC0613a0> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N f32017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f32018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0613a0 f32019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f32020q;

    public ControlUnitListFragment() {
        N n10 = new N();
        n10.f46426a = true;
        this.f32017n = n10;
        this.f32020q = R.layout.fragment_control_unit_list;
    }

    public final AbstractC0613a0 U() {
        AbstractC0613a0 abstractC0613a0 = this.f32019p;
        if (abstractC0613a0 != null) {
            return abstractC0613a0;
        }
        i.m("binding");
        throw null;
    }

    public abstract h V();

    public final void W(View view, ControlUnitFragment controlUnitFragment) {
        i.e(view, "view");
        F fC = new I(requireContext()).c();
        controlUnitFragment.setSharedElementEnterTransition(fC);
        fC.a(new SimpleTransitionListener() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.e
            @Override // com.voltasit.obdeleven.interfaces.SimpleTransitionListener
            public final void f(SimpleTransitionListener.TransitionState transitionState) {
                ControlUnitListFragment controlUnitListFragment = this.f32038b;
                SimpleTransitionListener.TransitionState transitionState2 = SimpleTransitionListener.TransitionState.f31118b;
                N n10 = controlUnitListFragment.f32017n;
                if (transitionState == transitionState2) {
                    n10.f46426a = false;
                } else if (transitionState == SimpleTransitionListener.TransitionState.f31119c) {
                    n10.f46426a = true;
                }
            }
        });
        view.setTag("controlUnitImageTransition");
        r().n(controlUnitFragment, view);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: X */
    public void C(AbstractC0613a0 abstractC0613a0) {
        MainFragment mainFragment;
        this.f32019p = abstractC0613a0;
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        int i10 = A0.f.i(this);
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        this.f32018o = new a(contextRequireContext, i10 / 6, new p<View, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment$onCreateView$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(View view, Integer num) {
                int iIntValue = num.intValue();
                i.e(view, "<anonymous parameter 0>");
                this.this$0.V().b(iIntValue);
                return r.f47939a;
            }
        });
        if (q().E() && (mainFragment = (MainFragment) Application.f29634b.e(p279w9.a.f47810g)) != null && mainFragment.isVisible()) {
            AbstractC0630h0 abstractC0630h0 = mainFragment.f32518m;
            if (abstractC0630h0 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0630h0.f1936B.h();
        }
        RecyclerView recyclerView = abstractC0613a0.f1855s;
        A.a(recyclerView, false);
        recyclerView.setHasFixedSize(true);
        a aVar = this.f32018o;
        if (aVar == null) {
            i.m("adapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        abstractC0613a0.f1854r.h();
        abstractC0613a0.f1856t.setEnabled(true);
        recyclerView.f19643s.add(this.f32017n);
        z(V());
        V().f32042r.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.d(this, 2));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitListFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        MainFragment mainFragment;
        super.onDestroyView();
        if (q().E() && (mainFragment = (MainFragment) Application.f29634b.e(p279w9.a.f47810g)) != null && mainFragment.isVisible()) {
            AbstractC0630h0 abstractC0630h0 = mainFragment.f32518m;
            if (abstractC0630h0 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0630h0.f1936B.n();
        }
        SwipeRefreshLayout swipeRefreshLayout = U().f1856t;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.destroyDrawingCache();
            swipeRefreshLayout.clearAnimation();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        i.e(item, "item");
        switch (item.getItemId()) {
            case R.id.controlUnit_byName /* 2131362324 */:
                V().c(1);
                return true;
            case R.id.controlUnit_byNumber /* 2131362325 */:
                V().c(0);
                return true;
            case R.id.controlUnit_byStatus /* 2131362326 */:
                V().c(2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (q().E()) {
            p279w9.b bVar = Application.f29634b;
            p279w9.b bVar2 = Application.f29634b;
            synchronized (bVar2) {
                bVar2.f47824a.remove("CONTROL_UNIT_LIST_FRAGMENT");
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (q().E()) {
            p279w9.b bVar = Application.f29634b;
            synchronized (bVar) {
                bVar.f47824a.put("CONTROL_UNIT_LIST_FRAGMENT", new w9.b.a(this, 31536000000L));
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        w();
        super.onStop();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32020q;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31110b;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31106b;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_control_units);
        i.d(string, "getString(...)");
        return string;
    }
}
