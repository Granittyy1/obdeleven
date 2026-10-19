package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f13593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f13594d;

    /* JADX INFO: compiled from: Connector.kt */
    public static final class a extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Rgb f13595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Rgb f13596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f13597g;

        public a(Rgb rgb, Rgb rgb2, int i10) {
            float[] fArrF;
            super(rgb2, rgb, rgb2, null);
            this.f13595e = rgb;
            this.f13596f = rgb2;
            u uVar = rgb2.f13544d;
            u uVar2 = rgb.f13544d;
            boolean zC = d.c(uVar2, uVar);
            float[] fArrF2 = rgb.f13549i;
            float[] fArr = rgb2.j;
            if (zC) {
                fArrF = d.f(fArr, fArrF2);
            } else {
                float[] fArrA = uVar2.a();
                u uVar3 = rgb2.f13544d;
                float[] fArrA2 = uVar3.a();
                u uVar4 = k.f13600b;
                boolean zC2 = d.c(uVar2, uVar4);
                float[] fArr2 = androidx.compose.ui.graphics.colorspace.a.f13557b.f13558a;
                fArrF2 = zC2 ? fArrF2 : d.f(d.b(fArr2, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArrF2);
                fArrF = d.f(d.c(uVar3, uVar4) ? fArr : d.e(d.f(d.b(fArr2, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rgb2.f13549i)), i10 == 3 ? d.g(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrF2) : fArrF2);
            }
            this.f13597g = fArrF;
        }

        @Override // androidx.compose.ui.graphics.colorspace.h
        public final long a(long j) {
            float fH = H.h(j);
            float fG = H.g(j);
            float fE = H.e(j);
            float fD = H.d(j);
            n nVar = this.f13595e.f13555p;
            float fG2 = (float) nVar.g(fH);
            float fG3 = (float) nVar.g(fG);
            float fG4 = (float) nVar.g(fE);
            float[] fArr = this.f13597g;
            float f10 = (fArr[6] * fG4) + (fArr[3] * fG3) + (fArr[0] * fG2);
            float f11 = (fArr[7] * fG4) + (fArr[4] * fG3) + (fArr[1] * fG2);
            float f12 = (fArr[8] * fG4) + (fArr[5] * fG3) + (fArr[2] * fG2);
            Rgb rgb = this.f13596f;
            float fG5 = (float) rgb.f13552m.g(f10);
            double d10 = f11;
            Y1.d dVar = rgb.f13552m;
            return Q3.d.c(fG5, (float) dVar.g(d10), (float) dVar.g(f12), fD, rgb);
        }
    }

    public h(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f13591a = cVar;
        this.f13592b = cVar2;
        this.f13593c = cVar3;
        this.f13594d = fArr;
    }

    public long a(long j) {
        float fH = H.h(j);
        float fG = H.g(j);
        float fE = H.e(j);
        float fD = H.d(j);
        c cVar = this.f13592b;
        long jE = cVar.e(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fG2 = cVar.g(fH, fG, fE);
        float[] fArr = this.f13594d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG2 *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        float f11 = fIntBitsToFloat2;
        return this.f13593c.h(f10, f11, fG2, fD, this.f13591a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(c cVar, c cVar2, int i10) {
        long j = cVar.f13565b;
        long j10 = b.f13559a;
        c cVarA = b.a(j, j10) ? d.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f13565b, j10) ? d.a(cVar2) : cVar2;
        float[] fArr = null;
        if (i10 == 3) {
            boolean zA = b.a(cVar.f13565b, j10);
            boolean zA2 = b.a(cVar2.f13565b, j10);
            if ((!zA || !zA2) && (zA || zA2)) {
                cVar = zA ? cVar : cVar2;
                float[] fArrA = k.f13603e;
                u uVar = ((Rgb) cVar).f13544d;
                float[] fArrA2 = zA ? uVar.a() : fArrA;
                fArrA = zA2 ? uVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
