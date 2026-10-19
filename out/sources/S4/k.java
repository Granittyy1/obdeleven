package S4;

import U4.C0804l;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AlertDialog f5546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DialogInterface.OnCancelListener f5547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AlertDialog f5548t;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5547s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        AlertDialog alertDialog = this.f5546r;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f17603i = false;
        if (this.f5548t == null) {
            Context context = getContext();
            C0804l.h(context);
            this.f5548t = new AlertDialog.Builder(context).create();
        }
        return this.f5548t;
    }
}
