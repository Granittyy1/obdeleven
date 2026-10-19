package p073f9;

import B8.E0;
import O.e;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.Y;
import com.obdeleven.service.model.ControlUnit;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.b;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import f9.c.a;
import f9.c.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import p220r9.A;
import p220r9.J;
import p220r9.P;
import p255u9.C2800c;
import p255u9.E;

/* JADX INFO: compiled from: ChartListFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends BaseFragment implements AdapterView.OnItemClickListener, DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f35040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f35041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f35045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E f35047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ControlUnit f35048t;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vehicle_history, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.vehicleHistoryFragment_imageFrame);
        this.f35040l = (ImageView) viewInflate.findViewById(R.id.vehicleHistoryFragment_image);
        this.f35041m = (TextView) viewInflate.findViewById(R.id.vehicleHistoryFragment_name);
        this.f35042n = (TextView) viewInflate.findViewById(R.id.vehicleHistoryFragment_year);
        this.f35043o = (RecyclerView) viewInflate.findViewById(R.id.vehicleHistoryFragment_list);
        this.f35044p = (TextView) viewInflate.findViewById(R.id.vehicleHistoryFragment_empty);
        if (bundle != null) {
            this.f35046r = bundle.getString("vehicle");
        }
        A.a(this.f35043o, false);
        this.f35043o.setAdapter(this.f35045q);
        this.f35044p.setOnClickListener(new b(2, this));
        if (this.f35047s == null) {
            E.h().getInBackground(this.f35046r, new GetCallback() { // from class: f9.f
                @Override // com.parse.ParseCallback2
                public final void done(Object obj, Throwable th) {
                    ParseException parseException = (ParseException) th;
                    E e10 = (E) ((ParseObject) obj);
                    g gVar = this.f35039a;
                    if (parseException == null) {
                        gVar.f35047s = e10;
                        gVar.O();
                    } else {
                        P.b(gVar.getActivity(), R.string.common_something_went_wrong);
                        gVar.r().o(false);
                    }
                }
            });
        } else {
            O();
        }
        if (q().E()) {
            frameLayout.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f35043o.getLayoutParams()).topMargin = 0;
            RecyclerView recyclerView = this.f35043o;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, this.f35043o.getPaddingRight(), this.f35043o.getPaddingBottom());
        }
        return viewInflate;
    }

    public final void O() {
        String strF = this.f35047s.f();
        if (strF.isEmpty()) {
            strF = "http://";
        }
        d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(strF);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
        i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(this.f35040l);
        String strE = this.f35047s.e();
        if (strE.isEmpty()) {
            strE = this.f35047s.d();
        }
        if (strE.isEmpty()) {
            strE = this.f35047s.k();
        }
        if (strE.isEmpty()) {
            strE = getString(R.string.common_unknown);
        }
        this.f35041m.setText(strE);
        this.f35042n.setText(this.f35047s.getString("year"));
        P();
    }

    public final void P() {
        ParseQuery query;
        H(R.string.view_chart_list_loading_charts);
        ControlUnit controlUnit = this.f35048t;
        if (controlUnit != null) {
            E e10 = this.f35047s;
            int i10 = C2800c.f47462b;
            query = ParseQuery.getQuery(C2800c.class);
            query.whereEqualTo("vehicle", e10);
            query.whereEqualTo("controlUnit", controlUnit.f29320b);
            query.include("controlUnit").include("controlUnit.controlUnitBase").include("controlUnit.controlUnitBase.texttable");
            query.addDescendingOrder("createdAt");
        } else {
            E e11 = this.f35047s;
            int i11 = C2800c.f47462b;
            query = ParseQuery.getQuery(C2800c.class);
            query.whereEqualTo("vehicle", e11);
            query.include("controlUnit").include("controlUnit.controlUnitBase").include("controlUnit.controlUnitBase.texttable");
            query.addDescendingOrder("createdAt");
        }
        try {
            ArrayList arrayListE = p279w9.d.e(query);
            if (y()) {
                return;
            }
            w();
            if (arrayListE.isEmpty()) {
                String string = getString(R.string.view_chart_list_no_charts);
                w();
                this.f35044p.setText(string);
                this.f35044p.setClickable(false);
                this.f35043o.setVisibility(8);
                this.f35044p.setVisibility(0);
                return;
            }
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                ((C2800c) it.next()).put("vehicle", this.f35047s);
            }
            c cVar = this.f35045q;
            cVar.f35028c.clear();
            cVar.notifyDataSetChanged();
            c cVar2 = this.f35045q;
            cVar2.f35028c.addAll(arrayListE);
            cVar2.notifyDataSetChanged();
            this.f35043o.setVisibility(0);
            this.f35044p.setVisibility(8);
        } catch (ParseException e12) {
            e.m(e12);
            w();
            if (e12.getCode() == 100) {
                Y.k(this, R.string.common_check_network, "TryAgainDialog");
                return;
            }
            String strG = J.g(getContext(), e12);
            w();
            this.f35044p.setText(strG);
            this.f35044p.setClickable(true);
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            P();
        } else if (callbackType == DialogCallback.CallbackType.f31101b) {
            r().h();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ChartListFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC1347l activity = getActivity();
        c cVar = new c();
        cVar.f35028c = new ArrayList();
        cVar.f35030e = cVar.new a();
        cVar.f35031f = cVar.new b();
        cVar.f35026a = activity;
        cVar.f35027b = LayoutInflater.from(activity);
        this.f35045q = cVar;
        cVar.f35029d = this;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        e eVar = new e();
        C2800c c2800c = (C2800c) this.f35045q.f35028c.get(i10);
        eVar.f35016w = null;
        eVar.f35017x = c2800c;
        r().n(eVar, null);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("vehicle", this.f35046r);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_charts);
    }
}
