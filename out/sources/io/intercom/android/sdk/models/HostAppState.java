package io.intercom.android.sdk.models;

import C4.a;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;

/* JADX INFO: compiled from: HostAppState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HostAppState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final HostAppState NULL = new HostAppState(false, false, 0, 7, null);
    private final long backgroundedTimestamp;
    private final boolean isBackgrounded;
    private final boolean sessionStartedSinceLastBackgrounded;

    /* JADX INFO: compiled from: HostAppState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public HostAppState() {
        this(false, false, 0L, 7, null);
    }

    public static /* synthetic */ HostAppState copy$default(HostAppState hostAppState, boolean z10, boolean z11, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hostAppState.isBackgrounded;
        }
        if ((i10 & 2) != 0) {
            z11 = hostAppState.sessionStartedSinceLastBackgrounded;
        }
        if ((i10 & 4) != 0) {
            j = hostAppState.backgroundedTimestamp;
        }
        return hostAppState.copy(z10, z11, j);
    }

    public final boolean component1() {
        return this.isBackgrounded;
    }

    public final boolean component2() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public final long component3() {
        return this.backgroundedTimestamp;
    }

    public final HostAppState copy(boolean z10, boolean z11, long j) {
        return new HostAppState(z10, z11, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAppState)) {
            return false;
        }
        HostAppState hostAppState = (HostAppState) obj;
        return this.isBackgrounded == hostAppState.isBackgrounded && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp;
    }

    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public int hashCode() {
        return Long.hashCode(this.backgroundedTimestamp) + D.b(Boolean.hashCode(this.isBackgrounded) * 31, 31, this.sessionStartedSinceLastBackgrounded);
    }

    public final boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HostAppState(isBackgrounded=");
        sb2.append(this.isBackgrounded);
        sb2.append(", sessionStartedSinceLastBackgrounded=");
        sb2.append(this.sessionStartedSinceLastBackgrounded);
        sb2.append(", backgroundedTimestamp=");
        return a.h(sb2, this.backgroundedTimestamp, ')');
    }

    public HostAppState(boolean z10, boolean z11, long j) {
        this.isBackgrounded = z10;
        this.sessionStartedSinceLastBackgrounded = z11;
        this.backgroundedTimestamp = j;
    }

    public /* synthetic */ HostAppState(boolean z10, boolean z11, long j, int i10, e eVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? 0L : j);
    }
}
