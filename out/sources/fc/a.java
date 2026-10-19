package fc;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.A;
import okhttp3.y;
import retrofit2.h;
import retrofit2.w;

/* JADX INFO: compiled from: GsonConverterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f35074a;

    public a(Gson gson) {
        this.f35074a = gson;
    }

    @Override // retrofit2.h.a
    public final h<?, y> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        L7.a<?> aVar = L7.a.get(type);
        Gson gson = this.f35074a;
        return new b(gson, gson.e(aVar));
    }

    @Override // retrofit2.h.a
    public final h<A, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        L7.a<?> aVar = L7.a.get(type);
        Gson gson = this.f35074a;
        return new c(gson, gson.e(aVar));
    }
}
