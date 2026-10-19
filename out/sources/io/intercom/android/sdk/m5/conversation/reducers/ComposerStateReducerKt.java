package io.intercom.android.sdk.m5.conversation.reducers;

import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.PrivacyNotice;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ComposerStateReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerStateReducerKt {

    /* JADX INFO: compiled from: ComposerStateReducer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationEndedButton.Reason.values().length];
            try {
                iArr[ConversationEndedButton.Reason.MERGED_INTO_CONVERSATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final BottomBarUiState.BottomBadgeState reduceBottomBadge(ConversationClientState conversationClientState) {
        PoweredBy poweredBy;
        if (conversationClientState.getConversation() == null) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            poweredBy = openMessengerResponse != null ? openMessengerResponse.getPoweredBy() : null;
        } else {
            poweredBy = conversationClientState.getConversation().getPoweredBy();
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        PrivacyNotice privacyNotice = openMessengerResponse2 != null ? openMessengerResponse2.getPrivacyNotice() : null;
        if (privacyNotice == null || privacyNotice.isDismissed() || conversationClientState.hasUserSentAMessage$intercom_sdk_base_release() || conversationClientState.getDismissedPrivacyNotice()) {
            return poweredBy != null ? new BottomBarUiState.BottomBadgeState.PoweredByBadgeState(poweredBy) : BottomBarUiState.BottomBadgeState.None.INSTANCE;
        }
        return new BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState(privacyNotice.getText());
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r15v13, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden] */
    /* JADX WARN: Type inference failed for: r15v5, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions] */
    /* JADX WARN: Type inference failed for: r15v6, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r15v7, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v9, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static final BottomBarUiState reduceComposerState(ConversationClientState clientState, AppConfig config, boolean z10) {
        ComposerState.ConversationEnded.ConversationEndedCta conversationEndedCta;
        ?? hidden;
        ?? reactions;
        ComposerState.ConversationEnded conversationEndedCopy$default;
        OpenMessengerResponse.NewConversationData newConversationData;
        ListBuilder listBuilderF;
        io.intercom.android.sdk.models.ComposerState composerState;
        ComposerSuggestions composerSuggestions;
        i.e(clientState, "clientState");
        i.e(config, "config");
        Conversation conversation = clientState.getConversation();
        boolean z11 = false;
        placeholder = null;
        String placeholder = null;
        if (conversation == null) {
            OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
            if (openMessengerResponse == null || (composerSuggestions = openMessengerResponse.getComposerSuggestions()) == null || !composerSuggestions.isComposerDisabled()) {
                ComposerState composerState2 = clientState.getComposerState();
                OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
                if (openMessengerResponse2 != null && (composerState = openMessengerResponse2.getComposerState()) != null) {
                    placeholder = composerState.getPlaceholder();
                }
                reactions = reduceTextInput(composerState2, z10, placeholder, false);
            } else {
                reactions = new ComposerState.Hidden(false, 1, null);
            }
        } else {
            ?? r10 = AppConfigExtensionsKt.canStartNewConversation(config) && !conversation.getInboundConversationsDisabled();
            OpenMessengerResponse openMessengerResponse3 = clientState.getOpenMessengerResponse();
            OpenMessengerResponse.NewConversationData.Cta cta = (openMessengerResponse3 == null || (newConversationData = openMessengerResponse3.getNewConversationData()) == null) ? null : newConversationData.getCta();
            if (!r10 == true || cta == null) {
                conversationEndedCta = null;
            } else {
                StringProvider.ActualString actualString = new StringProvider.ActualString(cta.getText());
                Integer icon = cta.getIcon().getIcon();
                conversationEndedCta = new ComposerState.ConversationEnded.ConversationEndedCta(actualString, icon != null ? icon.intValue() : R.drawable.intercom_send_message_icon, null, 4, null);
            }
            boolean zIsNull = ReactionReply.isNull(conversation.lastPart().getReactionReply());
            if (conversation.getPreventEndUserReplies()) {
                reactions = new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), conversationEndedCta);
                ConversationEndedButton conversationEndedButton = conversation.getConversationEndedButton();
                if (conversationEndedButton != null) {
                    if (WhenMappings.$EnumSwitchMapping$0[conversationEndedButton.getReason().ordinal()] == 1) {
                        conversationEndedCopy$default = reactions.copy(new StringProvider.ActualString(conversationEndedButton.getMessage()), conversationEndedButton.getMetadata() != null ? new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString(conversationEndedButton.getCtaTitle()), R.drawable.intercom_send_message_icon, conversationEndedButton.getMetadata().getMergedIntoConversationId()) : null);
                    } else {
                        conversationEndedCopy$default = ComposerState.ConversationEnded.copy$default(reactions, new StringProvider.ActualString(conversationEndedButton.getMessage()), null, 2, null);
                    }
                    if (conversationEndedCopy$default != null) {
                        reactions = conversationEndedCopy$default;
                    }
                }
            } else {
                if (!conversation.getComposerState().isVisible() || !zIsNull) {
                    if (zIsNull) {
                        List<Part> listParts = conversation.parts();
                        if (!(listParts instanceof Collection) || !listParts.isEmpty()) {
                            Iterator it = listParts.iterator();
                            while (it.hasNext()) {
                                if (((Part) it.next()).getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR) {
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                        hidden = new ComposerState.Hidden(!z11);
                    } else {
                        ReactionReply reactionReply = conversation.lastPart().getReactionReply();
                        i.d(reactionReply, "getReactionReply(...)");
                        String id = conversation.lastPart().getId();
                        i.d(id, "getId(...)");
                        reactions = new ComposerState.Reactions(reactionReply, id, conversation.getId());
                    }
                    listBuilderF = M1.f();
                    if (config.getAttachmentSettings().getGifsEnabled()) {
                        listBuilderF.add(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE);
                    }
                    if (config.getAttachmentSettings().getMediaEnabled() || config.getAttachmentSettings().getCameraEnabled() || config.getAttachmentSettings().getFilesEnabled()) {
                        listBuilderF.add(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE);
                    }
                    return new BottomBarUiState(hidden, clientState.getCurrentlyTypingState(), new InputTypeState(config.getAttachmentSettings().getMediaEnabled(), config.getAttachmentSettings().getGifsEnabled(), config.getAttachmentSettings().getCameraEnabled(), config.getAttachmentSettings().getFilesEnabled(), config.getAttachmentSettings().getTrustedFileExtensions(), config.getFinDictationUiEnabled()), listBuilderF.I(), config.getFinDictationUiEnabled(), reduceBottomBadge(clientState));
                }
                reactions = reduceTextInput(clientState.getComposerState(), z10, conversation.getComposerState().getPlaceholder(), conversation.getComposerState().isDisabled());
            }
        }
        hidden = reactions;
        listBuilderF = M1.f();
        if (config.getAttachmentSettings().getGifsEnabled()) {
            listBuilderF.add(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE);
        }
        if (config.getAttachmentSettings().getMediaEnabled()) {
            listBuilderF.add(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE);
        } else {
            listBuilderF.add(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE);
        }
        return new BottomBarUiState(hidden, clientState.getCurrentlyTypingState(), new InputTypeState(config.getAttachmentSettings().getMediaEnabled(), config.getAttachmentSettings().getGifsEnabled(), config.getAttachmentSettings().getCameraEnabled(), config.getAttachmentSettings().getFilesEnabled(), config.getAttachmentSettings().getTrustedFileExtensions(), config.getFinDictationUiEnabled()), listBuilderF.I(), config.getFinDictationUiEnabled(), reduceBottomBadge(clientState));
    }

    private static final ComposerState reduceTextInput(ComposerState composerState, boolean z10, String str, boolean z11) {
        if (!(composerState instanceof ComposerState.TextInput)) {
            return composerState;
        }
        ComposerState.TextInput textInput = (ComposerState.TextInput) composerState;
        return textInput.copy(z10 ? textInput.getInitialMessage() : "", str != null ? new StringProvider.ActualString(str) : new StringProvider.StringRes(R.string.intercom_message_placeholder, null, 2, null), z11);
    }
}
