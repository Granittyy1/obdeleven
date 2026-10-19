package p078g1;

import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;
import java.util.Objects;
import p114j1.A;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes.dex */
public interface v {

    /* JADX INFO: compiled from: Player.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f35455a;

        /* JADX INFO: renamed from: g1.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Player.java */
        public static final class C0370a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m.a f35456a = new m.a();

            public final void a(int i10, boolean z10) {
                m.a aVar = this.f35456a;
                if (z10) {
                    aVar.a(i10);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            new SparseBooleanArray();
            p241t7.b.k(!false);
            A.B(0);
        }

        public a(m mVar) {
            this.f35455a = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f35455a.equals(((a) obj).f35455a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f35455a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f35457a;

        public b(m mVar) {
            this.f35457a = mVar;
        }

        public final boolean a(int... iArr) {
            m mVar = this.f35457a;
            for (int i10 : iArr) {
                if (mVar.f35273a.get(i10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f35457a.equals(((b) obj).f35457a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f35457a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f35458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f35460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f35461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f35462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f35463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f35464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f35465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f35466i;

        static {
            com.obdeleven.service.core.b.b(0, 1, 2, 3, 4);
            A.B(5);
            A.B(6);
        }

        public d(Object obj, int i10, p pVar, Object obj2, int i11, long j, long j10, int i12, int i13) {
            this.f35458a = obj;
            this.f35459b = i10;
            this.f35460c = pVar;
            this.f35461d = obj2;
            this.f35462e = i11;
            this.f35463f = j;
            this.f35464g = j10;
            this.f35465h = i12;
            this.f35466i = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35459b == dVar.f35459b && this.f35462e == dVar.f35462e && this.f35463f == dVar.f35463f && this.f35464g == dVar.f35464g && this.f35465h == dVar.f35465h && this.f35466i == dVar.f35466i && Objects.equals(this.f35460c, dVar.f35460c) && Objects.equals(this.f35458a, dVar.f35458a) && Objects.equals(this.f35461d, dVar.f35461d);
        }

        public final int hashCode() {
            return Objects.hash(this.f35458a, Integer.valueOf(this.f35459b), this.f35460c, this.f35461d, Integer.valueOf(this.f35462e), Long.valueOf(this.f35463f), Long.valueOf(this.f35464g), Integer.valueOf(this.f35465h), Integer.valueOf(this.f35466i));
        }
    }

    long A();

    boolean B();

    int C();

    B D();

    boolean E();

    boolean F();

    p102i1.b G();

    void I();

    int J();

    int K();

    boolean L(int i10);

    void M(int i10);

    void N(SurfaceView surfaceView);

    boolean O();

    int P();

    int Q();

    x R();

    Looper S();

    boolean T();

    A U();

    long V();

    void W();

    void X();

    void Y(TextureView textureView);

    void Z();

    void a();

    r a0();

    void b();

    long b0();

    void c();

    long c0();

    ExoPlaybackException d();

    boolean d0();

    void e(u uVar);

    boolean f();

    u g();

    long h();

    void i(int i10, long j);

    boolean j();

    void k(boolean z10);

    long l();

    int m();

    void n(TextureView textureView);

    F o();

    void p();

    boolean q();

    int r();

    void s(SurfaceView surfaceView);

    void t(long j);

    void u(c cVar);

    void v(c cVar);

    void w();

    void x(int i10);

    long y();

    void z(A a10);

    /* JADX INFO: compiled from: Player.java */
    public interface c {
        default void M() {
        }

        default void A(p102i1.b bVar) {
        }

        default void G(int i10) {
        }

        default void L(int i10) {
        }

        default void N(boolean z10) {
        }

        @Deprecated
        default void P(List<p102i1.a> list) {
        }

        default void V(A a10) {
        }

        default void Y(b bVar) {
        }

        default void a0(u uVar) {
        }

        default void b(F f10) {
        }

        default void b0(B b10) {
        }

        default void c(ExoPlaybackException exoPlaybackException) {
        }

        default void d0(s sVar) {
        }

        default void e(int i10) {
        }

        default void g0(boolean z10) {
        }

        default void l(boolean z10) {
        }

        default void m(r rVar) {
        }

        default void n(ExoPlaybackException exoPlaybackException) {
        }

        default void p(int i10) {
        }

        default void q(int i10) {
        }

        default void w(boolean z10) {
        }

        default void x(a aVar) {
        }

        @Deprecated
        default void Q(int i10, boolean z10) {
        }

        default void Z(int i10, int i11) {
        }

        default void o(int i10, boolean z10) {
        }

        default void z(p pVar, int i10) {
        }

        default void g(int i10, d dVar, d dVar2) {
        }
    }
}
