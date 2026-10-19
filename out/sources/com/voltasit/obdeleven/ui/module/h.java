package com.voltasit.obdeleven.ui.module;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.Constants;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.google.android.gms.internal.measurement.Y;
import com.google.firebase.messaging.r;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.u;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import p110i9.v;
import p220r9.C2781m;
import p255u9.C;
import p255u9.z;

/* JADX INFO: compiled from: StatisticsFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends BaseFragment implements DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C f34113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f34114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f34115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ProgressBar f34118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PieChart f34119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f34120s;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.statistics_fragment, viewGroup, false);
        this.f34114m = (RecyclerView) viewInflate.findViewById(R.id.statisticsFragment_list);
        this.f34118q = (ProgressBar) viewInflate.findViewById(R.id.statisticsFragment_progressbar);
        Context context = getContext();
        C c10 = this.f34113l;
        v vVar = new v(context);
        vVar.k(c10);
        this.f34120s = vVar;
        getContext();
        this.f34114m.setLayoutManager(new LinearLayoutManager(1));
        this.f34114m.setHasFixedSize(true);
        this.f34114m.setAdapter(this.f34120s);
        View viewX = x(null, R.layout.statistics_fragment_header);
        FrameLayout frameLayout = (FrameLayout) viewX.findViewById(R.id.statisticsFragment_background);
        this.f34115n = (TextView) viewX.findViewById(R.id.statisticsFragment_diagnostics);
        this.f34116o = (TextView) viewX.findViewById(R.id.statisticsFragment_programming);
        this.f34117p = (TextView) viewX.findViewById(R.id.statisticsFragment_development);
        this.f34119r = (PieChart) viewX.findViewById(R.id.chart);
        if (q().E()) {
            PieChart uiItem = this.f34119r;
            com.facebook.login.e eVar = new com.facebook.login.e(1, this);
            kotlin.jvm.internal.i.e(uiItem, "uiItem");
            uiItem.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, uiItem, eVar));
            frameLayout.getLayoutParams().height = A0.f.i(this) / 3;
        }
        this.f34120s.i(viewX);
        O();
        return viewInflate;
    }

    public final void O() {
        if (!u.k(getContext())) {
            Y.k(this, R.string.common_check_network, "TryAgainDialog");
            return;
        }
        P(this.f34115n, this.f34116o, this.f34117p);
        C c10 = this.f34113l;
        if (c10 != null) {
            Q(c10);
            return;
        }
        this.f34118q.setVisibility(0);
        int i10 = C.f47457b;
        ParseQuery query = ParseQuery.getQuery(C.class);
        int i11 = z.f47484b;
        query.whereEqualTo(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
        p279w9.d.a(query, null, new r(this));
    }

    public final void P(TextView textView, TextView textView2, TextView textView3) {
        C c10 = this.f34113l;
        if (c10 == null) {
            textView.setText("--");
            textView2.setText("--");
            textView3.setText("--");
            return;
        }
        float fB = (float) ((100.0d / ((double) c10.b())) * ((double) c10.a()));
        C c11 = this.f34113l;
        float fB2 = (float) ((100.0d / ((double) c11.b())) * ((double) (c11.getInt("adaptationsChanged") + c11.getInt("codingChanged") + c11.getInt("appsUsed"))));
        C c12 = this.f34113l;
        float fB3 = (float) ((100.0d / ((double) c12.b())) * ((double) (c12.getInt("labelsCreated") + c12.getInt("manualsCreated") + c12.getInt("securityCodesFound"))));
        if (Math.round(fB3) + Math.round(fB2) + Math.round(fB) != 100) {
            float[] fArr = {fB, fB2, fB3};
            float f10 = fArr[0];
            for (int i10 = 0; i10 < 3; i10++) {
                float f11 = fArr[i10];
                if (f11 > f10) {
                    f10 = f11;
                }
            }
            if (fB == f10) {
                fB = (float) Math.ceil(fB);
            } else if (fB2 == f10) {
                fB2 = (float) Math.ceil(fB2);
            } else if (fB3 == f10) {
                fB3 = (float) Math.ceil(fB3);
            }
        }
        C2781m.a(textView, Math.round(fB));
        C2781m.a(textView2, Math.round(fB2));
        C2781m.a(textView3, Math.round(fB3));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x016e  */
    public final void Q(C c10) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (c10 == null || c10.b() == 0) {
            str = "labelsCreated";
            str2 = "manualsCreated";
            arrayList.add(new PieEntry(1.0f, (Object) 0));
            arrayList.add(new PieEntry(1.0f, (Object) 1));
            arrayList.add(new PieEntry(1.0f, (Object) 2));
        } else {
            arrayList.add(new PieEntry((float) ((100.0d / ((double) c10.b())) * ((double) c10.a())), (Object) 0));
            arrayList.add(new PieEntry((float) ((100.0d / ((double) c10.b())) * ((double) (c10.getInt("adaptationsChanged") + c10.getInt("codingChanged") + c10.getInt("appsUsed")))), (Object) 1));
            str2 = "manualsCreated";
            str = "labelsCreated";
            arrayList.add(new PieEntry((float) ((100.0d / ((double) c10.b())) * ((double) (c10.getInt("labelsCreated") + c10.getInt(str2) + c10.getInt("securityCodesFound")))), (Object) 2));
            this.f34119r.animateXY(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        }
        arrayList2.add("");
        arrayList2.add("");
        arrayList2.add("");
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        PieData pieData = new PieData(pieDataSet);
        pieDataSet.setColors(new int[]{R.color.button_blue, R.color.yellow_700, R.color.green_l}, getContext());
        if (c10 == null) {
            pieDataSet.setSliceSpace(3.0f);
        } else {
            Boolean[] boolArr = {Boolean.valueOf(((float) ((100.0d / ((double) c10.b())) * ((double) c10.a()))) != 0.0f), Boolean.valueOf(((float) ((100.0d / ((double) c10.b())) * ((double) ((c10.getInt("adaptationsChanged") + c10.getInt("codingChanged")) + c10.getInt("appsUsed"))))) != 0.0f), Boolean.valueOf(((float) (((double) (c10.getInt(str) + (c10.getInt(str2) + c10.getInt("securityCodesFound")))) * (100.0d / ((double) c10.b())))) != 0.0f)};
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                if (boolArr[i11].booleanValue()) {
                    i10++;
                }
            }
            if (i10 == 1) {
                pieDataSet.setSliceSpace(0.0f);
            } else {
                pieDataSet.setSliceSpace(3.0f);
            }
        }
        pieDataSet.setDrawValues(false);
        pieDataSet.setHighlightEnabled(false);
        this.f34119r.getLegend().setEnabled(false);
        this.f34119r.setDescription(new Description());
        this.f34119r.setDrawEntryLabels(false);
        this.f34119r.setDrawHoleEnabled(false);
        this.f34119r.setData(pieData);
        this.f34119r.setTouchEnabled(false);
        this.f34119r.invalidate();
        this.f34119r.setVisibility(0);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            this.f34113l = null;
            O();
        } else if (callbackType == DialogCallback.CallbackType.f31101b) {
            r().h();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "StatisticsFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.view_statistics_title);
    }
}
