package androidx.paging;

import com.braze.support.BrazeLogger;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.SubscribedSharedFlow;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CachedPageEventFlow<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1430f<T> f19212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f19213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SubscribedSharedFlow f19214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f19215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.t f19216e;

    public CachedPageEventFlow(InterfaceC2686c<? extends PageEvent<T>> src, kotlinx.coroutines.A scope) {
        kotlin.jvm.internal.i.e(src, "src");
        kotlin.jvm.internal.i.e(scope, "scope");
        this.f19212a = new C1430f<>();
        kotlinx.coroutines.flow.v vVarA = kotlinx.coroutines.flow.w.a(1, BrazeLogger.SUPPRESS, BufferOverflow.f43243b);
        this.f19213b = vVarA;
        this.f19214c = new SubscribedSharedFlow(vVarA, new CachedPageEventFlow$sharedForDownstream$1(this, null));
        z0 z0VarC = C2680e.c(scope, null, CoroutineStart.f43167c, new CachedPageEventFlow$job$1(src, this, null), 1);
        z0VarC.B(new Ia.l<Throwable, p293xa.r>(this) { // from class: androidx.paging.CachedPageEventFlow$job$2$1
            final /* synthetic */ CachedPageEventFlow<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                this.this$0.f19213b.f(null);
                return p293xa.r.f47939a;
            }
        });
        this.f19215d = z0VarC;
        this.f19216e = new kotlinx.coroutines.flow.t(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }
}
