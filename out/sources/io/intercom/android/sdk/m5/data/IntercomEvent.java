package io.intercom.android.sdk.m5.data;

import C4.a;
import android.app.Activity;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Conversation;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomDataLayer.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomEvent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class ActivityPaused extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityPaused(Activity activity) {
            super(null);
            i.e(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ ActivityPaused copy$default(ActivityPaused activityPaused, Activity activity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity = activityPaused.activity;
            }
            return activityPaused.copy(activity);
        }

        public final Activity component1() {
            return this.activity;
        }

        public final ActivityPaused copy(Activity activity) {
            i.e(activity, "activity");
            return new ActivityPaused(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityPaused) && i.a(this.activity, ((ActivityPaused) obj).activity);
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityPaused(activity=" + this.activity + ')';
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class ActivityReadyForViewAttachment extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityReadyForViewAttachment(Activity activity) {
            super(null);
            i.e(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ ActivityReadyForViewAttachment copy$default(ActivityReadyForViewAttachment activityReadyForViewAttachment, Activity activity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity = activityReadyForViewAttachment.activity;
            }
            return activityReadyForViewAttachment.copy(activity);
        }

        public final Activity component1() {
            return this.activity;
        }

        public final ActivityReadyForViewAttachment copy(Activity activity) {
            i.e(activity, "activity");
            return new ActivityReadyForViewAttachment(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityReadyForViewAttachment) && i.a(this.activity, ((ActivityReadyForViewAttachment) obj).activity);
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityReadyForViewAttachment(activity=" + this.activity + ')';
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class ActivityStopped extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityStopped(Activity activity) {
            super(null);
            i.e(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ ActivityStopped copy$default(ActivityStopped activityStopped, Activity activity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity = activityStopped.activity;
            }
            return activityStopped.copy(activity);
        }

        public final Activity component1() {
            return this.activity;
        }

        public final ActivityStopped copy(Activity activity) {
            i.e(activity, "activity");
            return new ActivityStopped(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityStopped) && i.a(this.activity, ((ActivityStopped) obj).activity);
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityStopped(activity=" + this.activity + ')';
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class AppEnteredBackground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public AppEnteredBackground(long j) {
            super(null);
            this.timestamp = j;
        }

        public static /* synthetic */ AppEnteredBackground copy$default(AppEnteredBackground appEnteredBackground, long j, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j = appEnteredBackground.timestamp;
            }
            return appEnteredBackground.copy(j);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final AppEnteredBackground copy(long j) {
            return new AppEnteredBackground(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppEnteredBackground) && this.timestamp == ((AppEnteredBackground) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return a.h(new StringBuilder("AppEnteredBackground(timestamp="), this.timestamp, ')');
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class AppEnteredForeground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public AppEnteredForeground(long j) {
            super(null);
            this.timestamp = j;
        }

        public static /* synthetic */ AppEnteredForeground copy$default(AppEnteredForeground appEnteredForeground, long j, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j = appEnteredForeground.timestamp;
            }
            return appEnteredForeground.copy(j);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final AppEnteredForeground copy(long j) {
            return new AppEnteredForeground(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppEnteredForeground) && this.timestamp == ((AppEnteredForeground) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return a.h(new StringBuilder("AppEnteredForeground(timestamp="), this.timestamp, ')');
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class BaseResponseReceived extends IntercomEvent {
        public static final int $stable = 8;
        private final BaseResponse baseResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseResponseReceived(BaseResponse baseResponse) {
            super(null);
            i.e(baseResponse, "baseResponse");
            this.baseResponse = baseResponse;
        }

        public static /* synthetic */ BaseResponseReceived copy$default(BaseResponseReceived baseResponseReceived, BaseResponse baseResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                baseResponse = baseResponseReceived.baseResponse;
            }
            return baseResponseReceived.copy(baseResponse);
        }

        public final BaseResponse component1() {
            return this.baseResponse;
        }

        public final BaseResponseReceived copy(BaseResponse baseResponse) {
            i.e(baseResponse, "baseResponse");
            return new BaseResponseReceived(baseResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BaseResponseReceived) && i.a(this.baseResponse, ((BaseResponseReceived) obj).baseResponse);
        }

        public final BaseResponse getBaseResponse() {
            return this.baseResponse;
        }

        public int hashCode() {
            return this.baseResponse.hashCode();
        }

        public String toString() {
            return "BaseResponseReceived(baseResponse=" + this.baseResponse + ')';
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class CardUpdated extends IntercomEvent {
        public static final int $stable = 0;
        public static final CardUpdated INSTANCE = new CardUpdated();

        private CardUpdated() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class NewConversation extends IntercomEvent {
        public static final int $stable = 8;
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewConversation(Conversation conversation) {
            super(null);
            i.e(conversation, "conversation");
            this.conversation = conversation;
        }

        public static /* synthetic */ NewConversation copy$default(NewConversation newConversation, Conversation conversation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversation = newConversation.conversation;
            }
            return newConversation.copy(conversation);
        }

        public final Conversation component1() {
            return this.conversation;
        }

        public final NewConversation copy(Conversation conversation) {
            i.e(conversation, "conversation");
            return new NewConversation(conversation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewConversation) && i.a(this.conversation, ((NewConversation) obj).conversation);
        }

        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "NewConversation(conversation=" + this.conversation + ')';
        }
    }

    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    public static final class SoftReset extends IntercomEvent {
        public static final int $stable = 0;
        public static final SoftReset INSTANCE = new SoftReset();

        private SoftReset() {
            super(null);
        }
    }

    public /* synthetic */ IntercomEvent(e eVar) {
        this();
    }

    private IntercomEvent() {
    }
}
