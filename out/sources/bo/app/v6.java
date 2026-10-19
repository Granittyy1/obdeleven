package bo.app;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22080b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f22081c = new H0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityQueue f22082a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public v6(List fallbackActions) {
        kotlin.jvm.internal.i.e(fallbackActions, "fallbackActions");
        PriorityQueue priorityQueue = new PriorityQueue(12, f22081c);
        this.f22082a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    public final c3 a() {
        return (c3) this.f22082a.poll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(c3 actionA, c3 actionB) {
        kotlin.jvm.internal.i.e(actionA, "actionA");
        kotlin.jvm.internal.i.e(actionB, "actionB");
        int iJ = actionA.n().j();
        int iJ2 = actionB.n().j();
        if (iJ > iJ2) {
            return -1;
        }
        if (iJ < iJ2) {
            return 1;
        }
        return actionA.getId().compareTo(actionB.getId());
    }
}
