package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: RequestPushPermissionStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RequestPushPermissionStep extends BaseBrazeActionStep {
    public static final RequestPushPermissionStep INSTANCE = new RequestPushPermissionStep();

    private RequestPushPermissionStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return true;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        i.e(context, "context");
        i.e(data, "data");
        PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.Companion.getInstance().getActivity());
    }
}
