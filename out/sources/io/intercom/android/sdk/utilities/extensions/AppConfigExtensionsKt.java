package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.identity.AppConfig;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AppConfigExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppConfigExtensionsKt {
    public static final boolean canStartNewConversation(AppConfig appConfig) {
        i.e(appConfig, "<this>");
        boolean zIsInboundMessages = appConfig.isInboundMessages();
        if (appConfig.isPreventMultipleInboundConversationsEnabled()) {
            return zIsInboundMessages && !appConfig.getHasOpenConversations();
        }
        return zIsInboundMessages;
    }
}
