package io.intercom.android.sdk.m5.conversation.states;

import B7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketProgressRowState {
    public static final int $stable = 0;
    private final String name;
    private final String status;

    public TicketProgressRowState(String name, String status) {
        i.e(name, "name");
        i.e(status, "status");
        this.name = name;
        this.status = status;
    }

    public static /* synthetic */ TicketProgressRowState copy$default(TicketProgressRowState ticketProgressRowState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketProgressRowState.name;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketProgressRowState.status;
        }
        return ticketProgressRowState.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.status;
    }

    public final TicketProgressRowState copy(String name, String status) {
        i.e(name, "name");
        i.e(status, "status");
        return new TicketProgressRowState(name, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketProgressRowState)) {
            return false;
        }
        TicketProgressRowState ticketProgressRowState = (TicketProgressRowState) obj;
        return i.a(this.name, ticketProgressRowState.name) && i.a(this.status, ticketProgressRowState.status);
    }

    public final String getName() {
        return this.name;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketProgressRowState(name=");
        sb2.append(this.name);
        sb2.append(", status=");
        return b.g(sb2, this.status, ')');
    }
}
