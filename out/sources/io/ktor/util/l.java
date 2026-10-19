package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    Set<Map.Entry<String, List<String>>> a();

    void b(String str, Iterable<String> iterable);

    List<String> c(String str);

    Set<String> names();
}
