package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.contentcapture.i;
import com.intercom.twig.Twig;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.m;
import com.voltasit.obdeleven.presentation.history.child.b;
import com.voltasit.obdeleven.presentation.history.vehicle.d;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.conversation.ui.A;
import io.intercom.android.sdk.m5.conversation.ui.components.L;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.ViewUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.B;
import kotlinx.coroutines.internal.f;
import p037cb.z0;
import p293xa.r;

/* JADX INFO: loaded from: classes3.dex */
public class OverlayPresenter implements InAppNotificationPresenter.Listener {
    private final Provider<Api> api;
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    final InAppNotificationPresenter inAppNotificationPresenter;
    private final IntercomDataLayer intercomDataLayer;
    final DefaultLauncherPresenter launcherPresenter;
    private final MetricTracker metricTracker;
    private final UserIdentity userIdentity;
    private final Twig twig = LumberMill.getLogger();
    private final Set<String> viewedPartIds = new HashSet();

    public OverlayPresenter(Application application, Provider<AppConfig> provider, MetricTracker metricTracker, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, Provider<Api> provider2) {
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.api = provider2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(application);
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        this.inAppNotificationPresenter = new InAppNotificationPresenter(layoutInflaterFrom, handler, this, metricTracker, provider, new ContextLocaliser(provider), hostActivity());
        this.launcherPresenter = new DefaultLauncherPresenter(layoutInflaterFrom, new LauncherOpenBehaviour(), metricTracker);
        f fVarB = B.b();
        intercomDataLayer.unreadConversationIdsUpdates(fVarB, new L(1, this));
        intercomDataLayer.configUpdates(fVarB, new m(2, this));
        int i10 = 1;
        intercomDataLayer.overlayStateUpdates(fVarB, new z0(i10, this));
        intercomDataLayer.listenToEvents(fVarB, new A(i10, this));
    }

