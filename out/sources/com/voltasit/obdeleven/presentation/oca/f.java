package com.voltasit.obdeleven.presentation.oca;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.M;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f32691c;

    public /* synthetic */ f(Fragment fragment, int i10) {
        this.f32690b = i10;
        this.f32691c = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32690b) {
            case 0:
                MainActivity mainActivityQ = ((AppFragment) this.f32691c).q();
                P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_hold_to_write));
                break;
            case 1:
                com.voltasit.obdeleven.presentation.vagpromo.c this$0 = (com.voltasit.obdeleven.presentation.vagpromo.c) this.f32691c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Ia.a<r> aVar = this$0.f33366r;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                M m7 = (M) this.f32691c;
                m7.w(m7.f33822t.isEmpty() ? "InputDialog" : m7.f33822t, DialogCallback.CallbackType.f31101b, new Bundle());
                break;
        }
    }
}
