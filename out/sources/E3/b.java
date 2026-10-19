package E3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements p154m3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3048c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f3047b = i10;
        this.f3048c = obj;
    }

    public abstract void A();

    public abstract void C();

    public boolean D(Level level) {
        return ((Level) this.f3048c).compareTo(level) <= 0;
    }

    public void E(Level level, String msg) {
        kotlin.jvm.internal.i.e(msg, "msg");
        if (D(level)) {
            l(level, msg);
        }
    }

    public void F(j jVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3048c;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(jVar);
        }
    }

    public void G(Object obj, boolean z10) {
        Set set = (Set) this.f3048c;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                A();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            C();
        }
    }

    @Override // p154m3.k
    public List e() {
        return (List) this.f3048c;
    }

    public void g(String msg) {
        kotlin.jvm.internal.i.e(msg, "msg");
        E(Level.f45768b, msg);
    }

    @Override // p154m3.k
    public boolean k() {
        List list = (List) this.f3048c;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((p225s3.a) list.get(0)).c();
    }

    public abstract void l(Level level, String str);

    public String toString() {
        switch (this.f3047b) {
            case 5:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f3048c;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(int i10) {
        this.f3047b = i10;
        switch (i10) {
            case 2:
                break;
            case 3:
            default:
                char[] cArr = X3.j.f7214a;
                this.f3048c = new ArrayDeque(20);
                break;
            case 4:
                this.f3048c = Collections.newSetFromMap(new IdentityHashMap());
                break;
        }
    }

    public b(Level level) {
        this.f3047b = 1;
        kotlin.jvm.internal.i.e(level, "level");
        this.f3048c = level;
    }
}
