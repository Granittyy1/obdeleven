package kotlinx.coroutines.flow.internal;

import com.google.android.gms.internal.measurement.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f43399b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Ia.q qVar) {
        this.f43399b = (SuspendLambda) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ia.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f43399b, interfaceC2687d, null);
        i iVar = new i(cVar, cVar.getContext());
        Object objL = Y.l(iVar, iVar, flowCoroutineKt$scopedFlow$1$1);
        return objL == CoroutineSingletons.f43038b ? objL : r.f47939a;
    }
}
