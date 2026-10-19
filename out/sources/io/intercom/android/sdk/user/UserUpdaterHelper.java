package io.intercom.android.sdk.user;

import io.intercom.android.sdk.IntercomStatusCallbackKt;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.HostAppState;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UserUpdaterHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UserUpdaterHelper {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final Provider<UserIdentity> userIdentityProvider;
    private final Provider<UserUpdater> userUpdaterProvider;

    public UserUpdaterHelper(Provider<UserUpdater> userUpdaterProvider, IntercomDataLayer dataLayer, Provider<UserIdentity> userIdentityProvider) {
        i.e(userUpdaterProvider, "userUpdaterProvider");
        i.e(dataLayer, "dataLayer");
        i.e(userIdentityProvider, "userIdentityProvider");
        this.userUpdaterProvider = userUpdaterProvider;
        this.dataLayer = dataLayer;
        this.userIdentityProvider = userIdentityProvider;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentityProvider.get();
    }

    public final UserUpdater getUserUpdater() {
        return this.userUpdaterProvider.get();
    }

    public final void update(long j) {
        HostAppState value = this.dataLayer.getHostAppState().getValue();
        if (j - value.getBackgroundedTimestamp() <= this.dataLayer.getConfig().getValue().getNewSessionThresholdMs() || !getUserIdentity().identityExists() || value.getSessionStartedSinceLastBackgrounded()) {
            return;
        }
        getUserUpdater().updateUser(UserUpdateRequest.create(true, value.isBackgrounded(), true), IntercomStatusCallbackKt.getNoStatusCallback());
    }
}
