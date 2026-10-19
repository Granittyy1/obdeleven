package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import p078g1.C2198d;
import p114j1.A;
import p175o1.k;

/* JADX INFO: compiled from: DefaultAudioTrackProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements DefaultAudioSink.b {
    public static AudioAttributes b(C2198d c2198d, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c2198d.a().f35246a;
    }

    public final AudioTrack a(k kVar, C2198d c2198d, int i10) {
        int i11 = A.f40996a;
        boolean z10 = kVar.f45104d;
        int i12 = kVar.f45101a;
        int i13 = kVar.f45103c;
        int i14 = kVar.f45102b;
        if (i11 < 23) {
            return new AudioTrack(b(c2198d, z10), A.n(i14, i13, i12), kVar.f45106f, 1, i10);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(c2198d, z10)).setAudioFormat(A.n(i14, i13, i12)).setTransferMode(1).setBufferSizeInBytes(kVar.f45106f).setSessionId(i10);
        if (i11 >= 29) {
            sessionId.setOffloadedPlayback(kVar.f45105e);
        }
        return sessionId.build();
    }
}
