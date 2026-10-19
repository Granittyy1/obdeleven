package p200q1;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC1389g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.n0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p078g1.n;

/* JADX INFO: compiled from: ImageRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1389g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f45981A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f45982B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public n f45983C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p200q1.b f45984D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public DecoderInputBuffer f45985E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ImageOutput f45986F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Bitmap f45987G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f45988H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public b f45989I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public b f45990J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f45991K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f45992L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q1.b.a f45993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecoderInputBuffer f45994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayDeque<a> f45995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f45996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f45997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f45998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f45999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f46000z;

    /* JADX INFO: compiled from: ImageRenderer.java */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f46001c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46003b;

        public a(long j, long j10) {
            this.f46002a = j;
            this.f46003b = j10;
        }
    }

    /* JADX INFO: compiled from: ImageRenderer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap f46006c;

        public b(int i10, long j) {
            this.f46004a = i10;
            this.f46005b = j;
        }
    }

    public e(q1.b.a aVar) {
        super(4);
        this.f45993s = aVar;
        this.f45986F = ImageOutput.f18439a;
        this.f45994t = new DecoderInputBuffer(0);
        this.f45998x = a.f46001c;
        this.f45995u = new ArrayDeque<>();
        this.f46000z = -9223372036854775807L;
        this.f45999y = -9223372036854775807L;
        this.f45981A = 0;
        this.f45982B = 1;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void H() {
        this.f45983C = null;
        this.f45998x = a.f46001c;
        this.f45995u.clear();
        T();
        this.f45986F.a();
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void I(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f45982B = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void J(long j, boolean z10) throws ExoPlaybackException {
        this.f45982B = Math.min(this.f45982B, 1);
        this.f45997w = false;
        this.f45996v = false;
        this.f45987G = null;
        this.f45989I = null;
        this.f45990J = null;
        this.f45988H = false;
        this.f45985E = null;
        p200q1.b bVar = this.f45984D;
        if (bVar != null) {
            bVar.flush();
        }
        this.f45995u.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void K() {
        T();
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void L() {
        T();
        this.f45982B = Math.min(this.f45982B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // androidx.media3.exoplayer.AbstractC1389g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(p078g1.n[] r5, long r6, long r8, androidx.media3.exoplayer.source.h.b r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            q1.e$a r5 = r4.f45998x
            long r5 = r5.f46003b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque<q1.e$a> r5 = r4.f45995u
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f46000z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f45999y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            q1.e$a r6 = new q1.e$a
            long r0 = r4.f46000z
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L38
        L31:
            q1.e$a r5 = new q1.e$a
            r5.<init>(r0, r8)
            r4.f45998x = r5
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p200q1.e.O(g1.n[], long, long, androidx.media3.exoplayer.source.h$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    public final boolean Q(long j) throws ExoPlaybackException, DecoderException {
        boolean z10;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.f45987G;
        if (bitmap != null && this.f45989I == null) {
            return false;
        }
        if (this.f45982B == 0 && this.f18369i != 2) {
            return false;
        }
        ArrayDeque<a> arrayDeque = this.f45995u;
        if (bitmap == null) {
            p241t7.b.l(this.f45984D);
            d dVarM = this.f45984D.e();
            if (dVarM == null) {
                return false;
            }
            if (dVarM.g(4)) {
                if (this.f45981A == 3) {
                    T();
                    p241t7.b.l(this.f45983C);
                    S();
                } else {
                    dVarM.l();
                    if (arrayDeque.isEmpty()) {
                        this.f45997w = true;
                    }
                }
                return false;
            }
            p241t7.b.m(dVarM.f45980e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f45987G = dVarM.f45980e;
            dVarM.l();
        }
        if (!this.f45988H || this.f45987G == null || this.f45989I == null) {
            return false;
        }
        p241t7.b.l(this.f45983C);
        n nVar = this.f45983C;
        int i10 = nVar.f35286K;
        int i11 = nVar.f35287L;
        boolean z11 = ((i10 == 1 && i11 == 1) || i10 == -1 || i11 == -1) ? false : true;
        b bVar = this.f45989I;
        if (bVar.f46006c == null) {
            if (z11) {
                p241t7.b.l(this.f45987G);
                int width = this.f45987G.getWidth();
                n nVar2 = this.f45983C;
                p241t7.b.l(nVar2);
                int i12 = width / nVar2.f35286K;
                int height = this.f45987G.getHeight();
                n nVar3 = this.f45983C;
                p241t7.b.l(nVar3);
                int i13 = height / nVar3.f35287L;
                int i14 = this.f45983C.f35286K;
                int i15 = bVar.f46004a;
                bitmapCreateBitmap = Bitmap.createBitmap(this.f45987G, (i15 % i14) * i12, (i15 / i14) * i13, i12, i13);
            } else {
                bitmapCreateBitmap = this.f45987G;
                p241t7.b.l(bitmapCreateBitmap);
            }
            bVar.f46006c = bitmapCreateBitmap;
        }
        Bitmap bitmap2 = this.f45989I.f46006c;
        p241t7.b.l(bitmap2);
        long j10 = this.f45989I.f46005b;
        long j11 = j10 - j;
        boolean z12 = this.f18369i == 2;
        int i16 = this.f45982B;
        if (i16 != 0) {
            if (i16 == 1) {
                z12 = true;
            } else {
                if (i16 != 3) {
                    throw new IllegalStateException();
                }
                z12 = false;
            }
        }
        if (z12 || j11 < 30000) {
            this.f45986F.onImageAvailable(j10 - this.f45998x.f46003b, bitmap2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        b bVar2 = this.f45989I;
        p241t7.b.l(bVar2);
        long j12 = bVar2.f46005b;
        this.f45999y = j12;
        while (!arrayDeque.isEmpty() && j12 >= arrayDeque.peek().f46002a) {
            this.f45998x = arrayDeque.removeFirst();
        }
        this.f45982B = 3;
        if (z11) {
            b bVar3 = this.f45989I;
            p241t7.b.l(bVar3);
            n nVar4 = this.f45983C;
            p241t7.b.l(nVar4);
            n nVar5 = this.f45983C;
            p241t7.b.l(nVar5);
            if (bVar3.f46004a == (nVar4.f35287L * nVar5.f35286K) - 1) {
                this.f45987G = null;
            }
        } else {
            this.f45987G = null;
        }
        this.f45989I = this.f45990J;
        this.f45990J = null;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    public final boolean R(long j) throws ImageDecoderException {
        boolean z10;
        n nVar;
        int i10;
        if (this.f45988H && this.f45989I != null) {
            return false;
        }
        Q q10 = this.f18364d;
        q10.a();
        p200q1.b bVar = this.f45984D;
        if (bVar == null || this.f45981A == 3 || this.f45996v) {
            return false;
        }
        if (this.f45985E == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) bVar.f();
            this.f45985E = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.f45981A == 2) {
            p241t7.b.l(this.f45985E);
            this.f45985E.f6597b = 4;
            p200q1.b bVar2 = this.f45984D;
            p241t7.b.l(bVar2);
            bVar2.g(this.f45985E);
            this.f45985E = null;
            this.f45981A = 3;
            return false;
        }
        int iP = P(q10, this.f45985E, 0);
        if (iP == -5) {
            n nVar2 = (n) q10.f18136b;
            p241t7.b.l(nVar2);
            this.f45983C = nVar2;
            this.f45992L = true;
            this.f45981A = 2;
            return true;
        }
        if (iP != -4) {
            if (iP == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f45985E.n();
        ByteBuffer byteBuffer = this.f45985E.f17941e;
        if (byteBuffer == null || byteBuffer.remaining() <= 0) {
            DecoderInputBuffer decoderInputBuffer2 = this.f45985E;
            p241t7.b.l(decoderInputBuffer2);
            if (decoderInputBuffer2.g(4)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        if (z10) {
            p200q1.b bVar3 = this.f45984D;
            p241t7.b.l(bVar3);
            DecoderInputBuffer decoderInputBuffer3 = this.f45985E;
            p241t7.b.l(decoderInputBuffer3);
            bVar3.g(decoderInputBuffer3);
            this.f45991K = 0;
        }
        DecoderInputBuffer decoderInputBuffer4 = this.f45985E;
        p241t7.b.l(decoderInputBuffer4);
        if (decoderInputBuffer4.g(4)) {
            this.f45988H = true;
        } else {
            int i11 = this.f45991K;
            long j10 = decoderInputBuffer4.f17943g;
            this.f45990J = new b(i11, j10);
            this.f45991K = i11 + 1;
            if (this.f45988H) {
                this.f45989I = this.f45990J;
                this.f45990J = null;
            } else {
                boolean z11 = j10 - 30000 <= j && j <= 30000 + j10;
                b bVar4 = this.f45989I;
                boolean z12 = bVar4 != null && bVar4.f46005b <= j && j < j10;
                n nVar3 = this.f45983C;
                p241t7.b.l(nVar3);
                this.f45988H = z11 || z12 || (nVar3.f35286K == -1 || (i10 = (nVar = this.f45983C).f35287L) == -1 || i11 == (i10 * nVar.f35286K) - 1);
                if (!z12 || z11) {
                    this.f45989I = this.f45990J;
                    this.f45990J = null;
                }
            }
        }
        DecoderInputBuffer decoderInputBuffer5 = this.f45985E;
        p241t7.b.l(decoderInputBuffer5);
        if (decoderInputBuffer5.g(4)) {
            this.f45996v = true;
            this.f45985E = null;
            return false;
        }
        long j11 = this.f46000z;
        DecoderInputBuffer decoderInputBuffer6 = this.f45985E;
        p241t7.b.l(decoderInputBuffer6);
        this.f46000z = Math.max(j11, decoderInputBuffer6.f17943g);
        if (z10) {
            this.f45985E = null;
        } else {
            DecoderInputBuffer decoderInputBuffer7 = this.f45985E;
            p241t7.b.l(decoderInputBuffer7);
            decoderInputBuffer7.k();
        }
        return !this.f45988H;
    }

    public final void S() throws ExoPlaybackException {
        if (this.f45992L) {
            n nVar = this.f45983C;
            nVar.getClass();
            q1.b.a aVar = this.f45993s;
            int iA = aVar.a(nVar);
            if (iA != n0.n(4, 0, 0, 0) && iA != n0.n(3, 0, 0, 0)) {
                throw G(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f45983C, false, 4005);
            }
            p200q1.b bVar = this.f45984D;
            if (bVar != null) {
                bVar.a();
            }
            this.f45984D = new p200q1.b(aVar.f45978b);
            this.f45992L = false;
        }
    }

    public final void T() {
        this.f45985E = null;
        this.f45981A = 0;
        this.f46000z = -9223372036854775807L;
        p200q1.b bVar = this.f45984D;
        if (bVar != null) {
            bVar.a();
            this.f45984D = null;
        }
    }

    @Override // androidx.media3.exoplayer.m0
    public final boolean b() {
        int i10 = this.f45982B;
        return i10 == 3 || (i10 == 0 && this.f45988H);
    }

    @Override // androidx.media3.exoplayer.n0
    public final int c(n nVar) {
        return this.f45993s.a(nVar);
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.m0
    public final boolean d() {
        return this.f45997w;
    }

    @Override // androidx.media3.exoplayer.m0, androidx.media3.exoplayer.n0
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.m0
    public final void v(long j, long j10) throws ExoPlaybackException {
        if (this.f45997w) {
            return;
        }
        if (this.f45983C == null) {
            Q q10 = this.f18364d;
            q10.a();
            DecoderInputBuffer decoderInputBuffer = this.f45994t;
            decoderInputBuffer.k();
            int iP = P(q10, decoderInputBuffer, 2);
            if (iP != -5) {
                if (iP == -4) {
                    p241t7.b.k(decoderInputBuffer.g(4));
                    this.f45996v = true;
                    this.f45997w = true;
                    return;
                }
                return;
            }
            n nVar = (n) q10.f18136b;
            p241t7.b.l(nVar);
            this.f45983C = nVar;
            this.f45992L = true;
        }
        if (this.f45984D == null) {
            S();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (Q(j)) {
            }
            while (R(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e10) {
            throw G(e10, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.j0.b
    public final void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f18439a;
        }
        this.f45986F = imageOutput;
    }
}
