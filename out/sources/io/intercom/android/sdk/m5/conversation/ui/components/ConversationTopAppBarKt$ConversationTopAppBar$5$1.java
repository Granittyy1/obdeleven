package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.N0;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import java.util.List;

/* JADX INFO: compiled from: ConversationTopAppBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationTopAppBarKt$ConversationTopAppBar$5$1 implements Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ N0<androidx.compose.ui.graphics.H> $contentColorState;
    final /* synthetic */ Ia.l<HeaderMenuItem, p293xa.r> $onMenuClicked;
    final /* synthetic */ TopAppBarUiState $topAppBarUiState;
    final /* synthetic */ Ia.l<MetricData, p293xa.r> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationTopAppBarKt$ConversationTopAppBar$5$1(TopAppBarUiState topAppBarUiState, Ia.l<? super HeaderMenuItem, p293xa.r> lVar, N0<androidx.compose.ui.graphics.H> n10, Ia.l<? super MetricData, p293xa.r> lVar2) {
        this.$topAppBarUiState = topAppBarUiState;
        this.$onMenuClicked = lVar;
        this.$contentColorState = n10;
        this.$trackMetric = lVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1$lambda$0(Ia.l lVar, HeaderMenuItem item) {
        kotlin.jvm.internal.i.e(item, "item");
        lVar.invoke(item);
        return p293xa.r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(u10, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(androidx.compose.foundation.layout.U TopActionBar, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(TopActionBar, "$this$TopActionBar");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        List<HeaderMenuItem> headerMenuItems = this.$topAppBarUiState.getHeaderMenuItems();
        interfaceC1084f.L(-1166850860);
        boolean zK = interfaceC1084f.K(this.$onMenuClicked);
        final Ia.l<HeaderMenuItem, p293xa.r> lVar = this.$onMenuClicked;
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return ConversationTopAppBarKt$ConversationTopAppBar$5$1.invoke$lambda$1$lambda$0(lVar, (HeaderMenuItem) obj);
                }
            };
            interfaceC1084f.E(objF);
        }
        interfaceC1084f.D();
        ConversationKebabKt.m181ConversationKebabcf5BqRc(headerMenuItems, (Ia.l) objF, this.$contentColorState.getValue().f13506a, this.$trackMetric, interfaceC1084f, 8, 0);
    }
}
