package O4;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<a> f4855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f4857d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4858e = false;

    public c(a aVar, long j) {
        this.f4855b = new WeakReference<>(aVar);
        this.f4856c = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference<a> weakReference = this.f4855b;
        try {
            if (this.f4857d.await(this.f4856c, TimeUnit.MILLISECONDS) || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f4858e = true;
        } catch (InterruptedException unused) {
            a aVar2 = weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f4858e = true;
            }
        }
    }
}
