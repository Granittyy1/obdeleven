package androidx.work;

import R2.B;
import R2.C;
import R2.D;
import R2.E;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ListenableWorker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    private Context mAppContext;
    private volatile int mStopReason = -256;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* JADX INFO: compiled from: ListenableWorker.java */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ListenableWorker.java */
        public static final class C0203a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f20457a = d.f20352c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0203a.class != obj.getClass()) {
                    return false;
                }
                return this.f20457a.equals(((C0203a) obj).f20457a);
            }

            public final int hashCode() {
                return this.f20457a.hashCode() + (C0203a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f20457a + '}';
            }
        }

        /* JADX INFO: compiled from: ListenableWorker.java */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: compiled from: ListenableWorker.java */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f20458a;

            public c() {
                this(d.f20352c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f20458a.equals(((c) obj).f20458a);
            }

            public final int hashCode() {
                return this.f20458a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f20458a + '}';
            }

            public c(d dVar) {
                this.f20458a = dVar;
            }
        }
    }

    public j(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f20322f;
    }

    public p107i6.f<e> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        aVar.l(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f20317a;
    }

    public final d getInputData() {
        return this.mWorkerParams.f20318b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f20320d.f20328c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f20321e;
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f20319c;
    }

    public S2.b getTaskExecutor() {
        return this.mWorkerParams.f20323g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f20320d.f20326a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f20320d.f20327b;
    }

    public r getWorkerFactory() {
        return this.mWorkerParams.f20324h;
    }

    public final boolean isStopped() {
        return this.mStopReason != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final p107i6.f<Void> setForegroundAsync(e eVar) {
        C c10 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c10.getClass();
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        c10.f5204a.d(new B(c10, aVar, id, eVar, applicationContext));
        return aVar;
    }

    public p107i6.f<Void> setProgressAsync(d dVar) {
        E e10 = this.mWorkerParams.f20325i;
        getApplicationContext();
        UUID id = getId();
        e10.getClass();
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        e10.f5213b.d(new D(e10, id, dVar, aVar));
        return aVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract p107i6.f<a> startWork();

    public final void stop(int i10) {
        this.mStopReason = i10;
        onStopped();
    }

    public void onStopped() {
    }
}
