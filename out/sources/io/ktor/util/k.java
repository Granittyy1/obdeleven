package io.ktor.util;

import Ia.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p293xa.r;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: compiled from: StringValues.kt */
    public static final class a {
        public static void a(k kVar, p<? super String, ? super List<String>, r> pVar) {
            Iterator<T> it = kVar.a().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                pVar.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }
    }

    Set<Map.Entry<String, List<String>>> a();

    boolean b();

    void c(p<? super String, ? super List<String>, r> pVar);

    String get(String str);

    boolean isEmpty();
}
