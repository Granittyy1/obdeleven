package A1;

import java.io.IOException;

/* JADX INFO: renamed from: A1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0570e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f488d;

    /* JADX INFO: renamed from: A1.e$a */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f494f;

        public a(d dVar, long j, long j10, long j11, long j12, long j13) {
            this.f489a = dVar;
            this.f490b = j;
            this.f491c = j10;
            this.f492d = j11;
            this.f493e = j12;
            this.f494f = j13;
        }

        @Override // A1.F
        public final boolean d() {
            return true;
        }

        @Override // A1.F
        public final F.a i(long j) {
            G g10 = new G(j, c.a(this.f489a.a(j), 0L, this.f491c, this.f492d, this.f493e, this.f494f));
            return new F.a(g10, g10);
        }

        @Override // A1.F
        public final long k() {
            return this.f490b;
        }
    }

    /* JADX INFO: renamed from: A1.e$c */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f498d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f502h;

        public c(long j, long j10, long j11, long j12, long j13, long j14) {
            this.f495a = j;
            this.f496b = j10;
            this.f499e = j11;
            this.f500f = j12;
            this.f501g = j13;
            this.f497c = j14;
            this.f502h = a(j10, 0L, j11, j12, j13, j14);
        }

        public static long a(long j, long j10, long j11, long j12, long j13, long j14) {
            if (j12 + 1 >= j13 || j10 + 1 >= j11) {
                return j12;
            }
            long j15 = (long) ((j - j10) * ((j13 - j12) / (j11 - j10)));
            return p114j1.A.h(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
    }

    /* JADX INFO: renamed from: A1.e$d */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface d {
        long a(long j);
    }

    /* JADX INFO: renamed from: A1.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class C0001e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0001e f503d = new C0001e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f506c;

        public C0001e(int i10, long j, long j10) {
            this.f504a = i10;
            this.f505b = j;
            this.f506c = j10;
        }
    }

    public AbstractC0570e(d dVar, f fVar, long j, long j10, long j11, long j12, long j13, int i10) {
        this.f486b = fVar;
        this.f488d = i10;
        this.f485a = new a(dVar, j, j10, j11, j12, j13);
    }

    public static int b(C0574i c0574i, long j, E e10) {
        if (j == c0574i.f523d) {
            return 0;
        }
        e10.f414a = j;
        return 1;
    }

    public final int a(C0574i c0574i, E e10) throws IOException {
        while (true) {
            c cVar = this.f487c;
            p241t7.b.l(cVar);
            long j = cVar.f500f;
            long j10 = cVar.f501g;
            long j11 = cVar.f502h;
            long j12 = j10 - j;
            long j13 = this.f488d;
            f fVar = this.f486b;
            if (j12 <= j13) {
                this.f487c = null;
                fVar.b();
                return b(c0574i, j, e10);
            }
            long j14 = j11 - c0574i.f523d;
            if (j14 < 0 || j14 > 262144) {
                return b(c0574i, j11, e10);
            }
            c0574i.i((int) j14);
            c0574i.f525f = 0;
            C0001e c0001eA = fVar.a(c0574i, cVar.f496b);
            int i10 = c0001eA.f504a;
            if (i10 == -3) {
                this.f487c = null;
                fVar.b();
                return b(c0574i, j11, e10);
            }
            long j15 = c0001eA.f505b;
            long j16 = c0001eA.f506c;
            if (i10 == -2) {
                cVar.f498d = j15;
                cVar.f500f = j16;
                cVar.f502h = c.a(cVar.f496b, j15, cVar.f499e, j16, cVar.f501g, cVar.f497c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j17 = j16 - c0574i.f523d;
                    if (j17 >= 0 && j17 <= 262144) {
                        c0574i.i((int) j17);
                    }
                    this.f487c = null;
                    fVar.b();
                    return b(c0574i, j16, e10);
                }
                cVar.f499e = j15;
                cVar.f501g = j16;
                cVar.f502h = c.a(cVar.f496b, cVar.f498d, j15, cVar.f500f, j16, cVar.f497c);
            }
        }
    }

    public final void c(long j) {
        c cVar = this.f487c;
        if (cVar == null || cVar.f495a != j) {
            a aVar = this.f485a;
            this.f487c = new c(j, aVar.f489a.a(j), aVar.f491c, aVar.f492d, aVar.f493e, aVar.f494f);
        }
    }

    /* JADX INFO: renamed from: A1.e$f */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface f {
        C0001e a(C0574i c0574i, long j) throws IOException;

        default void b() {
        }
    }

    /* JADX INFO: renamed from: A1.e$b */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // A1.AbstractC0570e.d
        public final long a(long j) {
            return j;
        }
    }
}
