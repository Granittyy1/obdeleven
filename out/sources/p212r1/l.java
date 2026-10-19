package p212r1;

import A8.f;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;

/* JADX INFO: compiled from: LoudnessCodecController.java */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<MediaCodec> f46306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f46307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f46308c;

    /* JADX INFO: compiled from: LoudnessCodecController.java */
    public interface a {

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final f f46309o0 = new f(9);
    }

    public l() {
        f fVar = a.f46309o0;
        this.f46306a = new HashSet<>();
        this.f46307b = fVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f46306a.remove(mediaCodec) || (loudnessCodecController = this.f46308c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }
}
