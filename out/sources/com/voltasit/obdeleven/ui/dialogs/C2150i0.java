package com.voltasit.obdeleven.ui.dialogs;

import B8.s1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: MultiChoiceDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2150i0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p110i9.l f33974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s1 f33975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f33976v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<String> f33977w;

    public final void B() {
        Bundle bundle = this.f33973s;
        if (bundle == null || !bundle.containsKey("items")) {
            return;
        }
        this.f33977w = this.f33973s.getStringArrayList("items");
        D().d(this.f33977w);
        this.f33975u.t(D());
    }

    public void C() {
        this.f33975u.f2140r.addTextChangedListener(new a());
    }

    public p110i9.l D() {
        if (getContext() == null) {
            y();
        }
        if (this.f33974t == null) {
            this.f33974t = new p110i9.l(getContext());
        }
        return this.f33974t;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s1 s1Var = (s1) M0.e.a(layoutInflater, R.layout.list_dialog, null, false, null);
        this.f33975u = s1Var;
        s1Var.f2142t.setText(R.string.common_ok);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33973s = bundle;
        B();
        Bundle bundle2 = this.f33973s;
        if (bundle2 != null && bundle2.containsKey("key_selected_items") && this.f33973s.getStringArrayList("key_selected_items") != null) {
            p110i9.l lVarD = D();
            ArrayList<String> stringArrayList = this.f33973s.getStringArrayList("key_selected_items");
            for (T t8 : lVarD.f36779a) {
                if (stringArrayList.contains(t8)) {
                    lVarD.f36809d.add(t8);
                }
            }
        }
        C();
        this.f33975u.f2142t.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.h(this, 1));
        this.f33975u.f2141s.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.i(3, this));
        if (D().f36809d.size() > 1) {
            this.f33975u.f2141s.setText(R.string.common_clear_all);
        } else {
            this.f33975u.f2141s.setText(R.string.common_select_all);
        }
        return this.f33975u.f4488d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33973s;
        if (bundle2 == null) {
            return;
        }
        bundle.putStringArrayList("items", bundle2.getStringArrayList("items"));
        bundle.putStringArrayList("key_selected_items", this.f33973s.getStringArrayList("key_selected_items"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.h0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                C2150i0 c2150i0 = this.f33969b;
                c2150i0.getClass();
                if (i10 != 4) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("items", c2150i0.D().f36809d);
                c2150i0.w("MultiChoiceDialog", DialogCallback.CallbackType.f31101b, bundle2);
                c2150i0.y();
                return false;
            }
        });
        return dialogR;
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.i0$a */
    /* JADX INFO: compiled from: MultiChoiceDialog.java */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String strValueOf = String.valueOf(charSequence);
            C2150i0 c2150i0 = C2150i0.this;
            c2150i0.f33976v.clear();
            p110i9.l lVarD = c2150i0.D();
            int size = lVarD.f36779a.size();
            lVarD.f36779a.clear();
            lVarD.notifyItemRangeRemoved(0, size);
            c2150i0.D().notifyDataSetChanged();
            for (String str : c2150i0.f33977w) {
                if (str.toLowerCase().contains(strValueOf.toLowerCase())) {
                    c2150i0.f33976v.add(str);
                    c2150i0.D().d(c2150i0.f33976v);
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
