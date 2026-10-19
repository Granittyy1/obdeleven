package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Submitted' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: TicketDetailReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketStatus {
    private static final /* synthetic */ Ba.a $ENTRIES;
    private static final /* synthetic */ TicketStatus[] $VALUES;
    public static final TicketStatus InProgress;
    public static final TicketStatus Resolved;
    public static final TicketStatus Submitted;
    public static final TicketStatus WaitingOnCustomer;
    private final long color;
    private final int iconRes;

    private static final /* synthetic */ TicketStatus[] $values() {
        return new TicketStatus[]{Submitted, InProgress, WaitingOnCustomer, Resolved};
    }

    static {
        long jE = Q3.d.e(4278212607L);
        int i10 = R.drawable.intercom_ticket_submitted_icon;
        Submitted = new TicketStatus("Submitted", 0, jE, i10);
        InProgress = new TicketStatus("InProgress", 1, Q3.d.e(4278212607L), i10);
        WaitingOnCustomer = new TicketStatus("WaitingOnCustomer", 2, Q3.d.e(4291644690L), R.drawable.intercom_ticket_waiting_icon);
        Resolved = new TicketStatus("Resolved", 3, Q3.d.e(4279072050L), R.drawable.intercom_ticket_resolved_icon);
        TicketStatus[] ticketStatusArr$values = $values();
        $VALUES = ticketStatusArr$values;
        $ENTRIES = kotlin.enums.a.a(ticketStatusArr$values);
    }

    private TicketStatus(String str, int i10, long j, int i11) {
        super(str, i10);
        this.color = j;
        this.iconRes = i11;
    }

    public static Ba.a<TicketStatus> getEntries() {
        return $ENTRIES;
    }

    public static TicketStatus valueOf(String str) {
        return (TicketStatus) Enum.valueOf(TicketStatus.class, str);
    }

    public static TicketStatus[] values() {
        return (TicketStatus[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m477getColor0d7_KjU() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }
}
