package com.braze.ui.actions.brazeactions.steps;

import Ia.a;
import Ia.l;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BaseBrazeActionStep.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseBrazeActionStep implements IBrazeActionStep {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: BaseBrazeActionStep.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final void runOnUser$android_sdk_ui_release(Braze braze, final l<? super BrazeUser, r> block) {
            i.e(braze, "<this>");
            i.e(block, "block");
            braze.getCurrentUser(new IValueCallback<BrazeUser>() { // from class: com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1
                @Override // com.braze.events.IValueCallback
                public void onError() {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1$onError$1
                        @Override // Ia.a
                        public final String invoke() {
                            return "Failed to run on Braze user object";
                        }
                    }, 3, (Object) null);
                }

                @Override // com.braze.events.IValueCallback
                public void onSuccess(BrazeUser value) {
                    i.e(value, "value");
                    block.invoke(value);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ BaseBrazeActionStep(e eVar) {
        this();
    }

    private BaseBrazeActionStep() {
    }
}
