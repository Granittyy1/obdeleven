package androidx.compose.ui.platform;

import android.graphics.SurfaceTexture;
import android.os.Trace;
import android.view.Surface;
import com.airbnb.lottie.LottieDrawable;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1240q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15086c;

    public /* synthetic */ RunnableC1240q(int i10, Object obj) {
        this.f15085b = i10;
        this.f15086c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f15086c;
        switch (this.f15085b) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    androidComposeViewAccessibilityDelegateCompat.f14746a.C(true);
                    p293xa.r rVar = p293xa.r.f47939a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        androidComposeViewAccessibilityDelegateCompat.e();
                        Trace.endSection();
                        androidComposeViewAccessibilityDelegateCompat.f14742I = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                ((Ia.a) obj).invoke();
                return;
            case 2:
                LottieDrawable lottieDrawable = (LottieDrawable) obj;
                Semaphore semaphore = lottieDrawable.f23308F;
                com.airbnb.lottie.model.layer.b bVar = lottieDrawable.f23322m;
                if (bVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    bVar.o(lottieDrawable.f23313c.c());
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case 3:
                io.grpc.internal.G0 g10 = ((io.grpc.internal.G0.c) obj).f37198b;
                g10.f37193b.a(new io.grpc.internal.G0.a(g10));
                return;
            case 4:
                ((androidx.media3.ui.b) obj).f(false);
                return;
            case 5:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f28451p != null) {
                    return;
                }
                appStartTrace.f28451p = new com.google.firebase.perf.util.h();
                com.google.firebase.perf.v1.i.a aVarA0 = com.google.firebase.perf.v1.i.a0();
                aVarA0.y("_experiment_preDrawFoQ");
                aVarA0.w(appStartTrace.d().f28507b);
                aVarA0.x(appStartTrace.d().b(appStartTrace.f28451p));
                com.google.firebase.perf.v1.i iVarP = aVarA0.p();
                com.google.firebase.perf.v1.i.a aVar = appStartTrace.f28441e;
                aVar.u(iVarP);
                appStartTrace.f(aVar);
                return;
            default:
                p308z1.j jVar = (p308z1.j) obj;
                Surface surface = jVar.f48760i;
                if (surface != null) {
                    Iterator<z1.j.b> it = jVar.f48753b.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
                SurfaceTexture surfaceTexture = jVar.f48759h;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                jVar.f48759h = null;
                jVar.f48760i = null;
                return;
        }
    }
}
