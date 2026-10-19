package com.voltasit.obdeleven.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PermissionTryAgainDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2175v0 extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f34050r;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.v0$a */
    /* JADX INFO: compiled from: PermissionTryAgainDialog.kt */
    public interface a {
        void h(DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g);

        void i(DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        super.onAttach(context);
        try {
            this.f34050r = (a) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement NoticeDialogListener");
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        AlertDialog alertDialogCreate;
        ActivityC1347l activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(activity.getString(R.string.common_connection_failed)).setCancelable(false).setMessage(activity.getString(R.string.common_check_network_connection_and_try_again)).setPositiveButton(activity.getString(R.string.common_try_again), new com.facebook.login.j(this, 2)).setNegativeButton(activity.getString(R.string.common_exit), new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.u0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C2175v0 this$0 = this.f34030b;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    C2175v0.a aVar = this$0.f34050r;
                    if (aVar != null) {
                        aVar.h(this$0);
                    } else {
                        kotlin.jvm.internal.i.m("listener");
                        throw null;
                    }
                }
            });
            alertDialogCreate = builder.create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
        } else {
            alertDialogCreate = null;
        }
        if (alertDialogCreate != null) {
            return alertDialogCreate;
        }
        throw new IllegalStateException("Activity cannot be null");
    }
}
