package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.l;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PartExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PartExtensionsKt {
    public static final boolean hasNextConcatPartNewStyle(List<? extends Part> list, int i10) {
        i.e(list, "<this>");
        return i10 >= 0 && i10 < l.r(list) && shouldConcatenate(list.get(i10), list.get(i10 + 1));
    }

    public static final boolean hasPreviousConcatPartNewStyle(List<? extends Part> list, int i10) {
        i.e(list, "<this>");
        return 1 <= i10 && i10 <= l.r(list) && shouldConcatenate(list.get(i10 + (-1)), list.get(i10));
    }

    public static final boolean isAttributeCollector(Part part) {
        i.e(part, "<this>");
        return part.getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR && !part.getForm().getAttributes().isEmpty();
    }

    public static final boolean isLinkCard(Part part) {
        i.e(part, "<this>");
        return isSingleBlockPartOfType(part, BlockType.LINK) && MessageStyle.CHAT == part.getMessageStyle();
    }

    public static final boolean isQuickReplyOnly(Part part) {
        i.e(part, "<this>");
        List<ReplyOption> replyOptions = part.getReplyOptions();
        i.d(replyOptions, "getReplyOptions(...)");
        return !replyOptions.isEmpty() && part.getBlocks().isEmpty();
    }

    private static final boolean isSingleBlockPartOfType(Part part, BlockType blockType) {
        return part.getBlocks().size() == 1 && part.getBlocks().get(0).getType() == blockType;
    }

    public static final boolean isTypingPart(Part part) {
        i.e(part, "<this>");
        return part.getMessageStyle() == MessageStyle.ADMIN_IS_TYPING_STYLE;
    }

    public static final boolean nextPartFromSameParticipant(Part part, Part nextPart) {
        i.e(part, "<this>");
        i.e(nextPart, "nextPart");
        return i.a(part.getParticipantId(), nextPart.getParticipantId());
    }

    private static final boolean shouldConcatenate(Part part, Part part2) {
        if (nextPartFromSameParticipant(part, part2) && Math.abs(part2.getCreatedAt() - part.getCreatedAt()) < TimeUnit.MINUTES.toSeconds(3L) && !isTypingPart(part) && !isTypingPart(part2) && !isLinkCard(part) && !isLinkCard(part2) && !part.isEvent().booleanValue() && !part2.isEvent().booleanValue() && !isAttributeCollector(part) && !isAttributeCollector(part2) && !isQuickReplyOnly(part) && !isQuickReplyOnly(part2)) {
            MessageStyle messageStyle = part.getMessageStyle();
            MessageStyle messageStyle2 = MessageStyle.POST;
            if (messageStyle != messageStyle2 && part2.getMessageStyle() != messageStyle2) {
                MessageStyle messageStyle3 = part.getMessageStyle();
                MessageStyle messageStyle4 = MessageStyle.NOTE;
                if (messageStyle3 != messageStyle4 && part2.getMessageStyle() != messageStyle4) {
                    return true;
                }
            }
        }
        return false;
    }
}
