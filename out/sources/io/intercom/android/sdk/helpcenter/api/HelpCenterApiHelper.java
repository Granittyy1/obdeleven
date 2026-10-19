package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.Injector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HelpCenterApi.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterApiHelper {
    public static final int $stable = 0;
    public static final HelpCenterApiHelper INSTANCE = new HelpCenterApiHelper();

    private HelpCenterApiHelper() {
    }

    public final Map<String, String> addDefaultOptions() {
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map);
        i.d(map, "apply(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.n(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
