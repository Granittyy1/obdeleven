package qa;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p033c7.C1491d;
import p033c7.D;

/* JADX INFO: compiled from: Functions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f46188a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f46189b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f46190c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f46191d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f46192e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f46193f = new j();

    /* JADX INFO: renamed from: qa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Functions.java */
    public static final class C0521a<T1, T2, R> implements p183oa.c<Object[], R> {
        @Override // p183oa.c, p311z4.f
        public final Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return new C1491d((String) objArr[0], (p108i7.f) objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class e<T> implements p183oa.d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46194b;

        public e(String str) {
            this.f46194b = str;
        }

        @Override // p183oa.d
        public final boolean a(T t8) throws Exception {
            String str = this.f46194b;
            return t8 == str || (t8 != null && t8.equals(str));
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class g<T, U> implements Callable<U>, p183oa.c<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final U f46195b;

        public g(U u10) {
            this.f46195b = u10;
        }

        @Override // p183oa.c, p311z4.f
        public final U apply(T t8) throws Exception {
            return this.f46195b;
        }

        @Override // java.util.concurrent.Callable
        public final U call() throws Exception {
            return this.f46195b;
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class h<T> implements p183oa.c<List<T>, List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D f46196b;

        public h(D d10) {
            this.f46196b = d10;
        }

        @Override // p183oa.c, p311z4.f
        public final Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.f46196b);
            return list;
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class i implements p183oa.b<Throwable> {
        @Override // p183oa.b
        public final void a(Throwable th) throws Exception {
            p231sa.a.c(new OnErrorNotImplementedException(th));
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class j implements p183oa.d<Object> {
        @Override // p183oa.d
        public final boolean a(Object obj) {
            return true;
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class b implements p183oa.a {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // p183oa.a
        public final void run() {
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class d implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class c implements p183oa.b<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        @Override // p183oa.b
        public final void a(Object obj) {
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    public static final class f implements p183oa.c<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // p183oa.c, p311z4.f
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
