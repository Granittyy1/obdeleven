package retrofit2;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends q<Iterable<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f46726a;

    public o(q qVar) {
        this.f46726a = qVar;
    }

    @Override // retrofit2.q
    public final void a(t tVar, Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f46726a.a(tVar, it.next());
        }
    }
}
