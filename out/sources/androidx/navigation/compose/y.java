package androidx.navigation.compose;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.animation.core.C0907g;
import io.intercom.android.sdk.api.KotlinXConvertorFactory;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import java.util.List;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19207b;

    public /* synthetic */ y(int i10) {
        this.f19207b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f19207b) {
            case 0:
                return EnterExitTransitionKt.e(C0907g.d(700, 0, null, 6), 0.0f, 2);
            case 1:
                return KotlinXConvertorFactory.getConvertorFactory$lambda$0((p050db.d) obj);
            case 2:
                return ConversationScreenKt.ConversationScreenContent$lambda$55((List) obj);
            case 3:
                return ConversationScreenKt.ConversationScreen$lambda$4((TicketType) obj);
            case 4:
                return LazyMessageListKt.LazyMessageList$lambda$4((AttributeData) obj);
            case 5:
                return MessageListKt.MessageList$lambda$4((AttributeData) obj);
            case 6:
                return ConversationDestinationKt.conversationDestination$lambda$3((C2748s) obj);
            case 7:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$5((InterfaceC0927e) obj);
            case 8:
                return TextBlockKt.TextBlock$lambda$1((List) obj);
            default:
                return SurveyComponentKt.SimpleSurvey$lambda$8((String) obj);
        }
    }
}
