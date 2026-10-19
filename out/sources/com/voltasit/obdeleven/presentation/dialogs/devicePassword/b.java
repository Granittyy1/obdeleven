package com.voltasit.obdeleven.presentation.dialogs.devicePassword;

import Ia.l;
import android.view.View;
import com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f32249c;

    public /* synthetic */ b(View.OnCreateContextMenuListener onCreateContextMenuListener, int i10) {
        this.f32248b = i10;
        this.f32249c = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32248b) {
            case 0:
                c this$0 = (c) this.f32249c;
                i.e(this$0, "this$0");
                l<? super Boolean, r> lVar = this$0.f32254f;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
                this$0.dismiss();
                break;
            default:
                TwoFactorAuthSetupFragment this$1 = (TwoFactorAuthSetupFragment) this.f32249c;
                i.e(this$1, "this$0");
                this$1.O();
                break;
        }
    }
}
