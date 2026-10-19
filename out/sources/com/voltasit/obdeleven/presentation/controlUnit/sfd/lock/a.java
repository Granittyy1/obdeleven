package com.voltasit.obdeleven.presentation.controlUnit.sfd.lock;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.presentation.dialogs.autocode.AutocodeWarningDialog;
import com.voltasit.obdeleven.presentation.models.FragmentResult;
import kotlin.Pair;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1342g f31881c;

    public /* synthetic */ a(DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g, int i10) {
        this.f31880b = i10;
        this.f31881c = dialogInterfaceOnCancelListenerC1342g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f31880b) {
            case 0:
                LockSfdDialog this$0 = (LockSfdDialog) this.f31881c;
                i.e(this$0, "this$0");
                H3.c.l(this$0, "LockSfdDialog", p271w0.c.a());
                break;
            default:
                AutocodeWarningDialog this$1 = (AutocodeWarningDialog) this.f31881c;
                i.e(this$1, "this$0");
                H3.c.l(this$1, "AutocodeWarningDialog", p271w0.c.b(new Pair("key_result", FragmentResult.OnNegative.a())));
                this$1.p(false, false);
                break;
        }
    }
}
