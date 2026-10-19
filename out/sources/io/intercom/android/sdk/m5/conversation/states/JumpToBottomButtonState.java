package io.intercom.android.sdk.m5.conversation.states;

import A1.C0575j;
import kotlin.jvm.internal.e;
import p005a4.q;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class JumpToBottomButtonState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int UNKNOWN_SCROLL_TO_POSITION = -1;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final int unreadMessages;

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public JumpToBottomButtonState() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ JumpToBottomButtonState copy$default(JumpToBottomButtonState jumpToBottomButtonState, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = jumpToBottomButtonState.unreadMessages;
        }
        if ((i13 & 2) != 0) {
            i11 = jumpToBottomButtonState.scrollToPosition;
        }
        if ((i13 & 4) != 0) {
            i12 = jumpToBottomButtonState.lastSeenItemIndex;
        }
        return jumpToBottomButtonState.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.unreadMessages;
    }

    public final int component2() {
        return this.scrollToPosition;
    }

    public final int component3() {
        return this.lastSeenItemIndex;
    }

    public final JumpToBottomButtonState copy(int i10, int i11, int i12) {
        return new JumpToBottomButtonState(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JumpToBottomButtonState)) {
            return false;
        }
        JumpToBottomButtonState jumpToBottomButtonState = (JumpToBottomButtonState) obj;
        return this.unreadMessages == jumpToBottomButtonState.unreadMessages && this.scrollToPosition == jumpToBottomButtonState.scrollToPosition && this.lastSeenItemIndex == jumpToBottomButtonState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSeenItemIndex) + q.b(this.scrollToPosition, Integer.hashCode(this.unreadMessages) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JumpToBottomButtonState(unreadMessages=");
        sb2.append(this.unreadMessages);
        sb2.append(", scrollToPosition=");
        sb2.append(this.scrollToPosition);
        sb2.append(", lastSeenItemIndex=");
        return C0575j.b(sb2, this.lastSeenItemIndex, ')');
    }

    public JumpToBottomButtonState(int i10, int i11, int i12) {
        this.unreadMessages = i10;
        this.scrollToPosition = i11;
        this.lastSeenItemIndex = i12;
    }

    public /* synthetic */ JumpToBottomButtonState(int i10, int i11, int i12, int i13, e eVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
