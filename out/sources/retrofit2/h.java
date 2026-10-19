package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface h<F, T> {

    /* JADX INFO: compiled from: Converter.java */
    public static abstract class a {
        public h<?, okhttp3.y> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
            return null;
        }

        public h<okhttp3.A, ?> b(Type type, Annotation[] annotationArr, w wVar) {
            return null;
        }
    }

    T b(F f10) throws IOException;
}
