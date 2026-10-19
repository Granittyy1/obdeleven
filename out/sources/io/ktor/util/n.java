package io.ktor.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final void a(l lVar, l builder) {
        kotlin.jvm.internal.i.e(lVar, "<this>");
        kotlin.jvm.internal.i.e(builder, "builder");
        Iterator<T> it = builder.a().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            lVar.b((String) entry.getKey(), (List) entry.getValue());
        }
    }
}
