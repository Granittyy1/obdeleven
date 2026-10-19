package androidx.media3.exoplayer;

import android.content.Context;
import io.intercom.android.sdk.NexusWrapper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.media3.exoplayer.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1384b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18314c;

    public /* synthetic */ RunnableC1384b(int i10, Object obj) {
        this.f18313b = i10;
        this.f18314c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18313b) {
            case 0:
                C1385c.a aVar = (C1385c.a) this.f18314c;
                if (aVar.f18325c.f18322d) {
                    K.this.y0(3, false);
                }
                break;
            case 1:
                NexusWrapper.scheduleDisconnect$lambda$2((NexusWrapper) this.f18314c);
                break;
            case 2:
                j1.o.b bVar = (j1.o.b) this.f18314c;
                j1.o.a aVar2 = bVar.f41048a.get();
                if (aVar2 != null) {
                    aVar2.a(p114j1.o.this.b());
                }
                break;
            default:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new androidx.compose.material.ripple.k(5, (Context) this.f18314c));
                break;
        }
    }
}
