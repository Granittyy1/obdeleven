package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ConversationExtensionsKt {
    public static final boolean hasNonTicketParts(Conversation conversation) {
        i.e(conversation, "<this>");
        List<Part> listParts = conversation.parts();
        if ((listParts instanceof Collection) && listParts.isEmpty()) {
            return false;
        }
        Iterator<T> it = listParts.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).getMessageStyle() != MessageStyle.TICKET_STATE_UPDATED) {
                return true;
            }
        }
        return false;
    }

    public static final long lastActionCreatedAt(Conversation conversation) {
        List<Ticket.Status> statusList;
        Object obj;
        i.e(conversation, "<this>");
        if (!i.a(conversation.lastPart(), Part.NULL)) {
            return conversation.lastPart().getCreatedAt();
        }
        Ticket ticket = conversation.getTicket();
        if (ticket != null && (statusList = ticket.getStatusList()) != null) {
            Iterator<T> it = statusList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long createdDate = ((Ticket.Status) next).getCreatedDate();
                    do {
                        Object next2 = it.next();
                        long createdDate2 = ((Ticket.Status) next2).getCreatedDate();
                        if (createdDate < createdDate2) {
                            next = next2;
                            createdDate = createdDate2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Ticket.Status status = (Ticket.Status) obj;
            if (status != null) {
                return status.getCreatedDate();
            }
        }
        return 0L;
    }
}
