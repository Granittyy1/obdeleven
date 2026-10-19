package io.intercom.android.sdk.m5.components;

/* JADX INFO: compiled from: TicketHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketStatusHeaderArgs {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.font.l fontWeight;
    private final String title;

    public TicketStatusHeaderArgs(String title, androidx.compose.ui.text.font.l fontWeight) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(fontWeight, "fontWeight");
        this.title = title;
        this.fontWeight = fontWeight;
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String str, androidx.compose.ui.text.font.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketStatusHeaderArgs.title;
        }
        if ((i10 & 2) != 0) {
            lVar = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy(str, lVar);
    }

    public final String component1() {
        return this.title;
    }

    public final androidx.compose.ui.text.font.l component2() {
        return this.fontWeight;
    }

    public final TicketStatusHeaderArgs copy(String title, androidx.compose.ui.text.font.l fontWeight) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(fontWeight, "fontWeight");
        return new TicketStatusHeaderArgs(title, fontWeight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        TicketStatusHeaderArgs ticketStatusHeaderArgs = (TicketStatusHeaderArgs) obj;
        return kotlin.jvm.internal.i.a(this.title, ticketStatusHeaderArgs.title) && kotlin.jvm.internal.i.a(this.fontWeight, ticketStatusHeaderArgs.fontWeight);
    }

    public final androidx.compose.ui.text.font.l getFontWeight() {
        return this.fontWeight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fontWeight.f15447b;
    }

    public String toString() {
        return "TicketStatusHeaderArgs(title=" + this.title + ", fontWeight=" + this.fontWeight + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TicketStatusHeaderArgs(String str, androidx.compose.ui.text.font.l lVar, int i10, kotlin.jvm.internal.e eVar) {
        if ((i10 & 2) != 0) {
            androidx.compose.ui.text.font.l lVar2 = androidx.compose.ui.text.font.l.f15438c;
            lVar = androidx.compose.ui.text.font.l.f15442g;
        }
        this(str, lVar);
    }
}
