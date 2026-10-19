package androidx.paging;

import android.os.Build;
import android.util.Log;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f19386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f19387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.snapping.f f19388d = new androidx.compose.foundation.gestures.snapping.f(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.snapping.f f19389e = new androidx.compose.foundation.gestures.snapping.f(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2686c<PagingData<Value>> f19390f = SimpleChannelFlowKt.a(new PageFetcher$flow$1(this, null));

    /* JADX INFO: compiled from: PageFetcher.kt */
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r<Key, Value> f19391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y<Key, Value> f19392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2700k0 f19393c;

        public a(r rVar, y yVar, C2700k0 c2700k0) {
            this.f19391a = rVar;
            this.f19392b = yVar;
            this.f19393c = c2700k0;
        }
    }

    /* JADX INFO: compiled from: PageFetcher.kt */
    public final class b<Key, Value> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r<Key, Value> f19394a;

        public b(r rVar) {
            this.f19394a = rVar;
        }

        @Override // androidx.paging.j
        public final void a(final I i10) {
            C1433i c1433i = this.f19394a.f19404h;
            c1433i.getClass();
            c1433i.f19355a.a(i10 instanceof I.a ? (I.a) i10 : null, new Ia.p<C1433i.a, C1433i.a, p293xa.r>() { // from class: androidx.paging.HintHandler$processHint$1
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(C1433i.a aVar, C1433i.a aVar2) {
                    C1433i.a prependHint = aVar;
                    C1433i.a appendHint = aVar2;
                    kotlin.jvm.internal.i.e(prependHint, "prependHint");
                    kotlin.jvm.internal.i.e(appendHint, "appendHint");
                    if (G0.a.k(i10, prependHint.f19356a, LoadType.f19253c)) {
                        I i11 = i10;
                        prependHint.f19356a = i11;
                        if (i11 != null) {
                            prependHint.f19357b.f(i11);
                        }
                    }
                    if (G0.a.k(i10, appendHint.f19356a, LoadType.f19254d)) {
                        I i12 = i10;
                        appendHint.f19356a = i12;
                        if (i12 != null) {
                            appendHint.f19357b.f(i12);
                        }
                    }
                    return p293xa.r.f47939a;
                }
            });
        }
    }

    /* JADX INFO: compiled from: PageFetcher.kt */
    public final class c implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.compose.foundation.gestures.snapping.f f19395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q<Key, Value> f19396b;

        public c(q qVar, androidx.compose.foundation.gestures.snapping.f retryEventBus) {
            kotlin.jvm.internal.i.e(retryEventBus, "retryEventBus");
            this.f19396b = qVar;
            this.f19395a = retryEventBus;
        }

        @Override // androidx.paging.G
        public final void a() {
            this.f19395a.a(p293xa.r.f47939a);
        }

        @Override // androidx.paging.G
        public final void b() {
            this.f19396b.f19388d.a(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Ia.l lVar, Object obj, w wVar) {
        this.f19385a = lVar;
        this.f19386b = obj;
        this.f19387c = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [Ia.l, java.lang.Object] */
    public static final Object a(q qVar, PagingSource pagingSource, ContinuationImpl continuationImpl) {
        PageFetcher$generateNewPagingSource$1 pageFetcher$generateNewPagingSource$1;
        Object obj;
        PagingSource pagingSource2;
        qVar.getClass();
        if (continuationImpl instanceof PageFetcher$generateNewPagingSource$1) {
            pageFetcher$generateNewPagingSource$1 = (PageFetcher$generateNewPagingSource$1) continuationImpl;
            int i10 = pageFetcher$generateNewPagingSource$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcher$generateNewPagingSource$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcher$generateNewPagingSource$1 = new PageFetcher$generateNewPagingSource$1(qVar, continuationImpl);
            }
        } else {
            pageFetcher$generateNewPagingSource$1 = new PageFetcher$generateNewPagingSource$1(qVar, continuationImpl);
        }
        Object objInvoke = pageFetcher$generateNewPagingSource$1.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = pageFetcher$generateNewPagingSource$1.label;
        if (i11 == 0) {
            kotlin.b.b(objInvoke);
            pageFetcher$generateNewPagingSource$1.L$0 = qVar;
            pageFetcher$generateNewPagingSource$1.L$1 = pagingSource;
            pageFetcher$generateNewPagingSource$1.label = 1;
            objInvoke = qVar.f19385a.invoke(pageFetcher$generateNewPagingSource$1);
            if (objInvoke != obj2) {
            }
            obj = obj2;
            obj = pagingSource2;
            return obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pagingSource = (PagingSource) pageFetcher$generateNewPagingSource$1.L$1;
        qVar = (q) pageFetcher$generateNewPagingSource$1.L$0;
        kotlin.b.b(objInvoke);
        obj = obj2;
        pagingSource2 = (PagingSource) objInvoke;
        if (pagingSource2 instanceof InterfaceC1429e) {
            w wVar = qVar.f19387c;
            ((InterfaceC1429e) pagingSource2).a();
        }
        if (pagingSource2 == pagingSource) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        pagingSource2.registerInvalidatedCallback(new PageFetcher$generateNewPagingSource$3(0, qVar, q.class, "invalidate", "invalidate()V", 0));
        if (pagingSource != null) {
            pagingSource.unregisterInvalidatedCallback(new PageFetcher$generateNewPagingSource$4(0, qVar, q.class, "invalidate", "invalidate()V", 0));
        }
        if (pagingSource != null) {
            pagingSource.invalidate();
        }
        obj = pagingSource2;
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            obj = pagingSource2;
            String message = "Generated new PagingSource " + pagingSource2;
            kotlin.jvm.internal.i.e(message, "message");
            obj = pagingSource2;
        }
        obj = obj2;
        obj = pagingSource2;
        return obj;
    }
}
