package p016b3;

import A0.f;
import O.a;
import Z2.e;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil.size.Scale;
import kotlin.Pair;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: RoundedCornersTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20547e;

    public c() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f20543a == cVar.f20543a && this.f20544b == cVar.f20544b && this.f20545c == cVar.f20545c && this.f20546d == cVar.f20546d) {
                return true;
            }
        }
        return false;
    }

    @Override // p016b3.d
    public final String getCacheKey() {
        return this.f20547e;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20546d) + a.d(this.f20545c, a.d(this.f20544b, Float.hashCode(this.f20543a) * 31, 31), 31);
    }

    @Override // p016b3.d
    public final Object transform(Bitmap bitmap, e eVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        Pair pair;
        Paint paint = new Paint(3);
        if (i.a(eVar, e.f7731c)) {
            pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            Z2.a aVar = eVar.f7732a;
            boolean z10 = aVar instanceof Z2.a.C0110a;
            Z2.a aVar2 = eVar.f7733b;
            if (z10 && (aVar2 instanceof Z2.a.C0110a)) {
                pair = new Pair(Integer.valueOf(((Z2.a.C0110a) aVar).f7725a), Integer.valueOf(((Z2.a.C0110a) aVar2).f7725a));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Z2.a aVar3 = eVar.f7732a;
                double dG = f.g(width, height, aVar3 instanceof Z2.a.C0110a ? ((Z2.a.C0110a) aVar3).f7725a : Integer.MIN_VALUE, aVar2 instanceof Z2.a.C0110a ? ((Z2.a.C0110a) aVar2).f7725a : Integer.MIN_VALUE, Scale.f23143b);
                pair = new Pair(Integer.valueOf(Ka.a.a(((double) bitmap.getWidth()) * dG)), Integer.valueOf(Ka.a.a(dG * ((double) bitmap.getHeight()))));
            }
        }
        int iIntValue = ((Number) pair.a()).intValue();
        int iIntValue2 = ((Number) pair.b()).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fG = (float) f.g(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, Scale.f23143b);
        float f10 = 2;
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fG)) / f10, (iIntValue2 - (bitmap.getHeight() * fG)) / f10);
        matrix.preScale(fG, fG);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f11 = this.f20543a;
        float f12 = this.f20544b;
        float f13 = this.f20546d;
        float f14 = this.f20545c;
        float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public c(float f10, float f11, float f12, float f13) {
        this.f20543a = f10;
        this.f20544b = f11;
        this.f20545c = f12;
        this.f20546d = f13;
        if (f10 < 0.0f || f11 < 0.0f || f12 < 0.0f || f13 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.f20547e = c.class.getName() + '-' + f10 + ',' + f11 + ',' + f12 + ',' + f13;
    }
}
