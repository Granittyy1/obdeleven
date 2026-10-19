package androidx.work.impl.constraints;

import O2.n;
import Q2.z;
import androidx.work.impl.constraints.controllers.f;
import androidx.work.impl.constraints.controllers.g;
import androidx.work.impl.constraints.controllers.h;
import androidx.work.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: WorkConstraintsTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WorkConstraintsTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<androidx.work.impl.constraints.controllers.c<?>> f20385a;

    public WorkConstraintsTracker(n trackers) {
        i.e(trackers, "trackers");
        androidx.work.impl.constraints.controllers.a aVar = new androidx.work.impl.constraints.controllers.a(trackers.f4790a);
        androidx.work.impl.constraints.controllers.b bVar = new androidx.work.impl.constraints.controllers.b(trackers.f4791b);
        h hVar = new h(trackers.f4793d);
        O2.h<c> hVar2 = trackers.f4792c;
        List<androidx.work.impl.constraints.controllers.c<?>> controllers = l.s(aVar, bVar, hVar, new androidx.work.impl.constraints.controllers.d(hVar2), new g(hVar2), new f(hVar2), new androidx.work.impl.constraints.controllers.e(hVar2));
        i.e(controllers, "controllers");
        this.f20385a = controllers;
    }

    public final boolean a(z zVar) {
        List<androidx.work.impl.constraints.controllers.c<?>> list = this.f20385a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            androidx.work.impl.constraints.controllers.c cVar = (androidx.work.impl.constraints.controllers.c) obj;
            cVar.getClass();
            if (cVar.b(zVar) && cVar.c(cVar.f20400a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            k kVarC = k.c();
            int i10 = e.f20406a;
            q.U(arrayList, null, null, null, new Ia.l<androidx.work.impl.constraints.controllers.c<?>, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$areAllConstraintsMet$1
                @Override // Ia.l
                public final CharSequence invoke(androidx.work.impl.constraints.controllers.c<?> cVar2) {
                    androidx.work.impl.constraints.controllers.c<?> it = cVar2;
                    i.e(it, "it");
                    return it.getClass().getSimpleName();
                }
            }, 31);
            kVarC.getClass();
        }
        return arrayList.isEmpty();
    }
}
