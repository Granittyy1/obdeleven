package com.voltasit.obdeleven.presentation.deviceupdate;

import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagFirmwareRedirect;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: VagFirmwareRedirectDialogFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VagFirmwareRedirectDialogFragment$showTask$1 extends Lambda implements Ia.a<r> {
    final /* synthetic */ MainActivity $activity;
    final /* synthetic */ J8.a $analyticsProvider;
    final /* synthetic */ TaskCompletionSource<Boolean> $completionSource;
    final /* synthetic */ VagFirmwareRedirectDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VagFirmwareRedirectDialogFragment$showTask$1(J8.a aVar, MainActivity mainActivity, VagFirmwareRedirectDialogFragment vagFirmwareRedirectDialogFragment, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(0);
        this.$analyticsProvider = aVar;
        this.$activity = mainActivity;
        this.this$0 = vagFirmwareRedirectDialogFragment;
        this.$completionSource = taskCompletionSource;
    }

    @Override // Ia.a
    public final r invoke() {
        this.$analyticsProvider.C(AnalyticsProvider$EventParamValue$VagFirmwareRedirect.RedirectToMain);
        com.voltasit.obdeleven.ui.activity.a.a(this.$activity);
        VagFirmwareRedirectDialogFragment vagFirmwareRedirectDialogFragment = this.this$0;
        TaskCompletionSource<Boolean> taskCompletionSource = this.$completionSource;
        vagFirmwareRedirectDialogFragment.getClass();
        taskCompletionSource.trySetResult(Boolean.FALSE);
        vagFirmwareRedirectDialogFragment.o();
        return r.f47939a;
    }
}
