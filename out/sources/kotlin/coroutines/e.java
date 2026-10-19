package kotlin.coroutines;

import Ia.p;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface e {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface a extends e {

        /* JADX INFO: renamed from: kotlin.coroutines.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class C0479a {
            public static <R> R a(a aVar, R r10, p<? super R, ? super a, ? extends R> operation) {
                i.e(operation, "operation");
                return operation.invoke(r10, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> key) {
                i.e(key, "key");
                if (i.a(aVar.getKey(), key)) {
                    return aVar;
                }
                return null;
            }

            public static e c(a aVar, b<?> key) {
                i.e(key, "key");
                return i.a(aVar.getKey(), key) ? EmptyCoroutineContext.f43032b : aVar;
            }

            public static e d(a aVar, e context) {
                i.e(context, "context");
                return context == EmptyCoroutineContext.f43032b ? aVar : (e) context.fold(aVar, CoroutineContext$plus$1.f43031h);
            }
        }

        b<?> getKey();
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface b<E extends a> {
    }

    <R> R fold(R r10, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    e minusKey(b<?> bVar);

    e plus(e eVar);
}
