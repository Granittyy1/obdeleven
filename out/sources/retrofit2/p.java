package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends q<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f46727a;

    public p(q qVar) {
        this.f46727a = qVar;
    }

    @Override // retrofit2.q
    public final void a(t tVar, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f46727a.a(tVar, Array.get(obj, i10));
        }
    }
}
