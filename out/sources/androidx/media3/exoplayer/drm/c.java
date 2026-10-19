package androidx.media3.exoplayer.drm;

import java.util.UUID;
import p078g1.g;

/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f18341a;

    public c(DrmSession.DrmSessionException drmSessionException) {
        this.f18341a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID b() {
        return g.f35248a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean c() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean e(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException f() {
        return this.f18341a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final p152m1.a g() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void a(a.C0185a c0185a) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void d(a.C0185a c0185a) {
    }
}
