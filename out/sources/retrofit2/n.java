package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: compiled from: OptionalConverterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends h.a {

    /* JADX INFO: compiled from: OptionalConverterFactory.java */
    public static final class a<T> implements h<okhttp3.A, Optional<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h<okhttp3.A, T> f46725b;

        public a(h<okhttp3.A, T> hVar) {
            this.f46725b = hVar;
        }

        @Override // retrofit2.h
        public final Object b(okhttp3.A a10) throws IOException {
            return Optional.ofNullable(this.f46725b.b(a10));
        }
    }

    @Override // retrofit2.h.a
    public final h<okhttp3.A, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (A.e(type) != Optional.class) {
            return null;
        }
        return new a(wVar.d(A.d(0, (ParameterizedType) type), annotationArr));
    }
}
