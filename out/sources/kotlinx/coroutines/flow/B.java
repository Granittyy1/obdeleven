package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43303a = new D3.l(4, "NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D3.l f43304b = new D3.l(4, "PENDING");

    public static final StateFlowImpl a(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.n.f43403a;
        }
        return new StateFlowImpl(obj);
    }
}
