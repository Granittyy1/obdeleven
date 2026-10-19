package p252u6;

import androidx.media3.exoplayer.C1401t;
import com.google.firebase.crashlytics.internal.settings.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p191p5.h;
import p302y6.B;
import p302y6.E;
import p302y6.Q;

/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f47433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f47434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f47435d;

    public d(boolean z10, E e10, a aVar) {
        this.f47433b = z10;
        this.f47434c = e10;
        this.f47435d = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f47433b) {
            return null;
        }
        E e10 = this.f47434c;
        final B b10 = new B(e10, this.f47435d);
        ExecutorService executorService = Q.f48352a;
        final h hVar = new h();
        final ExecutorService executorService2 = e10.f48308l;
        executorService2.execute(new Runnable() { // from class: y6.P
            @Override // java.lang.Runnable
            public final void run() {
                B b11 = b10;
                ExecutorService executorService3 = executorService2;
                h hVar2 = hVar;
                try {
                    b11.call().g(executorService3, new C1401t(hVar2));
                } catch (Exception e11) {
                    hVar2.a(e11);
                }
            }
        });
        return null;
    }
}
