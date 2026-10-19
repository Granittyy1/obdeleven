package D2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: D2.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PatternPathMotion.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0698z extends AbstractC0697y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f2708a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f2709b = new Matrix();

    public C0698z(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E.j);
        try {
            String strD = p211r0.j.d(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strD == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(p222s0.d.c(strD));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // D2.AbstractC0697y
    public final Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        double dAtan2 = Math.atan2(f15, f14);
        Matrix matrix = this.f2709b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f10, f11);
        Path path = new Path();
        this.f2708a.transform(matrix, path);
        return path;
    }

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f2709b;
        matrix.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fSqrt = 1.0f / ((float) Math.sqrt((f15 * f15) + (f14 * f14)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(matrix, this.f2708a);
    }
}
