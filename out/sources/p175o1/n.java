package p175o1;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p114j1.A;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f45154i;
    public int[] j;

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f45154i;
        if (iArr == null) {
            return AudioProcessor.a.f17866e;
        }
        int i10 = aVar.f17869c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int length = iArr.length;
        int i11 = aVar.f17868b;
        boolean z10 = i11 != length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        if (z10) {
            return new AudioProcessor.a(aVar.f17867a, iArr.length, i10);
        }
        return AudioProcessor.a.f17866e;
    }

    @Override // androidx.media3.common.audio.b
    public final void b() {
        this.j = this.f45154i;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f17875b.f17870d) * this.f17876c.f17870d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iP = (A.p(this.f17875b.f17869c) * i10) + iPosition;
                int i11 = this.f17875b.f17869c;
                if (i11 == 2) {
                    byteBufferK.putShort(byteBuffer.getShort(iP));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f17875b.f17869c);
                    }
                    byteBufferK.putFloat(byteBuffer.getFloat(iP));
                }
            }
            iPosition += this.f17875b.f17870d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // androidx.media3.common.audio.b
    public final void j() {
        this.j = null;
        this.f45154i = null;
    }
}
