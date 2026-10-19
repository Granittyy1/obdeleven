package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import G8.r;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.ui.dialogs.E;
import com.voltasit.obdeleven.ui.dialogs.M0;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f33318c;

    public /* synthetic */ a(Fragment fragment, int i10) {
        this.f33317b = i10;
        this.f33318c = fragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f33317b) {
            case 0:
                LoginTwoFactorBackupCodeFragment this$0 = (LoginTwoFactorBackupCodeFragment) this.f33318c;
                i.e(this$0, "this$0");
                ActivityC1347l activity = this$0.getActivity();
                LoginActivity loginActivity = activity instanceof LoginActivity ? (LoginActivity) activity : null;
                if (loginActivity != null) {
                    r rVar = this$0.o().f33324y;
                    loginActivity.j(rVar instanceof r.a ? ((r.a) rVar).f3531b : "", true);
                    break;
                }
                break;
            case 1:
                E e10 = (E) this.f33318c;
                e10.getClass();
                e10.w("EditTextDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                M0 this$1 = (M0) this.f33318c;
                i.e(this$1, "this$0");
                this$1.B();
                break;
        }
    }
}
