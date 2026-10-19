package p308z1;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC1389g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.n0;
import java.nio.ByteBuffer;
import p078g1.n;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1389g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DecoderInputBuffer f48702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f48703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f48704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f48705v;

    public b() {
        super(6);
        this.f48702s = new DecoderInputBuffer(1);
        this.f48703t = new r();
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void H() {
        a aVar = this.f48704u;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void J(long j, boolean z10) {
        this.f48705v = Long.MIN_VALUE;
        a aVar = this.f48704u;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // androidx.media3.exoplayer.m0
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.n0
    public final int c(n nVar) {
        return "application/x-camera-motion".equals(nVar.f35302n) ? n0.n(4, 0, 0, 0) : n0.n(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.m0, androidx.media3.exoplayer.n0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.m0
    public final void v(long j, long j10) {
        float[] fArr;
        while (!h() && this.f48705v < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.f48702s;
            decoderInputBuffer.k();
            Q q10 = this.f18364d;
            q10.a();
            if (P(q10, decoderInputBuffer, 0) != -4 || decoderInputBuffer.g(4)) {
                return;
            }
            long j11 = decoderInputBuffer.f17943g;
            this.f48705v = j11;
            boolean z10 = j11 < this.f18372m;
            if (this.f48704u != null && !z10) {
                decoderInputBuffer.n();
                ByteBuffer byteBuffer = decoderInputBuffer.f17941e;
                int i10 = A.f40996a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    r rVar = this.f48703t;
                    rVar.E(iLimit, bArrArray);
                    rVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(rVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f48704u.c(this.f48705v - this.f18371l, fArr);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.j0.b
    public final void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f48704u = (a) obj;
        }
    }
}
