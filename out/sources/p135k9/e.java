package p135k9;

import B8.k1;
import W7.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C1787c0;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.p0;
import com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.d;
import com.voltasit.obdeleven.presentation.controlUnit.v;
import com.voltasit.obdeleven.presentation.profile.h;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p009a8.f;
import p134k8.T1;
import p220r9.C2783o;
import p279w9.b;

/* JADX INFO: compiled from: UDSDataListAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f42896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnit f42897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f42898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42899d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.obdeleven.service.odx.e.g f42903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Task<Void> f42904i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42906l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f42900e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f42901f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f42902g = new HashMap();
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42905k = true;

    /* JADX INFO: compiled from: UDSDataListAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k1 f42907b;

        public a(k1 k1Var) {
            super(k1Var.f4488d);
            this.f42907b = k1Var;
        }

        public final void a(UDSResult uDSResult) {
            ArrayList arrayList;
            boolean z10;
            View childAt;
            int i10 = 1;
            int i11 = R.string.common_not_available;
            int i12 = R.id.paramValue;
            int i13 = R.id.paramName;
            int i14 = R.layout.item_backup_value;
            e eVar = e.this;
            k1 k1Var = this.f42907b;
            if (uDSResult == null) {
                k1Var.f1993s.setVisibility(8);
                LinearLayout linearLayout = k1Var.f1992r;
                linearLayout.setVisibility(0);
                linearLayout.removeAllViewsInLayout();
                View viewInflate = eVar.f42898c.inflate(R.layout.item_backup_value, (ViewGroup) linearLayout, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.paramName);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.paramValue);
                textView.setVisibility(8);
                if (c.e()) {
                    textView2.setText(R.string.common_not_available);
                } else {
                    textView2.setText(R.string.common_not_available_offline);
                }
                linearLayout.addView(viewInflate);
                return;
            }
            k1Var.f1993s.setVisibility(8);
            LinearLayout linearLayout2 = k1Var.f1992r;
            linearLayout2.setVisibility(0);
            int childCount = linearLayout2.getChildCount();
            UDSResult.Type type = UDSResult.Type.f29416b;
            Param param = uDSResult.f29414c;
            if (uDSResult.f29412a == type) {
                arrayList = param.c(true);
            } else {
                arrayList = new ArrayList();
                arrayList.add(param);
            }
            if (childCount != arrayList.size()) {
                linearLayout2.removeAllViews();
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = 0;
            while (i15 < arrayList.size()) {
                if (z10) {
                    childAt = eVar.f42898c.inflate(i14, (ViewGroup) linearLayout2, false);
                    linearLayout2.addView(childAt);
                } else {
                    childAt = linearLayout2.getChildAt(i15);
                }
                TextView textView3 = (TextView) childAt.findViewById(i13);
                TextView textView4 = (TextView) childAt.findViewById(i12);
                TextView textView5 = (TextView) childAt.findViewById(R.id.paramUnit);
                Param param2 = (Param) arrayList.get(i15);
                String strD = param2.d();
                if (strD == null || strD.isEmpty()) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(strD);
                }
                if (param2.f29453a == Param.Type.f29473h) {
                    textView4.setText(i11);
                } else {
                    MainActivity mainActivity = eVar.f42896a;
                    List<String> list = com.voltasit.obdeleven.a.f29638c;
                    int i16 = com.voltasit.obdeleven.a.C0320a.a(mainActivity).i() == ValueUnit.f29311c ? i10 : 0;
                    String strF = param2.f();
                    if (i16 != 0) {
                        strF = C1787c0.k(new T1(null, strF, param2.e())).f42679b;
                    }
                    String strE = param2.e();
                    if (i16 != 0) {
                        strE = C1787c0.k(new T1(null, param2.f(), strE)).f42680c;
                    }
                    textView4.setText(strF);
                    if (strE == null || strE.isEmpty()) {
                        textView5.setVisibility(8);
                    } else {
                        textView5.setVisibility(0);
                        textView5.setText(strE);
                    }
                    i10 = 1;
                }
                i15 += i10;
                i11 = R.string.common_not_available;
                i12 = R.id.paramValue;
                i13 = R.id.paramName;
                i14 = R.layout.item_backup_value;
            }
        }
    }

    public e(MainActivity mainActivity, ControlUnit controlUnit, boolean z10) {
        this.f42896a = mainActivity;
        this.f42897b = controlUnit;
        this.f42899d = z10;
        this.f42898c = LayoutInflater.from(mainActivity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f42904i = taskCompletionSource.getTask();
        taskCompletionSource.setResult(null);
    }

    public final void a() {
        this.j = false;
        this.f42896a.U();
        ControlUnit controlUnit = this.f42897b;
        if (controlUnit != null) {
            controlUnit.f29320b.saveInBackgroundWithLogging();
            this.f42904i = this.f42904i.continueWithTask(new d(2, this));
        }
        this.f42900e.clear();
        this.f42901f.clear();
        this.f42902g.clear();
        notifyDataSetChanged();
    }

    public final void b() {
        int i10 = 6;
        ArrayList arrayList = new ArrayList(this.f42901f);
        if (!c.e()) {
            this.f42904i = this.f42904i.continueWith(new v(this, arrayList, 3), Task.BACKGROUND_EXECUTOR).continueWith(new b());
            return;
        }
        Object[] objArr = {Integer.valueOf(arrayList.size())};
        b bVar = Application.f29634b;
        P8.c.a(3, "UDSDataListAdapter", "requests(%d)", Arrays.copyOf(objArr, 1));
        this.f42904i = this.f42904i.continueWithTask(new p009a8.d(6, this)).continueWithTask(new p0(this, 4, arrayList), Task.UI_THREAD_EXECUTOR).continueWith(new f(i10, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f42900e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        COMPUSCALE compuscale = (COMPUSCALE) this.f42900e.get(i10);
        e eVar = e.this;
        int size = eVar.f42900e.size();
        k1 k1Var = aVar.f42907b;
        if (size > 1) {
            k1Var.f1994t.setVisibility(0);
        } else {
            k1Var.f1994t.setVisibility(8);
        }
        k1Var.f1995u.setText(C2783o.a(compuscale, false));
        k1Var.f1994t.setOnClickListener(new h(3, aVar));
        boolean zE = c.e();
        HashMap map = eVar.f42902g;
        if (!zE && map.containsKey(compuscale)) {
            aVar.a((UDSResult) map.get(compuscale));
            return;
        }
        boolean z10 = eVar.f42905k;
        LinearLayout linearLayout = k1Var.f1992r;
        ProgressBar progressBar = k1Var.f1993s;
        if (z10) {
            if (map.containsKey(compuscale)) {
                aVar.a((UDSResult) map.get(compuscale));
                return;
            } else {
                linearLayout.setVisibility(8);
                progressBar.setVisibility(0);
                return;
            }
        }
        progressBar.setVisibility(8);
        linearLayout.setVisibility(0);
        linearLayout.removeAllViewsInLayout();
        View viewInflate = eVar.f42898c.inflate(R.layout.item_backup_value, (ViewGroup) linearLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.paramName);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.paramValue);
        textView.setVisibility(8);
        if (eVar.f42906l) {
            textView2.setText(R.string.common_not_available_offline);
        } else {
            textView2.setText(R.string.common_check_ignition);
        }
        linearLayout.addView(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((k1) M0.e.a(this.f42898c, R.layout.item_uds, viewGroup, false, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        int adapterPosition = ((a) b10).getAdapterPosition();
        Object[] objArr = {Integer.valueOf(adapterPosition)};
        b bVar = Application.f29634b;
        P8.c.a(3, "UDSDataListAdapter", "onViewAttachedToWindow(%d)", Arrays.copyOf(objArr, 1));
        if (adapterPosition != -1) {
            COMPUSCALE compuscale = (COMPUSCALE) this.f42900e.get(adapterPosition);
            ArrayList arrayList = this.f42901f;
            if (arrayList.contains(compuscale)) {
                return;
            }
            arrayList.add(compuscale);
            if (this.f42899d) {
                return;
            }
            b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        int adapterPosition = ((a) b10).getAdapterPosition();
        Object[] objArr = {Integer.valueOf(adapterPosition)};
        b bVar = Application.f29634b;
        P8.c.a(3, "UDSDataListAdapter", "onViewDetachedFromWindow(%d)", Arrays.copyOf(objArr, 1));
        if (adapterPosition != -1) {
            this.f42901f.remove((COMPUSCALE) this.f42900e.get(adapterPosition));
        }
    }
}
