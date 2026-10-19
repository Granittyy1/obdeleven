package p104i3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0891t;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;
import p079g3.b;
import p116j3.a;
import p116j3.c;
import p116j3.e;
import p116j3.f;
import p116j3.k;
import p164n3.d;

/* JADX INFO: compiled from: GradientFillContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d, a.InterfaceC0468a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0891t<LinearGradient> f36646b = new C0891t<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0891t<RadialGradient> f36647c = new C0891t<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f36648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p092h3.a f36649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f36650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f36651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GradientType f36652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f36653i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f36654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f36655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LottieDrawable f36656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f36657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a<Float, Float> f36658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f36659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f36660q;

    public g(LottieDrawable lottieDrawable, b bVar, com.airbnb.lottie.model.layer.a aVar, d dVar) {
        Path path = new Path();
        this.f36648d = path;
        this.f36649e = new p092h3.a(1);
        this.f36650f = new RectF();
        this.f36651g = new ArrayList();
        this.f36659p = 0.0f;
        String str = dVar.f44837g;
        this.f36645a = dVar.f44838h;
        this.f36656m = lottieDrawable;
        this.f36652h = dVar.f44831a;
        path.setFillType(dVar.f44832b);
        this.f36657n = (int) (bVar.b() / 32.0f);
        a<p164n3.c, p164n3.c> aVarA = dVar.f44833c.a();
        this.f36653i = (e) aVarA;
        aVarA.a(this);
        aVar.d(aVarA);
        a<Integer, Integer> aVarA2 = dVar.f44834d.a();
        this.j = (f) aVarA2;
        aVarA2.a(this);
        aVar.d(aVarA2);
        a<PointF, PointF> aVarA3 = dVar.f44835e.a();
        this.f36654k = (k) aVarA3;
        aVarA3.a(this);
        aVar.d(aVarA3);
        a<PointF, PointF> aVarA4 = dVar.f44836f.a();
        this.f36655l = (k) aVarA4;
        aVarA4.a(this);
        aVar.d(aVarA4);
        if (aVar.j() != null) {
            a<Float, Float> aVarA5 = ((p154m3.b) aVar.j().f8043a).a();
            this.f36658o = aVarA5;
            aVarA5.a(this);
            aVar.d(this.f36658o);
        }
        if (aVar.k() != null) {
            this.f36660q = new c(this, aVar, aVar.k());
        }
    }

    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f36656m.invalidateSelf();
    }

    @Override // p104i3.b
    public final void b(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof k) {
                this.f36651g.add((k) bVar);
            }
        }
    }

    @Override // p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f36648d;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36651g;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((k) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }

    public final int d() {
        float f10 = this.f36654k.f41085d;
        float f11 = this.f36657n;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f36655l.f41085d * f11);
        int iRound3 = Math.round(this.f36653i.f41085d * f11);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    @Override // p104i3.d
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        LinearGradient linearGradientB;
        if (this.f36645a) {
            return;
        }
        Path path = this.f36648d;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f36651g;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((k) arrayList.get(i11)).getPath(), matrix);
            i11++;
        }
        path.computeBounds(this.f36650f, false);
        GradientType gradientType = GradientType.f23379b;
        GradientType gradientType2 = this.f36652h;
        e eVar = this.f36653i;
        k kVar = this.f36655l;
        k kVar2 = this.f36654k;
        if (gradientType2 == gradientType) {
            long jD = d();
            C0891t<LinearGradient> c0891t = this.f36646b;
            linearGradientB = c0891t.b(jD);
            if (linearGradientB == null) {
                PointF pointFE = kVar2.e();
                PointF pointFE2 = kVar.e();
                p164n3.c cVarE = eVar.e();
                LinearGradient linearGradient = new LinearGradient(pointFE.x, pointFE.y, pointFE2.x, pointFE2.y, cVarE.f44830b, cVarE.f44829a, Shader.TileMode.CLAMP);
                c0891t.e(linearGradient, jD);
                linearGradientB = linearGradient;
            }
        } else {
            long jD2 = d();
            C0891t<RadialGradient> c0891t2 = this.f36647c;
            RadialGradient radialGradientB = c0891t2.b(jD2);
            if (radialGradientB != null) {
                linearGradientB = radialGradientB;
            } else {
                PointF pointFE3 = kVar2.e();
                PointF pointFE4 = kVar.e();
                p164n3.c cVarE2 = eVar.e();
                int[] iArr = cVarE2.f44830b;
                float f10 = pointFE3.x;
                float f11 = pointFE3.y;
                float fHypot = (float) Math.hypot(pointFE4.x - f10, pointFE4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArr, cVarE2.f44829a, Shader.TileMode.CLAMP);
                c0891t2.e(radialGradient, jD2);
                linearGradientB = radialGradient;
            }
        }
        linearGradientB.setLocalMatrix(matrix);
        p092h3.a aVar = this.f36649e;
        aVar.setShader(linearGradientB);
        a<Float, Float> aVar2 = this.f36658o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.e().floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f36659p) {
                aVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f36659p = fFloatValue;
        }
        c cVar = this.f36660q;
        if (cVar != null) {
            cVar.b(aVar);
        }
        int iIntValue = (int) ((((i10 / 255.0f) * this.j.e().intValue()) / 100.0f) * 255.0f);
        PointF pointF = p214r3.f.f46331a;
        aVar.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        canvas.drawPath(path, aVar);
    }
}
