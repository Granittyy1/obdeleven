package com.voltasit.obdeleven.presentation.vehicle.gauges;

import B8.E0;
import O.e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import com.bumptech.glide.d;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.OBDelevenException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.vehicle.gauges.GaugeFragment;
import com.voltasit.obdeleven.ui.dialogs.C2141e;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p134k8.T1;
import p134k8.a2;
import p194p8.j;
import p194p8.m;
import p220r9.P;
import p255u9.h;

/* JADX INFO: loaded from: classes3.dex */
public class GaugeFragment extends BaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33435A = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f33437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f33438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f33439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f33440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f33441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f33442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f33443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ControlUnit f33444t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<Integer> f33446v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Task<Void> f33449y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ValueUnit f33450z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f33436l = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public GaugeType f33445u = GaugeType.f33451b;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33447w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f33448x = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class GaugeType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final GaugeType f33451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final GaugeType f33452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final GaugeType f33453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ GaugeType[] f33454e;

        static {
            GaugeType gaugeType = new GaugeType("UNKNOWN_GAUGE", 0);
            f33451b = gaugeType;
            GaugeType gaugeType2 = new GaugeType("OBDII_GAUGE", 1);
            f33452c = gaugeType2;
            GaugeType gaugeType3 = new GaugeType("CAN_GAUGE", 2);
            f33453d = gaugeType3;
            f33454e = new GaugeType[]{gaugeType, gaugeType2, gaugeType3};
        }

        public GaugeType() {
            throw null;
        }

        public static GaugeType valueOf(String str) {
            return (GaugeType) Enum.valueOf(GaugeType.class, str);
        }

        public static GaugeType[] values() {
            return (GaugeType[]) f33454e.clone();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        N();
        if (this.f33447w) {
            this.f33447w = false;
        }
        return super.A();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_gauge, viewGroup, false);
        this.f33437m = (ImageView) viewInflate.findViewById(R.id.gaugeFragment_image);
        this.f33438n = (TextView) viewInflate.findViewById(R.id.gaugeFragment_name);
        this.f33439o = (TextView) viewInflate.findViewById(R.id.gaugeFragment_value);
        this.f33440p = (TextView) viewInflate.findViewById(R.id.gaugeFragment_description);
        if (bundle != null) {
            this.f33442r = bundle.getString("gauge");
        }
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        this.f33450z = com.voltasit.obdeleven.a.C0320a.a(activity).i();
        int iD = com.voltasit.obdeleven.a.C0320a.a(getContext()).d("gauge_size", 0);
        if (iD == 1) {
            this.f33439o.setTextSize(0, getResources().getDimension(R.dimen.text_xlarge));
        } else if (iD != 2) {
            this.f33439o.setTextSize(0, getResources().getDimension(R.dimen.text_large));
        } else {
            this.f33439o.setTextSize(0, getResources().getDimension(R.dimen.text_xxlarge));
        }
        if (this.f33443s == null) {
            ParseQuery.getQuery(h.class).getInBackground(this.f33442r, new GetCallback() { // from class: g9.d
                @Override // com.parse.ParseCallback2
                public final void done(Object obj, Throwable th) {
                    ParseException parseException = (ParseException) th;
                    h hVar = (h) ((ParseObject) obj);
                    GaugeFragment gaugeFragment = this.f35653a;
                    if (gaugeFragment.isVisible()) {
                        if (parseException == null) {
                            gaugeFragment.Q(hVar, gaugeFragment.f33441q);
                            gaugeFragment.O();
                        } else {
                            P.b(gaugeFragment.getActivity(), R.string.common_something_went_wrong);
                            gaugeFragment.q().getSupportFragmentManager().R();
                        }
                    }
                }
            });
        } else {
            O();
        }
        if (q().E()) {
            this.f33437m.setMaxHeight(q().f33570z);
        }
        return viewInflate;
    }

    public final void O() {
        this.f33438n.setText(this.f33443s.getString("name") != null ? this.f33443s.getString("name") : "");
        if (this.f33443s.getString("description") != null) {
            this.f33440p.setText(this.f33443s.getString("description"));
        }
        ParseFile parseFile = this.f33443s.getParseFile("picture");
        d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(parseFile != null ? parseFile.getUrl() : "");
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.gauge_default)).f(R.drawable.gauge_default).j(R.drawable.gauge_default);
        i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(this.f33437m);
        P();
    }

    public final void P() {
        if (this.f33441q || !W7.c.e()) {
            this.f33447w = false;
            N();
            this.f33439o.setText(getString(R.string.common_status_not_connected));
        } else {
            if (this.f33445u != GaugeType.f33451b) {
                this.f33449y = this.f33449y.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.vehicle.gauges.a
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task) throws OBDelevenException {
                        GaugeFragment gaugeFragment = this.f33455a;
                        gaugeFragment.getClass();
                        int i10 = W7.c.f7063a;
                        e.j("OBDeleven", "getVehicle()");
                        a2 a2Var = W7.c.f7067e;
                        if (a2Var != null) {
                            return gaugeFragment.f33445u == GaugeFragment.GaugeType.f33452c ? Task.forResult(a2Var.g()) : a2Var.b(Integer.valueOf(gaugeFragment.f33443s.getString("control_unit"), 16).shortValue());
                        }
                        e.j("OBDeleven", "getVehicle().Exception");
                        throw new OBDelevenException(1);
                    }
                }).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.vehicle.gauges.b
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task) {
                        GaugeFragment gaugeFragment = this.f33456a;
                        gaugeFragment.getClass();
                        gaugeFragment.f33444t = (ControlUnit) task.getResult();
                        SparseArray sparseArray = new SparseArray();
                        ControlUnit controlUnit = gaugeFragment.f33444t;
                        if (controlUnit != null) {
                            if (gaugeFragment.f33445u == GaugeFragment.GaugeType.f33452c) {
                                sparseArray.put(0, new m((OBDIICu) controlUnit, gaugeFragment.f33446v.get(0).intValue()));
                            } else {
                                for (Integer num : gaugeFragment.f33446v) {
                                    sparseArray.put(num.intValue(), gaugeFragment.f33444t.R(num.intValue()));
                                }
                            }
                        }
                        return sparseArray;
                    }
                }).continueWithTask(new com.voltasit.obdeleven.presentation.oca.b(3, this)).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.vehicle.gauges.c
                    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, xa.g] */
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task) throws JSONException {
                        GaugeFragment gaugeFragment = this.f33457a;
                        gaugeFragment.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        if (task.isFaulted()) {
                            gaugeFragment.f33447w = false;
                            sb2 = new StringBuilder(gaugeFragment.getString(R.string.common_not_available));
                        } else {
                            SparseArray sparseArray = (SparseArray) task.getResult();
                            GaugeFragment.GaugeType gaugeType = gaugeFragment.f33445u;
                            GaugeFragment.GaugeType gaugeType2 = GaugeFragment.GaugeType.f33452c;
                            if (gaugeType == gaugeType2) {
                                ArrayList arrayListA = ((j) sparseArray.get(0)).a(gaugeFragment.f33450z);
                                if (arrayListA.size() != 0) {
                                    for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                                        if (sb2.length() > 0) {
                                            sb2.append('\n');
                                        }
                                        sb2.append(((T1) arrayListA.get(i10)).toString());
                                    }
                                } else {
                                    gaugeFragment.f33447w = false;
                                    sb2 = new StringBuilder(gaugeFragment.getString(R.string.common_not_available));
                                }
                            } else {
                                for (int i11 = 0; i11 < gaugeFragment.f33443s.getJSONArray("values").length(); i11++) {
                                    JSONObject jSONObject = gaugeFragment.f33443s.getJSONArray("values").getJSONObject(i11);
                                    int i12 = jSONObject.getInt("channel");
                                    int i13 = jSONObject.getInt("value");
                                    String string = jSONObject.getString("name");
                                    ArrayList arrayListA2 = ((j) sparseArray.get(i12)).a(gaugeFragment.f33450z);
                                    if (arrayListA2.size() != 0) {
                                        if (sb2.length() > 0) {
                                            sb2.append('\n');
                                        }
                                        sb2.append(string);
                                        sb2.append(" ");
                                        sb2.append(((T1) arrayListA2.get(i13 - 1)).toString());
                                    } else {
                                        gaugeFragment.f33447w = false;
                                        sb2 = new StringBuilder(gaugeFragment.getString(R.string.common_not_available));
                                    }
                                }
                            }
                            if (!gaugeFragment.f33448x) {
                                gaugeFragment.f33448x = true;
                                a2 a2Var = W7.c.f7067e;
                                if (a2Var != null) {
                                    ((J8.a) gaugeFragment.f33436l.getValue()).q(gaugeFragment.f33443s.getString("control_unit"), a2Var.j(), gaugeFragment.f33445u == gaugeType2);
                                }
                            }
                        }
                        if (gaugeFragment.f33447w) {
                            gaugeFragment.P();
                        }
                        gaugeFragment.f33439o.setText(sb2.toString());
                        return null;
                    }
                }, Task.UI_THREAD_EXECUTOR);
                return;
            }
            this.f33447w = false;
            N();
            this.f33439o.setText(getString(R.string.common_not_available));
        }
    }

    public final void Q(h hVar, boolean z10) {
        try {
            this.f33441q = z10;
            this.f33443s = hVar;
            this.f33442r = hVar.getObjectId();
            boolean zEqualsIgnoreCase = hVar.getString("platform").equalsIgnoreCase("OBDII");
            GaugeType gaugeType = GaugeType.f33452c;
            this.f33445u = zEqualsIgnoreCase ? gaugeType : GaugeType.f33453d;
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f33446v = arrayList;
            if (this.f33445u == gaugeType) {
                arrayList.add(Integer.valueOf(Integer.parseInt(this.f33443s.getString("control_unit"), 16)));
                return;
            }
            for (int i10 = 0; i10 < this.f33443s.getJSONArray("values").length(); i10++) {
                int i11 = this.f33443s.getJSONArray("values").getJSONObject(i10).getInt("channel");
                if (!this.f33446v.contains(Integer.valueOf(i11))) {
                    this.f33446v.add(Integer.valueOf(i11));
                }
            }
        } catch (JSONException e10) {
            this.f33445u = GaugeType.f33451b;
            e10.printStackTrace();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "GaugeFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(null);
        this.f33449y = taskCompletionSource.getTask();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.gauge_size, menu);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ControlUnit controlUnit = this.f33444t;
        if (controlUnit != null) {
            controlUnit.f29320b.saveInBackgroundWithLogging();
        }
        this.f33449y = this.f33449y.continueWithTask(new C2141e(3, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.gauge_size) {
            return super.onOptionsItemSelected(menuItem);
        }
        Context context = getContext();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        com.voltasit.obdeleven.a aVarA = com.voltasit.obdeleven.a.C0320a.a(context);
        int iD = aVarA.d("gauge_size", 0) + 1;
        if (iD > 2) {
            iD = 0;
        }
        aVarA.k(iD, "gauge_size");
        if (iD == 1) {
            this.f33439o.setTextSize(0, getResources().getDimension(R.dimen.text_xlarge));
        } else if (iD != 2) {
            this.f33439o.setTextSize(0, getResources().getDimension(R.dimen.text_large));
        } else {
            this.f33439o.setTextSize(0, getResources().getDimension(R.dimen.text_xxlarge));
        }
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("gauge", this.f33442r);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_gauges);
    }
}
