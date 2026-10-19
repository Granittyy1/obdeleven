package androidx.media3.exoplayer.mediacodec;

import A8.p;
import B8.E0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC1389g;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.C1391i;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.m0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p078g1.n;
import p114j1.A;
import p114j1.C2479a;
import p114j1.k;
import p114j1.v;
import p162n1.u;
import p175o1.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends AbstractC1389g {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final byte[] f18486R0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayDeque<b> f18487A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f18488A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final r f18489B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f18490B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public n f18491C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f18492C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public n f18493D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f18494D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public DrmSession f18495E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f18496E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public DrmSession f18497F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f18498F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public m0.a f18499G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public long f18500G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public MediaCrypto f18501H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public long f18502H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final long f18503I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f18504I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f18505J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f18506J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f18507K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f18508K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public c f18509L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f18510L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public n f18511M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ExoPlaybackException f18512M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public MediaFormat f18513N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public C1390h f18514N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f18515O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public b f18516O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f18517P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public long f18518P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayDeque<d> f18519Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f18520Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public DecoderInitializationException f18521R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public d f18522S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f18523T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f18524U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f18525V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f18526W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f18527X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f18528Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f18529Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f18530p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f18531q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f18532r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c.b f18533s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f18534s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final E0 f18535t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ByteBuffer f18536t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f18537u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f18538u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DecoderInputBuffer f18539v;
    public boolean v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DecoderInputBuffer f18540w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f18541w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DecoderInputBuffer f18542x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f18543x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p212r1.f f18544y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f18545y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f18546z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f18547z0;

    public final class a {
        public a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f18549e = new b(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v<n> f18553d = new v<>();

        public b(long j, long j10, long j11) {
            this.f18550a = j;
            this.f18551b = j10;
            this.f18552c = j11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i10, c.b bVar, float f10) {
        super(i10);
        E0 e10 = f.f18585e0;
        this.f18533s = bVar;
        this.f18535t = e10;
        this.f18537u = f10;
        this.f18539v = new DecoderInputBuffer(0);
        this.f18540w = new DecoderInputBuffer(0);
        this.f18542x = new DecoderInputBuffer(2);
        p212r1.f fVar = new p212r1.f(2);
        fVar.f46304l = 32;
        this.f18544y = fVar;
        this.f18546z = new MediaCodec.BufferInfo();
        this.f18505J = 1.0f;
        this.f18507K = 1.0f;
        this.f18503I = -9223372036854775807L;
        this.f18487A = new ArrayDeque<>();
        this.f18516O0 = b.f18549e;
        fVar.m(0);
        fVar.f17941e.order(ByteOrder.nativeOrder());
        r rVar = new r();
        rVar.f45161a = AudioProcessor.f17865a;
        rVar.f45163c = 0;
        rVar.f45162b = 2;
        this.f18489B = rVar;
        this.f18517P = -1.0f;
        this.f18523T = 0;
        this.f18488A0 = 0;
        this.f18532r0 = -1;
        this.f18534s0 = -1;
        this.f18531q0 = -9223372036854775807L;
        this.f18500G0 = -9223372036854775807L;
        this.f18502H0 = -9223372036854775807L;
        this.f18518P0 = -9223372036854775807L;
        this.f18530p0 = -9223372036854775807L;
        this.f18490B0 = 0;
        this.f18492C0 = 0;
        this.f18514N0 = new C1390h();
    }

    public final void A0() {
        z0();
        this.f18512M0 = null;
        this.f18519Q = null;
        this.f18522S = null;
        this.f18511M = null;
        this.f18513N = null;
        this.f18515O = false;
        this.f18498F0 = false;
        this.f18517P = -1.0f;
        this.f18523T = 0;
        this.f18524U = false;
        this.f18525V = false;
        this.f18526W = false;
        this.f18529Z = false;
        this.f18547z0 = false;
        this.f18488A0 = 0;
    }

    public final void B0(DrmSession drmSession) {
        DrmSession drmSession2 = this.f18495E;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.a(null);
            }
            if (drmSession2 != null) {
                drmSession2.d(null);
            }
        }
        this.f18495E = drmSession;
    }

    public final void C0(b bVar) {
        this.f18516O0 = bVar;
        long j = bVar.f18552c;
        if (j != -9223372036854775807L) {
            this.f18520Q0 = true;
            q0(j);
        }
    }

    public boolean D0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean E0(d dVar) {
        return true;
    }

    public boolean F0(n nVar) {
        return false;
    }

    public abstract int G0(E0 e10, n nVar) throws MediaCodecUtil.DecoderQueryException;

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public void H() {
        this.f18491C = null;
        C0(b.f18549e);
        this.f18487A.clear();
        Y();
    }

    public final boolean H0(n nVar) throws ExoPlaybackException {
        if (A.f40996a >= 23 && this.f18509L != null && this.f18492C0 != 3 && this.f18369i != 0) {
            float f10 = this.f18507K;
            nVar.getClass();
            n[] nVarArr = this.f18370k;
            nVarArr.getClass();
            float fC0 = c0(f10, nVarArr);
            float f11 = this.f18517P;
            if (f11 == fC0) {
                return true;
            }
            if (fC0 == -1.0f) {
                if (this.f18494D0) {
                    this.f18490B0 = 1;
                    this.f18492C0 = 3;
                    return false;
                }
                x0();
                i0();
                return false;
            }
            if (f11 == -1.0f && fC0 <= this.f18537u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fC0);
            c cVar = this.f18509L;
            cVar.getClass();
            cVar.b(bundle);
            this.f18517P = fC0;
        }
        return true;
    }

    public final void I0() throws ExoPlaybackException {
        DrmSession drmSession = this.f18497F;
        drmSession.getClass();
        p152m1.a aVarG = drmSession.g();
        if (aVarG instanceof p187p1.b) {
            try {
                MediaCrypto mediaCrypto = this.f18501H;
                mediaCrypto.getClass();
                ((p187p1.b) aVarG).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e10) {
                throw G(e10, this.f18491C, false, 6006);
            }
        }
        B0(this.f18497F);
        this.f18490B0 = 0;
        this.f18492C0 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public void J(long j, boolean z10) throws ExoPlaybackException {
        this.f18504I0 = false;
        this.f18506J0 = false;
        this.f18510L0 = false;
        if (this.f18541w0) {
            this.f18544y.k();
            this.f18542x.k();
            this.f18543x0 = false;
            r rVar = this.f18489B;
            rVar.getClass();
            rVar.f45161a = AudioProcessor.f17865a;
            rVar.f45163c = 0;
            rVar.f45162b = 2;
        } else if (Y()) {
            i0();
        }
        if (this.f18516O0.f18553d.h() > 0) {
            this.f18508K0 = true;
        }
        this.f18516O0.f18553d.b();
        this.f18487A.clear();
    }

    public final void J0(long j) throws ExoPlaybackException {
        n nVarF = this.f18516O0.f18553d.f(j);
        if (nVarF == null && this.f18520Q0 && this.f18513N != null) {
            nVarF = this.f18516O0.f18553d.e();
        }
        if (nVarF != null) {
            this.f18493D = nVarF;
        } else if (!this.f18515O || this.f18493D == null) {
            return;
        }
        n nVar = this.f18493D;
        nVar.getClass();
        p0(nVar, this.f18513N);
        this.f18515O = false;
        this.f18520Q0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // androidx.media3.exoplayer.AbstractC1389g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(p078g1.n[] r13, long r14, long r16, androidx.media3.exoplayer.source.h.b r18) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r12 = this;
            r0 = r12
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r1 = r0.f18516O0
            long r1 = r1.f18552c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.C0(r1)
            goto L63
        L20:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b> r1 = r0.f18487A
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f18500G0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f18518P0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.C0(r1)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r1 = r0.f18516O0
            long r1 = r1.f18552c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.s0()
            goto L63
        L55:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b r9 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b
            long r3 = r0.f18500G0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.O(g1.n[], long, long, androidx.media3.exoplayer.source.h$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:122:0x0314  */
    /* JADX WARN: Code duplicated, block: B:125:0x031c A[LOOP:0: B:26:0x0096->B:125:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x031a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.media3.exoplayer.g, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    public final boolean Q(long j, long j10) throws ExoPlaybackException {
        boolean z10;
        p212r1.f fVar;
        ?? r10;
        boolean z11;
        ?? r11;
        ?? r12;
        boolean z12;
        p241t7.b.k(!this.f18506J0);
        p212r1.f fVar2 = this.f18544y;
        if (fVar2.p()) {
            ByteBuffer byteBuffer = fVar2.f17941e;
            int i10 = this.f18534s0;
            int i11 = fVar2.f46303k;
            long j11 = fVar2.f17943g;
            boolean zH0 = h0(this.f18372m, fVar2.j);
            boolean zG = fVar2.g(4);
            n nVar = this.f18493D;
            nVar.getClass();
            if (!v0(j, j10, null, byteBuffer, i10, 0, i11, j11, zH0, zG, nVar)) {
                return false;
            }
            fVar = fVar2;
            r0(fVar.j);
            fVar.k();
            z10 = false;
        } else {
            z10 = false;
            fVar = fVar2;
        }
        if (this.f18504I0) {
            this.f18506J0 = true;
            return z10;
        }
        boolean z13 = true;
        boolean z14 = this.f18543x0;
        DecoderInputBuffer decoderInputBuffer = this.f18542x;
        if (z14) {
            p241t7.b.k(fVar.o(decoderInputBuffer));
            this.f18543x0 = z10;
        }
        if (this.f18545y0) {
            if (fVar.p()) {
                return true;
            }
            T();
            this.f18545y0 = z10;
            i0();
            if (!this.f18541w0) {
                return z10;
            }
        }
        p241t7.b.k(!this.f18504I0);
        Q q10 = this.f18364d;
        q10.a();
        decoderInputBuffer.k();
        ?? r13 = z10;
        while (true) {
            decoderInputBuffer.k();
            int iP = P(q10, decoderInputBuffer, r13);
            if (iP != -5) {
                if (iP != -4) {
                    if (iP != -3) {
                        throw new IllegalStateException();
                    }
                    if (h()) {
                        this.f18502H0 = this.f18500G0;
                    }
                } else if (decoderInputBuffer.g(4)) {
                    this.f18504I0 = z13;
                    this.f18502H0 = this.f18500G0;
                } else {
                    this.f18500G0 = Math.max(this.f18500G0, decoderInputBuffer.f17943g);
                    if (h() || this.f18540w.g(536870912)) {
                        this.f18502H0 = this.f18500G0;
                    }
                    byte[] bArr = null;
                    if (this.f18508K0) {
                        n nVar2 = this.f18491C;
                        nVar2.getClass();
                        this.f18493D = nVar2;
                        if (Objects.equals(nVar2.f35302n, "audio/opus") && !this.f18493D.f35305q.isEmpty()) {
                            byte[] bArr2 = this.f18493D.f35305q.get(r13);
                            int i12 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            n.a aVarA = this.f18493D.a();
                            aVarA.f35320F = i12;
                            this.f18493D = new n(aVarA);
                        }
                        p0(this.f18493D, null);
                        this.f18508K0 = r13;
                    }
                    decoderInputBuffer.n();
                    n nVar3 = this.f18493D;
                    if (nVar3 == null || !Objects.equals(nVar3.f35302n, "audio/opus")) {
                        r11 = r13;
                    } else {
                        if (decoderInputBuffer.g(268435456)) {
                            decoderInputBuffer.f17939c = this.f18493D;
                            f0(decoderInputBuffer);
                        }
                        if (this.f18372m - decoderInputBuffer.f17943g <= 80000) {
                            List<byte[]> list = this.f18493D.f35305q;
                            r rVar = this.f18489B;
                            rVar.getClass();
                            decoderInputBuffer.f17941e.getClass();
                            if (decoderInputBuffer.f17941e.limit() - decoderInputBuffer.f17941e.position() == 0) {
                                r11 = r13;
                            } else {
                                if (rVar.f45162b == 2 && (list.size() == z13 || list.size() == 3)) {
                                    bArr = list.get(r13);
                                }
                                ByteBuffer byteBuffer2 = decoderInputBuffer.f17941e;
                                int iPosition = byteBuffer2.position();
                                int iLimit = byteBuffer2.limit();
                                int i13 = iLimit - iPosition;
                                int i14 = (i13 + 255) / 255;
                                int i15 = i14 + 27 + i13;
                                if (rVar.f45162b == 2) {
                                    int length = bArr != null ? bArr.length + 28 : 47;
                                    i15 = (length == true ? 1 : 0) + 44 + i15;
                                    r12 = length;
                                } else {
                                    r12 = r13;
                                }
                                int i16 = i15;
                                if (rVar.f45161a.capacity() < i16) {
                                    rVar.f45161a = ByteBuffer.allocate(i16).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    rVar.f45161a.clear();
                                }
                                ByteBuffer byteBuffer3 = rVar.f45161a;
                                if (rVar.f45162b == 2) {
                                    if (bArr != null) {
                                        r.a(byteBuffer3, 0L, 0, 1, true);
                                        long length2 = bArr.length;
                                        p.d(length2, "out of range: %s", (length2 >> 8) == 0);
                                        byteBuffer3.put((byte) length2);
                                        byteBuffer3.put(bArr);
                                        byteBuffer3.putInt(22, A.j(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        byteBuffer3.put(r.f45159d);
                                    }
                                    byteBuffer3.put(r.f45160e);
                                } else {
                                    iLimit = iLimit;
                                }
                                int iJ = rVar.f45163c + ((int) ((C2479a.j(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                                rVar.f45163c = iJ;
                                r.a(byteBuffer3, iJ, rVar.f45162b, i14, false);
                                for (int i17 = 0; i17 < i14; i17++) {
                                    if (i13 >= 255) {
                                        byteBuffer3.put((byte) -1);
                                        i13 -= 255;
                                    } else {
                                        byteBuffer3.put((byte) i13);
                                        i13 = 0;
                                    }
                                }
                                int i18 = iLimit;
                                while (iPosition < i18) {
                                    byteBuffer3.put(byteBuffer2.get(iPosition));
                                    iPosition++;
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (rVar.f45162b == 2) {
                                    z12 = false;
                                    byteBuffer3.putInt(r12 + 66, A.j(byteBuffer3.arrayOffset() + r12 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    z12 = false;
                                    byteBuffer3.putInt(22, A.j(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                rVar.f45162b++;
                                rVar.f45161a = byteBuffer3;
                                decoderInputBuffer.k();
                                decoderInputBuffer.m(rVar.f45161a.remaining());
                                decoderInputBuffer.f17941e.put(rVar.f45161a);
                                decoderInputBuffer.n();
                                r11 = z12;
                            }
                        } else {
                            r11 = r13;
                        }
                    }
                    if (fVar.p()) {
                        long j12 = this.f18372m;
                        if (h0(j12, fVar.j) == h0(j12, decoderInputBuffer.f17943g)) {
                            if (!fVar.o(decoderInputBuffer)) {
                                r13 = r11 == true ? 1 : 0;
                                z13 = true;
                            }
                        }
                    } else if (!fVar.o(decoderInputBuffer)) {
                        r13 = r11 == true ? 1 : 0;
                        z13 = true;
                    }
                    z11 = true;
                    this.f18543x0 = true;
                    r10 = r11;
                }
                r10 = r13;
                z11 = z13;
            } else {
                r10 = r13;
                z11 = z13;
                o0(q10);
            }
            if (fVar.p()) {
                fVar.n();
            }
            return (fVar.p() || this.f18504I0 || this.f18545y0) ? z11 : r10;
        }
    }

    public abstract C1391i R(d dVar, n nVar, n nVar2);

    public MediaCodecDecoderException S(IllegalStateException illegalStateException, d dVar) {
        return new MediaCodecDecoderException(illegalStateException, dVar);
    }

    public final void T() {
        this.f18545y0 = false;
        this.f18544y.k();
        this.f18542x.k();
        this.f18543x0 = false;
        this.f18541w0 = false;
        r rVar = this.f18489B;
        rVar.getClass();
        rVar.f45161a = AudioProcessor.f17865a;
        rVar.f45163c = 0;
        rVar.f45162b = 2;
    }

    public final boolean U() throws ExoPlaybackException {
        if (this.f18494D0) {
            this.f18490B0 = 1;
            if (this.f18525V) {
                this.f18492C0 = 3;
                return false;
            }
            this.f18492C0 = 2;
        } else {
            I0();
        }
        return true;
    }

    public final boolean V(long j, long j10) throws ExoPlaybackException {
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        boolean zV0;
        int iJ;
        c cVar = this.f18509L;
        cVar.getClass();
        boolean z11 = this.f18534s0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f18546z;
        if (!z11) {
            if (this.f18526W && this.f18496E0) {
                try {
                    iJ = cVar.j(bufferInfo2);
                } catch (IllegalStateException unused) {
                    u0();
                    if (this.f18506J0) {
                        x0();
                    }
                    return false;
                }
            } else {
                iJ = cVar.j(bufferInfo2);
            }
            if (iJ < 0) {
                if (iJ == -2) {
                    this.f18498F0 = true;
                    c cVar2 = this.f18509L;
                    cVar2.getClass();
                    MediaFormat mediaFormatF = cVar2.f();
                    if (this.f18523T != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
                        this.f18528Y = true;
                    } else {
                        this.f18513N = mediaFormatF;
                        this.f18515O = true;
                    }
                    return true;
                }
                if (this.f18529Z && (this.f18504I0 || this.f18490B0 == 2)) {
                    u0();
                }
                long j11 = this.f18530p0;
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + 100;
                    this.f18368h.getClass();
                    if (j12 < System.currentTimeMillis()) {
                        u0();
                    }
                }
                return false;
            }
            if (this.f18528Y) {
                this.f18528Y = false;
                cVar.e(iJ);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                u0();
                return false;
            }
            this.f18534s0 = iJ;
            ByteBuffer byteBufferO = cVar.o(iJ);
            this.f18536t0 = byteBufferO;
            if (byteBufferO != null) {
                byteBufferO.position(bufferInfo2.offset);
                this.f18536t0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j13 = bufferInfo2.presentationTimeUs;
            this.f18538u0 = j13 < this.f18372m;
            long j14 = this.f18502H0;
            this.v0 = j14 != -9223372036854775807L && j14 <= j13;
            J0(j13);
        }
        if (this.f18526W && this.f18496E0) {
            try {
                ByteBuffer byteBuffer = this.f18536t0;
                int i10 = this.f18534s0;
                int i11 = bufferInfo2.flags;
                long j15 = bufferInfo2.presentationTimeUs;
                boolean z12 = this.f18538u0;
                boolean z13 = this.v0;
                n nVar = this.f18493D;
                nVar.getClass();
                z10 = false;
                try {
                    zV0 = v0(j, j10, cVar, byteBuffer, i10, i11, 1, j15, z12, z13, nVar);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    u0();
                    if (this.f18506J0) {
                        x0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer2 = this.f18536t0;
            int i12 = this.f18534s0;
            int i13 = bufferInfo2.flags;
            long j16 = bufferInfo2.presentationTimeUs;
            boolean z14 = this.f18538u0;
            boolean z15 = this.v0;
            n nVar2 = this.f18493D;
            nVar2.getClass();
            bufferInfo = bufferInfo2;
            zV0 = v0(j, j10, cVar, byteBuffer2, i12, i13, 1, j16, z14, z15, nVar2);
        }
        if (zV0) {
            r0(bufferInfo.presentationTimeUs);
            boolean z16 = (bufferInfo.flags & 4) != 0 ? true : z10;
            if (!z16 && this.f18496E0 && this.v0) {
                this.f18368h.getClass();
                this.f18530p0 = System.currentTimeMillis();
            }
            this.f18534s0 = -1;
            this.f18536t0 = null;
            if (!z16) {
                return r13;
            }
            u0();
        }
        return z10;
    }

    public final boolean W() throws ExoPlaybackException {
        c cVar = this.f18509L;
        if (cVar == null || this.f18490B0 == 2 || this.f18504I0) {
            return false;
        }
        int i10 = this.f18532r0;
        DecoderInputBuffer decoderInputBuffer = this.f18540w;
        if (i10 < 0) {
            int i11 = cVar.i();
            this.f18532r0 = i11;
            if (i11 < 0) {
                return false;
            }
            decoderInputBuffer.f17941e = cVar.m(i11);
            decoderInputBuffer.k();
        }
        if (this.f18490B0 == 1) {
            if (!this.f18529Z) {
                this.f18496E0 = true;
                cVar.c(this.f18532r0, 0, 4, 0L);
                this.f18532r0 = -1;
                decoderInputBuffer.f17941e = null;
            }
            this.f18490B0 = 2;
            return false;
        }
        if (this.f18527X) {
            this.f18527X = false;
            ByteBuffer byteBuffer = decoderInputBuffer.f17941e;
            byteBuffer.getClass();
            byteBuffer.put(f18486R0);
            cVar.c(this.f18532r0, 38, 0, 0L);
            this.f18532r0 = -1;
            decoderInputBuffer.f17941e = null;
            this.f18494D0 = true;
            return true;
        }
        if (this.f18488A0 == 1) {
            int i12 = 0;
            while (true) {
                n nVar = this.f18511M;
                nVar.getClass();
                if (i12 >= nVar.f35305q.size()) {
                    break;
                }
                byte[] bArr = this.f18511M.f35305q.get(i12);
                ByteBuffer byteBuffer2 = decoderInputBuffer.f17941e;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i12++;
            }
            this.f18488A0 = 2;
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f17941e;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        Q q10 = this.f18364d;
        q10.a();
        try {
            int iP = P(q10, decoderInputBuffer, 0);
            if (iP == -3) {
                if (h()) {
                    this.f18502H0 = this.f18500G0;
                }
                return false;
            }
            if (iP == -5) {
                if (this.f18488A0 == 2) {
                    decoderInputBuffer.k();
                    this.f18488A0 = 1;
                }
                o0(q10);
                return true;
            }
            if (decoderInputBuffer.g(4)) {
                this.f18502H0 = this.f18500G0;
                if (this.f18488A0 == 2) {
                    decoderInputBuffer.k();
                    this.f18488A0 = 1;
                }
                this.f18504I0 = true;
                if (!this.f18494D0) {
                    u0();
                    return false;
                }
                if (!this.f18529Z) {
                    this.f18496E0 = true;
                    cVar.c(this.f18532r0, 0, 4, 0L);
                    this.f18532r0 = -1;
                    decoderInputBuffer.f17941e = null;
                }
                return false;
            }
            if (!this.f18494D0 && !decoderInputBuffer.g(1)) {
                decoderInputBuffer.k();
                if (this.f18488A0 == 2) {
                    this.f18488A0 = 1;
                }
                return true;
            }
            if (D0(decoderInputBuffer)) {
                return true;
            }
            boolean zG = decoderInputBuffer.g(1073741824);
            if (zG) {
                p152m1.b bVar = decoderInputBuffer.f17940d;
                if (iPosition == 0) {
                    bVar.getClass();
                } else {
                    if (bVar.f44555d == null) {
                        int[] iArr = new int[1];
                        bVar.f44555d = iArr;
                        bVar.f44560i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = bVar.f44555d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            long j = decoderInputBuffer.f17943g;
            if (this.f18508K0) {
                ArrayDeque<b> arrayDeque = this.f18487A;
                if (arrayDeque.isEmpty()) {
                    v<n> vVar = this.f18516O0.f18553d;
                    n nVar2 = this.f18491C;
                    nVar2.getClass();
                    vVar.a(nVar2, j);
                } else {
                    v<n> vVar2 = arrayDeque.peekLast().f18553d;
                    n nVar3 = this.f18491C;
                    nVar3.getClass();
                    vVar2.a(nVar3, j);
                }
                this.f18508K0 = false;
            }
            this.f18500G0 = Math.max(this.f18500G0, j);
            if (h() || decoderInputBuffer.g(536870912)) {
                this.f18502H0 = this.f18500G0;
            }
            decoderInputBuffer.n();
            if (decoderInputBuffer.g(268435456)) {
                f0(decoderInputBuffer);
            }
            t0(decoderInputBuffer);
            int iA0 = a0(decoderInputBuffer);
            if (zG) {
                cVar.d(this.f18532r0, decoderInputBuffer.f17940d, j, iA0);
            } else {
                int i13 = this.f18532r0;
                ByteBuffer byteBuffer4 = decoderInputBuffer.f17941e;
                byteBuffer4.getClass();
                cVar.c(i13, byteBuffer4.limit(), iA0, j);
            }
            this.f18532r0 = -1;
            decoderInputBuffer.f17941e = null;
            this.f18494D0 = true;
            this.f18488A0 = 0;
            this.f18514N0.f18401c++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e10) {
            l0(e10);
            w0(0);
            X();
            return true;
        }
    }

    public final void X() {
        try {
            c cVar = this.f18509L;
            p241t7.b.l(cVar);
            cVar.flush();
        } finally {
            z0();
        }
    }

    public final boolean Y() {
        if (this.f18509L == null) {
            return false;
        }
        int i10 = this.f18492C0;
        if (i10 == 3 || ((this.f18524U && !this.f18498F0) || (this.f18525V && this.f18496E0))) {
            x0();
            return true;
        }
        if (i10 == 2) {
            int i11 = A.f40996a;
            p241t7.b.k(i11 >= 23);
            if (i11 >= 23) {
                try {
                    I0();
                } catch (ExoPlaybackException e10) {
                    k.g("Failed to update the DRM session, releasing the codec instead.", e10);
                    x0();
                    return true;
                }
            }
        }
        X();
        return false;
    }

    public final List<d> Z(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        n nVar = this.f18491C;
        nVar.getClass();
        E0 e10 = this.f18535t;
        ArrayList arrayListD0 = d0(e10, nVar, z10);
        if (arrayListD0.isEmpty() && z10) {
            arrayListD0 = d0(e10, nVar, false);
            if (!arrayListD0.isEmpty()) {
                k.f("Drm session requires secure decoder for " + nVar.f35302n + ", but no secure decoder available. Trying to proceed with " + arrayListD0 + ".");
            }
        }
        return arrayListD0;
    }

    public int a0(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.m0
    public boolean b() {
        boolean zB;
        if (this.f18491C == null) {
            return false;
        }
        if (h()) {
            zB = this.f18374o;
        } else {
            p235t1.r rVar = this.j;
            rVar.getClass();
            zB = rVar.b();
        }
        if (!zB) {
            if (!(this.f18534s0 >= 0)) {
                if (this.f18531q0 == -9223372036854775807L) {
                    return false;
                }
                this.f18368h.getClass();
                if (SystemClock.elapsedRealtime() >= this.f18531q0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean b0() {
        return false;
    }

    @Override // androidx.media3.exoplayer.n0
    public final int c(n nVar) throws ExoPlaybackException {
        try {
            return G0(this.f18535t, nVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw G(e10, nVar, false, 4002);
        }
    }

    public abstract float c0(float f10, n[] nVarArr);

    public abstract ArrayList d0(E0 e10, n nVar, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    public abstract c.a e0(d dVar, n nVar, MediaCrypto mediaCrypto, float f10);

    public abstract void f0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    public final void g0(d dVar, MediaCrypto mediaCrypto) throws Exception {
        float fC0;
        int i10;
        n nVar = this.f18491C;
        nVar.getClass();
        String str = dVar.f18575a;
        int i11 = A.f40996a;
        if (i11 < 23) {
            fC0 = -1.0f;
        } else {
            float f10 = this.f18507K;
            n[] nVarArr = this.f18370k;
            nVarArr.getClass();
            fC0 = c0(f10, nVarArr);
        }
        float f11 = fC0 > this.f18537u ? fC0 : -1.0f;
        this.f18368h.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c.a aVarE0 = e0(dVar, nVar, mediaCrypto, f11);
        if (i11 >= 31) {
            u uVar = this.f18367g;
            uVar.getClass();
            LogSessionId logSessionIdA = uVar.a();
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVarE0.f18570b.setString("log-session-id", logSessionIdA.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            c cVarA = this.f18533s.a(aVarE0);
            this.f18509L = cVarA;
            cVarA.p(new a());
            Trace.endSection();
            this.f18368h.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!dVar.e(nVar)) {
                String strD = n.d(nVar);
                Locale locale = Locale.US;
                k.f("Format exceeds selected codec's capabilities [" + strD + ", " + str + "]");
            }
            this.f18522S = dVar;
            this.f18517P = f11;
            this.f18511M = nVar;
            if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i10 = 2;
                } else if (i11 < 24) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if (i11 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i10 = 0;
            } else {
                String str3 = Build.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            }
            this.f18523T = i10;
            this.f18524U = i11 == 29 && "c2.android.aac.decoder".equals(str);
            this.f18525V = i11 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f18526W = i11 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = dVar.f18575a;
            this.f18529Z = (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && dVar.f18580f) || b0());
            this.f18509L.getClass();
            if (this.f18369i == 2) {
                this.f18368h.getClass();
                this.f18531q0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f18514N0.f18399a++;
            m0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean h0(long j, long j10) {
        n nVar;
        return j10 < j && ((nVar = this.f18493D) == null || !Objects.equals(nVar.f35302n, "audio/opus") || j - j10 > 80000);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0 A[Catch: DecoderInitializationException -> 0x00c0, TryCatch #0 {DecoderInitializationException -> 0x00c0, blocks: (B:55:0x00ac, B:57:0x00b0, B:59:0x00b7, B:64:0x00c2, B:68:0x00cf), top: B:78:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    public final void i0() throws ExoPlaybackException {
        n nVar;
        DrmSession drmSession;
        if (this.f18509L != null || this.f18541w0 || (nVar = this.f18491C) == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = this.f18497F == null && F0(nVar);
        String str = nVar.f35302n;
        if (z11) {
            T();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            p212r1.f fVar = this.f18544y;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                fVar.getClass();
                fVar.f46304l = 32;
            } else {
                fVar.getClass();
                fVar.f46304l = 1;
            }
            this.f18541w0 = true;
            return;
        }
        B0(this.f18497F);
        if (this.f18495E == null) {
            try {
                drmSession = this.f18495E;
                if (drmSession == null && (drmSession.getState() == 3 || this.f18495E.getState() == 4)) {
                    DrmSession drmSession2 = this.f18495E;
                    p241t7.b.l(str);
                    if (!drmSession2.e(str)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                j0(this.f18501H, z10);
            } catch (DecoderInitializationException e10) {
                throw G(e10, nVar, false, 4001);
            }
        } else {
            p241t7.b.k(this.f18501H == null);
            DrmSession drmSession3 = this.f18495E;
            p152m1.a aVarG = drmSession3.g();
            if (p187p1.b.f45797a && (aVarG instanceof p187p1.b)) {
                int state = drmSession3.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionExceptionF = drmSession3.f();
                    drmSessionExceptionF.getClass();
                    throw G(drmSessionExceptionF, this.f18491C, false, drmSessionExceptionF.errorCode);
                }
                if (state == 4) {
                    if (aVarG == null) {
                        if (drmSession3.f() != null) {
                        }
                    } else if (aVarG instanceof p187p1.b) {
                        this.f18501H = new MediaCrypto(null, null);
                    }
                    drmSession = this.f18495E;
                    if (drmSession == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    j0(this.f18501H, z10);
                }
            } else {
                if (aVarG == null) {
                    if (drmSession3.f() != null) {
                    }
                } else if (aVarG instanceof p187p1.b) {
                    try {
                        this.f18501H = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e11) {
                        throw G(e11, this.f18491C, false, 6006);
                    }
                }
                drmSession = this.f18495E;
                if (drmSession == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                j0(this.f18501H, z10);
            }
        }
        MediaCrypto mediaCrypto = this.f18501H;
        if (mediaCrypto == null || this.f18509L != null) {
            return;
        }
        mediaCrypto.release();
        this.f18501H = null;
    }

    public final void j0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException, ExoPlaybackException {
        n nVar = this.f18491C;
        nVar.getClass();
        if (this.f18519Q == null) {
            try {
                List<d> listZ = Z(z10);
                this.f18519Q = new ArrayDeque<>();
                if (!listZ.isEmpty()) {
                    this.f18519Q.add(listZ.get(0));
                }
                this.f18521R = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(nVar, e10, z10, -49998);
            }
        }
        if (this.f18519Q.isEmpty()) {
            throw new DecoderInitializationException(nVar, null, z10, -49999);
        }
        ArrayDeque<d> arrayDeque = this.f18519Q;
        arrayDeque.getClass();
        while (this.f18509L == null) {
            d dVarPeekFirst = arrayDeque.peekFirst();
            dVarPeekFirst.getClass();
            if (!k0(nVar) || !E0(dVarPeekFirst)) {
                return;
            }
            try {
                g0(dVarPeekFirst, mediaCrypto);
            } catch (Exception e11) {
                k.g("Failed to initialize decoder: " + dVarPeekFirst, e11);
                arrayDeque.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException("Decoder init failed: " + dVarPeekFirst.f18575a + ", " + nVar, e11, nVar.f35302n, z10, dVarPeekFirst, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null, null);
                l0(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.f18521R;
                if (decoderInitializationException2 == null) {
                    this.f18521R = decoderInitializationException;
                } else {
                    this.f18521R = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.mimeType, decoderInitializationException2.secureDecoderRequired, decoderInitializationException2.codecInfo, decoderInitializationException2.diagnosticInfo, decoderInitializationException);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f18521R;
                }
            }
        }
        this.f18519Q = null;
    }

    public boolean k0(n nVar) throws ExoPlaybackException {
        return true;
    }

    public abstract void l0(Exception exc);

    public abstract void m0(String str, long j, long j10);

    public abstract void n0(String str);

    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.e(r3) != false) goto L134;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.C1391i o0(androidx.media3.exoplayer.Q r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.o0(androidx.media3.exoplayer.Q):androidx.media3.exoplayer.i");
    }

    public abstract void p0(n nVar, MediaFormat mediaFormat) throws ExoPlaybackException;

    public void r0(long j) {
        this.f18518P0 = j;
        while (true) {
            ArrayDeque<b> arrayDeque = this.f18487A;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().f18550a) {
                return;
            }
            b bVarPoll = arrayDeque.poll();
            bVarPoll.getClass();
            C0(bVarPoll);
            s0();
        }
    }

    @Override // androidx.media3.exoplayer.m0
    public void s(float f10, float f11) throws ExoPlaybackException {
        this.f18505J = f10;
        this.f18507K = f11;
        H0(this.f18511M);
    }

    public abstract void s0();

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.n0
    public final int u() {
        return 8;
    }

    public final void u0() throws ExoPlaybackException {
        int i10 = this.f18492C0;
        if (i10 == 1) {
            X();
            return;
        }
        if (i10 == 2) {
            X();
            I0();
        } else if (i10 != 3) {
            this.f18506J0 = true;
            y0();
        } else {
            x0();
            i0();
        }
    }

    @Override // androidx.media3.exoplayer.m0
    public void v(long j, long j10) throws ExoPlaybackException {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.f18510L0) {
            this.f18510L0 = false;
            u0();
        }
        ExoPlaybackException exoPlaybackException = this.f18512M0;
        if (exoPlaybackException != null) {
            this.f18512M0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f18506J0) {
                y0();
                return;
            }
            if (this.f18491C != null || w0(2)) {
                i0();
                if (this.f18541w0) {
                    Trace.beginSection("bypassRender");
                    while (Q(j, j10)) {
                    }
                    Trace.endSection();
                } else if (this.f18509L != null) {
                    this.f18368h.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (V(j, j10)) {
                        long j11 = this.f18503I;
                        if (j11 != -9223372036854775807L) {
                            this.f18368h.getClass();
                            z11 = SystemClock.elapsedRealtime() - jElapsedRealtime < j11;
                        }
                        if (!z11) {
                            break;
                        }
                    }
                    while (W()) {
                        long j12 = this.f18503I;
                        if (j12 != -9223372036854775807L) {
                            this.f18368h.getClass();
                            z10 = SystemClock.elapsedRealtime() - jElapsedRealtime < j12;
                        }
                        if (!z10) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    C1390h c1390h = this.f18514N0;
                    int i10 = c1390h.f18402d;
                    p235t1.r rVar = this.j;
                    rVar.getClass();
                    c1390h.f18402d = i10 + rVar.c(j - this.f18371l);
                    w0(1);
                }
                synchronized (this.f18514N0) {
                }
            }
        } catch (MediaCodec.CryptoException e10) {
            throw G(e10, this.f18491C, false, A.q(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            boolean z13 = e11 instanceof MediaCodec.CodecException;
            if (!z13) {
                StackTraceElement[] stackTrace = e11.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e11;
                }
            }
            l0(e11);
            if (z13 && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z12 = true;
            }
            if (z12) {
                x0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionS = S(e11, this.f18522S);
            throw G(mediaCodecDecoderExceptionS, this.f18491C, z12, mediaCodecDecoderExceptionS.errorCode == 1101 ? 4006 : 4003);
        }
    }

    public abstract boolean v0(long j, long j10, c cVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, n nVar) throws ExoPlaybackException;

    public final boolean w0(int i10) throws ExoPlaybackException {
        Q q10 = this.f18364d;
        q10.a();
        DecoderInputBuffer decoderInputBuffer = this.f18539v;
        decoderInputBuffer.k();
        int iP = P(q10, decoderInputBuffer, i10 | 4);
        if (iP == -5) {
            o0(q10);
            return true;
        }
        if (iP != -4 || !decoderInputBuffer.g(4)) {
            return false;
        }
        this.f18504I0 = true;
        u0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0() {
        try {
            c cVar = this.f18509L;
            if (cVar != null) {
                cVar.a();
                this.f18514N0.f18400b++;
                d dVar = this.f18522S;
                dVar.getClass();
                n0(dVar.f18575a);
            }
            this.f18509L = null;
            try {
                MediaCrypto mediaCrypto = this.f18501H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f18501H = null;
                B0(null);
                A0();
            }
        } catch (Throwable th) {
            this.f18509L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f18501H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f18501H = null;
                B0(null);
                A0();
            }
        }
    }

    public abstract void y0() throws ExoPlaybackException;

    public void z0() {
        this.f18532r0 = -1;
        this.f18540w.f17941e = null;
        this.f18534s0 = -1;
        this.f18536t0 = null;
        this.f18531q0 = -9223372036854775807L;
        this.f18496E0 = false;
        this.f18530p0 = -9223372036854775807L;
        this.f18494D0 = false;
        this.f18527X = false;
        this.f18528Y = false;
        this.f18538u0 = false;
        this.v0 = false;
        this.f18500G0 = -9223372036854775807L;
        this.f18502H0 = -9223372036854775807L;
        this.f18518P0 = -9223372036854775807L;
        this.f18490B0 = 0;
        this.f18492C0 = 0;
        this.f18488A0 = this.f18547z0 ? 1 : 0;
    }

    public static class DecoderInitializationException extends Exception {
        public final d codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(n nVar, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + nVar, decoderQueryException, nVar.f35302n, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10), null);
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z10, d dVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z10;
            this.codecInfo = dVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public void q0(long j) {
    }

    public void t0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }
}
