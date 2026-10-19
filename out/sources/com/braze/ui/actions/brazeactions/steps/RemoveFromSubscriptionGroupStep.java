package com.braze.ui.actions.brazeactions.steps;

import Ia.l;
import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: RemoveFromSubscriptionGroupStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RemoveFromSubscriptionGroupStep extends BaseBrazeActionStep {
    public static final RemoveFromSubscriptionGroupStep INSTANCE = new RemoveFromSubscriptionGroupStep();

    private RemoveFromSubscriptionGroupStep() {
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
        final String strValueOf = String.valueOf(data.getFirstArg());
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new l<BrazeUser, r>() { // from class: com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep.run.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ r invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                i.e(it, "it");
                it.removeFromSubscriptionGroup(strValueOf);
            }
        });
    }
}
