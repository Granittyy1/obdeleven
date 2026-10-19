package io.intercom.android.sdk.m5.conversation.states;

import B1.a;
import B7.b;
import Z3.o;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface ComposerState {

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Hidden implements ComposerState {
        public static final int $stable = 0;
        private final boolean hideKeyboard;

        public Hidden() {
            this(false, 1, null);
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = hidden.hideKeyboard;
            }
            return hidden.copy(z10);
        }

        public final boolean component1() {
            return this.hideKeyboard;
        }

        public final Hidden copy(boolean z10) {
            return new Hidden(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hidden) && this.hideKeyboard == ((Hidden) obj).hideKeyboard;
        }

        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideKeyboard);
        }

        public String toString() {
            return o.d(new StringBuilder("Hidden(hideKeyboard="), this.hideKeyboard, ')');
        }

        public Hidden(boolean z10) {
            this.hideKeyboard = z10;
        }

        public /* synthetic */ Hidden(boolean z10, int i10, e eVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Reactions implements ComposerState {
        public static final int $stable = 8;
        private final String conversationId;
        private final String lastPartId;
        private final ReactionReply reactionReply;

        public Reactions(ReactionReply reactionReply, String lastPartId, String conversationId) {
            i.e(reactionReply, "reactionReply");
            i.e(lastPartId, "lastPartId");
            i.e(conversationId, "conversationId");
            this.reactionReply = reactionReply;
            this.lastPartId = lastPartId;
            this.conversationId = conversationId;
        }

        public static /* synthetic */ Reactions copy$default(Reactions reactions, ReactionReply reactionReply, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                reactionReply = reactions.reactionReply;
            }
            if ((i10 & 2) != 0) {
                str = reactions.lastPartId;
            }
            if ((i10 & 4) != 0) {
                str2 = reactions.conversationId;
            }
            return reactions.copy(reactionReply, str, str2);
        }

        public final ReactionReply component1() {
            return this.reactionReply;
        }

        public final String component2() {
            return this.lastPartId;
        }

        public final String component3() {
            return this.conversationId;
        }

        public final Reactions copy(ReactionReply reactionReply, String lastPartId, String conversationId) {
            i.e(reactionReply, "reactionReply");
            i.e(lastPartId, "lastPartId");
            i.e(conversationId, "conversationId");
            return new Reactions(reactionReply, lastPartId, conversationId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) obj;
            return i.a(this.reactionReply, reactions.reactionReply) && i.a(this.lastPartId, reactions.lastPartId) && i.a(this.conversationId, reactions.conversationId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getLastPartId() {
            return this.lastPartId;
        }

        public final ReactionReply getReactionReply() {
            return this.reactionReply;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + a.b(this.lastPartId, this.reactionReply.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Reactions(reactionReply=");
            sb2.append(this.reactionReply);
            sb2.append(", lastPartId=");
            sb2.append(this.lastPartId);
            sb2.append(", conversationId=");
            return b.g(sb2, this.conversationId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class VoiceInput implements ComposerState {
        public static final int $stable = 0;
        public static final VoiceInput INSTANCE = new VoiceInput();

        private VoiceInput() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceInput);
        }

        public int hashCode() {
            return 346618184;
        }

        public String toString() {
            return "VoiceInput";
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class ConversationEnded implements ComposerState {
        public static final int $stable = StringProvider.$stable;
        private final ConversationEndedCta cta;
        private final StringProvider message;

        public ConversationEnded(StringProvider message, ConversationEndedCta conversationEndedCta) {
            i.e(message, "message");
            this.message = message;
            this.cta = conversationEndedCta;
        }

        public static /* synthetic */ ConversationEnded copy$default(ConversationEnded conversationEnded, StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                stringProvider = conversationEnded.message;
            }
            if ((i10 & 2) != 0) {
                conversationEndedCta = conversationEnded.cta;
            }
            return conversationEnded.copy(stringProvider, conversationEndedCta);
        }

        public final StringProvider component1() {
            return this.message;
        }

        public final ConversationEndedCta component2() {
            return this.cta;
        }

        public final ConversationEnded copy(StringProvider message, ConversationEndedCta conversationEndedCta) {
            i.e(message, "message");
            return new ConversationEnded(message, conversationEndedCta);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationEnded)) {
                return false;
            }
            ConversationEnded conversationEnded = (ConversationEnded) obj;
            return i.a(this.message, conversationEnded.message) && i.a(this.cta, conversationEnded.cta);
        }

        public final ConversationEndedCta getCta() {
            return this.cta;
        }

        public final StringProvider getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            ConversationEndedCta conversationEndedCta = this.cta;
            return iHashCode + (conversationEndedCta == null ? 0 : conversationEndedCta.hashCode());
        }

        public String toString() {
            return "ConversationEnded(message=" + this.message + ", cta=" + this.cta + ')';
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class ConversationEndedCta {
            public static final int $stable = StringProvider.$stable;
            private final String linkedConversationId;
            private final StringProvider title;
            private final int trailingIcon;

            public ConversationEndedCta(StringProvider title, int i10, String str) {
                i.e(title, "title");
                this.title = title;
                this.trailingIcon = i10;
                this.linkedConversationId = str;
            }

            public static /* synthetic */ ConversationEndedCta copy$default(ConversationEndedCta conversationEndedCta, StringProvider stringProvider, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    stringProvider = conversationEndedCta.title;
                }
                if ((i11 & 2) != 0) {
                    i10 = conversationEndedCta.trailingIcon;
                }
                if ((i11 & 4) != 0) {
                    str = conversationEndedCta.linkedConversationId;
                }
                return conversationEndedCta.copy(stringProvider, i10, str);
            }

            public final StringProvider component1() {
                return this.title;
            }

            public final int component2() {
                return this.trailingIcon;
            }

            public final String component3() {
                return this.linkedConversationId;
            }

            public final ConversationEndedCta copy(StringProvider title, int i10, String str) {
                i.e(title, "title");
                return new ConversationEndedCta(title, i10, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConversationEndedCta)) {
                    return false;
                }
                ConversationEndedCta conversationEndedCta = (ConversationEndedCta) obj;
                return i.a(this.title, conversationEndedCta.title) && this.trailingIcon == conversationEndedCta.trailingIcon && i.a(this.linkedConversationId, conversationEndedCta.linkedConversationId);
            }

            public final String getLinkedConversationId() {
                return this.linkedConversationId;
            }

            public final StringProvider getTitle() {
                return this.title;
            }

            public final int getTrailingIcon() {
                return this.trailingIcon;
            }

            public int hashCode() {
                int iB = q.b(this.trailingIcon, this.title.hashCode() * 31, 31);
                String str = this.linkedConversationId;
                return iB + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ConversationEndedCta(title=");
                sb2.append(this.title);
                sb2.append(", trailingIcon=");
                sb2.append(this.trailingIcon);
                sb2.append(", linkedConversationId=");
                return b.g(sb2, this.linkedConversationId, ')');
            }

            public /* synthetic */ ConversationEndedCta(StringProvider stringProvider, int i10, String str, int i11, e eVar) {
                this(stringProvider, i10, (i11 & 4) != 0 ? null : str);
            }
        }

        public /* synthetic */ ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i10, e eVar) {
            this(stringProvider, (i10 & 2) != 0 ? null : conversationEndedCta);
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class TextInput implements ComposerState {
        public static final int $stable = StringProvider.$stable;
        private final StringProvider hintText;
        private final String initialMessage;
        private final boolean isDisabled;

        public TextInput(String initialMessage, StringProvider hintText, boolean z10) {
            i.e(initialMessage, "initialMessage");
            i.e(hintText, "hintText");
            this.initialMessage = initialMessage;
            this.hintText = hintText;
            this.isDisabled = z10;
        }

        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, StringProvider stringProvider, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textInput.initialMessage;
            }
            if ((i10 & 2) != 0) {
                stringProvider = textInput.hintText;
            }
            if ((i10 & 4) != 0) {
                z10 = textInput.isDisabled;
            }
            return textInput.copy(str, stringProvider, z10);
        }

        public final String component1() {
            return this.initialMessage;
        }

        public final StringProvider component2() {
            return this.hintText;
        }

        public final boolean component3() {
            return this.isDisabled;
        }

        public final TextInput copy(String initialMessage, StringProvider hintText, boolean z10) {
            i.e(initialMessage, "initialMessage");
            i.e(hintText, "hintText");
            return new TextInput(initialMessage, hintText, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) obj;
            return i.a(this.initialMessage, textInput.initialMessage) && i.a(this.hintText, textInput.hintText) && this.isDisabled == textInput.isDisabled;
        }

        public final StringProvider getHintText() {
            return this.hintText;
        }

        public final String getInitialMessage() {
            return this.initialMessage;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDisabled) + ((this.hintText.hashCode() + (this.initialMessage.hashCode() * 31)) * 31);
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("TextInput(initialMessage=");
            sb2.append(this.initialMessage);
            sb2.append(", hintText=");
            sb2.append(this.hintText);
            sb2.append(", isDisabled=");
            return o.d(sb2, this.isDisabled, ')');
        }

        public /* synthetic */ TextInput(String str, StringProvider stringProvider, boolean z10, int i10, e eVar) {
            this(str, stringProvider, (i10 & 4) != 0 ? false : z10);
        }
    }
}
