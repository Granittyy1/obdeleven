package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import p078g1.p;
import p078g1.x;
import p162n1.u;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f18698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18702e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public final b a(Object obj) {
            if (this.f18698a.equals(obj)) {
                return this;
            }
            return new b(obj, this.f18699b, this.f18700c, this.f18701d, this.f18702e);
        }

        public final boolean b() {
            return this.f18699b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f18698a.equals(bVar.f18698a) && this.f18699b == bVar.f18699b && this.f18700c == bVar.f18700c && this.f18701d == bVar.f18701d && this.f18702e == bVar.f18702e;
        }

        public final int hashCode() {
            return ((((((((this.f18698a.hashCode() + 527) * 31) + this.f18699b) * 31) + this.f18700c) * 31) + ((int) this.f18701d)) * 31) + this.f18702e;
        }

        public b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public b(int i10, long j, Object obj) {
            this(obj, -1, -1, j, i10);
        }

        public b(Object obj, int i10, int i11, long j, int i12) {
            this.f18698a = obj;
            this.f18699b = i10;
            this.f18700c = i11;
            this.f18701d = j;
            this.f18702e = i12;
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface c {
        void a(androidx.media3.exoplayer.source.a aVar, x xVar);
    }

    void a(c cVar, p140l1.l lVar, u uVar);

    void b(Handler handler, i iVar);

    void c(c cVar);

    void d(i iVar);

    void e(c cVar);

    void f(c cVar);

    g g(b bVar, p272w1.d dVar, long j);

    p h();

    void i() throws IOException;

    default boolean j() {
        return true;
    }

    default x k() {
        return null;
    }

    void m(Handler handler, androidx.media3.exoplayer.drm.a aVar);

    void n(androidx.media3.exoplayer.drm.a aVar);

    void o(g gVar);

    /* JADX INFO: compiled from: MediaSource.java */
    public interface a {
        h d(p pVar);

        default void c() {
        }

        default void a(X1.e eVar) {
        }

        @Deprecated
        default void b(boolean z10) {
        }
    }

    default void l(p pVar) {
    }
}
