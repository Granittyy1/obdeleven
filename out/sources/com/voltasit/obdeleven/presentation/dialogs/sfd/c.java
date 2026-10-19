package com.voltasit.obdeleven.presentation.dialogs.sfd;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.ui.dialogs.C2171t0;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1342g f32270c;

    public /* synthetic */ c(DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g, int i10) {
        this.f32269b = i10;
        this.f32270c = dialogInterfaceOnCancelListenerC1342g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f32269b) {
            case 0:
                SfdAutoUnlockDialog this$0 = (SfdAutoUnlockDialog) this.f32270c;
                i.e(this$0, "this$0");
                this$0.p(false, false);
                break;
            default:
                ((C2171t0) this.f32270c).y();
                break;
        }
    }
}
