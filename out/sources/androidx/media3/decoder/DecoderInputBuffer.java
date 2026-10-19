package androidx.media3.decoder;

import Ub.b;
import androidx.core.view.C1293h;
import java.nio.ByteBuffer;
import p078g1.n;
import p078g1.q;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f17939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p152m1.b f17940d = new p152m1.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f17941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f17944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17945i;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i10, int i11) {
            super(C1293h.h("Buffer too small (", " < ", ")", i10, i11));
            this.currentCapacity = i10;
            this.requiredCapacity = i11;
        }
    }

    static {
        q.a("media3.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this.f17945i = i10;
    }

    public void k() {
        this.f6597b = 0;
        ByteBuffer byteBuffer = this.f17941e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f17944h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f17942f = false;
    }

    public final ByteBuffer l(int i10) {
        int i11 = this.f17945i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f17941e;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public final void m(int i10) {
        ByteBuffer byteBuffer = this.f17941e;
        if (byteBuffer == null) {
            this.f17941e = l(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f17941e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i11);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f17941e = byteBufferL;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.f17941e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f17944h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
