package com.bumptech.glide;

import Q3.g;
import Q3.j;
import Q3.k;
import Q3.m;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ComponentCallbacks2, Q3.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final T3.d f24497m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.b f24498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f24499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q3.e f24500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f24501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f24502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f24503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f24504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f24505i;
    public final Q3.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList<T3.c<Object>> f24506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T3.d f24507l;

    /* JADX INFO: compiled from: RequestManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.f24500d.c(eVar);
        }
    }

    /* JADX INFO: compiled from: RequestManager.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f24509a;

        public b(k kVar) {
            this.f24509a = kVar;
        }
    }

    static {
        T3.d dVarC = new T3.d().c(Bitmap.class);
        dVarC.f5814q = true;
        f24497m = dVarC;
        new T3.d().c(O3.c.class).f5814q = true;
    }

    public e(com.bumptech.glide.b bVar, Q3.e eVar, j jVar, Context context) {
        T3.d dVar;
        k kVar = new k();
        Q3.d dVar2 = bVar.f24476h;
        this.f24503g = new m();
        a aVar = new a();
        this.f24504h = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f24505i = handler;
        this.f24498b = bVar;
        this.f24500d = eVar;
        this.f24502f = jVar;
        this.f24501e = kVar;
        this.f24499c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(kVar);
        dVar2.getClass();
        boolean z10 = p186p0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        Q3.b cVar = z10 ? new Q3.c(applicationContext, bVar2) : new g();
        this.j = cVar;
        if (X3.j.g()) {
            handler.post(aVar);
        } else {
            eVar.c(this);
        }
        eVar.c(cVar);
        this.f24506k = new CopyOnWriteArrayList<>(bVar.f24472d.f24482e);
        c cVar2 = bVar.f24472d;
        synchronized (cVar2) {
            try {
                if (cVar2.f24486i == null) {
                    cVar2.f24481d.getClass();
                    T3.d dVar3 = new T3.d();
                    dVar3.f5814q = true;
                    cVar2.f24486i = dVar3;
                }
                dVar = cVar2.f24486i;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            T3.d dVarClone = dVar.clone();
            if (dVarClone.f5814q && !dVarClone.f5815r) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            dVarClone.f5815r = true;
            dVarClone.f5814q = true;
            this.f24507l = dVarClone;
        }
        synchronized (bVar.f24477i) {
            try {
                if (bVar.f24477i.contains(this)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                bVar.f24477i.add(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Q3.f
    public final synchronized void a() {
        n();
        this.f24503g.a();
    }

    @Override // Q3.f
    public final synchronized void e() {
        try {
            this.f24503g.e();
            Iterator it = X3.j.d(this.f24503g.f5095b).iterator();
            while (it.hasNext()) {
                l((U3.g) it.next());
            }
            this.f24503g.f5095b.clear();
            k kVar = this.f24501e;
            Iterator it2 = X3.j.d((Set) kVar.f5086c).iterator();
            while (it2.hasNext()) {
                kVar.a((T3.b) it2.next());
            }
            ((ArrayList) kVar.f5087d).clear();
            this.f24500d.b(this);
            this.f24500d.b(this.j);
            this.f24505i.removeCallbacks(this.f24504h);
            com.bumptech.glide.b bVar = this.f24498b;
            synchronized (bVar.f24477i) {
                if (!bVar.f24477i.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                bVar.f24477i.remove(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q3.f
    public final synchronized void k() {
        o();
        this.f24503g.k();
    }

    public final void l(U3.g<?> gVar) {
        if (gVar == null) {
            return;
        }
        boolean zP = p(gVar);
        T3.b bVarC = gVar.c();
        if (zP) {
            return;
        }
        com.bumptech.glide.b bVar = this.f24498b;
        synchronized (bVar.f24477i) {
            try {
                Iterator it = bVar.f24477i.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).p(gVar)) {
                    }
                }
                if (bVarC != null) {
                    gVar.g(null);
                    bVarC.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d<Drawable> m(String str) {
        d<Drawable> dVar = new d<>(this.f24498b, this, Drawable.class, this.f24499c);
        dVar.f24494z = str;
        dVar.f24488B = true;
        return dVar;
    }

    public final synchronized void n() {
        k kVar = this.f24501e;
        kVar.f5085b = true;
        for (T3.b bVar : X3.j.d((Set) kVar.f5086c)) {
            if (bVar.isRunning()) {
                bVar.c();
                ((ArrayList) kVar.f5087d).add(bVar);
            }
        }
    }

    public final synchronized void o() {
        k kVar = this.f24501e;
        kVar.f5085b = false;
        for (T3.b bVar : X3.j.d((Set) kVar.f5086c)) {
            if (!bVar.f() && !bVar.isRunning()) {
                bVar.e();
            }
        }
        ((ArrayList) kVar.f5087d).clear();
    }

    public final synchronized boolean p(U3.g<?> gVar) {
        T3.b bVarC = gVar.c();
        if (bVarC == null) {
            return true;
        }
        if (!this.f24501e.a(bVarC)) {
            return false;
        }
        this.f24503g.f5095b.remove(gVar);
        gVar.g(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f24501e + ", treeNode=" + this.f24502f + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }
}
