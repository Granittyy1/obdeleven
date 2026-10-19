package io.intercom.android.sdk.helpcenter.utils.networking;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.i;
import retrofit2.d;
import retrofit2.e;
import retrofit2.w;

/* JADX INFO: compiled from: NetworkResponseAdapterFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseAdapterFactory extends e.a {
    public static final int $stable = 0;

    @Override // retrofit2.e.a
    public e<?, ?> get(Type returnType, Annotation[] annotations, w retrofit) {
        i.e(returnType, "returnType");
        i.e(annotations, "annotations");
        i.e(retrofit, "retrofit");
        if (!d.class.equals(e.a.getRawType(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>>");
        }
        Type parameterUpperBound = e.a.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!i.a(e.a.getRawType(parameterUpperBound), NetworkResponse.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        Type parameterUpperBound2 = e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        i.b(parameterUpperBound2);
        return new NetworkResponseAdapter(parameterUpperBound2);
    }
}
