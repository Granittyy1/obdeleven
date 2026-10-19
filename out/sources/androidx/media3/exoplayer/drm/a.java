package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.source.h;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class C0185a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h.b f18336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0186a> f18337c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        public static final class C0186a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f18338a;
        }

        public C0185a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public C0185a(CopyOnWriteArrayList<C0186a> copyOnWriteArrayList, int i10, h.b bVar) {
            this.f18337c = copyOnWriteArrayList;
            this.f18335a = i10;
            this.f18336b = bVar;
        }
    }
}
