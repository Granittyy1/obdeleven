package io.intercom.android.sdk.utilities.extensions;

import java.util.Map;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MapExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MapExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V safeGetOrDefault(Map<K, ? extends V> map, K k10, V v10) {
        i.e(map, "<this>");
        return map.getOrDefault(k10, v10);
    }
}
