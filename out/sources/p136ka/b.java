package p136ka;

import android.os.Handler;
import android.os.Message;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import p123ja.o;

/* JADX INFO: compiled from: HandlerScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f42911a;

    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class a extends o.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f42912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f42913c;

        public a(Handler handler) {
            this.f42912b = handler;
        }

        @Override // ja.o.b
        public final p148la.b a(Runnable runnable, TimeUnit timeUnit) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            boolean z10 = this.f42913c;
            EmptyDisposable emptyDisposable = EmptyDisposable.f40664b;
            if (z10) {
                return emptyDisposable;
            }
            Handler handler = this.f42912b;
            RunnableC0477b runnableC0477b = new RunnableC0477b(handler, runnable);
            Message messageObtain = Message.obtain(handler, runnableC0477b);
            messageObtain.obj = this;
            this.f42912b.sendMessageDelayed(messageObtain, timeUnit.toMillis(0L));
            if (!this.f42913c) {
                return runnableC0477b;
            }
            this.f42912b.removeCallbacks(runnableC0477b);
            return emptyDisposable;
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f42913c;
        }

        @Override // p148la.b
        public final void dispose() {
            this.f42913c = true;
            this.f42912b.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: ka.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class RunnableC0477b implements Runnable, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f42914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f42915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f42916d;

        public RunnableC0477b(Handler handler, Runnable runnable) {
            this.f42914b = handler;
            this.f42915c = runnable;
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f42916d;
        }

        @Override // p148la.b
        public final void dispose() {
            this.f42916d = true;
            this.f42914b.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f42915c.run();
            } catch (Throwable th) {
                p231sa.a.c(th);
            }
        }
    }

    public b(Handler handler) {
        this.f42911a = handler;
    }

    @Override // p123ja.o
    public final o.b a() {
        return new a(this.f42911a);
    }

    @Override // p123ja.o
    public final p148la.b c(Runnable runnable, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f42911a;
        RunnableC0477b runnableC0477b = new RunnableC0477b(handler, runnable);
        handler.postDelayed(runnableC0477b, timeUnit.toMillis(0L));
        return runnableC0477b;
    }
}
