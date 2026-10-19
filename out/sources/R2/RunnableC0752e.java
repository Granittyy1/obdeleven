package R2;

import K2.C0722o;
import K2.K;
import Q2.C0724a;
import Q2.C0739p;
import Q2.InterfaceC0725b;
import Q2.InterfaceC0740q;
import Q2.V;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: R2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EnqueueRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0752e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5225d = androidx.work.k.d("EnqueueRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K2.y f5226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0722o f5227c;

    public RunnableC0752e(K2.y yVar) {
        C0722o c0722o = new C0722o();
        this.f5226b = yVar;
        this.f5227c = c0722o;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    public static boolean a(K2.y yVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        yVar.getClass();
        String[] strArr = (String[]) K2.y.i0(yVar).toArray(new String[0]);
        K k10 = yVar.f4234c;
        k10.f4145b.f20331c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z20 = strArr != null && strArr.length > 0;
        WorkInfo$State workInfo$State = WorkInfo$State.f20308d;
        WorkInfo$State workInfo$State2 = WorkInfo$State.f20311g;
        WorkInfo$State workInfo$State3 = WorkInfo$State.f20309e;
        WorkDatabase workDatabase = k10.f4146c;
        if (z20) {
            int length = strArr.length;
            int i10 = 0;
            z11 = false;
            z12 = false;
            z10 = true;
            while (true) {
                if (i10 < length) {
                    String str = strArr[i10];
                    Q2.z zVarT = workDatabase.t().t(str);
                    if (zVarT == null) {
                        androidx.work.k.c().a(f5225d, androidx.compose.foundation.gestures.d.b("Prerequisite ", str, " doesn't exist; not enqueuing"));
                    } else {
                        WorkInfo$State workInfo$State4 = zVarT.f5037b;
                        z10 &= workInfo$State4 == workInfo$State;
                        if (workInfo$State4 == workInfo$State3) {
                            z12 = true;
                        } else if (workInfo$State4 == workInfo$State2) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                z19 = true;
                z18 = false;
                yVar.f4239h = z19;
                return z18;
            }
        }
        z10 = true;
        z11 = false;
        z12 = false;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        WorkInfo$State workInfo$State5 = WorkInfo$State.f20306b;
        if (zIsEmpty || z20) {
            z13 = zIsEmpty;
            z14 = z10;
            z15 = z11;
            z16 = z20;
            z17 = z14;
            z11 = z15;
            z18 = false;
        } else {
            ArrayList arrayListI = workDatabase.t().i();
            if (arrayListI.isEmpty()) {
                z13 = zIsEmpty;
                z14 = z10;
                z15 = z11;
                z16 = z20;
            } else {
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.f20293c;
                boolean z21 = z20;
                ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.f20294d;
                z14 = z10;
                ExistingWorkPolicy existingWorkPolicy3 = yVar.f4235d;
                if (existingWorkPolicy3 == existingWorkPolicy || existingWorkPolicy3 == existingWorkPolicy2) {
                    InterfaceC0725b interfaceC0725bO = workDatabase.o();
                    z15 = z11;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListI.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        Q2.z.a aVar = (Q2.z.a) it.next();
                        boolean z22 = zIsEmpty;
                        if (!interfaceC0725bO.d(aVar.f5058a)) {
                            WorkInfo$State workInfo$State6 = aVar.f5059b;
                            boolean z23 = z14 & (workInfo$State6 == workInfo$State);
                            if (workInfo$State6 == workInfo$State3) {
                                z12 = true;
                            } else if (workInfo$State6 == workInfo$State2) {
                                z15 = true;
                            }
                            arrayList.add(aVar.f5058a);
                            z14 = z23;
                        }
                        it = it2;
                        zIsEmpty = z22;
                    }
                    z13 = zIsEmpty;
                    List listEmptyList = arrayList;
                    listEmptyList = arrayList;
                    if (existingWorkPolicy3 == existingWorkPolicy2 && (z15 || z12)) {
                        Q2.A aT = workDatabase.t();
                        Iterator it3 = aT.i().iterator();
                        while (it3.hasNext()) {
                            aT.a(((Q2.z.a) it3.next()).f5058a);
                        }
                        z12 = false;
                        z15 = false;
                        listEmptyList = Collections.emptyList();
                    }
                    strArr = (String[]) listEmptyList.toArray(strArr);
                    z16 = strArr.length > 0;
                } else {
                    if (existingWorkPolicy3 == ExistingWorkPolicy.f20292b) {
                        Iterator it4 = arrayListI.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                WorkInfo$State workInfo$State7 = ((Q2.z.a) it4.next()).f5059b;
                                if (workInfo$State7 == workInfo$State5 || workInfo$State7 == WorkInfo$State.f20307c) {
                                    z19 = true;
                                    z18 = false;
                                    yVar.f4239h = z19;
                                    return z18;
                                }
                            }
                        }
                    }
                    new C0750c(k10).run();
                    Q2.A aT2 = workDatabase.t();
                    Iterator it5 = arrayListI.iterator();
                    while (it5.hasNext()) {
                        aT2.a(((Q2.z.a) it5.next()).f5058a);
                    }
                    z13 = zIsEmpty;
                    z16 = z21;
                    z17 = z14;
                    z18 = true;
                }
            }
            z17 = z14;
            z11 = z15;
            z18 = false;
        }
        for (androidx.work.p pVar : yVar.f4236e) {
            Q2.z zVar = pVar.f20467b;
            if (!z16 || z17) {
                zVar.f5048n = jCurrentTimeMillis;
            } else if (z12) {
                zVar.f5037b = workInfo$State3;
            } else if (z11) {
                zVar.f5037b = workInfo$State2;
            } else {
                zVar.f5037b = WorkInfo$State.f20310f;
            }
            if (zVar.f5037b == workInfo$State5) {
                z18 = true;
            }
            Q2.A aT3 = workDatabase.t();
            long j = jCurrentTimeMillis;
            List<K2.t> schedulers = k10.f4148e;
            kotlin.jvm.internal.i.e(schedulers, "schedulers");
            aT3.d(zVar);
            UUID uuid = pVar.f20466a;
            if (z16) {
                int length2 = strArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    K k11 = k10;
                    String str2 = strArr[i11];
                    int i12 = length2;
                    String string = uuid.toString();
                    kotlin.jvm.internal.i.d(string, "id.toString()");
                    workDatabase.o().b(new C0724a(string, str2));
                    i11++;
                    k10 = k11;
                    strArr = strArr;
                    length2 = i12;
                }
            }
            String[] strArr2 = strArr;
            K k12 = k10;
            V vU = workDatabase.u();
            String string2 = uuid.toString();
            kotlin.jvm.internal.i.d(string2, "id.toString()");
            vU.d(string2, pVar.f20468c);
            if (!z13) {
                InterfaceC0740q interfaceC0740qR = workDatabase.r();
                String string3 = uuid.toString();
                kotlin.jvm.internal.i.d(string3, "id.toString()");
                interfaceC0740qR.a(new C0739p(string3));
            }
            z18 = z18;
            jCurrentTimeMillis = j;
            k10 = k12;
            strArr = strArr2;
        }
        z19 = true;
        yVar.f4239h = z19;
        return z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        C0722o c0722o = this.f5227c;
        K2.y yVar = this.f5226b;
        try {
            yVar.getClass();
            K k10 = yVar.f4234c;
            HashSet hashSet = new HashSet();
            hashSet.addAll(yVar.f4237f);
            HashSet hashSetI0 = K2.y.i0(yVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(yVar.f4237f);
                    z10 = false;
                    break;
                } else if (hashSetI0.contains((String) it.next())) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                throw new IllegalStateException("WorkContinuation has cycles (" + yVar + ")");
            }
            WorkDatabase workDatabase = k10.f4146c;
            workDatabase.c();
            try {
                C0753f.a(workDatabase, k10.f4145b, yVar);
                boolean zA = a(yVar);
                workDatabase.m();
                workDatabase.j();
                if (zA) {
                    q.a(k10.f4144a, RescheduleReceiver.class, true);
                    K2.w.b(k10.f4145b, k10.f4146c, k10.f4148e);
                }
                c0722o.a(androidx.work.n.f20463a);
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        } catch (Throwable th2) {
            c0722o.a(new androidx.work.n.a.C0204a(th2));
        }
    }
}
