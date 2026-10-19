package K2;

import Q2.C0738o;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4231f;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4227b = i10;
        this.f4228c = obj;
        this.f4229d = obj2;
        this.f4230e = obj3;
        this.f4231f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4227b) {
            case 0:
                List list = (List) this.f4228c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).d(((C0738o) this.f4229d).f5025a);
                }
                w.b((androidx.work.a) this.f4230e, (WorkDatabase) this.f4231f, list);
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f4228c;
                androidx.media3.exoplayer.audio.c.a aVar = (androidx.media3.exoplayer.audio.c.a) this.f4229d;
                Handler handler = (Handler) this.f4230e;
                p175o1.k kVar = (p175o1.k) this.f4231f;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (aVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new L9.b(aVar, 2, kVar));
                    }
                    synchronized (DefaultAudioSink.f18197j0) {
                        try {
                            int i10 = DefaultAudioSink.f18199l0 - 1;
                            DefaultAudioSink.f18199l0 = i10;
                            if (i10 == 0) {
                                DefaultAudioSink.f18198k0.shutdown();
                                DefaultAudioSink.f18198k0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (aVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new L9.b(aVar, 2, kVar));
                    }
                    synchronized (DefaultAudioSink.f18197j0) {
                        try {
                            int i11 = DefaultAudioSink.f18199l0 - 1;
                            DefaultAudioSink.f18199l0 = i11;
                            if (i11 == 0) {
                                DefaultAudioSink.f18198k0.shutdown();
                                DefaultAudioSink.f18198k0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
        }
    }
}
