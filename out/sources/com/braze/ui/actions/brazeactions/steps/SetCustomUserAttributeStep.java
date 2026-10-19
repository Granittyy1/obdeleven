package com.braze.ui.actions.brazeactions.steps;

import Ia.l;
import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: SetCustomUserAttributeStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SetCustomUserAttributeStep extends BaseBrazeActionStep {
    public static final SetCustomUserAttributeStep INSTANCE;
    private static final String TAG;

    static {
        SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep();
        INSTANCE = setCustomUserAttributeStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setCustomUserAttributeStep);
    }

    private SetCustomUserAttributeStep() {
        super(null);
    }

    public final String getTAG() {
        return TAG;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return StepData.isArgCountInBounds$default(data, 2, null, 2, null) && data.isArgString(0) && data.getSecondArg() != null;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, final StepData data) {
        i.e(context, "context");
        i.e(data, "data");
        final Object secondArg = data.getSecondArg();
        if (secondArg == null) {
            return;
        }
        BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new l<BrazeUser, r>() { // from class: com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep.run.1
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
                BrazeUser.setCustomAttribute$default(it, String.valueOf(data.getFirstArg()), secondArg, false, 4, null);
            }
        });
    }
}
