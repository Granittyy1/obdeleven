package io.intercom.android.sdk.blocks.lib.models;

import B1.a;
import I7.b;
import Q8.d;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketTypeV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketTypeV2 {
    public static final int $stable = 8;

    @b("form_fields")
    private final List<FormField> formFields;

    @b("name")
    private final String name;

    @b(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    public TicketTypeV2(int i10, String name, List<FormField> formFields) {
        i.e(name, "name");
        i.e(formFields, "formFields");
        this.ticketTypeId = i10;
        this.name = name;
        this.formFields = formFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketTypeV2 copy$default(TicketTypeV2 ticketTypeV2, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketTypeV2.ticketTypeId;
        }
        if ((i11 & 2) != 0) {
            str = ticketTypeV2.name;
        }
        if ((i11 & 4) != 0) {
            list = ticketTypeV2.formFields;
        }
        return ticketTypeV2.copy(i10, str, list);
    }

    public final int component1() {
        return this.ticketTypeId;
    }

    public final String component2() {
        return this.name;
    }

    public final List<FormField> component3() {
        return this.formFields;
    }

    public final TicketTypeV2 copy(int i10, String name, List<FormField> formFields) {
        i.e(name, "name");
        i.e(formFields, "formFields");
        return new TicketTypeV2(i10, name, formFields);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTypeV2)) {
            return false;
        }
        TicketTypeV2 ticketTypeV2 = (TicketTypeV2) obj;
        return this.ticketTypeId == ticketTypeV2.ticketTypeId && i.a(this.name, ticketTypeV2.name) && i.a(this.formFields, ticketTypeV2.formFields);
    }

    public final List<FormField> getFormFields() {
        return this.formFields;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public int hashCode() {
        return this.formFields.hashCode() + a.b(this.name, Integer.hashCode(this.ticketTypeId) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketTypeV2(ticketTypeId=");
        sb2.append(this.ticketTypeId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", formFields=");
        return d.b(sb2, this.formFields, ')');
    }
}
