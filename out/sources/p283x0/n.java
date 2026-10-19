package p283x0;

import android.os.Handler;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class n<T> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f47877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f47878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f47879d;

    /* JADX INFO: compiled from: RequestExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f47880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f47881c;

        public a(i iVar, Object obj) {
            this.f47880b = iVar;
            this.f47881c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f47880b.a(this.f47881c);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f47877b.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f47879d.post(new a(this.f47878c, objCall));
    }
}
