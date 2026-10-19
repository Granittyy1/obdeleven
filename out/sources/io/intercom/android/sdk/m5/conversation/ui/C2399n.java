package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;
import java.util.List;
import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2399n implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39088b;

    public /* synthetic */ C2399n(int i10) {
        this.f39088b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39088b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$53((String) obj);
            case 1:
                return LazyMessageListKt.LazyMessageList$lambda$2((Part) obj);
            case 2:
                return MessageListKt.MessageList$lambda$2((Part) obj);
            case 3:
                return ConversationDestinationKt.conversationDestination$lambda$1((C2748s) obj);
            case 4:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$3((C2748s) obj);
            case 5:
                return SurveyComponentKt.SimpleSurvey$lambda$6((kotlinx.coroutines.A) obj);
            case 6:
                return RecentTicketsCardKt.RecentTicketsCard$lambda$0((String) obj);
            case 7:
                return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$5((List) obj);
            case 8:
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$0((AttributeData) obj);
            default:
                p014b1.a initializer = (p014b1.a) obj;
                kotlin.jvm.internal.i.e(initializer, "$this$initializer");
                return new p141l2.x();
        }
    }
}
