package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@p293xa.d
public final class j<E> implements a<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastChannelImpl<E> f43296b = new BroadcastChannelImpl<>(-1);

    @Override // kotlinx.coroutines.channels.q
    public final boolean a(Throwable th) {
        return this.f43296b.a(th);
    }

    @Override // kotlinx.coroutines.channels.a
    public final BufferedChannel m() {
        return this.f43296b.m();
    }

    @Override // kotlinx.coroutines.channels.q
    public final Object n(E e10) {
        return this.f43296b.n(e10);
    }

    @Override // kotlinx.coroutines.channels.q
    public final Object t(E e10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return this.f43296b.t(e10, cVar);
    }
}
