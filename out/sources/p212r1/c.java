package p212r1;

import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.a;
import com.google.common.base.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46274b;

    public /* synthetic */ c(int i10) {
        this.f46274b = i10;
    }

    @Override // com.google.common.base.j
    public final Object get() {
        return new HandlerThread(a.r(this.f46274b, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
