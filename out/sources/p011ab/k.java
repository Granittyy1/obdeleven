package p011ab;

import Ia.l;
import androidx.compose.ui.text.B;
import com.google.gson.g;
import io.intercom.android.sdk.api.ErrorStringExtractorKt;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import kotlin.jvm.internal.i;
import p141l2.C2748s;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8121b;

    public /* synthetic */ k(int i10) {
        this.f8121b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f8121b) {
            case 0:
                i.e((a) obj, "<this>");
                return r.f47939a;
            case 1:
                return ErrorStringExtractorKt.extractErrorString$lambda$0((g) obj);
            case 2:
                return ConversationScreenKt.ConversationScreen$lambda$3((String) obj);
            case 3:
                return LazyMessageListKt.LazyMessageList$lambda$3((PendingMessage.FailedImageUploadData) obj);
            case 4:
                return MessageListKt.MessageList$lambda$3((PendingMessage.FailedImageUploadData) obj);
            case 5:
                return ConversationDestinationKt.conversationDestination$lambda$2((C2748s) obj);
            case 6:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$4((C2748s) obj);
            default:
                return TextBlockKt.TextBlock$lambda$0((B) obj);
        }
    }
}
