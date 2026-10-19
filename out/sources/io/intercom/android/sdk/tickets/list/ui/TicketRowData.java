package io.intercom.android.sdk.tickets.list.ui;

import Z3.o;
import io.intercom.android.sdk.tickets.TicketStatus;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketsScreenViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRowData {
    public static final int $stable = 0;
    private final String id;
    private final boolean isRead;
    private final TicketStatus status;
    private final String subTitle;
    private final String title;

    public TicketRowData(String id, String title, String subTitle, TicketStatus status, boolean z10) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(subTitle, "subTitle");
        i.e(status, "status");
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.status = status;
        this.isRead = z10;
    }

    public static /* synthetic */ TicketRowData copy$default(TicketRowData ticketRowData, String str, String str2, String str3, TicketStatus ticketStatus, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketRowData.id;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketRowData.title;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = ticketRowData.subTitle;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            ticketStatus = ticketRowData.status;
        }
        TicketStatus ticketStatus2 = ticketStatus;
        if ((i10 & 16) != 0) {
            z10 = ticketRowData.isRead;
        }
        return ticketRowData.copy(str, str4, str5, ticketStatus2, z10);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    public final TicketStatus component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.isRead;
    }

    public final TicketRowData copy(String id, String title, String subTitle, TicketStatus status, boolean z10) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(subTitle, "subTitle");
        i.e(status, "status");
        return new TicketRowData(id, title, subTitle, status, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketRowData)) {
            return false;
        }
        TicketRowData ticketRowData = (TicketRowData) obj;
        return i.a(this.id, ticketRowData.id) && i.a(this.title, ticketRowData.title) && i.a(this.subTitle, ticketRowData.subTitle) && this.status == ticketRowData.status && this.isRead == ticketRowData.isRead;
    }

    public final String getId() {
        return this.id;
    }

    public final TicketStatus getStatus() {
        return this.status;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRead) + ((this.status.hashCode() + B1.a.b(this.subTitle, B1.a.b(this.title, this.id.hashCode() * 31, 31), 31)) * 31);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketRowData(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subTitle=");
        sb2.append(this.subTitle);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", isRead=");
        return o.d(sb2, this.isRead, ')');
    }
}
