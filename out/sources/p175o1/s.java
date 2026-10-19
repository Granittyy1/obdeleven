package p175o1;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.b;
import com.braze.Constants;
import java.nio.ByteBuffer;
import p114j1.A;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45171q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f45173s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f45176v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45172r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45174t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45175u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f45166l = 100000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f45164i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f45167m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f45165k = 10;
    public final short j = 1024;

    public s() {
        byte[] bArr = A.f40998c;
        this.f45173s = bArr;
        this.f45176v = bArr;
    }

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f17869c == 2) {
            return aVar.f17867a == -1 ? AudioProcessor.a.f17866e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.b
    public final void b() {
        if (c()) {
            AudioProcessor.a aVar = this.f17875b;
            int i10 = aVar.f17868b * 2;
            this.f45168n = i10;
            int i11 = ((((int) ((this.f45166l * ((long) aVar.f17867a)) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f45173s.length != i11) {
                this.f45173s = new byte[i11];
                this.f45176v = new byte[i11];
            }
        }
        this.f45170p = 0;
        this.f45171q = 0L;
        this.f45172r = 0;
        this.f45174t = 0;
        this.f45175u = 0;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final boolean c() {
        return super.c() && this.f45169o;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f17880g.hasRemaining()) {
            int i10 = this.f45170p;
            short s10 = this.j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f45173s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s10) {
                        int i11 = this.f45168n;
                        iPosition = ((iLimit3 / i11) * i11) + i11;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f45170p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                p241t7.b.k(this.f45174t < this.f45173s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s10) {
                        int i12 = this.f45168n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f45174t;
                int i13 = this.f45175u;
                int length2 = length + i13;
                byte[] bArr = this.f45173s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z10 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f45173s, length2, iMin);
                int i15 = this.f45175u + iMin;
                this.f45175u = i15;
                p241t7.b.k(i15 <= this.f45173s.length);
                boolean z11 = z10 && iPosition3 < i14;
                m(z11);
                if (z11) {
                    this.f45170p = 0;
                    this.f45172r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // androidx.media3.common.audio.b
    public final void i() {
        if (this.f45175u > 0) {
            m(true);
            this.f45172r = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public final void j() {
        this.f45169o = false;
        byte[] bArr = A.f40998c;
        this.f45173s = bArr;
        this.f45176v = bArr;
    }

    public final int l(int i10) {
        int length = ((((int) ((this.f45167m * ((long) this.f17875b.f17867a)) / 1000000)) - this.f45172r) * this.f45168n) - (this.f45173s.length / 2);
        p241t7.b.k(length >= 0);
        int iMin = (int) Math.min((i10 * this.f45164i) + 0.5f, length);
        int i11 = this.f45168n;
        return (iMin / i11) * i11;
    }

    public final void m(boolean z10) {
        int length;
        int iL;
        int i10 = this.f45175u;
        byte[] bArr = this.f45173s;
        if (i10 == bArr.length || z10) {
            if (this.f45172r == 0) {
                if (z10) {
                    n(i10, 3);
                    length = i10;
                } else {
                    p241t7.b.k(i10 >= bArr.length / 2);
                    length = this.f45173s.length / 2;
                    n(length, 0);
                }
                iL = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f45173s.length / 2);
                n(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iL = l(length);
                n(iL, 1);
            }
            p241t7.b.i("bytesConsumed is not aligned to frame size: %s" + length, length % this.f45168n == 0);
            p241t7.b.k(i10 >= iL);
            this.f45175u -= length;
            int i11 = this.f45174t + length;
            this.f45174t = i11;
            this.f45174t = i11 % this.f45173s.length;
            int i12 = this.f45172r;
            int i13 = this.f45168n;
            this.f45172r = (iL / i13) + i12;
            this.f45171q += (long) ((length - iL) / i13);
        }
    }

    public final void n(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        p241t7.b.e(this.f45175u >= i10);
        if (i11 == 2) {
            int i12 = this.f45174t;
            int i13 = this.f45175u;
            int i14 = i12 + i13;
            byte[] bArr = this.f45173s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f45176v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f45176v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f45176v, 0, i15);
                    System.arraycopy(this.f45173s, 0, this.f45176v, i15, length);
                }
            }
        } else {
            int i16 = this.f45174t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f45173s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f45176v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f45176v, 0, length2);
                System.arraycopy(this.f45173s, 0, this.f45176v, length2, i10 - length2);
            }
        }
        p241t7.b.d("sizeToOutput is not aligned to frame size: " + i10, i10 % this.f45168n == 0);
        p241t7.b.k(this.f45174t < this.f45173s.length);
        byte[] bArr3 = this.f45176v;
        p241t7.b.d("byteOutput size is not aligned to frame size " + i10, i10 % this.f45168n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f45165k;
                if (i11 == 0) {
                    i21 = ((((i18 * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) / (i10 - 1)) * (i21 - 100)) / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) * (100 - i21)) / (i10 - 1)) / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        k(i10).put(bArr3, 0, i10).flip();
    }
}
