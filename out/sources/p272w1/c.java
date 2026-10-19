package p272w1;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface a {

        /* JADX INFO: renamed from: w1.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C0544a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0545a> f47693a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: w1.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            public static final class C0545a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f47694a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f47695b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f47696c;

                public C0545a(Handler handler, a aVar) {
                    this.f47694a = handler;
                    this.f47695b = aVar;
                }
            }
        }

        void s(int i10, long j, long j10);
    }

    void a(a aVar);

    void d(Handler handler, a aVar);

    f e();
}
