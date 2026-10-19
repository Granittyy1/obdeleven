package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.animation.D;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CurrentlyTypingState {
    public static final int $stable = 8;
    private final AvatarWrapper avatarWrapper;
    private final StringProvider description;
    private final boolean showAvatar;
    private final TypingIndicatorType userType;

    public CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z10, StringProvider description, TypingIndicatorType userType) {
        i.e(avatarWrapper, "avatarWrapper");
        i.e(description, "description");
        i.e(userType, "userType");
        this.avatarWrapper = avatarWrapper;
        this.showAvatar = z10;
        this.description = description;
        this.userType = userType;
    }

    public static /* synthetic */ CurrentlyTypingState copy$default(CurrentlyTypingState currentlyTypingState, AvatarWrapper avatarWrapper, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatarWrapper = currentlyTypingState.avatarWrapper;
        }
        if ((i10 & 2) != 0) {
            z10 = currentlyTypingState.showAvatar;
        }
        if ((i10 & 4) != 0) {
            stringProvider = currentlyTypingState.description;
        }
        if ((i10 & 8) != 0) {
            typingIndicatorType = currentlyTypingState.userType;
        }
        return currentlyTypingState.copy(avatarWrapper, z10, stringProvider, typingIndicatorType);
    }

    public final AvatarWrapper component1() {
        return this.avatarWrapper;
    }

    public final boolean component2() {
        return this.showAvatar;
    }

    public final StringProvider component3() {
        return this.description;
    }

    public final TypingIndicatorType component4() {
        return this.userType;
    }

    public final CurrentlyTypingState copy(AvatarWrapper avatarWrapper, boolean z10, StringProvider description, TypingIndicatorType userType) {
        i.e(avatarWrapper, "avatarWrapper");
        i.e(description, "description");
        i.e(userType, "userType");
        return new CurrentlyTypingState(avatarWrapper, z10, description, userType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentlyTypingState)) {
            return false;
        }
        CurrentlyTypingState currentlyTypingState = (CurrentlyTypingState) obj;
        return i.a(this.avatarWrapper, currentlyTypingState.avatarWrapper) && this.showAvatar == currentlyTypingState.showAvatar && i.a(this.description, currentlyTypingState.description) && this.userType == currentlyTypingState.userType;
    }

    public final AvatarWrapper getAvatarWrapper() {
        return this.avatarWrapper;
    }

    public final StringProvider getDescription() {
        return this.description;
    }

    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    public final TypingIndicatorType getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return this.userType.hashCode() + ((this.description.hashCode() + D.b(this.avatarWrapper.hashCode() * 31, 31, this.showAvatar)) * 31);
    }

    public String toString() {
        return "CurrentlyTypingState(avatarWrapper=" + this.avatarWrapper + ", showAvatar=" + this.showAvatar + ", description=" + this.description + ", userType=" + this.userType + ')';
    }

    public /* synthetic */ CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i10, e eVar) {
        this((i10 & 1) != 0 ? AvatarWrapper.Companion.getNULL() : avatarWrapper, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? new StringProvider.StringRes(R.string.intercom_thinking, null, 2, null) : stringProvider, typingIndicatorType);
    }
}
