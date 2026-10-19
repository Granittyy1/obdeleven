package R2;

import K2.C0710c;
import Q2.C0738o;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: WorkTimer.java */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0710c f5214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5215b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5216c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5217d = new Object();

    /* JADX INFO: compiled from: WorkTimer.java */
    public interface a {
        void b(C0738o c0738o);
    }

    /* JADX INFO: compiled from: WorkTimer.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F f5218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0738o f5219c;

        public b(F f10, C0738o c0738o) {
            this.f5218b = f10;
            this.f5219c = c0738o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f5218b.f5217d) {
                try {
                    if (((b) this.f5218b.f5215b.remove(this.f5219c)) != null) {
                        a aVar = (a) this.f5218b.f5216c.remove(this.f5219c);
                        if (aVar != null) {
                            aVar.b(this.f5219c);
                        }
                    } else {
                        androidx.work.k kVarC = androidx.work.k.c();
                        this.f5219c.toString();
                        kVarC.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        androidx.work.k.d("WorkTimer");
    }

    public F(C0710c c0710c) {
        this.f5214a = c0710c;
    }

    public final void a(C0738o c0738o) {
        synchronized (this.f5217d) {
            try {
                if (((b) this.f5215b.remove(c0738o)) != null) {
                    androidx.work.k kVarC = androidx.work.k.c();
                    Objects.toString(c0738o);
                    kVarC.getClass();
                    this.f5216c.remove(c0738o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
