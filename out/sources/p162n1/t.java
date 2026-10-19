package p162n1;

import E7.d;
import I4.c;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.compose.ui.platform.b1;
import androidx.compose.ui.scrollcapture.f;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.h;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p078g1.B;
import p078g1.F;
import p078g1.g;
import p078g1.n;
import p078g1.v;
import p078g1.x;
import p114j1.A;
import p114j1.C2479a;
import p114j1.o;
import p114j1.p;
import p235t1.k;

/* JADX INFO: compiled from: MediaMetricsListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class t implements p162n1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f44715A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f44716B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44717a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f44719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f44720d;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f44726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f44727l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ExoPlaybackException f44730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f44731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f44732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f44733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f44734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f44735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f44736u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f44738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f44740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f44741z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f44718b = C2479a.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x.c f44722f = new x.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.b f44723g = new x.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<String, Long> f44725i = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f44724h = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44721e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44728m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44729n = 0;

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44743b;

        public a(int i10, int i11) {
            this.f44742a = i10;
            this.f44743b = i11;
        }
    }

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f44744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44745b;

        public b(n nVar, String str) {
            this.f44744a = nVar;
            this.f44745b = str;
        }
    }

    public t(Context context, PlaybackSession playbackSession) {
        this.f44717a = context.getApplicationContext();
        this.f44720d = playbackSession;
        h hVar = new h();
        this.f44719c = hVar;
        hVar.f44701d = this;
    }

    @Override // p162n1.b
    public final void a(int i10) {
        if (i10 == 1) {
            this.f44737v = true;
        }
        this.f44727l = i10;
    }

    @Override // p162n1.b
    public final void b(F f10) {
        b bVar = this.f44731p;
        if (bVar != null) {
            n nVar = bVar.f44744a;
            if (nVar.f35310v == -1) {
                n.a aVarA = nVar.a();
                aVarA.f35345t = f10.f35229a;
                aVarA.f35346u = f10.f35230b;
                this.f44731p = new b(new n(aVarA), bVar.f44745b);
            }
        }
    }

    @Override // p162n1.b
    public final void c(ExoPlaybackException exoPlaybackException) {
        this.f44730o = exoPlaybackException;
    }

    @Override // p162n1.b
    public final void d(C1390h c1390h) {
        this.f44740y += c1390h.f18405g;
        this.f44741z += c1390h.f18403e;
    }

    @Override // p162n1.b
    public final void e(k kVar) {
        this.f44738w = kVar.f47025a;
    }

    @Override // p162n1.b
    public final void f(n1.b.a aVar, k kVar) {
        h.b bVar = aVar.f44669d;
        if (bVar == null) {
            return;
        }
        n nVar = kVar.f47027c;
        nVar.getClass();
        bVar.getClass();
        b bVar2 = new b(nVar, this.f44719c.c(aVar.f44667b, bVar));
        int i10 = kVar.f47026b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f44732q = bVar2;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f44733r = bVar2;
                return;
            }
        }
        this.f44731p = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x044c  */
    /* JADX WARN: Code duplicated, block: B:267:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:276:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:277:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:361:0x05e8 A[PHI: r3
      0x05e8: PHI (r3v59 int) = (r3v57 int), (r3v56 int), (r3v56 int), (r3v56 int) binds: [B:368:0x05f9, B:350:0x05ce, B:351:0x05d0, B:352:0x05d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p162n1.b
    public final void g(v vVar, p162n1.b.C0508b c0508b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        a aVar;
        a aVar2;
        int i15;
        int i16;
        a aVar3;
        a aVar4;
        a aVar5;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z10;
        t tVar;
        n nVar;
        int i23;
        int i24;
        p078g1.k kVar;
        int i25;
        if (c0508b.f44675a.f35273a.size() == 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            boolean z11 = true;
            if (i26 >= c0508b.f44675a.f35273a.size()) {
                break;
            }
            int iA = c0508b.f44675a.a(i26);
            n1.b.a aVar6 = c0508b.f44676b.get(iA);
            aVar6.getClass();
            if (iA == 0) {
                h hVar = this.f44719c;
                synchronized (hVar) {
                    try {
                        hVar.f44701d.getClass();
                        x xVar = hVar.f44702e;
                        hVar.f44702e = aVar6.f44667b;
                        Iterator<h.a> it = hVar.f44700c.values().iterator();
                        while (it.hasNext()) {
                            h.a next = it.next();
                            if (!next.b(xVar, hVar.f44702e) || next.a(aVar6)) {
                                it.remove();
                                if (next.f44709e) {
                                    if (next.f44705a.equals(hVar.f44703f)) {
                                        hVar.a(next);
                                    }
                                    hVar.f44701d.l(aVar6, next.f44705a);
                                }
                            }
                        }
                        hVar.d(aVar6);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA == 11) {
                h hVar2 = this.f44719c;
                int i27 = this.f44727l;
                synchronized (hVar2) {
                    try {
                        hVar2.f44701d.getClass();
                        if (i27 != 0) {
                            z11 = false;
                        }
                        Iterator<h.a> it2 = hVar2.f44700c.values().iterator();
                        while (it2.hasNext()) {
                            h.a next2 = it2.next();
                            if (next2.a(aVar6)) {
                                it2.remove();
                                if (next2.f44709e) {
                                    boolean zEquals = next2.f44705a.equals(hVar2.f44703f);
                                    if (z11 && zEquals) {
                                        boolean z12 = next2.f44710f;
                                    }
                                    if (zEquals) {
                                        hVar2.a(next2);
                                    }
                                    hVar2.f44701d.l(aVar6, next2.f44705a);
                                }
                            }
                        }
                        hVar2.d(aVar6);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                this.f44719c.e(aVar6);
            }
            i26++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c0508b.a(0)) {
            n1.b.a aVar7 = c0508b.f44676b.get(0);
            aVar7.getClass();
            if (this.f44726k != null) {
                k(aVar7.f44667b, aVar7.f44669d);
            }
        }
        if (c0508b.a(2) && this.f44726k != null) {
            ImmutableList.b bVarListIterator = vVar.D().f35221a.listIterator(0);
            loop3: while (true) {
                if (!bVarListIterator.hasNext()) {
                    kVar = null;
                    break;
                }
                B.a aVar8 = (B.a) bVarListIterator.next();
                for (int i28 = 0; i28 < aVar8.f35222a; i28++) {
                    if (aVar8.f35226e[i28] && (kVar = aVar8.f35223b.f35494d[i28].f35306r) != null) {
                        break loop3;
                    }
                }
            }
            if (kVar != null) {
                PlaybackMetrics.Builder builderA = f.a(this.f44726k);
                int i29 = 0;
                while (true) {
                    if (i29 >= kVar.f35267e) {
                        i25 = 1;
                        break;
                    }
                    UUID uuid = kVar.f35264b[i29].f35269c;
                    if (uuid.equals(g.f35251d)) {
                        i25 = 3;
                        break;
                    } else if (uuid.equals(g.f35252e)) {
                        i25 = 2;
                        break;
                    } else {
                        if (uuid.equals(g.f35250c)) {
                            i25 = 6;
                            break;
                        }
                        i29++;
                    }
                }
                builderA.setDrmType(i25);
            }
        }
        if (c0508b.a(1011)) {
            this.f44715A++;
        }
        ExoPlaybackException exoPlaybackException = this.f44730o;
        if (exoPlaybackException == null) {
            i17 = 1;
            i18 = 2;
            i10 = 8;
            i14 = 13;
            i11 = 6;
            i12 = 7;
            i13 = 9;
        } else {
            boolean z13 = this.f44738w == 4;
            if (exoPlaybackException.errorCode == 1001) {
                aVar5 = new a(20, 0);
            } else {
                boolean z14 = exoPlaybackException.type == 1;
                int i30 = exoPlaybackException.rendererFormatSupport;
                Throwable cause = exoPlaybackException.getCause();
                cause.getClass();
                int i31 = 24;
                if (!(cause instanceof IOException)) {
                    i10 = 8;
                    i11 = 6;
                    i12 = 7;
                    i13 = 9;
                    if (z14 && (i30 == 0 || i30 == 1)) {
                        aVar = new a(35, 0);
                    } else if (z14 && i30 == 3) {
                        aVar = new a(15, 0);
                    } else if (z14 && i30 == 2) {
                        aVar = new a(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            i14 = 13;
                            aVar2 = new a(13, A.r(((MediaCodecRenderer.DecoderInitializationException) cause).diagnosticInfo));
                        } else {
                            i14 = 13;
                            if (cause instanceof MediaCodecDecoderException) {
                                aVar = new a(14, ((MediaCodecDecoderException) cause).errorCode);
                            } else if (cause instanceof OutOfMemoryError) {
                                aVar = new a(14, 0);
                            } else if (cause instanceof AudioSink$InitializationException) {
                                aVar2 = new a(17, ((AudioSink$InitializationException) cause).audioTrackState);
                            } else if (cause instanceof AudioSink$WriteException) {
                                aVar2 = new a(18, ((AudioSink$WriteException) cause).errorCode);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (A.q(errorCode)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i31 = 28;
                                        break;
                                    case 6004:
                                        i31 = 25;
                                        break;
                                    case 6005:
                                        i31 = 26;
                                        break;
                                    default:
                                        i31 = 27;
                                        break;
                                }
                                aVar2 = new a(i31, errorCode);
                            } else {
                                aVar = new a(22, 0);
                            }
                        }
                        aVar = aVar2;
                    }
                    i14 = 13;
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    aVar5 = new a(5, ((HttpDataSource$InvalidResponseCodeException) cause).responseCode);
                } else {
                    if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                        a aVar9 = new a(z13 ? 10 : 11, 0);
                        i13 = 9;
                        i10 = 8;
                        i11 = 6;
                        i12 = 7;
                        aVar = aVar9;
                    } else {
                        boolean z15 = cause instanceof HttpDataSource$HttpDataSourceException;
                        if (z15 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                            i15 = 9;
                            if (o.a(this.f44717a).b() == 1) {
                                aVar4 = new a(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    aVar = new a(6, 0);
                                    i13 = 9;
                                    i11 = 6;
                                    i10 = 8;
                                    i14 = 13;
                                } else {
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i16 = 7;
                                        aVar3 = new a(7, 0);
                                    } else {
                                        i16 = 7;
                                        if (z15 && ((HttpDataSource$HttpDataSourceException) cause).type == 1) {
                                            aVar3 = new a(4, 0);
                                        } else {
                                            aVar = new a(8, 0);
                                            i13 = 9;
                                            i10 = 8;
                                            i11 = 6;
                                            i12 = 7;
                                        }
                                    }
                                    aVar = aVar3;
                                    i13 = 9;
                                    i11 = 6;
                                    i12 = i16;
                                    i10 = 8;
                                }
                            }
                            i12 = 7;
                        } else if (exoPlaybackException.errorCode == 1002) {
                            aVar5 = new a(21, 0);
                        } else if (cause instanceof DrmSession.DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iR = A.r(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (A.q(iR)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i31 = 28;
                                        break;
                                    case 6004:
                                        i31 = 25;
                                        break;
                                    case 6005:
                                        i31 = 26;
                                        break;
                                    default:
                                        i31 = 27;
                                        break;
                                }
                                aVar5 = new a(i31, iR);
                            } else if (A.f40996a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                aVar5 = new a(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                aVar5 = new a(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                aVar5 = new a(29, 0);
                            } else if (cause3 instanceof UnsupportedDrmException) {
                                aVar5 = new a(23, 0);
                            } else {
                                aVar5 = cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
                            }
                        } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            aVar5 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                        } else {
                            i15 = 9;
                            aVar4 = new a(9, 0);
                        }
                        aVar = aVar4;
                        i13 = i15;
                        i10 = 8;
                        i14 = 13;
                        i11 = 6;
                        i12 = 7;
                    }
                    i14 = 13;
                }
                this.f44718b.execute(new c(this, 3, V.n.a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f44721e).setErrorCode(aVar.f44742a).setSubErrorCode(aVar.f44743b).setException(exoPlaybackException).build()));
                i17 = 1;
                this.f44716B = true;
                this.f44730o = null;
                i18 = 2;
            }
            aVar = aVar5;
            i10 = 8;
            i14 = 13;
            i11 = 6;
            i12 = 7;
            i13 = 9;
            this.f44718b.execute(new c(this, 3, V.n.a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f44721e).setErrorCode(aVar.f44742a).setSubErrorCode(aVar.f44743b).setException(exoPlaybackException).build()));
            i17 = 1;
            this.f44716B = true;
            this.f44730o = null;
            i18 = 2;
        }
        if (c0508b.a(i18)) {
            B bD = vVar.D();
            boolean zA = bD.a(i18);
            boolean zA2 = bD.a(i17);
            boolean zA3 = bD.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    i19 = 4;
                    nVar = null;
                } else {
                    nVar = null;
                    if (Objects.equals(this.f44734s, null)) {
                        i19 = 4;
                    } else {
                        int i32 = this.f44734s == null ? 1 : 0;
                        this.f44734s = null;
                        i12 = i12;
                        i10 = i10;
                        i21 = 10;
                        i19 = 4;
                        i20 = 13;
                        m(1, jElapsedRealtime, null, i32);
                    }
                    if (!zA2 && !Objects.equals(this.f44735t, nVar)) {
                        if (this.f44735t == null) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        this.f44735t = nVar;
                        m(0, jElapsedRealtime, nVar, i24);
                    }
                    if (!zA3 && !Objects.equals(this.f44736u, nVar)) {
                        if (this.f44736u == null) {
                            i23 = 1;
                        } else {
                            i23 = 0;
                        }
                        this.f44736u = nVar;
                        m(2, jElapsedRealtime, nVar, i23);
                    }
                }
                i20 = i14;
                i21 = 10;
                if (!zA2) {
                    if (this.f44735t == null) {
                        i24 = 1;
                    } else {
                        i24 = 0;
                    }
                    this.f44735t = nVar;
                    m(0, jElapsedRealtime, nVar, i24);
                }
                if (!zA3) {
                    if (this.f44736u == null) {
                        i23 = 1;
                    } else {
                        i23 = 0;
                    }
                    this.f44736u = nVar;
                    m(2, jElapsedRealtime, nVar, i23);
                }
            } else {
                i10 = i10;
                i12 = i12;
                i19 = 4;
                i20 = i14;
                i21 = 10;
            }
        } else {
            i10 = i10;
            i12 = i12;
            i19 = 4;
            i20 = i14;
            i21 = 10;
        }
        if (i(this.f44731p)) {
            n nVar2 = this.f44731p.f44744a;
            if (nVar2.f35310v != -1) {
                if (!Objects.equals(this.f44734s, nVar2)) {
                    int i33 = this.f44734s == null ? 1 : 0;
                    this.f44734s = nVar2;
                    m(1, jElapsedRealtime, nVar2, i33);
                }
                this.f44731p = null;
            }
        }
        if (i(this.f44732q)) {
            n nVar3 = this.f44732q.f44744a;
            if (!Objects.equals(this.f44735t, nVar3)) {
                int i34 = this.f44735t == null ? 1 : 0;
                this.f44735t = nVar3;
                m(0, jElapsedRealtime, nVar3, i34);
            }
            this.f44732q = null;
        }
        if (i(this.f44733r)) {
            n nVar4 = this.f44733r.f44744a;
            if (!Objects.equals(this.f44736u, nVar4)) {
                int i35 = this.f44736u == null ? 1 : 0;
                this.f44736u = nVar4;
                m(2, jElapsedRealtime, nVar4, i35);
            }
            this.f44733r = null;
        }
        switch (o.a(this.f44717a).b()) {
            case 0:
                i22 = 0;
                break;
            case 1:
                i22 = i13;
                break;
            case 2:
                i22 = 2;
                break;
            case 3:
                i22 = i19;
                break;
            case 4:
                i22 = 5;
                break;
            case 5:
                i22 = i11;
                break;
            case 6:
            case 8:
            default:
                i22 = 1;
                break;
            case 7:
                i22 = 3;
                break;
            case 9:
                i22 = i10;
                break;
            case 10:
                i22 = i12;
                break;
        }
        if (i22 != this.f44729n) {
            this.f44729n = i22;
            this.f44718b.execute(new d(this, 4, b1.a().setNetworkType(i22).setTimeSinceCreatedMillis(jElapsedRealtime - this.f44721e).build()));
        }
        if (vVar.C() != 2) {
            this.f44737v = false;
        }
        if (vVar.d() == null) {
            this.f44739x = false;
        } else if (c0508b.a(i21)) {
            this.f44739x = true;
        }
        int iC = vVar.C();
        if (this.f44737v) {
            z10 = true;
            i21 = 5;
        } else {
            if (this.f44739x) {
                i21 = i20;
            } else if (iC == i19) {
                z10 = true;
                i21 = 11;
            } else {
                int i36 = 2;
                if (iC == 2) {
                    int i37 = this.f44728m;
                    if (i37 == 0 || i37 == 2 || i37 == 12) {
                        i21 = i36;
                    } else if (!vVar.j()) {
                        i21 = i12;
                    } else if (vVar.P() == 0) {
                        i21 = i11;
                    }
                } else {
                    i36 = 3;
                    if (iC != 3) {
                        z10 = true;
                        i21 = (iC != 1 || this.f44728m == 0) ? this.f44728m : 12;
                    } else if (!vVar.j()) {
                        i21 = i19;
                    } else if (vVar.P() != 0) {
                        i21 = i13;
                    } else {
                        i21 = i36;
                    }
                }
            }
            z10 = true;
        }
        if (this.f44728m != i21) {
            this.f44728m = i21;
            this.f44716B = z10;
            this.f44718b.execute(new s(this, 0, p.a().setState(this.f44728m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f44721e).build()));
        }
        if (c0508b.a(1028)) {
            h hVar3 = this.f44719c;
            n1.b.a aVar10 = c0508b.f44676b.get(1028);
            aVar10.getClass();
            synchronized (hVar3) {
                try {
                    String str = hVar3.f44703f;
                    if (str != null) {
                        h.a aVar11 = hVar3.f44700c.get(str);
                        aVar11.getClass();
                        hVar3.a(aVar11);
                    }
                    Iterator<h.a> it3 = hVar3.f44700c.values().iterator();
                    while (it3.hasNext()) {
                        h.a next3 = it3.next();
                        it3.remove();
                        if (next3.f44709e && (tVar = hVar3.f44701d) != null) {
                            tVar.l(aVar10, next3.f44705a);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p162n1.b
    public final void h(int i10, long j, n1.b.a aVar) {
        h.b bVar = aVar.f44669d;
        if (bVar != null) {
            String strC = this.f44719c.c(aVar.f44667b, bVar);
            HashMap<String, Long> map = this.f44725i;
            Long l10 = map.get(strC);
            HashMap<String, Long> map2 = this.f44724h;
            Long l11 = map2.get(strC);
            map.put(strC, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j));
            map2.put(strC, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public final boolean i(b bVar) {
        String str;
        if (bVar != null) {
            String str2 = bVar.f44745b;
            h hVar = this.f44719c;
            synchronized (hVar) {
                str = hVar.f44703f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        PlaybackMetrics.Builder builder = this.f44726k;
        if (builder != null && this.f44716B) {
            builder.setAudioUnderrunCount(this.f44715A);
            this.f44726k.setVideoFramesDropped(this.f44740y);
            this.f44726k.setVideoFramesPlayed(this.f44741z);
            Long l10 = this.f44724h.get(this.j);
            this.f44726k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f44725i.get(this.j);
            this.f44726k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f44726k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f44718b.execute(new p(this, 2, this.f44726k.build()));
        }
        this.f44726k = null;
        this.j = null;
        this.f44715A = 0;
        this.f44740y = 0;
        this.f44741z = 0;
        this.f44734s = null;
        this.f44735t = null;
        this.f44736u = null;
        this.f44716B = false;
    }

    public final void k(x xVar, h.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f44726k;
        if (bVar == null || (iB = xVar.b(bVar.f18698a)) == -1) {
            return;
        }
        x.b bVar2 = this.f44723g;
        int i10 = 0;
        xVar.f(iB, bVar2, false);
        int i11 = bVar2.f35470c;
        x.c cVar = this.f44722f;
        xVar.n(i11, cVar);
        g1.p.f fVar = cVar.f35479c.f35356b;
        if (fVar != null) {
            int iZ = A.z(fVar.f35384a, fVar.f35385b);
            if (iZ == 0) {
                i10 = 3;
            } else if (iZ != 1) {
                i10 = iZ != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        if (cVar.f35487l != -9223372036854775807L && !cVar.j && !cVar.f35484h && !cVar.a()) {
            builder.setMediaDurationMillis(A.Q(cVar.f35487l));
        }
        builder.setPlaybackType(cVar.a() ? 2 : 1);
        this.f44716B = true;
    }

    public final void l(n1.b.a aVar, String str) {
        h.b bVar = aVar.f44669d;
        if ((bVar == null || !bVar.b()) && str.equals(this.j)) {
            j();
        }
        this.f44724h.remove(str);
        this.f44725i.remove(str);
    }

    public final void m(int i10, long j, n nVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = i.b(i10).setTimeSinceCreatedMillis(j - this.f44721e);
        if (nVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = nVar.f35301m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = nVar.f35302n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = nVar.f35299k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = nVar.j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = nVar.f35309u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = nVar.f35310v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = nVar.f35279D;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = nVar.f35280E;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = nVar.f35293d;
            if (str4 != null) {
                int i18 = A.f40996a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = nVar.f35311w;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f44716B = true;
        this.f44718b.execute(new E7.c(this, 1, timeSinceCreatedMillis.build()));
    }
}
