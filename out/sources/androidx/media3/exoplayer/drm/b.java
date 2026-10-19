package androidx.media3.exoplayer.drm;

import U1.f;
import android.os.Looper;
import p078g1.n;
import p162n1.u;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18339a = new a();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrmSessionManager.java */
    public interface InterfaceC0187b {

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final f f18340d0 = new f();

        void a();
    }

    void c(Looper looper, u uVar);

    int d(n nVar);

    DrmSession e(androidx.media3.exoplayer.drm.a.C0185a c0185a, n nVar);

    default void a() {
    }

    default void b() {
    }

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class a implements b {
        @Override // androidx.media3.exoplayer.drm.b
        public final int d(n nVar) {
            return nVar.f35306r != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final DrmSession e(androidx.media3.exoplayer.drm.a.C0185a c0185a, n nVar) {
            if (nVar.f35306r == null) {
                return null;
            }
            return new c(new DrmSession.DrmSessionException(6001, new UnsupportedDrmException()));
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void c(Looper looper, u uVar) {
        }
    }
}
