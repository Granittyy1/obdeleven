package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.voltasit.obdeleven.R;
import java.util.Arrays;

/* JADX INFO: compiled from: ItemListSingleChoiceDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class T extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f33843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f33844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bundle f33845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p110i9.t f33846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B8.B f33847w;

    public void B() {
        this.f33847w.f1614u.setOnClickListener(new com.voltasit.obdeleven.presentation.b(1, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String[] stringArray;
        this.f33847w = (B8.B) M0.e.a(layoutInflater, R.layout.dialog_fragment_recycler_list, viewGroup, false, null);
        this.f17606m.getWindow().requestFeature(1);
        p110i9.t tVar = new p110i9.t(getContext());
        tVar.f36831e = true;
        this.f33846v = tVar;
        getContext();
        this.f33847w.f1611r.setLayoutManager(new LinearLayoutManager(1));
        this.f33847w.t(this.f33846v);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33845u = bundle;
        if (bundle.containsKey("item_array") && (stringArray = this.f33845u.getStringArray("item_array")) != null) {
            this.f33846v.d(Arrays.asList(stringArray));
        }
        if (this.f33845u.containsKey("key_enabled")) {
            this.f33846v.f36831e = this.f33845u.getBoolean("key_enabled");
        }
        if (this.f33845u.containsKey("key_title")) {
            this.f33847w.f1615v.setText(this.f33845u.getInt("key_title"));
        } else if (this.f33845u.containsKey("key_string_title")) {
            this.f33847w.f1615v.setText(this.f33845u.getString("key_string_title"));
        }
        if (this.f33845u.containsKey("key_positive_text")) {
            this.f33847w.f1614u.setText(this.f33845u.getInt("key_positive_text"));
        }
        if (this.f33845u.containsKey("key_negative_text")) {
            this.f33847w.f1612s.setText(this.f33845u.getInt("key_negative_text"));
        }
        if (this.f33845u.containsKey("key_neutral_text")) {
            this.f33847w.f1613t.setText(this.f33845u.getInt("key_neutral_text"));
        }
        if (this.f33845u.containsKey("key_tag")) {
            this.f33843s = this.f33845u.getString("key_tag");
        }
        if (this.f33845u.containsKey("key_checked_position")) {
            this.f33846v.f36830d = this.f33845u.getInt("key_checked_position");
        }
        if (this.f33845u.containsKey("key_bundle")) {
            this.f33844t = this.f33845u.getBundle("key_bundle");
        }
        B();
        this.f33847w.f1612s.setOnClickListener(new ViewOnClickListenerC2163p(1, this));
        this.f33847w.f1613t.setOnClickListener(new com.braze.ui.inappmessage.d(1, this));
        return this.f33847w.f4488d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33845u;
        if (bundle2 == null) {
            return;
        }
        if (bundle2.containsKey("key_id")) {
            bundle.putInt("key_id", this.f33845u.getInt("key_id"));
        }
        if (this.f33845u.containsKey("key_title")) {
            bundle.putInt("key_title", this.f33845u.getInt("key_title"));
        }
        if (this.f33845u.containsKey("key_positive_text")) {
            bundle.putInt("key_positive_text", this.f33845u.getInt("key_positive_text"));
        }
        if (this.f33845u.containsKey("key_negative_text")) {
            bundle.putInt("key_negative_text", this.f33845u.getInt("key_negative_text"));
        }
        if (this.f33845u.containsKey("key_neutral_text")) {
            bundle.putInt("key_neutral_text", this.f33845u.getInt("key_neutral_text"));
        }
        if (this.f33845u.containsKey("key_checked_position")) {
            bundle.putInt("key_checked_position", this.f33845u.getInt("key_checked_position"));
        }
        if (this.f33845u.containsKey("key_tag")) {
            bundle.putString("key_tag", this.f33845u.getString("key_tag"));
        }
        if (this.f33845u.containsKey("key_bundle")) {
            bundle.putBundle("key_bundle", this.f33845u.getBundle("key_bundle"));
        }
        if (this.f33845u.containsKey("item_array")) {
            bundle.putStringArray("item_array", this.f33845u.getStringArray("item_array"));
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.S
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                T t8 = this.f33841b;
                if (i10 == 4) {
                    t8.y();
                    return false;
                }
                t8.getClass();
                return false;
            }
        });
        return dialogR;
    }
}
