package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: ItemListMultiChoiceDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class Q extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B8.B f33835s;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String[] stringArray;
        this.f33835s = (B8.B) M0.e.a(layoutInflater, R.layout.dialog_fragment_recycler_list, viewGroup, false, null);
        this.f17606m.getWindow().requestFeature(1);
        final p110i9.n nVar = new p110i9.n(getContext());
        nVar.f36815e = new ArrayList<>();
        getContext();
        this.f33835s.f1611r.setLayoutManager(new LinearLayoutManager(1));
        this.f33835s.t(nVar);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle.containsKey("item_array") && (stringArray = bundle.getStringArray("item_array")) != null) {
            nVar.d(Arrays.asList(stringArray));
        }
        if (bundle.containsKey("key_title")) {
            this.f33835s.f1615v.setText(bundle.getInt("key_title"));
        }
        if (bundle.containsKey("key_positive_text")) {
            this.f33835s.f1614u.setText(bundle.getInt("key_positive_text"));
        }
        if (bundle.containsKey("key_negative_text")) {
            this.f33835s.f1612s.setText(bundle.getInt("key_negative_text"));
        }
        if (bundle.containsKey("key_neutral_text")) {
            this.f33835s.f1613t.setText(bundle.getInt("key_neutral_text"));
        }
        this.f33835s.f1612s.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33826b.y();
            }
        });
        this.f33835s.f1613t.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q q10 = this.f33829b;
                boolean zEquals = q10.f33835s.f1613t.getText().equals(q10.getString(R.string.common_select_all));
                p110i9.n nVar2 = nVar;
                if (zEquals) {
                    nVar2.f36814d = true;
                    nVar2.notifyItemRangeChanged(0, nVar2.f36779a.size());
                    q10.f33835s.f1613t.setText(R.string.common_clear_all);
                } else {
                    nVar2.f36814d = false;
                    nVar2.notifyItemRangeChanged(0, nVar2.f36779a.size());
                    q10.f33835s.f1613t.setText(R.string.common_select_all);
                }
            }
        });
        this.f33835s.f1614u.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q q10 = this.f33832b;
                q10.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putIntegerArrayList("key_which_selections", nVar.f36815e);
                q10.w("ItemListMultiChoiceDialog", DialogCallback.CallbackType.f31102c, bundle2);
            }
        });
        return this.f33835s.f4488d;
    }
}
