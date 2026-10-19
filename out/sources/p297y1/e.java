package p297y1;

import java.util.Arrays;

/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f48037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f48038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48041e;

    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f48042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f48043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f48044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f48045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f48046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f48047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f48048g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f48049h;

        public final boolean a() {
            return this.f48045d > 15 && this.f48049h == 0;
        }

        public final void b(long j) {
            long j10 = this.f48045d;
            if (j10 == 0) {
                this.f48042a = j;
            } else if (j10 == 1) {
                long j11 = j - this.f48042a;
                this.f48043b = j11;
                this.f48047f = j11;
                this.f48046e = 1L;
            } else {
                long j12 = j - this.f48044c;
                int i10 = (int) (j10 % 15);
                long jAbs = Math.abs(j12 - this.f48043b);
                boolean[] zArr = this.f48048g;
                if (jAbs <= 1000000) {
                    this.f48046e++;
                    this.f48047f += j12;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f48049h--;
                    }
                } else if (!zArr[i10]) {
                    zArr[i10] = true;
                    this.f48049h++;
                }
            }
            this.f48045d++;
            this.f48044c = j;
        }

        public final void c() {
            this.f48045d = 0L;
            this.f48046e = 0L;
            this.f48047f = 0L;
            this.f48049h = 0;
            Arrays.fill(this.f48048g, false);
        }
    }
}
