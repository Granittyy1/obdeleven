package com.voltasit.obdeleven.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: TryAgainDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class R0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f33840v;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33837s;
        if (bundle2 == null) {
            return;
        }
        bundle.putString("key_title", bundle2.getString("key_title"));
        bundle.putString("key_description", this.f33837s.getString("key_description"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33837s = bundle;
        if (bundle == null) {
            return new AlertDialog.Builder(getActivity()).create();
        }
        if (bundle.containsKey("key_title")) {
            this.f33838t = this.f33837s.getString("key_title");
        }
        if (this.f33837s.containsKey("key_description")) {
            this.f33839u = this.f33837s.getString("key_description");
        }
        if (this.f33837s.containsKey("key_tag")) {
            this.f33840v = this.f33837s.getString("key_tag");
        }
        return new AlertDialog.Builder(getActivity()).setTitle(this.f33838t).setMessage(this.f33839u).setPositiveButton(R.string.common_try_again, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.P0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                R0 r10 = this.f33834b;
                String str = r10.f33840v;
                if (str == null) {
                    str = "TryAgainDialog";
                }
                r10.w(str, DialogCallback.CallbackType.f31102c, new Bundle());
            }
        }).setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.Q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                R0 r10 = this.f33836b;
                String str = r10.f33840v;
                if (str == null) {
                    str = "TryAgainDialog";
                }
                r10.w(str, DialogCallback.CallbackType.f31101b, new Bundle());
            }
        }).create();
    }
}
