package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.B;
import p318zb.C2839f;

/* JADX INFO: compiled from: BuiltInConverters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends h.a {

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class a implements h<okhttp3.A, okhttp3.A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f46679b = new a();

        @Override // retrofit2.h
        public final okhttp3.A b(okhttp3.A a10) throws IOException {
            okhttp3.A a11 = a10;
            try {
                C2839f c2839f = new C2839f();
                a11.h().o(c2839f);
                return new B(a11.c(), a11.b(), c2839f);
            } finally {
                a11.close();
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class C0528b implements h<okhttp3.y, okhttp3.y> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0528b f46680b = new C0528b();

        @Override // retrofit2.h
        public final okhttp3.y b(okhttp3.y yVar) throws IOException {
            return yVar;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class c implements h<okhttp3.A, okhttp3.A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f46681b = new c();

        @Override // retrofit2.h
        public final okhttp3.A b(okhttp3.A a10) throws IOException {
            return a10;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f46682b = new d();

        @Override // retrofit2.h
        public final String b(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class e implements h<okhttp3.A, p293xa.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f46683b = new e();

        @Override // retrofit2.h
        public final p293xa.r b(okhttp3.A a10) throws IOException {
            a10.close();
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class f implements h<okhttp3.A, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f46684b = new f();

        @Override // retrofit2.h
        public final Void b(okhttp3.A a10) throws IOException {
            a10.close();
            return null;
        }
    }

    @Override // retrofit2.h.a
    public final h<?, okhttp3.y> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        if (okhttp3.y.class.isAssignableFrom(A.e(type))) {
            return C0528b.f46680b;
        }
        return null;
    }

    @Override // retrofit2.h.a
    public final h<okhttp3.A, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (type == okhttp3.A.class) {
            return A.h(annotationArr, gc.w.class) ? c.f46681b : a.f46679b;
        }
        if (type == Void.class) {
            return f.f46684b;
        }
        if (A.i(type)) {
            return e.f46683b;
        }
        return null;
    }
}
