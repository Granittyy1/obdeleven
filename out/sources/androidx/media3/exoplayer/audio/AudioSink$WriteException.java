package androidx.media3.exoplayer.audio;

import J4.i;
import p078g1.n;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int errorCode;
    public final n format;
    public final boolean isRecoverable;

    public AudioSink$WriteException(int i10, n nVar, boolean z10) {
        super(i.b(i10, "AudioTrack write failed: "));
        this.isRecoverable = z10;
        this.errorCode = i10;
        this.format = nVar;
    }
}
