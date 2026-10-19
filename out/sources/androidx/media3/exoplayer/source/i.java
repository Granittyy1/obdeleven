package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p114j1.A;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h.b f18704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0189a> f18705c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public static final class C0189a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f18706a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f18707b;
        }

        public a(CopyOnWriteArrayList<C0189a> copyOnWriteArrayList, int i10, h.b bVar) {
            this.f18705c = copyOnWriteArrayList;
            this.f18703a = i10;
            this.f18704b = bVar;
        }

        public final void a(p114j1.f<i> fVar) {
            for (C0189a c0189a : this.f18705c) {
                A.I(c0189a.f18706a, new androidx.media3.exoplayer.A(fVar, 2, c0189a.f18707b));
            }
        }
    }

    default void k(int i10, h.b bVar, p235t1.k kVar) {
    }

    default void T(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar) {
    }

    default void X(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar) {
    }

    default void c0(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar, int i11) {
    }

    default void H(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar, IOException iOException, boolean z10) {
    }
}
