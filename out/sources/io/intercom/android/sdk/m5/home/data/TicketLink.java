package io.intercom.android.sdk.m5.home.data;

import B1.a;
import I7.b;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketLink {
    public static final int $stable = 8;

    @b("display_order")
    private final int displayOrder;

    @b("icon_url")
    private final String iconUrl;

    @b("ticket_type")
    private final TicketType ticketType;

    @b(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @b("ticket_type_name")
    private final String ticketTypeName;

    public TicketLink(int i10, String ticketTypeName, String iconUrl, int i11, TicketType ticketType) {
        i.e(ticketTypeName, "ticketTypeName");
        i.e(iconUrl, "iconUrl");
        i.e(ticketType, "ticketType");
        this.ticketTypeId = i10;
        this.ticketTypeName = ticketTypeName;
        this.iconUrl = iconUrl;
        this.displayOrder = i11;
        this.ticketType = ticketType;
    }

    public static /* synthetic */ TicketLink copy$default(TicketLink ticketLink, int i10, String str, String str2, int i11, TicketType ticketType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = ticketLink.ticketTypeId;
        }
        if ((i12 & 2) != 0) {
            str = ticketLink.ticketTypeName;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = ticketLink.iconUrl;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            i11 = ticketLink.displayOrder;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            ticketType = ticketLink.ticketType;
        }
        return ticketLink.copy(i10, str3, str4, i13, ticketType);
    }

    public final int component1() {
        return this.ticketTypeId;
    }

    public final String component2() {
        return this.ticketTypeName;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final int component4() {
        return this.displayOrder;
    }

    public final TicketType component5() {
        return this.ticketType;
    }

    public final TicketLink copy(int i10, String ticketTypeName, String iconUrl, int i11, TicketType ticketType) {
        i.e(ticketTypeName, "ticketTypeName");
        i.e(iconUrl, "iconUrl");
        i.e(ticketType, "ticketType");
        return new TicketLink(i10, ticketTypeName, iconUrl, i11, ticketType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketLink)) {
            return false;
        }
        TicketLink ticketLink = (TicketLink) obj;
        return this.ticketTypeId == ticketLink.ticketTypeId && i.a(this.ticketTypeName, ticketLink.ticketTypeName) && i.a(this.iconUrl, ticketLink.iconUrl) && this.displayOrder == ticketLink.displayOrder && i.a(this.ticketType, ticketLink.ticketType);
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final TicketType getTicketType() {
        return this.ticketType;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTicketTypeName() {
        return this.ticketTypeName;
    }

    public int hashCode() {
        return this.ticketType.hashCode() + q.b(this.displayOrder, a.b(this.iconUrl, a.b(this.ticketTypeName, Integer.hashCode(this.ticketTypeId) * 31, 31), 31), 31);
    }

    public String toString() {
        return "TicketLink(ticketTypeId=" + this.ticketTypeId + ", ticketTypeName=" + this.ticketTypeName + ", iconUrl=" + this.iconUrl + ", displayOrder=" + this.displayOrder + ", ticketType=" + this.ticketType + ')';
    }
}
