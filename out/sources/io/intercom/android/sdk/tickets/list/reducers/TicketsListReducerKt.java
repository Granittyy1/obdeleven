package io.intercom.android.sdk.tickets.list.reducers;

import Ia.a;
import S4.o;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.paging.compose.b;
import androidx.paging.l;
import androidx.paging.m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.O0;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import java.io.IOException;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: TicketsListReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsListReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final TicketsScreenUiState reduceToTicketsScreenUiState(b<TicketRowData> bVar, a<AppConfig> aVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        TicketsScreenUiState empty;
        ErrorState withoutCTA;
        i.e(bVar, "<this>");
        interfaceC1084f.L(-356015290);
        String spaceLabelIfExists = ((i11 & 1) != 0 ? new R9.a(0) : aVar).invoke().getSpaceLabelIfExists(Space.Type.TICKETS);
        interfaceC1084f.L(-374395883);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = o.p(interfaceC1084f, R.string.intercom_tickets_space_title);
        }
        interfaceC1084f.D();
        if (((l) bVar.f19335d.getValue()).e() != 0) {
            boolean z10 = bVar.c().f19341c instanceof m.b;
            m mVar = bVar.c().f19341c;
            ErrorState errorState = null;
            m.a aVar2 = mVar instanceof m.a ? (m.a) mVar : null;
            if (aVar2 != null) {
                if (aVar2.f19371b instanceof IOException) {
                    withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, new O0(2, bVar), 15, null);
                } else {
                    withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                }
                errorState = withoutCTA;
            }
            empty = new TicketsScreenUiState.Content(bVar, z10, errorState, spaceLabelIfExists);
        } else if (bVar.c().f19339a instanceof m.a) {
            m mVar2 = bVar.c().f19339a;
            i.c(mVar2, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            if (((m.a) mVar2).f19371b instanceof IOException) {
                empty = new TicketsScreenUiState.Error(new ErrorState.WithCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 0, new R9.b(0, bVar), 11, null), spaceLabelIfExists);
            } else {
                empty = new TicketsScreenUiState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 3, null), spaceLabelIfExists);
            }
        } else if (bVar.c().f19339a instanceof m.b) {
            empty = new TicketsScreenUiState.Initial(spaceLabelIfExists);
        } else {
            empty = new TicketsScreenUiState.Empty(new EmptyState(o.p(interfaceC1084f, R.string.intercom_tickets_empty_state_title), o.p(interfaceC1084f, R.string.intercom_tickets_empty_state_text), null, 4, null), spaceLabelIfExists);
        }
        interfaceC1084f.D();
        return empty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig reduceToTicketsScreenUiState$lambda$0() {
        return (AppConfig) Z3.o.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r reduceToTicketsScreenUiState$lambda$2$lambda$1(b this_reduceToTicketsScreenUiState) {
        i.e(this_reduceToTicketsScreenUiState, "$this_reduceToTicketsScreenUiState");
        b.a aVar = this_reduceToTicketsScreenUiState.f19334c;
        aVar.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        aVar.f19295c.a();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r reduceToTicketsScreenUiState$lambda$3(b this_reduceToTicketsScreenUiState) {
        i.e(this_reduceToTicketsScreenUiState, "$this_reduceToTicketsScreenUiState");
        this_reduceToTicketsScreenUiState.d();
        return r.f47939a;
    }
}
