package S5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l[] f5629a = new l[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f5630b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f5631c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f5632d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f5633e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f5634f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f5635g = new l();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f5636h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f5637i = new float[2];
    public final Path j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f5638k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5639l = true;

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f5640a = new j();
    }

    public j() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f5629a[i10] = new l();
            this.f5630b[i10] = new Matrix();
            this.f5631c[i10] = new Matrix();
        }
    }

    public final void a(i iVar, float f10, RectF rectF, f.a aVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        int i10;
        float[] fArr;
        e eVar;
        c cVar;
        Cb.a aVar2;
        j jVar = this;
        path.rewind();
        Path path2 = jVar.f5633e;
        path2.rewind();
        Path path3 = jVar.f5634f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = jVar.f5631c;
            matrixArr2 = jVar.f5630b;
            lVarArr = jVar.f5629a;
            i10 = 4;
            fArr = jVar.f5636h;
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                cVar = iVar.f5613g;
            } else if (i11 != 2) {
                cVar = i11 != 3 ? iVar.f5612f : iVar.f5611e;
            } else {
                cVar = iVar.f5614h;
            }
            if (i11 == 1) {
                aVar2 = iVar.f5609c;
            } else if (i11 != 2) {
                aVar2 = i11 != 3 ? iVar.f5608b : iVar.f5607a;
            } else {
                aVar2 = iVar.f5610d;
            }
            l lVar = lVarArr[i11];
            aVar2.getClass();
            aVar2.h(lVar, f10, cVar.a(rectF));
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = jVar.f5632d;
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            l lVar2 = lVarArr[i11];
            fArr[0] = lVar2.f5644b;
            fArr[1] = lVar2.f5645c;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < i10) {
            l lVar3 = lVarArr[i13];
            lVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = lVar3.f5643a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            lVarArr[i13].b(matrixArr2[i13], path);
            if (aVar != null) {
                l lVar4 = lVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                f fVar = f.this;
                BitSet bitSet = fVar.f5569e;
                lVar4.getClass();
                bitSet.set(i13, false);
                lVar4.a(lVar4.f5647e);
                fVar.f5567c[i13] = new k(new ArrayList(lVar4.f5649g), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            l lVar5 = lVarArr[i13];
            fArr[0] = lVar5.f5644b;
            fArr[1] = lVar5.f5645c;
            matrixArr2[i13].mapPoints(fArr);
            l lVar6 = lVarArr[i15];
            lVar6.getClass();
            float[] fArr2 = jVar.f5637i;
            fArr2[0] = 0.0f;
            fArr2[1] = lVar6.f5643a;
            matrixArr2[i15].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i13];
            fArr[0] = lVar7.f5644b;
            fArr[1] = lVar7.f5645c;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            l lVar8 = jVar.f5635g;
            lVar8.d(0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                eVar = iVar.f5616k;
            } else if (i13 != 2) {
                eVar = i13 != 3 ? iVar.j : iVar.f5615i;
            } else {
                eVar = iVar.f5617l;
            }
            eVar.getClass();
            lVar8.c(fMax, 0.0f);
            Path path4 = jVar.j;
            path4.reset();
            lVar8.b(matrixArr[i13], path4);
            if (jVar.f5639l && (jVar.b(path4, i13) || jVar.b(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = lVar8.f5643a;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.b(matrixArr[i13], path2);
            } else {
                lVar8.b(matrixArr[i13], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr[i13];
                f fVar2 = f.this;
                fVar2.f5569e.set(i13 + 4, false);
                lVar8.a(lVar8.f5647e);
                fVar2.f5568d[i13] = new k(new ArrayList(lVar8.f5649g), new Matrix(matrix2));
            }
            i10 = 4;
            jVar = this;
            i13 = i14;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f5638k;
        path2.reset();
        this.f5629a[i10].b(this.f5630b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
