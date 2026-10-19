package K2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f4161c;

    public O(P p10, String str) {
        this.f4161c = p10;
        this.f4160b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P p10 = this.f4161c;
        try {
            try {
                androidx.work.j.a aVar = p10.f4178r.get();
                if (aVar == null) {
                    androidx.work.k.c().a(P.f4162t, p10.f4166e.f5038c + " returned a null result. Treating it as a failure.");
                } else {
                    androidx.work.k kVarC = androidx.work.k.c();
                    String str = P.f4162t;
                    String str2 = p10.f4166e.f5038c;
                    aVar.toString();
                    kVarC.getClass();
                    p10.f4169h = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                androidx.work.k.c().b(P.f4162t, this.f4160b + " failed because it threw an exception/error", e);
            } catch (CancellationException unused) {
                androidx.work.k kVarC2 = androidx.work.k.c();
                String str3 = P.f4162t;
                kVarC2.getClass();
            } catch (ExecutionException e11) {
                e = e11;
                androidx.work.k.c().b(P.f4162t, this.f4160b + " failed because it threw an exception/error", e);
            }
            p10.b();
        } catch (Throwable th) {
            p10.b();
            throw th;
        }
    }
}
