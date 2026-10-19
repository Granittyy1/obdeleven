package com.voltasit.obdeleven.ui.dialogs;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.android.gms.internal.measurement.C1787c0;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.adapter.pro.LabelInputAdapter;
import com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: DeveloperDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f33732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p121j8.c f33733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialDialog f33735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p122j9.f f33736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LabelItemAdapter f33737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LabelInputAdapter f33738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Spinner f33739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f33740i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MDButton f33742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33743m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f33744n = new TaskCompletionSource<>();

    public B(MainActivity mainActivity, p121j8.c cVar, int i10) {
        this.f33732a = mainActivity;
        this.f33733b = cVar;
        this.f33734c = i10;
        MaterialDialog.a aVar = new MaterialDialog.a(mainActivity);
        aVar.f23212B = Theme.f23261b;
        Typeface typefaceCreate = Typeface.create("sans-serif", 0);
        Typeface typefaceJ = C1787c0.j();
        aVar.f23219I = typefaceCreate;
        aVar.f23218H = typefaceJ;
        aVar.g(R.string.common_develop);
        aVar.a(R.layout.dialog_developer_input);
        aVar.e(R.string.common_ok);
        aVar.d();
        aVar.f23244n = mainActivity.getText(R.string.common_edit);
        aVar.f23217G = false;
        aVar.f23253w = new I4.e(this);
        aVar.f23254x = new I4.f(7, this);
        aVar.f23255y = new F0.b(this);
        aVar.f23222L = new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.ui.dialogs.w
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f34051b.f33744n.setResult(Boolean.FALSE);
            }
        };
        aVar.f23223M = new com.voltasit.obdeleven.presentation.dialogs.backup.a(1, this);
        MaterialDialog materialDialog = new MaterialDialog(aVar);
        this.f33735d = materialDialog;
        materialDialog.getWindow().setSoftInputMode(16);
        this.f33736e = new p122j9.f(mainActivity);
        LabelItemAdapter labelItemAdapter = new LabelItemAdapter(mainActivity, LabelItemAdapter.Theme.f33720c);
        this.f33737f = labelItemAdapter;
        LabelInputAdapter labelInputAdapter = new LabelInputAdapter(mainActivity, LabelInputAdapter.Theme.f33708c, cVar.f41142a != ControlUnitLabelDB.Type.f34410c, true);
        this.f33738g = labelInputAdapter;
        labelItemAdapter.f33718d = new AdapterView.OnItemLongClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.x
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i11, long j) {
                B b10 = this.f34053b;
                b10.getClass();
                TextView textView = (TextView) view.findViewById(R.id.itemTranslation_value);
                MainActivity mainActivity2 = b10.f33732a;
                ((ClipboardManager) mainActivity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Translation", textView.getText()));
                p220r9.P.e(mainActivity2, mainActivity2.getString(R.string.dialog_developer_translation_copied));
                view.setPressed(false);
                return true;
            }
        };
        labelInputAdapter.b(i10, false);
    }

    public final void a() {
        int i10 = 0;
        boolean z10 = this.f33743m;
        this.f33743m = !z10;
        if (z10) {
            d();
            return;
        }
        int i11 = p255u9.z.f47484b;
        p255u9.z zVar = (p255u9.z) ParseUser.getCurrentUser();
        List list = zVar.getList("roles");
        if (list == null) {
            list = new ArrayList();
        }
        if (list.contains("DEVELOPER")) {
            c();
            return;
        }
        androidx.fragment.app.y fragmentManager = this.f33732a.getSupportFragmentManager();
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        C2182z c2182z = new C2182z(this, i10, zVar);
        A a10 = new A(0, this);
        W w3 = new W();
        w3.f33855s = c2182z;
        w3.f33856t = a10;
        w3.f32261r = fragmentManager;
        w3.setTargetFragment(null, 0);
        w3.A();
    }

    public final Task<Boolean> b() {
        this.f33735d.show();
        return this.f33744n.getTask();
    }

    public final void c() {
        this.f33739h.setVisibility(0);
        this.f33740i.setVisibility(0);
        this.j.setVisibility(8);
        this.f33742l.setText(R.string.common_back);
        List listAsList = Arrays.asList(DatabaseLanguage.values());
        int iIndexOf = listAsList.indexOf(DatabaseLanguage.a(p267v9.a.f47671a));
        p122j9.f fVar = this.f33736e;
        fVar.c();
        fVar.b(listAsList);
        this.f33739h.setOnItemSelectedListener(new b());
        if (this.f33739h.getSelectedItemPosition() == iIndexOf) {
            this.f33739h.getOnItemSelectedListener().onItemSelected(null, null, iIndexOf, 0L);
        } else {
            this.f33739h.setSelection(iIndexOf);
        }
        this.f33740i.setAdapter(this.f33738g);
    }

    public final void d() {
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        String strB = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(this.f33732a).c()).b();
        p121j8.c cVar = this.f33733b;
        if (cVar.d(cVar.b(-2), strB) == null) {
            this.f33742l.setText(R.string.common_add);
        } else {
            this.f33742l.setText(R.string.common_edit);
        }
        ArrayList arrayList = new ArrayList();
        HashMap<String, HashMap<String, List<p255u9.u>>> map = cVar.f41146e;
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            for (String str : map.get(it.next()).keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            this.f33739h.setVisibility(8);
            this.f33740i.setVisibility(8);
            this.j.setVisibility(0);
            return;
        }
        this.f33739h.setVisibility(0);
        this.f33740i.setVisibility(0);
        this.j.setVisibility(8);
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            String str2 = (String) arrayList.get(i11);
            arrayList2.add(DatabaseLanguage.a(str2));
            if (str2.equals(p267v9.a.f47671a)) {
                i10 = i11;
            }
        }
        p122j9.f fVar = this.f33736e;
        fVar.c();
        fVar.b(arrayList2);
        this.f33739h.setOnItemSelectedListener(new a());
        if (this.f33739h.getSelectedItemPosition() == i10) {
            this.f33739h.getOnItemSelectedListener().onItemSelected(null, null, i10, 0L);
        } else {
            this.f33739h.setSelection(i10);
        }
        this.f33740i.setAdapter(this.f33737f);
    }

    /* JADX INFO: compiled from: DeveloperDialog.java */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
            B b10 = B.this;
            String strB = b10.f33736e.getItem(i10).b();
            ArrayList arrayList = new ArrayList();
            p121j8.c cVar = b10.f33733b;
            List<p255u9.u> listC = cVar.c(cVar.b(-1), strB);
            if (listC != null && !listC.isEmpty()) {
                arrayList.add(new LabelItemAdapter.f("Name"));
                Iterator<p255u9.u> it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(new LabelItemAdapter.d(it.next()));
                }
            }
            List<p255u9.u> listC2 = cVar.c(cVar.b(-2), strB);
            if (listC2 != null && !listC2.isEmpty()) {
                arrayList.add(new LabelItemAdapter.f("Description"));
                Iterator<p255u9.u> it2 = listC2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new LabelItemAdapter.d(it2.next()));
                }
            }
            for (int i11 = 0; i11 < b10.f33734c; i11++) {
                List<p255u9.u> listC3 = cVar.c(cVar.b(i11), strB);
                if (listC3 != null && !listC3.isEmpty()) {
                    Locale locale = Locale.US;
                    arrayList.add(new LabelItemAdapter.f(b10.f33732a.getString(R.string.common_value) + " " + (i11 + 1)));
                    Iterator<p255u9.u> it3 = listC3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new LabelItemAdapter.d(it3.next()));
                    }
                }
            }
            LabelItemAdapter labelItemAdapter = b10.f33737f;
            labelItemAdapter.f33717c.clear();
            labelItemAdapter.f33717c.addAll(arrayList);
            labelItemAdapter.notifyDataSetChanged();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: compiled from: DeveloperDialog.java */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
            LabelInputAdapter labelInputAdapter;
            B b10 = B.this;
            String strB = b10.f33736e.getItem(i10).b();
            int i11 = 0;
            while (true) {
                labelInputAdapter = b10.f33738g;
                String[] strArr = labelInputAdapter.f33706g;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = "";
                i11++;
            }
            p121j8.c cVar = b10.f33733b;
            p255u9.u uVarD = cVar.d(cVar.b(-1), strB);
            if (uVarD != null) {
                labelInputAdapter.a(-1, uVarD.getString("value"));
            }
            p255u9.u uVarD2 = cVar.d(cVar.b(-2), strB);
            if (uVarD2 != null) {
                b10.f33741k = true;
                labelInputAdapter.a(-2, uVarD2.getString("value"));
            }
            for (int i12 = 0; i12 < b10.f33734c; i12++) {
                p255u9.u uVarD3 = cVar.d(cVar.b(i12), strB);
                if (uVarD3 != null) {
                    labelInputAdapter.a(i12, uVarD3.getString("value"));
                }
            }
            labelInputAdapter.notifyDataSetChanged();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
