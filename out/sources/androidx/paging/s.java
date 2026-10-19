package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s<T> implements InterfaceC2687d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r<Object, Object> f19410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoadType f19411c;

    public s(r<Object, Object> rVar, LoadType loadType) {
        this.f19410b = rVar;
        this.f19411c = loadType;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(Object obj, kotlin.coroutines.c cVar) throws Throwable {
        Object objB = r.b(this.f19410b, this.f19411c, (C1432h) obj, cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }
}
