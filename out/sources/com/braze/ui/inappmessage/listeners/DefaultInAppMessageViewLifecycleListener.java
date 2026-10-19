package com.braze.ui.inappmessage.listeners;

import Aa.c;
import Ia.p;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: DefaultInAppMessageViewLifecycleListener.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    /* JADX INFO: compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            try {
                iArr[ClickAction.NEWS_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickAction.URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClickAction.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    @c(c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", f = "DefaultInAppMessageViewLifecycleListener.kt", l = {}, m = "invokeSuspend")
    public static final class C17331 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C17331(kotlin.coroutines.c<? super C17331> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C17331(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            Activity activity = BrazeInAppMessageManager.Companion.getInstance().getActivity();
            if (activity != null) {
                BrazeFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(activity));
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C17331) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser, Uri uri, boolean z10) {
        Activity activity = getInAppMessageManager().getActivity();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.performClickAction.1
                @Override // Ia.a
                public final String invoke() {
                    return "Can't perform click action because the cached activity is null.";
                }
            }, 2, (Object) null);
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i10 == 1) {
            inAppMessageCloser.close(false);
            BrazeDeeplinkHandler.Companion.getInstance().gotoNewsFeed(activity, new NewsfeedAction(BundleUtils.toBundle(iInAppMessage.getExtras()), Channel.INAPP_MESSAGE));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                inAppMessageCloser.close(false);
                return;
            } else {
                inAppMessageCloser.close(iInAppMessage.getAnimateOut());
                return;
            }
        }
        inAppMessageCloser.close(false);
        if (uri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.performClickAction.2
                @Override // Ia.a
                public final String invoke() {
                    return "clickUri is null, not performing click action";
                }
            }, 3, (Object) null);
            return;
        }
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.Companion;
        UriAction uriActionCreateUriActionFromUri = companion.getInstance().createUriActionFromUri(uri, BundleUtils.toBundle(iInAppMessage.getExtras()), z10, Channel.INAPP_MESSAGE);
        Context applicationContext = getInAppMessageManager().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.performClickAction.3
                @Override // Ia.a
                public final String invoke() {
                    return "appContext is null, not performing click action";
                }
            }, 3, (Object) null);
        } else {
            companion.getInstance().gotoUri(applicationContext, uriActionCreateUriActionFromUri);
        }
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(messageButton.getClickAction(), iInAppMessage, inAppMessageCloser, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(iInAppMessage.getClickAction(), iInAppMessage, inAppMessageCloser, iInAppMessage.getUri(), iInAppMessage.getOpenUriInWebView());
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new C17331(null), 3);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.afterClosed.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.afterClosed called.";
            }
        }, 3, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (inAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        inAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.afterOpened.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.afterOpened called.";
            }
        }, 3, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(inAppMessageView, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.beforeClosed.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.beforeClosed called.";
            }
        }, 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.beforeOpened.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.beforeOpened called.";
            }
        }, 3, (Object) null);
        inAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(InAppMessageCloser inAppMessageCloser, MessageButton messageButton, IInAppMessageImmersive inAppMessageImmersive) {
        boolean zOnInAppMessageButtonClicked;
        i.e(inAppMessageCloser, "inAppMessageCloser");
        i.e(messageButton, "messageButton");
        i.e(inAppMessageImmersive, "inAppMessageImmersive");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.onButtonClicked.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
            }
        }, 3, (Object) null);
        inAppMessageImmersive.logButtonClick(messageButton);
        try {
            zOnInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton, inAppMessageCloser);
        } catch (BrazeFunctionNotImplemented unused) {
            zOnInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton);
        }
        if (zOnInAppMessageButtonClicked) {
            return;
        }
        performInAppMessageButtonClicked(messageButton, inAppMessageImmersive, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(InAppMessageCloser inAppMessageCloser, View inAppMessageView, IInAppMessage inAppMessage) {
        boolean zOnInAppMessageClicked;
        i.e(inAppMessageCloser, "inAppMessageCloser");
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.onClicked.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onClicked called.";
            }
        }, 3, (Object) null);
        inAppMessage.logClick();
        try {
            zOnInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage, inAppMessageCloser);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$1
                @Override // Ia.a
                public final String invoke() {
                    return "Deprecated onInAppMessageClicked(inAppMessage, inAppMessageCloser) called.";
                }
            }, 3, (Object) null);
        } catch (BrazeFunctionNotImplemented unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$2
                @Override // Ia.a
                public final String invoke() {
                    return "Using non-deprecated onInAppMessageClicked(inAppMessage)";
                }
            }, 3, (Object) null);
            zOnInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage);
        }
        if (zOnInAppMessageClicked) {
            return;
        }
        performInAppMessageClicked(inAppMessage, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.onDismissed.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onDismissed called.";
            }
        }, 3, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(inAppMessage);
    }
}
