package V1;

import A1.C0574i;
import A1.F;
import A1.K;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import p078g1.n;
import p114j1.r;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f6701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f6702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f6703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6708i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6711m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6700a = new d();
    public a j = new a();

    /* JADX INFO: compiled from: StreamReader.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f6712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V1.b.a f6713b;
    }

    public void a(long j) {
        this.f6706g = j;
    }

    public abstract long b(r rVar);

    public abstract boolean c(r rVar, long j, a aVar) throws IOException;

    public void d(boolean z10) {
        if (z10) {
            this.j = new a();
            this.f6705f = 0L;
            this.f6707h = 0;
        } else {
            this.f6707h = 1;
        }
        this.f6704e = -1L;
        this.f6706g = 0L;
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class b implements f {
        @Override // V1.f
        public final long a(C0574i c0574i) {
            return -1L;
        }

        @Override // V1.f
        public final F b() {
            return new F.b(-9223372036854775807L);
        }

        @Override // V1.f
        public final void c(long j) {
        }
    }
}
