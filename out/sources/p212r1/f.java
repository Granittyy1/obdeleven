package p212r1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p241t7.b;

/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends DecoderInputBuffer {
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f46304l;

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void k() {
        super.k();
        this.f46303k = 0;
    }

    public final boolean o(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        b.e(!decoderInputBuffer.g(1073741824));
        b.e(!decoderInputBuffer.g(268435456));
        b.e(!decoderInputBuffer.g(4));
        if (p()) {
            if (this.f46303k >= this.f46304l) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.f17941e;
            if (byteBuffer2 != null && (byteBuffer = this.f17941e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f46303k;
        this.f46303k = i10 + 1;
        if (i10 == 0) {
            this.f17943g = decoderInputBuffer.f17943g;
            if (decoderInputBuffer.g(1)) {
                this.f6597b = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f17941e;
        if (byteBuffer3 != null) {
            m(byteBuffer3.remaining());
            this.f17941e.put(byteBuffer3);
        }
        this.j = decoderInputBuffer.f17943g;
        return true;
    }

    public final boolean p() {
        return this.f46303k > 0;
    }
}
