package V7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.i;
import okhttp3.A;
import okhttp3.r;
import okhttp3.y;
import p050db.AbstractC2184a;
import p114j1.C2479a;
import retrofit2.h;
import retrofit2.w;

/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f6732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f6733b;

    public b(r rVar, d.a aVar) {
        this.f6732a = rVar;
        this.f6733b = aVar;
    }

    @Override // retrofit2.h.a
    public final h<?, y> a(Type type, Annotation[] annotationArr, Annotation[] methodAnnotations, w retrofit) {
        i.e(type, "type");
        i.e(methodAnnotations, "methodAnnotations");
        i.e(retrofit, "retrofit");
        d.a aVar = this.f6733b;
        aVar.getClass();
        return new c(this.f6732a, C2479a.n(((AbstractC2184a) aVar.a()).c(), type), aVar);
    }

    @Override // retrofit2.h.a
    public final h<A, ?> b(Type type, Annotation[] annotations, w retrofit) {
        i.e(type, "type");
        i.e(annotations, "annotations");
        i.e(retrofit, "retrofit");
        d.a serializer = this.f6733b;
        serializer.getClass();
        Ya.b bVarN = C2479a.n(((AbstractC2184a) serializer.a()).c(), type);
        i.e(serializer, "serializer");
        a aVar = new a();
        aVar.f6730b = bVarN;
        aVar.f6731c = serializer;
        return aVar;
    }
}
