package p114j1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p078g1.m;

/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p114j1.c f41023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f41024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<T> f41025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f41026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f41027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f41028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f41029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f41031i;

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t8);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface b<T> {
        void f(T t8, m mVar);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f41032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m.a f41033b = new m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f41034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f41035d;

        public c(T t8) {
            this.f41032a = t8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f41032a.equals(((c) obj).f41032a);
        }

        public final int hashCode() {
            return this.f41032a.hashCode();
        }
    }

    public j(Looper looper, p114j1.c cVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar, true);
    }

    public final void a(T t8) {
        t8.getClass();
        synchronized (this.f41029g) {
            try {
                if (this.f41030h) {
                    return;
                }
                this.f41026d.add(new c<>(t8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque<Runnable> arrayDeque = this.f41028f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        g gVar = this.f41024b;
        if (!gVar.b()) {
            gVar.a(gVar.f(1));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f41027e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i10, final a<T> aVar) {
        f();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f41026d);
        this.f41028f.add(new Runnable() { // from class: j1.i
            @Override // java.lang.Runnable
            public final void run() {
                for (j.c cVar : copyOnWriteArraySet) {
                    if (!cVar.f41035d) {
                        int i11 = i10;
                        if (i11 != -1) {
                            cVar.f41033b.a(i11);
                        }
                        cVar.f41034c = true;
                        aVar.invoke(cVar.f41032a);
                    }
                }
            }
        });
    }

    public final void d() {
        f();
        synchronized (this.f41029g) {
            this.f41030h = true;
        }
        for (c<T> cVar : this.f41026d) {
            b<T> bVar = this.f41025c;
            cVar.f41035d = true;
            if (cVar.f41034c) {
                cVar.f41034c = false;
                bVar.f(cVar.f41032a, cVar.f41033b.b());
            }
        }
        this.f41026d.clear();
    }

    public final void e(int i10, a<T> aVar) {
        c(i10, aVar);
        b();
    }

    public final void f() {
        if (this.f41031i) {
            p241t7.b.k(Thread.currentThread() == this.f41024b.l().getThread());
        }
    }

    public j(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, p114j1.c cVar, b<T> bVar, boolean z10) {
        this.f41023a = cVar;
        this.f41026d = copyOnWriteArraySet;
        this.f41025c = bVar;
        this.f41029g = new Object();
        this.f41027e = new ArrayDeque<>();
        this.f41028f = new ArrayDeque<>();
        this.f41024b = cVar.a(looper, new Handler.Callback() { // from class: j1.h
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                j jVar = this.f41019b;
                Iterator it = jVar.f41026d.iterator();
                while (it.hasNext()) {
                    j.c cVar2 = (j.c) it.next();
                    if (!cVar2.f41035d && cVar2.f41034c) {
                        m mVarB = cVar2.f41033b.b();
                        cVar2.f41033b = new m.a();
                        cVar2.f41034c = false;
                        jVar.f41025c.f(cVar2.f41032a, mVarB);
                    }
                    if (jVar.f41024b.b()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f41031i = z10;
    }
}
