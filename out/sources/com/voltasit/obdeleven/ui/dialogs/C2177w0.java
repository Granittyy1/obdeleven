package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PreloaderDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2177w0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f34052s;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_preloader, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.preloader_content);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34052s = bundle;
        if (bundle == null) {
            textView.setText(R.string.common_loading);
        } else if (bundle.containsKey("key_message")) {
            textView.setText(this.f34052s.getString("key_message"));
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f34052s;
        if (bundle2 == null) {
            return;
        }
        bundle.putString("key_message", bundle2.getString("key_message"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.requestWindowFeature(1);
        return dialogR;
    }
}
