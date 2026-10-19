package Nb;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final void a(List list, LinkedHashSet linkedHashSet) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            linkedHashSet.add(aVar);
            a(aVar.f4707f, linkedHashSet);
        }
    }
}
