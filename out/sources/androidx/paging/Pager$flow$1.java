package androidx.paging;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements Ia.l<kotlin.coroutines.c<? super PagingSource<Object, Object>>, Object> {
    @Override // Ia.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlin.coroutines.c<? super PagingSource<Object, Object>> cVar) {
        E e10 = (E) this.receiver;
        e10.getClass();
        return C2680e.f(null, new SuspendingPagingSourceFactory$create$2(e10, null), cVar);
    }
}
