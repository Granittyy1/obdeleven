package p073f9;

import I4.e;
import I4.f;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.LineDataSet;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2167r0;
import com.voltasit.obdeleven.ui.view.LineDataChart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import p109i8.i;
import p109i8.j;
import p110i9.c;
import p220r9.M;
import p255u9.C2800c;

/* JADX INFO: compiled from: OBDIIChartFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class k extends b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public j f35053E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2167r0 f35054F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f35055G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public j f35056H;

    /* JADX INFO: compiled from: OBDIIChartFragment.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f35057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LineDataChart.b f35059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f35060d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f35061e = "";

        public a(j jVar, int i10, LineDataChart.b bVar) {
            this.f35057a = jVar;
            this.f35058b = i10;
            this.f35059c = bVar;
        }
    }

    @Override // p073f9.b
    public final void O() {
        H(R.string.common_loading);
        ((i) this.f35016w).m(new com.google.gson.internal.a(this));
    }

    @Override // p073f9.b
    public final void P() {
        this.f35014u = false;
        ((i) this.f35016w).m(null);
        N();
    }

    @Override // p073f9.b
    public final c Q() {
        return this.f35053E;
    }

    @Override // p073f9.b
    public final void R() {
        if (this.f35014u) {
            return;
        }
        J();
        T();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // p073f9.b
    public final ArrayList S(C2800c.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (T t8 : this.f35053E.f36779a) {
            String label = t8.f35059c.f34189a.getLabel();
            String str = t8.f35061e;
            LineDataChart.b bVar = t8.f35059c;
            int color = bVar.f34189a.getColor();
            ArrayList arrayList2 = new ArrayList();
            LineDataSet lineDataSet = bVar.f34189a;
            for (int i10 = 0; i10 < lineDataSet.getEntryCount(); i10++) {
                arrayList2.add(Float.valueOf(lineDataSet.getEntryForIndex(i10).getY()));
            }
            aVar.d(new C2800c.b(label, str, color, arrayList2));
            arrayList.add(label);
        }
        return arrayList;
    }

    @Override // p073f9.b
    public final void T() {
        this.f35014u = true;
        M();
        if (!this.f35053E.f36779a.isEmpty()) {
            X();
        } else {
            P();
            w();
        }
    }

    @Override // p073f9.b
    public final void V() {
        RecyclerView recyclerView = this.f35007n;
        recyclerView.f19643s.add(new M(getContext(), new D7.i(this)));
    }

    @Override // p073f9.b
    public final void X() {
        ArrayList arrayList = new ArrayList();
        for (T t8 : this.f35053E.f36779a) {
            if (!arrayList.contains(t8.f35057a)) {
                arrayList.add(t8.f35057a);
            }
        }
        ((i) this.f35016w).v(arrayList, new e(this));
    }

    @Override // p073f9.b, com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (!"OBDIILiveDataChartDialog".equals(str)) {
            super.g(str, callbackType, bundle);
            return;
        }
        if (callbackType != DialogCallback.CallbackType.f31102c) {
            if (callbackType != DialogCallback.CallbackType.f31103d) {
                this.f35054F.y();
                this.f35054F = null;
                return;
            } else {
                this.f35056H = (j) this.f35055G.get(bundle.getInt("position") - 1);
                J();
                ((i) this.f35016w).r(Collections.singletonList(this.f35056H), new f(9, this));
                return;
            }
        }
        int i10 = bundle.getInt("obd_command_value_index");
        String string = bundle.getString("obd_command_value");
        if (string == null) {
            string = "";
        }
        for (T t8 : this.f35053E.f36779a) {
            if (t8.f35057a == this.f35056H && t8.f35058b == i10) {
                return;
            }
        }
        this.f35006m.setVisibility(0);
        this.f35008o.setVisibility(this.f35053E.f36779a.size() >= 8 ? 8 : 0);
        Locale locale = Locale.US;
        LineDataChart.b bVar = new LineDataChart.b(O.a.f(getString(this.f35056H.getDescription()), ": ", string), this.f35011r[this.f35005l.getDataSets().size()]);
        LineDataChart lineDataChart = this.f35005l;
        lineDataChart.f34183c.add(bVar);
        lineDataChart.a(bVar);
        this.f35053E.a(new a(this.f35056H, i10, bVar));
        J();
        T();
        this.f35054F.y();
        this.f35054F = null;
    }

    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OBDIIChartFragment";
    }

    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35053E = new j(getContext());
    }

    @Override // p073f9.b, com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f35007n.setAdapter(this.f35053E);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((i) this.f35016w).m(null);
    }
}
