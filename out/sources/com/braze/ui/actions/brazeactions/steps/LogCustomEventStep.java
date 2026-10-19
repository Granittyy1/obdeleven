package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: LogCustomEventStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LogCustomEventStep extends BaseBrazeActionStep {
    public static final LogCustomEventStep INSTANCE = new LogCustomEventStep();

    private LogCustomEventStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return StepData.isArgCountInBounds$default(data, 0, new Na.i(1, 2, 1), 1, null) && data.isArgString(0) && data.isArgOptionalJsonObject(1);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        i.e(context, "context");
        i.e(data, "data");
        Braze.Companion.getInstance(context).logCustomEvent(String.valueOf(data.getFirstArg()), data.coerceArgToPropertiesOrNull(1));
    }
}
