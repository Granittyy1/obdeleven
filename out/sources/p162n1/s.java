package p162n1;

import android.media.metrics.PlaybackStateEvent;
import androidx.media3.exoplayer.K;
import p114j1.A;
import p240t6.i;
import p297y1.x;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44714d;

    public /* synthetic */ s(Object obj, int i10, Object obj2) {
        this.f44712b = i10;
        this.f44713c = obj;
        this.f44714d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f44714d;
        Object obj2 = this.f44713c;
        switch (this.f44712b) {
            case 0:
                ((t) obj2).f44720d.reportPlaybackStateEvent((PlaybackStateEvent) obj);
                break;
            case 1:
                try {
                    ((Runnable) obj2).run();
                } catch (Exception e10) {
                    i.this.l(e10);
                    return;
                }
                break;
            default:
                x xVar = (x) obj2;
                xVar.getClass();
                int i10 = A.f40996a;
                K.this.f18039s.f((String) obj);
                break;
        }
    }
}
