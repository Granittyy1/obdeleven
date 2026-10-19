package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.HomeCardScaffoldKt;
import io.intercom.android.sdk.m5.components.Y;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: RecentTicketsCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RecentTicketsCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.RecentTicketsCardKt$RecentTicketsCard$2, reason: invalid class name */
    /* JADX INFO: compiled from: RecentTicketsCard.kt */
    public static final class AnonymousClass2 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Ia.l<String, p293xa.r> $onClick;
        final /* synthetic */ List<Ticket> $tickets;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<Ticket> list, Ia.l<? super String, p293xa.r> lVar) {
            this.$tickets = list;
            this.$onClick = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(Ia.l lVar, Ticket it) {
            kotlin.jvm.internal.i.e(it, "$it");
            lVar.invoke(it.getId());
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            List<Ticket> list = this.$tickets;
            final Ia.l<String, p293xa.r> lVar = this.$onClick;
            for (final Ticket ticket : list) {
                boolean z10 = false;
                androidx.compose.ui.h hVarC = ClickableKt.c(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), false, null, new Ia.a() { // from class: io.intercom.android.sdk.tickets.i
                    @Override // Ia.a
                    public final Object invoke() {
                        return RecentTicketsCardKt.AnonymousClass2.invoke$lambda$1$lambda$0(lVar, ticket);
                    }
                }, 7);
                float f10 = 8;
                float f11 = 20;
                N n10 = new N(f11, f10, f11, f10);
                TicketRowData ticketRowDataReduceTicketRowData = TicketRowReducerKt.reduceTicketRowData(ticket);
                Boolean boolIsRead = ticket.isRead();
                if (boolIsRead != null && !boolIsRead.booleanValue()) {
                    z10 = true;
                }
                TicketRowKt.TicketRow(hVarC, ticketRowDataReduceTicketRowData, n10, z10, interfaceC1084f, 0, 0);
            }
        }
    }

    public static final void RecentTicketsCard(androidx.compose.ui.h hVar, final String cardTitle, final List<Ticket> tickets, Ia.l<? super String, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(cardTitle, "cardTitle");
        kotlin.jvm.internal.i.e(tickets, "tickets");
        C1086g c1086gP = interfaceC1084f.p(1214351394);
        if ((i11 & 1) != 0) {
            hVar = androidx.compose.ui.h.a.f13984b;
        }
        if ((i11 & 8) != 0) {
            lVar = new C2399n(6);
        }
        HomeCardScaffoldKt.HomeCardScaffold(hVar, cardTitle, androidx.compose.runtime.internal.a.b(1499488214, new AnonymousClass2(tickets, lVar), c1086gP), c1086gP, (i10 & 14) | 384 | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar2 = hVar;
            final Ia.l<? super String, p293xa.r> lVar2 = lVar;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.h
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return RecentTicketsCardKt.RecentTicketsCard$lambda$1(hVar2, cardTitle, tickets, lVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RecentTicketsCard$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RecentTicketsCard$lambda$1(androidx.compose.ui.h hVar, String cardTitle, List tickets, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(cardTitle, "$cardTitle");
        kotlin.jvm.internal.i.e(tickets, "$tickets");
        RecentTicketsCard(hVar, cardTitle, tickets, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void RecentTicketsCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1547026625);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$RecentTicketsCardKt.INSTANCE.m460getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RecentTicketsCardPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        RecentTicketsCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
