package p257ub;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.y;
import okhttp3.t;
import p184ob.d;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f47503a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f47504b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = t.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(t.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(rb.c.class.getName(), "okhttp.Http2");
        linkedHashMap.put(d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f47504b = y.x(linkedHashMap);
    }
}
