package bo.app;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: bo.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1459c extends n3 {
    public C1459c(List list) {
        super(list);
    }

    @Override // bo.app.f2
    public boolean a(x2 x2Var) {
        Iterator it = this.f21664b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!((f2) it.next()).a(x2Var)) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }
}
