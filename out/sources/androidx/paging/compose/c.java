package androidx.paging.compose;

import Ia.p;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.paging.m;
import androidx.paging.n;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: LazyPagingItems.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f19338a;

    static {
        m.c cVar = new m.c(false);
        f19338a = new n(m.b.f19372b, cVar, cVar);
    }

    public static final b a(InterfaceC2686c interfaceC2686c, InterfaceC1084f interfaceC1084f) {
        i.e(interfaceC2686c, "<this>");
        interfaceC1084f.e(388053246);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
        interfaceC1084f.e(1046463091);
        boolean zK = interfaceC1084f.K(interfaceC2686c);
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (zK || objF == obj) {
            objF = new b(interfaceC2686c);
            interfaceC1084f.E(objF);
        }
        b bVar = (b) objF;
        interfaceC1084f.I();
        interfaceC1084f.e(1046463169);
        boolean zK2 = interfaceC1084f.k(emptyCoroutineContext) | interfaceC1084f.k(bVar);
        Object objF2 = interfaceC1084f.f();
        if (zK2 || objF2 == obj) {
            objF2 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(emptyCoroutineContext, bVar, null);
            interfaceC1084f.E(objF2);
        }
        interfaceC1084f.I();
        E.d((p) objF2, interfaceC1084f, bVar);
        interfaceC1084f.e(1046463438);
        boolean zK3 = interfaceC1084f.k(emptyCoroutineContext) | interfaceC1084f.k(bVar);
        Object objF3 = interfaceC1084f.f();
        if (zK3 || objF3 == obj) {
            objF3 = new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(emptyCoroutineContext, bVar, null);
            interfaceC1084f.E(objF3);
        }
        interfaceC1084f.I();
        E.d((p) objF3, interfaceC1084f, bVar);
        interfaceC1084f.I();
        return bVar;
    }
}
