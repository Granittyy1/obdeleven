package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LazyMessageListKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$LazyMessageListKt$lambda2$1 INSTANCE = new ComposableSingletons$LazyMessageListKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(ReplyOption it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        ListBuilder listBuilderF = M1.f();
        listBuilderF.add(new ContentRow.TeamIntroRow("Our team is here to help you with any questions you have"));
        listBuilderF.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
        kotlin.jvm.internal.i.d(partBuild, "build(...)");
        ContentRow.BubbleMessageRow.PartWrapper partWrapper = new ContentRow.BubbleMessageRow.PartWrapper(partBuild, false, true, null, null, 24, null);
        GroupingPosition groupingPosition = GroupingPosition.STANDALONE;
        listBuilderF.add(new ContentRow.BubbleMessageRow(partWrapper, groupingPosition, null, false, false, 16, null));
        listBuilderF.add(new ContentRow.DayDividerRow(164138400L));
        Part partBuild2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
        kotlin.jvm.internal.i.d(partBuild2, "build(...)");
        boolean z10 = false;
        boolean z11 = false;
        PendingMessage.FailedImageUploadData failedImageUploadData = null;
        int i11 = 16;
        kotlin.jvm.internal.e eVar = null;
        listBuilderF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild2, false, true, null, null, 24, null), GroupingPosition.TOP, failedImageUploadData, z10, z11, i11, eVar));
        Part partBuild3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getArticleBlock())).build();
        kotlin.jvm.internal.i.d(partBuild3, "build(...)");
        PendingMessage.FailedImageUploadData failedImageUploadData2 = null;
        listBuilderF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild3, false, true, null, null, 24, null), GroupingPosition.MIDDLE, failedImageUploadData2, false, false, 16, null));
        Part partBuild4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getCreateTicketBlock())).build();
        kotlin.jvm.internal.i.d(partBuild4, "build(...)");
        listBuilderF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild4, false, true, null, null, 24, null), GroupingPosition.BOTTOM, failedImageUploadData, z10, z11, i11, eVar));
        Part partBuild5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(M1.k(BubbleMessageRowKt.getParagraphBlock())).build();
        kotlin.jvm.internal.i.d(partBuild5, "build(...)");
        listBuilderF.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild5, false, false, null, null, 24, null), groupingPosition, null, true, false, 16, null));
        LazyMessageListKt.LazyMessageList(null, listBuilderF.I(), null, null, new C2355d(), null, null, null, null, null, false, null, false, null, interfaceC1084f, 24640, 0, 16365);
    }
}
