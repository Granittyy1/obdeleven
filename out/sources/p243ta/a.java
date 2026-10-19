package p243ta;

import java.util.concurrent.Callable;
import p123ja.o;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f47355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f47356b;

    /* JADX INFO: renamed from: ta.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Schedulers.java */
    public static final class C0538a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final io.reactivex.internal.schedulers.a f47357a = new io.reactivex.internal.schedulers.a();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class b implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public final o call() throws Exception {
            return C0538a.f47357a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class c implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public final o call() throws Exception {
            return d.f47358a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final io.reactivex.internal.schedulers.b f47358a = new io.reactivex.internal.schedulers.b();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final io.reactivex.internal.schedulers.c f47359a = new io.reactivex.internal.schedulers.c();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class f implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public final o call() throws Exception {
            return e.f47359a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final io.reactivex.internal.schedulers.f f47360a = new io.reactivex.internal.schedulers.f();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class h implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public final o call() throws Exception {
            return g.f47360a;
        }
    }

    static {
        p231sa.a.a(new h());
        f47355a = p231sa.a.a(new b());
        f47356b = p231sa.a.a(new c());
        int i10 = io.reactivex.internal.schedulers.g.f40941a;
        p231sa.a.a(new f());
    }
}
