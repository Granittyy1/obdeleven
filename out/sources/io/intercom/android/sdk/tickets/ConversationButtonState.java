package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: TicketDetailState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationButtonState {
    public static final int $stable = StringProvider.$stable;
    private final Integer iconRes;
    private final boolean showButton;
    private final StringProvider text;

    public ConversationButtonState(boolean z10, Integer num, StringProvider text) {
        kotlin.jvm.internal.i.e(text, "text");
        this.showButton = z10;
        this.iconRes = num;
        this.text = text;
    }

    public static /* synthetic */ ConversationButtonState copy$default(ConversationButtonState conversationButtonState, boolean z10, Integer num, StringProvider stringProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = conversationButtonState.showButton;
        }
        if ((i10 & 2) != 0) {
            num = conversationButtonState.iconRes;
        }
        if ((i10 & 4) != 0) {
            stringProvider = conversationButtonState.text;
        }
        return conversationButtonState.copy(z10, num, stringProvider);
    }

    public final boolean component1() {
        return this.showButton;
    }

    public final Integer component2() {
        return this.iconRes;
    }

    public final StringProvider component3() {
        return this.text;
    }

    public final ConversationButtonState copy(boolean z10, Integer num, StringProvider text) {
        kotlin.jvm.internal.i.e(text, "text");
        return new ConversationButtonState(z10, num, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationButtonState)) {
            return false;
        }
        ConversationButtonState conversationButtonState = (ConversationButtonState) obj;
        return this.showButton == conversationButtonState.showButton && kotlin.jvm.internal.i.a(this.iconRes, conversationButtonState.iconRes) && kotlin.jvm.internal.i.a(this.text, conversationButtonState.text);
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    public final StringProvider getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showButton) * 31;
        Integer num = this.iconRes;
        return this.text.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        return "ConversationButtonState(showButton=" + this.showButton + ", iconRes=" + this.iconRes + ", text=" + this.text + ')';
    }
}
