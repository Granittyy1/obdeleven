package com.bumptech.glide.request;

import D3.j;
import T3.a;
import T3.b;
import U3.f;
import U3.g;
import X3.e;
import Y3.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements b, f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f24698y = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f24699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f24701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f24702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<R> f24704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a<?> f24705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24707i;
    public final Priority j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g<R> f24708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f24709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V3.a.C0095a f24710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e.a f24711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f24712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.bumptech.glide.load.engine.c.d f24713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.c f24714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Status f24715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f24716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f24717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f24718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24721x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Status f24722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Status f24723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Status f24724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Status f24725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Status f24726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Status f24727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Status[] f24728h;

        static {
            Status status = new Status("PENDING", 0);
            f24722b = status;
            Status status2 = new Status("RUNNING", 1);
            f24723c = status2;
            Status status3 = new Status("WAITING_FOR_SIZE", 2);
            f24724d = status3;
            Status status4 = new Status("COMPLETE", 3);
            f24725e = status4;
            Status status5 = new Status("FAILED", 4);
            f24726f = status5;
            Status status6 = new Status("CLEARED", 5);
            f24727g = status6;
            f24728h = new Status[]{status, status2, status3, status4, status5, status6};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f24728h.clone();
        }
    }

    public SingleRequest(Context context, c cVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, Priority priority, g gVar, ArrayList arrayList, com.bumptech.glide.load.engine.c cVar2, e.a aVar2) {
        V3.a.C0095a c0095a = V3.a.f6725a;
        if (f24698y) {
            String.valueOf(hashCode());
        }
        this.f24699a = new d.a();
        this.f24700b = obj;
        this.f24701c = context;
        this.f24702d = cVar;
        this.f24703e = obj2;
        this.f24704f = cls;
        this.f24705g = aVar;
        this.f24706h = i10;
        this.f24707i = i11;
        this.j = priority;
        this.f24708k = gVar;
        this.f24709l = arrayList;
        this.f24714q = cVar2;
        this.f24710m = c0095a;
        this.f24711n = aVar2;
        this.f24715r = Status.f24722b;
        cVar.getClass();
    }

    @Override // U3.f
    public final void a(int i10, int i11) throws Throwable {
        Object obj;
        int iRound = i10;
        this.f24699a.a();
        Object obj2 = this.f24700b;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f24698y;
                    if (z10) {
                        int i12 = X3.f.f7206a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.f24715r == Status.f24724d) {
                        Status status = Status.f24723c;
                        this.f24715r = status;
                        this.f24705g.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        this.f24719v = iRound;
                        this.f24720w = i11 == Integer.MIN_VALUE ? i11 : Math.round(1.0f * i11);
                        if (z10) {
                            int i13 = X3.f.f7206a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        com.bumptech.glide.load.engine.c cVar = this.f24714q;
                        c cVar2 = this.f24702d;
                        Object obj3 = this.f24703e;
                        a<?> aVar = this.f24705g;
                        try {
                            obj = obj2;
                            try {
                                this.f24713p = cVar.a(cVar2, obj3, aVar.j, this.f24719v, this.f24720w, aVar.f5813p, this.f24704f, this.j, aVar.f5801c, aVar.f5812o, aVar.f5808k, aVar.f5816s, aVar.f5811n, aVar.f5805g, aVar.f5817t, this, this.f24711n);
                                if (this.f24715r != status) {
                                    this.f24713p = null;
                                }
                                if (z10) {
                                    int i14 = X3.f.f7206a;
                                    SystemClock.elapsedRealtimeNanos();
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    public final void b() {
        if (this.f24721x) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f24699a.a();
        this.f24708k.d(this);
        com.bumptech.glide.load.engine.c.d dVar = this.f24713p;
        if (dVar != null) {
            synchronized (com.bumptech.glide.load.engine.c.this) {
                dVar.f24608a.h(dVar.f24609b);
            }
            this.f24713p = null;
        }
    }

    @Override // T3.b
    public final void c() {
        synchronized (this.f24700b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T3.b
    public final void clear() {
        synchronized (this.f24700b) {
            try {
                if (this.f24721x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f24699a.a();
                Status status = this.f24715r;
                Status status2 = Status.f24727g;
                if (status == status2) {
                    return;
                }
                b();
                j jVar = this.f24712o;
                if (jVar != null) {
                    this.f24712o = null;
                } else {
                    jVar = null;
                }
                this.f24708k.j(g());
                this.f24715r = status2;
                if (jVar != null) {
                    this.f24714q.getClass();
                    com.bumptech.glide.load.engine.c.e(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T3.b
    public final boolean d() {
        boolean z10;
        synchronized (this.f24700b) {
            z10 = this.f24715r == Status.f24727g;
        }
        return z10;
    }

    @Override // T3.b
    public final void e() {
        synchronized (this.f24700b) {
            try {
                if (this.f24721x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f24699a.a();
                int i10 = X3.f.f7206a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f24703e == null) {
                    if (X3.j.h(this.f24706h, this.f24707i)) {
                        this.f24719v = this.f24706h;
                        this.f24720w = this.f24707i;
                    }
                    if (this.f24718u == null) {
                        a<?> aVar = this.f24705g;
                        aVar.getClass();
                        this.f24718u = null;
                        int i11 = aVar.f5810m;
                        if (i11 > 0) {
                            this.f24718u = h(i11);
                        }
                    }
                    i(new GlideException("Received null model"), this.f24718u == null ? 5 : 3);
                    return;
                }
                Status status = this.f24715r;
                Status status2 = Status.f24723c;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.f24725e) {
                    j(this.f24712o, DataSource.f24515f);
                    return;
                }
                Status status3 = Status.f24724d;
                this.f24715r = status3;
                if (X3.j.h(this.f24706h, this.f24707i)) {
                    a(this.f24706h, this.f24707i);
                } else {
                    this.f24708k.f(this);
                }
                Status status4 = this.f24715r;
                if (status4 == status2 || status4 == status3) {
                    this.f24708k.i(g());
                }
                if (f24698y) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T3.b
    public final boolean f() {
        boolean z10;
        synchronized (this.f24700b) {
            z10 = this.f24715r == Status.f24725e;
        }
        return z10;
    }

    public final Drawable g() {
        if (this.f24717t == null) {
            a<?> aVar = this.f24705g;
            aVar.getClass();
            this.f24717t = null;
            int i10 = aVar.f5804f;
            if (i10 > 0) {
                this.f24717t = h(i10);
            }
        }
        return this.f24717t;
    }

    public final Drawable h(int i10) {
        this.f24705g.getClass();
        Resources.Theme theme = this.f24701c.getTheme();
        c cVar = this.f24702d;
        return M3.a.a(cVar, cVar, i10, theme);
    }

    public final void i(GlideException glideException, int i10) {
        Drawable drawableG;
        this.f24699a.a();
        synchronized (this.f24700b) {
            try {
                glideException.f(null);
                int i11 = this.f24702d.f24485h;
                if (i11 <= i10) {
                    Objects.toString(this.f24703e);
                    if (i11 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        GlideException.a(glideException, arrayList);
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            i12 = i13;
                        }
                    }
                }
                this.f24713p = null;
                this.f24715r = Status.f24726f;
                this.f24721x = true;
                try {
                    ArrayList arrayList2 = this.f24709l;
                    if (arrayList2 != null) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((T3.c) it.next()).c(glideException);
                        }
                    }
                    if (this.f24703e == null) {
                        if (this.f24718u == null) {
                            a<?> aVar = this.f24705g;
                            aVar.getClass();
                            this.f24718u = null;
                            int i14 = aVar.f5810m;
                            if (i14 > 0) {
                                this.f24718u = h(i14);
                            }
                        }
                        drawableG = this.f24718u;
                    } else {
                        drawableG = null;
                    }
                    if (drawableG == null) {
                        if (this.f24716s == null) {
                            a<?> aVar2 = this.f24705g;
                            aVar2.getClass();
                            this.f24716s = null;
                            int i15 = aVar2.f5803e;
                            if (i15 > 0) {
                                this.f24716s = h(i15);
                            }
                        }
                        drawableG = this.f24716s;
                    }
                    if (drawableG == null) {
                        drawableG = g();
                    }
                    this.f24708k.h(drawableG);
                    this.f24721x = false;
                } catch (Throwable th) {
                    this.f24721x = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // T3.b
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f24700b) {
            try {
                Status status = this.f24715r;
                z10 = status == Status.f24723c || status == Status.f24724d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final void j(j jVar, DataSource dataSource) {
        this.f24699a.a();
        j jVar2 = null;
        try {
            synchronized (this.f24700b) {
                try {
                    this.f24713p = null;
                    if (jVar == null) {
                        i(new GlideException("Expected to receive a Resource<R> with an object of " + this.f24704f + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = jVar.f2759d.get();
                    if (obj != null && this.f24704f.isAssignableFrom(obj.getClass())) {
                        k(jVar, obj, dataSource);
                        return;
                    }
                    try {
                        this.f24712o = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f24704f);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(jVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        i(new GlideException(sb2.toString()), 5);
                        this.f24714q.getClass();
                        com.bumptech.glide.load.engine.c.e(jVar);
                    } catch (Throwable th) {
                        jVar2 = jVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (jVar2 != null) {
                this.f24714q.getClass();
                com.bumptech.glide.load.engine.c.e(jVar2);
            }
            throw th3;
        }
    }

    public final void k(j jVar, Object obj, DataSource dataSource) {
        this.f24715r = Status.f24725e;
        this.f24712o = jVar;
        if (this.f24702d.f24485h <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.f24703e);
            int i10 = X3.f.f7206a;
            SystemClock.elapsedRealtimeNanos();
        }
        this.f24721x = true;
        try {
            ArrayList arrayList = this.f24709l;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((T3.c) it.next()).b(obj);
                }
            }
            this.f24710m.getClass();
            this.f24708k.b(obj);
        } finally {
            this.f24721x = false;
        }
    }
}
