package androidx.compose.ui.graphics.layer;

import A8.A;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.L;
import androidx.collection.V;
import androidx.compose.foundation.lazy.q;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C;
import p293xa.r;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GraphicsLayerImpl f13661a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f13666f;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f13670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1144u f13671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1144u f13672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J.a f13674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1142s f13675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13676q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f13683x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p013b0.c f13662b = J.d.f3952a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutDirection f13663c = LayoutDirection.f15717b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lambda f13664d = new Ia.l<J.e, r>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        @Override // Ia.l
        public final /* bridge */ /* synthetic */ r invoke(J.e eVar) {
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<J.e, r> f13665e = new GraphicsLayer$clipDrawBlock$1(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13667g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13668h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13669i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f13677r = new q();

    static {
        boolean z10 = g.f13756a;
        boolean z11 = g.f13756a;
    }

    public b(GraphicsLayerImpl graphicsLayerImpl) {
        this.f13661a = graphicsLayerImpl;
        graphicsLayerImpl.z(false);
        this.f13679t = 0L;
        this.f13680u = 0L;
        this.f13681v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f13667g) {
            boolean z10 = this.f13682w;
            GraphicsLayerImpl graphicsLayerImpl = this.f13661a;
            Outline outline2 = null;
            if (z10 || graphicsLayerImpl.H() > 0.0f) {
                C1144u c1144u = this.f13671l;
                if (c1144u != null) {
                    RectF rectF = this.f13683x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f13683x = rectF;
                    }
                    Path path = c1144u.f13800a;
                    path.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || path.isConvex()) {
                        outline = this.f13666f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f13666f = outline;
                        }
                        if (i10 >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f13673n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f13666f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f13673n = true;
                        outline = null;
                    }
                    this.f13671l = c1144u;
                    if (outline != null) {
                        outline.setAlpha(graphicsLayerImpl.a());
                        outline2 = outline;
                    }
                    graphicsLayerImpl.p(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f13673n && this.f13682w) {
                        graphicsLayerImpl.z(false);
                        graphicsLayerImpl.c();
                    } else {
                        graphicsLayerImpl.z(this.f13682w);
                    }
                } else {
                    graphicsLayerImpl.z(this.f13682w);
                    Outline outline4 = this.f13666f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f13666f = outline4;
                    }
                    long jK = A.k(this.f13680u);
                    long j = this.f13668h;
                    long j10 = this.f13669i;
                    if (j10 != 9205357640488583168L) {
                        jK = j10;
                    }
                    int i11 = (int) (j >> 32);
                    int i12 = (int) (j & 4294967295L);
                    int i13 = (int) (jK >> 32);
                    int i14 = (int) (jK & 4294967295L);
                    outline4.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i14) + Float.intBitsToFloat(i12)), this.j);
                    outline4.setAlpha(graphicsLayerImpl.a());
                    graphicsLayerImpl.p(outline4, (((long) Math.round(Float.intBitsToFloat(i14))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat(i13))) << 32));
                }
            } else {
                graphicsLayerImpl.z(false);
                graphicsLayerImpl.p(null, 0L);
            }
        }
        this.f13667g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.f13678s && this.f13676q == 0) {
            q qVar = this.f13677r;
            b bVar = (b) qVar.f10774b;
            if (bVar != null) {
                bVar.e();
                qVar.f10774b = null;
            }
            L l10 = (L) qVar.f10776d;
            if (l10 != null) {
                Object[] objArr = l10.f9123b;
                long[] jArr = l10.f9122a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j) < 128) {
                                    ((b) objArr[(i10 << 3) + i12]).e();
                                }
                                j >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                l10.e();
            }
            this.f13661a.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087 A[LOOP:0: B:20:0x0050->B:30:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[EDGE_INSN: B:34:0x008a->B:31:0x008a BREAK  A[LOOP:0: B:20:0x0050->B:30:0x0087], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final void c(J.e eVar) {
        q qVar = this.f13677r;
        qVar.f10775c = (b) qVar.f10774b;
        L l10 = (L) qVar.f10776d;
        if (l10 != null && l10.c()) {
            L lA = (L) qVar.f10777e;
            if (lA == null) {
                lA = V.a();
                qVar.f10777e = lA;
            }
            lA.j(l10);
            l10.e();
        }
        qVar.f10773a = true;
        this.f13664d.invoke(eVar);
        qVar.f10773a = false;
        b bVar = (b) qVar.f10775c;
        if (bVar != null) {
            bVar.e();
        }
        L l11 = (L) qVar.f10777e;
        if (l11 == null || !l11.c()) {
            return;
        }
        Object[] objArr = l11.f9123b;
        long[] jArr = l11.f9122a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            ((b) objArr[(i10 << 3) + i12]).e();
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        l11.e();
    }

    public final b0 d() {
        b0 bVar;
        b0 b0Var = this.f13670k;
        C1144u c1144u = this.f13671l;
        if (b0Var != null) {
            return b0Var;
        }
        if (c1144u != null) {
            b0.a aVar = new b0.a(c1144u);
            this.f13670k = aVar;
            return aVar;
        }
        long jK = A.k(this.f13680u);
        long j = this.f13668h;
        long j10 = this.f13669i;
        if (j10 != 9205357640488583168L) {
            jK = j10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jK >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jK & 4294967295L)) + fIntBitsToFloat2;
        float f10 = this.j;
        if (f10 > 0.0f) {
            bVar = new b0.c(C.d(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10)))));
        } else {
            bVar = new b0.b(new I.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f13670k = bVar;
        return bVar;
    }

    public final void e() {
        this.f13676q--;
        b();
    }

    public final void f(float f10) {
        GraphicsLayerImpl graphicsLayerImpl = this.f13661a;
        if (graphicsLayerImpl.a() == f10) {
            return;
        }
        graphicsLayerImpl.b(f10);
    }

    public final void g(float f10, long j, long j10) {
        if (I.d.b(this.f13668h, j) && I.h.a(this.f13669i, j10) && this.j == f10 && this.f13671l == null) {
            return;
        }
        this.f13670k = null;
        this.f13671l = null;
        this.f13667g = true;
        this.f13673n = false;
        this.f13668h = j;
        this.f13669i = j10;
        this.j = f10;
        a();
    }
}
