package com.voltasit.obdeleven.ui.dialogs;

import android.content.DialogInterface;
import android.os.Bundle;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33816c;

    public /* synthetic */ J0(int i10, Object obj) {
        this.f33815b = i10;
        this.f33816c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f33815b) {
            case 0:
                K0 this$0 = (K0) this.f33816c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.w(this$0.C(), DialogCallback.CallbackType.f31102c, new Bundle());
                break;
            default:
                Ia.l onTryAgain = (Ia.l) this.f33816c;
                kotlin.jvm.internal.i.e(onTryAgain, "$onTryAgain");
                kotlin.jvm.internal.i.b(dialogInterface);
                onTryAgain.invoke(dialogInterface);
                break;
        }
    }
}
