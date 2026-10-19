package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import B8.AbstractC0664z;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.login.j;
import com.voltasit.obdeleven.R;
import p134k8.C2642q1;

/* JADX INFO: compiled from: EepromCodingDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends com.voltasit.obdeleven.presentation.dialogs.e implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f31565A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f31566B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f31570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p122j9.g f31571w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EepromFragment.EepromData f31573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC0664z f31574z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout[] f31567s = new LinearLayout[8];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView[] f31568t = new TextView[8];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AppCompatCheckBox[] f31569u = new AppCompatCheckBox[8];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f31572x = 0;

    public final void B(int i10) {
        this.f31572x = i10;
        p122j9.g gVar = this.f31571w;
        gVar.f41192f = i10;
        gVar.notifyDataSetChanged();
        this.f31574z.f2200C.m0(i10);
        C2642q1 c2642q1 = this.f31571w.f41191e;
        int i11 = 0;
        while (true) {
            AppCompatCheckBox[] appCompatCheckBoxArr = this.f31569u;
            if (i11 >= appCompatCheckBoxArr.length) {
                return;
            }
            AppCompatCheckBox appCompatCheckBox = appCompatCheckBoxArr[i11];
            byte b10 = this.f31571w.f41190d.c(i10)[i11];
            byte b11 = c2642q1.c(i10)[i11];
            appCompatCheckBox.setChecked(b11 == 1);
            H0.b.c(appCompatCheckBox, ColorStateList.valueOf(b11 != b10 ? getResources().getColor(R.color.checkbox_green) : getResources().getColor(R.color.checkbox_blue)));
            this.f31574z.f2198A.setError(String.format("0x%02X", Integer.valueOf(Integer.parseInt(this.f31566B.replace("0x", ""), 16) + i10)));
            TextView textView = this.f31568t[i11];
            this.f31567s[i11].setEnabled(true);
            textView.setVisibility(0);
            textView.setText(getString(R.string.common_bit) + " " + i11);
            textView.setTextColor(-16777216);
            i11++;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        B(i10);
        this.f31574z.f2209z.setText((CharSequence) this.f31571w.f41191e.d().get(i10));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        int i10 = 0;
        int i11 = 1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i12 = AbstractC0664z.f2197D;
        AbstractC0664z abstractC0664z = (AbstractC0664z) M0.e.a(layoutInflaterFrom, R.layout.dialog_eeprom_coding, null, false, null);
        this.f31574z = abstractC0664z;
        View view = abstractC0664z.f4488d;
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f31570v = bundle;
        if (bundle.containsKey("eepromItem")) {
            this.f31573y = (EepromFragment.EepromData) this.f31570v.getSerializable("eepromItem");
        }
        if (this.f31570v.containsKey("key_is_history")) {
            this.f31565A = this.f31570v.getBoolean("key_is_history");
        }
        if (this.f31570v.containsKey("key_start_address")) {
            this.f31566B = this.f31570v.getString("key_start_address");
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setView(view).setCancelable(true).setNeutralButton(getString(R.string.common_cancel), new b(this, i10)).setPositiveButton(getString(R.string.common_ok), new j(this, i11)).create();
        p122j9.g gVar = new p122j9.g(getContext());
        this.f31571w = gVar;
        gVar.f41191e = new C2642q1(this.f31573y.a().replace(" ", "").toUpperCase(), null);
        gVar.notifyDataSetChanged();
        p122j9.g gVar2 = this.f31571w;
        gVar2.f41190d = new C2642q1(this.f31573y.c().replace(" ", ""));
        gVar2.notifyDataSetChanged();
        this.f31571w.f41188b = this;
        this.f31574z.f2199B.setText(String.format("%s 0x%02X", getString(R.string.common_address), Integer.valueOf(Integer.parseInt(this.f31566B.replace("0x", ""), 16))));
        this.f31574z.f2209z.setText((CharSequence) this.f31571w.f41191e.d().get(this.f31572x));
        if (this.f31565A) {
            this.f31574z.f2209z.setEnabled(false);
        }
        this.f31574z.f2209z.addTextChangedListener(new a());
        AbstractC0664z abstractC0664z2 = this.f31574z;
        this.f31567s = new LinearLayout[]{abstractC0664z2.f2201r.f1806r, abstractC0664z2.f2202s.f1806r, abstractC0664z2.f2203t.f1806r, abstractC0664z2.f2204u.f1806r, abstractC0664z2.f2205v.f1806r, abstractC0664z2.f2206w.f1806r, abstractC0664z2.f2207x.f1806r, abstractC0664z2.f2208y.f1806r};
        final int i13 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f31567s;
            if (i13 >= linearLayoutArr.length) {
                B(this.f31572x);
                this.f31574z.f2198A.setErrorEnabled(true);
                this.f31574z.f2200C.setHasFixedSize(false);
                this.f31574z.f2200C.setAdapter(this.f31571w);
                alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.c
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i14, KeyEvent keyEvent) {
                        e eVar = this.f31562b;
                        if (i14 == 4) {
                            eVar.y();
                            return false;
                        }
                        eVar.getClass();
                        return false;
                    }
                });
                return alertDialogCreate;
            }
            LinearLayout linearLayout = linearLayoutArr[i13];
            TextView textView = (TextView) linearLayout.getChildAt(0);
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) linearLayout.getChildAt(1);
            TextView[] textViewArr = this.f31568t;
            textViewArr[i13] = textView;
            AppCompatCheckBox[] appCompatCheckBoxArr = this.f31569u;
            appCompatCheckBoxArr[i13] = appCompatCheckBox;
            textViewArr[i13].setText(getString(R.string.common_bit) + " " + i13);
            AppCompatCheckBox appCompatCheckBox2 = appCompatCheckBoxArr[i13];
            byte b10 = this.f31571w.f41190d.c(this.f31572x)[i13];
            byte b11 = this.f31571w.f41191e.c(this.f31572x)[i13];
            appCompatCheckBox2.setChecked(b11 == 1);
            H0.b.c(appCompatCheckBox2, ColorStateList.valueOf(b11 != b10 ? getResources().getColor(R.color.checkbox_green) : getResources().getColor(R.color.checkbox_blue)));
            if (!this.f31565A) {
                appCompatCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.d
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        e eVar = this.f31563b;
                        AppCompatCheckBox[] appCompatCheckBoxArr2 = eVar.f31569u;
                        int i14 = i13;
                        eVar.f31571w.f41191e.e(eVar.f31572x, i14, appCompatCheckBoxArr2[i14].isChecked() ? 1 : 0);
                        eVar.f31574z.f2209z.setText((CharSequence) eVar.f31571w.f41191e.d().get(eVar.f31572x));
                        eVar.B(eVar.f31572x);
                    }
                });
            }
            i13++;
        }
    }

    /* JADX INFO: compiled from: EepromCodingDialog.java */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            e eVar = e.this;
            String string = eVar.f31574z.f2209z.getText().toString();
            if (TextUtils.isEmpty(string) || !string.matches("^[0-9a-fA-F]+$")) {
                return;
            }
            eVar.f31571w.f41191e.f(eVar.f31572x, Integer.parseInt(string, 16));
            eVar.f31571w.notifyDataSetChanged();
            eVar.B(eVar.f31572x);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
