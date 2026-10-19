package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements Ia.q<BufferedChannel<?>, Object, Object, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BufferedChannel$onReceive$2 f43264b = new BufferedChannel$onReceive$2();

    public BufferedChannel$onReceive$2() {
        super(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // Ia.q
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) throws Throwable {
        BufferedChannel<?> bufferedChannel2 = bufferedChannel;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.f43247e;
        bufferedChannel2.getClass();
        if (obj2 != c.f43279l) {
            return obj2;
        }
        throw bufferedChannel2.z();
    }
}
