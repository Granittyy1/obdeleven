package com.voltasit.obdeleven.ui.module;

import D9.o;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.media3.exoplayer.O;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.domain.usecases.device.u;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.view.SpinnerDropDown;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p134k8.T1;
import p220r9.J;
import p220r9.P;
import p255u9.C2802e;
import p255u9.C2803f;
import p255u9.v;

/* JADX INFO: compiled from: LookupFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends BaseFragment implements View.OnClickListener, AdapterView.OnItemLongClickListener, O8.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f34103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextInputLayout f34104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f34105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ProgressBar f34106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f34108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f34109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p110i9.k f34110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f34111t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34112u = 0;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.lookup_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.lookupFragment_list);
        p110i9.k kVar = this.f34110s;
        LinearLayout linearLayout = (LinearLayout) x(null, R.layout.lookup_fragment_header);
        this.f34105n = (ImageView) linearLayout.findViewById(R.id.lookupFragment_image);
        SpinnerDropDown spinnerDropDown = (SpinnerDropDown) linearLayout.findViewById(R.id.lookupFragment_spinner);
        this.f34104m = (TextInputLayout) linearLayout.findViewById(R.id.lookupFragment_inputLayout);
        this.f34103l = (EditText) linearLayout.findViewById(R.id.lookupFragment_input);
        ImageButton imageButton = (ImageButton) linearLayout.findViewById(R.id.lookupFragment_search);
        spinnerDropDown.setOnItemSelectedListener(this);
        spinnerDropDown.setItems(Arrays.asList(getString(R.string.common_trouble_codes), getString(R.string.common_engine_codes), getString(R.string.common_equipment_codes)));
        imageButton.setOnClickListener(this);
        if (q().E()) {
            this.f34105n.getLayoutParams().height = A0.f.i(this) / 4;
        }
        kVar.i(linearLayout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(this.f34110s);
        LinearLayout linearLayout2 = (LinearLayout) x(null, R.layout.lookup_fragment_footer);
        this.f34106o = (ProgressBar) linearLayout2.findViewById(R.id.lookupFragment_progress);
        this.f34107p = (TextView) linearLayout2.findViewById(R.id.lookupFragment_description);
        this.f34108q = (ImageView) linearLayout2.findViewById(R.id.lookupFragment_picture_1);
        this.f34109r = (ImageView) linearLayout2.findViewById(R.id.lookupFragment_picture_2);
        this.f34110s.h(linearLayout2);
        return viewInflate;
    }

    public final void O() {
        this.f34106o.setVisibility(8);
        this.f34107p.setVisibility(8);
        this.f34108q.setVisibility(8);
        this.f34109r.setVisibility(8);
    }

    public final void P() {
        this.f34106o.setVisibility(8);
        this.f34107p.setVisibility(0);
        this.f34108q.setVisibility(0);
        this.f34109r.setVisibility(0);
    }

    public final void Q() {
        this.f34106o.setVisibility(0);
        this.f34107p.setVisibility(8);
        this.f34108q.setVisibility(8);
        this.f34109r.setVisibility(8);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "LookupFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f34104m.setError("");
        if (u.k(getActivity())) {
            int i10 = this.f34112u;
            if (i10 == 0) {
                String upperCase = this.f34103l.getText().toString().toUpperCase();
                if (upperCase.length() != 5 && upperCase.length() != 7) {
                    this.f34104m.setError(getString(R.string.view_lookup_code_length));
                    P();
                } else if (!upperCase.equalsIgnoreCase(this.f34111t)) {
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34244E, 1);
                    this.f34111t = upperCase;
                    Q();
                    this.f34110s.d();
                    if (!Pattern.compile("^[BCPU]").matcher(upperCase).find()) {
                        upperCase = "VAG".concat(upperCase);
                    } else if (upperCase.length() == 5) {
                        upperCase = upperCase.concat("00");
                    }
                    int i11 = v.f47482b;
                    ParseQuery query = ParseQuery.getQuery(v.class);
                    query.whereEqualTo("objectId", upperCase);
                    query.getFirstInBackground(new GetCallback() { // from class: com.voltasit.obdeleven.ui.module.d
                        @Override // com.parse.ParseCallback2
                        public final void done(Object obj, Throwable th) {
                            ParseException parseException = (ParseException) th;
                            v vVar = (v) ((ParseObject) obj);
                            g gVar = this.f34099a;
                            if (gVar.isVisible()) {
                                gVar.O();
                                if (parseException != null) {
                                    if (parseException.getCode() == 101) {
                                        gVar.f34104m.setError(gVar.getString(R.string.view_lookup_code_not_found));
                                    } else {
                                        gVar.f34104m.setError(J.g(gVar.q(), parseException));
                                    }
                                    gVar.P();
                                    return;
                                }
                                ArrayList<DatabaseLanguage> arrayList = new ArrayList(Arrays.asList(DatabaseLanguage.values()));
                                ActivityC1347l activity = gVar.getActivity();
                                List<String> list = com.voltasit.obdeleven.a.f29638c;
                                DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activity).c());
                                arrayList.remove(databaseLanguageValueOf);
                                if (vVar.getString(databaseLanguageValueOf.b()) != null && !vVar.getString(databaseLanguageValueOf.b()).isEmpty()) {
                                    gVar.f34110s.a(new T1(databaseLanguageValueOf.d(), vVar.getString(databaseLanguageValueOf.b()), ""));
                                }
                                for (DatabaseLanguage databaseLanguage : arrayList) {
                                    if (vVar.getString(databaseLanguage.b()) != null && !vVar.getString(databaseLanguage.b()).isEmpty()) {
                                        gVar.f34110s.a(new T1(databaseLanguage.d(), vVar.getString(databaseLanguage.b()), ""));
                                    }
                                }
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                String upperCase2 = this.f34103l.getText().toString().toUpperCase();
                if (upperCase2.length() < 2) {
                    this.f34104m.setError(getString(R.string.view_engine_lookup_code_length));
                    P();
                } else if (!upperCase2.equalsIgnoreCase(this.f34111t)) {
                    this.f34111t = upperCase2;
                    Q();
                    this.f34110s.d();
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34244E, 1);
                    int i12 = C2802e.f47469b;
                    final ParseQuery query2 = ParseQuery.getQuery(C2802e.class);
                    query2.whereEqualTo("engine", upperCase2);
                    p279w9.d.a(query2, new p279w9.a("ENGINE".concat(upperCase2), 2592000000L), new w9.d.b() { // from class: com.voltasit.obdeleven.ui.module.f
                        @Override // w9.d.b
                        public final void g(List list, ParseException parseException) {
                            String strConcat;
                            g gVar = this.f34101b;
                            if (gVar.isVisible()) {
                                gVar.O();
                                if (parseException != null) {
                                    if (parseException.getCode() == 101) {
                                        gVar.f34104m.setError(gVar.getString(R.string.view_lookup_engine_code_not_found));
                                    } else {
                                        gVar.f34104m.setError(J.g(gVar.q(), parseException));
                                    }
                                    gVar.P();
                                    query2.clearCachedResult();
                                    return;
                                }
                                if (list.isEmpty()) {
                                    gVar.f34104m.setError(gVar.getString(R.string.view_lookup_engine_code_not_found));
                                    gVar.P();
                                    return;
                                }
                                C2802e c2802e = (C2802e) list.get(0);
                                String strA = c2802e.a();
                                String string = c2802e.getString("kw");
                                if (string == null) {
                                    string = "";
                                }
                                String string2 = c2802e.getString("hp");
                                if (string2 == null) {
                                    string2 = "";
                                }
                                if (!string.isEmpty() && !string2.isEmpty()) {
                                    strConcat = C4.b.d(string, " kW (", string2, " HP)");
                                } else if (string.isEmpty()) {
                                    strConcat = !string2.isEmpty() ? string2.concat(" HP") : "";
                                } else {
                                    strConcat = string.concat(" kW");
                                }
                                String string3 = c2802e.getString("ltr");
                                if (string3 == null) {
                                    string3 = "";
                                }
                                String string4 = c2802e.getString("cyl");
                                if (string4 == null) {
                                    string4 = "";
                                }
                                String string5 = c2802e.getString("remark");
                                if (string5 == null) {
                                    string5 = "";
                                }
                                if (!strA.isEmpty()) {
                                    gVar.f34110s.a(new T1(gVar.getString(R.string.common_engine_code), strA, ""));
                                }
                                if (!strConcat.isEmpty()) {
                                    gVar.f34110s.a(new T1(gVar.getString(R.string.common_power), strConcat, ""));
                                }
                                if (!string3.isEmpty()) {
                                    gVar.f34110s.a(new T1(gVar.getString(R.string.common_volume), string3, ""));
                                }
                                if (!string4.isEmpty()) {
                                    gVar.f34110s.a(new T1(gVar.getString(R.string.common_cylinders), string4, ""));
                                }
                                if (!string5.isEmpty()) {
                                    gVar.f34110s.a(new T1(gVar.getString(R.string.common_remark), string5, ""));
                                }
                                gVar.O();
                            }
                        }
                    });
                }
            } else if (i10 == 2) {
                String upperCase3 = this.f34103l.getText().toString().toUpperCase();
                if (upperCase3.length() != 3) {
                    this.f34104m.setError(getString(R.string.view_lookup_code_length_3));
                    P();
                } else {
                    Iterator it = this.f34110s.f36795b.iterator();
                    while (it.hasNext()) {
                        if (((T1) it.next()).f42678a.equals(upperCase3)) {
                            this.f34104m.setError(getString(R.string.view_lookup_code_already_exist));
                        }
                    }
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34244E, 1);
                    Q();
                    int i13 = C2803f.f47470b;
                    ParseQuery query3 = ParseQuery.getQuery(C2803f.class);
                    query3.whereEqualTo("code", upperCase3);
                    query3.getFirstInBackground(new GetCallback() { // from class: com.voltasit.obdeleven.ui.module.e
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // com.parse.ParseCallback2
                        public final void done(Object obj, Throwable th) {
                            ParseException parseException = (ParseException) th;
                            C2803f c2803f = (C2803f) ((ParseObject) obj);
                            g gVar = this.f34100a;
                            if (gVar.isVisible()) {
                                gVar.O();
                                if (parseException == null) {
                                    p110i9.k kVar = gVar.f34110s;
                                    kVar.f36795b.add(0, (T) new T1(c2803f.getString("code"), c2803f.getString("description"), ""));
                                    kVar.notifyDataSetChanged();
                                    return;
                                }
                                if (parseException.getCode() == 101) {
                                    gVar.f34104m.setError(gVar.getString(R.string.view_lookup_equipment_code_not_found));
                                } else {
                                    gVar.f34104m.setError(J.g(gVar.q(), parseException));
                                }
                                if (gVar.f34110s.f36795b.isEmpty()) {
                                    gVar.P();
                                }
                            }
                        }
                    });
                }
            }
        } else {
            P.b(getActivity(), R.string.common_check_network);
        }
        o.m(this.f34103l);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p110i9.k kVar = new p110i9.k(getContext());
        this.f34110s = kVar;
        kVar.f36805g = this;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j) {
        LinearLayout linearLayout = (LinearLayout) view;
        String string = ((TextView) linearLayout.getChildAt(0)).getText().toString();
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, ((TextView) linearLayout.getChildAt(1)).getText().toString()));
        MainActivity mainActivityQ = q();
        Locale locale = Locale.US;
        P.e(mainActivityQ, string + " " + getString(R.string.common_copied));
        view.setPressed(false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:14:0x00fe  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
        Drawable drawable;
        Drawable drawable2;
        int i11 = 2;
        Object[] objArr = {Integer.valueOf(i10)};
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "LookupFragment", "setupLookup(pos: %d)", Arrays.copyOf(objArr, 1));
        this.f34112u = i10;
        this.f34110s.d();
        P();
        this.f34103l.setText("");
        this.f34104m.setError("");
        if (i10 == 0) {
            drawable = getResources().getDrawable(2131231737);
            this.f34107p.setText(R.string.view_lookup_description);
            this.f34108q.setVisibility(8);
            this.f34109r.setVisibility(8);
            this.f34103l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    drawable2 = null;
                } else {
                    drawable = getResources().getDrawable(2131231001);
                    this.f34107p.setText(R.string.view_lookup_code_description);
                    this.f34108q.setVisibility(0);
                    this.f34108q.setImageDrawable(getResources().getDrawable(R.drawable.pr_code));
                    this.f34109r.setVisibility(8);
                    this.f34103l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                }
                if (this.f34105n.getDrawable() == null) {
                    this.f34105n.setImageDrawable(drawable2);
                } else {
                    new Handler().post(new O(this, i11, drawable2));
                }
            }
            drawable = getResources().getDrawable(2131231000);
            this.f34107p.setText(R.string.view_lookup_engine_description);
            this.f34108q.setVisibility(0);
            this.f34108q.setImageDrawable(getResources().getDrawable(R.drawable.engine_code2));
            this.f34109r.setVisibility(0);
            this.f34109r.setImageDrawable(getResources().getDrawable(R.drawable.engine_code));
            this.f34103l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
        }
        drawable2 = drawable;
        if (this.f34105n.getDrawable() == null) {
            this.f34105n.setImageDrawable(drawable2);
        } else {
            new Handler().post(new O(this, i11, drawable2));
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_lookup);
    }
}
