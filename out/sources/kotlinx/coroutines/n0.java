package kotlinx.coroutines;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends LockFreeLinkedListNode.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JobSupport f43515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2677c0 f43516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m0 m0Var, JobSupport jobSupport, InterfaceC2677c0 interfaceC2677c0) {
        super(m0Var);
        this.f43515d = jobSupport;
        this.f43516e = interfaceC2677c0;
    }

    @Override // kotlinx.coroutines.internal.AbstractC2696b
    public final D3.l c(Object obj) {
        if (this.f43515d.W() == this.f43516e) {
            return null;
        }
        return kotlinx.coroutines.internal.m.f43490a;
    }
}
