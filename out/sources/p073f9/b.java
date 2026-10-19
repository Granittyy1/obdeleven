package p073f9;

import Q6.d;
import X5.n;
import Z3.o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC1347l;
import androidx.media3.exoplayer.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.basicsettings.h;
import com.voltasit.obdeleven.presentation.controlUnit.u;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.obdeleven.ui.dialogs.Y;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.ui.view.LineDataChart;
import com.voltasit.obdeleven.utils.bluetooth.l;
import io.intercom.android.sdk.models.Participant;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p110i9.c;
import p194p8.i;
import p194p8.j;
import p220r9.M;
import p220r9.P;
import p220r9.t;
import p255u9.C2800c;
import p255u9.z;

/* JADX INFO: compiled from: BaseChartFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/104/live-data")
public abstract class b extends BaseFragment implements DialogCallback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Task<List<j>> f35001A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MenuItem f35003C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public j f35004D;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LineDataChart f35005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f35006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f35007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f35008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FloatingActionButton f35009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<j> f35010q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f35014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f35015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ControlUnit f35016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2800c f35017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ValueUnit f35018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Y f35019z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f35011r = {-16537100, -16738680, -7617718, -5317, -26624, -769226, -6543440, -12627531, -14575885, -16728876, -11751600, -3285959, -16121, -1499549, -10011977, -43230};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f35012s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35013t = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f35002B = new ArrayList();

    /* JADX INFO: renamed from: f9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseChartFragment.java */
    public static class C0365b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LineDataChart.b f35021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f35022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f35024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f35025e;

        public C0365b(j jVar, int i10, LineDataChart.b bVar) {
            this.f35022b = jVar;
            this.f35023c = i10;
            this.f35021a = bVar;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if (this.f35013t != 2) {
            return super.A();
        }
        Bundle bundleA = o.a("key_tag", R.string.common_discard_changes, "discardChangesDialog", "key_title");
        bundleA.putInt("key_positive_text", R.string.common_ok);
        bundleA.putInt("key_negative_text", R.string.common_cancel);
        I0 i10 = new I0();
        i10.setArguments(bundleA);
        i10.f32261r = getFragmentManager();
        i10.setTargetFragment(this, 0);
        i10.A();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ControlUnit controlUnit;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_chart, viewGroup, false);
        this.f35005l = (LineDataChart) viewInflate.findViewById(R.id.fragmentChart_chart);
        this.f35006m = (LinearLayout) viewInflate.findViewById(R.id.fragmentChart_dataContent);
        this.f35007n = (RecyclerView) viewInflate.findViewById(R.id.fragmentChart_list);
        this.f35008o = (Button) viewInflate.findViewById(R.id.fragmentChart_add);
        this.f35009p = (FloatingActionButton) viewInflate.findViewById(R.id.fragmentChart_fab);
        this.f35005l.setOnChartValueSelectedListener(new a());
        if (bundle != null) {
            this.f35017x = (C2800c) bundle.getParcelable("chart");
        } else if (getArguments() != null && getArguments().containsKey("chart")) {
            this.f35017x = (C2800c) getArguments().getParcelable("chart");
        }
        this.f35006m.setVisibility(8);
        this.f35008o.setVisibility(8);
        if (q().E()) {
            this.f35005l.getLayoutParams().height = q().f33570z;
        }
        RecyclerView recyclerView = this.f35007n;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.f35007n.setAdapter(this.f35015v);
        V();
        this.f35008o.setOnClickListener(new n(2, this));
        this.f35009p.setOnClickListener(new u(4, this));
        this.f35007n.j(new t(this.f35009p));
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        this.f35018y = com.voltasit.obdeleven.a.C0320a.a(activity).i();
        if (this.f35017x == null && (controlUnit = this.f35016w) != null) {
            this.f35001A = (controlUnit.f29327i == ApplicationProtocol.f29264d ? new p194p8.o(controlUnit) : new i(controlUnit)).Q();
            U(0);
        }
        return viewInflate;
    }

    public abstract void O();

    public void P() {
        this.f35014u = false;
        ControlUnit controlUnit = this.f35016w;
        if (controlUnit != null) {
            controlUnit.a();
            this.f35016w.f29320b.saveInBackgroundWithLogging();
        }
        N();
    }

    public c Q() {
        return this.f35015v;
    }

    public void R() {
        if (this.f35014u) {
            return;
        }
        T();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public ArrayList S(C2800c.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (T t8 : this.f35015v.f36779a) {
            String label = t8.f35021a.f34189a.getLabel();
            String str = t8.f35025e;
            LineDataChart.b bVar = t8.f35021a;
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

    public void T() {
        this.f35014u = true;
        M();
        if (Q().f36779a.isEmpty()) {
            P();
        } else {
            X();
        }
    }

    public final synchronized void U(int i10) {
        int i11;
        int i12;
        boolean z10;
        try {
            this.f35013t = i10;
            String string = "";
            int i13 = 0;
            boolean z11 = true;
            if (i10 != 0) {
                int i14 = R.color.fab_selector_red;
                if (i10 == 1) {
                    i11 = 2131231453;
                    z11 = false;
                } else if (i10 != 2) {
                    MenuItem menuItem = this.f35003C;
                    if (menuItem != null) {
                        menuItem.setVisible(true);
                    }
                    i11 = 2131231147;
                    i12 = R.color.fab_selector_red;
                    z10 = true;
                    z11 = false;
                } else {
                    string = getString(R.string.common_reset);
                    i11 = 2131231448;
                    i14 = R.color.fab_selector_blue;
                }
                i12 = i14;
                z10 = z11;
            } else {
                if (this.f35015v.f36779a.size() >= 16) {
                    z11 = false;
                }
                string = getString(R.string.common_add_value);
                R();
                i11 = 2131231441;
                i12 = R.color.fab_selector_green;
                z10 = false;
            }
            this.f35009p.setImageDrawable(getResources().getDrawable(i11));
            this.f35009p.setBackgroundTintList(getResources().getColorStateList(i12));
            this.f35009p.h();
            this.f35009p.n();
            Button button = this.f35008o;
            if (!z11) {
                i13 = 8;
            }
            button.setVisibility(i13);
            if (z11) {
                this.f35008o.setText(string);
            }
            if (z10) {
                P();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void V() {
        RecyclerView recyclerView = this.f35007n;
        recyclerView.f19643s.add(new M(getContext(), new d(this)));
    }

    public final void W(List<j> list) {
        this.f35010q = list;
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        for (j jVar : list) {
            String name = jVar.getName();
            if (name == null || name.isEmpty()) {
                name = String.format(Locale.US, "%s %03d", getString(R.string.common_channel), Integer.valueOf(jVar.getChannel()));
            }
            arrayList.add(name);
        }
        bundle.putStringArrayList("items", arrayList);
        bundle.putString("key_title", getString(R.string.common_add_value));
        Y y10 = new Y();
        y10.setArguments(bundle);
        y10.f32261r = getFragmentManager();
        y10.setTargetFragment(this, 0);
        this.f35019z = y10;
        y10.A();
    }

    public void X() {
        Task taskForResult = Task.forResult(null);
        Iterator it = this.f35002B.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.continueWithTask(new h(this, 2, (j) it.next()));
        }
        taskForResult.continueWith(new p022b9.a(4, this)).continueWith(new p022b9.b(3, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        int i10 = 1;
        if ("OBDIILiveDataChartDialog".equals(str)) {
            if (callbackType != DialogCallback.CallbackType.f31102c) {
                if (callbackType != DialogCallback.CallbackType.f31103d) {
                    this.f35019z.y();
                    return;
                }
                j jVar = this.f35010q.get(bundle.getInt("position") - 1);
                this.f35004D = jVar;
                jVar.b(this.f35018y).continueWith(new l(i10, this), Task.UI_THREAD_EXECUTOR);
                return;
            }
            int i11 = bundle.getInt("obd_command_value_index");
            String string = bundle.getString("obd_command_value");
            if (string == null) {
                string = "";
            }
            String name = this.f35004D.getName();
            if (name == null || name.isEmpty()) {
                name = String.format(Locale.US, "%s %03d", getString(R.string.common_channel), Integer.valueOf(this.f35004D.getChannel()));
            }
            Locale locale = Locale.US;
            LineDataChart.b bVar = new LineDataChart.b(O.a.f(name, ": ", string), this.f35011r[this.f35005l.getDataSets().size()]);
            ArrayList arrayList = this.f35002B;
            if (!arrayList.contains(this.f35004D)) {
                arrayList.add(this.f35004D);
            }
            this.f35015v.a(new C0365b(this.f35004D, i11, bVar));
            this.f35006m.setVisibility(0);
            this.f35008o.setVisibility(this.f35015v.f36779a.size() >= 16 ? 8 : 0);
            LineDataChart lineDataChart = this.f35005l;
            lineDataChart.f34183c.add(bVar);
            lineDataChart.a(bVar);
            if (!this.f35014u) {
                T();
            }
            this.f35019z.y();
            this.f35015v.notifyDataSetChanged();
            return;
        }
        if (!str.equals("ChartSaveDialog")) {
            if (str.equals("deleteChartDialog")) {
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    this.f35017x.deleteEventually();
                    r().h();
                    return;
                }
                return;
            }
            if (str.equals("discardChangesDialog")) {
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    r().h();
                    return;
                }
                return;
            } else {
                if (callbackType == DialogCallback.CallbackType.f31101b) {
                    this.f35012s.set(false);
                    return;
                }
                return;
            }
        }
        if (callbackType != DialogCallback.CallbackType.f31102c) {
            this.f35015v.notifyDataSetChanged();
            return;
        }
        H(R.string.common_saving);
        String string2 = bundle.getString("key_name");
        Q().notifyDataSetChanged();
        final C2800c c2800c = new C2800c();
        c2800c.put("name", string2);
        int i12 = z.f47484b;
        c2800c.put(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
        c2800c.put("vehicle", this.f35016w.f29321c.f42726c);
        c2800c.put("controlUnit", this.f35016w.f29320b);
        C2800c.a aVar = new C2800c.a();
        Iterator<String> it = this.f35005l.getXValues().iterator();
        while (it.hasNext()) {
            aVar.c(it.next());
        }
        c2800c.put("labels", S(aVar));
        Task.callInBackground(new com.voltasit.obdeleven.presentation.dialogs.backup.c(c2800c, i10, aVar)).continueWith(new Continuation() { // from class: f9.a
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                b bVar2 = this.f34999a;
                bVar2.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    C2800c c2800c2 = c2800c;
                    bVar2.f35017x = c2800c2;
                    c2800c2.saveInBackground(new C(bVar2));
                    return null;
                }
                bVar2.w();
                MainActivity mainActivityQ = bVar2.q();
                P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_chart_save_failed));
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "BaseChartFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f35015v = new d(getContext());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        MenuItem menuItem = this.f35003C;
        boolean zIsVisible = menuItem != null ? menuItem.isVisible() : false;
        MenuItem menuItemAdd = menu.add(R.string.common_share);
        this.f35003C = menuItemAdd;
        menuItemAdd.setIcon(2131231719);
        this.f35003C.setShowAsAction(1);
        this.f35003C.setVisible(zIsVisible);
        this.f35003C.setOnMenuItemClickListener(new com.voltasit.obdeleven.presentation.history.child.a(this, 1));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Y y10 = this.f35019z;
        if (y10 != null) {
            y10.y();
        }
        MenuItem menuItem = this.f35003C;
        if (menuItem != null) {
            menuItem.setOnMenuItemClickListener(null);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (Q().f36779a.isEmpty()) {
            return;
        }
        this.f35006m.setVisibility(0);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C2800c c2800c = this.f35017x;
        if (c2800c != null) {
            bundle.putParcelable("chart", c2800c);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_live_data);
    }

    /* JADX INFO: compiled from: BaseChartFragment.java */
    public class a implements OnChartValueSelectedListener {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public final void onValueSelected(Entry entry, Highlight highlight) {
            int x10;
            b bVar = b.this;
            int i10 = bVar.f35013t;
            if ((i10 == 2 || i10 == 3) && (x10 = (int) highlight.getX()) >= 0 && x10 < bVar.f35005l.getXValues().size()) {
                for (T t8 : bVar.f35015v.f36779a) {
                    DecimalFormat decimalFormat = new DecimalFormat("#.###");
                    LineDataChart.b bVar2 = t8.f35021a;
                    if (bVar2.f34189a.getEntryCount() > x10) {
                        t8.f35024d = decimalFormat.format(bVar2.f34189a.getEntryForIndex(x10).getY());
                    }
                }
                bVar.f35015v.notifyDataSetChanged();
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public final void onNothingSelected() {
        }
    }
}
