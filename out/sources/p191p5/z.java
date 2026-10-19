package p191p5;

import android.os.Looper;
import java.util.concurrent.Executor;
import p094h5.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45853b;

    public z() {
        a aVar = new a(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f45853b = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f45853b.post(runnable);
    }
}
