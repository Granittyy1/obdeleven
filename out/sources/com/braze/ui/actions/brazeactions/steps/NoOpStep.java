package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NoOpStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NoOpStep implements IBrazeActionStep {
    public static final NoOpStep INSTANCE = new NoOpStep();

    private NoOpStep() {
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return false;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        i.e(context, "context");
        i.e(data, "data");
    }
}
