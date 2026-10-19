package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements Ia.q<BufferedChannel<?>, kotlinx.coroutines.selects.e<?>, Object, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BufferedChannel$onReceive$1 f43263b = new BufferedChannel$onReceive$1();

    public BufferedChannel$onReceive$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Ia.q
    public final p293xa.r invoke(BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.e<?> eVar, Object obj) {
        BufferedChannel.j(bufferedChannel, eVar);
        return p293xa.r.f47939a;
    }
}
