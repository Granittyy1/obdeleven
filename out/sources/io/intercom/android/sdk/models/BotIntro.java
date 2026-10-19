package io.intercom.android.sdk.models;

import I7.b;
import Q8.d;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BotIntro.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BotIntro {

    @b("parts")
    private final List<List<Block.Builder>> blocks;

    @b("id")
    private final String id;

    @b("operator")
    private final Participant.Builder operator;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final BotIntro NULL = new BotIntro(null, null, null, 7, null);

    /* JADX INFO: compiled from: BotIntro.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public BotIntro() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotIntro copy$default(BotIntro botIntro, String str, Participant.Builder builder, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = botIntro.id;
        }
        if ((i10 & 2) != 0) {
            builder = botIntro.operator;
        }
        if ((i10 & 4) != 0) {
            list = botIntro.blocks;
        }
        return botIntro.copy(str, builder, list);
    }

    public final String component1() {
        return this.id;
    }

    public final Participant.Builder component2() {
        return this.operator;
    }

    public final List<List<Block.Builder>> component3() {
        return this.blocks;
    }

    public final BotIntro copy(String id, Participant.Builder operator, List<? extends List<Block.Builder>> blocks) {
        i.e(id, "id");
        i.e(operator, "operator");
        i.e(blocks, "blocks");
        return new BotIntro(id, operator, blocks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotIntro)) {
            return false;
        }
        BotIntro botIntro = (BotIntro) obj;
        return i.a(this.id, botIntro.id) && i.a(this.operator, botIntro.operator) && i.a(this.blocks, botIntro.blocks);
    }

    public final List<List<Block.Builder>> getBlocks() {
        return this.blocks;
    }

    public final Participant getBuiltParticipant() {
        Participant participantBuild = this.operator.build();
        i.d(participantBuild, "build(...)");
        return participantBuild;
    }

    public final String getId() {
        return this.id;
    }

    public final Participant.Builder getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return this.blocks.hashCode() + ((this.operator.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BotIntro(id=");
        sb2.append(this.id);
        sb2.append(", operator=");
        sb2.append(this.operator);
        sb2.append(", blocks=");
        return d.b(sb2, this.blocks, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BotIntro(String id, Participant.Builder operator, List<? extends List<Block.Builder>> blocks) {
        i.e(id, "id");
        i.e(operator, "operator");
        i.e(blocks, "blocks");
        this.id = id;
        this.operator = operator;
        this.blocks = blocks;
    }

    public BotIntro(String str, Participant.Builder builder, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new Participant.Builder() : builder, (i10 & 4) != 0 ? EmptyList.f42983b : list);
    }
}
