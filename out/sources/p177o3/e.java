package p177o3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: compiled from: SolidLayer.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RectF f45192C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p092h3.a f45193D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float[] f45194E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Path f45195F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Layer f45196G;

    public e(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f45192C = new RectF();
        p092h3.a aVar = new p092h3.a();
        this.f45193D = aVar;
        this.f45194E = new float[8];
        this.f45195F = new Path();
        this.f45196G = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.f23454l);
    }

    @Override // com.airbnb.lottie.model.layer.a, p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        RectF rectF2 = this.f45192C;
        Layer layer = this.f45196G;
        rectF2.set(0.0f, 0.0f, layer.j, layer.f23453k);
        this.f23488n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        Layer layer = this.f45196G;
        int iAlpha = Color.alpha(layer.f23454l);
        if (iAlpha == 0) {
            return;
        }
        p116j3.a<Integer, Integer> aVar = this.f23497w.j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (aVar == null ? 100 : aVar.e().intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        p092h3.a aVar2 = this.f45193D;
        aVar2.setAlpha(iIntValue);
        if (iIntValue > 0) {
            float[] fArr = this.f45194E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = layer.j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = layer.f23453k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.f45195F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
