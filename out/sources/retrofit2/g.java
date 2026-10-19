package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends e.a {

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    public static final class a<R> implements e<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f46685a;

        /* JADX INFO: renamed from: retrofit2.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        public class C0529a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f46686a;

            public C0529a(b bVar) {
                this.f46686a = bVar;
            }

            @Override // retrofit2.f
            public final void onFailure(d<R> dVar, Throwable th) {
                this.f46686a.completeExceptionally(th);
            }

            @Override // retrofit2.f
            public final void onResponse(d<R> dVar, v<R> vVar) {
                boolean zH = vVar.f46822a.h();
                b bVar = this.f46686a;
                if (zH) {
                    bVar.complete(vVar.f46823b);
                } else {
                    bVar.completeExceptionally(new HttpException(vVar));
                }
            }
        }

        public a(Type type) {
            this.f46685a = type;
        }

        @Override // retrofit2.e
        public final Object adapt(d dVar) {
            m mVar = (m) dVar;
            b bVar = new b(mVar);
            mVar.enqueue(new C0529a(bVar));
            return bVar;
        }

        @Override // retrofit2.e
        public final Type responseType() {
            return this.f46685a;
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f46687b;

        public b(m mVar) {
            this.f46687b = mVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f46687b.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    public static final class c<R> implements e<R, CompletableFuture<v<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f46688a;

        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        public class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f46689a;

            public a(b bVar) {
                this.f46689a = bVar;
            }

            @Override // retrofit2.f
            public final void onFailure(d<R> dVar, Throwable th) {
                this.f46689a.completeExceptionally(th);
            }

            @Override // retrofit2.f
            public final void onResponse(d<R> dVar, v<R> vVar) {
                this.f46689a.complete(vVar);
            }
        }

        public c(Type type) {
            this.f46688a = type;
        }

        @Override // retrofit2.e
        public final Object adapt(d dVar) {
            m mVar = (m) dVar;
            b bVar = new b(mVar);
            mVar.enqueue(new a(bVar));
            return bVar;
        }

        @Override // retrofit2.e
        public final Type responseType() {
            return this.f46688a;
        }
    }

    @Override // retrofit2.e.a
    public final e<?, ?> get(Type type, Annotation[] annotationArr, w wVar) {
        if (e.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = e.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (e.a.getRawType(parameterUpperBound) != v.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
