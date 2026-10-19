package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LiveData.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1382z<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f17839k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p173o.b<D<? super T>, AbstractC1382z<T>.d> f17841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f17844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f17845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17848i;
    public final a j;

    /* JADX INFO: renamed from: androidx.lifecycle.z$a */
    /* JADX INFO: compiled from: LiveData.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (AbstractC1382z.this.f17840a) {
                obj = AbstractC1382z.this.f17845f;
                AbstractC1382z.this.f17845f = AbstractC1382z.f17839k;
            }
            AbstractC1382z.this.j(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$b */
    /* JADX INFO: compiled from: LiveData.java */
    public class b extends AbstractC1382z<T>.d {
        @Override // androidx.lifecycle.AbstractC1382z.d
        public final boolean f() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$c */
    /* JADX INFO: compiled from: LiveData.java */
    public class c extends AbstractC1382z<T>.d implements r {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC1376t f17850f;

        public c(InterfaceC1376t interfaceC1376t, D<? super T> d10) {
            super(d10);
            this.f17850f = interfaceC1376t;
        }

        @Override // androidx.lifecycle.AbstractC1382z.d
        public final void d() {
            this.f17850f.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.AbstractC1382z.d
        public final boolean e(InterfaceC1376t interfaceC1376t) {
            return this.f17850f == interfaceC1376t;
        }

        @Override // androidx.lifecycle.AbstractC1382z.d
        public final boolean f() {
            return this.f17850f.getLifecycle().b().a(Lifecycle.State.f17752e);
        }

        @Override // androidx.lifecycle.r
        public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            InterfaceC1376t interfaceC1376t2 = this.f17850f;
            Lifecycle.State stateB = interfaceC1376t2.getLifecycle().b();
            if (stateB == Lifecycle.State.f17749b) {
                AbstractC1382z.this.i(this.f17852b);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                a(f());
                state = stateB;
                stateB = interfaceC1376t2.getLifecycle().b();
            }
        }
    }

    public AbstractC1382z(T t8) {
        this.f17840a = new Object();
        this.f17841b = new p173o.b<>();
        this.f17842c = 0;
        this.f17845f = f17839k;
        this.j = new a();
        this.f17844e = t8;
        this.f17846g = 0;
    }

    public static void a(String str) {
        if (!p160n.b.i0().j0()) {
            throw new IllegalStateException(androidx.compose.foundation.gestures.d.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(AbstractC1382z<T>.d dVar) {
        if (dVar.f17853c) {
            if (!dVar.f()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f17854d;
            int i11 = this.f17846g;
            if (i10 >= i11) {
                return;
            }
            dVar.f17854d = i11;
            dVar.f17852b.d((Object) this.f17844e);
        }
    }

    public final void c(AbstractC1382z<T>.d dVar) {
        if (this.f17847h) {
            this.f17848i = true;
            return;
        }
        this.f17847h = true;
        do {
            this.f17848i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                p173o.b<D<? super T>, AbstractC1382z<T>.d> bVar = this.f17841b;
                bVar.getClass();
                o.b.d dVar2 = new o.b.d();
                bVar.f45036d.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.f17848i) {
                        break;
                    }
                }
            }
        } while (this.f17848i);
        this.f17847h = false;
    }

    public final T d() {
        T t8 = (T) this.f17844e;
        if (t8 != f17839k) {
            return t8;
        }
        return null;
    }

    public void e(InterfaceC1376t interfaceC1376t, D<? super T> d10) {
        AbstractC1382z<T>.d dVar;
        a("observe");
        if (interfaceC1376t.getLifecycle().b() == Lifecycle.State.f17749b) {
            return;
        }
        c cVar = new c(interfaceC1376t, d10);
        p173o.b<D<? super T>, AbstractC1382z<T>.d> bVar = this.f17841b;
        o.b.c<D<? super T>, AbstractC1382z<T>.d> cVarD = bVar.d(d10);
        if (cVarD != null) {
            dVar = cVarD.f45039c;
        } else {
            o.b.c<K, V> cVar2 = new o.b.c<>(d10, cVar);
            bVar.f45037e++;
            o.b.c<D<? super T>, AbstractC1382z<T>.d> cVar3 = bVar.f45035c;
            if (cVar3 == 0) {
                bVar.f45034b = cVar2;
                bVar.f45035c = cVar2;
            } else {
                cVar3.f45040d = cVar2;
                cVar2.f45041e = cVar3;
                bVar.f45035c = cVar2;
            }
            dVar = null;
        }
        AbstractC1382z<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.e(interfaceC1376t)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        interfaceC1376t.getLifecycle().a(cVar);
    }

    public void f(D<? super T> d10) {
        AbstractC1382z<T>.d dVar;
        a("observeForever");
        b bVar = new b(d10);
        p173o.b<D<? super T>, AbstractC1382z<T>.d> bVar2 = this.f17841b;
        o.b.c<D<? super T>, AbstractC1382z<T>.d> cVarD = bVar2.d(d10);
        if (cVarD != null) {
            dVar = cVarD.f45039c;
        } else {
            o.b.c<K, V> cVar = new o.b.c<>(d10, bVar);
            bVar2.f45037e++;
            o.b.c<D<? super T>, AbstractC1382z<T>.d> cVar2 = bVar2.f45035c;
            if (cVar2 == 0) {
                bVar2.f45034b = cVar;
                bVar2.f45035c = cVar;
            } else {
                cVar2.f45040d = cVar;
                cVar.f45041e = cVar2;
                bVar2.f45035c = cVar;
            }
            dVar = null;
        }
        AbstractC1382z<T>.d dVar2 = dVar;
        if (dVar2 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        bVar.a(true);
    }

    public void i(D<? super T> d10) {
        a("removeObserver");
        AbstractC1382z<T>.d dVarE = this.f17841b.e(d10);
        if (dVarE == null) {
            return;
        }
        dVarE.d();
        dVarE.a(false);
    }

    public void j(T t8) {
        a("setValue");
        this.f17846g++;
        this.f17844e = t8;
        c(null);
    }

    public AbstractC1382z() {
        this.f17840a = new Object();
        this.f17841b = new p173o.b<>();
        this.f17842c = 0;
        Object obj = f17839k;
        this.f17845f = obj;
        this.j = new a();
        this.f17844e = obj;
        this.f17846g = -1;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$d */
    /* JADX INFO: compiled from: LiveData.java */
    public abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D<? super T> f17852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17854d = -1;

        public d(D<? super T> d10) {
            this.f17852b = d10;
        }

        public final void a(boolean z10) {
            if (z10 == this.f17853c) {
                return;
            }
            this.f17853c = z10;
            int i10 = z10 ? 1 : -1;
            AbstractC1382z abstractC1382z = AbstractC1382z.this;
            int i11 = abstractC1382z.f17842c;
            abstractC1382z.f17842c = i10 + i11;
            if (!abstractC1382z.f17843d) {
                abstractC1382z.f17843d = true;
                while (true) {
                    try {
                        int i12 = abstractC1382z.f17842c;
                        if (i11 == i12) {
                            break;
                        }
                        boolean z11 = i11 == 0 && i12 > 0;
                        boolean z12 = i11 > 0 && i12 == 0;
                        if (z11) {
                            abstractC1382z.g();
                        } else if (z12) {
                            abstractC1382z.h();
                        }
                        i11 = i12;
                    } catch (Throwable th) {
                        abstractC1382z.f17843d = false;
                        throw th;
                    }
                }
                abstractC1382z.f17843d = false;
            }
            if (this.f17853c) {
                abstractC1382z.c(this);
            }
        }

        public boolean e(InterfaceC1376t interfaceC1376t) {
            return false;
        }

        public abstract boolean f();

        public void d() {
        }
    }

    public void g() {
    }

    public void h() {
    }
}
