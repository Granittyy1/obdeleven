package androidx.media3.exoplayer.audio;

import p078g1.n;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int audioTrackState;
    public final n format;
    public final boolean isRecoverable;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i10, int i11, int i12, int i13, n nVar, boolean z10, RuntimeException runtimeException) {
        StringBuilder sbA = B6.a.a("AudioTrack init failed ", " Config(", ", ", i10, i11);
        sbA.append(i12);
        sbA.append(", ");
        sbA.append(i13);
        sbA.append(") ");
        sbA.append(nVar);
        sbA.append(z10 ? " (recoverable)" : "");
        super(sbA.toString(), runtimeException);
        this.audioTrackState = i10;
        this.isRecoverable = z10;
        this.format = nVar;
    }
}
