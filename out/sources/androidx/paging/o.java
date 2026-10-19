package androidx.paging;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.A f19379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PagingData<T> f19380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedPageEventFlow<T> f19381c;

    public o(kotlinx.coroutines.A scope, PagingData parent) {
        kotlin.jvm.internal.i.e(scope, "scope");
        kotlin.jvm.internal.i.e(parent, "parent");
        this.f19379a = scope;
        this.f19380b = parent;
        this.f19381c = new CachedPageEventFlow<>(parent.f19288a, scope);
    }
}
