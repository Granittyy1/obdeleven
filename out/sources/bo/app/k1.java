package bo.app;

import android.os.SystemClock;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements z1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f21405g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21406h = (int) TimeUnit.SECONDS.toMillis(45);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f21411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21412f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final int a(Random random, int i10, int i11) {
            kotlin.jvm.internal.i.e(random, "random");
            return Math.min(i10, i11) + random.c(Math.abs(i10 - i11) + 1);
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {
        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Computing new sleep delay. Previous sleep delay: " + k1.this.f21412f;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21416d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11) {
            super(0);
            this.f21415c = i10;
            this.f21416d = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New sleep duration: " + k1.this.f21412f + " ms. Default sleep duration: " + this.f21415c + " ms. Max sleep: " + k1.this.f21407a + " ms. Min sleep: " + k1.this.f21409c + " ms. Scale factor: " + k1.this.f21410d + " randomValueBetweenSleepIntervals: " + this.f21416d;
        }
    }

    public k1(int i10, int i11, int i12, int i13) {
        this.f21407a = i10;
        this.f21408b = i11;
        this.f21409c = i12;
        this.f21410d = i13;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f21411e = new XorWowRandom((int) jUptimeMillis, (int) (jUptimeMillis >> 32));
    }

    public String toString() {
        return "ExponentialBackoffStateProvider(maxSleepDurationMs=" + this.f21407a + ", defaultNormalFlushIntervalMs=" + this.f21408b + ", minSleepDurationMs=" + this.f21409c + ", scaleFactor=" + this.f21410d + ", randomSleepDurationGenerator=" + this.f21411e + ", lastSleepDurationMs=" + this.f21412f + ", isBackingOff=" + c() + ')';
    }

    @Override // bo.app.z1
    public int a() {
        return a(this.f21408b);
    }

    @Override // bo.app.z1
    public void b() {
        this.f21412f = 0;
    }

    public boolean c() {
        return this.f21412f != 0;
    }

    public int a(int i10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new b(), 3, (Object) null);
        int iA = f21405g.a(this.f21411e, i10, this.f21412f * this.f21410d);
        this.f21412f = Math.max(this.f21409c, Math.min(this.f21407a, iA));
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new c(i10, iA), 3, (Object) null);
        return this.f21412f;
    }

    public /* synthetic */ k1(int i10, int i11, int i12, int i13, int i14, kotlin.jvm.internal.e eVar) {
        this(i10, (i14 & 2) != 0 ? f21406h : i11, (i14 & 4) != 0 ? r5.f21840e.b() : i12, (i14 & 8) != 0 ? 3 : i13);
    }
}
