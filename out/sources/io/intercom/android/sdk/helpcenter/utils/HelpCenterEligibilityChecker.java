package io.intercom.android.sdk.helpcenter.utils;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: HelpCenterEligibilityChecker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterEligibilityChecker {
    public static final int $stable = 0;
    public static final HelpCenterEligibilityChecker INSTANCE = new HelpCenterEligibilityChecker();

    private HelpCenterEligibilityChecker() {
    }

    public final boolean isEligibleUser() {
        Twig logger = LumberMill.getLogger();
        UserIdentity userIdentity = Injector.get().getUserIdentity();
        if (userIdentity.identityExists() && !userIdentity.isSoftReset()) {
            return true;
        }
        logger.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayHelpCenter().", new Object[0]);
        return false;
    }
}
