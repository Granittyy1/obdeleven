package io.intercom.android.sdk.models;

import A1.C0575j;
import I7.b;
import com.braze.models.FeatureFlag;
import kotlin.jvm.internal.e;
import p005a4.q;

/* JADX INFO: compiled from: ConversationStateSyncSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationStateSyncSettings {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ConversationStateSyncSettings DEFAULT = new ConversationStateSyncSettings(false, 0, 0);

    @b(FeatureFlag.ENABLED)
    private final boolean enabled;

    @b("start_timeout")
    private final int startTimeout;

    @b("sync_interval")
    private final int syncInterval;

    /* JADX INFO: compiled from: ConversationStateSyncSettings.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ConversationStateSyncSettings getDEFAULT() {
            return ConversationStateSyncSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    public ConversationStateSyncSettings(boolean z10, int i10, int i11) {
        this.enabled = z10;
        this.startTimeout = i10;
        this.syncInterval = i11;
    }

    public static /* synthetic */ ConversationStateSyncSettings copy$default(ConversationStateSyncSettings conversationStateSyncSettings, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = conversationStateSyncSettings.enabled;
        }
        if ((i12 & 2) != 0) {
            i10 = conversationStateSyncSettings.startTimeout;
        }
        if ((i12 & 4) != 0) {
            i11 = conversationStateSyncSettings.syncInterval;
        }
        return conversationStateSyncSettings.copy(z10, i10, i11);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.startTimeout;
    }

    public final int component3() {
        return this.syncInterval;
    }

    public final ConversationStateSyncSettings copy(boolean z10, int i10, int i11) {
        return new ConversationStateSyncSettings(z10, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationStateSyncSettings)) {
            return false;
        }
        ConversationStateSyncSettings conversationStateSyncSettings = (ConversationStateSyncSettings) obj;
        return this.enabled == conversationStateSyncSettings.enabled && this.startTimeout == conversationStateSyncSettings.startTimeout && this.syncInterval == conversationStateSyncSettings.syncInterval;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final int getSyncInterval() {
        return this.syncInterval;
    }

    public int hashCode() {
        return Integer.hashCode(this.syncInterval) + q.b(this.startTimeout, Boolean.hashCode(this.enabled) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationStateSyncSettings(enabled=");
        sb2.append(this.enabled);
        sb2.append(", startTimeout=");
        sb2.append(this.startTimeout);
        sb2.append(", syncInterval=");
        return C0575j.b(sb2, this.syncInterval, ')');
    }
}
