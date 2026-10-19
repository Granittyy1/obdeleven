package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import p078g1.n;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final n format;

    public AudioSink$ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, n nVar) {
        super(unhandledAudioFormatException);
        this.format = nVar;
    }

    public AudioSink$ConfigurationException(n nVar, String str) {
        super(str);
        this.format = nVar;
    }
}
