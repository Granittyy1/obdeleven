package io.intercom.android.sdk.m5.conversation.states;

import B7.b;
import C4.a;
import Q8.d;
import Z3.o;
import androidx.compose.animation.D;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.tickets.TicketDetailState;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface ContentRow {

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class AskedAboutRow implements ContentRow {
        public static final int $stable = 8;
        private final Part part;

        public AskedAboutRow(Part part) {
            i.e(part, "part");
            this.part = part;
        }

        public static /* synthetic */ AskedAboutRow copy$default(AskedAboutRow askedAboutRow, Part part, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = askedAboutRow.part;
            }
            return askedAboutRow.copy(part);
        }

        public final Part component1() {
            return this.part;
        }

        public final AskedAboutRow copy(Part part) {
            i.e(part, "part");
            return new AskedAboutRow(part);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AskedAboutRow) && i.a(this.part, ((AskedAboutRow) obj).part);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "asked_about_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.part.hashCode();
        }

        public String toString() {
            return "AskedAboutRow(part=" + this.part + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class BigTicketRow implements ContentRow {
        public static final int $stable = 8;
        private final TicketDetailState.TicketDetailContentState ticketDetailContentState;
        private final String ticketId;

        public BigTicketRow(TicketDetailState.TicketDetailContentState ticketDetailContentState, String ticketId) {
            i.e(ticketDetailContentState, "ticketDetailContentState");
            i.e(ticketId, "ticketId");
            this.ticketDetailContentState = ticketDetailContentState;
            this.ticketId = ticketId;
        }

        public static /* synthetic */ BigTicketRow copy$default(BigTicketRow bigTicketRow, TicketDetailState.TicketDetailContentState ticketDetailContentState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ticketDetailContentState = bigTicketRow.ticketDetailContentState;
            }
            if ((i10 & 2) != 0) {
                str = bigTicketRow.ticketId;
            }
            return bigTicketRow.copy(ticketDetailContentState, str);
        }

        public final TicketDetailState.TicketDetailContentState component1() {
            return this.ticketDetailContentState;
        }

        public final String component2() {
            return this.ticketId;
        }

        public final BigTicketRow copy(TicketDetailState.TicketDetailContentState ticketDetailContentState, String ticketId) {
            i.e(ticketDetailContentState, "ticketDetailContentState");
            i.e(ticketId, "ticketId");
            return new BigTicketRow(ticketDetailContentState, ticketId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BigTicketRow)) {
                return false;
            }
            BigTicketRow bigTicketRow = (BigTicketRow) obj;
            return i.a(this.ticketDetailContentState, bigTicketRow.ticketDetailContentState) && i.a(this.ticketId, bigTicketRow.ticketId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "big_ticket_row_" + this.ticketId;
        }

        public final TicketDetailState.TicketDetailContentState getTicketDetailContentState() {
            return this.ticketDetailContentState;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.ticketId.hashCode() + (this.ticketDetailContentState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BigTicketRow(ticketDetailContentState=");
            sb2.append(this.ticketDetailContentState);
            sb2.append(", ticketId=");
            return b.g(sb2, this.ticketId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class ComposerSuggestionRow implements ContentRow {
        public static final int $stable = 8;
        private final List<ReplySuggestion> suggestions;

        public ComposerSuggestionRow(List<ReplySuggestion> suggestions) {
            i.e(suggestions, "suggestions");
            this.suggestions = suggestions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComposerSuggestionRow copy$default(ComposerSuggestionRow composerSuggestionRow, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = composerSuggestionRow.suggestions;
            }
            return composerSuggestionRow.copy(list);
        }

        public final List<ReplySuggestion> component1() {
            return this.suggestions;
        }

        public final ComposerSuggestionRow copy(List<ReplySuggestion> suggestions) {
            i.e(suggestions, "suggestions");
            return new ComposerSuggestionRow(suggestions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerSuggestionRow) && i.a(this.suggestions, ((ComposerSuggestionRow) obj).suggestions);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "composer_suggestion_row_" + this.suggestions.hashCode();
        }

        public final List<ReplySuggestion> getSuggestions() {
            return this.suggestions;
        }

        public int hashCode() {
            return this.suggestions.hashCode();
        }

        public String toString() {
            return d.b(new StringBuilder("ComposerSuggestionRow(suggestions="), this.suggestions, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class DayDividerRow implements ContentRow {
        public static final int $stable = 0;
        private final long timestamp;

        public DayDividerRow(long j) {
            this.timestamp = j;
        }

        public static /* synthetic */ DayDividerRow copy$default(DayDividerRow dayDividerRow, long j, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j = dayDividerRow.timestamp;
            }
            return dayDividerRow.copy(j);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final DayDividerRow copy(long j) {
            return new DayDividerRow(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DayDividerRow) && this.timestamp == ((DayDividerRow) obj).timestamp;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "day_divider_row_" + Long.hashCode(this.timestamp);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return a.h(new StringBuilder("DayDividerRow(timestamp="), this.timestamp, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class EventRow implements ContentRow {
        public static final int $stable = 8;
        private final Avatar avatar;
        private final String label;
        private final String partId;

        public EventRow(String label, Avatar avatar, String partId) {
            i.e(label, "label");
            i.e(avatar, "avatar");
            i.e(partId, "partId");
            this.label = label;
            this.avatar = avatar;
            this.partId = partId;
        }

        public static /* synthetic */ EventRow copy$default(EventRow eventRow, String str, Avatar avatar, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = eventRow.label;
            }
            if ((i10 & 2) != 0) {
                avatar = eventRow.avatar;
            }
            if ((i10 & 4) != 0) {
                str2 = eventRow.partId;
            }
            return eventRow.copy(str, avatar, str2);
        }

        public final String component1() {
            return this.label;
        }

        public final Avatar component2() {
            return this.avatar;
        }

        public final String component3() {
            return this.partId;
        }

        public final EventRow copy(String label, Avatar avatar, String partId) {
            i.e(label, "label");
            i.e(avatar, "avatar");
            i.e(partId, "partId");
            return new EventRow(label, avatar, partId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventRow)) {
                return false;
            }
            EventRow eventRow = (EventRow) obj;
            return i.a(this.label, eventRow.label) && i.a(this.avatar, eventRow.avatar) && i.a(this.partId, eventRow.partId);
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "event_row_" + this.partId;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return this.partId.hashCode() + ((this.avatar.hashCode() + (this.label.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("EventRow(label=");
            sb2.append(this.label);
            sb2.append(", avatar=");
            sb2.append(this.avatar);
            sb2.append(", partId=");
            return b.g(sb2, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class FinAnswerRow implements ContentRow {
        public static final int $stable = 8;
        private final GroupingPosition groupingPosition;
        private final Part part;

        public FinAnswerRow(Part part, GroupingPosition groupingPosition) {
            i.e(part, "part");
            i.e(groupingPosition, "groupingPosition");
            this.part = part;
            this.groupingPosition = groupingPosition;
        }

        public static /* synthetic */ FinAnswerRow copy$default(FinAnswerRow finAnswerRow, Part part, GroupingPosition groupingPosition, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = finAnswerRow.part;
            }
            if ((i10 & 2) != 0) {
                groupingPosition = finAnswerRow.groupingPosition;
            }
            return finAnswerRow.copy(part, groupingPosition);
        }

        public final Part component1() {
            return this.part;
        }

        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        public final FinAnswerRow copy(Part part, GroupingPosition groupingPosition) {
            i.e(part, "part");
            i.e(groupingPosition, "groupingPosition");
            return new FinAnswerRow(part, groupingPosition);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinAnswerRow)) {
                return false;
            }
            FinAnswerRow finAnswerRow = (FinAnswerRow) obj;
            return i.a(this.part, finAnswerRow.part) && this.groupingPosition == finAnswerRow.groupingPosition;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "fin_answer_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.groupingPosition.hashCode() + (this.part.hashCode() * 31);
        }

        public String toString() {
            return "FinAnswerRow(part=" + this.part + ", groupingPosition=" + this.groupingPosition + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class FinStreamingRow implements ContentRow {
        public static final int $stable = 8;
        private final List<Block> blocks;
        private final StreamingPart streamingPart;

        /* JADX WARN: Multi-variable type inference failed */
        public FinStreamingRow(List<? extends Block> blocks, StreamingPart streamingPart) {
            i.e(blocks, "blocks");
            i.e(streamingPart, "streamingPart");
            this.blocks = blocks;
            this.streamingPart = streamingPart;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinStreamingRow copy$default(FinStreamingRow finStreamingRow, List list, StreamingPart streamingPart, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = finStreamingRow.blocks;
            }
            if ((i10 & 2) != 0) {
                streamingPart = finStreamingRow.streamingPart;
            }
            return finStreamingRow.copy(list, streamingPart);
        }

        public final List<Block> component1() {
            return this.blocks;
        }

        public final StreamingPart component2() {
            return this.streamingPart;
        }

        public final FinStreamingRow copy(List<? extends Block> blocks, StreamingPart streamingPart) {
            i.e(blocks, "blocks");
            i.e(streamingPart, "streamingPart");
            return new FinStreamingRow(blocks, streamingPart);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinStreamingRow)) {
                return false;
            }
            FinStreamingRow finStreamingRow = (FinStreamingRow) obj;
            return i.a(this.blocks, finStreamingRow.blocks) && i.a(this.streamingPart, finStreamingRow.streamingPart);
        }

        public final List<Block> getBlocks() {
            return this.blocks;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "fin_streaming_row_" + this.blocks.hashCode();
        }

        public final StreamingPart getStreamingPart() {
            return this.streamingPart;
        }

        public int hashCode() {
            return this.streamingPart.hashCode() + (this.blocks.hashCode() * 31);
        }

        public String toString() {
            return "FinStreamingRow(blocks=" + this.blocks + ", streamingPart=" + this.streamingPart + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class FooterNoticeRow implements ContentRow {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeRow(FooterNoticeState footerNoticeState) {
            i.e(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeRow copy$default(FooterNoticeRow footerNoticeRow, FooterNoticeState footerNoticeState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                footerNoticeState = footerNoticeRow.footerNoticeState;
            }
            return footerNoticeRow.copy(footerNoticeState);
        }

        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        public final FooterNoticeRow copy(FooterNoticeState footerNoticeState) {
            i.e(footerNoticeState, "footerNoticeState");
            return new FooterNoticeRow(footerNoticeState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeRow) && i.a(this.footerNoticeState, ((FooterNoticeRow) obj).footerNoticeState);
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "footer_notice_row_" + this.footerNoticeState.hashCode();
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeRow(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class MergedConversationRow implements ContentRow {
        public static final int $stable = 0;
        private final String conversationId;
        private final String description;
        private final String partId;

        public MergedConversationRow(String str, String str2, String partId) {
            i.e(partId, "partId");
            this.description = str;
            this.conversationId = str2;
            this.partId = partId;
        }

        public static /* synthetic */ MergedConversationRow copy$default(MergedConversationRow mergedConversationRow, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = mergedConversationRow.description;
            }
            if ((i10 & 2) != 0) {
                str2 = mergedConversationRow.conversationId;
            }
            if ((i10 & 4) != 0) {
                str3 = mergedConversationRow.partId;
            }
            return mergedConversationRow.copy(str, str2, str3);
        }

        public final String component1() {
            return this.description;
        }

        public final String component2() {
            return this.conversationId;
        }

        public final String component3() {
            return this.partId;
        }

        public final MergedConversationRow copy(String str, String str2, String partId) {
            i.e(partId, "partId");
            return new MergedConversationRow(str, str2, partId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MergedConversationRow)) {
                return false;
            }
            MergedConversationRow mergedConversationRow = (MergedConversationRow) obj;
            return i.a(this.description, mergedConversationRow.description) && i.a(this.conversationId, mergedConversationRow.conversationId) && i.a(this.partId, mergedConversationRow.partId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getDescription() {
            return this.description;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "merged_conversation_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            String str = this.description;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.conversationId;
            return this.partId.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MergedConversationRow(description=");
            sb2.append(this.description);
            sb2.append(", conversationId=");
            sb2.append(this.conversationId);
            sb2.append(", partId=");
            return b.g(sb2, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class NewMessagesRow implements ContentRow {
        public static final int $stable = 0;
        private final String partId;

        public NewMessagesRow(String partId) {
            i.e(partId, "partId");
            this.partId = partId;
        }

        public static /* synthetic */ NewMessagesRow copy$default(NewMessagesRow newMessagesRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = newMessagesRow.partId;
            }
            return newMessagesRow.copy(str);
        }

        public final String component1() {
            return this.partId;
        }

        public final NewMessagesRow copy(String partId) {
            i.e(partId, "partId");
            return new NewMessagesRow(partId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewMessagesRow) && i.a(this.partId, ((NewMessagesRow) obj).partId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "new_messages_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return this.partId.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("NewMessagesRow(partId="), this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class NoteCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public NoteCardRow(Part part, String companyName) {
            i.e(part, "part");
            i.e(companyName, "companyName");
            this.part = part;
            this.companyName = companyName;
        }

        public static /* synthetic */ NoteCardRow copy$default(NoteCardRow noteCardRow, Part part, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = noteCardRow.part;
            }
            if ((i10 & 2) != 0) {
                str = noteCardRow.companyName;
            }
            return noteCardRow.copy(part, str);
        }

        public final Part component1() {
            return this.part;
        }

        public final String component2() {
            return this.companyName;
        }

        public final NoteCardRow copy(Part part, String companyName) {
            i.e(part, "part");
            i.e(companyName, "companyName");
            return new NoteCardRow(part, companyName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteCardRow)) {
                return false;
            }
            NoteCardRow noteCardRow = (NoteCardRow) obj;
            return i.a(this.part, noteCardRow.part) && i.a(this.companyName, noteCardRow.companyName);
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "note_card_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.companyName.hashCode() + (this.part.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("NoteCardRow(part=");
            sb2.append(this.part);
            sb2.append(", companyName=");
            return b.g(sb2, this.companyName, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class PostCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public PostCardRow(Part part, String companyName) {
            i.e(part, "part");
            i.e(companyName, "companyName");
            this.part = part;
            this.companyName = companyName;
        }

        public static /* synthetic */ PostCardRow copy$default(PostCardRow postCardRow, Part part, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = postCardRow.part;
            }
            if ((i10 & 2) != 0) {
                str = postCardRow.companyName;
            }
            return postCardRow.copy(part, str);
        }

        public final Part component1() {
            return this.part;
        }

        public final String component2() {
            return this.companyName;
        }

        public final PostCardRow copy(Part part, String companyName) {
            i.e(part, "part");
            i.e(companyName, "companyName");
            return new PostCardRow(part, companyName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostCardRow)) {
                return false;
            }
            PostCardRow postCardRow = (PostCardRow) obj;
            return i.a(this.part, postCardRow.part) && i.a(this.companyName, postCardRow.companyName);
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "post_card_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.companyName.hashCode() + (this.part.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PostCardRow(part=");
            sb2.append(this.part);
            sb2.append(", companyName=");
            return b.g(sb2, this.companyName, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class QuickRepliesRow implements ContentRow {
        public static final int $stable = 8;
        private final String partId;
        private final List<ReplyOption> replyOptions;

        public QuickRepliesRow(List<ReplyOption> replyOptions, String partId) {
            i.e(replyOptions, "replyOptions");
            i.e(partId, "partId");
            this.replyOptions = replyOptions;
            this.partId = partId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuickRepliesRow copy$default(QuickRepliesRow quickRepliesRow, List list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = quickRepliesRow.replyOptions;
            }
            if ((i10 & 2) != 0) {
                str = quickRepliesRow.partId;
            }
            return quickRepliesRow.copy(list, str);
        }

        public final List<ReplyOption> component1() {
            return this.replyOptions;
        }

        public final String component2() {
            return this.partId;
        }

        public final QuickRepliesRow copy(List<ReplyOption> replyOptions, String partId) {
            i.e(replyOptions, "replyOptions");
            i.e(partId, "partId");
            return new QuickRepliesRow(replyOptions, partId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickRepliesRow)) {
                return false;
            }
            QuickRepliesRow quickRepliesRow = (QuickRepliesRow) obj;
            return i.a(this.replyOptions, quickRepliesRow.replyOptions) && i.a(this.partId, quickRepliesRow.partId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "quick_replies_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final List<ReplyOption> getReplyOptions() {
            return this.replyOptions;
        }

        public int hashCode() {
            return this.partId.hashCode() + (this.replyOptions.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("QuickRepliesRow(replyOptions=");
            sb2.append(this.replyOptions);
            sb2.append(", partId=");
            return b.g(sb2, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class SpecialNoticeRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public SpecialNoticeRow(String message) {
            i.e(message, "message");
            this.message = message;
        }

        public static /* synthetic */ SpecialNoticeRow copy$default(SpecialNoticeRow specialNoticeRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = specialNoticeRow.message;
            }
            return specialNoticeRow.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final SpecialNoticeRow copy(String message) {
            i.e(message, "message");
            return new SpecialNoticeRow(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecialNoticeRow) && i.a(this.message, ((SpecialNoticeRow) obj).message);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "special_notice_row_" + this.message.hashCode();
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("SpecialNoticeRow(message="), this.message, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class TeamIntroRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public TeamIntroRow(String message) {
            i.e(message, "message");
            this.message = message;
        }

        public static /* synthetic */ TeamIntroRow copy$default(TeamIntroRow teamIntroRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = teamIntroRow.message;
            }
            return teamIntroRow.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final TeamIntroRow copy(String message) {
            i.e(message, "message");
            return new TeamIntroRow(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeamIntroRow) && i.a(this.message, ((TeamIntroRow) obj).message);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "team_intro_row_" + this.message.hashCode();
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("TeamIntroRow(message="), this.message, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class TicketStatusRow implements ContentRow {
        public static final int $stable = 0;
        private final long createdAt;
        private final String customStateLabel;
        private final String customStatePrefix;
        private final String partId;
        private final String ticketEventStatus;
        private final String ticketStatusText;

        public TicketStatusRow(String ticketEventStatus, String ticketStatusText, long j, String str, String str2, String partId) {
            i.e(ticketEventStatus, "ticketEventStatus");
            i.e(ticketStatusText, "ticketStatusText");
            i.e(partId, "partId");
            this.ticketEventStatus = ticketEventStatus;
            this.ticketStatusText = ticketStatusText;
            this.createdAt = j;
            this.customStateLabel = str;
            this.customStatePrefix = str2;
            this.partId = partId;
        }

        public static /* synthetic */ TicketStatusRow copy$default(TicketStatusRow ticketStatusRow, String str, String str2, long j, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketStatusRow.ticketEventStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = ticketStatusRow.ticketStatusText;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                j = ticketStatusRow.createdAt;
            }
            long j10 = j;
            if ((i10 & 8) != 0) {
                str3 = ticketStatusRow.customStateLabel;
            }
            String str7 = str3;
            if ((i10 & 16) != 0) {
                str4 = ticketStatusRow.customStatePrefix;
            }
            String str8 = str4;
            if ((i10 & 32) != 0) {
                str5 = ticketStatusRow.partId;
            }
            return ticketStatusRow.copy(str, str6, j10, str7, str8, str5);
        }

        public final String component1() {
            return this.ticketEventStatus;
        }

        public final String component2() {
            return this.ticketStatusText;
        }

        public final long component3() {
            return this.createdAt;
        }

        public final String component4() {
            return this.customStateLabel;
        }

        public final String component5() {
            return this.customStatePrefix;
        }

        public final String component6() {
            return this.partId;
        }

        public final TicketStatusRow copy(String ticketEventStatus, String ticketStatusText, long j, String str, String str2, String partId) {
            i.e(ticketEventStatus, "ticketEventStatus");
            i.e(ticketStatusText, "ticketStatusText");
            i.e(partId, "partId");
            return new TicketStatusRow(ticketEventStatus, ticketStatusText, j, str, str2, partId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketStatusRow)) {
                return false;
            }
            TicketStatusRow ticketStatusRow = (TicketStatusRow) obj;
            return i.a(this.ticketEventStatus, ticketStatusRow.ticketEventStatus) && i.a(this.ticketStatusText, ticketStatusRow.ticketStatusText) && this.createdAt == ticketStatusRow.createdAt && i.a(this.customStateLabel, ticketStatusRow.customStateLabel) && i.a(this.customStatePrefix, ticketStatusRow.customStatePrefix) && i.a(this.partId, ticketStatusRow.partId);
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getCustomStateLabel() {
            return this.customStateLabel;
        }

        public final String getCustomStatePrefix() {
            return this.customStatePrefix;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "ticket_status_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final String getTicketEventStatus() {
            return this.ticketEventStatus;
        }

        public final String getTicketStatusText() {
            return this.ticketStatusText;
        }

        public int hashCode() {
            int iC = C4.b.c(this.createdAt, B1.a.b(this.ticketStatusText, this.ticketEventStatus.hashCode() * 31, 31), 31);
            String str = this.customStateLabel;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customStatePrefix;
            return this.partId.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("TicketStatusRow(ticketEventStatus=");
            sb2.append(this.ticketEventStatus);
            sb2.append(", ticketStatusText=");
            sb2.append(this.ticketStatusText);
            sb2.append(", createdAt=");
            sb2.append(this.createdAt);
            sb2.append(", customStateLabel=");
            sb2.append(this.customStateLabel);
            sb2.append(", customStatePrefix=");
            sb2.append(this.customStatePrefix);
            sb2.append(", partId=");
            return b.g(sb2, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class TypingIndicatorRow implements ContentRow {
        public static final int $stable = 8;
        private final CurrentlyTypingState currentlyTypingState;

        public TypingIndicatorRow(CurrentlyTypingState currentlyTypingState) {
            i.e(currentlyTypingState, "currentlyTypingState");
            this.currentlyTypingState = currentlyTypingState;
        }

        public static /* synthetic */ TypingIndicatorRow copy$default(TypingIndicatorRow typingIndicatorRow, CurrentlyTypingState currentlyTypingState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                currentlyTypingState = typingIndicatorRow.currentlyTypingState;
            }
            return typingIndicatorRow.copy(currentlyTypingState);
        }

        public final CurrentlyTypingState component1() {
            return this.currentlyTypingState;
        }

        public final TypingIndicatorRow copy(CurrentlyTypingState currentlyTypingState) {
            i.e(currentlyTypingState, "currentlyTypingState");
            return new TypingIndicatorRow(currentlyTypingState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypingIndicatorRow) && i.a(this.currentlyTypingState, ((TypingIndicatorRow) obj).currentlyTypingState);
        }

        public final CurrentlyTypingState getCurrentlyTypingState() {
            return this.currentlyTypingState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "typing_indicator_row_" + this.currentlyTypingState.hashCode();
        }

        public int hashCode() {
            return this.currentlyTypingState.hashCode();
        }

        public String toString() {
            return "TypingIndicatorRow(currentlyTypingState=" + this.currentlyTypingState + ')';
        }
    }

    String getKey();

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class BubbleMessageRow implements ContentRow {
        public static final int $stable = 8;
        private final PendingMessage.FailedImageUploadData failedImageUploadData;
        private final GroupingPosition groupingPosition;
        private final boolean isFailed;
        private final boolean isPending;
        private final PartWrapper partWrapper;

        public BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11) {
            i.e(partWrapper, "partWrapper");
            i.e(groupingPosition, "groupingPosition");
            this.partWrapper = partWrapper;
            this.groupingPosition = groupingPosition;
            this.failedImageUploadData = failedImageUploadData;
            this.isFailed = z10;
            this.isPending = z11;
        }

        public static /* synthetic */ BubbleMessageRow copy$default(BubbleMessageRow bubbleMessageRow, PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                partWrapper = bubbleMessageRow.partWrapper;
            }
            if ((i10 & 2) != 0) {
                groupingPosition = bubbleMessageRow.groupingPosition;
            }
            GroupingPosition groupingPosition2 = groupingPosition;
            if ((i10 & 4) != 0) {
                failedImageUploadData = bubbleMessageRow.failedImageUploadData;
            }
            PendingMessage.FailedImageUploadData failedImageUploadData2 = failedImageUploadData;
            if ((i10 & 8) != 0) {
                z10 = bubbleMessageRow.isFailed;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = bubbleMessageRow.isPending;
            }
            return bubbleMessageRow.copy(partWrapper, groupingPosition2, failedImageUploadData2, z12, z11);
        }

        public final PartWrapper component1() {
            return this.partWrapper;
        }

        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        public final PendingMessage.FailedImageUploadData component3() {
            return this.failedImageUploadData;
        }

        public final boolean component4() {
            return this.isFailed;
        }

        public final boolean component5() {
            return this.isPending;
        }

        public final BubbleMessageRow copy(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11) {
            i.e(partWrapper, "partWrapper");
            i.e(groupingPosition, "groupingPosition");
            return new BubbleMessageRow(partWrapper, groupingPosition, failedImageUploadData, z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleMessageRow)) {
                return false;
            }
            BubbleMessageRow bubbleMessageRow = (BubbleMessageRow) obj;
            return i.a(this.partWrapper, bubbleMessageRow.partWrapper) && this.groupingPosition == bubbleMessageRow.groupingPosition && i.a(this.failedImageUploadData, bubbleMessageRow.failedImageUploadData) && this.isFailed == bubbleMessageRow.isFailed && this.isPending == bubbleMessageRow.isPending;
        }

        public final PendingMessage.FailedImageUploadData getFailedImageUploadData() {
            return this.failedImageUploadData;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "message_row_" + this.partWrapper.getPart().getId();
        }

        public final PartWrapper getPartWrapper() {
            return this.partWrapper;
        }

        public int hashCode() {
            int iHashCode = (this.groupingPosition.hashCode() + (this.partWrapper.hashCode() * 31)) * 31;
            PendingMessage.FailedImageUploadData failedImageUploadData = this.failedImageUploadData;
            return Boolean.hashCode(this.isPending) + D.b((iHashCode + (failedImageUploadData == null ? 0 : failedImageUploadData.hashCode())) * 31, 31, this.isFailed);
        }

        public final boolean isFailed() {
            return this.isFailed;
        }

        public final boolean isPending() {
            return this.isPending;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BubbleMessageRow(partWrapper=");
            sb2.append(this.partWrapper);
            sb2.append(", groupingPosition=");
            sb2.append(this.groupingPosition);
            sb2.append(", failedImageUploadData=");
            sb2.append(this.failedImageUploadData);
            sb2.append(", isFailed=");
            sb2.append(this.isFailed);
            sb2.append(", isPending=");
            return o.d(sb2, this.isPending, ')');
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class PartWrapper {
            public static final int $stable = 8;
            private final List<String> failedAttributeIdentifiers;
            private final boolean isAdminOrAltParticipant;
            private final boolean isLastPart;
            private final List<String> loadingAttributeIdentifiers;
            private final Part part;

            public PartWrapper(Part part, boolean z10, boolean z11, List list, List list2, int i10, e eVar) {
                this(part, z10, z11, (i10 & 8) != 0 ? EmptyList.f42983b : list, (i10 & 16) != 0 ? EmptyList.f42983b : list2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PartWrapper copy$default(PartWrapper partWrapper, Part part, boolean z10, boolean z11, List list, List list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    part = partWrapper.part;
                }
                if ((i10 & 2) != 0) {
                    z10 = partWrapper.isLastPart;
                }
                boolean z12 = z10;
                if ((i10 & 4) != 0) {
                    z11 = partWrapper.isAdminOrAltParticipant;
                }
                boolean z13 = z11;
                if ((i10 & 8) != 0) {
                    list = partWrapper.failedAttributeIdentifiers;
                }
                List list3 = list;
                if ((i10 & 16) != 0) {
                    list2 = partWrapper.loadingAttributeIdentifiers;
                }
                return partWrapper.copy(part, z12, z13, list3, list2);
            }

            public final Part component1() {
                return this.part;
            }

            public final boolean component2() {
                return this.isLastPart;
            }

            public final boolean component3() {
                return this.isAdminOrAltParticipant;
            }

            public final List<String> component4() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> component5() {
                return this.loadingAttributeIdentifiers;
            }

            public final PartWrapper copy(Part part, boolean z10, boolean z11, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers) {
                i.e(part, "part");
                i.e(failedAttributeIdentifiers, "failedAttributeIdentifiers");
                i.e(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
                return new PartWrapper(part, z10, z11, failedAttributeIdentifiers, loadingAttributeIdentifiers);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PartWrapper)) {
                    return false;
                }
                PartWrapper partWrapper = (PartWrapper) obj;
                return i.a(this.part, partWrapper.part) && this.isLastPart == partWrapper.isLastPart && this.isAdminOrAltParticipant == partWrapper.isAdminOrAltParticipant && i.a(this.failedAttributeIdentifiers, partWrapper.failedAttributeIdentifiers) && i.a(this.loadingAttributeIdentifiers, partWrapper.loadingAttributeIdentifiers);
            }

            public final List<String> getFailedAttributeIdentifiers() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> getLoadingAttributeIdentifiers() {
                return this.loadingAttributeIdentifiers;
            }

            public final Part getPart() {
                return this.part;
            }

            public int hashCode() {
                return this.loadingAttributeIdentifiers.hashCode() + p.d(D.b(D.b(this.part.hashCode() * 31, 31, this.isLastPart), 31, this.isAdminOrAltParticipant), 31, this.failedAttributeIdentifiers);
            }

            public final boolean isAdminOrAltParticipant() {
                return this.isAdminOrAltParticipant;
            }

            public final boolean isLastPart() {
                return this.isLastPart;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("PartWrapper(part=");
                sb2.append(this.part);
                sb2.append(", isLastPart=");
                sb2.append(this.isLastPart);
                sb2.append(", isAdminOrAltParticipant=");
                sb2.append(this.isAdminOrAltParticipant);
                sb2.append(", failedAttributeIdentifiers=");
                sb2.append(this.failedAttributeIdentifiers);
                sb2.append(", loadingAttributeIdentifiers=");
                return d.b(sb2, this.loadingAttributeIdentifiers, ')');
            }

            public PartWrapper(Part part, boolean z10, boolean z11, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers) {
                i.e(part, "part");
                i.e(failedAttributeIdentifiers, "failedAttributeIdentifiers");
                i.e(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
                this.part = part;
                this.isLastPart = z10;
                this.isAdminOrAltParticipant = z11;
                this.failedAttributeIdentifiers = failedAttributeIdentifiers;
                this.loadingAttributeIdentifiers = loadingAttributeIdentifiers;
            }
        }

        public /* synthetic */ BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11, int i10, e eVar) {
            this(partWrapper, groupingPosition, failedImageUploadData, z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}
