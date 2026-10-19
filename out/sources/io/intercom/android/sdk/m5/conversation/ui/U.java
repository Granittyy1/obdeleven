package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;
import io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38479b;

    public /* synthetic */ U(int i10) {
        this.f38479b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38479b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$66((HeaderMenuItem) obj);
            case 1:
                return ConversationBottomBarKt.ConversationBottomBar_wn8IZOc$lambda$0((MetricData) obj);
            case 2:
                return HomeContentScreenKt.HomeContentScreen$lambda$5((Conversation) obj);
            case 3:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$2((C2748s) obj);
            case 4:
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$0((AttributeData) obj);
            default:
                p141l2.C it = (p141l2.C) obj;
                kotlin.jvm.internal.i.e(it, "it");
                return it.f44220d;
        }
    }
}
