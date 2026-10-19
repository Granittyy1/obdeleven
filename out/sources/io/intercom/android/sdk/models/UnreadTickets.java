package io.intercom.android.sdk.models;

import I7.b;
import Q8.d;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UnreadTickets.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnreadTickets {

    @b("total_count")
    private final int totalCount;

    @b("unread_ticket_ids")
    private final List<String> unreadTicketIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final UnreadTickets NULL = new UnreadTickets(0, EmptyList.f42983b);

    /* JADX INFO: compiled from: UnreadTickets.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final UnreadTickets getNULL() {
            return UnreadTickets.NULL;
        }

        private Companion() {
        }
    }

    public UnreadTickets(int i10, List<String> unreadTicketIds) {
        i.e(unreadTicketIds, "unreadTicketIds");
        this.totalCount = i10;
        this.unreadTicketIds = unreadTicketIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadTickets copy$default(UnreadTickets unreadTickets, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = unreadTickets.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = unreadTickets.unreadTicketIds;
        }
        return unreadTickets.copy(i10, list);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<String> component2() {
        return this.unreadTicketIds;
    }

    public final UnreadTickets copy(int i10, List<String> unreadTicketIds) {
        i.e(unreadTicketIds, "unreadTicketIds");
        return new UnreadTickets(i10, unreadTicketIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnreadTickets)) {
            return false;
        }
        UnreadTickets unreadTickets = (UnreadTickets) obj;
        return this.totalCount == unreadTickets.totalCount && i.a(this.unreadTicketIds, unreadTickets.unreadTicketIds);
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<String> getUnreadTicketIds() {
        return this.unreadTicketIds;
    }

    public int hashCode() {
        return this.unreadTicketIds.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnreadTickets(totalCount=");
        sb2.append(this.totalCount);
        sb2.append(", unreadTicketIds=");
        return d.b(sb2, this.unreadTicketIds, ')');
    }
}
