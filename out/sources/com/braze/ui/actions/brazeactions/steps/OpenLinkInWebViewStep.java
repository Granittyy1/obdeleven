package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OpenLinkInWebViewStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OpenLinkInWebViewStep extends BaseBrazeActionStep {
    public static final OpenLinkInWebViewStep INSTANCE = new OpenLinkInWebViewStep();

    private OpenLinkInWebViewStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return StepData.isArgCountInBounds$default(data, 1, null, 2, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        i.e(context, "context");
        i.e(data, "data");
        String strValueOf = String.valueOf(data.getFirstArg());
        IBrazeDeeplinkHandler companion = BrazeDeeplinkHandler.Companion.getInstance();
        UriAction uriActionCreateUriActionFromUrlString = companion.createUriActionFromUrlString(strValueOf, null, true, data.getChannel());
        if (uriActionCreateUriActionFromUrlString != null) {
            companion.gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }
}
