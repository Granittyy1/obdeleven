package R2;

import K2.C0722o;
import K2.K;
import K2.P;
import Q2.InterfaceC0725b;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: R2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0751d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0722o f5224b = new C0722o();

    public static void a(K k10, String str) {
        P pB;
        WorkDatabase workDatabase = k10.f4146c;
        Q2.A aT = workDatabase.t();
        InterfaceC0725b interfaceC0725bO = workDatabase.o();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo$State workInfo$StateS = aT.s(str2);
            if (workInfo$StateS != WorkInfo$State.f20308d && workInfo$StateS != WorkInfo$State.f20309e) {
                aT.v(str2);
            }
            linkedList.addAll(interfaceC0725bO.a(str2));
        }
        K2.r rVar = k10.f4149f;
        synchronized (rVar.f4221k) {
            androidx.work.k.c().getClass();
            rVar.f4220i.add(str);
            pB = rVar.b(str);
        }
        K2.r.d(pB, 1);
        Iterator<K2.t> it = k10.f4148e.iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        C0722o c0722o = this.f5224b;
        try {
            b();
            c0722o.a(androidx.work.n.f20463a);
        } catch (Throwable th) {
            c0722o.a(new androidx.work.n.a.C0204a(th));
        }
    }
}
