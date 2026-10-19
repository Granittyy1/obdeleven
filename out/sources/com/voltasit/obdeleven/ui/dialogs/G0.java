package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import java.util.List;

/* JADX INFO: compiled from: SignInPreloader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 extends DialogInterfaceOnCancelListenerC1342g {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.dialog_preloader, viewGroup, false);
        kotlin.jvm.internal.i.d(viewInflate, "inflate(...)");
        ((TextView) viewInflate.findViewById(R.id.preloader_content)).setText(R.string.common_loading);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f17606m;
        kotlin.jvm.internal.i.b(dialog);
        if (dialog.getWindow() == null) {
            return;
        }
        if (!(getActivity() instanceof LoginActivity)) {
            throw new IllegalStateException("Dialog activity is null or not of type MainActivity");
        }
        ActivityC1347l activity = getActivity();
        kotlin.jvm.internal.i.c(activity, "null cannot be cast to non-null type com.voltasit.obdeleven.ui.activity.LoginActivity");
        LoginActivity loginActivity = (LoginActivity) activity;
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (!com.voltasit.obdeleven.a.C0320a.a(loginActivity).b("is_landscape", loginActivity.getResources().getBoolean(R.bool.is_tablet))) {
            Dialog dialog2 = this.f17606m;
            kotlin.jvm.internal.i.b(dialog2);
            Window window = dialog2.getWindow();
            kotlin.jvm.internal.i.b(window);
            window.setLayout(-1, -2);
            return;
        }
        Dialog dialog3 = this.f17606m;
        kotlin.jvm.internal.i.b(dialog3);
        Window window2 = dialog3.getWindow();
        kotlin.jvm.internal.i.b(window2);
        Context context = getContext();
        kotlin.jvm.internal.i.b(context);
        window2.setLayout(context.getResources().getDimensionPixelSize(R.dimen.default_dialog_width), -2);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.requestWindowFeature(1);
        return dialogR;
    }
}
