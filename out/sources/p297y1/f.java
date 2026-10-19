package p297y1;

import B8.E0;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.Surface;
import androidx.compose.ui.platform.r;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.C1391i;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.o0;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.F;
import p078g1.n;
import p078g1.t;
import p078g1.x;
import p114j1.A;
import p114j1.g;
import p114j1.k;
import p114j1.m;
import p114j1.p;
import p114j1.s;
import y1.i.c;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends MediaCodecRenderer {

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public static final int[] f48050G1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public static boolean f48051H1;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public static boolean f48052I1;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public n f48053A1;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public long f48054B1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public long f48055C1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public boolean f48056D1;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public boolean f48057E1;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public int f48058F1;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final Context f48059S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final boolean f48060T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final x f48061U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final int f48062V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final boolean f48063W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final o f48064X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final o.a f48065Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public final long f48066Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final PriorityQueue<Long> f48067a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public d f48068b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f48069c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f48070d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public i.c f48071e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f48072f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public List<Object> f48073g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Surface f48074h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public g f48075i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public s f48076j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f48077k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f48078l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f48079m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public long f48080n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f48081o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f48082p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f48083q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public long f48084r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f48085s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public long f48086t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public F f48087u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public F f48088v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f48089w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f48090x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f48091y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public e f48092z1;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f48094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f48095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.media3.exoplayer.mediacodec.c.b f48096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f48097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f48098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public K.a f48099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48100g;

        public c(Context context) {
            this.f48094a = context;
            this.f48096c = new androidx.media3.exoplayer.mediacodec.b(context);
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48103c;

        public d(int i10, int i11, int i12) {
            this.f48101a = i10;
            this.f48102b = i11;
            this.f48103c = i12;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public final class e implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f48104b;

        public e(androidx.media3.exoplayer.mediacodec.c cVar) {
            Handler handlerK = A.k(this);
            this.f48104b = handlerK;
            cVar.l(this, handlerK);
        }

        public final void a(long j) {
            Surface surface;
            f fVar = f.this;
            if (this != fVar.f48092z1 || fVar.f18509L == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                fVar.f18510L0 = true;
                return;
            }
            try {
                fVar.J0(j);
                F f10 = fVar.f48087u1;
                boolean zEquals = f10.equals(F.f35228d);
                x xVar = fVar.f48061U0;
                if (!zEquals && !f10.equals(fVar.f48088v1)) {
                    fVar.f48088v1 = f10;
                    xVar.a(f10);
                }
                fVar.f18514N0.f18403e++;
                o oVar = fVar.f48064X0;
                boolean z10 = oVar.f48164e != 3;
                oVar.f48164e = 3;
                oVar.f48170l.getClass();
                oVar.f48166g = A.F(SystemClock.elapsedRealtime());
                if (z10 && (surface = fVar.f48074h1) != null) {
                    Handler handler = xVar.f48224a;
                    if (handler != null) {
                        handler.post(new t(xVar, surface, SystemClock.elapsedRealtime()));
                    }
                    fVar.f48077k1 = true;
                }
                fVar.r0(j);
            } catch (ExoPlaybackException e10) {
                fVar.f18512M0 = e10;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = A.f40996a;
            a(((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11)));
            return true;
        }
    }

    public f(c cVar) {
        super(2, cVar.f48096c, 30.0f);
        Context applicationContext = cVar.f48094a.getApplicationContext();
        this.f48059S0 = applicationContext;
        this.f48062V0 = cVar.f48100g;
        this.f48071e1 = null;
        this.f48061U0 = new x(cVar.f48098e, cVar.f48099f);
        this.f48060T0 = this.f48071e1 == null;
        this.f48064X0 = new o(applicationContext, this, cVar.f48097d);
        this.f48065Y0 = new o.a();
        this.f48063W0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f48076j1 = s.f41065c;
        this.f48078l1 = 1;
        this.f48079m1 = 0;
        this.f48087u1 = F.f35228d;
        this.f48091y1 = 0;
        this.f48088v1 = null;
        this.f48089w1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f48054B1 = -9223372036854775807L;
        this.f48055C1 = -9223372036854775807L;
        this.f48067a1 = new PriorityQueue<>();
        this.f48066Z0 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x0207  */
    /* JADX WARN: Code duplicated, block: B:168:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0215  */
    /* JADX WARN: Code duplicated, block: B:172:0x0219  */
    /* JADX WARN: Code duplicated, block: B:175:0x0223  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:179:0x0231  */
    /* JADX WARN: Code duplicated, block: B:180:0x0235  */
    /* JADX WARN: Code duplicated, block: B:183:0x023f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0243  */
    /* JADX WARN: Code duplicated, block: B:187:0x024d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0251  */
    /* JADX WARN: Code duplicated, block: B:191:0x025b  */
    /* JADX WARN: Code duplicated, block: B:192:0x025f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0269  */
    /* JADX WARN: Code duplicated, block: B:196:0x026d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0277  */
    /* JADX WARN: Code duplicated, block: B:200:0x027b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0285  */
    /* JADX WARN: Code duplicated, block: B:204:0x0289  */
    /* JADX WARN: Code duplicated, block: B:207:0x0293  */
    /* JADX WARN: Code duplicated, block: B:208:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x02af  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:232:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:239:0x0303  */
    /* JADX WARN: Code duplicated, block: B:240:0x0307  */
    /* JADX WARN: Code duplicated, block: B:243:0x0311  */
    /* JADX WARN: Code duplicated, block: B:244:0x0315  */
    /* JADX WARN: Code duplicated, block: B:247:0x031f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0323  */
    /* JADX WARN: Code duplicated, block: B:251:0x032d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0331  */
    /* JADX WARN: Code duplicated, block: B:255:0x033b  */
    /* JADX WARN: Code duplicated, block: B:256:0x033f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0349  */
    /* JADX WARN: Code duplicated, block: B:260:0x034d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0357  */
    /* JADX WARN: Code duplicated, block: B:264:0x035b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0365  */
    /* JADX WARN: Code duplicated, block: B:268:0x0369  */
    /* JADX WARN: Code duplicated, block: B:271:0x0373  */
    /* JADX WARN: Code duplicated, block: B:272:0x0377  */
    /* JADX WARN: Code duplicated, block: B:275:0x0381  */
    /* JADX WARN: Code duplicated, block: B:276:0x0385  */
    /* JADX WARN: Code duplicated, block: B:279:0x038f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0393  */
    /* JADX WARN: Code duplicated, block: B:283:0x039d  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:287:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:288:0x03af  */
    /* JADX WARN: Code duplicated, block: B:291:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:292:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:296:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:299:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:300:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:303:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:304:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:307:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:308:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:311:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:312:0x0403  */
    /* JADX WARN: Code duplicated, block: B:315:0x040d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0411  */
    /* JADX WARN: Code duplicated, block: B:319:0x041b  */
    /* JADX WARN: Code duplicated, block: B:320:0x041f  */
    /* JADX WARN: Code duplicated, block: B:323:0x0429  */
    /* JADX WARN: Code duplicated, block: B:324:0x042d  */
    /* JADX WARN: Code duplicated, block: B:327:0x0437  */
    /* JADX WARN: Code duplicated, block: B:328:0x043b  */
    /* JADX WARN: Code duplicated, block: B:331:0x0445  */
    /* JADX WARN: Code duplicated, block: B:332:0x0449  */
    /* JADX WARN: Code duplicated, block: B:335:0x0453  */
    /* JADX WARN: Code duplicated, block: B:336:0x0457  */
    /* JADX WARN: Code duplicated, block: B:339:0x0461  */
    /* JADX WARN: Code duplicated, block: B:340:0x0465  */
    /* JADX WARN: Code duplicated, block: B:343:0x046f  */
    /* JADX WARN: Code duplicated, block: B:344:0x0473  */
    /* JADX WARN: Code duplicated, block: B:347:0x047d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0481  */
    /* JADX WARN: Code duplicated, block: B:351:0x048b  */
    /* JADX WARN: Code duplicated, block: B:352:0x048f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0499  */
    /* JADX WARN: Code duplicated, block: B:356:0x049d  */
    /* JADX WARN: Code duplicated, block: B:359:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:360:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:363:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:364:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:367:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:368:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:371:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:372:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:375:0x04df  */
    /* JADX WARN: Code duplicated, block: B:376:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:379:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:380:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:383:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:384:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:387:0x0509  */
    /* JADX WARN: Code duplicated, block: B:388:0x050d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0517  */
    /* JADX WARN: Code duplicated, block: B:392:0x051b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0525  */
    /* JADX WARN: Code duplicated, block: B:396:0x0529  */
    /* JADX WARN: Code duplicated, block: B:399:0x0533  */
    /* JADX WARN: Code duplicated, block: B:400:0x0537  */
    /* JADX WARN: Code duplicated, block: B:403:0x0541  */
    /* JADX WARN: Code duplicated, block: B:404:0x0545  */
    /* JADX WARN: Code duplicated, block: B:407:0x054f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0553  */
    /* JADX WARN: Code duplicated, block: B:411:0x055d  */
    /* JADX WARN: Code duplicated, block: B:412:0x0561  */
    /* JADX WARN: Code duplicated, block: B:415:0x056b  */
    /* JADX WARN: Code duplicated, block: B:416:0x056f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0579  */
    /* JADX WARN: Code duplicated, block: B:420:0x057d  */
    /* JADX WARN: Code duplicated, block: B:423:0x0587  */
    /* JADX WARN: Code duplicated, block: B:424:0x058b  */
    /* JADX WARN: Code duplicated, block: B:427:0x0595  */
    /* JADX WARN: Code duplicated, block: B:428:0x0599  */
    /* JADX WARN: Code duplicated, block: B:431:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:432:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:435:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:436:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:439:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:440:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:443:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:444:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:447:0x05db  */
    /* JADX WARN: Code duplicated, block: B:448:0x05df  */
    /* JADX WARN: Code duplicated, block: B:451:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:452:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:455:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:456:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:459:0x0605  */
    /* JADX WARN: Code duplicated, block: B:460:0x0609  */
    /* JADX WARN: Code duplicated, block: B:463:0x0613  */
    /* JADX WARN: Code duplicated, block: B:464:0x0617  */
    /* JADX WARN: Code duplicated, block: B:467:0x0621  */
    /* JADX WARN: Code duplicated, block: B:468:0x0625  */
    /* JADX WARN: Code duplicated, block: B:471:0x062f  */
    /* JADX WARN: Code duplicated, block: B:472:0x0633  */
    /* JADX WARN: Code duplicated, block: B:475:0x063d  */
    /* JADX WARN: Code duplicated, block: B:476:0x0641  */
    /* JADX WARN: Code duplicated, block: B:479:0x064b  */
    /* JADX WARN: Code duplicated, block: B:480:0x064f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0659  */
    /* JADX WARN: Code duplicated, block: B:484:0x065d  */
    /* JADX WARN: Code duplicated, block: B:487:0x0667  */
    /* JADX WARN: Code duplicated, block: B:488:0x066b  */
    /* JADX WARN: Code duplicated, block: B:491:0x0675  */
    /* JADX WARN: Code duplicated, block: B:492:0x0679  */
    /* JADX WARN: Code duplicated, block: B:495:0x0683  */
    /* JADX WARN: Code duplicated, block: B:496:0x0687  */
    /* JADX WARN: Code duplicated, block: B:499:0x0691  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:500:0x0695  */
    /* JADX WARN: Code duplicated, block: B:503:0x069f  */
    /* JADX WARN: Code duplicated, block: B:504:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:507:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:508:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:511:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:512:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:515:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:516:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:519:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:520:0x06db  */
    /* JADX WARN: Code duplicated, block: B:523:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:524:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:527:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:528:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:531:0x0701  */
    /* JADX WARN: Code duplicated, block: B:532:0x0705  */
    /* JADX WARN: Code duplicated, block: B:535:0x070f  */
    /* JADX WARN: Code duplicated, block: B:536:0x0713  */
    /* JADX WARN: Code duplicated, block: B:539:0x071d  */
    /* JADX WARN: Code duplicated, block: B:540:0x0721  */
    /* JADX WARN: Code duplicated, block: B:543:0x072b  */
    /* JADX WARN: Code duplicated, block: B:544:0x072f  */
    /* JADX WARN: Code duplicated, block: B:547:0x0739  */
    /* JADX WARN: Code duplicated, block: B:548:0x073c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08b9, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c0), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:551:0x0746  */
    /* JADX WARN: Code duplicated, block: B:552:0x0749  */
    /* JADX WARN: Code duplicated, block: B:555:0x0753  */
    /* JADX WARN: Code duplicated, block: B:558:0x075d  */
    /* JADX WARN: Code duplicated, block: B:559:0x0761  */
    /* JADX WARN: Code duplicated, block: B:562:0x076b  */
    /* JADX WARN: Code duplicated, block: B:563:0x076f  */
    /* JADX WARN: Code duplicated, block: B:566:0x0779  */
    /* JADX WARN: Code duplicated, block: B:567:0x077d  */
    /* JADX WARN: Code duplicated, block: B:570:0x0787  */
    /* JADX WARN: Code duplicated, block: B:571:0x078b  */
    /* JADX WARN: Code duplicated, block: B:574:0x0795  */
    /* JADX WARN: Code duplicated, block: B:575:0x0799  */
    /* JADX WARN: Code duplicated, block: B:578:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:579:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:582:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:583:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:586:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:587:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:590:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:591:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:594:0x07db  */
    /* JADX WARN: Code duplicated, block: B:595:0x07df  */
    /* JADX WARN: Code duplicated, block: B:598:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:599:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:602:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:603:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:606:0x0805  */
    /* JADX WARN: Code duplicated, block: B:607:0x0809  */
    /* JADX WARN: Code duplicated, block: B:610:0x0813  */
    /* JADX WARN: Code duplicated, block: B:611:0x0817  */
    /* JADX WARN: Code duplicated, block: B:614:0x0821  */
    /* JADX WARN: Code duplicated, block: B:615:0x0825  */
    /* JADX WARN: Code duplicated, block: B:618:0x082f  */
    /* JADX WARN: Code duplicated, block: B:619:0x0833  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:622:0x083d  */
    /* JADX WARN: Code duplicated, block: B:623:0x0841  */
    /* JADX WARN: Code duplicated, block: B:626:0x084b  */
    /* JADX WARN: Code duplicated, block: B:627:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:630:0x0859  */
    /* JADX WARN: Code duplicated, block: B:631:0x085b  */
    /* JADX WARN: Code duplicated, block: B:634:0x0865  */
    /* JADX WARN: Code duplicated, block: B:635:0x0867  */
    /* JADX WARN: Code duplicated, block: B:638:0x0871  */
    /* JADX WARN: Code duplicated, block: B:639:0x0873  */
    /* JADX WARN: Code duplicated, block: B:642:0x087d  */
    /* JADX WARN: Code duplicated, block: B:643:0x087f  */
    /* JADX WARN: Code duplicated, block: B:646:0x0889  */
    /* JADX WARN: Code duplicated, block: B:647:0x088b  */
    /* JADX WARN: Code duplicated, block: B:650:0x0895  */
    /* JADX WARN: Code duplicated, block: B:651:0x0897  */
    /* JADX WARN: Code duplicated, block: B:654:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:655:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:658:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:660:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0117 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08b9, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c0), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean K0(String str) {
        String str2;
        byte b10;
        String str3;
        byte b11;
        byte b12 = 26;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (f.class) {
            try {
                if (!f48051H1) {
                    int i10 = A.f40996a;
                    if (i10 <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b11 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b11 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b11 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b11 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b11 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b11 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b11 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b11 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            default:
                                if (i10 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b10 = 0;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b10 = 2;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b10 = 3;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b10 = 5;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b10 = 6;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b10 = 7;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b10 = 8;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    switch (b10) {
                                        default:
                                            if (i10 <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b12 = 0;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b12 = 1;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b12 = 2;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b12 = 3;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b12 = 4;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b12 = 5;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b12 = 6;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b12 = 7;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b12 = 8;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b12 = 9;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b12 = 10;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b12 = 11;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b12 = 12;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b12 = 13;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b12 = 14;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b12 = 15;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b12 = 16;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b12 = 17;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b12 = 18;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b12 = 19;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b12 = 20;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b12 = 21;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b12 = 22;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b12 = 23;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b12 = 24;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b12 = 25;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b12 = 27;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b12 = 28;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b12 = 29;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b12 = 30;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b12 = 31;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b12 = 32;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b12 = 33;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b12 = 34;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b12 = 35;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b12 = 36;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b12 = 37;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b12 = 38;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b12 = 39;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b12 = 40;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b12 = 41;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b12 = 42;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b12 = 43;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b12 = 44;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b12 = 45;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b12 = 46;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b12 = 47;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b12 = 48;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b12 = 49;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b12 = 50;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b12 = 51;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b12 = 52;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b12 = 53;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b12 = 54;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b12 = 55;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b12 = 56;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b12 = 57;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b12 = 58;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b12 = 59;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b12 = 60;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b12 = 61;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b12 = 62;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b12 = 63;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b12 = 64;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b12 = 65;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b12 = 66;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b12 = 67;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b12 = 68;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b12 = 69;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b12 = 70;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b12 = 71;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b12 = 72;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b12 = 73;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b12 = 74;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b12 = 75;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b12 = 76;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b12 = 77;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b12 = 78;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b12 = 79;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b12 = 80;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b12 = 81;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b12 = 82;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b12 = 83;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b12 = 84;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b12 = 85;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b12 = 86;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b12 = 87;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b12 = 88;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b12 = 89;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b12 = 90;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b12 = 91;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b12 = 92;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b12 = 93;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b12 = 94;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b12 = 95;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b12 = 96;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b12 = 97;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b12 = 98;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b12 = 99;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b12 = 100;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b12 = 101;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b12 = 102;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b12 = 103;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b12 = 104;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b12 = 105;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b12 = 106;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b12 = 107;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b12 = 108;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b12 = 109;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b12 = 110;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b12 = 111;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b12 = 112;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b12 = 113;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b12 = 114;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b12 = 115;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b12 = 116;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b12 = 117;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b12 = 118;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b12 = 119;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b12 = 120;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b12 = 121;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b12 = 122;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b12 = 123;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b12 = 124;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b12 = 125;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b12 = 126;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b12 = 127;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b12 = 128;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b12 = 129;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b12 = 130;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b12 = 131;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b12 = 132;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b12 = 133;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b12 = 134;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b12 = 135;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b12 = 136;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b12 = 137;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b12 = 138;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b12 = 139;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b12 = -1;
                                                        break;
                                                }
                                                switch (b12) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                                    case 44:
                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                    case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                                                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                                    case 85:
                                                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                                                    case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                                                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                                    case 100:
                                                    case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                                                    case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                                                    case 105:
                                                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                                    case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                                                    case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                                                    case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                                                    case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                                    case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                                                    case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                                                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                                                    case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                                                    case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z10 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z10 = true;
                                break;
                        }
                    } else if (i10 <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b10 = 5;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b10 = 6;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b10 = 7;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b10 = 8;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i10 <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = 0;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = 1;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = 2;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = 3;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = 4;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = 5;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = 6;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = 7;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = 8;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = 9;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = 10;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = 11;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = 12;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = 13;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = 14;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = 15;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = 16;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = 17;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = 18;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = 19;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = 20;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = 21;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = 22;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = 23;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = 24;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = 25;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = 27;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = 28;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = 29;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = 30;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = 31;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = 32;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = 33;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = 34;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = 35;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = 36;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = 37;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = 38;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = 39;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = 40;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = 41;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = 42;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = 43;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = 44;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = 45;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = 46;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = 47;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = 48;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = 49;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = 50;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = 51;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = 52;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = 53;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = 54;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = 55;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = 56;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = 57;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = 58;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = 59;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = 60;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = 61;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = 62;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = 63;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = 64;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = 65;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = 66;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = 67;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = 68;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = 69;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = 70;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = 71;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = 72;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = 73;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = 74;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = 75;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = 76;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = 77;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = 78;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = 79;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = 80;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = 81;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = 82;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = 83;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = 84;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = 85;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = 86;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = 87;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = 88;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = 89;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = 90;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = 91;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = 92;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = 93;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = 94;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = 95;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = 96;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = 97;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = 98;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = 99;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = 100;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = 101;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = 102;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = 103;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = 104;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = 105;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = 106;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = 107;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = 108;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = 109;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = 110;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = 111;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = 112;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = 113;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = 114;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = 115;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = 116;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = 117;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = 118;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = 119;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = 120;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = 121;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = 122;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = 123;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = 124;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = 125;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = 126;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = 127;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = 128;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = 129;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = 130;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = 131;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = 132;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = 133;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = 134;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = 135;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = 136;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = 137;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = 138;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = 139;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                        case 44:
                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                        case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                        case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                        case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                        case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                        case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                        case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                        case 85:
                                        case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                        case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                        case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                        case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                                        case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                                        case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                        case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                        case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                        case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                        case 100:
                                        case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                        case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                                        case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                        case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                                        case 105:
                                        case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                        case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                        case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                                        case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                                        case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                                        case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                        case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                        case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                                        case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                                        case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                                        case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                                        case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                        case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                        case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                        case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                        case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                        case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                        case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                        case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                        case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                        case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z10 = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b10 = -1;
                                } else {
                                    b10 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b10 = -1;
                                } else {
                                    b10 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b10 = -1;
                                } else {
                                    b10 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b10 = -1;
                                } else {
                                    b10 = 8;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i10 <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 28;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 139;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                        case 44:
                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                        case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                        case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                        case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                        case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                        case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                        case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                        case 85:
                                        case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                        case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                        case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                        case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                                        case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                                        case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                        case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                        case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                        case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                        case 100:
                                        case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                        case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                                        case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                        case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                                        case 105:
                                        case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                        case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                        case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                                        case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                                        case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                                        case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                        case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                        case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                                        case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                                        case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                                        case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                                        case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                        case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                        case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                        case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                        case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                        case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                        case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                        case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                        case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                        case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z10 = true;
                                break;
                        }
                    }
                    f48052I1 = z10;
                    f48051H1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f48052I1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    public static int L0(androidx.media3.exoplayer.mediacodec.d dVar, n nVar) {
        int i10;
        byte b10 = 2;
        int i11 = nVar.f35309u;
        if (i11 == -1 || (i10 = nVar.f35310v) == -1) {
            return -1;
        }
        String str = nVar.f35302n;
        str.getClass();
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairD = MediaCodecUtil.d(nVar);
            if (pairD == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((Integer) pairD.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        switch (str.hashCode()) {
            case -1664118616:
                b10 = !str.equals("video/3gpp") ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                b10 = !str.equals("video/av01") ? (byte) -1 : (byte) 1;
                break;
            case -1662541442:
                if (!str.equals("video/hevc")) {
                    b10 = -1;
                }
                break;
            case 1187890754:
                b10 = !str.equals("video/mp4v-es") ? (byte) -1 : (byte) 3;
                break;
            case 1331836730:
                b10 = !str.equals("video/avc") ? (byte) -1 : (byte) 4;
                break;
            case 1599127256:
                b10 = !str.equals("video/x-vnd.on2.vp8") ? (byte) -1 : (byte) 5;
                break;
            case 1599127257:
                b10 = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 3:
            case 5:
                return ((i11 * i10) * 3) / 4;
            case 2:
                return Math.max(2097152, ((i11 * i10) * 3) / 4);
            case 4:
                String str2 = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && dVar.f18580f)))) {
                    return -1;
                }
                return ((A.e(i10, 16) * A.e(i11, 16)) * 768) / 4;
            case 6:
                return ((i11 * i10) * 3) / 8;
            default:
                return -1;
        }
    }

    public static List M0(Context context, E0 e10, n nVar, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        List listE;
        String str = nVar.f35302n;
        if (str == null) {
            return ImmutableList.K();
        }
        if (A.f40996a >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            String strB = MediaCodecUtil.b(nVar);
            if (strB == null) {
                listE = ImmutableList.K();
            } else {
                e10.getClass();
                listE = MediaCodecUtil.e(strB, z10, z11);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return MediaCodecUtil.g(e10, nVar, z10, z11);
    }

    public static int N0(androidx.media3.exoplayer.mediacodec.d dVar, n nVar) {
        if (nVar.f35303o == -1) {
            return L0(dVar, nVar);
        }
        List<byte[]> list = nVar.f35305q;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += list.get(i10).length;
        }
        return nVar.f35303o + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean D0(DecoderInputBuffer decoderInputBuffer) {
        if (!h() && !decoderInputBuffer.g(536870912)) {
            long j = this.f48055C1;
            if (j == -9223372036854775807L || j - (decoderInputBuffer.f17943g - this.f18516O0.f18552c) <= 100000 || decoderInputBuffer.g(1073741824)) {
                return false;
            }
            boolean z10 = decoderInputBuffer.f17943g < this.f18372m;
            if ((!z10 && !this.f48057E1) || decoderInputBuffer.g(268435456)) {
                return false;
            }
            boolean zG = decoderInputBuffer.g(67108864);
            PriorityQueue<Long> priorityQueue = this.f48067a1;
            if (zG) {
                decoderInputBuffer.k();
                if (z10) {
                    this.f18514N0.f18402d++;
                } else if (this.f48057E1) {
                    priorityQueue.add(Long.valueOf(decoderInputBuffer.f17943g));
                    this.f48058F1++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean E0(androidx.media3.exoplayer.mediacodec.d dVar) {
        return P0(dVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int G0(E0 e10, n nVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = 0;
        if (!t.l(nVar.f35302n)) {
            return n0.n(0, 0, 0, 0);
        }
        boolean z11 = nVar.f35306r != null;
        Context context = this.f48059S0;
        List listM0 = M0(context, e10, nVar, z11, false);
        if (z11 && listM0.isEmpty()) {
            listM0 = M0(context, e10, nVar, false, false);
        }
        if (listM0.isEmpty()) {
            return n0.n(1, 0, 0, 0);
        }
        int i11 = nVar.f35288M;
        if (i11 != 0 && i11 != 2) {
            return n0.n(2, 0, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.d dVar = (androidx.media3.exoplayer.mediacodec.d) listM0.get(0);
        boolean zE = dVar.e(nVar);
        if (!zE) {
            int i12 = 1;
            while (true) {
                if (i12 >= listM0.size()) {
                    z10 = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.d dVar2 = (androidx.media3.exoplayer.mediacodec.d) listM0.get(i12);
                if (dVar2.e(nVar)) {
                    zE = true;
                    z10 = false;
                    dVar = dVar2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = zE ? 4 : 3;
        int i14 = dVar.f(nVar) ? 16 : 8;
        int i15 = dVar.f18581g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (A.f40996a >= 26 && "video/dolby-vision".equals(nVar.f35302n) && !b.a(context)) {
            i16 = 256;
        }
        if (zE) {
            List listM1 = M0(context, e10, nVar, z11, true);
            if (!listM1.isEmpty()) {
                HashMap<MediaCodecUtil.a, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f18554a;
                ArrayList arrayList = new ArrayList(listM1);
                Collections.sort(arrayList, new r(1, new F1.a(7, nVar)));
                androidx.media3.exoplayer.mediacodec.d dVar3 = (androidx.media3.exoplayer.mediacodec.d) arrayList.get(0);
                if (dVar3.e(nVar) && dVar3.f(nVar)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC1389g
    public final void H() {
        C1390h c1390h;
        x xVar = this.f48061U0;
        this.f48088v1 = null;
        this.f48055C1 = -9223372036854775807L;
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            i.this.f48124g.f48026a.d(0);
        } else {
            this.f48064X0.d(0);
        }
        R0();
        this.f48077k1 = false;
        this.f48092z1 = null;
        try {
            super.H();
            c1390h = this.f18514N0;
            xVar.getClass();
            synchronized (c1390h) {
            }
        } finally {
            c1390h = this.f18514N0;
            xVar.getClass();
            synchronized (c1390h) {
                Handler handler = xVar.f48224a;
                if (handler != null) {
                    handler.post(new w(xVar, 0, c1390h));
                }
                xVar.a(F.f35228d);
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void I(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f18514N0 = new C1390h();
        o0 o0Var = this.f18365e;
        o0Var.getClass();
        boolean z12 = o0Var.f18591b;
        p241t7.b.k((z12 && this.f48091y1 == 0) ? false : true);
        if (this.f48090x1 != z12) {
            this.f48090x1 = z12;
            x0();
        }
        C1390h c1390h = this.f18514N0;
        x xVar = this.f48061U0;
        Handler handler = xVar.f48224a;
        if (handler != null) {
            handler.post(new Z3.t(xVar, 1, c1390h));
        }
        boolean z13 = this.f48072f1;
        o oVar = this.f48064X0;
        if (!z13) {
            if (this.f48073g1 != null && this.f48071e1 == null) {
                i.a aVar = new i.a(this.f48059S0, oVar);
                p114j1.t tVar = this.f18368h;
                tVar.getClass();
                aVar.f48142g = tVar;
                p241t7.b.k(!aVar.f48143h);
                if (aVar.f48139d == null) {
                    if (aVar.f48138c == null) {
                        aVar.f48138c = new i.e();
                    }
                    aVar.f48139d = new i.f(aVar.f48138c);
                }
                i iVar = new i(aVar);
                aVar.f48143h = true;
                iVar.f48134r = 1;
                SparseArray<i.c> sparseArray = iVar.f48121d;
                p241t7.b.k(!A.i(sparseArray, 0));
                i.c cVar = iVar.new c(iVar.f48118a);
                iVar.f48126i.add(cVar);
                sparseArray.put(0, cVar);
                this.f48071e1 = cVar;
            }
            this.f48072f1 = true;
        }
        i.c cVar2 = this.f48071e1;
        if (cVar2 == null) {
            p114j1.t tVar2 = this.f18368h;
            tVar2.getClass();
            oVar.f48170l = tVar2;
            oVar.f48164e = z11 ? 1 : 0;
            return;
        }
        a aVar2 = new a();
        Executor executorA = com.google.common.util.concurrent.a.a();
        cVar2.f48150f = aVar2;
        cVar2.f48151g = executorA;
        n nVar = this.f48053A1;
        if (nVar != null) {
            this.f48071e1.n(nVar);
        }
        if (this.f48074h1 != null && !this.f48076j1.equals(s.f41065c)) {
            this.f48071e1.i(this.f48074h1, this.f48076j1);
        }
        this.f48071e1.h(this.f48079m1);
        this.f48071e1.k(this.f18505J);
        List<Object> list = this.f48073g1;
        if (list != null) {
            this.f48071e1.m(list);
        }
        i iVar2 = i.this;
        iVar2.f48124g.f48026a.f48164e = z11 ? 1 : 0;
        m0.a aVar3 = this.f18499G;
        if (aVar3 != null) {
            iVar2.f48130n = aVar3;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC1389g
    public final void J(long j, boolean z10) throws ExoPlaybackException {
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            if (!z10) {
                cVar.d(true);
            }
            this.f48071e1.l(this.f18516O0.f18551b, -this.f48054B1);
            this.f48056D1 = true;
        }
        super.J(j, z10);
        i.c cVar2 = this.f48071e1;
        o oVar = this.f48064X0;
        if (cVar2 == null) {
            q qVar = oVar.f48161b;
            qVar.f48186m = 0L;
            qVar.f48189p = -1L;
            qVar.f48187n = -1L;
            oVar.f48167h = -9223372036854775807L;
            oVar.f48165f = -9223372036854775807L;
            oVar.d(1);
            oVar.f48168i = -9223372036854775807L;
        }
        if (z10) {
            i.c cVar3 = this.f48071e1;
            if (cVar3 != null) {
                i.this.f48124g.f48026a.c(false);
            } else {
                oVar.c(false);
            }
        }
        R0();
        this.f48082p1 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void K() {
        i.c cVar = this.f48071e1;
        if (cVar == null || !this.f48060T0) {
            return;
        }
        i iVar = i.this;
        if (iVar.f48129m == 2) {
            return;
        }
        g gVar = iVar.j;
        if (gVar != null) {
            gVar.g();
        }
        iVar.f48127k = null;
        iVar.f48129m = 2;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void L() {
        try {
            try {
                T();
                x0();
                DrmSession drmSession = this.f18497F;
                if (drmSession != null) {
                    drmSession.d(null);
                }
                this.f18497F = null;
                this.f48072f1 = false;
                this.f48054B1 = -9223372036854775807L;
                g gVar = this.f48075i1;
                if (gVar != null) {
                    gVar.release();
                    this.f48075i1 = null;
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
            this.f48072f1 = false;
            this.f48054B1 = -9223372036854775807L;
            g gVar2 = this.f48075i1;
            if (gVar2 != null) {
                gVar2.release();
                this.f48075i1 = null;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void M() {
        this.f48081o1 = 0;
        this.f18368h.getClass();
        this.f48080n1 = SystemClock.elapsedRealtime();
        this.f48084r1 = 0L;
        this.f48085s1 = 0;
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            i.this.f48124g.f48026a.e();
        } else {
            this.f48064X0.e();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void N() {
        Q0();
        final int i10 = this.f48085s1;
        if (i10 != 0) {
            final long j = this.f48084r1;
            final x xVar = this.f48061U0;
            Handler handler = xVar.f48224a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: y1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        x xVar2 = xVar;
                        xVar2.getClass();
                        int i11 = A.f40996a;
                        K.this.f18039s.i(i10, j);
                    }
                });
            }
            this.f48084r1 = 0L;
            this.f48085s1 = 0;
        }
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            i.this.f48124g.f48026a.f();
        } else {
            this.f48064X0.f();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC1389g
    public final void O(n[] nVarArr, long j, long j10, h.b bVar) throws ExoPlaybackException {
        super.O(nVarArr, j, j10, bVar);
        if (this.f48054B1 == -9223372036854775807L) {
            this.f48054B1 = j;
        }
        x xVar = this.f18376q;
        if (xVar.p()) {
            this.f48055C1 = -9223372036854775807L;
            return;
        }
        bVar.getClass();
        this.f48055C1 = xVar.g(bVar.f18698a, new x.b()).f35471d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface O0(androidx.media3.exoplayer.mediacodec.d dVar) {
        boolean z10;
        g.a aVar;
        int i10;
        RuntimeException runtimeException;
        Error error;
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            p241t7.b.k(cVar.f());
            p241t7.b.l(null);
            throw null;
        }
        Surface surface = this.f48074h1;
        if (surface != null) {
            return surface;
        }
        if (A.f40996a >= 35 && dVar.f18582h) {
            return null;
        }
        p241t7.b.k(V0(dVar));
        g gVar = this.f48075i1;
        if (gVar != null && gVar.f48108b != dVar.f18580f) {
            gVar.release();
            this.f48075i1 = null;
        }
        if (this.f48075i1 == null) {
            Context context = this.f48059S0;
            boolean z11 = dVar.f18580f;
            boolean z12 = false;
            if (z11) {
                if (!g.a(context)) {
                    z10 = false;
                }
                p241t7.b.k(z10);
                aVar = new g.a("ExoPlayer:PlaceholderSurface");
                if (z11) {
                    i10 = g.f48106e;
                } else {
                    i10 = 0;
                }
                aVar.start();
                Handler handler = new Handler(aVar.getLooper(), aVar);
                aVar.f48112c = handler;
                aVar.f48111b = new androidx.media3.common.util.a(handler);
                synchronized (aVar) {
                    aVar.f48112c.obtainMessage(1, i10, 0).sendToTarget();
                    while (aVar.f48115f == null && aVar.f48114e == null && aVar.f48113d == null) {
                        try {
                            aVar.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = aVar.f48114e;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = aVar.f48113d;
                if (error == null) {
                    throw error;
                }
                g gVar2 = aVar.f48115f;
                gVar2.getClass();
                this.f48075i1 = gVar2;
            } else {
                int i11 = g.f48106e;
            }
            z10 = true;
            p241t7.b.k(z10);
            aVar = new g.a("ExoPlayer:PlaceholderSurface");
            if (z11) {
                i10 = g.f48106e;
            } else {
                i10 = 0;
            }
            aVar.start();
            Handler handler2 = new Handler(aVar.getLooper(), aVar);
            aVar.f48112c = handler2;
            aVar.f48111b = new androidx.media3.common.util.a(handler2);
            synchronized (aVar) {
                aVar.f48112c.obtainMessage(1, i10, 0).sendToTarget();
                while (aVar.f48115f == null) {
                    aVar.wait();
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = aVar.f48114e;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = aVar.f48113d;
                if (error == null) {
                    throw error;
                }
                g gVar3 = aVar.f48115f;
                gVar3.getClass();
                this.f48075i1 = gVar3;
            }
        }
        return this.f48075i1;
    }

    public final boolean P0(androidx.media3.exoplayer.mediacodec.d dVar) {
        Surface surface;
        return this.f48071e1 != null || ((surface = this.f48074h1) != null && surface.isValid()) || ((A.f40996a >= 35 && dVar.f18582h) || V0(dVar));
    }

    public final void Q0() {
        if (this.f48081o1 > 0) {
            this.f18368h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.f48080n1;
            final int i10 = this.f48081o1;
            final x xVar = this.f48061U0;
            Handler handler = xVar.f48224a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: y1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        x xVar2 = xVar;
                        xVar2.getClass();
                        int i11 = A.f40996a;
                        K.this.f18039s.C(i10, j);
                    }
                });
            }
            this.f48081o1 = 0;
            this.f48080n1 = jElapsedRealtime;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final C1391i R(androidx.media3.exoplayer.mediacodec.d dVar, n nVar, n nVar2) {
        C1391i c1391iB = dVar.b(nVar, nVar2);
        d dVar2 = this.f48068b1;
        dVar2.getClass();
        int i10 = nVar2.f35309u;
        int i11 = dVar2.f48101a;
        int i12 = c1391iB.f18434e;
        if (i10 > i11 || nVar2.f35310v > dVar2.f48102b) {
            i12 |= 256;
        }
        if (N0(dVar, nVar2) > dVar2.f48103c) {
            i12 |= 64;
        }
        int i13 = i12;
        return new C1391i(dVar.f18575a, nVar, nVar2, i13 != 0 ? 0 : c1391iB.f18433d, i13);
    }

    public final void R0() {
        int i10;
        androidx.media3.exoplayer.mediacodec.c cVar;
        if (!this.f48090x1 || (i10 = A.f40996a) < 23 || (cVar = this.f18509L) == null) {
            return;
        }
        this.f48092z1 = new e(cVar);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            cVar.b(bundle);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException S(IllegalStateException illegalStateException, androidx.media3.exoplayer.mediacodec.d dVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, dVar, this.f48074h1);
    }

    public final void S0(androidx.media3.exoplayer.mediacodec.c cVar, int i10, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        cVar.h(i10, j);
        Trace.endSection();
        this.f18514N0.f18403e++;
        this.f48082p1 = 0;
        if (this.f48071e1 == null) {
            F f10 = this.f48087u1;
            boolean zEquals = f10.equals(F.f35228d);
            x xVar = this.f48061U0;
            if (!zEquals && !f10.equals(this.f48088v1)) {
                this.f48088v1 = f10;
                xVar.a(f10);
            }
            o oVar = this.f48064X0;
            boolean z10 = oVar.f48164e != 3;
            oVar.f48164e = 3;
            oVar.f48170l.getClass();
            oVar.f48166g = A.F(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.f48074h1) == null) {
                return;
            }
            Handler handler = xVar.f48224a;
            if (handler != null) {
                handler.post(new t(xVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f48077k1 = true;
        }
    }

    public final void T0(Object obj) throws ExoPlaybackException {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f48074h1;
        x xVar = this.f48061U0;
        if (surface2 == surface) {
            if (surface != null) {
                F f10 = this.f48088v1;
                if (f10 != null) {
                    xVar.a(f10);
                }
                Surface surface3 = this.f48074h1;
                if (surface3 == null || !this.f48077k1 || (handler = xVar.f48224a) == null) {
                    return;
                }
                handler.post(new t(xVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f48074h1 = surface;
        i.c cVar = this.f48071e1;
        o oVar = this.f48064X0;
        if (cVar == null) {
            oVar.g(surface);
        }
        this.f48077k1 = false;
        int i10 = this.f18369i;
        androidx.media3.exoplayer.mediacodec.c cVar2 = this.f18509L;
        if (cVar2 != null && this.f48071e1 == null) {
            androidx.media3.exoplayer.mediacodec.d dVar = this.f18522S;
            dVar.getClass();
            boolean zP0 = P0(dVar);
            int i11 = A.f40996a;
            if (i11 < 23 || !zP0 || this.f48069c1) {
                x0();
                i0();
            } else {
                Surface surfaceO0 = O0(dVar);
                if (i11 >= 23 && surfaceO0 != null) {
                    cVar2.n(surfaceO0);
                } else {
                    if (i11 < 35) {
                        throw new IllegalStateException();
                    }
                    cVar2.g();
                }
            }
        }
        if (surface != null) {
            F f11 = this.f48088v1;
            if (f11 != null) {
                xVar.a(f11);
            }
        } else {
            this.f48088v1 = null;
            i.c cVar3 = this.f48071e1;
            if (cVar3 != null) {
                i iVar = i.this;
                s sVar = s.f41065c;
                iVar.a(null, sVar.f41066a, sVar.f41067b);
                iVar.f48127k = null;
            }
        }
        if (i10 == 2) {
            i.c cVar4 = this.f48071e1;
            if (cVar4 != null) {
                i.this.f48124g.f48026a.c(true);
            } else {
                oVar.c(true);
            }
        }
        R0();
    }

    public final boolean U0(long j, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        long j11 = this.f48066Z0;
        if (j11 != -9223372036854775807L) {
            this.f48057E1 = j < j11;
        }
        if (j >= -500000 || z10) {
            return false;
        }
        p235t1.r rVar = this.j;
        rVar.getClass();
        int iC = rVar.c(j10 - this.f18371l);
        if (iC == 0) {
            return false;
        }
        PriorityQueue<Long> priorityQueue = this.f48067a1;
        if (z11) {
            C1390h c1390h = this.f18514N0;
            int i10 = c1390h.f18402d + iC;
            c1390h.f18402d = i10;
            c1390h.f18404f += this.f48083q1;
            c1390h.f18402d = priorityQueue.size() + i10;
        } else {
            this.f18514N0.j++;
            X0(priorityQueue.size() + iC, this.f48083q1);
        }
        if (Y()) {
            i0();
        }
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            cVar.d(false);
        }
        return true;
    }

    public final boolean V0(androidx.media3.exoplayer.mediacodec.d dVar) {
        return A.f40996a >= 23 && !this.f48090x1 && !K0(dVar.f18575a) && (!dVar.f18580f || g.a(this.f48059S0));
    }

    public final void W0(androidx.media3.exoplayer.mediacodec.c cVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        cVar.e(i10);
        Trace.endSection();
        this.f18514N0.f18404f++;
    }

    public final void X0(int i10, int i11) {
        C1390h c1390h = this.f18514N0;
        c1390h.f18406h += i10;
        int i12 = i10 + i11;
        c1390h.f18405g += i12;
        this.f48081o1 += i12;
        int i13 = this.f48082p1 + i12;
        this.f48082p1 = i13;
        c1390h.f18407i = Math.max(i13, c1390h.f18407i);
        int i14 = this.f48062V0;
        if (i14 <= 0 || this.f48081o1 < i14) {
            return;
        }
        Q0();
    }

    public final void Y0(long j) {
        C1390h c1390h = this.f18514N0;
        c1390h.f18408k += j;
        c1390h.f18409l++;
        this.f48084r1 += j;
        this.f48085s1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int a0(DecoderInputBuffer decoderInputBuffer) {
        return (A.f40996a < 34 || !this.f48090x1 || decoderInputBuffer.f17943g >= this.f18372m) ? 0 : 32;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.m0
    public final boolean b() {
        boolean zB = super.b();
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            boolean z10 = zB && cVar.f();
            i iVar = i.this;
            return iVar.f48124g.f48026a.b(z10 && iVar.f48128l == 0);
        }
        if (zB && (this.f18509L == null || this.f48090x1)) {
            return true;
        }
        return this.f48064X0.b(zB);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean b0() {
        return this.f48090x1 && A.f40996a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float c0(float f10, n[] nVarArr) {
        float fMax = -1.0f;
        for (n nVar : nVarArr) {
            float f11 = nVar.f35311w;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.m0
    public final boolean d() {
        if (this.f18506J0) {
            i.c cVar = this.f48071e1;
            if (cVar != null) {
                if (cVar.f()) {
                    i iVar = i.this;
                    if (iVar.f48128l == 0 && iVar.f48132p) {
                        r rVar = iVar.f48124g.f48028c;
                        long j = rVar.f48206i;
                        if (j != -9223372036854775807L && rVar.f48205h == j) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList d0(E0 e10, n nVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        List listM0 = M0(this.f48059S0, e10, nVar, z10, this.f48090x1);
        HashMap<MediaCodecUtil.a, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f18554a;
        ArrayList arrayList = new ArrayList(listM0);
        Collections.sort(arrayList, new r(1, new F1.a(7, nVar)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final androidx.media3.exoplayer.mediacodec.c.a e0(androidx.media3.exoplayer.mediacodec.d dVar, n nVar, MediaCrypto mediaCrypto, float f10) {
        p078g1.h hVar;
        int i10;
        d dVar2;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b10;
        boolean z10;
        Pair<Integer, Integer> pairD;
        int iL0;
        String str = dVar.f18577c;
        n[] nVarArr = this.f18370k;
        nVarArr.getClass();
        int iMax = nVar.f35309u;
        int iN0 = N0(dVar, nVar);
        int length = nVarArr.length;
        float f11 = nVar.f35311w;
        int i11 = nVar.f35309u;
        p078g1.h hVar2 = nVar.f35277B;
        int i12 = nVar.f35310v;
        if (length == 1) {
            if (iN0 != -1 && (iL0 = L0(dVar, nVar)) != -1) {
                iN0 = Math.min((int) (iN0 * 1.5f), iL0);
            }
            dVar2 = new d(iMax, i12, iN0);
            hVar = hVar2;
            i10 = i12;
        } else {
            int iMax2 = i12;
            int i13 = 0;
            boolean z11 = false;
            for (int length2 = nVarArr.length; i13 < length2; length2 = length2) {
                n nVar2 = nVarArr[i13];
                n[] nVarArr2 = nVarArr;
                if (hVar2 != null && nVar2.f35277B == null) {
                    n.a aVarA = nVar2.a();
                    aVarA.f35315A = hVar2;
                    nVar2 = new n(aVarA);
                }
                if (dVar.b(nVar, nVar2).f18433d != 0) {
                    int i14 = nVar2.f35310v;
                    int i15 = nVar2.f35309u;
                    b10 = -1;
                    z11 |= i15 == -1 || i14 == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, i14);
                    iN0 = Math.max(iN0, N0(dVar, nVar2));
                } else {
                    b10 = -1;
                }
                i13++;
                nVarArr = nVarArr2;
            }
            if (z11) {
                k.f("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i12 > i11;
                int i16 = z12 ? i12 : i11;
                int i17 = z12 ? i11 : i12;
                hVar = hVar2;
                float f12 = i17 / i16;
                int[] iArr = f48050G1;
                i10 = i12;
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        int i19 = iArr[i18];
                        int[] iArr2 = iArr;
                        int i20 = (int) (i19 * f12);
                        if (i19 > i16 && i20 > i17) {
                            int i21 = i16;
                            int i22 = z12 ? i20 : i19;
                            if (!z12) {
                                i19 = i20;
                            }
                            MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f18578d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(A.e(i22, widthAlignment) * widthAlignment, A.e(i19, heightAlignment) * heightAlignment);
                            }
                            if (point != null && dVar.g(point.x, point.y, f11)) {
                                break;
                            }
                            i18++;
                            iArr = iArr2;
                            i16 = i21;
                            z12 = z12;
                            i17 = i17;
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    n.a aVarA2 = nVar.a();
                    aVarA2.f35345t = iMax;
                    aVarA2.f35346u = iMax2;
                    iN0 = Math.max(iN0, L0(dVar, new n(aVarA2)));
                    k.f("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                hVar = hVar2;
                i10 = i12;
            }
            dVar2 = new d(iMax, iMax2, iN0);
        }
        this.f48068b1 = dVar2;
        int i23 = this.f48090x1 ? this.f48091y1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        m.b(mediaFormat, nVar.f35305q);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        m.a(mediaFormat, "rotation-degrees", nVar.f35312x);
        if (hVar != null) {
            p078g1.h hVar3 = hVar;
            m.a(mediaFormat, "color-transfer", hVar3.f35256c);
            m.a(mediaFormat, "color-standard", hVar3.f35254a);
            m.a(mediaFormat, "color-range", hVar3.f35255b);
            byte[] bArr = hVar3.f35257d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(nVar.f35302n) && (pairD = MediaCodecUtil.d(nVar)) != null) {
            m.a(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar2.f48101a);
        mediaFormat.setInteger("max-height", dVar2.f48102b);
        m.a(mediaFormat, "max-input-size", dVar2.f48103c);
        int i24 = A.f40996a;
        if (i24 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f48063W0) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i23 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i23);
        }
        if (i24 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f48089w1));
        }
        Surface surfaceO0 = O0(dVar);
        if (this.f48071e1 != null && !A.D(this.f48059S0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new androidx.media3.exoplayer.mediacodec.c.a(dVar, mediaFormat, nVar, surfaceO0, mediaCrypto, null);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f48070d1) {
            ByteBuffer byteBuffer = decoderInputBuffer.f17944h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.c cVar = this.f18509L;
                        cVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        cVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.m0, androidx.media3.exoplayer.n0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.m0
    public final void k() {
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            o oVar = i.this.f48124g.f48026a;
            if (oVar.f48164e == 0) {
                oVar.f48164e = 1;
                return;
            }
            return;
        }
        o oVar2 = this.f48064X0;
        if (oVar2.f48164e == 0) {
            oVar2.f48164e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean k0(n nVar) throws ExoPlaybackException {
        i.c cVar = this.f48071e1;
        if (cVar == null || cVar.f()) {
            return true;
        }
        try {
            return this.f48071e1.e(nVar);
        } catch (VideoSink$VideoSinkException e10) {
            throw G(e10, nVar, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0(Exception exc) {
        k.d("MediaCodecVideoRenderer", "Video codec error", exc);
        x xVar = this.f48061U0;
        Handler handler = xVar.f48224a;
        if (handler != null) {
            handler.post(new p(xVar, 4, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0(final String str, final long j, final long j10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final x xVar = this.f48061U0;
        Handler handler = xVar.f48224a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: y1.s
                @Override // java.lang.Runnable
                public final void run() {
                    x xVar2 = xVar;
                    xVar2.getClass();
                    int i10 = A.f40996a;
                    K.this.f18039s.j(str, j, j10);
                }
            });
        }
        this.f48069c1 = K0(str);
        androidx.media3.exoplayer.mediacodec.d dVar = this.f18522S;
        dVar.getClass();
        boolean z10 = false;
        if (A.f40996a >= 29 && "video/x-vnd.on2.vp9".equals(dVar.f18576b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f18578d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f48070d1 = z10;
        R0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void n0(String str) {
        x xVar = this.f48061U0;
        Handler handler = xVar.f48224a;
        if (handler != null) {
            handler.post(new p162n1.s(xVar, 2, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final C1391i o0(Q q10) throws ExoPlaybackException {
        C1391i c1391iO0 = super.o0(q10);
        n nVar = (n) q10.f18136b;
        nVar.getClass();
        x xVar = this.f48061U0;
        Handler handler = xVar.f48224a;
        if (handler != null) {
            handler.post(new p240t6.f(xVar, nVar, c1391iO0, 1));
        }
        return c1391iO0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void p0(n nVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        androidx.media3.exoplayer.mediacodec.c cVar = this.f18509L;
        if (cVar != null) {
            cVar.k(this.f48078l1);
        }
        if (this.f48090x1) {
            i10 = nVar.f35309u;
            integer = nVar.f35310v;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = nVar.f35313y;
        int i11 = nVar.f35312x;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f48087u1 = new F(i10, integer, f10);
        i.c cVar2 = this.f48071e1;
        if (cVar2 == null || !this.f48056D1) {
            q qVar = this.f48064X0.f48161b;
            qVar.f48180f = nVar.f35311w;
            p297y1.e eVar = qVar.f48175a;
            eVar.f48037a.c();
            eVar.f48038b.c();
            eVar.f48039c = false;
            eVar.f48040d = -9223372036854775807L;
            eVar.f48041e = 0;
            qVar.c();
        } else {
            n.a aVarA = nVar.a();
            aVarA.f35345t = i10;
            aVarA.f35346u = integer;
            aVarA.f35349x = f10;
            n nVar2 = new n(aVarA);
            List<Object> listK = this.f48073g1;
            if (listK == null) {
                listK = ImmutableList.K();
            }
            p241t7.b.k(cVar2.f());
            cVar2.j(listK);
            cVar2.f48147c = nVar2;
            i.this.f48132p = false;
            cVar2.g(nVar2);
        }
        this.f48056D1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void r0(long j) {
        super.r0(j);
        if (this.f48090x1) {
            return;
        }
        this.f48083q1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.m0
    public final void s(float f10, float f11) throws ExoPlaybackException {
        super.s(f10, f11);
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            cVar.k(f10);
        } else {
            this.f48064X0.h(f10);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void s0() {
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            cVar.o();
            this.f48071e1.l(this.f18516O0.f18551b, -this.f48054B1);
        } else {
            this.f48064X0.d(2);
        }
        this.f48056D1 = true;
        R0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void t0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        Surface surface;
        this.f48058F1 = 0;
        boolean z10 = this.f48090x1;
        if (!z10) {
            this.f48083q1++;
        }
        if (A.f40996a >= 23 || !z10) {
            return;
        }
        long j = decoderInputBuffer.f17943g;
        J0(j);
        F f10 = this.f48087u1;
        boolean zEquals = f10.equals(F.f35228d);
        x xVar = this.f48061U0;
        if (!zEquals && !f10.equals(this.f48088v1)) {
            this.f48088v1 = f10;
            xVar.a(f10);
        }
        this.f18514N0.f18403e++;
        o oVar = this.f48064X0;
        boolean z11 = oVar.f48164e != 3;
        oVar.f48164e = 3;
        oVar.f48170l.getClass();
        oVar.f48166g = A.F(SystemClock.elapsedRealtime());
        if (z11 && (surface = this.f48074h1) != null) {
            Handler handler = xVar.f48224a;
            if (handler != null) {
                handler.post(new t(xVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f48077k1 = true;
        }
        r0(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.m0
    public final void v(long j, long j10) throws ExoPlaybackException {
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            try {
                p297y1.d dVar = i.this.f48124g;
                dVar.getClass();
                try {
                    dVar.f48028c.a(j, j10);
                } catch (ExoPlaybackException e10) {
                    throw new VideoSink$VideoSinkException(e10, dVar.f48031f);
                }
            } catch (VideoSink$VideoSinkException e11) {
                throw G(e11, e11.format, false, 7001);
            }
        }
        super.v(j, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean v0(long j, long j10, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, n nVar) throws ExoPlaybackException {
        cVar.getClass();
        long j12 = j11 - this.f18516O0.f18552c;
        int i13 = 0;
        while (true) {
            PriorityQueue<Long> priorityQueue = this.f48067a1;
            Long lPeek = priorityQueue.peek();
            if (lPeek == null || lPeek.longValue() >= j11) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        X0(i13, 0);
        i.c cVar2 = this.f48071e1;
        if (cVar2 != null) {
            if (z10 && !z11) {
                W0(cVar, i10);
                return true;
            }
            p241t7.b.k(cVar2.f());
            i iVar = i.this;
            int i14 = iVar.f48134r;
            if (i14 == -1 || i14 != iVar.f48135s) {
                return false;
            }
            p241t7.b.l(null);
            throw null;
        }
        int iA = this.f48064X0.a(j11, j, j10, this.f18516O0.f18551b, z10, z11, this.f48065Y0);
        o.a aVar = this.f48065Y0;
        if (iA == 0) {
            this.f18368h.getClass();
            long jNanoTime = System.nanoTime();
            n nVar2 = this.f48053A1;
            if (nVar2 != null) {
                nVar2.g(j12, jNanoTime, nVar, this.f18513N);
            }
            S0(cVar, i10, jNanoTime);
            Y0(aVar.f48173a);
            return true;
        }
        if (iA == 1) {
            long j13 = aVar.f48174b;
            long j14 = aVar.f48173a;
            if (j13 == this.f48086t1) {
                W0(cVar, i10);
            } else {
                n nVar3 = this.f48053A1;
                if (nVar3 != null) {
                    nVar3.g(j12, j13, nVar, this.f18513N);
                }
                S0(cVar, i10, j13);
            }
            Y0(j14);
            this.f48086t1 = j13;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            cVar.e(i10);
            Trace.endSection();
            X0(0, 1);
            Y0(aVar.f48173a);
            return true;
        }
        if (iA == 3) {
            W0(cVar, i10);
            Y0(aVar.f48173a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.j0.b
    public final void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            T0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            n nVar = (n) obj;
            this.f48053A1 = nVar;
            i.c cVar = this.f48071e1;
            if (cVar != null) {
                cVar.n(nVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f48091y1 != iIntValue) {
                this.f48091y1 = iIntValue;
                if (this.f48090x1) {
                    x0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f48078l1 = iIntValue2;
            androidx.media3.exoplayer.mediacodec.c cVar2 = this.f18509L;
            if (cVar2 != null) {
                cVar2.k(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f48079m1 = iIntValue3;
            i.c cVar3 = this.f48071e1;
            if (cVar3 != null) {
                cVar3.h(iIntValue3);
                return;
            }
            q qVar = this.f48064X0.f48161b;
            if (qVar.j == iIntValue3) {
                return;
            }
            qVar.j = iIntValue3;
            qVar.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List<Object> list = (List) obj;
            this.f48073g1 = list;
            i.c cVar4 = this.f48071e1;
            if (cVar4 != null) {
                cVar4.m(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            s sVar = (s) obj;
            if (sVar.f41066a == 0 || sVar.f41067b == 0) {
                return;
            }
            this.f48076j1 = sVar;
            i.c cVar5 = this.f48071e1;
            if (cVar5 != null) {
                Surface surface = this.f48074h1;
                p241t7.b.l(surface);
                cVar5.i(surface, sVar);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f48089w1 = ((Integer) obj).intValue();
            androidx.media3.exoplayer.mediacodec.c cVar6 = this.f18509L;
            if (cVar6 != null && A.f40996a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f48089w1));
                cVar6.b(bundle);
                return;
            }
            return;
        }
        if (i10 == 17) {
            Surface surface2 = this.f48074h1;
            T0(null);
            obj.getClass();
            ((f) obj).x(1, surface2);
            return;
        }
        if (i10 == 11) {
            m0.a aVar = (m0.a) obj;
            aVar.getClass();
            this.f18499G = aVar;
            i.c cVar7 = this.f48071e1;
            if (cVar7 != null) {
                i.this.f48130n = aVar;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void y0() {
        i.c cVar = this.f48071e1;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void z0() {
        super.z0();
        this.f48067a1.clear();
        this.f48057E1 = false;
        this.f48083q1 = 0;
        this.f48058F1 = 0;
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public class a implements y {
        public a() {
        }

        @Override // p297y1.y
        public final void a() {
            f fVar = f.this;
            Surface surface = fVar.f48074h1;
            if (surface != null) {
                x xVar = fVar.f48061U0;
                Handler handler = xVar.f48224a;
                if (handler != null) {
                    handler.post(new t(xVar, surface, SystemClock.elapsedRealtime()));
                }
                fVar.f48077k1 = true;
            }
        }

        @Override // p297y1.y
        public final void c() {
            f fVar = f.this;
            if (fVar.f48074h1 != null) {
                fVar.X0(0, 1);
            }
        }

        @Override // p297y1.y
        public final void b(F f10) {
        }
    }
}
