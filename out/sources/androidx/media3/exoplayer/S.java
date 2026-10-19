package androidx.media3.exoplayer;

/* JADX INFO: compiled from: LoadControl.java */
/* JADX INFO: loaded from: classes.dex */
public interface S {

    /* JADX INFO: compiled from: LoadControl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p162n1.u f18137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f18139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f18141e;

        public a(p162n1.u uVar, p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar, long j, long j10, float f10, boolean z10, long j11) {
            this.f18137a = uVar;
            this.f18138b = j10;
            this.f18139c = f10;
            this.f18140d = z10;
            this.f18141e = j11;
        }
    }

    default boolean a(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default void c(p162n1.u uVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default boolean d(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean e() {
        p114j1.k.f("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default long f() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void g(p162n1.u uVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    p272w1.d h();

    default void i(p162n1.u uVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void j(a aVar, p259v1.t[] tVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
