package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: compiled from: ConversationKebab.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationKebabKt$ConversationKebab$3$3$3 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ List<HeaderMenuItem> $headerMenuItems;
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $isExpanded;
    final /* synthetic */ Ia.l<HeaderMenuItem, p293xa.r> $onMenuClicked;
    final /* synthetic */ Ia.l<MetricData, p293xa.r> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationKebabKt$ConversationKebab$3$3$3(List<? extends HeaderMenuItem> list, Ia.l<? super HeaderMenuItem, p293xa.r> lVar, Ia.l<? super MetricData, p293xa.r> lVar2, long j, androidx.compose.runtime.X<Boolean> x10) {
        this.$headerMenuItems = list;
        this.$onMenuClicked = lVar;
        this.$trackMetric = lVar2;
        this.$contentColor = j;
        this.$isExpanded = x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$2$lambda$1$lambda$0(androidx.compose.runtime.X isExpanded, Ia.l lVar, HeaderMenuItem it, Ia.l lVar2) {
        kotlin.jvm.internal.i.e(isExpanded, "$isExpanded");
        kotlin.jvm.internal.i.e(it, "$it");
        isExpanded.setValue(Boolean.FALSE);
        lVar.invoke(it);
        lVar2.invoke(ConversationKebabKt.metricData(it, true));
        return p293xa.r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0954n, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC0954n DropdownMenu, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(DropdownMenu, "$this$DropdownMenu");
        if ((i10 & 81) == 16 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        List<HeaderMenuItem> list = this.$headerMenuItems;
        final Ia.l<HeaderMenuItem, p293xa.r> lVar = this.$onMenuClicked;
        final Ia.l<MetricData, p293xa.r> lVar2 = this.$trackMetric;
        long j = this.$contentColor;
        final androidx.compose.runtime.X<Boolean> x10 = this.$isExpanded;
        for (final HeaderMenuItem headerMenuItem : list) {
            String text = headerMenuItem.getLabel().getText(interfaceC1084f, StringProvider.$stable);
            int iIcon = ConversationKebabKt.icon(headerMenuItem);
            String strBadgeText = ConversationKebabKt.badgeText(headerMenuItem);
            boolean zShouldShowUnreadDot = ConversationKebabKt.shouldShowUnreadDot(headerMenuItem);
            interfaceC1084f.L(1730714746);
            boolean zK = interfaceC1084f.K(lVar) | interfaceC1084f.K(headerMenuItem) | interfaceC1084f.K(lVar2);
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.m
                    @Override // Ia.a
                    public final Object invoke() {
                        return ConversationKebabKt$ConversationKebab$3$3$3.invoke$lambda$2$lambda$1$lambda$0(x10, lVar, headerMenuItem, lVar2);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text, iIcon, strBadgeText, true, zShouldShowUnreadDot, true, (Ia.a) objF, headerMenuItem.getEnabled(), j, interfaceC1084f, 1597440, 1);
            lVar = lVar;
            x10 = x10;
            lVar2 = lVar2;
        }
    }
}
