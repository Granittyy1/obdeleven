package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ConversationBottomBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationBottomBarKt$ConversationBottomBar$3$1$4 implements Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ Context $context;
    final /* synthetic */ Ia.a<p293xa.r> $onPrivacyNoticeDismissed;
    final /* synthetic */ InterfaceC0954n $this_Column;
    final /* synthetic */ Ia.l<MetricData, p293xa.r> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationBottomBarKt$ConversationBottomBar$3$1$4(BottomBarUiState bottomBarUiState, Ia.a<p293xa.r> aVar, InterfaceC0954n interfaceC0954n, Ia.l<? super MetricData, p293xa.r> lVar, Context context) {
        this.$bottomBarUiState = bottomBarUiState;
        this.$onPrivacyNoticeDismissed = aVar;
        this.$this_Column = interfaceC0954n;
        this.$trackMetric = lVar;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1$lambda$0(Ia.l lVar, PoweredBy this_with, Context context) {
        kotlin.jvm.internal.i.e(this_with, "$this_with");
        kotlin.jvm.internal.i.e(context, "$context");
        lVar.invoke(MetricData.PoweredByClicked.INSTANCE);
        LinkOpener.handleUrl(this_with.getLinkUrl(), context, Injector.get().getApi());
        return p293xa.r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0928f, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
        BottomBarUiState.BottomBadgeState bottomBadge = this.$bottomBarUiState.getBottomBadge();
        boolean z10 = bottomBadge instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        if (z10) {
            interfaceC1084f.L(-249535578);
            final PoweredBy poweredBy = ((BottomBarUiState.BottomBadgeState.PoweredByBadgeState) this.$bottomBarUiState.getBottomBadge()).getPoweredBy();
            InterfaceC0954n interfaceC0954n = this.$this_Column;
            final Ia.l<MetricData, p293xa.r> lVar = this.$trackMetric;
            final Context context = this.$context;
            PoweredByBadgeKt.m128PoweredByBadgewBJOh4Y(poweredBy.getText(), poweredBy.getIcon(), new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.E
                @Override // Ia.a
                public final Object invoke() {
                    return ConversationBottomBarKt$ConversationBottomBar$3$1$4.invoke$lambda$1$lambda$0(lVar, poweredBy, context);
                }
            }, interfaceC0954n.b(aVar, androidx.compose.ui.d.a.f13347n), androidx.compose.ui.graphics.H.f13503k, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f, 24576, 0);
            interfaceC1084f.D();
            return;
        }
        if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) {
            interfaceC1084f.L(-248466884);
            PrivacyPolicyKt.PrivacyPolicy(((BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) this.$bottomBarUiState.getBottomBadge()).getText(), PaddingKt.g(16, 4, aVar), this.$onPrivacyNoticeDismissed, interfaceC1084f, 48, 0);
            interfaceC1084f.D();
        } else if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.None) {
            interfaceC1084f.L(-248063915);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(-1254978776);
            interfaceC1084f.D();
            throw new NoWhenBranchMatchedException();
        }
    }
}
