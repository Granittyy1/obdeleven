package p036ca;

import Ha.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MemoryJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f22529a;

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        i.d(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f22529a = byteBufferOrder;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer destination, int i10, int i11, int i12) {
        i.e(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, destination.array(), destination.arrayOffset() + i12, i11);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i12);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }
}
