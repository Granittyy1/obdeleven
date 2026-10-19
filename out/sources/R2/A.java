package R2;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.UUID;

/* JADX INFO: compiled from: WorkForegroundRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public final class A implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5190h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Void> f5191b = new androidx.work.impl.utils.futures.a<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q2.z f5193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.j f5194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C f5195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S2.b f5196g;

    /* JADX INFO: compiled from: WorkForegroundRunnable.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f5197b;

        public a(androidx.work.impl.utils.futures.a aVar) {
            this.f5197b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (A.this.f5191b.f20427b instanceof AbstractFuture.b) {
                return;
            }
            try {
                androidx.work.e eVar = (androidx.work.e) this.f5197b.get();
                if (eVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + A.this.f5193d.f5038c + ") but did not provide ForegroundInfo");
                }
                androidx.work.k kVarC = androidx.work.k.c();
                int i10 = A.f5190h;
                String str = A.this.f5193d.f5038c;
                kVarC.getClass();
                A a10 = A.this;
                androidx.work.impl.utils.futures.a<Void> aVar = a10.f5191b;
                C c10 = a10.f5195f;
                Context context = a10.f5192c;
                UUID id = a10.f5194e.getId();
                c10.getClass();
                androidx.work.impl.utils.futures.a aVar2 = new androidx.work.impl.utils.futures.a();
                c10.f5204a.d(new B(c10, aVar2, id, eVar, context));
                aVar.m(aVar2);
            } catch (Throwable th) {
                A.this.f5191b.l(th);
            }
        }
    }

    static {
        androidx.work.k.d("WorkForegroundRunnable");
    }

    public A(Context context, Q2.z zVar, androidx.work.j jVar, C c10, S2.b bVar) {
        this.f5192c = context;
        this.f5193d = zVar;
        this.f5194e = jVar;
        this.f5195f = c10;
        this.f5196g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f5193d.f5051q || Build.VERSION.SDK_INT >= 31) {
            this.f5191b.k(null);
            return;
        }
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        S2.b bVar = this.f5196g;
        bVar.b().execute(new z(this, 0, aVar));
        aVar.a(new a(aVar), bVar.b());
    }
}
