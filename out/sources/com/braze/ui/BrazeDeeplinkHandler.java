package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.n;

/* JADX INFO: compiled from: BrazeDeeplinkHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {
    private static volatile IBrazeDeeplinkHandler customHandler;
    public static final Companion Companion = new Companion(null);
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    /* JADX INFO: compiled from: BrazeDeeplinkHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final IBrazeDeeplinkHandler getInstance() {
            IBrazeDeeplinkHandler iBrazeDeeplinkHandler = BrazeDeeplinkHandler.customHandler;
            return iBrazeDeeplinkHandler == null ? BrazeDeeplinkHandler.defaultHandler : iBrazeDeeplinkHandler;
        }

        public final void setBrazeDeeplinkHandler(final IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler$Companion$setBrazeDeeplinkHandler$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Custom IBrazeDeeplinkHandler ".concat(iBrazeDeeplinkHandler == null ? "cleared" : "set");
                }
            }, 3, (Object) null);
            BrazeDeeplinkHandler.customHandler = iBrazeDeeplinkHandler;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: BrazeDeeplinkHandler.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final IBrazeDeeplinkHandler getInstance() {
        return Companion.getInstance();
    }

    public static final void setBrazeDeeplinkHandler(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
        Companion.setBrazeDeeplinkHandler(iBrazeDeeplinkHandler);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z10, Channel channel) {
        kotlin.jvm.internal.i.e(uri, "uri");
        kotlin.jvm.internal.i.e(channel, "channel");
        return new UriAction(uri, bundle, z10, channel);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUrlString(String url, Bundle bundle, boolean z10, Channel channel) {
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(channel, "channel");
        UriAction uriActionCreateUriActionFromUri = null;
        try {
            if (n.S(url)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler.createUriActionFromUrlString.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "createUriActionFromUrlString url was null. Returning null.";
                    }
                }, 2, (Object) null);
            } else {
                Uri uri = Uri.parse(url);
                kotlin.jvm.internal.i.d(uri, "uri");
                uriActionCreateUriActionFromUri = createUriActionFromUri(uri, bundle, z10, channel);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new Ia.a<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler.createUriActionFromUrlString.2
                @Override // Ia.a
                public final String invoke() {
                    return "createUriActionFromUrlString failed. Returning null.";
                }
            });
        }
        return uriActionCreateUriActionFromUri;
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public int getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose) {
        kotlin.jvm.internal.i.e(intentFlagPurpose, "intentFlagPurpose");
        switch (WhenMappings.$EnumSwitchMapping$0[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return 1073741824;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(newsfeedAction, "newsfeedAction");
        newsfeedAction.execute(context);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoUri(Context context, UriAction uriAction) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(uriAction, "uriAction");
        uriAction.execute(context);
    }
}
