package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2684a<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43366g = AtomicIntegerFieldUpdater.newUpdater(C2684a.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.channels.p<T> f43367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43368f;

    public /* synthetic */ C2684a(kotlinx.coroutines.channels.p pVar, boolean z10) {
        this(pVar, z10, EmptyCoroutineContext.f43032b, -3, BufferOverflow.f43243b);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final String c() {
        return "channel=" + this.f43367e;
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        if (this.f43394c != -3) {
            Object objCollect = super.collect(interfaceC2687d, cVar);
            return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
        }
        boolean z10 = this.f43368f;
        if (z10 && f43366g.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object objA = FlowKt__ChannelsKt.a(interfaceC2687d, this.f43367e, z10, cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final Object g(kotlinx.coroutines.channels.n<? super T> nVar, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        Object objA = FlowKt__ChannelsKt.a(new kotlinx.coroutines.flow.internal.o(nVar), this.f43367e, this.f43368f, cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final kotlinx.coroutines.flow.internal.d<T> i(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return new C2684a(this.f43367e, this.f43368f, eVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final InterfaceC2686c<T> j() {
        return new C2684a(this.f43367e, this.f43368f);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final kotlinx.coroutines.channels.p<T> k(kotlinx.coroutines.A a10) {
        if (!this.f43368f || f43366g.getAndSet(this, 1) == 0) {
            return this.f43394c == -3 ? this.f43367e : super.k(a10);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2684a(kotlinx.coroutines.channels.p<? extends T> pVar, boolean z10, kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        super(eVar, i10, bufferOverflow);
        this.f43367e = pVar;
        this.f43368f = z10;
        this.consumed$volatile = 0;
    }
}
