package p175o1;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;
import p114j1.A;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45178i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f45181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f45183o;

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f17869c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f45179k = true;
        return (this.f45178i == 0 && this.j == 0) ? AudioProcessor.a.f17866e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    public final void b() {
        if (this.f45179k) {
            this.f45179k = false;
            int i10 = this.j;
            int i11 = this.f17875b.f17870d;
            this.f45181m = new byte[i10 * i11];
            this.f45180l = this.f45178i * i11;
        }
        this.f45182n = 0;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final boolean d() {
        return super.d() && this.f45182n == 0;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        int i10;
        if (super.d() && (i10 = this.f45182n) > 0) {
            k(i10).put(this.f45181m, 0, this.f45182n).flip();
            this.f45182n = 0;
        }
        return super.e();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f45180l);
        this.f45183o += (long) (iMin / this.f17875b.f17870d);
        this.f45180l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f45180l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f45182n + i11) - this.f45181m.length;
        ByteBuffer byteBufferK = k(length);
        int iG = A.g(length, 0, this.f45182n);
        byteBufferK.put(this.f45181m, 0, iG);
        int iG2 = A.g(length - iG, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iG2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iG2;
        int i13 = this.f45182n - iG;
        this.f45182n = i13;
        byte[] bArr = this.f45181m;
        System.arraycopy(bArr, iG, bArr, 0, i13);
        byteBuffer.get(this.f45181m, this.f45182n, i12);
        this.f45182n += i12;
        byteBufferK.flip();
    }

    @Override // androidx.media3.common.audio.b
    public final void i() {
        if (this.f45179k) {
            int i10 = this.f45182n;
            if (i10 > 0) {
                this.f45183o += (long) (i10 / this.f17875b.f17870d);
            }
            this.f45182n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public final void j() {
        this.f45181m = A.f40998c;
    }
}
