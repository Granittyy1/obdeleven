package p308z1;

import android.opengl.Matrix;
import p114j1.v;

/* JADX INFO: compiled from: FrameRotationQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f48706a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f48707b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<float[]> f48708c = new v<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48709d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }
}
