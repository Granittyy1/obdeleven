package p116j3;

import U5.d;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;
import p154m3.f;
import p154m3.j;
import p154m3.k;
import p225s3.b;

/* JADX INFO: compiled from: TransformKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f41118a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f41119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f41120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f41121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f41122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a<PointF, PointF> f41123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a<?, PointF> f41124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a<b, b> f41125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a<Float, Float> f41126i;
    public final a<Integer, Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f41127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f41128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a<?, Float> f41129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a<?, Float> f41130n;

    public p(j jVar) {
        d dVar = jVar.f44583a;
        this.f41123f = dVar == null ? null : dVar.a();
        k<PointF, PointF> kVar = jVar.f44584b;
        this.f41124g = kVar == null ? null : kVar.a();
        f fVar = jVar.f44585c;
        this.f41125h = fVar == null ? null : fVar.a();
        p154m3.b bVar = jVar.f44586d;
        this.f41126i = bVar == null ? null : bVar.a();
        p154m3.b bVar2 = jVar.f44588f;
        d dVar2 = bVar2 == null ? null : (d) bVar2.a();
        this.f41127k = dVar2;
        if (dVar2 != null) {
            this.f41119b = new Matrix();
            this.f41120c = new Matrix();
            this.f41121d = new Matrix();
            this.f41122e = new float[9];
        } else {
            this.f41119b = null;
            this.f41120c = null;
            this.f41121d = null;
            this.f41122e = null;
        }
        p154m3.b bVar3 = jVar.f44589g;
        this.f41128l = bVar3 == null ? null : (d) bVar3.a();
        p154m3.d dVar3 = jVar.f44587e;
        if (dVar3 != null) {
            this.j = dVar3.a();
        }
        p154m3.b bVar4 = jVar.f44590h;
        if (bVar4 != null) {
            this.f41129m = bVar4.a();
        } else {
            this.f41129m = null;
        }
        p154m3.b bVar5 = jVar.f44591i;
        if (bVar5 != null) {
            this.f41130n = bVar5.a();
        } else {
            this.f41130n = null;
        }
    }

    public final void a(a aVar) {
        aVar.d(this.j);
        aVar.d(this.f41129m);
        aVar.d(this.f41130n);
        aVar.d(this.f41123f);
        aVar.d(this.f41124g);
        aVar.d(this.f41125h);
        aVar.d(this.f41126i);
        aVar.d(this.f41127k);
        aVar.d(this.f41128l);
    }

    public final void b(a.InterfaceC0468a interfaceC0468a) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a(interfaceC0468a);
        }
        a<?, Float> aVar2 = this.f41129m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0468a);
        }
        a<?, Float> aVar3 = this.f41130n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0468a);
        }
        a<PointF, PointF> aVar4 = this.f41123f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0468a);
        }
        a<?, PointF> aVar5 = this.f41124g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0468a);
        }
        a<b, b> aVar6 = this.f41125h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0468a);
        }
        a<Float, Float> aVar7 = this.f41126i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0468a);
        }
        d dVar = this.f41127k;
        if (dVar != null) {
            dVar.a(interfaceC0468a);
        }
        d dVar2 = this.f41128l;
        if (dVar2 != null) {
            dVar2.a(interfaceC0468a);
        }
    }

    public final void c() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f41122e[i10] = 0.0f;
        }
    }

    public final Matrix d() {
        PointF pointFE;
        PointF pointFE2;
        Matrix matrix = this.f41118a;
        matrix.reset();
        a<?, PointF> aVar = this.f41124g;
        if (aVar != null && (pointFE2 = aVar.e()) != null) {
            float f10 = pointFE2.x;
            if (f10 != 0.0f || pointFE2.y != 0.0f) {
                matrix.preTranslate(f10, pointFE2.y);
            }
        }
        a<Float, Float> aVar2 = this.f41126i;
        if (aVar2 != null) {
            float fFloatValue = aVar2 instanceof q ? aVar2.e().floatValue() : ((d) aVar2).i();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        d dVar = this.f41127k;
        if (dVar != null) {
            d dVar2 = this.f41128l;
            float fCos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.i()) + 90.0f));
            d dVar3 = this.f41128l;
            float fSin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.i()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar.i()));
            c();
            float[] fArr = this.f41122e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f41119b;
            matrix2.setValues(fArr);
            c();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f41120c;
            matrix3.setValues(fArr);
            c();
            fArr[0] = fCos;
            fArr[1] = f11;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f41121d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<b, b> aVar3 = this.f41125h;
        if (aVar3 != null) {
            b bVarE = aVar3.e();
            float f12 = bVarE.f46900a;
            if (f12 != 1.0f || bVarE.f46901b != 1.0f) {
                matrix.preScale(f12, bVarE.f46901b);
            }
        }
        a<PointF, PointF> aVar4 = this.f41123f;
        if (aVar4 != null && (((pointFE = aVar4.e()) != null && pointFE.x != 0.0f) || pointFE.y != 0.0f)) {
            matrix.preTranslate(-pointFE.x, -pointFE.y);
        }
        return matrix;
    }

    public final Matrix e(float f10) {
        a<?, PointF> aVar = this.f41124g;
        PointF pointFE = aVar == null ? null : aVar.e();
        a<b, b> aVar2 = this.f41125h;
        b bVarE = aVar2 == null ? null : aVar2.e();
        Matrix matrix = this.f41118a;
        matrix.reset();
        if (pointFE != null) {
            matrix.preTranslate(pointFE.x * f10, pointFE.y * f10);
        }
        if (bVarE != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(bVarE.f46900a, d10), (float) Math.pow(bVarE.f46901b, d10));
        }
        a<Float, Float> aVar3 = this.f41126i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.e().floatValue();
            a<PointF, PointF> aVar4 = this.f41123f;
            PointF pointFE2 = aVar4 != null ? aVar4.e() : null;
            matrix.preRotate(fFloatValue * f10, pointFE2 == null ? 0.0f : pointFE2.x, pointFE2 != null ? pointFE2.y : 0.0f);
        }
        return matrix;
    }
}
