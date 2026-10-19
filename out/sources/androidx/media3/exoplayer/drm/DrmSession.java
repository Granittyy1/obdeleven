package androidx.media3.exoplayer.drm;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(int i10, Throwable th) {
            super(th);
            this.errorCode = i10;
        }
    }

    void a(a.C0185a c0185a);

    UUID b();

    default boolean c() {
        return false;
    }

    void d(a.C0185a c0185a);

    boolean e(String str);

    DrmSessionException f();

    p152m1.a g();

    int getState();
}
