package y7;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.h;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CpuGaugeCollector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p241t7.a f48410g = p241t7.a.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f48411h = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f48416e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f48417f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<com.google.firebase.perf.v1.d> f48412a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f48413b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48414c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48415d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, h hVar) {
        this.f48417f = j;
        try {
            this.f48416e = this.f48413b.scheduleAtFixedRate(new p068f4.h(this, 2, hVar), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            p241t7.a aVar = f48410g;
            e10.getMessage();
            aVar.f();
        }
    }

    public final com.google.firebase.perf.v1.d b(h hVar) {
        long j = this.f48415d;
        p241t7.a aVar = f48410g;
        if (hVar == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f48414c));
                try {
                    long jA = hVar.a() + hVar.f28507b;
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    long j10 = Long.parseLong(strArrSplit[13]);
                    long j11 = Long.parseLong(strArrSplit[15]);
                    long j12 = Long.parseLong(strArrSplit[14]);
                    long j13 = Long.parseLong(strArrSplit[16]);
                    com.google.firebase.perf.v1.d.a aVarK = com.google.firebase.perf.v1.d.K();
                    aVarK.r();
                    com.google.firebase.perf.v1.d.H((com.google.firebase.perf.v1.d) aVarK.f29047c, jA);
                    double d10 = (j12 + j13) / j;
                    long j14 = f48411h;
                    try {
                        long jRound = Math.round(d10 * j14);
                        aVarK.r();
                        com.google.firebase.perf.v1.d.J((com.google.firebase.perf.v1.d) aVarK.f29047c, jRound);
                        long jRound2 = Math.round(((j10 + j11) / j) * j14);
                        aVarK.r();
                        com.google.firebase.perf.v1.d.I((com.google.firebase.perf.v1.d) aVarK.f29047c, jRound2);
                        com.google.firebase.perf.v1.d dVarP = aVarK.p();
                        bufferedReader.close();
                        return dVarP;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e10) {
                e = e10;
                e.getMessage();
                aVar.f();
                return null;
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                e.getMessage();
                aVar.f();
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                e.getMessage();
                aVar.f();
                return null;
            } catch (NumberFormatException e13) {
                e = e13;
                e.getMessage();
                aVar.f();
                return null;
            }
        } catch (IOException e14) {
            e = e14;
            e.getMessage();
            aVar.f();
            return null;
        } catch (ArrayIndexOutOfBoundsException e15) {
            e = e15;
            e.getMessage();
            aVar.f();
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            e.getMessage();
            aVar.f();
            return null;
        } catch (NumberFormatException e17) {
            e = e17;
            e.getMessage();
            aVar.f();
            return null;
        }
    }
}
