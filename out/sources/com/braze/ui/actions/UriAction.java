package com.braze.ui.actions;

import B7.b;
import Ia.a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: UriAction.kt */
/* JADX INFO: loaded from: classes.dex */
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z10, Channel channel) {
        i.e(uri, "uri");
        i.e(channel, "channel");
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z10;
        this.channel = channel;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        i.e(context, "context");
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.execute.1
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Not executing local Uri: " + UriAction.this.getUri();
                }
            }, 3, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.execute.2
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Executing BrazeActions uri:\n'" + UriAction.this.getUri() + '\'';
                }
            }, 2, (Object) null);
            brazeActionParser.execute(context, this.uri, getChannel());
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.execute.3
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Executing Uri action from channel " + UriAction.this.getChannel() + ": " + UriAction.this.getUri() + ". UseWebView: " + UriAction.this.getUseWebView() + ". Extras: " + UriAction.this.getExtras();
            }
        }, 3, (Object) null);
        if (this.useWebView && q.J(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            if (getChannel() == Channel.PUSH) {
                openUriWithWebViewActivityFromPush(context, this.uri, this.extras);
                return;
            } else {
                openUriWithWebViewActivity(context, this.uri, this.extras);
                return;
            }
        }
        if (getChannel() == Channel.PUSH) {
            openUriWithActionViewFromPush(context, this.uri, this.extras);
        } else {
            openUriWithActionView(context, this.uri, this.extras);
        }
    }

    public final Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) {
        i.e(context, "context");
        i.e(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent, 0);
        i.d(listQueryIntentActivities, "if (Build.VERSION.SDK_IN…ties(intent, 0)\n        }");
        if (listQueryIntentActivities.size() > 1) {
            for (final ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (i.a(resolveInfo.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.getActionViewIntent.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final String invoke() {
                            return b.g(new StringBuilder("Setting deep link intent package to "), resolveInfo.activityInfo.packageName, '.');
                        }
                    }, 3, (Object) null);
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    @Override // com.braze.ui.actions.IAction
    public Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle bundle, Intent targetIntent, BrazeConfigurationProvider configurationProvider) {
        i.e(context, "context");
        i.e(targetIntent, "targetIntent");
        i.e(configurationProvider, "configurationProvider");
        Intent mainActivityIntent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            final String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || n.S(pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Adding main activity intent to back stack while opening uri from push";
                    }
                }, 2, (Object) null);
                mainActivityIntent = UriUtils.getMainActivityIntent(context, bundle);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Adding custom back stack activity while opening uri from push: " + pushDeepLinkBackStackActivityClassName;
                    }
                }, 2, (Object) null);
                if (bundle != null) {
                    mainActivityIntent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Not adding unregistered activity to the back stack while opening uri from push: " + pushDeepLinkBackStackActivityClassName;
                    }
                }, 2, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.5
                @Override // Ia.a
                public final String invoke() {
                    return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
                }
            }, 2, (Object) null);
        }
        if (mainActivityIntent != null) {
            return new Intent[]{mainActivityIntent, targetIntent};
        }
        targetIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{targetIntent};
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseWebView() {
        return this.useWebView;
    }

    public final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent;
        i.e(context, "context");
        i.e(uri, "uri");
        final String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || n.S(customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.actions.UriAction$getWebViewActivityIntent$webViewActivityIntent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Launching custom WebView Activity with class name: " + customHtmlWebViewActivityClassName;
                }
            }, 3, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            i.d(intent, "customWebViewActivityCla…ivityClassName)\n        }");
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra(Constants.BRAZE_WEBVIEW_URL_EXTRA, uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, final Uri uri, final Bundle bundle) {
        i.e(context, "context");
        i.e(uri, "uri");
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithActionView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to handle uri " + uri + " with extras: " + bundle;
                }
            });
        }
    }

    public final void openUriWithActionViewFromPush(Context context, final Uri uri, Bundle bundle) {
        i.e(context, "context");
        i.e(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getActionViewIntent(context, uri, bundle), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (ActivityNotFoundException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new a<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithActionViewFromPush.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Could not find appropriate activity to open for deep link " + uri;
                }
            });
        }
    }

    public final void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle) {
        i.e(context, "context");
        i.e(uri, "uri");
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, bundle);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithWebViewActivity.1
                @Override // Ia.a
                public final String invoke() {
                    return "BrazeWebViewActivity not opened successfully.";
                }
            });
        }
    }

    public final void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle) {
        i.e(context, "context");
        i.e(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, bundle, getWebViewActivityIntent(context, uri, bundle), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithWebViewActivityFromPush.1
                @Override // Ia.a
                public final String invoke() {
                    return "Braze WebView Activity not opened successfully.";
                }
            });
        }
    }

    public final void setUri(Uri uri) {
        i.e(uri, "<set-?>");
        this.uri = uri;
    }

    public final void setUseWebView(boolean z10) {
        this.useWebView = z10;
    }

    public UriAction(UriAction original) {
        i.e(original, "original");
        this.uri = original.uri;
        this.extras = original.extras;
        this.useWebView = original.useWebView;
        this.channel = original.getChannel();
    }
}
