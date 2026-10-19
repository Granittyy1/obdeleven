package com.braze.ui.inappmessage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p033c7.d0;

/* JADX INFO: compiled from: DefaultInAppMessageViewWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {
    public static final Companion Companion = new Companion(null);
    private List<? extends View> buttonViews;
    private View clickableInAppMessageView;
    private View closeButton;
    private final Animation closingAnimation;
    private final BrazeConfigurationProvider configurationProvider;
    private ViewGroup contentViewGroupParentLayout;
    private Runnable dismissRunnable;
    private final IInAppMessage inAppMessage;
    private final InAppMessageCloser inAppMessageCloser;
    private final View inAppMessageView;
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;
    private final Animation openingAnimation;
    private View previouslyFocusedView;
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    /* JADX INFO: compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            i.e(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion$resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
                    }
                }, 2, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (viewAccessibilityFlagMap.containsKey(Integer.valueOf(id))) {
                        Integer num = viewAccessibilityFlagMap.get(Integer.valueOf(id));
                        if (num != null) {
                            int iIntValue = num.intValue();
                            WeakHashMap<View, Z> weakHashMap = O.f16859a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    } else {
                        WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                        childAt.setImportantForAccessibility(0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            i.e(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion$setAllViewGroupChildrenAsNonAccessibilityImportant$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
                    }
                }, 2, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    viewAccessibilityFlagMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    childAt.setImportantForAccessibility(4);
                }
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: DefaultInAppMessageViewWrapper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class ViewOnLayoutChangeListenerC16892 implements View.OnLayoutChangeListener {
        final /* synthetic */ ViewGroup $parentViewGroup;
        final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

        public ViewOnLayoutChangeListenerC16892(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
            this.$parentViewGroup = viewGroup;
            this.this$0 = defaultInAppMessageViewWrapper;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLayoutChange$lambda$0(DefaultInAppMessageViewWrapper this$0, ViewGroup parentViewGroup) {
            i.e(this$0, "this$0");
            i.e(parentViewGroup, "$parentViewGroup");
            this$0.addInAppMessageViewToViewGroup(parentViewGroup, this$0.getInAppMessage(), this$0.getInAppMessageView(), this$0.getInAppMessageViewLifecycleListener());
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, final int i11, int i12, final int i13, int i14, int i15, int i16, int i17) {
            i.e(view, "view");
            this.$parentViewGroup.removeOnLayoutChangeListener(this);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2$onLayoutChange$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Detected (bottom - top) of " + (i13 - i11) + " in OnLayoutChangeListener";
                }
            }, 3, (Object) null);
            this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
            ViewGroup viewGroup = this.$parentViewGroup;
            viewGroup.post(new E6.c(this.this$0, 1, viewGroup));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view) {
        this(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, null, null, 384, null);
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        i.e(configurationProvider, "configurationProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDismissRunnable$lambda$7() {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final n0 addInAppMessageViewToViewGroup$lambda$0(View inAppMessageView, DefaultInAppMessageViewWrapper this$0, View view, n0 n0Var) {
        i.e(inAppMessageView, "$inAppMessageView");
        i.e(this$0, "this$0");
        if (n0Var == null) {
            return new n0(n0Var);
        }
        IInAppMessageView iInAppMessageView = (IInAppMessageView) inAppMessageView;
        if (iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$2
                @Override // Ia.a
                public final String invoke() {
                    return "Not reapplying window insets to in-app message view.";
                }
            }, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$1
                @Override // Ia.a
                public final String invoke() {
                    return "Calling applyWindowInsets on in-app message view.";
                }
            }, 2, (Object) null);
            iInAppMessageView.applyWindowInsets(n0Var);
        }
        return n0Var;
    }

    public static /* synthetic */ void announceForAccessibilityIfNecessary$default(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: announceForAccessibilityIfNecessary");
        }
        if ((i10 & 1) != 0) {
            str = "In app message displayed.";
        }
        defaultInAppMessageViewWrapper.announceForAccessibilityIfNecessary(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButtonClickListeners$lambda$5$lambda$4$lambda$3$lambda$2(DefaultInAppMessageViewWrapper this$0, MessageButton button, IInAppMessageImmersive immersiveMessage, View view) {
        i.e(this$0, "this$0");
        i.e(button, "$button");
        i.e(immersiveMessage, "$immersiveMessage");
        this$0.getInAppMessageViewLifecycleListener().onButtonClicked(this$0.getInAppMessageCloser(), button, immersiveMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createClickListener$lambda$1(DefaultInAppMessageViewWrapper this$0, View view) {
        List<MessageButton> messageButtons;
        i.e(this$0, "this$0");
        IInAppMessage inAppMessage = this$0.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (this$0.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        this$0.getInAppMessageViewLifecycleListener().onClicked(this$0.getInAppMessageCloser(), this$0.getInAppMessageView(), this$0.getInAppMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseInAppMessageClickListener$lambda$6(View view) {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new c(0));
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    public void addInAppMessageViewToViewGroup(ViewGroup parentViewGroup, IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        i.e(parentViewGroup, "parentViewGroup");
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        inAppMessageViewLifecycleListener.beforeOpened(inAppMessageView, inAppMessage);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup.1
            @Override // Ia.a
            public final String invoke() {
                return "Adding In-app message view to parent view group.";
            }
        }, 3, (Object) null);
        parentViewGroup.addView(inAppMessageView, getLayoutParams(inAppMessage));
        if (inAppMessageView instanceof IInAppMessageView) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.c.c(parentViewGroup);
            O.d.u(parentViewGroup, new d0(inAppMessageView, this));
        }
        if (inAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup.3
                @Override // Ia.a
                public final String invoke() {
                    return "In-app message view will animate into the visible area.";
                }
            }, 3, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup.4
                @Override // Ia.a
                public final String invoke() {
                    return "In-app message view will be placed instantly into the visible area.";
                }
            }, 3, (Object) null);
            if (inAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
        }
    }

    public void announceForAccessibilityIfNecessary(String str) {
        if (!(getInAppMessageView() instanceof IInAppMessageImmersiveView)) {
            if (getInAppMessageView() instanceof InAppMessageHtmlBaseView) {
                getInAppMessageView().announceForAccessibility(str);
                return;
            }
            return;
        }
        String message = getInAppMessage().getMessage();
        if (!(getInAppMessage() instanceof IInAppMessageImmersive)) {
            getInAppMessageView().announceForAccessibility(message);
            return;
        }
        IInAppMessage inAppMessage = getInAppMessage();
        i.c(inAppMessage, "null cannot be cast to non-null type com.braze.models.inappmessage.IInAppMessageImmersive");
        String header = ((IInAppMessageImmersive) inAppMessage).getHeader();
        getInAppMessageView().announceForAccessibility(header + " . " + message);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            Companion.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (!getInAppMessage().getAnimateOut()) {
            closeInAppMessageView();
        } else {
            setAnimatingClose(true);
            setAndStartAnimation(false);
        }
    }

    public void closeInAppMessageView() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.closeInAppMessageView.1
            @Override // Ia.a
            public final String invoke() {
                return "Closing in-app message view";
            }
        }, 3, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.closeInAppMessageView.2
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Returning focus to view after closing message. View: " + DefaultInAppMessageViewWrapper.this.getPreviouslyFocusedView();
                }
            }, 3, (Object) null);
            View previouslyFocusedView = getPreviouslyFocusedView();
            if (previouslyFocusedView != null) {
                previouslyFocusedView.requestFocus();
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    public Animation.AnimationListener createAnimationListener(boolean z10) {
        return z10 ? new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createAnimationListener.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (DefaultInAppMessageViewWrapper.this.getInAppMessage().getDismissType() == DismissType.AUTO_DISMISS) {
                    DefaultInAppMessageViewWrapper.this.addDismissRunnable();
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1$onAnimationEnd$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "In-app message animated into view.";
                    }
                }, 3, (Object) null);
                DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.getInAppMessage(), DefaultInAppMessageViewWrapper.this.getInAppMessageView(), DefaultInAppMessageViewWrapper.this.getInAppMessageViewLifecycleListener());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        } : new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createAnimationListener.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public void createButtonClickListeners() {
        IInAppMessage inAppMessage = getInAppMessage();
        final IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if (iInAppMessageImmersive != null) {
            if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createButtonClickListeners$1$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Cannot create button click listener since this in-app message does not have message buttons.";
                    }
                }, 3, (Object) null);
                return;
            }
            List<View> buttonViews = getButtonViews();
            if (buttonViews != null) {
                int i10 = 0;
                for (Object obj : buttonViews) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        l.x();
                        throw null;
                    }
                    View view = (View) obj;
                    final MessageButton messageButton = (MessageButton) q.Q(i10, iInAppMessageImmersive.getMessageButtons());
                    if (messageButton != null) {
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$5$lambda$4$lambda$3$lambda$2(this.f24425b, messageButton, iInAppMessageImmersive, view2);
                            }
                        });
                    }
                    i10 = i11;
                }
            }
        }
    }

    public View.OnClickListener createClickListener() {
        return new d(0, this);
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new f();
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createDismissCallbacks.1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object obj) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object obj) {
                i.e(view, "view");
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createTouchAwareListener.1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void finalizeViewBeforeDisplay(IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageView)) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
        }
        announceForAccessibilityIfNecessary$default(this, null, 1, null);
        inAppMessageViewLifecycleListener.afterOpened(inAppMessageView, inAppMessage);
    }

    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    public View getCloseButton() {
        return this.closeButton;
    }

    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public InAppMessageCloser getInAppMessageCloser() {
        return this.inAppMessageCloser;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage iInAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (iInAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        i.e(activity, "activity");
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        i.d(viewFindViewById, "activity.window.decorVie…yId(android.R.id.content)");
        return (ViewGroup) viewFindViewById;
    }

    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public boolean isAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(Activity activity) {
        i.e(activity, "activity");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.open.1
            @Override // Ia.a
            public final String invoke() {
                return "Opening in-app message view wrapper";
            }
        }, 2, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        final int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            Companion.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC16892(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.open.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Detected root view height of " + height;
                }
            }, 3, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
    }

    public void setAndStartAnimation(boolean z10) {
        Animation openingAnimation = z10 ? getOpeningAnimation() : getClosingAnimation();
        if (openingAnimation != null) {
            openingAnimation.setAnimationListener(createAnimationListener(z10));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(openingAnimation);
        if (openingAnimation != null) {
            openingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void setAnimatingClose(boolean z10) {
        this.isAnimatingClose = z10;
    }

    public void setButtonViews(List<? extends View> list) {
        this.buttonViews = list;
    }

    public void setClickableInAppMessageView(View view) {
        this.clickableInAppMessageView = view;
    }

    public void setCloseButton(View view) {
        this.closeButton = view;
    }

    public void setContentViewGroupParentLayout(ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setPreviouslyFocusedView(View view) {
        this.previouslyFocusedView = view;
    }

    public void setViewAccessibilityFlagMap(HashMap<Integer, Integer> map) {
        i.e(map, "<set-?>");
        this.viewAccessibilityFlagMap = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list) {
        this(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, list, null, 256, null);
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        i.e(configurationProvider, "configurationProvider");
    }

    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list, View view2) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        i.e(configurationProvider, "configurationProvider");
        this.inAppMessageView = inAppMessageView;
        this.inAppMessage = inAppMessage;
        this.inAppMessageViewLifecycleListener = inAppMessageViewLifecycleListener;
        this.configurationProvider = configurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view;
        this.buttonViews = list;
        this.closeButton = view2;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        if (getInAppMessage() instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        this.inAppMessageCloser = new InAppMessageCloser(this);
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        createButtonClickListeners();
    }

    public static /* synthetic */ void getInAppMessageCloser$annotations() {
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i10, kotlin.jvm.internal.e eVar) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : view3);
    }
}
