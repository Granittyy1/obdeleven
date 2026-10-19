package p247u1;

import X1.g;
import X1.h;
import X1.i;
import X1.j;
import X1.k;
import X1.l;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import p152m1.d;
import p152m1.e;

/* JADX INFO: compiled from: DelegatingSubtitleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f47387n;

    public b(l lVar) {
        super(new j[2], new k[2]);
        int i10 = this.f44571g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f44569e;
        p241t7.b.k(i10 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.m(1024);
        }
        this.f47387n = lVar;
    }

    @Override // p152m1.e
    public final DecoderInputBuffer h() {
        return new j();
    }

    @Override // p152m1.e
    public final d i() {
        return new g(this);
    }

    @Override // p152m1.e
    public final DecoderException j(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // p152m1.e
    public final DecoderException k(DecoderInputBuffer decoderInputBuffer, d dVar, boolean z10) {
        j jVar = (j) decoderInputBuffer;
        k kVar = (k) dVar;
        try {
            ByteBuffer byteBuffer = jVar.f17941e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            l lVar = this.f47387n;
            if (z10) {
                lVar.reset();
            }
            h hVarB = lVar.b(bArrArray, 0, iLimit);
            long j = jVar.f17943g;
            long j10 = jVar.j;
            kVar.f44563c = j;
            kVar.f7149e = hVarB;
            if (j10 != Long.MAX_VALUE) {
                j = j10;
            }
            kVar.f7150f = j;
            kVar.f44564d = false;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    @Override // X1.i
    public final void d(long j) {
    }
}
