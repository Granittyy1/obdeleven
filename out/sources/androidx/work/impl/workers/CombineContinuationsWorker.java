package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.j;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CombineContinuationsWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        i.e(context, "context");
        i.e(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public final j.a.c b() {
        return new j.a.c(getInputData());
    }
}
