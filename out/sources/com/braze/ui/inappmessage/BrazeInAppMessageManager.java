package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import bo.app.E0;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BrazeInAppMessageManager.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    /* JADX INFO: compiled from: BrazeInAppMessageManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                i.c(brazeInAppMessageManager, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                r rVar = r.f47939a;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                i.c(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: BrazeInAppMessageManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new E0(1, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$8(BrazeInAppMessageManager this$0, InAppMessageEvent event) {
        i.e(this$0, "this$0");
        i.e(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        this$0.inAppMessageEventMap.put(inAppMessage, event);
        this$0.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$7(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager this$0, Activity activity) {
        i.e(this$0, "this$0");
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$14$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Page has finished loading. Opening in-app message view wrapper.";
                    }
                }, 3, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this$0, BrazeLogger.Priority.E, e10, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$14$2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Failed to open view wrapper in page finished listener";
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$1(BrazeInAppMessageManager this$0, SdkDataWipeEvent it) {
        i.e(this$0, "this$0");
        i.e(it, "it");
        this$0.inAppMessageStack.clear();
        this$0.carryoverInAppMessage = null;
        this$0.unregisteredInAppMessage = null;
    }

    public static final BrazeInAppMessageManager getInstance() {
        return Companion.getInstance();
    }

    public void addInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage != null) {
            this.inAppMessageStack.push(iInAppMessage);
            requestDisplayInAppMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f6 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:55:0x018f, B:73:0x01f0, B:75:0x01f6, B:61:0x019d, B:63:0x01a3, B:67:0x01c8, B:68:0x01cd, B:72:0x01eb), top: B:98:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
    /* JADX WARN: Code duplicated, block: B:82:0x0218 A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:77:0x0204, B:82:0x0218, B:83:0x021c, B:84:0x0224, B:85:0x0225, B:86:0x022d, B:87:0x022e, B:88:0x0236, B:89:0x0237, B:90:0x023f, B:91:0x0240, B:92:0x0248, B:93:0x0249, B:94:0x0253), top: B:97:0x003d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.braze.models.inappmessage.IInAppMessage] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory] */
    public void displayInAppMessage(IInAppMessage iInAppMessage, boolean z10) {
        final ?? r12;
        Activity activity;
        IInAppMessageViewWrapper iInAppMessageViewWrapperCreateInAppMessageViewWrapper;
        IInAppMessageViewWrapper iInAppMessageViewWrapper;
        Activity activity2;
        final IInAppMessage inAppMessage = iInAppMessage;
        i.e(inAppMessage, "inAppMessage");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        ?? r10 = 2;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.1
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Attempting to display in-app message with payload: " + JsonUtils.getPrettyPrintedString(inAppMessage.forJsonPut());
            }
        }, 2, (Object) null);
        if (!this.displayingInAppMessage.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.2
                @Override // Ia.a
                public final String invoke() {
                    return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
                }
            }, 3, (Object) null);
            this.inAppMessageStack.push(inAppMessage);
            return;
        }
        try {
            Activity activity3 = this.mActivity;
            try {
                if (activity3 == null) {
                    this.carryoverInAppMessage = inAppMessage;
                    throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
                }
                if (z10) {
                    r10 = 3;
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.4
                        @Override // Ia.a
                        public final String invoke() {
                            return "Not checking expiration status for carry-over in-app message.";
                        }
                    }, 3, (Object) null);
                } else {
                    long expirationTimestamp = iInAppMessage.getExpirationTimestamp();
                    if (expirationTimestamp > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis > expirationTimestamp) {
                            throw new Exception("In-app message is expired. Doing nothing. Expiration: " + expirationTimestamp + ". Current time: " + jCurrentTimeMillis);
                        }
                    } else {
                        r10 = 3;
                        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.3
                            @Override // Ia.a
                            public final String invoke() {
                                return "Expiration timestamp not defined. Continuing.";
                            }
                        }, 3, (Object) null);
                    }
                }
                if (!verifyOrientationStatus(iInAppMessage)) {
                    throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                }
                if (iInAppMessage.isControl()) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.5
                        @Override // Ia.a
                        public final String invoke() {
                            return "Not displaying control in-app message. Logging impression and ending display execution.";
                        }
                    }, 3, (Object) null);
                    iInAppMessage.logImpression();
                    resetAfterInAppMessageClose();
                    return;
                }
                if (BrazeActionUtils.containsInvalidBrazeAction(iInAppMessage)) {
                    InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
                    BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                    BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.6
                        @Override // Ia.a
                        public final String invoke() {
                            return "Cannot show message containing an invalid Braze Action.";
                        }
                    }, 2, (Object) null);
                    if (inAppMessageEvent != null) {
                        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.7
                            @Override // Ia.a
                            public final String invoke() {
                                return "Attempting to perform any fallback actions.";
                            }
                        }, 2, (Object) null);
                        Context applicationContext = activity3.getApplicationContext();
                        i.d(applicationContext, "activity.applicationContext");
                        BrazeInternal.retryInAppMessage(applicationContext, inAppMessageEvent);
                    }
                    resetAfterInAppMessageClose();
                    return;
                }
                if (Companion.containsPushPermissionPrompt(inAppMessage) && !PermissionUtils.wouldPushPermissionPromptDisplay(activity3)) {
                    InAppMessageEvent inAppMessageEvent2 = this.inAppMessageEventMap.get(inAppMessage);
                    BrazeLogger.Priority priority2 = BrazeLogger.Priority.I;
                    BrazeLogger.brazelog$default(brazeLogger, this, priority2, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.8
                        @Override // Ia.a
                        public final String invoke() {
                            return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
                        }
                    }, 2, (Object) null);
                    if (inAppMessageEvent2 != null) {
                        BrazeLogger.brazelog$default(brazeLogger, this, priority2, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.9
                            @Override // Ia.a
                            public final String invoke() {
                                return "Attempting to perform any fallback actions.";
                            }
                        }, 2, (Object) null);
                        Context applicationContext2 = activity3.getApplicationContext();
                        i.d(applicationContext2, "activity.applicationContext");
                        BrazeInternal.retryInAppMessage(applicationContext2, inAppMessageEvent2);
                    }
                    resetAfterInAppMessageClose();
                    return;
                }
                IInAppMessageViewFactory inAppMessageViewFactory = getInAppMessageViewFactory(iInAppMessage);
                if (inAppMessageViewFactory == null) {
                    throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                }
                ?? CreateInAppMessageView = inAppMessageViewFactory.createInAppMessageView(activity3, inAppMessage);
                if (CreateInAppMessageView == 0) {
                    throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                }
                if (CreateInAppMessageView.getParent() != null) {
                    throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                }
                BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
                if (brazeConfigurationProvider == null) {
                    throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
                }
                Animation openingAnimation = getInAppMessageAnimationFactory().getOpeningAnimation(inAppMessage);
                Animation closingAnimation = getInAppMessageAnimationFactory().getClosingAnimation(inAppMessage);
                ?? inAppMessageViewWrapperFactory = getInAppMessageViewWrapperFactory();
                try {
                    try {
                        if (!(CreateInAppMessageView instanceof IInAppMessageImmersiveView)) {
                            if (CreateInAppMessageView instanceof IInAppMessageView) {
                                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.11
                                    @Override // Ia.a
                                    public final String invoke() {
                                        return "Creating view wrapper for base in-app message.";
                                    }
                                }, 3, (Object) null);
                                activity = activity3;
                                r10 = inAppMessage;
                                Animation animation = closingAnimation;
                                iInAppMessageViewWrapperCreateInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(CreateInAppMessageView, iInAppMessage, this.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, animation, ((IInAppMessageView) CreateInAppMessageView).getMessageClickableView());
                                inAppMessage = animation;
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.12
                                    @Override // Ia.a
                                    public final String invoke() {
                                        return "Creating view wrapper for in-app message.";
                                    }
                                }, 3, (Object) null);
                                activity = activity3;
                                r10 = inAppMessage;
                                iInAppMessageViewWrapperCreateInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(CreateInAppMessageView, iInAppMessage, this.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, CreateInAppMessageView);
                            }
                            iInAppMessageViewWrapper = iInAppMessageViewWrapperCreateInAppMessageViewWrapper;
                            this.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                            if (CreateInAppMessageView instanceof InAppMessageHtmlBaseView) {
                                Activity activity4 = activity;
                                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.13
                                    @Override // Ia.a
                                    public final String invoke() {
                                        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
                                    }
                                }, 3, (Object) null);
                                ((InAppMessageHtmlBaseView) CreateInAppMessageView).setHtmlPageFinishedListener(new a(iInAppMessageViewWrapper, this, activity4));
                            } else {
                                activity2 = activity;
                                if (iInAppMessageViewWrapper != null) {
                                    iInAppMessageViewWrapper.open(activity2);
                                }
                            }
                        }
                        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.10
                            @Override // Ia.a
                            public final String invoke() {
                                return "Creating view wrapper for immersive in-app message.";
                            }
                        }, 3, (Object) null);
                        IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) CreateInAppMessageView;
                        int size = ((InAppMessageImmersiveBase) inAppMessage).getMessageButtons().size();
                        activity = activity3;
                        r10 = inAppMessage;
                        Animation animation2 = closingAnimation;
                        iInAppMessageViewWrapperCreateInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(CreateInAppMessageView, iInAppMessage, this.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, animation2, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(size), iInAppMessageImmersiveView.getMessageCloseButtonView());
                        inAppMessage = animation2;
                        iInAppMessageViewWrapper = iInAppMessageViewWrapperCreateInAppMessageViewWrapper;
                        this.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                        if (CreateInAppMessageView instanceof InAppMessageHtmlBaseView) {
                            Activity activity5 = activity;
                            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.13
                                @Override // Ia.a
                                public final String invoke() {
                                    return "In-app message view includes HTML. Delaying display until the content has finished loading.";
                                }
                            }, 3, (Object) null);
                            ((InAppMessageHtmlBaseView) CreateInAppMessageView).setHtmlPageFinishedListener(new a(iInAppMessageViewWrapper, this, activity5));
                        } else {
                            activity2 = activity;
                            if (iInAppMessageViewWrapper != null) {
                                iInAppMessageViewWrapper.open(activity2);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r12 = r10;
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.15
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final String invoke() {
                                return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(r12.forJsonPut());
                            }
                        });
                        resetAfterInAppMessageClose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = inAppMessage;
                    r12 = r10;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage.15
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final String invoke() {
                            return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(r12.forJsonPut());
                        }
                    });
                    resetAfterInAppMessageClose();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            r12 = inAppMessage;
        }
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        i.e(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents.1
                @Override // Ia.a
                public final String invoke() {
                    return "Removing existing in-app message event subscriber before subscribing a new one.";
                }
            }, 3, (Object) null);
            Braze.Companion.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents.2
            @Override // Ia.a
            public final String invoke() {
                return "Subscribing in-app message event subscriber";
            }
        }, 3, (Object) null);
        IEventSubscriber<InAppMessageEvent> iEventSubscriberCreateInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.Companion;
        companion.getInstance(context).subscribeToNewInAppMessages(iEventSubscriberCreateInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = iEventSubscriberCreateInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents.4
                @Override // Ia.a
                public final String invoke() {
                    return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
                }
            }, 2, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents.5
            @Override // Ia.a
            public final String invoke() {
                return "Subscribing sdk data wipe subscriber";
            }
        }, 2, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.inappmessage.b
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1(this.f24421a, (SdkDataWipeEvent) obj);
            }
        };
        companion.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
    }

    public final IInAppMessage getCarryoverInAppMessage() {
        return this.carryoverInAppMessage;
    }

    public final Map<IInAppMessage, InAppMessageEvent> getInAppMessageEventMap() {
        return this.inAppMessageEventMap;
    }

    public final Stack<IInAppMessage> getInAppMessageStack() {
        return this.inAppMessageStack;
    }

    public boolean getIsCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public final IInAppMessage getUnregisteredInAppMessage() {
        return this.unregisteredInAppMessage;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z10) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z10) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            iInAppMessageViewWrapper.close();
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public void registerInAppMessageManager(final Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.registerInAppMessageManager.1
                @Override // Ia.a
                public final String invoke() {
                    return "Null Activity passed to registerInAppMessageManager. Doing nothing";
                }
            }, 2, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.registerInAppMessageManager.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
            }
        }, 2, (Object) null);
        this.mActivity = activity;
        if (this.mApplicationContext == null) {
            Context applicationContext = activity.getApplicationContext();
            this.mApplicationContext = applicationContext;
            if (applicationContext == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.registerInAppMessageManager.3
                    @Override // Ia.a
                    public final String invoke() {
                        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
                    }
                }, 2, (Object) null);
                return;
            }
        }
        if (this.configurationProvider == null) {
            Context context = this.mApplicationContext;
            this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
        }
        IInAppMessage iInAppMessage = this.carryoverInAppMessage;
        if (iInAppMessage != null) {
            if (iInAppMessage != null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$5$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Requesting display of carryover in-app message.";
                    }
                }, 3, (Object) null);
                iInAppMessage.setAnimateIn(false);
                displayInAppMessage(iInAppMessage, true);
            }
            this.carryoverInAppMessage = null;
        } else {
            IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
            if (iInAppMessage2 != null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$6$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Adding previously unregistered in-app message.";
                    }
                }, 3, (Object) null);
                addInAppMessage(iInAppMessage2);
                this.unregisteredInAppMessage = null;
            }
        }
        Context context2 = this.mApplicationContext;
        if (context2 != null) {
            ensureSubscribedToInAppMessageEvents(context2);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperationBeforeInAppMessageDisplayed;
        try {
            Activity activity = this.mActivity;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.2
                        @Override // Ia.a
                        public final String invoke() {
                            return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
                        }
                    }, 3, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.1
                        @Override // Ia.a
                        public final String invoke() {
                            return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
                        }
                    }, 2, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.3
                    @Override // Ia.a
                    public final String invoke() {
                        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
                    }
                }, 3, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.4
                    @Override // Ia.a
                    public final String invoke() {
                        return "The in-app message stack is empty. No in-app message will be displayed.";
                    }
                }, 3, (Object) null);
                return false;
            }
            final IInAppMessage iInAppMessagePop = this.inAppMessageStack.pop();
            if (iInAppMessagePop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager$requestDisplayInAppMessage$inAppMessageOperation$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Using the control in-app message manager listener.";
                    }
                }, 3, (Object) null);
                inAppMessageOperationBeforeInAppMessageDisplayed = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(iInAppMessagePop);
            } else {
                inAppMessageOperationBeforeInAppMessageDisplayed = getInAppMessageManagerListener().beforeInAppMessageDisplayed(iInAppMessagePop);
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[inAppMessageOperationBeforeInAppMessageDisplayed.ordinal()];
            if (i10 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.5
                    @Override // Ia.a
                    public final String invoke() {
                        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
                    }
                }, 3, (Object) null);
            } else {
                if (i10 == 2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.6
                        @Override // Ia.a
                        public final String invoke() {
                            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
                        }
                    }, 3, (Object) null);
                    this.inAppMessageStack.push(iInAppMessagePop);
                    return false;
                }
                if (i10 == 3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.7
                        @Override // Ia.a
                        public final String invoke() {
                            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
                        }
                    }, 3, (Object) null);
                    return false;
                }
                if (i10 == 4) {
                    InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(iInAppMessagePop);
                    if (inAppMessageEvent != null) {
                        BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                        Context applicationContext = activity.getApplicationContext();
                        i.d(applicationContext, "activity.applicationContext");
                        brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.8
                            @Override // Ia.a
                            public final String invoke() {
                                return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
                            }
                        }, 3, (Object) null);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.9
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final String invoke() {
                                return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessagePop;
                            }
                        }, 3, (Object) null);
                    }
                    return false;
                }
            }
            BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(iInAppMessagePop);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.requestDisplayInAppMessage.10
                @Override // Ia.a
                public final String invoke() {
                    return "Error running requestDisplayInAppMessage";
                }
            });
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.resetAfterInAppMessageClose.1
            @Override // Ia.a
            public final String invoke() {
                return "Resetting after in-app message close.";
            }
        }, 2, (Object) null);
        this.inAppMessageViewWrapper = null;
        Activity activity = this.mActivity;
        final Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.resetAfterInAppMessageClose.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Setting requested orientation to original orientation " + num;
            }
        }, 3, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public final void setCarryoverInAppMessage(IInAppMessage iInAppMessage) {
        this.carryoverInAppMessage = iInAppMessage;
    }

    public final void setUnregisteredInAppMessage(IInAppMessage iInAppMessage) {
        this.unregisteredInAppMessage = iInAppMessage;
    }

    public void unregisterInAppMessageManager(final Activity activity) {
        IInAppMessage inAppMessage;
        if (getShouldNextUnregisterBeSkipped()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ");
                    Activity activity2 = activity;
                    sb2.append(activity2 != null ? activity2.getLocalClassName() : null);
                    return sb2.toString();
                }
            }, 3, (Object) null);
            setShouldNextUnregisterBeSkipped(false);
            return;
        }
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager.2
                @Override // Ia.a
                public final String invoke() {
                    return "Null Activity passed to unregisterInAppMessageManager.";
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
                }
            }, 2, (Object) null);
        }
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager.4
                    @Override // Ia.a
                    public final String invoke() {
                        return "In-app message view includes HTML. Removing the page finished listener.";
                    }
                }, 3, (Object) null);
                ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
            }
            ViewUtils.removeViewFromParent(inAppMessageView);
            if (iInAppMessageViewWrapper.isAnimatingClose()) {
                this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                inAppMessage = null;
            } else {
                inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
            }
            this.carryoverInAppMessage = inAppMessage;
            this.inAppMessageViewWrapper = null;
        } else {
            this.carryoverInAppMessage = null;
        }
        this.mActivity = null;
        this.displayingInAppMessage.set(false);
    }

    public boolean verifyOrientationStatus(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
        Activity activity = this.mActivity;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.verifyOrientationStatus.1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot verify orientation status with null Activity.";
                }
            }, 2, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.verifyOrientationStatus.2
                @Override // Ia.a
                public final String invoke() {
                    return "Running on tablet. In-app message can be displayed in any orientation.";
                }
            }, 3, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation != null) {
                    return true;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.verifyOrientationStatus.4
                    @Override // Ia.a
                    public final String invoke() {
                        return "Requesting orientation lock.";
                    }
                }, 3, (Object) null);
                this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                ViewUtils.setActivityRequestedOrientation(activity, 14);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.BrazeInAppMessageManager.verifyOrientationStatus.3
                @Override // Ia.a
                public final String invoke() {
                    return "Any orientation specified. In-app message can be displayed in any orientation.";
                }
            }, 3, (Object) null);
        }
        return true;
    }

    public static /* synthetic */ void getCarryoverInAppMessage$annotations() {
    }

    public static /* synthetic */ void getDisplayingInAppMessage$annotations() {
    }

    public static /* synthetic */ void getInAppMessageStack$annotations() {
    }

    public static /* synthetic */ void getUnregisteredInAppMessage$annotations() {
    }
}
