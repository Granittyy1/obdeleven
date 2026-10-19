package R2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: R2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EnqueueUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0753f {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, K2.y continuation) {
        int i10;
        kotlin.jvm.internal.i.e(workDatabase, "workDatabase");
        kotlin.jvm.internal.i.e(configuration, "configuration");
        kotlin.jvm.internal.i.e(continuation, "continuation");
        ArrayList arrayListT = kotlin.collections.l.t(continuation);
        int i11 = 0;
        while (!arrayListT.isEmpty()) {
            List<? extends androidx.work.p> list = ((K2.y) kotlin.collections.p.E(arrayListT)).f4236e;
            kotlin.jvm.internal.i.d(list, "current.work");
            List<? extends androidx.work.p> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (!((androidx.work.p) it.next()).f20467b.j.f20348h.isEmpty() && (i10 = i10 + 1) < 0) {
                        kotlin.collections.l.w();
                        throw null;
                    }
                }
            }
            i11 += i10;
        }
        if (i11 == 0) {
            return;
        }
        int iY = workDatabase.t().y();
        int i12 = iY + i11;
        int i13 = configuration.f20337i;
        if (i12 > i13) {
            throw new IllegalArgumentException(p005a4.q.c(B6.a.a("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", i13, iY), i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }
}
