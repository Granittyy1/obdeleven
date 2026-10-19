package S4;

import U4.C0804l;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: S4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogFragmentC0761c extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlertDialog f5531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f5532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlertDialog f5533d;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5532c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f5531b;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f5533d == null) {
            Activity activity = getActivity();
            C0804l.h(activity);
            this.f5533d = new AlertDialog.Builder(activity).create();
        }
        return this.f5533d;
    }
}
