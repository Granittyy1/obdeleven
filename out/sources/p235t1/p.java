package p235t1;

import A1.K;
import android.media.MediaCodec;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p114j1.A;
import p114j1.r;
import p241t7.b;
import p272w1.d;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f47043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f47045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f47046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f47047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f47048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f47049g;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f47050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f47051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p272w1.a f47052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f47053d;

        public a(int i10, long j) {
            b.k(this.f47052c == null);
            this.f47050a = j;
            this.f47051b = j + ((long) i10);
        }
    }

    public p(d dVar) {
        this.f47043a = dVar;
        int i10 = dVar.f47698b;
        this.f47044b = i10;
        this.f47045c = new r(32);
        a aVar = new a(i10, 0L);
        this.f47046d = aVar;
        this.f47047e = aVar;
        this.f47048f = aVar;
    }

    public static a c(a aVar, long j, ByteBuffer byteBuffer, int i10) {
        while (j >= aVar.f47051b) {
            aVar = aVar.f47053d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVar.f47051b - j));
            p272w1.a aVar2 = aVar.f47052c;
            byteBuffer.put(aVar2.f47687a, ((int) (j - aVar.f47050a)) + aVar2.f47688b, iMin);
            i10 -= iMin;
            j += (long) iMin;
            if (j == aVar.f47051b) {
                aVar = aVar.f47053d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, long j, byte[] bArr, int i10) {
        while (j >= aVar.f47051b) {
            aVar = aVar.f47053d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVar.f47051b - j));
            p272w1.a aVar2 = aVar.f47052c;
            System.arraycopy(aVar2.f47687a, ((int) (j - aVar.f47050a)) + aVar2.f47688b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j += (long) iMin;
            if (j == aVar.f47051b) {
                aVar = aVar.f47053d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, DecoderInputBuffer decoderInputBuffer, q.a aVar2, r rVar) {
        int iA;
        if (decoderInputBuffer.g(1073741824)) {
            long j = aVar2.f47082b;
            rVar.D(1);
            a aVarD = d(aVar, j, rVar.f41062a, 1);
            long j10 = j + 1;
            byte b10 = rVar.f41062a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            p152m1.b bVar = decoderInputBuffer.f17940d;
            byte[] bArr = bVar.f44552a;
            if (bArr == null) {
                bVar.f44552a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = d(aVarD, j10, bVar.f44552a, i10);
            long j11 = j10 + ((long) i10);
            if (z10) {
                rVar.D(2);
                aVar = d(aVar, j11, rVar.f41062a, 2);
                j11 += 2;
                iA = rVar.A();
            } else {
                iA = 1;
            }
            int[] iArr = bVar.f44555d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = bVar.f44556e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z10) {
                int i11 = iA * 6;
                rVar.D(i11);
                aVar = d(aVar, j11, rVar.f41062a, i11);
                j11 += (long) i11;
                rVar.G(0);
                for (int i12 = 0; i12 < iA; i12++) {
                    iArr[i12] = rVar.A();
                    iArr2[i12] = rVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f47081a - ((int) (j11 - aVar2.f47082b));
            }
            K.a aVar3 = aVar2.f47083c;
            int i13 = A.f40996a;
            byte[] bArr2 = aVar3.f430b;
            byte[] bArr3 = bVar.f44552a;
            bVar.f44557f = iA;
            bVar.f44555d = iArr;
            bVar.f44556e = iArr2;
            bVar.f44553b = bArr2;
            bVar.f44552a = bArr3;
            int i14 = aVar3.f429a;
            bVar.f44554c = i14;
            int i15 = aVar3.f431c;
            bVar.f44558g = i15;
            int i16 = aVar3.f432d;
            bVar.f44559h = i16;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f44560i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (A.f40996a >= 24) {
                m1.b.a aVar4 = bVar.j;
                aVar4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = aVar4.f44562b;
                pattern.set(i15, i16);
                aVar4.f44561a.setPattern(pattern);
            }
            long j12 = aVar2.f47082b;
            int i17 = (int) (j11 - j12);
            aVar2.f47082b = j12 + ((long) i17);
            aVar2.f47081a -= i17;
        }
        if (!decoderInputBuffer.g(268435456)) {
            decoderInputBuffer.m(aVar2.f47081a);
            return c(aVar, aVar2.f47082b, decoderInputBuffer.f17941e, aVar2.f47081a);
        }
        rVar.D(4);
        a aVarD2 = d(aVar, aVar2.f47082b, rVar.f41062a, 4);
        int iY = rVar.y();
        aVar2.f47082b += 4;
        aVar2.f47081a -= 4;
        decoderInputBuffer.m(iY);
        a aVarC = c(aVarD2, aVar2.f47082b, decoderInputBuffer.f17941e, iY);
        aVar2.f47082b += (long) iY;
        int i18 = aVar2.f47081a - iY;
        aVar2.f47081a = i18;
        ByteBuffer byteBuffer = decoderInputBuffer.f17944h;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            decoderInputBuffer.f17944h = ByteBuffer.allocate(i18);
        } else {
            decoderInputBuffer.f17944h.clear();
        }
        return c(aVarC, aVar2.f47082b, decoderInputBuffer.f17944h, aVar2.f47081a);
    }

    public final void a(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f47046d;
            if (j < aVar.f47051b) {
                break;
            }
            d dVar = this.f47043a;
            p272w1.a aVar2 = aVar.f47052c;
            synchronized (dVar) {
                p272w1.a[] aVarArr = dVar.f47702f;
                int i10 = dVar.f47701e;
                dVar.f47701e = i10 + 1;
                aVarArr[i10] = aVar2;
                dVar.f47700d--;
                dVar.notifyAll();
            }
            a aVar3 = this.f47046d;
            aVar3.f47052c = null;
            a aVar4 = aVar3.f47053d;
            aVar3.f47053d = null;
            this.f47046d = aVar4;
        }
        if (this.f47047e.f47050a < aVar.f47050a) {
            this.f47047e = aVar;
        }
    }

    public final int b(int i10) {
        p272w1.a aVar;
        a aVar2 = this.f47048f;
        if (aVar2.f47052c == null) {
            d dVar = this.f47043a;
            synchronized (dVar) {
                try {
                    int i11 = dVar.f47700d + 1;
                    dVar.f47700d = i11;
                    int i12 = dVar.f47701e;
                    if (i12 > 0) {
                        p272w1.a[] aVarArr = dVar.f47702f;
                        int i13 = i12 - 1;
                        dVar.f47701e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f47702f[dVar.f47701e] = null;
                    } else {
                        p272w1.a aVar3 = new p272w1.a(0, new byte[dVar.f47698b]);
                        p272w1.a[] aVarArr2 = dVar.f47702f;
                        if (i11 > aVarArr2.length) {
                            dVar.f47702f = (p272w1.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar4 = new a(this.f47044b, this.f47048f.f47051b);
            aVar2.f47052c = aVar;
            aVar2.f47053d = aVar4;
        }
        return Math.min(i10, (int) (this.f47048f.f47051b - this.f47049g));
    }
}
