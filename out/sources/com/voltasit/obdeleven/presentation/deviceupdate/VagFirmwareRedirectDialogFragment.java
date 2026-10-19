package com.voltasit.obdeleven.presentation.deviceupdate;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.C1293h;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.b0;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import p100i.n;
import p293xa.r;

/* JADX INFO: compiled from: VagFirmwareRedirectDialogFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VagFirmwareRedirectDialogFragment extends n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.a<r> f32157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Ia.a<r> f32158s;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.dialog_vag_firmware_redirect, viewGroup, false);
        i.d(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.f17606m;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        b0.a(window, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        C1293h c1293h = new C1293h(7);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(view, c1293h);
        O.c.c(view);
        ((TextView) view.findViewById(R.id.vagFirmwareRedirect_title)).setText(R.string.vag_firmware_redirect_title);
        ((TextView) view.findViewById(R.id.vagFirmwareRedirect_message)).setText(R.string.vag_firmware_redirect_subtitle);
        Button button = (Button) view.findViewById(R.id.vagFirmwareRedirect_switchApp);
        button.setText(R.string.vag_firmware_redirect_cta);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.deviceupdate.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VagFirmwareRedirectDialogFragment this$0 = this.f32161b;
                i.e(this$0, "this$0");
                Ia.a<r> aVar = this$0.f32157r;
                if (aVar != null) {
                    ((VagFirmwareRedirectDialogFragment$showTask$1) aVar).invoke();
                }
            }
        });
        Button button2 = (Button) view.findViewById(R.id.vagFirmwareRedirect_notNow);
        button2.setText(R.string.vag_pro_redirect_not_now);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.deviceupdate.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VagFirmwareRedirectDialogFragment this$0 = this.f32162b;
                i.e(this$0, "this$0");
                Ia.a<r> aVar = this$0.f32158s;
                if (aVar != null) {
                    ((VagFirmwareRedirectDialogFragment$showTask$2) aVar).invoke();
                }
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final int q() {
        return R.style.AppTheme_FullScreenDialog;
    }

    public final Task<Boolean> w(MainActivity activity, J8.a analyticsProvider) {
        i.e(activity, "activity");
        i.e(analyticsProvider, "analyticsProvider");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f32157r = new VagFirmwareRedirectDialogFragment$showTask$1(analyticsProvider, activity, this, taskCompletionSource);
        this.f32158s = new VagFirmwareRedirectDialogFragment$showTask$2(analyticsProvider, this, taskCompletionSource);
        v(activity.getSupportFragmentManager(), "VagFirmwareRedirectDialogFragment");
        Task<Boolean> task = taskCompletionSource.getTask();
        i.d(task, "getTask(...)");
        return task;
    }
}
