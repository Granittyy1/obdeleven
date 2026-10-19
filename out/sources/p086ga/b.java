package p086ga;

import io.ktor.utils.io.pool.DefaultPool;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ByteBufferPools.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends DefaultPool<ByteBuffer> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35673g;

    public b(int i10, int i11) {
        super(i10);
        this.f35673g = i11;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final ByteBuffer h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.clear();
        byteBuffer2.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer2;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final ByteBuffer j() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f35673g);
        i.b(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final void p(ByteBuffer byteBuffer) {
        ByteBuffer instance = byteBuffer;
        i.e(instance, "instance");
        if (instance.capacity() != this.f35673g) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
