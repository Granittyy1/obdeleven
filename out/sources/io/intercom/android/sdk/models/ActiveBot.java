package io.intercom.android.sdk.models;

import I7.b;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ActiveBot.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ActiveBot {
    public static final int $stable = 8;

    @b("has_ai")
    private final boolean isAi;

    @b("has_customized_identity")
    private final boolean isIdentityCustomized;

    @b("participant")
    private final Participant.Builder participant;

    @b("streaming_part")
    private final StreamingPart streamingPart;

    @b("use_bot_ux")
    private final boolean useBotUx;

    public ActiveBot() {
        this(null, false, false, false, null, 31, null);
    }

    public static /* synthetic */ ActiveBot copy$default(ActiveBot activeBot, Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = activeBot.participant;
        }
        if ((i10 & 2) != 0) {
            z10 = activeBot.isAi;
        }
        boolean z13 = z10;
        if ((i10 & 4) != 0) {
            z11 = activeBot.useBotUx;
        }
        boolean z14 = z11;
        if ((i10 & 8) != 0) {
            z12 = activeBot.isIdentityCustomized;
        }
        boolean z15 = z12;
        if ((i10 & 16) != 0) {
            streamingPart = activeBot.streamingPart;
        }
        return activeBot.copy(builder, z13, z14, z15, streamingPart);
    }

    public final Participant.Builder component1() {
        return this.participant;
    }

    public final boolean component2() {
        return this.isAi;
    }

    public final boolean component3() {
        return this.useBotUx;
    }

    public final boolean component4() {
        return this.isIdentityCustomized;
    }

    public final StreamingPart component5() {
        return this.streamingPart;
    }

    public final ActiveBot copy(Participant.Builder participant, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart) {
        i.e(participant, "participant");
        return new ActiveBot(participant, z10, z11, z12, streamingPart);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveBot)) {
            return false;
        }
        ActiveBot activeBot = (ActiveBot) obj;
        return i.a(this.participant, activeBot.participant) && this.isAi == activeBot.isAi && this.useBotUx == activeBot.useBotUx && this.isIdentityCustomized == activeBot.isIdentityCustomized && i.a(this.streamingPart, activeBot.streamingPart);
    }

    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public final boolean getUseBotUx() {
        return this.useBotUx;
    }

    public int hashCode() {
        int iB = D.b(D.b(D.b(this.participant.hashCode() * 31, 31, this.isAi), 31, this.useBotUx), 31, this.isIdentityCustomized);
        StreamingPart streamingPart = this.streamingPart;
        return iB + (streamingPart == null ? 0 : streamingPart.hashCode());
    }

    public final boolean isAi() {
        return this.isAi;
    }

    public final boolean isIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    public String toString() {
        return "ActiveBot(participant=" + this.participant + ", isAi=" + this.isAi + ", useBotUx=" + this.useBotUx + ", isIdentityCustomized=" + this.isIdentityCustomized + ", streamingPart=" + this.streamingPart + ')';
    }

    public ActiveBot(Participant.Builder participant, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart) {
        i.e(participant, "participant");
        this.participant = participant;
        this.isAi = z10;
        this.useBotUx = z11;
        this.isIdentityCustomized = z12;
        this.streamingPart = streamingPart;
    }

    public /* synthetic */ ActiveBot(Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart, int i10, e eVar) {
        this((i10 & 1) != 0 ? new Participant.Builder() : builder, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? z12 : false, (i10 & 16) != 0 ? null : streamingPart);
    }
}
