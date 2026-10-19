package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: SchemaCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f43989a = new ConcurrentHashMap(16);

    /* JADX INFO: compiled from: SchemaCache.kt */
    public static final class a<T> {
    }

    public final <T> T a(p011ab.e descriptor, a<T> aVar) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        Map map = (Map) this.f43989a.get(descriptor);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }
}
