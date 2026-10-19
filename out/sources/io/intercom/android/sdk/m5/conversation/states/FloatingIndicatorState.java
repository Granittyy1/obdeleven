package io.intercom.android.sdk.m5.conversation.states;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface FloatingIndicatorState {

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class FooterNoticeIndicator implements FloatingIndicatorState {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeIndicator(FooterNoticeState footerNoticeState) {
            i.e(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeIndicator copy$default(FooterNoticeIndicator footerNoticeIndicator, FooterNoticeState footerNoticeState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                footerNoticeState = footerNoticeIndicator.footerNoticeState;
            }
            return footerNoticeIndicator.copy(footerNoticeState);
        }

        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        public final FooterNoticeIndicator copy(FooterNoticeState footerNoticeState) {
            i.e(footerNoticeState, "footerNoticeState");
            return new FooterNoticeIndicator(footerNoticeState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeIndicator) && i.a(this.footerNoticeState, ((FooterNoticeIndicator) obj).footerNoticeState);
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeIndicator(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class JumpToBottomIndicator implements FloatingIndicatorState {
        public static final int $stable = 0;
        private final JumpToBottomButtonState jumpToBottomButtonState;

        public JumpToBottomIndicator(JumpToBottomButtonState jumpToBottomButtonState) {
            i.e(jumpToBottomButtonState, "jumpToBottomButtonState");
            this.jumpToBottomButtonState = jumpToBottomButtonState;
        }

        public static /* synthetic */ JumpToBottomIndicator copy$default(JumpToBottomIndicator jumpToBottomIndicator, JumpToBottomButtonState jumpToBottomButtonState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jumpToBottomButtonState = jumpToBottomIndicator.jumpToBottomButtonState;
            }
            return jumpToBottomIndicator.copy(jumpToBottomButtonState);
        }

        public final JumpToBottomButtonState component1() {
            return this.jumpToBottomButtonState;
        }

        public final JumpToBottomIndicator copy(JumpToBottomButtonState jumpToBottomButtonState) {
            i.e(jumpToBottomButtonState, "jumpToBottomButtonState");
            return new JumpToBottomIndicator(jumpToBottomButtonState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JumpToBottomIndicator) && i.a(this.jumpToBottomButtonState, ((JumpToBottomIndicator) obj).jumpToBottomButtonState);
        }

        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }

        public int hashCode() {
            return this.jumpToBottomButtonState.hashCode();
        }

        public String toString() {
            return "JumpToBottomIndicator(jumpToBottomButtonState=" + this.jumpToBottomButtonState + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class None implements FloatingIndicatorState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return 1010280075;
        }

        public String toString() {
            return "None";
        }
    }
}
