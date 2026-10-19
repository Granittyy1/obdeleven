package io.ktor.http;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends io.ktor.util.m implements g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Map<String, ? extends List<String>> values) {
        super(values);
        kotlin.jvm.internal.i.e(values, "values");
    }

    public final String toString() {
        return "Headers " + a();
    }
}
