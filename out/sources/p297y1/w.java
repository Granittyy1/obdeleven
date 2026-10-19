package p297y1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.K;
import java.util.Iterator;
import p114j1.A;
import p308z1.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f48223d;

    public /* synthetic */ w(Object obj, int i10, Object obj2) {
        this.f48221b = i10;
        this.f48222c = obj;
        this.f48223d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48221b) {
            case 0:
                x xVar = (x) this.f48222c;
                C1390h c1390h = (C1390h) this.f48223d;
                xVar.getClass();
                synchronized (c1390h) {
                }
                K.a aVar = xVar.f48225b;
                int i10 = A.f40996a;
                K.this.f18039s.d(c1390h);
                break;
            default:
                j jVar = (j) this.f48222c;
                SurfaceTexture surfaceTexture = jVar.f48759h;
                Surface surface = jVar.f48760i;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f48223d;
                Surface surface2 = new Surface(surfaceTexture2);
                jVar.f48759h = surfaceTexture2;
                jVar.f48760i = surface2;
                Iterator<j.b> it = jVar.f48753b.iterator();
                while (it.hasNext()) {
                    it.next().c(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                break;
        }
    }
}
