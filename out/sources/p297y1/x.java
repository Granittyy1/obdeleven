package p297y1;

import E7.d;
import android.os.Handler;
import androidx.media3.exoplayer.K;
import p078g1.F;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f48224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K.a f48225b;

    public x(Handler handler, K.a aVar) {
        if (aVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f48224a = handler;
        this.f48225b = aVar;
    }

    public final void a(F f10) {
        Handler handler = this.f48224a;
        if (handler != null) {
            handler.post(new d(this, 6, f10));
        }
    }
}
