package io.intercom.android.sdk.m5.conversation.reducers;

import android.text.format.DateUtils;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationPartsReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationPartsReducerKt {

    /* JADX INFO: compiled from: ConversationPartsReducer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.MERGED_PRIMARY_CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GroupingPosition getGroupingPosition(List<? extends Part> allParts, int i10) {
        i.e(allParts, "allParts");
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(allParts, i10) && PartExtensionsKt.hasNextConcatPartNewStyle(allParts, i10)) {
            return GroupingPosition.MIDDLE;
        }
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(allParts, i10)) {
            return GroupingPosition.BOTTOM;
        }
        return PartExtensionsKt.hasNextConcatPartNewStyle(allParts, i10) ? GroupingPosition.TOP : GroupingPosition.STANDALONE;
    }

    private static final boolean hasPendingMessageAfter(Part part, Map<String, PendingMessage> map) {
        Long l10;
        long createdAt = part.getCreatedAt();
        Iterator<T> it = map.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        return l10 != null && createdAt < l10.longValue();
    }

    public static final boolean isAdminOrAltParticipant(Part part, UserIdentity userIdentity) {
        i.e(part, "part");
        i.e(userIdentity, "userIdentity");
        return part.isAdmin() || !part.getParticipant().isUserWithId(userIdentity.getIntercomId());
    }

    private static final ContentRow reduceEvent(Part part) {
        MessageStyle messageStyle = part.getMessageStyle();
        int i10 = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
        if (i10 == 1) {
            String status = part.getEventData().getStatus();
            String eventAsPlainText = part.getEventData().getEventAsPlainText();
            long createdAt = part.getCreatedAt();
            String customStateLabel = part.getEventData().getCustomStateLabel();
            String customStatePrefix = part.getEventData().getCustomStatePrefix();
            String id = part.getId();
            i.d(id, "getId(...)");
            return new ContentRow.TicketStatusRow(status, eventAsPlainText, createdAt, customStateLabel, customStatePrefix, id);
        }
        if (i10 == 2) {
            String mergedConversationId = part.getEventData().getMergedConversationId();
            String description = part.getEventData().getDescription();
            String id2 = part.getId();
            i.d(id2, "getId(...)");
            return new ContentRow.MergedConversationRow(description, mergedConversationId, id2);
        }
        String eventAsPlainText2 = part.getEventData().getEventAsPlainText();
        Avatar avatarCreate = Avatar.create(part.getEventData().getParticipant().getAvatar().getImageUrl(), part.getEventData().getParticipant().getInitial());
        i.d(avatarCreate, "create(...)");
        String id3 = part.getId();
        i.d(id3, "getId(...)");
        return new ContentRow.EventRow(eventAsPlainText2, avatarCreate, id3);
    }

    public static final List<ContentRow> reduceMessages(ConversationClientState clientState, UserIdentity userIdentity, AppConfig config) {
        String str;
        int i10;
        UserIdentity userIdentity2 = userIdentity;
        i.e(clientState, "clientState");
        i.e(userIdentity2, "userIdentity");
        i.e(config, "config");
        Conversation conversation = clientState.getConversation();
        if (conversation == null) {
            return EmptyList.f42983b;
        }
        if (conversation.getTicket() != null && !ConversationExtensionsKt.hasNonTicketParts(conversation) && clientState.getPendingMessages().isEmpty()) {
            return M1.k(new ContentRow.BigTicketRow(TicketDetailReducerKt.computeTicketViewState$default(conversation.getTicket(), userIdentity, null, new TicketLaunchedFrom.Conversation(conversation.getTicket()), 4, null), conversation.getTicket().getId()));
        }
        ListBuilder listBuilderF = M1.f();
        List<Part> listParts = conversation.parts();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listParts.iterator();
        while (true) {
            str = "getReplyOptions(...)";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<ReplyOption> replyOptions = ((Part) next).getReplyOptions();
            i.d(replyOptions, "getReplyOptions(...)");
            if (replyOptions.isEmpty() || !conversation.getPreventEndUserReplies()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                Object objW = q.W(arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    i10 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                    if (!zHasNext) {
                        break;
                    }
                    Object next2 = it3.next();
                    Calendar calendar = Calendar.getInstance();
                    i.d(calendar, "getInstance(...)");
                    calendar.setTime(new Date(((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) * ((Part) next2).getCreatedAt()));
                    Integer numValueOf = Integer.valueOf(calendar.get(6));
                    Object arrayList3 = linkedHashMap.get(numValueOf);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList3);
                    }
                    ((List) arrayList3).add(next2);
                }
                for (List list : linkedHashMap.values()) {
                    String str2 = str;
                    boolean zIsToday = DateUtils.isToday(((Part) q.O(list)).getCreatedAt() * ((long) i10));
                    if (!((Part) q.O(list)).isInitialMessage() || (!PartExtensionsKt.isLinkCard((Part) q.O(list)) && !zIsToday)) {
                        listBuilderF.add(new ContentRow.DayDividerRow(((Part) q.O(list)).getCreatedAt()));
                    }
                    List list2 = list;
                    Collection<PendingMessage> collectionValues = clientState.getPendingMessages().values();
                    ArrayList arrayList4 = new ArrayList(m.y(collectionValues, 10));
                    Iterator<T> it4 = collectionValues.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((PendingMessage) it4.next()).getPart());
                    }
                    ArrayList arrayListC0 = q.c0(list2, arrayList4);
                    ListBuilder listBuilderF2 = M1.f();
                    List list3 = list;
                    ArrayList arrayList5 = new ArrayList(m.y(list3, 10));
                    int i12 = 0;
                    for (Object obj2 : list3) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            l.x();
                            throw null;
                        }
                        Part part = (Part) obj2;
                        if (clientState.getNewMessageId() != null && i.a(clientState.getNewMessageId(), part.getId())) {
                            String id = part.getId();
                            i.d(id, "getId(...)");
                            listBuilderF2.add(new ContentRow.NewMessagesRow(id));
                        }
                        if (part.isInitialMessage() && PartExtensionsKt.isLinkCard(part)) {
                            listBuilderF2.add(new ContentRow.AskedAboutRow(part));
                        } else if (part.isEvent().booleanValue()) {
                            listBuilderF2.add(reduceEvent(part));
                        } else if (part.getMessageStyle() == MessageStyle.POST) {
                            listBuilderF2.add(new ContentRow.PostCardRow(part, config.getName()));
                        } else if (part.getMessageStyle() == MessageStyle.NOTE) {
                            listBuilderF2.add(new ContentRow.NoteCardRow(part, config.getName()));
                        } else if (part.getMessageStyle() == MessageStyle.FIN_ANSWER) {
                            listBuilderF2.add(new ContentRow.FinAnswerRow(part, getGroupingPosition(arrayListC0, i12)));
                        } else if (PartExtensionsKt.isQuickReplyOnly(part)) {
                            List<ReplyOption> replyOptions2 = part.getReplyOptions();
                            i.d(replyOptions2, str2);
                            String id2 = part.getId();
                            i.d(id2, "getId(...)");
                            listBuilderF2.add(new ContentRow.QuickRepliesRow(replyOptions2, id2));
                        } else {
                            boolean zIsAdminOrAltParticipant = isAdminOrAltParticipant(part, userIdentity2);
                            Part part2 = (Part) objW;
                            boolean z10 = i.a(part.getId(), part2 != null ? part2.getId() : null) && clientState.getPendingMessages().isEmpty() && !clientState.getFinStreamingData().isFinStreaming() && i.a(clientState.getCurrentlyTypingState(), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null));
                            part.setParentConversation(conversation);
                            ContentRow.BubbleMessageRow bubbleMessageRow = new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part, z10, zIsAdminOrAltParticipant, clientState.getFailedAttributeIdentifiers(), clientState.getLoadingAttributeIdentifiers()), getGroupingPosition(arrayListC0, i12), null, false, false, 16, null);
                            if (shouldShowQuickReplies(part, z10, zIsAdminOrAltParticipant)) {
                                listBuilderF2.add(bubbleMessageRow);
                                List<ReplyOption> replyOptions3 = part.getReplyOptions();
                                i.d(replyOptions3, str2);
                                String id3 = part.getId();
                                i.d(id3, "getId(...)");
                                listBuilderF2.add(new ContentRow.QuickRepliesRow(replyOptions3, id3));
                            } else {
                                listBuilderF2.add(bubbleMessageRow);
                            }
                        }
                        arrayList5.add(true);
                        userIdentity2 = userIdentity;
                        i12 = i13;
                        obj = null;
                    }
                    listBuilderF.addAll(listBuilderF2.I());
                    obj = obj;
                    str = str2;
                    i10 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                    userIdentity2 = userIdentity;
                }
                return listBuilderF.I();
            }
            Object next3 = it2.next();
            int i14 = i11 + 1;
            if (i11 < 0) {
                l.x();
                throw null;
            }
            Part part3 = (Part) next3;
            if (part3.getMessageStyle() != MessageStyle.QUICK_REPLY || (i11 == l.r(conversation.parts()) && !hasPendingMessageAfter(part3, clientState.getPendingMessages()))) {
                arrayList2.add(next3);
            }
            i11 = i14;
        }
    }

    private static final boolean shouldShowQuickReplies(Part part, boolean z10, boolean z11) {
        if (z10) {
            List<ReplyOption> replyOptions = part.getReplyOptions();
            i.d(replyOptions, "getReplyOptions(...)");
            if (!replyOptions.isEmpty() && z11) {
                return true;
            }
        }
        return false;
    }
}
