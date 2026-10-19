package H3;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class o extends X3.g<p.a<Object>, Object> {
    @Override // X3.g
    public final void c(p.a<Object> aVar, Object obj) {
        p.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = p.a.f3665b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
