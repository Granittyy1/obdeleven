package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements InterfaceC2687d<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f43412b;

    public l(Ref$ObjectRef ref$ObjectRef) {
        this.f43412b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        this.f43412b.element = obj;
        throw new AbortFlowException(this);
    }
}
