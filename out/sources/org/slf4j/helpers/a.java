package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BasicMDCAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends InheritableThreadLocal<Map<String, String>> {
    @Override // java.lang.InheritableThreadLocal
    public final Map<String, String> childValue(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (map2 == null) {
            return null;
        }
        return new HashMap(map2);
    }
}
