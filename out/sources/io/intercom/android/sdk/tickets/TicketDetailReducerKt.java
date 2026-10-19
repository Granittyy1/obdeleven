package io.intercom.android.sdk.tickets;

import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: TicketDetailReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailReducerKt {

    /* JADX INFO: compiled from: TicketDetailReducer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ticket.ConversationButton.IconType.values().length];
            try {
                iArr[Ticket.ConversationButton.IconType.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ticket.ConversationButton.IconType.CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TicketDetailState.TicketDetailContentState computeTicketViewState(Ticket ticket, UserIdentity user, List<AvatarWrapper> activeAdminsAvatars, TicketLaunchedFrom launchedFrom) {
        List listK;
        kotlin.jvm.internal.i.e(ticket, "ticket");
        kotlin.jvm.internal.i.e(user, "user");
        kotlin.jvm.internal.i.e(activeAdminsAvatars, "activeAdminsAvatars");
        kotlin.jvm.internal.i.e(launchedFrom, "launchedFrom");
        String title = ticket.getTitle();
        Participant participantBuild = ticket.getAssignee().build();
        kotlin.jvm.internal.i.d(participantBuild, "build(...)");
        if (!isUnassignedOrBot(participantBuild) || activeAdminsAvatars.isEmpty()) {
            Avatar avatar = ticket.getAssignee().build().getAvatar();
            kotlin.jvm.internal.i.d(avatar, "getAvatar(...)");
            listK = M1.k(new AvatarWrapper(avatar, false, 2, null));
        } else {
            listK = kotlin.collections.q.i0(activeAdminsAvatars, 3);
        }
        List list = listK;
        String statusDetail = ticket.getCurrentStatus().getStatusDetail();
        long jM477getColor0d7_KjU = toTicketStatus(ticket.getCurrentStatus()).m477getColor0d7_KjU();
        List<Ticket.Status> statusList = ticket.getStatusList();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(statusList, 10));
        for (Ticket.Status status : statusList) {
            arrayList.add(new TicketTimelineCardState.ProgressSection(isDone(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus())), isLoading(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus()))));
        }
        TicketTimelineCardState ticketTimelineCardState = new TicketTimelineCardState(list, statusDetail, "", jM477getColor0d7_KjU, arrayList, ticket.getCurrentStatus().getTitle(), Long.valueOf(ticket.getLatestStatusUpdatedAt()), null);
        List<Ticket.TicketAttribute> attributes = ticket.getAttributes();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : attributes) {
            if (((Ticket.TicketAttribute) obj).hasValue()) {
                arrayList2.add(obj);
            }
        }
        String email = user.getEmail();
        kotlin.jvm.internal.i.d(email, "getEmail(...)");
        return new TicketDetailState.TicketDetailContentState(title, ticketTimelineCardState, arrayList2, email, ticket.getConversationId(), conversationButtonState(ticket.getConversationButton(), launchedFrom));
    }

    public static TicketDetailState.TicketDetailContentState computeTicketViewState$default(Ticket ticket, UserIdentity userIdentity, List list, TicketLaunchedFrom ticketLaunchedFrom, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = EmptyList.f42983b;
        }
        return computeTicketViewState(ticket, userIdentity, list, ticketLaunchedFrom);
    }

    private static final ConversationButtonState conversationButtonState(Ticket.ConversationButton conversationButton, TicketLaunchedFrom ticketLaunchedFrom) {
        String text;
        boolean z10 = ((ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) || conversationButton == null) ? false : true;
        Integer numValueOf = null;
        Ticket.ConversationButton.IconType icon = conversationButton != null ? conversationButton.getIcon() : null;
        int i10 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i10 == 1) {
            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i10 == 2) {
            numValueOf = Integer.valueOf(R.drawable.intercom_messages_icon);
        }
        if (conversationButton == null || (text = conversationButton.getText()) == null) {
            text = "";
        }
        return new ConversationButtonState(z10, numValueOf, new StringProvider.ActualString(text));
    }

    public static final boolean isDone(TicketStatus ticketStatus, TicketStatus currentTicketStatus) {
        kotlin.jvm.internal.i.e(ticketStatus, "<this>");
        kotlin.jvm.internal.i.e(currentTicketStatus, "currentTicketStatus");
        return currentTicketStatus.ordinal() >= ticketStatus.ordinal();
    }

    public static final boolean isLoading(TicketStatus ticketStatus, TicketStatus currentTicketStatus) {
        kotlin.jvm.internal.i.e(ticketStatus, "<this>");
        kotlin.jvm.internal.i.e(currentTicketStatus, "currentTicketStatus");
        return currentTicketStatus.ordinal() == ticketStatus.ordinal() && currentTicketStatus.ordinal() < kotlin.collections.k.S(TicketStatus.values());
    }

    private static final boolean isUnassignedOrBot(Participant participant) {
        return kotlin.jvm.internal.i.a(participant, Participant.create("", "", Participant.USER_TYPE, "", Avatar.create("", ""), Boolean.FALSE)) || participant.isBot().booleanValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final TicketStatus toTicketStatus(Ticket.Status status) {
        kotlin.jvm.internal.i.e(status, "<this>");
        String type = status.getType();
        switch (type.hashCode()) {
            case -882067636:
                if (type.equals("waiting_on_customer")) {
                    return TicketStatus.WaitingOnCustomer;
                }
                break;
            case -753541113:
                if (type.equals("in_progress")) {
                    return TicketStatus.InProgress;
                }
                break;
            case -341328904:
                if (type.equals("resolved")) {
                    return TicketStatus.Resolved;
                }
                break;
            case 348678395:
                if (type.equals(MetricTracker.Action.SUBMITTED)) {
                    return TicketStatus.Submitted;
                }
                break;
        }
        return TicketStatus.Submitted;
    }
}
