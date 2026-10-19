package androidx.media3.exoplayer.audio;

import B8.E0;
import T5.h;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.r;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.V;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.C1391i;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.o0;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.RunnableC2056t;
import com.google.firebase.messaging.RunnableC2057u;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p078g1.C2198d;
import p078g1.C2199e;
import p078g1.n;
import p078g1.t;
import p090h1.e;
import p114j1.A;
import p114j1.k;
import p162n1.u;
import p175o1.j;
import p175o1.m;
import p212r1.l;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends MediaCodecRenderer implements U {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final Context f18298S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final j f18299T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final DefaultAudioSink f18300U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final l f18301V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public int f18302W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f18303X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public boolean f18304Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public n f18305Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public n f18306a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f18307b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f18308c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f18309d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f18310e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f18311f1;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class a {
        public a() {
        }

        public final void a(Exception exc) {
            k.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            j jVar = c.this.f18299T0;
            Handler handler = jVar.f45099a;
            if (handler != null) {
                handler.post(new RunnableC2057u(jVar, 1, exc));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, Handler handler, K.a aVar, DefaultAudioSink defaultAudioSink) {
        super(1, bVar, 44100.0f);
        l lVar = A.f40996a >= 35 ? new l() : null;
        this.f18298S0 = context.getApplicationContext();
        this.f18300U0 = defaultAudioSink;
        this.f18301V0 = lVar;
        this.f18311f1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f18299T0 = new j(handler, aVar);
        defaultAudioSink.f18251r = new a();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean F0(n nVar) {
        o0 o0Var = this.f18365e;
        o0Var.getClass();
        if (o0Var.f18590a != 0) {
            int iK0 = K0(nVar);
            if ((iK0 & 512) != 0) {
                o0 o0Var2 = this.f18365e;
                o0Var2.getClass();
                if (o0Var2.f18590a == 2 || (iK0 & 1024) != 0) {
                    return true;
                }
                if (nVar.f35282G == 0 && nVar.f35283H == 0) {
                    return true;
                }
            }
        }
        return this.f18300U0.y(nVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int G0(E0 e10, n nVar) throws MediaCodecUtil.DecoderQueryException {
        int iK0;
        List listG;
        d dVar;
        boolean z10;
        if (!t.i(nVar.f35302n)) {
            return n0.n(0, 0, 0, 0);
        }
        boolean z11 = true;
        int i10 = nVar.f35288M;
        boolean z12 = i10 != 0;
        boolean z13 = i10 == 0 || i10 == 2;
        int i11 = 8;
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        if (z13) {
            if (z12) {
                List<d> listE = MediaCodecUtil.e("audio/raw", false, false);
                if ((listE.isEmpty() ? null : listE.get(0)) == null) {
                    iK0 = 0;
                }
            }
            iK0 = K0(nVar);
            if (defaultAudioSink.y(nVar)) {
                return n0.n(4, 8, 32, iK0);
            }
        } else {
            iK0 = 0;
        }
        String str = nVar.f35302n;
        if ("audio/raw".equals(str) && !defaultAudioSink.y(nVar)) {
            return n0.n(1, 0, 0, 0);
        }
        n.a aVar = new n.a();
        aVar.f35338m = t.m("audio/raw");
        aVar.f35317C = nVar.f35279D;
        aVar.f35318D = nVar.f35280E;
        aVar.f35319E = 2;
        if (!defaultAudioSink.y(new n(aVar))) {
            return n0.n(1, 0, 0, 0);
        }
        if (str == null) {
            listG = ImmutableList.K();
        } else if (defaultAudioSink.y(nVar)) {
            List<d> listE2 = MediaCodecUtil.e("audio/raw", false, false);
            d dVar2 = listE2.isEmpty() ? null : listE2.get(0);
            if (dVar2 != null) {
                listG = ImmutableList.M(dVar2);
            } else {
                listG = MediaCodecUtil.g(e10, nVar, false, false);
            }
        } else {
            listG = MediaCodecUtil.g(e10, nVar, false, false);
        }
        if (((AbstractCollection) listG).isEmpty()) {
            return n0.n(1, 0, 0, 0);
        }
        if (!z13) {
            return n0.n(2, 0, 0, 0);
        }
        d dVar3 = (d) listG.get(0);
        boolean zE = dVar3.e(nVar);
        if (!zE) {
            int i12 = 1;
            while (true) {
                if (i12 >= listG.size()) {
                    dVar = dVar3;
                    z10 = true;
                    z11 = zE;
                    break;
                }
                dVar = (d) listG.get(i12);
                if (dVar.e(nVar)) {
                    z10 = false;
                    break;
                }
                i12++;
            }
        } else {
            dVar = dVar3;
            z10 = true;
            z11 = zE;
            break;
        }
        int i13 = z11 ? 4 : 3;
        if (z11 && dVar.f(nVar)) {
            i11 = 16;
        }
        return (dVar.f18581g ? 64 : 0) | i13 | i11 | 32 | (z10 ? 128 : 0) | iK0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC1389g
    public final void H() {
        j jVar = this.f18299T0;
        this.f18309d1 = true;
        this.f18305Z0 = null;
        try {
            this.f18300U0.g();
            try {
                super.H();
            } finally {
                jVar.a(this.f18514N0);
            }
        } catch (Throwable th) {
            try {
                super.H();
                throw th;
            } finally {
                jVar.a(this.f18514N0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void I(boolean z10, boolean z11) throws ExoPlaybackException {
        C1390h c1390h = new C1390h();
        this.f18514N0 = c1390h;
        j jVar = this.f18299T0;
        Handler handler = jVar.f45099a;
        if (handler != null) {
            handler.post(new RunnableC2056t(jVar, 3, c1390h));
        }
        o0 o0Var = this.f18365e;
        o0Var.getClass();
        boolean z12 = o0Var.f18591b;
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        if (z12) {
            p241t7.b.k(defaultAudioSink.f18222W);
            if (!defaultAudioSink.f18227a0) {
                defaultAudioSink.f18227a0 = true;
                defaultAudioSink.g();
            }
        } else if (defaultAudioSink.f18227a0) {
            defaultAudioSink.f18227a0 = false;
            defaultAudioSink.g();
        }
        u uVar = this.f18367g;
        uVar.getClass();
        defaultAudioSink.f18250q = uVar;
        p114j1.t tVar = this.f18368h;
        tVar.getClass();
        defaultAudioSink.f18238g.f45128I = tVar;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC1389g
    public final void J(long j, boolean z10) throws ExoPlaybackException {
        super.J(j, z10);
        this.f18300U0.g();
        this.f18307b1 = j;
        this.f18310e1 = false;
        this.f18308c1 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void K() {
        l lVar;
        o1.b.a aVar;
        p175o1.b bVar = this.f18300U0.f18257x;
        if (bVar != null && bVar.j) {
            bVar.f45067g = null;
            int i10 = A.f40996a;
            Context context = bVar.f45061a;
            if (i10 >= 23 && (aVar = bVar.f45064d) != null) {
                p090h1.d.a(context).unregisterAudioDeviceCallback(aVar);
            }
            context.unregisterReceiver(bVar.f45065e);
            p175o1.b.C0513b c0513b = bVar.f45066f;
            if (c0513b != null) {
                c0513b.f45071a.unregisterContentObserver(c0513b);
            }
            bVar.j = false;
        }
        if (A.f40996a < 35 || (lVar = this.f18301V0) == null) {
            return;
        }
        lVar.f46306a.clear();
        LoudnessCodecController loudnessCodecController = lVar.f46308c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final int K0(n nVar) {
        p175o1.c cVarH = this.f18300U0.h(nVar);
        if (!cVarH.f45076a) {
            return 0;
        }
        int i10 = cVarH.f45077b ? 1536 : 512;
        return cVarH.f45078c ? i10 | 2048 : i10;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void L() {
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        this.f18310e1 = false;
        try {
            try {
                T();
                x0();
                DrmSession drmSession = this.f18497F;
                if (drmSession != null) {
                    drmSession.d(null);
                }
                this.f18497F = null;
                if (this.f18309d1) {
                    this.f18309d1 = false;
                    defaultAudioSink.u();
                }
            } catch (Throwable th) {
                DrmSession drmSession2 = this.f18497F;
                if (drmSession2 != null) {
                    drmSession2.d(null);
                }
                this.f18497F = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f18309d1) {
                this.f18309d1 = false;
                defaultAudioSink.u();
            }
            throw th2;
        }
    }

    public final int L0(d dVar, n nVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(dVar.f18575a) || (i10 = A.f40996a) >= 24 || (i10 == 23 && A.E(this.f18298S0))) {
            return nVar.f35303o;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void M() {
        this.f18300U0.r();
    }

    public final void M0() {
        long jMax;
        ArrayDeque<DefaultAudioSink.f> arrayDeque;
        long j;
        long jL;
        d();
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        if (!defaultAudioSink.o() || defaultAudioSink.f18212M) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(defaultAudioSink.f18238g.a(), A.J(defaultAudioSink.f18253t.f18273e, defaultAudioSink.k()));
            while (true) {
                arrayDeque = defaultAudioSink.f18240h;
                if (arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().f18285c) {
                    break;
                } else {
                    defaultAudioSink.f18201B = arrayDeque.remove();
                }
            }
            DefaultAudioSink.f fVar = defaultAudioSink.f18201B;
            long j10 = jMin - fVar.f18285c;
            long jS = A.s(fVar.f18283a.f35452a, j10);
            boolean zIsEmpty = arrayDeque.isEmpty();
            DefaultAudioSink.e eVar = defaultAudioSink.f18228b;
            if (zIsEmpty) {
                androidx.media3.common.audio.c cVar = eVar.f18282c;
                if (cVar.c()) {
                    if (cVar.f17894o >= 1024) {
                        long j11 = cVar.f17893n;
                        e eVar2 = cVar.j;
                        eVar2.getClass();
                        long j12 = j11 - ((long) ((eVar2.f35742k * eVar2.f35734b) * 2));
                        int i10 = cVar.f17888h.f17867a;
                        int i11 = cVar.f17887g.f17867a;
                        jL = i10 == i11 ? A.L(j10, j12, cVar.f17894o, RoundingMode.DOWN) : A.L(j10, j12 * ((long) i10), cVar.f17894o * ((long) i11), RoundingMode.DOWN);
                    } else {
                        jL = (long) (((double) cVar.f17883c) * j10);
                    }
                    j10 = jL;
                }
                DefaultAudioSink.f fVar2 = defaultAudioSink.f18201B;
                j = fVar2.f18284b + j10;
                fVar2.f18286d = j10 - jS;
            } else {
                DefaultAudioSink.f fVar3 = defaultAudioSink.f18201B;
                j = fVar3.f18284b + jS + fVar3.f18286d;
            }
            long j13 = eVar.f18281b.f45171q;
            jMax = A.J(defaultAudioSink.f18253t.f18273e, j13) + j;
            long j14 = defaultAudioSink.f18239g0;
            if (j13 > j14) {
                long J10 = A.J(defaultAudioSink.f18253t.f18273e, j13 - j14);
                defaultAudioSink.f18239g0 = j13;
                defaultAudioSink.f18241h0 += J10;
                if (defaultAudioSink.f18243i0 == null) {
                    defaultAudioSink.f18243i0 = new Handler(Looper.myLooper());
                }
                defaultAudioSink.f18243i0.removeCallbacksAndMessages(null);
                defaultAudioSink.f18243i0.postDelayed(new h(5, defaultAudioSink), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f18308c1) {
                jMax = Math.max(this.f18307b1, jMax);
            }
            this.f18307b1 = jMax;
            this.f18308c1 = false;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void N() {
        M0();
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        defaultAudioSink.f18221V = false;
        if (defaultAudioSink.o()) {
            m mVar = defaultAudioSink.f18238g;
            mVar.e();
            if (mVar.f45151x == -9223372036854775807L) {
                p175o1.l lVar = mVar.f45133e;
                lVar.getClass();
                lVar.a();
            } else {
                mVar.f45153z = mVar.b();
                if (!DefaultAudioSink.p(defaultAudioSink.f18255v)) {
                    return;
                }
            }
            defaultAudioSink.f18255v.pause();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final C1391i R(d dVar, n nVar, n nVar2) {
        C1391i c1391iB = dVar.b(nVar, nVar2);
        boolean z10 = this.f18497F == null && F0(nVar2);
        int i10 = c1391iB.f18434e;
        if (z10) {
            i10 |= 32768;
        }
        if (L0(dVar, nVar2) > this.f18302W0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C1391i(dVar.f18575a, nVar, nVar2, i11 == 0 ? c1391iB.f18433d : 0, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.m0
    public final boolean b() {
        return this.f18300U0.m() || super.b();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float c0(float f10, n[] nVarArr) {
        int iMax = -1;
        for (n nVar : nVarArr) {
            int i10 = nVar.f35280E;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.m0
    public final boolean d() {
        if (this.f18506J0) {
            DefaultAudioSink defaultAudioSink = this.f18300U0;
            if (!defaultAudioSink.o() || (defaultAudioSink.f18218S && !defaultAudioSink.m())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList d0(E0 e10, n nVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        Collection collectionG;
        if (nVar.f35302n == null) {
            collectionG = ImmutableList.K();
        } else if (this.f18300U0.y(nVar)) {
            List<d> listE = MediaCodecUtil.e("audio/raw", false, false);
            d dVar = listE.isEmpty() ? null : listE.get(0);
            if (dVar != null) {
                collectionG = ImmutableList.M(dVar);
            } else {
                collectionG = MediaCodecUtil.g(e10, nVar, z10, false);
            }
        } else {
            collectionG = MediaCodecUtil.g(e10, nVar, z10, false);
        }
        HashMap<MediaCodecUtil.a, List<d>> map = MediaCodecUtil.f18554a;
        ArrayList arrayList = new ArrayList(collectionG);
        Collections.sort(arrayList, new r(1, new F1.a(7, nVar)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.U
    public final void e(p078g1.u uVar) {
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        defaultAudioSink.getClass();
        defaultAudioSink.f18202C = new p078g1.u(A.f(uVar.f35452a, 0.1f, 8.0f), A.f(uVar.f35453b, 0.1f, 8.0f));
        if (defaultAudioSink.z()) {
            defaultAudioSink.v();
            return;
        }
        DefaultAudioSink.f fVar = new DefaultAudioSink.f(uVar, -9223372036854775807L, -9223372036854775807L);
        if (defaultAudioSink.o()) {
            defaultAudioSink.f18200A = fVar;
        } else {
            defaultAudioSink.f18201B = fVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final androidx.media3.exoplayer.mediacodec.c.a e0(d dVar, n nVar, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        n[] nVarArr = this.f18370k;
        nVarArr.getClass();
        int iL0 = L0(dVar, nVar);
        if (nVarArr.length != 1) {
            for (n nVar2 : nVarArr) {
                if (dVar.b(nVar, nVar2).f18433d != 0) {
                    iL0 = Math.max(iL0, L0(dVar, nVar2));
                }
            }
        }
        this.f18302W0 = iL0;
        int i10 = A.f40996a;
        String str = dVar.f18575a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f18303X0 = z10;
        this.f18304Y0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i11 = this.f18302W0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", dVar.f18577c);
        mediaFormat.setInteger("channel-count", nVar.f35279D);
        int i12 = nVar.f35280E;
        mediaFormat.setInteger("sample-rate", i12);
        p114j1.m.b(mediaFormat, nVar.f35305q);
        p114j1.m.a(mediaFormat, "max-input-size", i11);
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                if (i10 == 23) {
                    String str3 = Build.MODEL;
                    if (!"ZTE B2017G".equals(str3) && !"AXON 7 mini".equals(str3)) {
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f10);
                }
            }
        }
        String str4 = nVar.f35302n;
        if (i10 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
            n.a aVar = new n.a();
            aVar.f35338m = t.m("audio/raw");
            aVar.f35317C = nVar.f35279D;
            aVar.f35318D = i12;
            aVar.f35319E = 4;
            if (this.f18300U0.i(new n(aVar)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f18311f1));
        }
        this.f18306a1 = (!"audio/raw".equals(dVar.f18576b) || "audio/raw".equals(str4)) ? null : nVar;
        return new androidx.media3.exoplayer.mediacodec.c.a(dVar, mediaFormat, nVar, null, mediaCrypto, this.f18301V0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0(DecoderInputBuffer decoderInputBuffer) {
        n nVar;
        DefaultAudioSink.d dVar;
        if (A.f40996a < 29 || (nVar = decoderInputBuffer.f17939c) == null || !Objects.equals(nVar.f35302n, "audio/opus") || !this.f18541w0) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f17944h;
        byteBuffer.getClass();
        n nVar2 = decoderInputBuffer.f17939c;
        nVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            DefaultAudioSink defaultAudioSink = this.f18300U0;
            AudioTrack audioTrack = defaultAudioSink.f18255v;
            if (audioTrack == null || !DefaultAudioSink.p(audioTrack) || (dVar = defaultAudioSink.f18253t) == null || !dVar.f18278k) {
                return;
            }
            defaultAudioSink.f18255v.setOffloadDelayPadding(nVar2.f35282G, i10);
        }
    }

    @Override // androidx.media3.exoplayer.U
    public final p078g1.u g() {
        return this.f18300U0.f18202C;
    }

    @Override // androidx.media3.exoplayer.m0, androidx.media3.exoplayer.n0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0(final Exception exc) {
        k.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        final j jVar = this.f18299T0;
        Handler handler = jVar.f45099a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o1.d
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar2 = jVar;
                    jVar2.getClass();
                    int i10 = A.f40996a;
                    K.a aVar = jVar2.f45100b;
                    K.this.f18039s.U(exc);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0(final String str, final long j, final long j10) {
        final j jVar = this.f18299T0;
        Handler handler = jVar.f45099a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o1.f
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar2 = jVar;
                    jVar2.getClass();
                    int i10 = A.f40996a;
                    K.this.f18039s.v(str, j, j10);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void n0(String str) {
        j jVar = this.f18299T0;
        Handler handler = jVar.f45099a;
        if (handler != null) {
            handler.post(new V(jVar, 2, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final C1391i o0(Q q10) throws ExoPlaybackException {
        final n nVar = (n) q10.f18136b;
        nVar.getClass();
        this.f18305Z0 = nVar;
        final C1391i c1391iO0 = super.o0(q10);
        final j jVar = this.f18299T0;
        Handler handler = jVar.f45099a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o1.g
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar2 = jVar;
                    jVar2.getClass();
                    int i10 = A.f40996a;
                    K k10 = K.this;
                    k10.getClass();
                    k10.f18039s.B(nVar, c1391iO0);
                }
            });
        }
        return c1391iO0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fb A[Catch: AudioSink$ConfigurationException -> 0x00f9, TryCatch #0 {AudioSink$ConfigurationException -> 0x00f9, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:52:0x00fb, B:53:0x00fe), top: B:57:0x00d9 }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void p0(n nVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iT;
        int i10;
        n nVar2 = this.f18306a1;
        int[] iArr = null;
        if (nVar2 != null) {
            nVar = nVar2;
        } else if (this.f18509L != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(nVar.f35302n)) {
                iT = nVar.f35281F;
            } else if (A.f40996a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iT = mediaFormat.containsKey("v-bits-per-sample") ? A.t(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iT = mediaFormat.getInteger("pcm-encoding");
            }
            n.a aVar = new n.a();
            aVar.f35338m = t.m("audio/raw");
            aVar.f35319E = iT;
            aVar.f35320F = nVar.f35282G;
            aVar.f35321G = nVar.f35283H;
            aVar.f35336k = nVar.f35300l;
            aVar.f35327a = nVar.f35290a;
            aVar.f35328b = nVar.f35291b;
            aVar.f35329c = ImmutableList.G(nVar.f35292c);
            aVar.f35330d = nVar.f35293d;
            aVar.f35331e = nVar.f35294e;
            aVar.f35332f = nVar.f35295f;
            aVar.f35317C = mediaFormat.getInteger("channel-count");
            aVar.f35318D = mediaFormat.getInteger("sample-rate");
            n nVar3 = new n(aVar);
            boolean z10 = this.f18303X0;
            int i11 = nVar3.f35279D;
            if (z10 && i11 == 6 && (i10 = nVar.f35279D) < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f18304Y0) {
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            nVar = nVar3;
        }
        try {
            int i13 = A.f40996a;
            DefaultAudioSink defaultAudioSink = this.f18300U0;
            if (i13 >= 29) {
                if (this.f18541w0) {
                    o0 o0Var = this.f18365e;
                    o0Var.getClass();
                    if (o0Var.f18590a != 0) {
                        o0 o0Var2 = this.f18365e;
                        o0Var2.getClass();
                        defaultAudioSink.w(o0Var2.f18590a);
                    } else {
                        defaultAudioSink.w(0);
                    }
                } else {
                    defaultAudioSink.w(0);
                }
            }
            defaultAudioSink.d(nVar, iArr);
        } catch (AudioSink$ConfigurationException e10) {
            throw G(e10, e10.format, false, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void q0(long j) {
        this.f18300U0.getClass();
    }

    @Override // androidx.media3.exoplayer.U
    public final long r() {
        if (this.f18369i == 2) {
            M0();
        }
        return this.f18307b1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void s0() {
        this.f18300U0.f18211L = true;
    }

    @Override // androidx.media3.exoplayer.U
    public final boolean t() {
        boolean z10 = this.f18310e1;
        this.f18310e1 = false;
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean v0(long j, long j10, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, n nVar) throws ExoPlaybackException {
        int i13;
        int i14;
        byteBuffer.getClass();
        if (this.f18306a1 != null && (i11 & 2) != 0) {
            cVar.getClass();
            cVar.e(i10);
            return true;
        }
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        if (z10) {
            if (cVar != null) {
                cVar.e(i10);
            }
            this.f18514N0.f18404f += i12;
            defaultAudioSink.f18211L = true;
            return true;
        }
        try {
            if (!defaultAudioSink.l(byteBuffer, j11, i12)) {
                return false;
            }
            if (cVar != null) {
                cVar.e(i10);
            }
            this.f18514N0.f18403e += i12;
            return true;
        } catch (AudioSink$InitializationException e10) {
            n nVar2 = this.f18305Z0;
            boolean z12 = e10.isRecoverable;
            if (this.f18541w0) {
                o0 o0Var = this.f18365e;
                o0Var.getClass();
                if (o0Var.f18590a != 0) {
                    i14 = 5004;
                } else {
                    i14 = 5001;
                }
            } else {
                i14 = 5001;
            }
            throw G(e10, nVar2, z12, i14);
        } catch (AudioSink$WriteException e11) {
            boolean z13 = e11.isRecoverable;
            if (this.f18541w0) {
                o0 o0Var2 = this.f18365e;
                o0Var2.getClass();
                if (o0Var2.f18590a != 0) {
                    i13 = 5003;
                } else {
                    i13 = 5002;
                }
            } else {
                i13 = 5002;
            }
            throw G(e11, nVar, z13, i13);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.j0.b
    public final void x(int i10, Object obj) throws ExoPlaybackException {
        com.google.android.play.integrity.internal.k kVar;
        l lVar;
        DefaultAudioSink defaultAudioSink = this.f18300U0;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (defaultAudioSink.f18214O != fFloatValue) {
                defaultAudioSink.f18214O = fFloatValue;
                if (defaultAudioSink.o()) {
                    defaultAudioSink.f18255v.setVolume(defaultAudioSink.f18214O);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            C2198d c2198d = (C2198d) obj;
            c2198d.getClass();
            if (defaultAudioSink.f18259z.equals(c2198d)) {
                return;
            }
            defaultAudioSink.f18259z = c2198d;
            if (defaultAudioSink.f18227a0) {
                return;
            }
            p175o1.b bVar = defaultAudioSink.f18257x;
            if (bVar != null) {
                bVar.f45069i = c2198d;
                bVar.a(p175o1.a.c(bVar.f45061a, c2198d, bVar.f45068h));
            }
            defaultAudioSink.g();
            return;
        }
        if (i10 == 6) {
            C2199e c2199e = (C2199e) obj;
            c2199e.getClass();
            if (defaultAudioSink.f18224Y.equals(c2199e)) {
                return;
            }
            if (defaultAudioSink.f18255v != null) {
                defaultAudioSink.f18224Y.getClass();
            }
            defaultAudioSink.f18224Y = c2199e;
            return;
        }
        if (i10 == 12) {
            if (A.f40996a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    kVar = null;
                } else {
                    defaultAudioSink.getClass();
                    kVar = new com.google.android.play.integrity.internal.k(audioDeviceInfo);
                }
                defaultAudioSink.f18225Z = kVar;
                p175o1.b bVar2 = defaultAudioSink.f18257x;
                if (bVar2 != null) {
                    bVar2.b(audioDeviceInfo);
                }
                AudioTrack audioTrack = defaultAudioSink.f18255v;
                if (audioTrack != null) {
                    com.google.android.play.integrity.internal.k kVar2 = defaultAudioSink.f18225Z;
                    audioTrack.setPreferredDevice(kVar2 != null ? (AudioDeviceInfo) kVar2.f27754b : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f18311f1 = ((Integer) obj).intValue();
            androidx.media3.exoplayer.mediacodec.c cVar = this.f18509L;
            if (cVar != null && A.f40996a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f18311f1));
                cVar.b(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            defaultAudioSink.f18203D = ((Boolean) obj).booleanValue();
            DefaultAudioSink.f fVar = new DefaultAudioSink.f(defaultAudioSink.z() ? p078g1.u.f35451d : defaultAudioSink.f18202C, -9223372036854775807L, -9223372036854775807L);
            if (defaultAudioSink.o()) {
                defaultAudioSink.f18200A = fVar;
                return;
            } else {
                defaultAudioSink.f18201B = fVar;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                m0.a aVar = (m0.a) obj;
                aVar.getClass();
                this.f18499G = aVar;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (defaultAudioSink.f18223X != iIntValue) {
            defaultAudioSink.f18223X = iIntValue;
            defaultAudioSink.f18222W = iIntValue != 0;
            defaultAudioSink.g();
        }
        if (A.f40996a < 35 || (lVar = this.f18301V0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = lVar.f46308c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            lVar.f46308c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, com.google.common.util.concurrent.a.a(), new p212r1.k(lVar));
        lVar.f46308c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = lVar.f46306a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void y0() throws ExoPlaybackException {
        try {
            DefaultAudioSink defaultAudioSink = this.f18300U0;
            if (!defaultAudioSink.f18218S && defaultAudioSink.o() && defaultAudioSink.f()) {
                defaultAudioSink.s();
                defaultAudioSink.f18218S = true;
            }
        } catch (AudioSink$WriteException e10) {
            throw G(e10, e10.format, e10.isRecoverable, this.f18541w0 ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.m0
    public final U D() {
        return this;
    }
}
