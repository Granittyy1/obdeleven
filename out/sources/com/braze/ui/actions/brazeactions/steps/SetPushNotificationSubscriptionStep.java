package com.braze.ui.actions.brazeactions.steps;

import Ia.a;
import Ia.l;
import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: SetPushNotificationSubscriptionStep.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SetPushNotificationSubscriptionStep extends BaseBrazeActionStep {
    public static final SetPushNotificationSubscriptionStep INSTANCE;
    private static final String TAG;

    static {
        SetPushNotificationSubscriptionStep setPushNotificationSubscriptionStep = new SetPushNotificationSubscriptionStep();
        INSTANCE = setPushNotificationSubscriptionStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setPushNotificationSubscriptionStep);
    }

    private SetPushNotificationSubscriptionStep() {
        super(null);
    }

    public final String getTAG() {
        return TAG;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        i.e(data, "data");
        return StepData.isArgCountInBounds$default(data, 1, null, 2, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, final StepData data) {
        i.e(context, "context");
        i.e(data, "data");
        final NotificationSubscriptionType notificationSubscriptionTypeFromValue = NotificationSubscriptionType.Companion.fromValue(String.valueOf(data.getFirstArg()));
        if (notificationSubscriptionTypeFromValue == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep.run.1
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Could not parse subscription type from data " + data;
                }
            }, 3, (Object) null);
        } else {
            BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new l<BrazeUser, r>() { // from class: com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep.run.2
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
                    it.setPushNotificationSubscriptionType(notificationSubscriptionTypeFromValue);
                }
            });
        }
    }
}
