package p212r1;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: LoudnessCodecController.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f46305a;

    public k(l lVar) {
        this.f46305a = lVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f46305a.f46307b.getClass();
        return bundle;
    }
}
