package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: CallAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface e<R, T> {

    /* JADX INFO: compiled from: CallAdapter.java */
    public static abstract class a {
        public static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return A.d(i10, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return A.e(type);
        }

        public abstract e<?, ?> get(Type type, Annotation[] annotationArr, w wVar);
    }

    T adapt(d<R> dVar);

    Type responseType();
}
