package androidx.paging;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: renamed from: androidx.paging.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1430f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1431g<T> f19344a = new C1431g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutexImpl f19345b = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19346c = -1;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(ContinuationImpl continuationImpl) {
        FlattenedPageController$getStateAsEvents$1 flattenedPageController$getStateAsEvents$1;
        C1430f<T> c1430f;
        kotlinx.coroutines.sync.a aVar;
        if (continuationImpl instanceof FlattenedPageController$getStateAsEvents$1) {
            flattenedPageController$getStateAsEvents$1 = (FlattenedPageController$getStateAsEvents$1) continuationImpl;
            int i10 = flattenedPageController$getStateAsEvents$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flattenedPageController$getStateAsEvents$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flattenedPageController$getStateAsEvents$1 = new FlattenedPageController$getStateAsEvents$1(this, continuationImpl);
            }
        } else {
            flattenedPageController$getStateAsEvents$1 = new FlattenedPageController$getStateAsEvents$1(this, continuationImpl);
        }
        Object obj = flattenedPageController$getStateAsEvents$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = flattenedPageController$getStateAsEvents$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            flattenedPageController$getStateAsEvents$1.L$0 = this;
            MutexImpl mutexImpl = this.f19345b;
            flattenedPageController$getStateAsEvents$1.L$1 = mutexImpl;
            flattenedPageController$getStateAsEvents$1.label = 1;
            if (mutexImpl.f(null, flattenedPageController$getStateAsEvents$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c1430f = this;
            aVar = mutexImpl;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kotlinx.coroutines.sync.a) flattenedPageController$getStateAsEvents$1.L$1;
            c1430f = (C1430f) flattenedPageController$getStateAsEvents$1.L$0;
            kotlin.b.b(obj);
        }
        try {
            List<PageEvent<T>> listB = c1430f.f19344a.b();
            int size = (c1430f.f19346c - listB.size()) + 1;
            List<PageEvent<T>> list = listB;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
            int i12 = 0;
            for (T t8 : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                arrayList.add(new kotlin.collections.s(i12 + size, (PageEvent) t8));
                i12 = i13;
            }
            aVar.g(null);
            return arrayList;
        } catch (Throwable th) {
            aVar.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(kotlin.collections.s sVar, ContinuationImpl continuationImpl) {
        FlattenedPageController$record$1 flattenedPageController$record$1;
        kotlinx.coroutines.sync.a aVar;
        C1430f<T> c1430f;
        if (continuationImpl instanceof FlattenedPageController$record$1) {
            flattenedPageController$record$1 = (FlattenedPageController$record$1) continuationImpl;
            int i10 = flattenedPageController$record$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flattenedPageController$record$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flattenedPageController$record$1 = new FlattenedPageController$record$1(this, continuationImpl);
            }
        } else {
            flattenedPageController$record$1 = new FlattenedPageController$record$1(this, continuationImpl);
        }
        Object obj = flattenedPageController$record$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = flattenedPageController$record$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            flattenedPageController$record$1.L$0 = this;
            flattenedPageController$record$1.L$1 = sVar;
            aVar = this.f19345b;
            flattenedPageController$record$1.L$2 = aVar;
            flattenedPageController$record$1.label = 1;
            if (aVar.f(null, flattenedPageController$record$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c1430f = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) flattenedPageController$record$1.L$2;
            kotlin.collections.s sVar2 = (kotlin.collections.s) flattenedPageController$record$1.L$1;
            c1430f = (C1430f) flattenedPageController$record$1.L$0;
            kotlin.b.b(obj);
            aVar = aVar2;
            sVar = sVar2;
        }
        try {
            c1430f.f19346c = sVar.f43022a;
            c1430f.f19344a.a((PageEvent) sVar.f43023b);
            p293xa.r rVar = p293xa.r.f47939a;
            return p293xa.r.f47939a;
        } finally {
            aVar.g(null);
        }
    }
}
