package androidx.paging;

import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2686c<PagingData<Value>> f19431a;

    public v(w wVar, Ia.a aVar) {
        this.f19431a = new q(aVar instanceof E ? new Pager$flow$1(1, aVar, E.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new Pager$flow$2(aVar, null), null, wVar).f19390f;
    }
}
