package androidx.media3.common;

import androidx.media3.exoplayer.l0;
import p078g1.x;

/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final x timeline;
    public final int windowIndex = -1;
    public final long positionMs = -9223372036854775807L;

    public IllegalSeekPositionException(l0 l0Var) {
        this.timeline = l0Var;
    }
}
