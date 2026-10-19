package io.intercom.android.sdk.lightcompressor.video;

import Tb.b;
import Tb.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Mdat.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Mdat implements b {
    private long contentSize = 1073741824;
    private long dataOffset;

    private final boolean isSmallBox(long j) {
        return j + ((long) 8) < 4294967296L;
    }

    @Override // Tb.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        i.e(writableByteChannel, "writableByteChannel");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        long size = getSize();
        if (!isSmallBox(size) || size < 0 || size > 4294967296L) {
            byteBufferAllocate.putInt((int) 1);
        } else {
            byteBufferAllocate.putInt((int) size);
        }
        byteBufferAllocate.put(c.i("mdat"));
        if (isSmallBox(size)) {
            byteBufferAllocate.put(new byte[8]);
        } else {
            if (size < 0) {
                size = 1;
            }
            byteBufferAllocate.putLong(size);
        }
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final long getOffset() {
        return this.dataOffset;
    }

    @Override // Tb.b
    public long getSize() {
        return ((long) 16) + this.contentSize;
    }

    public String getType() {
        return "mdat";
    }

    public final void setContentSize(long j) {
        this.contentSize = j;
    }

    public final void setDataOffset(long j) {
        this.dataOffset = j;
    }
}
