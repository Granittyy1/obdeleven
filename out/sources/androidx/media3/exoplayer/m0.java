package androidx.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes.dex */
public interface m0 extends j0.b {

    /* JADX INFO: compiled from: Renderer.java */
    public interface a {
        void a();

        void b();
    }

    long A();

    void B(long j) throws ExoPlaybackException;

    boolean C();

    U D();

    int E();

    void F(p078g1.x xVar);

    boolean b();

    boolean d();

    void f();

    String getName();

    int getState();

    boolean h();

    void l();

    void o(int i10, p162n1.u uVar, p114j1.t tVar);

    void p(p078g1.n[] nVarArr, p235t1.r rVar, long j, long j10, androidx.media3.exoplayer.source.h.b bVar) throws ExoPlaybackException;

    AbstractC1389g q();

    void reset();

    void start() throws ExoPlaybackException;

    void stop();

    void v(long j, long j10) throws ExoPlaybackException;

    void w(o0 o0Var, p078g1.n[] nVarArr, p235t1.r rVar, boolean z10, boolean z11, long j, long j10, androidx.media3.exoplayer.source.h.b bVar) throws ExoPlaybackException;

    p235t1.r y();

    void z() throws IOException;

    default void a() {
    }

    default void k() {
    }

    default void s(float f10, float f11) throws ExoPlaybackException {
    }
}
