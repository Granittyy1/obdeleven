package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import p005a4.o;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;
    private final String id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    public AutoValue_Link(String str, Card card, List<Block> list, ReactionReply reactionReply, long j, long j10) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (card == null) {
            throw new NullPointerException("Null card");
        }
        this.card = card;
        if (list == null) {
            throw new NullPointerException("Null blocks");
        }
        this.blocks = list;
        if (reactionReply == null) {
            throw new NullPointerException("Null reactionReply");
        }
        this.reactionReply = reactionReply;
        this.createdAt = j;
        this.updatedAt = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return this.id.equals(link.getId()) && this.card.equals(link.getCard()) && this.blocks.equals(link.getBlocks()) && this.reactionReply.equals(link.getReactionReply()) && this.createdAt == link.getCreatedAt() && this.updatedAt == link.getUpdatedAt();
    }

    @Override // io.intercom.android.sdk.models.Link
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.Link
    public Card getCard() {
        return this.card;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.intercom.android.sdk.models.Link
    public String getId() {
        return this.id;
    }

    @Override // io.intercom.android.sdk.models.Link
    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = (((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003;
        long j = this.createdAt;
        long j10 = this.updatedAt;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Link{id=");
        sb2.append(this.id);
        sb2.append(", card=");
        sb2.append(this.card);
        sb2.append(", blocks=");
        sb2.append(this.blocks);
        sb2.append(", reactionReply=");
        sb2.append(this.reactionReply);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", updatedAt=");
        return o.d(this.updatedAt, "}", sb2);
    }
}
