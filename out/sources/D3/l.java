package D3;

import com.obdeleven.service.model.ControlUnit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Jobs.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements p191p5.c, p109i8.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2765c;

    public /* synthetic */ l(int i10, Object obj) {
        this.f2764b = i10;
        this.f2765c = obj;
    }

    @Override // p109i8.l
    public boolean b() {
        ControlUnit controlUnit = (ControlUnit) this.f2765c;
        for (com.obdeleven.service.model.f fVar : controlUnit.f29336s.values()) {
            List list = (List) fVar.f29425C.get(controlUnit.n());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (fVar.f29426D.c(((Integer) it.next()).intValue()).f42670b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p109i8.l
    public boolean c() {
        ControlUnit controlUnit = (ControlUnit) this.f2765c;
        for (com.obdeleven.service.model.f fVar : controlUnit.f29336s.values()) {
            List<Integer> list = (List) fVar.f29425C.get(controlUnit.n());
            if (list != null) {
                for (Integer num : list) {
                    if (fVar.f29426D.c(num.intValue()).f42670b || fVar.f29426D.c(num.intValue()).f42671c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p109i8.l
    public boolean d() {
        ControlUnit controlUnit = (ControlUnit) this.f2765c;
        for (com.obdeleven.service.model.f fVar : controlUnit.f29336s.values()) {
            List list = (List) fVar.f29425C.get(controlUnit.n());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (fVar.f29426D.c(((Integer) it.next()).intValue()).f42671c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p191p5.c
    public void e(p191p5.g gVar) {
        ((CountDownLatch) this.f2765c).countDown();
    }

    public String toString() {
        switch (this.f2764b) {
            case 4:
                return B7.b.g(new StringBuilder("<"), (String) this.f2765c, '>');
            default:
                return super.toString();
        }
    }

    public l(int i10) {
        this.f2764b = i10;
        switch (i10) {
            case 5:
                break;
            default:
                this.f2765c = new HashMap();
                new HashMap();
                break;
        }
    }

    @Override // p109i8.l
    public void a(boolean z10) {
    }

    @Override // p109i8.l
    public void f(boolean z10) {
    }

    @Override // p109i8.l
    public void g(boolean z10) {
    }
}
