package io.intercom.android.sdk.m5.conversation.usecase;

import A1.C0575j;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import p005a4.q;

/* JADX INFO: compiled from: UpdateFloatingIndicatorUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScrolledState {
    public static final int $stable = 0;
    private final boolean isLandscape;
    private final boolean isLargeFont;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final boolean scrolled;

    public ConversationScrolledState(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        this.scrolled = z10;
        this.scrollToPosition = i10;
        this.isLandscape = z11;
        this.isLargeFont = z12;
        this.lastSeenItemIndex = i11;
    }

    public static /* synthetic */ ConversationScrolledState copy$default(ConversationScrolledState conversationScrolledState, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = conversationScrolledState.scrolled;
        }
        if ((i12 & 2) != 0) {
            i10 = conversationScrolledState.scrollToPosition;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            z11 = conversationScrolledState.isLandscape;
        }
        boolean z13 = z11;
        if ((i12 & 8) != 0) {
            z12 = conversationScrolledState.isLargeFont;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            i11 = conversationScrolledState.lastSeenItemIndex;
        }
        return conversationScrolledState.copy(z10, i13, z13, z14, i11);
    }

    public final boolean component1() {
        return this.scrolled;
    }

    public final int component2() {
        return this.scrollToPosition;
    }

    public final boolean component3() {
        return this.isLandscape;
    }

    public final boolean component4() {
        return this.isLargeFont;
    }

    public final int component5() {
        return this.lastSeenItemIndex;
    }

    public final ConversationScrolledState copy(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        return new ConversationScrolledState(z10, i10, z11, z12, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationScrolledState)) {
            return false;
        }
        ConversationScrolledState conversationScrolledState = (ConversationScrolledState) obj;
        return this.scrolled == conversationScrolledState.scrolled && this.scrollToPosition == conversationScrolledState.scrollToPosition && this.isLandscape == conversationScrolledState.isLandscape && this.isLargeFont == conversationScrolledState.isLargeFont && this.lastSeenItemIndex == conversationScrolledState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final boolean getScrolled() {
        return this.scrolled;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSeenItemIndex) + D.b(D.b(q.b(this.scrollToPosition, Boolean.hashCode(this.scrolled) * 31, 31), 31, this.isLandscape), 31, this.isLargeFont);
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public final boolean isLargeFont() {
        return this.isLargeFont;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationScrolledState(scrolled=");
        sb2.append(this.scrolled);
        sb2.append(", scrollToPosition=");
        sb2.append(this.scrollToPosition);
        sb2.append(", isLandscape=");
        sb2.append(this.isLandscape);
        sb2.append(", isLargeFont=");
        sb2.append(this.isLargeFont);
        sb2.append(", lastSeenItemIndex=");
        return C0575j.b(sb2, this.lastSeenItemIndex, ')');
    }

    public /* synthetic */ ConversationScrolledState(boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, e eVar) {
        this(z10, i10, z11, z12, (i12 & 16) != 0 ? 0 : i11);
    }
}
