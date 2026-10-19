package io.intercom.android.sdk.models;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;
import p005a4.q;

/* JADX INFO: compiled from: OverlayState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OverlayState {
    private final int bottomPadding;
    private final Carousel carousel;
    private final List<Conversation> conversations;
    private final Set<String> dismissedPartIds;
    private final Intercom.Visibility inAppNotificationsVisibility;
    private final Intercom.Visibility launcherVisibility;
    private final Activity pausedHostActivity;
    private final Activity resumedHostActivity;
    private final SurveyData surveyData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final OverlayState NULL = new OverlayState(null, null, 0, null, null, null, null, null, null, 511, null);

    /* JADX INFO: compiled from: OverlayState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public OverlayState() {
        this(null, null, 0, null, null, null, null, null, null, 511, null);
    }

    public final SurveyData component1() {
        return this.surveyData;
    }

    public final Carousel component2() {
        return this.carousel;
    }

    public final int component3() {
        return this.bottomPadding;
    }

    public final Intercom.Visibility component4() {
        return this.launcherVisibility;
    }

    public final Intercom.Visibility component5() {
        return this.inAppNotificationsVisibility;
    }

    public final List<Conversation> component6() {
        return this.conversations;
    }

    public final Set<String> component7() {
        return this.dismissedPartIds;
    }

    public final Activity component8() {
        return this.resumedHostActivity;
    }

    public final Activity component9() {
        return this.pausedHostActivity;
    }

    public final OverlayState copy(SurveyData surveyData, Carousel carousel, int i10, Intercom.Visibility launcherVisibility, Intercom.Visibility inAppNotificationsVisibility, List<Conversation> conversations, Set<String> dismissedPartIds, Activity activity, Activity activity2) {
        i.e(surveyData, "surveyData");
        i.e(carousel, "carousel");
        i.e(launcherVisibility, "launcherVisibility");
        i.e(inAppNotificationsVisibility, "inAppNotificationsVisibility");
        i.e(conversations, "conversations");
        i.e(dismissedPartIds, "dismissedPartIds");
        return new OverlayState(surveyData, carousel, i10, launcherVisibility, inAppNotificationsVisibility, conversations, dismissedPartIds, activity, activity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayState)) {
            return false;
        }
        OverlayState overlayState = (OverlayState) obj;
        return i.a(this.surveyData, overlayState.surveyData) && i.a(this.carousel, overlayState.carousel) && this.bottomPadding == overlayState.bottomPadding && this.launcherVisibility == overlayState.launcherVisibility && this.inAppNotificationsVisibility == overlayState.inAppNotificationsVisibility && i.a(this.conversations, overlayState.conversations) && i.a(this.dismissedPartIds, overlayState.dismissedPartIds) && i.a(this.resumedHostActivity, overlayState.resumedHostActivity) && i.a(this.pausedHostActivity, overlayState.pausedHostActivity);
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final Carousel getCarousel() {
        return this.carousel;
    }

    public final List<Conversation> getConversations() {
        return this.conversations;
    }

    public final Set<String> getDismissedPartIds() {
        return this.dismissedPartIds;
    }

    public final Intercom.Visibility getInAppNotificationsVisibility() {
        return this.inAppNotificationsVisibility;
    }

    public final Intercom.Visibility getLauncherVisibility() {
        return this.launcherVisibility;
    }

    public final Activity getPausedHostActivity() {
        return this.pausedHostActivity;
    }

    public final Activity getResumedHostActivity() {
        return this.resumedHostActivity;
    }

    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public int hashCode() {
        int iHashCode = (this.dismissedPartIds.hashCode() + p.d((this.inAppNotificationsVisibility.hashCode() + ((this.launcherVisibility.hashCode() + q.b(this.bottomPadding, (this.carousel.hashCode() + (this.surveyData.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31, this.conversations)) * 31;
        Activity activity = this.resumedHostActivity;
        int iHashCode2 = (iHashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Activity activity2 = this.pausedHostActivity;
        return iHashCode2 + (activity2 != null ? activity2.hashCode() : 0);
    }

    public String toString() {
        return "OverlayState(surveyData=" + this.surveyData + ", carousel=" + this.carousel + ", bottomPadding=" + this.bottomPadding + ", launcherVisibility=" + this.launcherVisibility + ", inAppNotificationsVisibility=" + this.inAppNotificationsVisibility + ", conversations=" + this.conversations + ", dismissedPartIds=" + this.dismissedPartIds + ", resumedHostActivity=" + this.resumedHostActivity + ", pausedHostActivity=" + this.pausedHostActivity + ')';
    }

    public OverlayState(SurveyData surveyData, Carousel carousel, int i10, Intercom.Visibility launcherVisibility, Intercom.Visibility inAppNotificationsVisibility, List<Conversation> conversations, Set<String> dismissedPartIds, Activity activity, Activity activity2) {
        i.e(surveyData, "surveyData");
        i.e(carousel, "carousel");
        i.e(launcherVisibility, "launcherVisibility");
        i.e(inAppNotificationsVisibility, "inAppNotificationsVisibility");
        i.e(conversations, "conversations");
        i.e(dismissedPartIds, "dismissedPartIds");
        this.surveyData = surveyData;
        this.carousel = carousel;
        this.bottomPadding = i10;
        this.launcherVisibility = launcherVisibility;
        this.inAppNotificationsVisibility = inAppNotificationsVisibility;
        this.conversations = conversations;
        this.dismissedPartIds = dismissedPartIds;
        this.resumedHostActivity = activity;
        this.pausedHostActivity = activity2;
    }

    public OverlayState(SurveyData surveyData, Carousel carousel, int i10, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i11, e eVar) {
        this((i11 & 1) != 0 ? SurveyData.Companion.getNULL() : surveyData, (i11 & 2) != 0 ? Carousel.NULL : carousel, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? Intercom.Visibility.GONE : visibility, (i11 & 16) != 0 ? Intercom.Visibility.VISIBLE : visibility2, (i11 & 32) != 0 ? EmptyList.f42983b : list, (i11 & 64) != 0 ? EmptySet.f42985b : set, (i11 & 128) != 0 ? null : activity, (i11 & 256) == 0 ? activity2 : null);
    }
}
