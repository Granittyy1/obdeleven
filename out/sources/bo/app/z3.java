package bo.app;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends n3 {
    public z3(List list) {
        super(list);
    }

    @Override // bo.app.f2
    public boolean a(x2 x2Var) {
        Iterator it = this.f21664b.iterator();
        while (it.hasNext()) {
            if (((f2) it.next()).a(x2Var)) {
                return true;
            }
        }
        return false;
    }
}
