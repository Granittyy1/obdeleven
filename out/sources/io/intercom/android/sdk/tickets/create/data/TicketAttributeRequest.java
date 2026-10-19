package io.intercom.android.sdk.tickets.create.data;

import B6.c;
import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketAttributeRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketAttributeRequest {
    public static final int $stable = 8;

    @b("descriptor_id")
    private final String descriptorId;

    @b("value")
    private final Object value;

    public TicketAttributeRequest(String descriptorId, Object value) {
        i.e(descriptorId, "descriptorId");
        i.e(value, "value");
        this.descriptorId = descriptorId;
        this.value = value;
    }

    public static /* synthetic */ TicketAttributeRequest copy$default(TicketAttributeRequest ticketAttributeRequest, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = ticketAttributeRequest.descriptorId;
        }
        if ((i10 & 2) != 0) {
            obj = ticketAttributeRequest.value;
        }
        return ticketAttributeRequest.copy(str, obj);
    }

    public final String component1() {
        return this.descriptorId;
    }

    public final Object component2() {
        return this.value;
    }

    public final TicketAttributeRequest copy(String descriptorId, Object value) {
        i.e(descriptorId, "descriptorId");
        i.e(value, "value");
        return new TicketAttributeRequest(descriptorId, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttributeRequest)) {
            return false;
        }
        TicketAttributeRequest ticketAttributeRequest = (TicketAttributeRequest) obj;
        return i.a(this.descriptorId, ticketAttributeRequest.descriptorId) && i.a(this.value, ticketAttributeRequest.value);
    }

    public final String getDescriptorId() {
        return this.descriptorId;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.descriptorId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketAttributeRequest(descriptorId=");
        sb2.append(this.descriptorId);
        sb2.append(", value=");
        return c.e(sb2, this.value, ')');
    }
}
