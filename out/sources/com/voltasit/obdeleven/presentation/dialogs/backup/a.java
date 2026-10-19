package com.voltasit.obdeleven.presentation.dialogs.backup;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Window;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.ViewOnClickListenerC2131e;
import com.voltasit.obdeleven.presentation.controlUnit.ViewOnClickListenerC2132f;
import com.voltasit.obdeleven.presentation.controlUnit.k;
import com.voltasit.obdeleven.ui.dialogs.B;
import kotlin.jvm.internal.i;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32180c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f32179b = i10;
        this.f32180c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32179b) {
            case 0:
                MultiBackupDialog this$0 = (MultiBackupDialog) this.f32180c;
                i.e(this$0, "this$0");
                AlertDialog alertDialog = (AlertDialog) this$0.f17606m;
                if (alertDialog != null) {
                    alertDialog.getButton(-1).setOnClickListener(new ViewOnClickListenerC2132f(this$0, 1));
                    alertDialog.getButton(-2).setOnClickListener(new ViewOnClickListenerC2131e(this$0, 1));
                    alertDialog.getButton(-3).setVisibility(8);
                    this$0.f33988w.getButton(-1).setEnabled(false);
                    a2 a2Var = this$0.f32171A;
                    i.b(a2Var);
                    O.e.j("Vehicle", "getReachableControlUnits()");
                    a2Var.c(false).continueWith(new k(3, a2Var)).continueWith(new f(this$0), Task.BACKGROUND_EXECUTOR).continueWith(new g(this$0), Task.UI_THREAD_EXECUTOR);
                    Window window = this$0.f33988w.getWindow();
                    if (window != null) {
                        window.setSoftInputMode(16);
                    }
                    this$0.E(0);
                } else {
                    O.e.m(new Exception("On show listener has no dialog"));
                }
                break;
            default:
                B b10 = (B) this.f32180c;
                MaterialDialog materialDialog = b10.f33735d;
                b10.f33739h = (Spinner) materialDialog.f34552b.findViewById(R.id.dialogDeveloperInput_spinner);
                b10.f33740i = (RecyclerView) materialDialog.f34552b.findViewById(R.id.dialogDeveloperInput_viewLayout);
                b10.j = (TextView) materialDialog.f34552b.findViewById(R.id.dialogDeveloperInput_empty);
                b10.f33742l = materialDialog.c(DialogAction.f23185c);
                b10.f33739h.setAdapter((SpinnerAdapter) b10.f33736e);
                b10.d();
                break;
        }
    }
}
