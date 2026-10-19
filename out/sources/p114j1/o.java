package p114j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.RunnableC1384b;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p272w1.e;

/* JADX INFO: compiled from: NetworkTypeObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static o f41042f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f41043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f41044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41047e;

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public interface a {
        void a(int i10);
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f41048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f41049b;

        public b(e eVar, Executor executor) {
            this.f41048a = new WeakReference<>(eVar);
            this.f41049b = executor;
        }
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            o.this.f41043a.execute(new p(this, 0, context));
        }
    }

    public o(Context context) {
        Executor executorI = C2479a.i();
        this.f41043a = executorI;
        this.f41044b = new CopyOnWriteArrayList<>();
        this.f41045c = new Object();
        this.f41046d = 0;
        executorI.execute(new E6.c(this, 3, context));
    }

    public static synchronized o a(Context context) {
        try {
            if (f41042f == null) {
                f41042f = new o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41042f;
    }

    public final int b() {
        int i10;
        synchronized (this.f41045c) {
            i10 = this.f41046d;
        }
        return i10;
    }

    public final void c(int i10) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f41044b;
        for (b bVar : copyOnWriteArrayList) {
            if (bVar.f41048a.get() == null) {
                copyOnWriteArrayList.remove(bVar);
            }
        }
        synchronized (this.f41045c) {
            try {
                if (this.f41047e && this.f41046d == i10) {
                    return;
                }
                this.f41047e = true;
                this.f41046d = i10;
                for (b bVar2 : this.f41044b) {
                    bVar2.getClass();
                    bVar2.f41049b.execute(new RunnableC1384b(2, bVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
