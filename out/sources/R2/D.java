package R2;

import Q2.C0742t;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: WorkProgressUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public final class D implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f5207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.d f5208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f5209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f5210e;

    public D(E e10, UUID uuid, androidx.work.d dVar, androidx.work.impl.utils.futures.a aVar) {
        this.f5210e = e10;
        this.f5207b = uuid;
        this.f5208c = dVar;
        this.f5209d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.utils.futures.a aVar = this.f5209d;
        UUID uuid = this.f5207b;
        String string = uuid.toString();
        androidx.work.k kVarC = androidx.work.k.c();
        String str = E.f5211c;
        Objects.toString(uuid);
        androidx.work.d dVar = this.f5208c;
        Objects.toString(dVar);
        kVarC.getClass();
        E e10 = this.f5210e;
        WorkDatabase workDatabase = e10.f5212a;
        WorkDatabase workDatabase2 = e10.f5212a;
        workDatabase.c();
        try {
            Q2.z zVarT = workDatabase2.t().t(string);
            if (zVarT == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (zVarT.f5037b == WorkInfo$State.f20307c) {
                workDatabase2.s().b(new C0742t(string, dVar));
            } else {
                androidx.work.k.c().getClass();
            }
            aVar.k(null);
            workDatabase2.m();
        } catch (Throwable th) {
            try {
                androidx.work.k.c().b(E.f5211c, "Error updating Worker progress", th);
                aVar.l(th);
            } finally {
                workDatabase2.j();
            }
        }
    }
}
