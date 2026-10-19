package io.intercom.android.sdk.m5.conversation.states;

import A1.C0575j;
import B1.a;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConversationClientState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FinStreamingData {
    public static final int $stable = 8;
    private final List<Block> blocks;
    private final String clientAssignedUUID;
    private final boolean isFinStreaming;
    private final int tokenSequenceIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public FinStreamingData(boolean z10, List<? extends Block> blocks, String clientAssignedUUID, int i10) {
        i.e(blocks, "blocks");
        i.e(clientAssignedUUID, "clientAssignedUUID");
        this.isFinStreaming = z10;
        this.blocks = blocks;
        this.clientAssignedUUID = clientAssignedUUID;
        this.tokenSequenceIndex = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinStreamingData copy$default(FinStreamingData finStreamingData, boolean z10, List list, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = finStreamingData.isFinStreaming;
        }
        if ((i11 & 2) != 0) {
            list = finStreamingData.blocks;
        }
        if ((i11 & 4) != 0) {
            str = finStreamingData.clientAssignedUUID;
        }
        if ((i11 & 8) != 0) {
            i10 = finStreamingData.tokenSequenceIndex;
        }
        return finStreamingData.copy(z10, list, str, i10);
    }

    public final boolean component1() {
        return this.isFinStreaming;
    }

    public final List<Block> component2() {
        return this.blocks;
    }

    public final String component3() {
        return this.clientAssignedUUID;
    }

    public final int component4() {
        return this.tokenSequenceIndex;
    }

    public final FinStreamingData copy(boolean z10, List<? extends Block> blocks, String clientAssignedUUID, int i10) {
        i.e(blocks, "blocks");
        i.e(clientAssignedUUID, "clientAssignedUUID");
        return new FinStreamingData(z10, blocks, clientAssignedUUID, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinStreamingData)) {
            return false;
        }
        FinStreamingData finStreamingData = (FinStreamingData) obj;
        return this.isFinStreaming == finStreamingData.isFinStreaming && i.a(this.blocks, finStreamingData.blocks) && i.a(this.clientAssignedUUID, finStreamingData.clientAssignedUUID) && this.tokenSequenceIndex == finStreamingData.tokenSequenceIndex;
    }

    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final String getClientAssignedUUID() {
        return this.clientAssignedUUID;
    }

    public final int getTokenSequenceIndex() {
        return this.tokenSequenceIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.tokenSequenceIndex) + a.b(this.clientAssignedUUID, p.d(Boolean.hashCode(this.isFinStreaming) * 31, 31, this.blocks), 31);
    }

    public final boolean isFinStreaming() {
        return this.isFinStreaming;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FinStreamingData(isFinStreaming=");
        sb2.append(this.isFinStreaming);
        sb2.append(", blocks=");
        sb2.append(this.blocks);
        sb2.append(", clientAssignedUUID=");
        sb2.append(this.clientAssignedUUID);
        sb2.append(", tokenSequenceIndex=");
        return C0575j.b(sb2, this.tokenSequenceIndex, ')');
    }
}
