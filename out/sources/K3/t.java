package K3;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: VideoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends MediaDataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f4281b;

    public t(ByteBuffer byteBuffer) {
        this.f4281b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f4281b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f4281b;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
