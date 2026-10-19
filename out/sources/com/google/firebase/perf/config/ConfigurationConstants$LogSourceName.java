package com.google.firebase.perf.config;

import C.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigurationConstants$LogSourceName extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ConfigurationConstants$LogSourceName f28432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Long, String> f28433d = Collections.unmodifiableMap(new HashMap<Long, String>() { // from class: com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.1
        {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    });

    @Override // C.g
    public final String P() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
