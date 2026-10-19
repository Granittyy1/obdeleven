package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageListKt$MessageList$13$1$renderMessageRow$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ ContentRow $item;
    final /* synthetic */ Ia.l<TicketType, p293xa.r> $onCreateTicket;
    final /* synthetic */ Ia.l<PendingMessage.FailedImageUploadData, p293xa.r> $onRetryImageClicked;
    final /* synthetic */ Ia.l<Part, p293xa.r> $onRetryMessageClicked;
    final /* synthetic */ Ia.l<AttributeData, p293xa.r> $onSubmitAttribute;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageListKt$MessageList$13$1$renderMessageRow$1(ContentRow contentRow, Ia.l<? super AttributeData, p293xa.r> lVar, Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar2, Ia.l<? super TicketType, p293xa.r> lVar3, Ia.l<? super Part, p293xa.r> lVar4) {
        this.$item = contentRow;
        this.$onSubmitAttribute = lVar;
        this.$onRetryImageClicked = lVar2;
        this.$onCreateTicket = lVar3;
        this.$onRetryMessageClicked = lVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(Ia.l lVar, ContentRow item) {
        kotlin.jvm.internal.i.e(item, "$item");
        lVar.invoke(((ContentRow.BubbleMessageRow) item).getPartWrapper().getPart());
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        FailedMessage failedMessage;
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
        Part part = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart();
        String hourOfDay = TimeFormatterExtKt.toHourOfDay(((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart().getCreatedAt());
        List<String> failedAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getFailedAttributeIdentifiers();
        List<String> loadingAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getLoadingAttributeIdentifiers();
        GroupingPosition groupingPosition = ((ContentRow.BubbleMessageRow) this.$item).getGroupingPosition();
        boolean zIsAdminOrAltParticipant = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().isAdminOrAltParticipant();
        PendingMessage.FailedImageUploadData failedImageUploadData = ((ContentRow.BubbleMessageRow) this.$item).getFailedImageUploadData();
        interfaceC1084f.L(-1874256916);
        if (((ContentRow.BubbleMessageRow) this.$item).isFailed()) {
            String strP = S4.o.p(interfaceC1084f, R.string.intercom_failed_delivery);
            final Ia.l<Part, p293xa.r> lVar = this.$onRetryMessageClicked;
            final ContentRow contentRow = this.$item;
            failedMessage = new FailedMessage(strP, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.T
                @Override // Ia.a
                public final Object invoke() {
                    return MessageListKt$MessageList$13$1$renderMessageRow$1.invoke$lambda$0(lVar, contentRow);
                }
            });
        } else {
            failedMessage = null;
        }
        FailedMessage failedMessage2 = failedMessage;
        interfaceC1084f.D();
        BubbleMessageRowKt.BubbleMessageRow(part, groupingPosition, zIsAdminOrAltParticipant, hVarD, hourOfDay, this.$onSubmitAttribute, failedAttributeIdentifiers, loadingAttributeIdentifiers, this.$onRetryImageClicked, failedImageUploadData, failedMessage2, this.$onCreateTicket, interfaceC1084f, 18877448, 0, 0);
    }
}
