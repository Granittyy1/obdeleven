package p170n9;

import J4.i;
import P8.c;
import X5.n;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.Constants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.adapter.pro.LabelInputAdapter;
import com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter;
import com.voltasit.obdeleven.ui.dialogs.W;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p121j8.e;
import p122j9.f;
import p220r9.P;
import p255u9.u;
import p255u9.z;

/* JADX INFO: compiled from: ControlUnitLongCodingDeveloperFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/102/long-coding")
public class d extends BaseFragment implements DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppCompatSpinner f44987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f44988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FrameLayout f44989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FloatingActionButton f44990o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f44992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f44995t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LabelItemAdapter f44996u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LabelInputAdapter f44997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public W f44998w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AppCompatCheckBox[] f44991p = new AppCompatCheckBox[8];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44999x = false;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if (!this.f44999x) {
            return super.A();
        }
        this.f44999x = false;
        P();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_long_coding_developer, viewGroup, false);
        if (this.f44992q == null) {
            return viewInflate;
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit0);
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit1);
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit2);
        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit3);
        AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit4);
        AppCompatCheckBox appCompatCheckBox6 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit5);
        AppCompatCheckBox appCompatCheckBox7 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit6);
        AppCompatCheckBox appCompatCheckBox8 = (AppCompatCheckBox) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_bit7);
        TextView textView = (TextView) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_byte);
        this.f44987l = (AppCompatSpinner) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_language);
        this.f44988m = (RecyclerView) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_list);
        this.f44989n = (FrameLayout) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_empty);
        this.f44990o = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitLongCodingDeveloperFragment_fab);
        AppCompatCheckBox[] appCompatCheckBoxArr = this.f44991p;
        appCompatCheckBoxArr[0] = appCompatCheckBox;
        appCompatCheckBoxArr[1] = appCompatCheckBox2;
        appCompatCheckBoxArr[2] = appCompatCheckBox3;
        appCompatCheckBoxArr[3] = appCompatCheckBox4;
        appCompatCheckBoxArr[4] = appCompatCheckBox5;
        appCompatCheckBoxArr[5] = appCompatCheckBox6;
        appCompatCheckBoxArr[6] = appCompatCheckBox7;
        appCompatCheckBoxArr[7] = appCompatCheckBox8;
        ArrayList arrayListB = this.f44992q.b(this.f44993r, this.f44994s);
        boolean zIsEmpty = arrayListB.isEmpty();
        int i10 = !zIsEmpty ? ((ControlUnitLabelDB) arrayListB.get(0)).getInt("bitLength") : 1;
        e eVar = this.f44992q;
        int i11 = this.f44993r;
        boolean[] zArr = new boolean[8];
        int i12 = 0;
        while (i12 < 8) {
            ArrayList arrayListB2 = eVar.b(i11, i12);
            if (!arrayListB2.isEmpty()) {
                int i13 = ((ControlUnitLabelDB) arrayListB2.get(0)).getInt("bitLength");
                for (int i14 = 0; i14 < i13; i14++) {
                    zArr[i12 + i14] = true;
                }
                i12 += i13 - 1;
            }
            i12++;
        }
        eVar.getClass();
        boolean[] zArr2 = new boolean[8];
        int i15 = this.f44994s;
        zArr2[i15] = true;
        boolean z10 = true;
        for (int i16 = i15 + 1; i16 < 8; i16++) {
            if (zArr[i16]) {
                z10 = false;
            }
            zArr2[i16] = z10;
        }
        boolean z11 = true;
        for (int i17 = this.f44994s - 1; i17 >= 0; i17--) {
            if (zArr[i17]) {
                z11 = false;
            }
            zArr2[i17] = z11;
        }
        final int i18 = 0;
        while (i18 < appCompatCheckBoxArr.length) {
            final AppCompatCheckBox appCompatCheckBox9 = appCompatCheckBoxArr[i18];
            appCompatCheckBox9.setEnabled(zIsEmpty && zArr2[i18]);
            int i19 = this.f44994s;
            appCompatCheckBox9.setChecked(i18 >= i19 && i18 < i19 + i10);
            appCompatCheckBox9.setOnClickListener(new View.OnClickListener() { // from class: n9.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = this.f44979b;
                    dVar.getClass();
                    int i20 = i18;
                    Object[] objArr = {Integer.valueOf(i20)};
                    p279w9.b bVar = Application.f29634b;
                    c.a(3, "ControlUnitLongCodingDeveloperFragment", "%d bit clicked", Arrays.copyOf(objArr, 1));
                    AppCompatCheckBox appCompatCheckBox10 = appCompatCheckBox9;
                    boolean zIsChecked = appCompatCheckBox10.isChecked();
                    AppCompatCheckBox[] appCompatCheckBoxArr2 = dVar.f44991p;
                    if (zIsChecked) {
                        int i21 = -1;
                        int i22 = -1;
                        for (int i23 = 0; i23 < 8; i23++) {
                            if (appCompatCheckBoxArr2[i23].isChecked() && i21 == -1) {
                                i21 = i23;
                            }
                            int i24 = 7 - i23;
                            if (appCompatCheckBoxArr2[i24].isChecked() && i22 == -1) {
                                i22 = i24;
                            }
                        }
                        while (i21 < i22) {
                            appCompatCheckBoxArr2[i21].setChecked(true);
                            i21++;
                        }
                    } else {
                        int i25 = 0;
                        for (AppCompatCheckBox appCompatCheckBox11 : appCompatCheckBoxArr2) {
                            if (appCompatCheckBox11.isChecked()) {
                                i25++;
                            }
                        }
                        if (i25 == 0 || (i20 > 0 && i20 < 7 && appCompatCheckBoxArr2[i20 - 1].isChecked() && appCompatCheckBoxArr2[i20 + 1].isChecked())) {
                            appCompatCheckBox10.setChecked(true);
                            P.a(dVar.q(), "ERROR");
                        }
                    }
                    dVar.f44994s = -1;
                    for (int i26 = 0; i26 < 8; i26++) {
                        if (appCompatCheckBoxArr2[i26].isChecked()) {
                            dVar.f44994s = i26;
                            break;
                        }
                    }
                    int i27 = 0;
                    for (AppCompatCheckBox appCompatCheckBox12 : appCompatCheckBoxArr2) {
                        if (appCompatCheckBox12.isChecked()) {
                            i27++;
                        }
                    }
                    dVar.f44997v.b(i27, true);
                }
            });
            i18++;
        }
        this.f44997v.b(i10, true);
        textView.setText(String.format(Locale.US, "%s %02d", getString(R.string.common_byte), Integer.valueOf(this.f44993r)));
        this.f44987l.setAdapter((SpinnerAdapter) this.f44995t);
        this.f44988m.setAdapter(this.f44996u);
        this.f44990o.setOnClickListener(new n(4, this));
        if (this.f44999x) {
            O();
        } else {
            P();
        }
        return viewInflate;
    }

    public final void O() {
        this.f44987l.setVisibility(0);
        this.f44988m.setVisibility(0);
        this.f44989n.setVisibility(8);
        this.f44990o.setImageResource(2131231448);
        this.f44990o.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.fab_blue)));
        List listAsList = Arrays.asList(DatabaseLanguage.values());
        int iIndexOf = listAsList.indexOf(DatabaseLanguage.a(p267v9.a.f47671a));
        this.f44995t.c();
        this.f44995t.b(listAsList);
        this.f44987l.setOnItemSelectedListener(new b());
        if (this.f44987l.getSelectedItemPosition() == iIndexOf) {
            this.f44987l.getOnItemSelectedListener().onItemSelected(null, null, iIndexOf, 0L);
        } else {
            this.f44987l.setSelection(iIndexOf);
        }
        this.f44988m.setAdapter(this.f44997v);
    }

    public final void P() {
        this.f44990o.setImageResource(2131231151);
        this.f44990o.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.fab_red)));
        e eVar = this.f44992q;
        int i10 = this.f44993r;
        int i11 = this.f44994s;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = eVar.b(i10, i11).iterator();
        while (it.hasNext()) {
            for (String str : ((HashMap) eVar.f41156c.get(((ControlUnitLabelDB) it.next()).getString("description"))).keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            this.f44988m.setVisibility(8);
            this.f44989n.setVisibility(0);
            return;
        }
        this.f44987l.setVisibility(0);
        this.f44988m.setVisibility(0);
        this.f44989n.setVisibility(8);
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            String str2 = (String) arrayList.get(i13);
            arrayList2.add(DatabaseLanguage.a(str2));
            if (str2.equals(p267v9.a.f47671a)) {
                i12 = i13;
            }
        }
        this.f44995t.c();
        this.f44995t.b(arrayList2);
        this.f44987l.setOnItemSelectedListener(new a());
        this.f44987l.setSelection(i12);
        this.f44988m.setAdapter(this.f44996u);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("LabelDeveloperAgreementDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                int i10 = z.f47484b;
                z zVar = (z) ParseUser.getCurrentUser();
                zVar.addUnique("roles", "DEVELOPER");
                zVar.saveEventually();
                O();
            } else {
                this.f44999x = false;
            }
            this.f44998w.y();
            this.f44998w = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitLongCodingDeveloperFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f44995t = new f(getContext());
        this.f44996u = new LabelItemAdapter(getContext(), LabelItemAdapter.Theme.f33719b);
        this.f44997v = new LabelInputAdapter(getContext(), LabelInputAdapter.Theme.f33707b, true, false);
        this.f44996u.f33718d = new AdapterView.OnItemLongClickListener() { // from class: n9.a
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i10, long j) {
                d dVar = this.f44978b;
                dVar.getClass();
                ((ClipboardManager) dVar.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Translation", ((TextView) view.findViewById(R.id.itemTranslation_value)).getText()));
                P.e(dVar.q(), dVar.getString(R.string.dialog_developer_translation_copied));
                view.setPressed(false);
                return true;
            }
        };
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_long_coding);
    }

    /* JADX INFO: compiled from: ControlUnitLongCodingDeveloperFragment.java */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
            String string;
            d dVar = d.this;
            String strB = dVar.f44995t.getItem(i10).b();
            ArrayList<ControlUnitLabelDB> arrayListB = dVar.f44992q.b(dVar.f44993r, dVar.f44994s);
            ArrayList arrayList = new ArrayList();
            for (ControlUnitLabelDB controlUnitLabelDB : arrayListB) {
                List<u> listC = dVar.f44992q.c(controlUnitLabelDB, strB);
                if (listC != null && !listC.isEmpty()) {
                    int i11 = controlUnitLabelDB.getInt("value");
                    if (i11 == -1) {
                        string = dVar.getString(R.string.common_name);
                    } else {
                        int i12 = controlUnitLabelDB.getInt("bitLength");
                        StringBuilder sbE = C4.b.e(dVar.getString(R.string.common_value) + ' ');
                        sbE.append(String.format(i.c(i12, "%", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY), Integer.toBinaryString(i11)).replace(' ', '0'));
                        string = sbE.toString();
                    }
                    arrayList.add(new LabelItemAdapter.f(string));
                    Iterator<u> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new LabelItemAdapter.d(it.next()));
                    }
                }
            }
            dVar.f44996u.f33717c.clear();
            LabelItemAdapter labelItemAdapter = dVar.f44996u;
            labelItemAdapter.f33717c.addAll(arrayList);
            labelItemAdapter.notifyDataSetChanged();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: compiled from: ControlUnitLongCodingDeveloperFragment.java */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
            d dVar = d.this;
            String strB = dVar.f44995t.getItem(i10).b();
            LabelInputAdapter labelInputAdapter = dVar.f44997v;
            int i11 = 0;
            while (true) {
                String[] strArr = labelInputAdapter.f33706g;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = "";
                i11++;
            }
            for (ControlUnitLabelDB controlUnitLabelDB : dVar.f44992q.b(dVar.f44993r, dVar.f44994s)) {
                u uVarD = dVar.f44992q.d(controlUnitLabelDB, strB);
                if (uVarD != null) {
                    dVar.f44997v.a(controlUnitLabelDB.getInt("value"), uVarD.getString("value"));
                }
            }
            dVar.f44997v.notifyDataSetChanged();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
