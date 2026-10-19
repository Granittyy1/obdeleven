package p061ea;

import A8.f;
import com.braze.Constants;
import io.ktor.utils.io.pool.DefaultPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;
import p036ca.b;
import p074fa.a;

/* JADX INFO: compiled from: BufferFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultPool<a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p036ca.a f34864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e() {
        super(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        p036ca.a aVar = p036ca.a.f22528a;
        this.f34863g = 4096;
        this.f34864h = aVar;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final a h(a aVar) {
        a aVar2 = aVar;
        aVar2.l();
        aVar2.j();
        return aVar2;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final void i(a aVar) {
        a instance = aVar;
        i.e(instance, "instance");
        p036ca.a aVar2 = this.f34864h;
        ByteBuffer instance2 = instance.f34855a;
        aVar2.getClass();
        i.e(instance2, "instance");
        if (!a.f35064i.compareAndSet(instance, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        instance.f();
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final a j() {
        p036ca.a aVar = this.f34864h;
        int i10 = this.f34863g;
        aVar.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        i.d(byteBufferAllocate, "allocate(size)");
        ByteBuffer byteBuffer = b.f22529a;
        return new a(byteBufferAllocate, this);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final void p(a aVar) {
        a instance = aVar;
        i.e(instance, "instance");
        ByteBuffer byteBuffer = instance.f34855a;
        long jLimit = byteBuffer.limit();
        int i10 = this.f34863g;
        if (jLimit != i10) {
            StringBuilder sbE = f.e(i10, "Buffer size mismatch. Expected: ", ", actual: ");
            sbE.append(byteBuffer.limit());
            throw new IllegalStateException(sbE.toString().toString());
        }
        a aVar2 = a.f35065k;
        if (instance == aVar2) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == aVar2) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.h() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.g() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
    }
}
