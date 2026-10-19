package bo.app;

import com.braze.Constants;
import com.braze.support.DateTimeUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21477e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f21478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f21479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f21481d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public l6(int i10, int i11) {
        this.f21478a = i10 < 1 ? 1 : i10;
        this.f21479b = i11 < 1 ? 1 : i11;
        this.f21481d = i10;
    }

    public final boolean a() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        double dA = a(jNowInMilliseconds);
        this.f21481d = dA;
        this.f21480c = jNowInMilliseconds;
        if (dA < 1.0d) {
            return false;
        }
        this.f21481d = dA - ((double) 1);
        return true;
    }

    public final long b() {
        double dA = a(DateTimeUtils.nowInMilliseconds());
        this.f21481d = dA;
        if (dA >= 1.0d) {
            return 0L;
        }
        return Math.max(0L, (long) ((((double) 1) - dA) * this.f21479b * ((double) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)));
    }

    public String toString() {
        return "(capacity=" + this.f21478a + ", refillRate=" + this.f21479b + ", lastCallAt='" + DateTimeUtils.formatDateFromMillis$default(this.f21480c, null, null, 3, null) + "', currentTokenCount=" + a(DateTimeUtils.nowInMilliseconds()) + ')';
    }

    public final double a(long j) {
        return Math.min((((j - this.f21480c) / this.f21479b) / ((double) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)) + this.f21481d, this.f21478a);
    }
}
