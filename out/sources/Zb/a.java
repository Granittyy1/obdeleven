package Zb;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: AbstractBox.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Tb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cc.b f7970d = cc.c.b(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f7972c = null;

    public a(String str) {
        this.f7971b = str;
    }

    public abstract void a(ByteBuffer byteBuffer);

    public abstract long b();

    @Override // Tb.b
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        long size = getSize();
        if (size > 2147483647L || size < -2147483648L) {
            throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + size + ")");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) size);
        int i10 = "uuid".equals(this.f7971b) ? 24 : 8;
        long jB = b();
        ByteBuffer byteBuffer = this.f7972c;
        boolean z10 = (jB + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i10) < 4294967296L;
        String str = this.f7971b;
        if (z10) {
            byteBufferAllocate.putInt((int) getSize());
            byteBufferAllocate.put(Tb.c.i(str));
        } else {
            byteBufferAllocate.putInt((int) 1);
            byteBufferAllocate.put(Tb.c.i(str));
            byteBufferAllocate.putLong(getSize());
        }
        if ("uuid".equals(str)) {
            byteBufferAllocate.put((byte[]) null);
        }
        a(byteBufferAllocate);
        ByteBuffer byteBuffer2 = this.f7972c;
        if (byteBuffer2 != null) {
            byteBuffer2.rewind();
            while (this.f7972c.remaining() > 0) {
                byteBufferAllocate.put(this.f7972c);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    @Override // Tb.b
    public final long getSize() {
        long jB = b();
        long j = jB + ((long) ((jB >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(this.f7971b) ? 16 : 0)));
        ByteBuffer byteBuffer = this.f7972c;
        return j + ((long) (byteBuffer != null ? byteBuffer.limit() : 0));
    }
}
