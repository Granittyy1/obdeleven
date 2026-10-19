package androidx.work.impl.workers;

import K2.K;
import Q2.A;
import Q2.InterfaceC0733j;
import Q2.InterfaceC0740q;
import Q2.V;
import T2.b;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.j;
import androidx.work.k;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DiagnosticsWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        i.e(context, "context");
        i.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final j.a.c b() {
        K kB = K.b(getApplicationContext());
        i.d(kB, "getInstance(applicationContext)");
        WorkDatabase workDatabase = kB.f4146c;
        i.d(workDatabase, "workManager.workDatabase");
        A aT = workDatabase.t();
        InterfaceC0740q interfaceC0740qR = workDatabase.r();
        V vU = workDatabase.u();
        InterfaceC0733j interfaceC0733jQ = workDatabase.q();
        kB.f4145b.f20331c.getClass();
        ArrayList arrayListG = aT.g(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListO = aT.o();
        ArrayList arrayListC = aT.c();
        if (!arrayListG.isEmpty()) {
            k kVarC = k.c();
            int i10 = b.f5799a;
            kVarC.getClass();
            k kVarC2 = k.c();
            b.a(interfaceC0740qR, vU, interfaceC0733jQ, arrayListG);
            kVarC2.getClass();
        }
        if (!arrayListO.isEmpty()) {
            k kVarC3 = k.c();
            int i11 = b.f5799a;
            kVarC3.getClass();
            k kVarC4 = k.c();
            b.a(interfaceC0740qR, vU, interfaceC0733jQ, arrayListO);
            kVarC4.getClass();
        }
        if (!arrayListC.isEmpty()) {
            k kVarC5 = k.c();
            int i12 = b.f5799a;
            kVarC5.getClass();
            k kVarC6 = k.c();
            b.a(interfaceC0740qR, vU, interfaceC0733jQ, arrayListC);
            kVarC6.getClass();
        }
        return new j.a.c();
    }
}
