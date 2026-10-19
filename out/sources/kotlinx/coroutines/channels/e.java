package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC2672a;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes2.dex */
public class e<E> extends AbstractC2672a<p293xa.r> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BufferedChannel f43290e;

    public e(kotlin.coroutines.e eVar, BufferedChannel bufferedChannel, boolean z10, boolean z11) {
        super(eVar, z10, z11);
        this.f43290e = bufferedChannel;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void F(CancellationException cancellationException) {
        this.f43290e.p(cancellationException);
        E(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.q
    public boolean a(Throwable th) {
        return this.f43290e.a(th);
    }

    @Override // kotlinx.coroutines.channels.p
    public final Object d(ContinuationImpl continuationImpl) {
        return this.f43290e.d(continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.p
    public final kotlinx.coroutines.selects.c e() {
        return this.f43290e.e();
    }

    @Override // kotlinx.coroutines.channels.p
    public final kotlinx.coroutines.selects.c f() {
        return this.f43290e.f();
    }

    @Override // kotlinx.coroutines.channels.p
    public final Object g() {
        return this.f43290e.g();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC2694i0
    public final void i(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), null, this);
        }
        F(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.p
    public final f<E> iterator() {
        BufferedChannel bufferedChannel = this.f43290e;
        bufferedChannel.getClass();
        return new BufferedChannel.a();
    }

    @Override // kotlinx.coroutines.channels.p
    public final Object l(kotlin.coroutines.c<? super h<? extends E>> cVar) {
        BufferedChannel bufferedChannel = this.f43290e;
        bufferedChannel.getClass();
        Object objK = BufferedChannel.K(bufferedChannel, (ContinuationImpl) cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objK;
    }

    @Override // kotlinx.coroutines.channels.q
    public Object n(E e10) {
        return this.f43290e.n(e10);
    }

    @Override // kotlinx.coroutines.channels.q
    public Object t(E e10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return this.f43290e.t(e10, cVar);
    }

    @Override // kotlinx.coroutines.channels.q
    public final void u(Ia.l<? super Throwable, p293xa.r> lVar) {
        this.f43290e.u(lVar);
    }

    @Override // kotlinx.coroutines.channels.q
    public final boolean v() {
        return this.f43290e.v();
    }
}
