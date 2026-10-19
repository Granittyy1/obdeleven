package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.O;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.survey.block.C2463a;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TicketsEmptyScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsEmptyScreenKt {
    private static final void EmptyScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1850741992);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m492getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyScreenPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void TicketsEmptyScreen(EmptyState emptyState, h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        i.e(emptyState, "emptyState");
        C1086g c1086gP = interfaceC1084f.p(1360358580);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(emptyState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(hVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = h.a.f13984b;
            }
            EmptyStateKt.EmptyState(emptyState.getTitle(), hVar, emptyState.getText(), Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon), null, c1086gP, i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 16);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2463a(emptyState, hVar, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsEmptyScreen$lambda$0(EmptyState emptyState, h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(emptyState, "$emptyState");
        TicketsEmptyScreen(emptyState, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
