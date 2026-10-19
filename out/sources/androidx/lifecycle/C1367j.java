package androidx.lifecycle;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1367j {
    public static C1362e a(kotlinx.coroutines.flow.A a10, kotlin.coroutines.e context, int i10) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            context = EmptyCoroutineContext.f43032b;
        }
        kotlin.jvm.internal.i.e(a10, "<this>");
        kotlin.jvm.internal.i.e(context, "context");
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(a10, null);
        C1362e c1362e = new C1362e();
        B0 b10 = new B0((InterfaceC2694i0) context.get(InterfaceC2694i0.b.f43449b));
        Sa.b bVar = kotlinx.coroutines.N.f43198a;
        c1362e.f17817m = new C1359b<>(c1362e, flowLiveDataConversions$asLiveData$1, 5000L, kotlinx.coroutines.B.a(kotlinx.coroutines.internal.q.f43500a.d1().plus(context).plus(b10)), new Q9.a(i11, c1362e));
        if (p160n.b.i0().j0()) {
            c1362e.j(a10.getValue());
        } else {
            c1362e.k(a10.getValue());
        }
        return c1362e;
    }
}
