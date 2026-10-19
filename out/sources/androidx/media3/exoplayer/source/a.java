package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p078g1.x;
import p162n1.u;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<h.c> f18637a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<h.c> f18638b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.a f18639c = new i.a(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.a.C0185a f18640d = new androidx.media3.exoplayer.drm.a.C0185a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f18641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f18642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f18643g;

    @Override // androidx.media3.exoplayer.source.h
    public final void a(h.c cVar, p140l1.l lVar, u uVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f18641e;
        p241t7.b.e(looper == null || looper == looperMyLooper);
        this.f18643g = uVar;
        x xVar = this.f18642f;
        this.f18637a.add(cVar);
        if (this.f18641e == null) {
            this.f18641e = looperMyLooper;
            this.f18638b.add(cVar);
            r(lVar);
        } else if (xVar != null) {
            c(cVar);
            cVar.a(this, xVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void b(Handler handler, i iVar) {
        handler.getClass();
        i.a aVar = this.f18639c;
        aVar.getClass();
        i.a.C0189a c0189a = new i.a.C0189a();
        c0189a.f18706a = handler;
        c0189a.f18707b = iVar;
        aVar.f18705c.add(c0189a);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void c(h.c cVar) {
        this.f18641e.getClass();
        HashSet<h.c> hashSet = this.f18638b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            q();
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void d(i iVar) {
        CopyOnWriteArrayList<i.a.C0189a> copyOnWriteArrayList = this.f18639c.f18705c;
        for (i.a.C0189a c0189a : copyOnWriteArrayList) {
            if (c0189a.f18707b == iVar) {
                copyOnWriteArrayList.remove(c0189a);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.c cVar) {
        ArrayList<h.c> arrayList = this.f18637a;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            f(cVar);
            return;
        }
        this.f18641e = null;
        this.f18642f = null;
        this.f18643g = null;
        this.f18638b.clear();
        t();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void f(h.c cVar) {
        HashSet<h.c> hashSet = this.f18638b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        p();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void m(Handler handler, androidx.media3.exoplayer.drm.a aVar) {
        handler.getClass();
        androidx.media3.exoplayer.drm.a.C0185a c0185a = this.f18640d;
        c0185a.getClass();
        androidx.media3.exoplayer.drm.a.C0185a.C0186a c0186a = new androidx.media3.exoplayer.drm.a.C0185a.C0186a();
        c0186a.f18338a = aVar;
        c0185a.f18337c.add(c0186a);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void n(androidx.media3.exoplayer.drm.a aVar) {
        CopyOnWriteArrayList<androidx.media3.exoplayer.drm.a.C0185a.C0186a> copyOnWriteArrayList = this.f18640d.f18337c;
        for (androidx.media3.exoplayer.drm.a.C0185a.C0186a c0186a : copyOnWriteArrayList) {
            if (c0186a.f18338a == aVar) {
                copyOnWriteArrayList.remove(c0186a);
            }
        }
    }

    public abstract void r(p140l1.l lVar);

    public final void s(x xVar) {
        this.f18642f = xVar;
        Iterator<h.c> it = this.f18637a.iterator();
        while (it.hasNext()) {
            it.next().a(this, xVar);
        }
    }

    public abstract void t();

    public void p() {
    }

    public void q() {
    }
}
