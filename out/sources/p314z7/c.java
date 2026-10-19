package p314z7;

import O.e;
import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.d;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.i;
import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.C2078u;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p218r7.g;
import p218r7.r;
import p218r7.s;

/* JADX INFO: compiled from: RateLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p218r7.a f48909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f48910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f48911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f48912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f48913e;

    /* JADX INFO: compiled from: RateLimiter.java */
    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final long f48914i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f48916b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f f48919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f f48920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f48921g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f48922h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f48917c = 500;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f48918d = 500;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f48915a = new h();

        static {
            p241t7.a.d();
            f48914i = TimeUnit.SECONDS.toMicros(1L);
        }

        public a(f fVar, e eVar, p218r7.a aVar, String str) {
            g gVar;
            long jLongValue;
            p218r7.f fVar2;
            long jLongValue2;
            r rVar;
            s sVar;
            this.f48916b = fVar;
            long jK = str == "Trace" ? aVar.k() : aVar.k();
            if (str == "Trace") {
                synchronized (s.class) {
                    try {
                        if (s.f46382c == null) {
                            s.f46382c = new s();
                        }
                        sVar = s.f46382c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                RemoteConfigManager remoteConfigManager = aVar.f46362a;
                sVar.getClass();
                d<Long> dVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
                if (dVar.b() && p218r7.a.l(dVar.a().longValue())) {
                    aVar.f46364c.d(dVar.a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    jLongValue = dVar.a().longValue();
                } else {
                    d<Long> dVarC = aVar.c(sVar);
                    jLongValue = (dVarC.b() && p218r7.a.l(dVarC.a().longValue())) ? dVarC.a().longValue() : 300L;
                }
            } else {
                synchronized (g.class) {
                    try {
                        if (g.f46370c == null) {
                            g.f46370c = new g();
                        }
                        gVar = g.f46370c;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                RemoteConfigManager remoteConfigManager2 = aVar.f46362a;
                gVar.getClass();
                d<Long> dVar2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
                if (dVar2.b() && p218r7.a.l(dVar2.a().longValue())) {
                    aVar.f46364c.d(dVar2.a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    jLongValue = dVar2.a().longValue();
                } else {
                    d<Long> dVarC2 = aVar.c(gVar);
                    jLongValue = (dVarC2.b() && p218r7.a.l(dVarC2.a().longValue())) ? dVarC2.a().longValue() : 700L;
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f48919e = new f(jLongValue, jK, timeUnit);
            this.f48921g = jLongValue;
            long jK2 = str == "Trace" ? aVar.k() : aVar.k();
            if (str == "Trace") {
                synchronized (r.class) {
                    try {
                        if (r.f46381c == null) {
                            r.f46381c = new r();
                        }
                        rVar = r.f46381c;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                RemoteConfigManager remoteConfigManager3 = aVar.f46362a;
                rVar.getClass();
                d<Long> dVar3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
                if (dVar3.b() && p218r7.a.l(dVar3.a().longValue())) {
                    aVar.f46364c.d(dVar3.a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    jLongValue2 = dVar3.a().longValue();
                } else {
                    d<Long> dVarC3 = aVar.c(rVar);
                    jLongValue2 = (dVarC3.b() && p218r7.a.l(dVarC3.a().longValue())) ? dVarC3.a().longValue() : 30L;
                }
            } else {
                synchronized (p218r7.f.class) {
                    try {
                        if (p218r7.f.f46369c == null) {
                            p218r7.f.f46369c = new p218r7.f();
                        }
                        fVar2 = p218r7.f.f46369c;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                RemoteConfigManager remoteConfigManager4 = aVar.f46362a;
                fVar2.getClass();
                d<Long> dVar4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
                if (dVar4.b() && p218r7.a.l(dVar4.a().longValue())) {
                    aVar.f46364c.d(dVar4.a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    jLongValue2 = dVar4.a().longValue();
                } else {
                    d<Long> dVarC4 = aVar.c(fVar2);
                    jLongValue2 = (dVarC4.b() && p218r7.a.l(dVarC4.a().longValue())) ? dVarC4.a().longValue() : 70L;
                }
            }
            this.f48920f = new f(jLongValue2, jK2, timeUnit);
            this.f48922h = jLongValue2;
        }

        public final synchronized void a(boolean z10) {
            try {
                this.f48916b = z10 ? this.f48919e : this.f48920f;
                this.f48917c = z10 ? this.f48921g : this.f48922h;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0063 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:9:0x002f, B:14:0x0058, B:16:0x0063, B:19:0x0074, B:21:0x007c, B:10:0x0037, B:11:0x0040, B:12:0x0044, B:13:0x004e), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x007c A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:9:0x002f, B:14:0x0058, B:16:0x0063, B:19:0x0074, B:21:0x007c, B:10:0x0037, B:11:0x0040, B:12:0x0044, B:13:0x004e), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0081 A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0081, please report this as an issue */
        public final synchronized boolean b() {
            double d10;
            long nanos;
            double seconds;
            double d11;
            double d12;
            try {
                h hVar = new h();
                h hVar2 = this.f48915a;
                hVar2.getClass();
                double d13 = hVar.f28508c - hVar2.f28508c;
                f fVar = this.f48916b;
                fVar.getClass();
                int[] iArr = f.a.f28505a;
                TimeUnit timeUnit = fVar.f28504c;
                int i10 = iArr[timeUnit.ordinal()];
                long j = fVar.f28503b;
                long j10 = fVar.f28502a;
                if (i10 == 1) {
                    d10 = j10 / j;
                    nanos = TimeUnit.SECONDS.toNanos(1L);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            seconds = j10 / timeUnit.toSeconds(j);
                        } else {
                            d10 = j10 / j;
                            nanos = TimeUnit.SECONDS.toMillis(1L);
                        }
                        d11 = (d13 * seconds) / f48914i;
                        if (d11 > 0.0d) {
                            this.f48918d = Math.min(this.f48918d + d11, this.f48917c);
                            this.f48915a = hVar;
                        }
                        d12 = this.f48918d;
                        if (d12 >= 1.0d) {
                            return false;
                        }
                        this.f48918d = d12 - 1.0d;
                        return true;
                    }
                    d10 = j10 / j;
                    nanos = TimeUnit.SECONDS.toMicros(1L);
                }
                seconds = d10 * nanos;
                d11 = (d13 * seconds) / f48914i;
                if (d11 > 0.0d) {
                    this.f48918d = Math.min(this.f48918d + d11, this.f48917c);
                    this.f48915a = hVar;
                }
                d12 = this.f48918d;
                if (d12 >= 1.0d) {
                    return false;
                }
                this.f48918d = d12 - 1.0d;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c(Context context, f fVar) {
        e eVar = new e();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        p218r7.a aVarE = p218r7.a.e();
        this.f48912d = null;
        this.f48913e = null;
        boolean z10 = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.f48910b = dNextDouble;
        this.f48911c = dNextDouble2;
        this.f48909a = aVarE;
        this.f48912d = new a(fVar, eVar, aVarE, "Trace");
        this.f48913e = new a(fVar, eVar, aVarE, "Network");
        i.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(C2078u.d dVar) {
        return dVar.size() > 0 && ((com.google.firebase.perf.v1.h) dVar.get(0)).K() > 0 && ((com.google.firebase.perf.v1.h) dVar.get(0)).J() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }
}
