package com.google.firebase.inappmessaging;

/* JADX INFO: loaded from: classes3.dex */
public interface FirebaseInAppMessagingDisplayCallbacks {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InAppMessagingDismissType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InAppMessagingDismissType f28153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InAppMessagingDismissType f28154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final InAppMessagingDismissType f28155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InAppMessagingDismissType f28156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ InAppMessagingDismissType[] f28157f;

        static {
            InAppMessagingDismissType inAppMessagingDismissType = new InAppMessagingDismissType("UNKNOWN_DISMISS_TYPE", 0);
            f28153b = inAppMessagingDismissType;
            InAppMessagingDismissType inAppMessagingDismissType2 = new InAppMessagingDismissType("AUTO", 1);
            f28154c = inAppMessagingDismissType2;
            InAppMessagingDismissType inAppMessagingDismissType3 = new InAppMessagingDismissType("CLICK", 2);
            f28155d = inAppMessagingDismissType3;
            InAppMessagingDismissType inAppMessagingDismissType4 = new InAppMessagingDismissType("SWIPE", 3);
            f28156e = inAppMessagingDismissType4;
            f28157f = new InAppMessagingDismissType[]{inAppMessagingDismissType, inAppMessagingDismissType2, inAppMessagingDismissType3, inAppMessagingDismissType4};
        }

        public InAppMessagingDismissType() {
            throw null;
        }

        public static InAppMessagingDismissType valueOf(String str) {
            return (InAppMessagingDismissType) Enum.valueOf(InAppMessagingDismissType.class, str);
        }

        public static InAppMessagingDismissType[] values() {
            return (InAppMessagingDismissType[]) f28157f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InAppMessagingErrorReason {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InAppMessagingErrorReason f28158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InAppMessagingErrorReason f28159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final InAppMessagingErrorReason f28160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InAppMessagingErrorReason f28161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ InAppMessagingErrorReason[] f28162f;

        static {
            InAppMessagingErrorReason inAppMessagingErrorReason = new InAppMessagingErrorReason("UNSPECIFIED_RENDER_ERROR", 0);
            f28158b = inAppMessagingErrorReason;
            InAppMessagingErrorReason inAppMessagingErrorReason2 = new InAppMessagingErrorReason("IMAGE_FETCH_ERROR", 1);
            f28159c = inAppMessagingErrorReason2;
            InAppMessagingErrorReason inAppMessagingErrorReason3 = new InAppMessagingErrorReason("IMAGE_DISPLAY_ERROR", 2);
            f28160d = inAppMessagingErrorReason3;
            InAppMessagingErrorReason inAppMessagingErrorReason4 = new InAppMessagingErrorReason("IMAGE_UNSUPPORTED_FORMAT", 3);
            f28161e = inAppMessagingErrorReason4;
            f28162f = new InAppMessagingErrorReason[]{inAppMessagingErrorReason, inAppMessagingErrorReason2, inAppMessagingErrorReason3, inAppMessagingErrorReason4};
        }

        public InAppMessagingErrorReason() {
            throw null;
        }

        public static InAppMessagingErrorReason valueOf(String str) {
            return (InAppMessagingErrorReason) Enum.valueOf(InAppMessagingErrorReason.class, str);
        }

        public static InAppMessagingErrorReason[] values() {
            return (InAppMessagingErrorReason[]) f28162f.clone();
        }
    }
}
