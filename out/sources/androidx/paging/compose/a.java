package androidx.paging.compose;

import androidx.paging.C1428d;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: LazyPagingItems.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements InterfaceC2687d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<T> f19331b;

    public a(b<T> bVar) {
        this.f19331b = bVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        this.f19331b.f19336e.setValue((C1428d) obj);
        return r.f47939a;
    }
}
