package io.intercom.android.sdk.m5.conversation.ui.components.row;

/* JADX INFO: compiled from: BubbleMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FailedMessage {
    public static final int $stable = 0;
    private final String message;
    private final Ia.a<p293xa.r> onRetryMessageClicked;

    public FailedMessage(String message, Ia.a<p293xa.r> onRetryMessageClicked) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(onRetryMessageClicked, "onRetryMessageClicked");
        this.message = message;
        this.onRetryMessageClicked = onRetryMessageClicked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedMessage copy$default(FailedMessage failedMessage, String str, Ia.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = failedMessage.message;
        }
        if ((i10 & 2) != 0) {
            aVar = failedMessage.onRetryMessageClicked;
        }
        return failedMessage.copy(str, aVar);
    }

    public final String component1() {
        return this.message;
    }

    public final Ia.a<p293xa.r> component2() {
        return this.onRetryMessageClicked;
    }

    public final FailedMessage copy(String message, Ia.a<p293xa.r> onRetryMessageClicked) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(onRetryMessageClicked, "onRetryMessageClicked");
        return new FailedMessage(message, onRetryMessageClicked);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedMessage)) {
            return false;
        }
        FailedMessage failedMessage = (FailedMessage) obj;
        return kotlin.jvm.internal.i.a(this.message, failedMessage.message) && kotlin.jvm.internal.i.a(this.onRetryMessageClicked, failedMessage.onRetryMessageClicked);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Ia.a<p293xa.r> getOnRetryMessageClicked() {
        return this.onRetryMessageClicked;
    }

    public int hashCode() {
        return this.onRetryMessageClicked.hashCode() + (this.message.hashCode() * 31);
    }

    public String toString() {
        return "FailedMessage(message=" + this.message + ", onRetryMessageClicked=" + this.onRetryMessageClicked + ')';
    }
}
