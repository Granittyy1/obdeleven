package com.voltasit.obdeleven.presentation.history;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.afollestad.materialdialogs.internal.MDButton;
import com.obdeleven.service.model.fault.Fault;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.ParseObject;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.models.HistoryTypeLegacy;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.parse.model.CodingType;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1493f;
import p033c7.L;
import p110i9.q;
import p220r9.P;
import p255u9.C2801d;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryAdapter extends q<HistoryDB, c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p147l9.b f32394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ActivityC1347l f32395i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f32396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DateFilter f32397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f32398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VehicleHistoryFragment f32399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.history.vehicle.h f32400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.history.vehicle.i f32401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.history.vehicle.b f32402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.history.vehicle.c f32403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f32404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f32405t;

    public enum DateFilter {
        ALL(R.string.common_all),
        /* JADX INFO: Fake field, exist only in values array */
        DAY_1(R.string.view_history_1_day),
        /* JADX INFO: Fake field, exist only in values array */
        DAYS_7(R.string.view_history_7_days),
        /* JADX INFO: Fake field, exist only in values array */
        DAYS_30(R.string.view_history_30_days);

        final int stringRes;

        DateFilter(int i10) {
            this.stringRes = i10;
        }
    }

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) linearLayout.getChildAt(0);
            TextView textView2 = (TextView) linearLayout.getChildAt(1);
            HistoryAdapter historyAdapter = HistoryAdapter.this;
            ClipboardManager clipboardManager = (ClipboardManager) historyAdapter.f32395i.getSystemService("clipboard");
            ClipData clipDataNewPlainText = ClipData.newPlainText(textView.getText(), textView2.getText());
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
            }
            P.e(historyAdapter.f32395i, String.format(Locale.US, "%s %s", textView.getText(), historyAdapter.f32395i.getString(R.string.common_copied)));
            view.setPressed(false);
            return true;
        }
    }

    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            HistoryAdapter historyAdapter = HistoryAdapter.this;
            ClipboardManager clipboardManager = (ClipboardManager) historyAdapter.f32395i.getSystemService("clipboard");
            ClipData clipDataNewPlainText = ClipData.newPlainText(historyAdapter.f32395i.getString(R.string.common_value), ((TextView) view).getText());
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
            }
            ActivityC1347l activityC1347l = historyAdapter.f32395i;
            Locale locale = Locale.US;
            P.e(activityC1347l, activityC1347l.getString(R.string.common_value) + " " + historyAdapter.f32395i.getString(R.string.common_copied));
            view.setPressed(false);
            return true;
        }
    }

    public class c extends RecyclerView.B implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinearLayout f32411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f32412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f32413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f32414f;

        public c(View view) {
            super(view);
            this.f32410b = (TextView) view.findViewById(R.id.itemHistory_title);
            this.f32411c = (LinearLayout) view.findViewById(R.id.itemHistory_content);
            this.itemView.setOnClickListener(this);
            this.f32412d = (ImageView) view.findViewById(R.id.itemHistory_advanced);
            this.f32413e = (ImageView) view.findViewById(R.id.itemHistory_delete);
            this.f32414f = (ImageView) view.findViewById(R.id.itemHistory_undelete);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition() - 1;
            HistoryAdapter historyAdapter = HistoryAdapter.this;
            if (historyAdapter.f32399n == null || adapterPosition < 0) {
                return;
            }
            HistoryDB historyDB = (HistoryDB) historyAdapter.f36795b.get(adapterPosition);
            if (HistoryTypeFilter.b(historyDB.getString("type")).g(historyDB)) {
                historyAdapter.f32399n.onItemClick(null, this.itemView, adapterPosition, getItemId());
            }
        }
    }

    public HistoryAdapter(ActivityC1347l activityC1347l, boolean z10) {
        super(activityC1347l);
        this.f32398m = new ArrayList();
        this.f32404s = new a();
        this.f32405t = new b();
        this.f32395i = activityC1347l;
        this.f32396k = LayoutInflater.from(activityC1347l);
        this.f32397l = DateFilter.ALL;
        p147l9.b bVar = new p147l9.b();
        bVar.f44471d = new ArrayList<>();
        bVar.f44472e = new ArrayList<>();
        bVar.f44470c = activityC1347l;
        ArrayList<HistoryTypeFilter> arrayListF = HistoryTypeFilter.f();
        bVar.f44469b = arrayListF;
        this.f32394h = bVar;
        if (z10) {
            arrayListF.remove(HistoryTypeFilter.f31138i);
            bVar.f44469b.remove(HistoryTypeFilter.f31136g);
        }
    }

    @Override // p110i9.q, p110i9.h
    public final void b(List<HistoryDB> list) {
        super.b(list);
        r();
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, final int i10) {
        String string;
        String string2;
        String string3;
        char c10;
        char c11;
        String string4;
        LayoutInflater layoutInflater = this.f32396k;
        ActivityC1347l activityC1347l = this.f32395i;
        final c cVar = (c) b10;
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activityC1347l).c());
        HistoryDB historyDB = (HistoryDB) this.f36795b.get(i10);
        cVar.f32411c.removeAllViews();
        boolean z10 = historyDB.getBoolean("archived");
        ImageView imageView = cVar.f32414f;
        ImageView imageView2 = cVar.f32413e;
        if (z10) {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.history.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final HistoryAdapter historyAdapter = this.f32416b;
                historyAdapter.getClass();
                final int i11 = i10;
                final HistoryAdapter.c cVar2 = cVar;
                P.d(historyAdapter.f32395i, R.string.view_history_archive_history_item, R.string.common_archive, new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.history.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        HistoryAdapter historyAdapter2 = historyAdapter;
                        HistoryDB historyDB2 = (HistoryDB) historyAdapter2.f36795b.get(i11);
                        if (!historyAdapter2.j) {
                            int iIndexOf = historyAdapter2.f36795b.indexOf(historyDB2);
                            historyAdapter2.f36795b.remove(historyDB2);
                            int i12 = iIndexOf + 1;
                            historyAdapter2.notifyItemRemoved(i12);
                            historyAdapter2.notifyItemRangeChanged(i12, historyAdapter2.getItemCount() - iIndexOf);
                        }
                        historyDB2.put("archived", Boolean.TRUE);
                        historyDB2.saveInBackground(new i(historyAdapter2, cVar2));
                    }
                });
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.history.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryAdapter historyAdapter = this.f32441b;
                HistoryDB historyDB2 = (HistoryDB) historyAdapter.f36795b.get(i10);
                historyDB2.put("archived", Boolean.FALSE);
                historyDB2.saveInBackground(new C1493f(historyAdapter, cVar));
                historyAdapter.notifyItemChanged(historyAdapter.f36795b.indexOf(historyDB2) + (historyAdapter.f36798e ? 1 : 0));
            }
        });
        if (historyDB.c() != null) {
            C2801d controlUnitBase = historyDB.c().getControlUnitBase();
            ParseObject parseObject = controlUnitBase.getParseObject("texttable");
            if (parseObject == null) {
                return;
            }
            Locale locale = Locale.US;
            o(cVar, R.string.common_control_unit, B6.c.d("(", controlUnitBase.getString("klineId"), ") ", parseObject.getString(databaseLanguageValueOf.b())), true);
        }
        try {
            JSONObject jSONObjectD = historyDB.d();
            string = jSONObjectD.has("diagnostic_session_textid") ? jSONObjectD.getString("diagnostic_session_textid") : null;
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (string != null) {
            try {
                JSONObject jSONObjectD2 = historyDB.d();
                string2 = jSONObjectD2.has("diagnostic_session_textid") ? jSONObjectD2.getString("diagnostic_session_textid") : null;
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            o(cVar, R.string.common_diagnostic_session, Texttabe.c(string2), true);
        }
        JSONObject jSONObjectD3 = historyDB.d();
        String str = "type";
        HistoryTypeFilter historyTypeFilterB = HistoryTypeFilter.b(historyDB.getString("type"));
        cVar.f32412d.setVisibility(historyTypeFilterB.g(historyDB) ? 0 : 8);
        cVar.f32410b.setText(historyTypeFilterB.e());
        String str2 = "ti";
        String str3 = "value";
        String str4 = "oldValue";
        switch (historyTypeFilterB.ordinal()) {
            case 0:
                historyDB = historyDB;
                int i11 = R.layout.item_button_divider;
                for (Map.Entry entry : HistoryTypeLegacy.f31144e.f(activityC1347l, jSONObjectD3).entrySet()) {
                    boolean z11 = false;
                    for (String str5 : (List) entry.getValue()) {
                        if (z11) {
                            m(cVar, str5);
                        } else {
                            p(cVar, (String) entry.getKey(), str5, false, -1, null);
                            z11 = true;
                        }
                        i11 = i11;
                    }
                    int i12 = i11;
                    layoutInflater.inflate(i12, (ViewGroup) cVar.f32411c, true);
                    i11 = i12;
                }
                break;
            case 1:
                historyDB = historyDB;
                o(cVar, R.string.common_old_value, jSONObjectD3.optString("oldValue"), true);
                o(cVar, R.string.common_new_value, jSONObjectD3.optString("newValue"), true);
                break;
            case 2:
                historyDB = historyDB;
                q(cVar, jSONObjectD3, R.string.common_subsystem, "subName");
                break;
            case 3:
                historyDB = historyDB;
                o(cVar, R.string.common_old_value, jSONObjectD3.optString("oldValue"), true);
                o(cVar, R.string.common_new_value, jSONObjectD3.optString("newValue"), true);
                break;
            case 4:
                historyDB = historyDB;
                q(cVar, jSONObjectD3, R.string.common_subsystem, "subName");
                break;
            case 5:
            case 7:
                historyDB = historyDB;
                String strC = !jSONObjectD3.optString("ti").isEmpty() ? Texttabe.c(jSONObjectD3.optString("ti")) : null;
                if (strC == null) {
                    strC = jSONObjectD3.optString("name");
                }
                String str6 = strC;
                JSONArray jSONArrayOptJSONArray = jSONObjectD3.optJSONArray("changes");
                int i13 = 0;
                while (i13 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
                    String strC2 = !jSONObjectOptJSONObject.optString(str2).isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString(str2)) : null;
                    if (strC2 == null) {
                        strC2 = jSONObjectOptJSONObject.optString("name");
                    }
                    String str7 = strC2 == null ? "" : strC2;
                    if (str7.isEmpty()) {
                        m(cVar, str6);
                    } else {
                        p(cVar, str6, str7, false, -1, null);
                    }
                    String strC3 = !jSONObjectOptJSONObject.optString("oldTi").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString("oldTi")) : null;
                    String str8 = str4;
                    if (strC3 == null) {
                        strC3 = jSONObjectOptJSONObject.optString(str8);
                    }
                    String strC4 = !jSONObjectOptJSONObject.optString("newTi").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString("newTi")) : null;
                    if (strC4 == null) {
                        strC4 = jSONObjectOptJSONObject.optString("newValue");
                    }
                    String strC5 = !jSONObjectOptJSONObject.optString("unitTi").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString("unitTi")) : null;
                    if (strC5 == null) {
                        strC5 = jSONObjectOptJSONObject.optString("unit");
                    }
                    if (!strC5.isEmpty()) {
                        strC3 = O.a.f(strC3, " ", strC5);
                        strC4 = O.a.f(strC4, " ", strC5);
                    }
                    o(cVar, R.string.common_old_value, strC3, false);
                    o(cVar, R.string.common_new_value, strC4, true);
                    i13++;
                    str4 = str8;
                    str2 = str2;
                }
                break;
            case 6:
                historyDB = historyDB;
                q(cVar, jSONObjectD3, R.string.common_channel, "channel");
                break;
            case 8:
                historyDB = historyDB;
                o(cVar, R.string.common_channel, jSONObjectD3.optString("channel"), true);
                JSONArray jSONArrayOptJSONArray2 = jSONObjectD3.optJSONArray("statuses");
                for (int i14 = 0; i14 < jSONArrayOptJSONArray2.length(); i14++) {
                    int iOptInt = jSONArrayOptJSONArray2.optInt(i14);
                    if (iOptInt == 4) {
                        string3 = activityC1347l.getString(R.string.common_cancelled);
                    } else if (iOptInt == 10) {
                        string3 = activityC1347l.getString(R.string.common_running_advanced);
                    } else if (iOptInt != 6) {
                        string3 = iOptInt != 7 ? "" : activityC1347l.getString(R.string.common_on);
                    } else {
                        string3 = activityC1347l.getString(R.string.common_off);
                    }
                    if (!string3.isEmpty()) {
                        if (i14 == 0) {
                            o(cVar, R.string.common_status, string3, false);
                        } else {
                            m(cVar, string3);
                        }
                    }
                }
                layoutInflater.inflate(R.layout.item_button_divider, (ViewGroup) cVar.f32411c, true);
                break;
            case 9:
                historyDB = historyDB;
                n(cVar, jSONObjectD3, R.string.common_basic_settings);
                JSONArray jSONArrayOptJSONArray3 = jSONObjectD3.optJSONArray("statuses");
                for (int i15 = 0; i15 < jSONArrayOptJSONArray3.length(); i15++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i15);
                    String strC6 = !jSONObjectOptJSONObject2.optString("ti").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject2.optString("ti")) : null;
                    if (strC6 == null) {
                        strC6 = jSONObjectOptJSONObject2.optString("value");
                    }
                    if (strC6 == null) {
                        strC6 = "";
                    }
                    if (!strC6.isEmpty()) {
                        if (i15 == 0) {
                            o(cVar, R.string.common_status, strC6, false);
                        } else {
                            m(cVar, strC6);
                        }
                    }
                }
                layoutInflater.inflate(R.layout.item_button_divider, (ViewGroup) cVar.f32411c, true);
                break;
            case 10:
                historyDB = historyDB;
                o(cVar, R.string.common_value, jSONObjectD3.optString("value"), true);
                break;
            case 11:
                historyDB = historyDB;
                n(cVar, jSONObjectD3, R.string.common_value);
                break;
            case 12:
                historyDB = historyDB;
                q(cVar, jSONObjectD3, R.string.common_name, "appName");
                break;
            case 13:
            case 14:
                ControlUnitDB controlUnitDBC = historyDB.c();
                String strOptString = jSONObjectD3.optString("name");
                String str9 = "coding";
                JSONObject jSONObjectOptJSONObject3 = jSONObjectD3.optJSONObject("coding");
                JSONObject jSONObjectOptJSONObject4 = jSONObjectD3.optJSONObject("adaptations");
                JSONArray jSONArrayOptJSONArray4 = jSONObjectD3.optJSONArray("subsystems");
                JSONObject jSONObjectOptJSONObject5 = jSONObjectD3.optJSONObject("advanced_info");
                JSONObject jSONObjectOptJSONObject6 = jSONObjectD3.optJSONObject("liveData");
                if (!TextUtils.isEmpty(strOptString)) {
                    o(cVar, R.string.dialog_backup_backup_name, strOptString, true);
                }
                CodingType codingType = CodingType.f34405e;
                if (jSONObjectOptJSONObject3 != null) {
                    p(cVar, activityC1347l.getString(jSONObjectOptJSONObject3.optString("type").equals(codingType.c()) ? R.string.common_coding : R.string.common_long_coding), jSONObjectOptJSONObject3.optString("value"), true, i10, (controlUnitDBC == null || controlUnitDBC.getProtocol() == null || !controlUnitDBC.getProtocol().contains("KWP")) ? this.f32400o : null);
                }
                if (jSONObjectOptJSONObject4 != null) {
                    p(cVar, activityC1347l.getString(R.string.common_adaptations), Integer.toString(jSONObjectOptJSONObject4.optJSONArray("values").length()), true, i10, this.f32401p);
                }
                if (jSONObjectOptJSONObject5 != 0) {
                    p(cVar, activityC1347l.getString(R.string.common_advanced_identification), Integer.toString(jSONObjectOptJSONObject5.optJSONArray("values").length()), true, i10, this.f32402q);
                }
                if (jSONObjectOptJSONObject6 != null) {
                    p(cVar, activityC1347l.getString(R.string.common_live_data), Integer.toString(jSONObjectOptJSONObject6.optJSONArray(r7).length()), true, i10, this.f32403r);
                }
                if (jSONArrayOptJSONArray4 != null) {
                    int i16 = 0;
                    while (i16 < jSONArrayOptJSONArray4.length()) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray4.optJSONObject(i16);
                        String strOptString2 = jSONObjectOptJSONObject7.optString("name");
                        String str10 = str9;
                        JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject7.optJSONObject(str10);
                        p(cVar, activityC1347l.getString(R.string.common_subsystem), strOptString2, false, -1, null);
                        String str11 = str;
                        if (jSONObjectOptJSONObject8.optString(str11).equals(codingType.c())) {
                            c11 = 557;
                            string4 = activityC1347l.getString(R.string.common_coding);
                            c10 = 814;
                        } else {
                            c10 = 814;
                            c11 = 557;
                            string4 = activityC1347l.getString(R.string.common_long_coding);
                        }
                        p(cVar, string4, jSONObjectOptJSONObject8.optString(str3), true, -1, null);
                        i16++;
                        str9 = str10;
                        str = str11;
                        str3 = str3;
                    }
                }
                break;
            case 15:
                JSONArray jSONArrayOptJSONArray5 = jSONObjectD3.optJSONArray("faults");
                if (jSONArrayOptJSONArray5 == null) {
                    jSONArrayOptJSONArray5 = new JSONArray();
                }
                int iA = Fault.a(jSONArrayOptJSONArray5);
                int length = jSONArrayOptJSONArray5.length() - iA;
                o(cVar, R.string.common_active_faults, String.valueOf(iA), true);
                o(cVar, R.string.common_inactive_faults, String.valueOf(length), true);
                historyDB = historyDB;
                break;
            case 16:
                int iOptInt2 = jSONObjectD3.optInt("controlUnitCount");
                int iOptInt3 = jSONObjectD3.optInt("totalFaults");
                o(cVar, R.string.common_control_units, String.valueOf(iOptInt2), true);
                o(cVar, R.string.common_fault_count, String.valueOf(iOptInt3), true);
                historyDB = historyDB;
                break;
            case 17:
                o(cVar, R.string.common_address, jSONObjectD3.optString("address"), true);
                o(cVar, R.string.common_old_value, jSONObjectD3.optString("oldValue"), true);
                o(cVar, R.string.common_new_value, jSONObjectD3.optString("newValue"), true);
                historyDB = historyDB;
                break;
            case 18:
                int iOptInt4 = jSONObjectD3.optInt("controlUnitCount");
                int iOptInt5 = jSONObjectD3.optInt("faultsBefore");
                int iOptInt6 = jSONObjectD3.optInt("faultsAfter");
                boolean zOptBoolean = jSONObjectD3.optBoolean(MetricTracker.Action.COMPLETED);
                o(cVar, R.string.common_control_units, String.valueOf(iOptInt4), true);
                o(cVar, R.string.view_history_faults_before, String.valueOf(iOptInt5), true);
                o(cVar, R.string.view_history_faults_after, String.valueOf(iOptInt6), true);
                o(cVar, R.string.view_history_full_clear_comp, activityC1347l.getString(zOptBoolean ? R.string.common_yes : R.string.common_no), true);
                historyDB = historyDB;
                break;
            default:
                O.e.D("HistoryAdapter", "Unhandled case: " + historyTypeFilterB.name());
                historyDB = historyDB;
                break;
        }
        HistoryDB historyDB2 = historyDB;
        if (historyDB2.getInt("mileage") > 0) {
            p(cVar, activityC1347l.getString(R.string.common_mileage), Integer.toString(historyDB2.getInt("mileage")) + " km", true, -1, null);
        }
        o(cVar, R.string.common_date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(historyDB2.getCreatedAt()), false);
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new c(layoutInflater.inflate(R.layout.item_history, viewGroup, false));
    }

    public final void k(final R0.j jVar) {
        ActivityC1347l activityC1347l = this.f32395i;
        final String string = activityC1347l.getString(R.string.common_clear_all);
        final String string2 = activityC1347l.getString(R.string.common_select_all);
        final DateFilter[] dateFilterArrValues = DateFilter.values();
        String[] strArr = new String[dateFilterArrValues.length];
        for (int i10 = 0; i10 < dateFilterArrValues.length; i10++) {
            strArr[i10] = activityC1347l.getString(dateFilterArrValues[i10].stringRes);
        }
        final ArrayAdapter arrayAdapter = new ArrayAdapter(activityC1347l, R.layout.item_dropdown, strArr);
        View viewInflate = LayoutInflater.from(activityC1347l).inflate(R.layout.dialog_history_filter, (ViewGroup) null);
        final Switch r10 = (Switch) viewInflate.findViewById(R.id.historyFilterDialog_archiveSwitch);
        final AppCompatSpinner appCompatSpinner = (AppCompatSpinner) viewInflate.findViewById(R.id.historyFilterDialog_timeSpinner);
        r10.setChecked(this.j);
        MaterialDialog.a aVar = new MaterialDialog.a(activityC1347l);
        aVar.f23212B = Theme.f23261b;
        aVar.g(R.string.common_filter);
        aVar.b(viewInflate);
        aVar.f23217G = false;
        aVar.e(R.string.common_ok);
        aVar.d();
        aVar.f23244n = activityC1347l.getText(R.string.common_clear_all);
        aVar.f23253w = new MaterialDialog.e() { // from class: com.voltasit.obdeleven.presentation.history.e
            @Override // com.afollestad.materialdialogs.MaterialDialog.e
            public final void c(MaterialDialog materialDialog) {
                HistoryAdapter historyAdapter = this.f32444b;
                historyAdapter.getClass();
                historyAdapter.f32397l = dateFilterArrValues[appCompatSpinner.getSelectedItemPosition()];
                historyAdapter.j = r10.isChecked();
                historyAdapter.r();
                jVar.run();
                materialDialog.dismiss();
            }
        };
        aVar.f23254x = new U6.f(this);
        aVar.f23255y = new L(this, string2, string);
        aVar.f23223M = new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.presentation.history.f
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HistoryAdapter historyAdapter = this.f32449b;
                historyAdapter.getClass();
                MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
                AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) materialDialog.f34552b.findViewById(R.id.historyFilterDialog_timeSpinner);
                ListView listView = (ListView) materialDialog.f34552b.findViewById(R.id.historyFilterDialog_typeListView);
                MDButton mDButtonC = materialDialog.c(DialogAction.f23185c);
                p147l9.b bVar = historyAdapter.f32394h;
                int size = bVar.b().size();
                String str = string2;
                String str2 = string;
                mDButtonC.setText(size == 0 ? str : str2);
                bVar.f44473f = new c(historyAdapter, mDButtonC, str, str2);
                bVar.f44472e = bVar.b();
                appCompatSpinner2.setAdapter((SpinnerAdapter) arrayAdapter);
                appCompatSpinner2.setSelection(Arrays.asList(dateFilterArrValues).indexOf(historyAdapter.f32397l));
                bVar.f44472e = bVar.b();
                listView.setChoiceMode(2);
                listView.setAdapter((ListAdapter) bVar);
            }
        };
        aVar.f();
        notifyDataSetChanged();
    }

    public final Date l() {
        DateFilter dateFilter = this.f32397l;
        dateFilter.getClass();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        int iOrdinal = dateFilter.ordinal();
        if (iOrdinal == 0) {
            gregorianCalendar.setTimeInMillis(0L);
        } else if (iOrdinal == 2) {
            gregorianCalendar.add(5, -6);
        } else if (iOrdinal == 3) {
            gregorianCalendar.add(5, -29);
        }
        String str = "Calendar: " + gregorianCalendar.toString();
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "HistoryAdapter", str, Arrays.copyOf(new Object[0], 0));
        return gregorianCalendar.getTime();
    }

    public final void m(c cVar, String str) {
        TextView textView = (TextView) this.f32396k.inflate(R.layout.item_button, (ViewGroup) cVar.f32411c, false);
        textView.setText(str);
        cVar.f32411c.addView(textView);
        textView.setOnLongClickListener(this.f32405t);
    }

    public final void n(c cVar, JSONObject jSONObject, int i10) {
        String strC = !jSONObject.optString("ti").isEmpty() ? Texttabe.c(jSONObject.optString("ti")) : null;
        if (strC == null) {
            strC = jSONObject.optString("name");
        }
        o(cVar, i10, strC, true);
    }

    public final void o(c cVar, int i10, String str, boolean z10) {
        p(cVar, this.f32395i.getString(i10), str, z10, -1, null);
    }

    public final void p(final c cVar, String str, String str2, boolean z10, final int i10, final AdapterView.OnItemClickListener onItemClickListener) {
        LinearLayout linearLayout = (LinearLayout) this.f32396k.inflate(R.layout.item_labeled_button, (ViewGroup) cVar.f32411c, false);
        ((TextView) linearLayout.getChildAt(0)).setText(str);
        ((TextView) linearLayout.getChildAt(1)).setText(str2);
        cVar.f32411c.addView(linearLayout);
        linearLayout.setOnLongClickListener(this.f32404s);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.history.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11;
                AdapterView.OnItemClickListener onItemClickListener2 = onItemClickListener;
                if (onItemClickListener2 == null || (i11 = i10) < 0) {
                    return;
                }
                HistoryAdapter.c cVar2 = cVar;
                onItemClickListener2.onItemClick(null, cVar2.itemView, i11, cVar2.getItemId());
            }
        });
        if (z10) {
            this.f32396k.inflate(R.layout.item_button_divider, (ViewGroup) cVar.f32411c, true);
        }
    }

    public final void q(c cVar, JSONObject jSONObject, int i10, String str) {
        o(cVar, i10, jSONObject.optString(str), true);
        o(cVar, R.string.common_old_value, jSONObject.optString("oldValue"), true);
        o(cVar, R.string.common_new_value, jSONObject.optString("newValue"), true);
    }

    public final void r() {
        ArrayList arrayList = this.f32398m;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<HistoryTypeFilter> it = this.f32394h.b().iterator();
        while (it.hasNext()) {
            arrayList3.addAll(it.next().c());
        }
        for (T t8 : this.f36795b) {
            if (arrayList3.contains(HistoryTypeFilter.b(t8.getString("type")))) {
                arrayList2.add(t8);
            }
        }
        arrayList.addAll(arrayList2);
        notifyDataSetChanged();
    }
}
