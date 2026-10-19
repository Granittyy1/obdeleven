package p175o1;

import android.os.Handler;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.K;
import com.voltasit.obdeleven.presentation.history.child.b;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f45099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K.a f45100b;

    public j(Handler handler, K.a aVar) {
        this.f45099a = handler;
        this.f45100b = aVar;
    }

    public final void a(C1390h c1390h) {
        synchronized (c1390h) {
        }
        Handler handler = this.f45099a;
        if (handler != null) {
            handler.post(new b(this, 2, c1390h));
        }
    }
}
