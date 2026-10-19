package com.voltasit.obdeleven.presentation.signIn;

import G8.r;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC1347l;
import com.voltasit.obdeleven.ui.activity.LoginActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33260c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f33259b = i10;
        this.f33260c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f33259b) {
            case 0:
                TwoFactorLoginFragment this$0 = (TwoFactorLoginFragment) this.f33260c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ActivityC1347l activity = this$0.getActivity();
                LoginActivity loginActivity = activity instanceof LoginActivity ? (LoginActivity) activity : null;
                if (loginActivity != null) {
                    r rVar = this$0.o().f33262o;
                    loginActivity.j(rVar instanceof r.a ? ((r.a) rVar).f3531b : "", true);
                    break;
                }
                break;
            default:
                Ia.l onCancel = (Ia.l) this.f33260c;
                kotlin.jvm.internal.i.e(onCancel, "$onCancel");
                kotlin.jvm.internal.i.b(dialogInterface);
                onCancel.invoke(dialogInterface);
                break;
        }
    }
}
