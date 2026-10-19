package Vb;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: DataReferenceBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Zb.b {
    @Override // Zb.b, Tb.b
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(i());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        C6.b.k(0, byteBufferAllocate);
        C6.b.j(0, byteBufferAllocate);
        byteBufferAllocate.putInt(this.f6057b.size());
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        h(writableByteChannel);
    }

    @Override // Zb.b, Tb.b
    public final long getSize() {
        long jC = c();
        return 8 + jC + ((long) (jC + 16 >= 4294967296L ? 16 : 8));
    }
}
