package com.voltasit.obdeleven.ui.dialogs;

import android.content.DialogInterface;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.Application;
import java.util.Arrays;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC2135b implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33906c;

    public /* synthetic */ DialogInterfaceOnCancelListenerC2135b(int i10, Object obj) {
        this.f33905b = i10;
        this.f33906c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Object obj = this.f33906c;
        switch (this.f33905b) {
            case 0:
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "AlertDialog", "onCancel()", Arrays.copyOf(new Object[0], 0));
                ((TaskCompletionSource) obj).setResult(Boolean.FALSE);
                break;
            case 1:
                ((TaskCompletionSource) obj).setResult(-1);
                break;
            default:
                p165n4.v this$0 = (p165n4.v) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.cancel();
                break;
        }
    }
}
