package retrofit2;

import androidx.fragment.app.RunnableC1340e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p318zb.I;

/* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorC2787a f46690a;

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f46691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f46692b;

        public a(Type type, Executor executor) {
            this.f46691a = type;
            this.f46692b = executor;
        }

        @Override // retrofit2.e
        public final d<?> adapt(d<Object> dVar) {
            Executor executor = this.f46692b;
            return executor == null ? dVar : new b(executor, dVar);
        }

        @Override // retrofit2.e
        public final Type responseType() {
            return this.f46691a;
        }
    }

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f46693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d<T> f46694c;

        /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
        public class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f46695a;

            public a(f fVar) {
                this.f46695a = fVar;
            }

            @Override // retrofit2.f
            public final void onFailure(d<T> dVar, Throwable th) {
                b.this.f46693b.execute(new D7.j(this, this.f46695a, th, 1));
            }

            @Override // retrofit2.f
            public final void onResponse(d<T> dVar, v<T> vVar) {
                b.this.f46693b.execute(new RunnableC1340e(this, this.f46695a, vVar, 2));
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.f46693b = executor;
            this.f46694c = dVar;
        }

        @Override // retrofit2.d
        public final void cancel() {
            this.f46694c.cancel();
        }

        @Override // retrofit2.d
        public final void enqueue(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f46694c.enqueue(new a(fVar));
        }

        @Override // retrofit2.d
        public final boolean isCanceled() {
            return this.f46694c.isCanceled();
        }

        @Override // retrofit2.d
        public final boolean isExecuted() {
            return this.f46694c.isExecuted();
        }

        @Override // retrofit2.d
        public final okhttp3.u request() {
            return this.f46694c.request();
        }

        @Override // retrofit2.d
        public final I timeout() {
            return this.f46694c.timeout();
        }

        @Override // retrofit2.d
        /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] */
        public final d<T> clone() {
            return new b(this.f46693b, this.f46694c.m58clone());
        }
    }

    public i(ExecutorC2787a executorC2787a) {
        this.f46690a = executorC2787a;
    }

    @Override // retrofit2.e.a
    public final e<?, ?> get(Type type, Annotation[] annotationArr, w wVar) {
        if (e.a.getRawType(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(A.d(0, (ParameterizedType) type), A.h(annotationArr, y.class) ? null : this.f46690a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