    private Activity hostActivity() {
        return this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r lambda$new$0(Set set) {
        onStateChange(Integer.valueOf(set.size()), this.intercomDataLayer.getOverlayState().getValue());
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r lambda$new$1(AppConfig appConfig) {
        onNewConfig();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r lambda$new$2(OverlayState overlayState) {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), overlayState);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r lambda$new$3(IntercomEvent intercomEvent) {
        handleLifecycleEvents(intercomEvent);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewConfig$5(ViewGroup viewGroup) {
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChange$4(ViewGroup viewGroup) {
        this.inAppNotificationPresenter.reset(viewGroup);
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadAvatarThenDisplayNotifications$7(String str, List list, Intercom.Visibility visibility, Activity activity) {
        if (str.equals(this.userIdentity.getFingerprint()) && shouldDisplayNotifications(list, visibility, activity)) {
            displayNotifications(list, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeOverlaysIfPresent$6(View view) {
        if (view != null) {
            this.launcherPresenter.removeLauncher();
            this.inAppNotificationPresenter.reset((ViewGroup) view);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }

    private void openCarousel(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) IntercomCarouselActivity.class));
    }

    private void openMessenger(Conversation conversation) {
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            ArrayList arrayList = new ArrayList();
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(activityHostActivity, conversation.getId());
            arrayList.add(IntercomRootActivityArgsKt.getIntentForArgs(activityHostActivity, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, IntercomRootActivity.class, 268435456));
            arrayList.add(conversationIntent);
            activityHostActivity.startActivities((Intent[]) arrayList.toArray(new Intent[0]));
        }
    }

    private void openNote(Conversation conversation) {
        try {
            Activity activityHostActivity = hostActivity();
            if (activityHostActivity != null) {
                activityHostActivity.startActivity(IntercomNoteActivity.buildNoteIntent(activityHostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible()));
            }
        } catch (IllegalArgumentException e10) {
            this.twig.internal("Overlay", "Error loading the note " + e10.getMessage());
        }
    }

    private void openPost(Conversation conversation) {
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            activityHostActivity.startActivity(IntercomPostActivity.buildPostIntent(activityHostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible(), true));
        }
    }

    private void openSurvey(Activity activity) {
        activity.startActivity(IntercomSurveyActivity.buildIntent(activity));
    }

    private void removeOverlays(Activity activity) {
        if (activity != null) {
            removeOverlaysIfPresent(activity);
        }
    }

    private void trackInAppView(String str, String str2, @MetricTracker.InAppMessageViewContext int i10) {
        if (this.viewedPartIds.contains(str2)) {
            return;
        }
        this.viewedPartIds.add(str2);
        this.metricTracker.viewedInApp(str, str2, i10);
    }

    public void cancelAnimations() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public void displayNotifications(final List<Conversation> list, Activity activity) {
        DeliveryOption deliveryOption;
        final ViewGroup rootView = getRootView(activity);
        Conversation conversation = list.get(0);
        MessageStyle messageStyle = conversation.lastPart().getMessageStyle();
        DeliveryOption deliveryOption2 = conversation.lastPart().getDeliveryOption();
        if (list.size() > 1 || this.inAppNotificationPresenter.isDisplaying() || deliveryOption2 == DeliveryOption.SUMMARY || (deliveryOption2 == (deliveryOption = DeliveryOption.FULL) && MessageStyle.CHAT.equals(messageStyle))) {
            if (!this.launcherPresenter.isDisplaying()) {
                this.inAppNotificationPresenter.displayNotifications(rootView, list);
                return;
            }
            final DefaultLauncher andUnsetLauncher = this.launcherPresenter.getAndUnsetLauncher();
            if (list.size() == 1) {
                andUnsetLauncher.pulseForTransformation(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                andUnsetLauncher.removeView();
                            }
                        });
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
                return;
            } else {
                andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.removeView();
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
                return;
            }
        }
        if (deliveryOption2 == deliveryOption) {
            if (MessageStyle.POST.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openPost(conversation);
            } else if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openNote(conversation);
            }
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public ViewGroup getRootView() {
        Activity activityHostActivity = hostActivity();
        activityHostActivity.getClass();
        return getRootView(activityHostActivity);
    }

    public void handleLifecycleEvents(IntercomEvent intercomEvent) {
        OverlayState value = this.intercomDataLayer.getOverlayState().getValue();
        Activity pausedHostActivity = value.getPausedHostActivity();
        Activity resumedHostActivity = value.getResumedHostActivity();
        if (intercomEvent instanceof IntercomEvent.ActivityReadyForViewAttachment) {
            if (((IntercomEvent.ActivityReadyForViewAttachment) intercomEvent).getActivity() != pausedHostActivity) {
                removeOverlays(pausedHostActivity);
            }
        } else {
            if (intercomEvent instanceof IntercomEvent.ActivityPaused) {
                removeOverlays(pausedHostActivity);
                return;
            }
            if (intercomEvent instanceof IntercomEvent.ActivityStopped) {
                if (((IntercomEvent.ActivityStopped) intercomEvent).getActivity() == pausedHostActivity) {
                    removeOverlays(pausedHostActivity);
                }
            } else if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
                cancelAnimations();
                removeOverlays(pausedHostActivity);
                removeOverlays(resumedHostActivity);
            }
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void markAsDismissed(Conversation conversation) {
        this.api.get().markConversationAsDismissed(conversation.getId());
        this.intercomDataLayer.markConversationPartAsDismissed(conversation.lastPart().getId());
    }

    public void onNewConfig() {
        Intercom.Visibility launcherVisibility = this.intercomDataLayer.getOverlayState().getValue().getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = this.intercomDataLayer.getOverlayState().getValue().getInAppNotificationsVisibility();
        List<Conversation> conversations = this.intercomDataLayer.getOverlayState().getValue().getConversations();
        Activity resumedHostActivity = this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
        if (!shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            this.launcherPresenter.setLauncherBackgroundColor(this.appConfigProvider.get());
        } else {
            ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new androidx.media3.exoplayer.A(this, 1, rootView));
        }
    }

    public void onStateChange(Integer num, OverlayState overlayState) {
        Activity resumedHostActivity = overlayState.getResumedHostActivity();
        List<Conversation> conversations = overlayState.getConversations();
        SurveyData surveyData = overlayState.getSurveyData();
        Carousel carousel = overlayState.getCarousel();
        int bottomPadding = overlayState.getBottomPadding();
        Intercom.Visibility launcherVisibility = overlayState.getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = overlayState.getInAppNotificationsVisibility();
        this.launcherPresenter.setBottomPadding(bottomPadding);
        this.launcherPresenter.setUnreadCount(num.intValue());
        this.inAppNotificationPresenter.setBottomPadding(bottomPadding);
        if (resumedHostActivity == null || resumedHostActivity.isFinishing() || resumedHostActivity.isDestroyed()) {
            return;
        }
        if (shouldDisplaySurvey(surveyData, resumedHostActivity)) {
            openSurvey(resumedHostActivity);
            return;
        }
        if (shouldDisplayCarousel(carousel, resumedHostActivity)) {
            openCarousel(resumedHostActivity);
            return;
        }
        if (shouldDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity)) {
            preloadAvatarThenDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity, this.userIdentity.getFingerprint());
        } else if (!shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            removeOverlaysIfPresent(resumedHostActivity);
        } else {
            ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new i(this, 2, rootView));
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void openNotification(Conversation conversation) {
        Part lastAdminPart = conversation.getLastAdminPart();
        MessageStyle messageStyle = lastAdminPart.getMessageStyle();
        if (MessageStyle.POST.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
            openPost(conversation);
        } else {
            if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
                openNote(conversation);
                return;
            }
            openMessenger(conversation);
            if (MessageStyle.CHAT.equals(messageStyle) && DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
                this.metricTracker.openedConversationFromFull(conversation.getId(), lastAdminPart.getId());
            } else {
                this.metricTracker.openedConversationFromSnippet(conversation.getId(), lastAdminPart.getId());
            }
        }
    }

    public void preloadAvatarThenDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity, String str) {
        AvatarUtils.preloadAvatar(list.get(0).lastAdmin().getAvatar(), new d(this, str, list, visibility, activity, 1), activity);
    }

