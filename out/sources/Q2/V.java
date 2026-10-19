package Q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: WorkTagDao.kt */
/* JADX INFO: loaded from: classes.dex */
public interface V {
    void b(U u10);

    ArrayList c(String str);

    default void d(String str, Set<String> tags) {
        kotlin.jvm.internal.i.e(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            b(new U((String) it.next(), str));
        }
    }
}
