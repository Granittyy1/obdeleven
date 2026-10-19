package io.intercom.android.sdk.tickets.list.ui;

import Ia.l;
import Ia.r;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsScreenKt$TicketsScreenContent$2$1 implements r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ l<String, p293xa.r> $onClick;
    final /* synthetic */ TicketsScreenUiState.Content $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsScreenKt$TicketsScreenContent$2$1(TicketsScreenUiState.Content content, l<? super String, p293xa.r> lVar) {
        this.$uiState = content;
        this.$onClick = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$2$lambda$1$lambda$0(l lVar, TicketRowData data) {
        i.e(data, "$data");
        lVar.invoke(data.getId());
        return p293xa.r.f47939a;
    }

    @Override // Ia.r
    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
        invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(androidx.compose.foundation.lazy.b items, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        i.e(items, "$this$items");
        if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= interfaceC1084f.h(i10) ? 32 : 16;
        }
        if ((i11 & 721) == 144 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        final TicketRowData ticketRowDataB = this.$uiState.getLazyPagingTickets().b(i10);
        if (ticketRowDataB == null) {
            return;
        }
        final l<String, p293xa.r> lVar = this.$onClick;
        h.a aVar = h.a.f13984b;
        interfaceC1084f.L(122186268);
        boolean zK = interfaceC1084f.K(lVar) | interfaceC1084f.K(ticketRowDataB);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a() { // from class: io.intercom.android.sdk.tickets.list.ui.f
                @Override // Ia.a
                public final Object invoke() {
                    return TicketsScreenKt$TicketsScreenContent$2$1.invoke$lambda$2$lambda$1$lambda$0(lVar, ticketRowDataB);
                }
            };
            interfaceC1084f.E(objF);
        }
        interfaceC1084f.D();
        TicketRowKt.TicketRow(ClickableKt.c(aVar, false, null, (Ia.a) objF, 7), ticketRowDataB, null, false, interfaceC1084f, 0, 12);
        IntercomDividerKt.IntercomDivider(PaddingKt.h(aVar, 20, 0.0f, 2), interfaceC1084f, 6, 0);
    }
}