    public void refreshStateBecauseUserIdentityIsNotInStoreYet() {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), this.intercomDataLayer.getOverlayState().getValue());
    }

    public void removeOverlaysIfPresent(Activity activity) {
        activity.runOnUiThread(new b(this, 1, activity.findViewById(R.id.intercom_overlay_root)));
    }

    public boolean shouldDisplayCarousel(Carousel carousel, Activity activity) {
        return (Carousel.NULL.equals(carousel) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    public boolean shouldDisplayLauncher(List<Conversation> list, Intercom.Visibility visibility, Intercom.Visibility visibility2, Activity activity) {
        if (visibility == Intercom.Visibility.VISIBLE) {
            Iterator<Conversation> it = list.iterator();
            while (it.hasNext()) {
                if (DeliveryOption.BADGE != it.next().lastPart().getDeliveryOption()) {
                    return false;
                }
            }
        }
        return visibility2 == Intercom.Visibility.VISIBLE && !this.userIdentity.isSoftReset() && this.userIdentity.identityExists() && this.appConfigProvider.get().isReceivedFromServer() && activity != null;
    }

    public boolean shouldDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity) {
        return (visibility != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || list.isEmpty() || activity == null) ? false : true;
    }

    public boolean shouldDisplaySurvey(SurveyData surveyData, Activity activity) {
        return (SurveyData.Companion.getNULL().equals(surveyData) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    public void softReset() {
        cancelAnimations();
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            removeOverlaysIfPresent(activityHostActivity);
        }
    }

    private ViewGroup getRootView(Activity activity) {
        int i10 = R.id.intercom_overlay_root;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(i10);
        if (viewGroup != null) {
            return viewGroup;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setId(i10);
        activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 80));
        return frameLayout;
    }
}
