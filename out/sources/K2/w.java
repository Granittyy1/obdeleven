package K2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4232a = 0;

    static {
        androidx.work.k.d("Schedulers");
    }

    public static void a(Q2.A a10, F8.a aVar, List list) {
        if (list.size() > 0) {
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a10.f(jCurrentTimeMillis, ((Q2.z) it.next()).f5036a);
            }
        }
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Q2.A aT = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList arrayListR = aT.r();
            a(aT, aVar.f20331c, arrayListR);
            ArrayList arrayListH = aT.h(aVar.j);
            a(aT, aVar.f20331c, arrayListH);
            arrayListH.addAll(arrayListR);
            ArrayList arrayListC = aT.c();
            workDatabase.m();
            workDatabase.j();
            if (arrayListH.size() > 0) {
                Q2.z[] zVarArr = (Q2.z[]) arrayListH.toArray(new Q2.z[arrayListH.size()]);
                for (t tVar : list) {
                    if (tVar.c()) {
                        tVar.e(zVarArr);
                    }
                }
            }
            if (arrayListC.size() > 0) {
                Q2.z[] zVarArr2 = (Q2.z[]) arrayListC.toArray(new Q2.z[arrayListC.size()]);
                for (t tVar2 : list) {
                    if (!tVar2.c()) {
                        tVar2.e(zVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
