package androidx.media3.container;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p114j1.q;

/* JADX INFO: loaded from: classes.dex */
public final class ObuParser {

    public static class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }

        public /* synthetic */ NotYetImplementedException(int i10) {
            this();
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17908a;

        public a(c cVar, b bVar) throws NotYetImplementedException {
            int i10 = bVar.f17909a;
            p241t7.b.e(i10 == 6 || i10 == 3);
            ByteBuffer byteBuffer = bVar.f17910b;
            int iMin = Math.min(4, byteBuffer.remaining());
            byte[] bArr = new byte[iMin];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            q qVar = new q(iMin, bArr);
            cVar.getClass();
            ObuParser.a(false);
            if (qVar.f()) {
                this.f17908a = false;
                return;
            }
            int iG = qVar.g(2);
            boolean zF = qVar.f();
            ObuParser.a(false);
            if (!zF) {
                this.f17908a = true;
                return;
            }
            boolean zF2 = (iG == 3 || iG == 0) ? true : qVar.f();
            qVar.n();
            ObuParser.a(!false);
            if (qVar.f()) {
                ObuParser.a(!false);
                qVar.n();
            }
            ObuParser.a(false);
            if (iG != 3) {
                qVar.n();
            }
            qVar.o(0);
            if (iG != 2 && iG != 0 && !zF2) {
                qVar.o(3);
            }
            this.f17908a = ((iG == 3 || iG == 0) ? 255 : qVar.g(8)) != 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f17910b;

        public b(int i10, ByteBuffer byteBuffer) {
            this.f17909a = i10;
            this.f17910b = byteBuffer;
        }
    }

    public static final class c {
    }

    public static void a(boolean z10) throws NotYetImplementedException {
        if (z10) {
            throw new NotYetImplementedException(0);
        }
    }

    public static ArrayList b(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b10 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i11 = 0; i11 < 8; i11++) {
                    byte b11 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b11 & 127) << (i11 * 7);
                    if ((b11 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new b(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }
}
