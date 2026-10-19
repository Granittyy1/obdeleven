package io.intercom.android.sdk.m5.conversation.states;

import B7.b;
import androidx.compose.animation.D;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BottomBarUiState {
    public static final int $stable = 8;
    private final BottomBadgeState bottomBadge;
    private final List<BottomBarButton> buttons;
    private final ComposerState composerState;
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean finDictationEnabled;
    private final InputTypeState inputTypeState;

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public interface BottomBadgeState {

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class None implements BottomBadgeState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public int hashCode() {
                return -495368601;
            }

            public String toString() {
                return "None";
            }
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class PoweredByBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final PoweredBy poweredBy;

            public PoweredByBadgeState(PoweredBy poweredBy) {
                i.e(poweredBy, "poweredBy");
                this.poweredBy = poweredBy;
            }

            public static /* synthetic */ PoweredByBadgeState copy$default(PoweredByBadgeState poweredByBadgeState, PoweredBy poweredBy, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    poweredBy = poweredByBadgeState.poweredBy;
                }
                return poweredByBadgeState.copy(poweredBy);
            }

            public final PoweredBy component1() {
                return this.poweredBy;
            }

            public final PoweredByBadgeState copy(PoweredBy poweredBy) {
                i.e(poweredBy, "poweredBy");
                return new PoweredByBadgeState(poweredBy);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PoweredByBadgeState) && i.a(this.poweredBy, ((PoweredByBadgeState) obj).poweredBy);
            }

            public final PoweredBy getPoweredBy() {
                return this.poweredBy;
            }

            public int hashCode() {
                return this.poweredBy.hashCode();
            }

            public String toString() {
                return "PoweredByBadgeState(poweredBy=" + this.poweredBy + ')';
            }
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class PrivacyNoticeBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final String text;

            public PrivacyNoticeBadgeState(String text) {
                i.e(text, "text");
                this.text = text;
            }

            public static /* synthetic */ PrivacyNoticeBadgeState copy$default(PrivacyNoticeBadgeState privacyNoticeBadgeState, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = privacyNoticeBadgeState.text;
                }
                return privacyNoticeBadgeState.copy(str);
            }

            public final String component1() {
                return this.text;
            }

            public final PrivacyNoticeBadgeState copy(String text) {
                i.e(text, "text");
                return new PrivacyNoticeBadgeState(text);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrivacyNoticeBadgeState) && i.a(this.text, ((PrivacyNoticeBadgeState) obj).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return b.g(new StringBuilder("PrivacyNoticeBadgeState(text="), this.text, ')');
            }
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static abstract class BottomBarButton {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class GifInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final GifInsert INSTANCE = new GifInsert();

            private GifInsert() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GifInsert);
            }

            public int hashCode() {
                return 806342211;
            }

            public String toString() {
                return "GifInsert";
            }
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class MediaInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final MediaInsert INSTANCE = new MediaInsert();

            private MediaInsert() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof MediaInsert);
            }

            public int hashCode() {
                return -196410141;
            }

            public String toString() {
                return "MediaInsert";
            }
        }

        public /* synthetic */ BottomBarButton(e eVar) {
            this();
        }

        private BottomBarButton() {
        }
    }

    public BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, List list, boolean z10, BottomBadgeState bottomBadgeState, int i10, e eVar) {
        this(composerState, currentlyTypingState, inputTypeState, (i10 & 8) != 0 ? EmptyList.f42983b : list, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? BottomBadgeState.None.INSTANCE : bottomBadgeState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomBarUiState copy$default(BottomBarUiState bottomBarUiState, ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, List list, boolean z10, BottomBadgeState bottomBadgeState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composerState = bottomBarUiState.composerState;
        }
        if ((i10 & 2) != 0) {
            currentlyTypingState = bottomBarUiState.currentlyTypingState;
        }
        CurrentlyTypingState currentlyTypingState2 = currentlyTypingState;
        if ((i10 & 4) != 0) {
            inputTypeState = bottomBarUiState.inputTypeState;
        }
        InputTypeState inputTypeState2 = inputTypeState;
        if ((i10 & 8) != 0) {
            list = bottomBarUiState.buttons;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            z10 = bottomBarUiState.finDictationEnabled;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            bottomBadgeState = bottomBarUiState.bottomBadge;
        }
        return bottomBarUiState.copy(composerState, currentlyTypingState2, inputTypeState2, list2, z11, bottomBadgeState);
    }

    public final ComposerState component1() {
        return this.composerState;
    }

    public final CurrentlyTypingState component2() {
        return this.currentlyTypingState;
    }

    public final InputTypeState component3() {
        return this.inputTypeState;
    }

    public final List<BottomBarButton> component4() {
        return this.buttons;
    }

    public final boolean component5() {
        return this.finDictationEnabled;
    }

    public final BottomBadgeState component6() {
        return this.bottomBadge;
    }

    public final BottomBarUiState copy(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, List<? extends BottomBarButton> buttons, boolean z10, BottomBadgeState bottomBadge) {
        i.e(composerState, "composerState");
        i.e(currentlyTypingState, "currentlyTypingState");
        i.e(inputTypeState, "inputTypeState");
        i.e(buttons, "buttons");
        i.e(bottomBadge, "bottomBadge");
        return new BottomBarUiState(composerState, currentlyTypingState, inputTypeState, buttons, z10, bottomBadge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarUiState)) {
            return false;
        }
        BottomBarUiState bottomBarUiState = (BottomBarUiState) obj;
        return i.a(this.composerState, bottomBarUiState.composerState) && i.a(this.currentlyTypingState, bottomBarUiState.currentlyTypingState) && i.a(this.inputTypeState, bottomBarUiState.inputTypeState) && i.a(this.buttons, bottomBarUiState.buttons) && this.finDictationEnabled == bottomBarUiState.finDictationEnabled && i.a(this.bottomBadge, bottomBarUiState.bottomBadge);
    }

    public final BottomBadgeState getBottomBadge() {
        return this.bottomBadge;
    }

    public final List<BottomBarButton> getButtons() {
        return this.buttons;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final boolean getFinDictationEnabled() {
        return this.finDictationEnabled;
    }

    public final InputTypeState getInputTypeState() {
        return this.inputTypeState;
    }

    public int hashCode() {
        return this.bottomBadge.hashCode() + D.b(p.d((this.inputTypeState.hashCode() + ((this.currentlyTypingState.hashCode() + (this.composerState.hashCode() * 31)) * 31)) * 31, 31, this.buttons), 31, this.finDictationEnabled);
    }

    public String toString() {
        return "BottomBarUiState(composerState=" + this.composerState + ", currentlyTypingState=" + this.currentlyTypingState + ", inputTypeState=" + this.inputTypeState + ", buttons=" + this.buttons + ", finDictationEnabled=" + this.finDictationEnabled + ", bottomBadge=" + this.bottomBadge + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, List<? extends BottomBarButton> buttons, boolean z10, BottomBadgeState bottomBadge) {
        i.e(composerState, "composerState");
        i.e(currentlyTypingState, "currentlyTypingState");
        i.e(inputTypeState, "inputTypeState");
        i.e(buttons, "buttons");
        i.e(bottomBadge, "bottomBadge");
        this.composerState = composerState;
        this.currentlyTypingState = currentlyTypingState;
        this.inputTypeState = inputTypeState;
        this.buttons = buttons;
        this.finDictationEnabled = z10;
        this.bottomBadge = bottomBadge;
    }
}
