package com.braze.ui.inappmessage.jsinterface;

import Aa.c;
import Ia.a;
import Ia.l;
import Ia.p;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.math.BigDecimal;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.F0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.I;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: InAppMessageJavascriptInterface.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageJavascriptInterface {
    public static final Companion Companion = new Companion(null);
    private static final long PUSH_PROMPT_INITIAL_DELAY_MS = 75;
    private static final long PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS = 25;
    private static final long PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS = 2500;
    private final Context context;
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    /* JADX INFO: compiled from: InAppMessageJavascriptInterface.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InAppMessageJavascriptInterface.kt */
    @c(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1", f = "InAppMessageJavascriptInterface.kt", l = {R.styleable.AppCompatTheme_popupWindowStyle}, m = "invokeSuspend")
    public static final class C16991 extends SuspendLambda implements l<kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: InAppMessageJavascriptInterface.kt */
        @c(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1", f = "InAppMessageJavascriptInterface.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend")
        public static final class C02531 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            public C02531(kotlin.coroutines.c<? super C02531> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C02531 c02531 = new C02531(cVar);
                c02531.L$0 = obj;
                return c02531;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    b.b(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (A) this.L$0, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface.requestPushPermission.1.1.1
                        @Override // Ia.a
                        public final String invoke() {
                            return "Waiting for IAM to be fully closed before requesting push prompt";
                        }
                    }, 2, (Object) null);
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                while (BrazeInAppMessageManager.Companion.getInstance().isCurrentlyDisplayingInAppMessage()) {
                    this.label = 1;
                    if (I.b(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C02531) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        public C16991(kotlin.coroutines.c<? super C16991> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(kotlin.coroutines.c<?> cVar) {
            return InAppMessageJavascriptInterface.this.new C16991(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                if (InAppMessageJavascriptInterface.this.getWasCloseMessageCalled()) {
                    C02531 c02531 = new C02531(null);
                    this.label = 1;
                    if (G0.a(new F0(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS, this), c02531) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, InAppMessageJavascriptInterface.this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface.requestPushPermission.1.2
                @Override // Ia.a
                public final String invoke() {
                    return "Requesting push prompt from Braze bridge html interface";
                }
            }, 2, (Object) null);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.Companion.getInstance().getActivity());
            return r.f47939a;
        }

        @Override // Ia.l
        public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
            return ((C16991) create(cVar)).invokeSuspend(r.f47939a);
        }
    }

    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml inAppMessage) {
        i.e(context, "context");
        i.e(inAppMessage, "inAppMessage");
        this.context = context;
        this.inAppMessage = inAppMessage;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    public final void changeUser(String userId, String str) {
        i.e(userId, "userId");
        Braze.Companion.getInstance(this.context).changeUser(userId, str);
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    @JavascriptInterface
    public final void logButtonClick(String str) {
        if (str != null) {
            this.inAppMessage.logButtonClick(str);
        }
    }

    @JavascriptInterface
    public final void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        Braze.Companion.getInstance(this.context).logCustomEvent(str, parseProperties(str2));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, double d10, String str2, int i10, String str3) {
        Braze.Companion.getInstance(this.context).logPurchase(str, str2, new BigDecimal(String.valueOf(d10)), i10, parseProperties(str3));
    }

    public final BrazeProperties parseProperties(final String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.equals("undefined") || str.equals("null")) {
                return null;
            }
            return new BrazeProperties(new JSONObject(str));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface.parseProperties.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to parse properties JSON String: " + str;
                }
            });
            return null;
        }
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.Companion.getInstance(this.context).requestImmediateDataFlush();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.Companion.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(PUSH_PROMPT_INITIAL_DELAY_MS), null, new C16991(null), 2, null);
    }

    public final void setWasCloseMessageCalled(boolean z10) {
        this.wasCloseMessageCalled = z10;
    }
}
