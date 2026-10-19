package I4;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4.l f3846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f3848e;

    public /* synthetic */ d(o oVar, C4.l lVar, int i10, Runnable runnable) {
        this.f3845b = oVar;
        this.f3846c = lVar;
        this.f3847d = i10;
        this.f3848e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C4.l lVar = this.f3846c;
        final int i10 = this.f3847d;
        Runnable runnable = this.f3848e;
        final o oVar = this.f3845b;
        K4.a aVar = oVar.f3876f;
        try {
            try {
                J4.d dVar = oVar.f3873c;
                Objects.requireNonNull(dVar);
                aVar.b(new f(0, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) oVar.f3871a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    aVar.b(new K4.a.InterfaceC0060a() { // from class: I4.g
                        @Override // K4.a.InterfaceC0060a
                        public final Object k() {
                            oVar.f3874d.a(lVar, i10 + 1);
                            return null;
                        }
                    });
                } else {
                    oVar.a(lVar, i10);
                }
            } catch (SynchronizationException unused) {
                oVar.f3874d.a(lVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
