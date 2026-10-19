package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p033c7.a0;
import p078g1.x;
import p162n1.u;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<T, b<T>> f18654h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f18655i;
    public p140l1.l j;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class a implements i, androidx.media3.exoplayer.drm.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f18656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i.a f18657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.media3.exoplayer.drm.a.C0185a f18658d;

        public a(T t8) {
            this.f18657c = new i.a(c.this.f18639c.f18705c, 0, null);
            this.f18658d = new androidx.media3.exoplayer.drm.a.C0185a(c.this.f18640d.f18337c, 0, null);
            this.f18656b = t8;
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void H(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                i.a aVar = this.f18657c;
                p235t1.k kVarC = c(kVar, bVar);
                aVar.getClass();
                aVar.a(new p235t1.m(aVar, jVar, kVarC, iOException, z10));
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void T(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar) {
            if (b(i10, bVar)) {
                i.a aVar = this.f18657c;
                p235t1.k kVarC = c(kVar, bVar);
                aVar.getClass();
                aVar.a(new com.braze.ui.inappmessage.a(aVar, jVar, kVarC));
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void X(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar) {
            if (b(i10, bVar)) {
                i.a aVar = this.f18657c;
                p235t1.k kVarC = c(kVar, bVar);
                aVar.getClass();
                aVar.a(new p235t1.n(aVar, jVar, kVarC));
            }
        }

        public final boolean b(int i10, h.b bVar) {
            h.b bVarU;
            T t8 = this.f18656b;
            c cVar = c.this;
            if (bVar != null) {
                bVarU = cVar.u(t8, bVar);
                if (bVarU == null) {
                    return false;
                }
            } else {
                bVarU = null;
            }
            int iW = cVar.w(i10, t8);
            i.a aVar = this.f18657c;
            if (aVar.f18703a != iW || !Objects.equals(aVar.f18704b, bVarU)) {
                this.f18657c = new i.a(cVar.f18639c.f18705c, iW, bVarU);
            }
            androidx.media3.exoplayer.drm.a.C0185a c0185a = this.f18658d;
            if (c0185a.f18335a == iW && Objects.equals(c0185a.f18336b, bVarU)) {
                return true;
            }
            this.f18658d = new androidx.media3.exoplayer.drm.a.C0185a(cVar.f18640d.f18337c, iW, bVarU);
            return true;
        }

        public final p235t1.k c(p235t1.k kVar, h.b bVar) {
            c cVar = c.this;
            T t8 = this.f18656b;
            long j = kVar.f47028d;
            long jV = cVar.v(t8, j);
            long j10 = kVar.f47029e;
            long jV2 = cVar.v(t8, j10);
            if (jV == j && jV2 == j10) {
                return kVar;
            }
            return new p235t1.k(kVar.f47025a, kVar.f47026b, kVar.f47027c, jV, jV2);
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void c0(int i10, h.b bVar, p235t1.j jVar, p235t1.k kVar, int i11) {
            if (b(i10, bVar)) {
                i.a aVar = this.f18657c;
                p235t1.k kVarC = c(kVar, bVar);
                aVar.getClass();
                aVar.a(new p235t1.l(aVar, jVar, kVarC, i11));
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void k(int i10, h.b bVar, p235t1.k kVar) {
            if (b(i10, bVar)) {
                i.a aVar = this.f18657c;
                p235t1.k kVarC = c(kVar, bVar);
                aVar.getClass();
                aVar.a(new a0(aVar, kVarC));
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f18660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p235t1.b f18661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>.a f18662c;

        public b(h hVar, p235t1.b bVar, a aVar) {
            this.f18660a = hVar;
            this.f18661b = bVar;
            this.f18662c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public void i() throws IOException {
        Iterator<b<T>> it = this.f18654h.values().iterator();
        while (it.hasNext()) {
            it.next().f18660a.i();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p() {
        for (b<T> bVar : this.f18654h.values()) {
            bVar.f18660a.f(bVar.f18661b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void q() {
        for (b<T> bVar : this.f18654h.values()) {
            bVar.f18660a.c(bVar.f18661b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void t() {
        HashMap<T, b<T>> map = this.f18654h;
        for (b<T> bVar : map.values()) {
            bVar.f18660a.e(bVar.f18661b);
            c<T>.a aVar = bVar.f18662c;
            h hVar = bVar.f18660a;
            hVar.d(aVar);
            hVar.n(aVar);
        }
        map.clear();
    }

    public abstract h.b u(T t8, h.b bVar);

    public abstract void x(Object obj, androidx.media3.exoplayer.source.a aVar, x xVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.h$c, t1.b] */
    public final void y(final T t8, h hVar) {
        HashMap<T, b<T>> map = this.f18654h;
        p241t7.b.e(!map.containsKey(t8));
        ?? r10 = new h.c() { // from class: t1.b
            @Override // androidx.media3.exoplayer.source.h.c
            public final void a(a aVar, x xVar) {
                this.f47003a.x(t8, aVar, xVar);
            }
        };
        a aVar = new a(t8);
        map.put(t8, new b<>(hVar, r10, aVar));
        Handler handler = this.f18655i;
        handler.getClass();
        hVar.b(handler, aVar);
        Handler handler2 = this.f18655i;
        handler2.getClass();
        hVar.m(handler2, aVar);
        p140l1.l lVar = this.j;
        u uVar = this.f18643g;
        p241t7.b.l(uVar);
        hVar.a(r10, lVar, uVar);
        if (this.f18638b.isEmpty()) {
            hVar.f(r10);
        }
    }

    public long v(Object obj, long j) {
        return j;
    }

    public int w(int i10, Object obj) {
        return i10;
    }
}
