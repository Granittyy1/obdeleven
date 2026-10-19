package p026c0;

import androidx.collection.Y;
import androidx.collection.Z;
import p013b0.i;
import p233t.a;
import p293xa.r;

/* JADX INFO: compiled from: FontScaleConverterFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f22269a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Y<a> f22270b = new Y<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f22271c;

    static {
        Object[] objArr = new Object[0];
        f22271c = objArr;
        synchronized (objArr) {
            f22270b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f22270b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f22270b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f22270b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f22270b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            r rVar = r.f47939a;
        }
        if ((f22270b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f10) {
        float fD;
        a aVarG;
        if (f10 < 1.03f) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        a aVarC = f22270b.c(i10);
        if (aVarC != null) {
            return aVarC;
        }
        Y<a> y10 = f22270b;
        if (y10.f9140b) {
            Z.a(y10);
        }
        int iA = a.a(y10.f9143e, i10, y10.f9141c);
        if (iA >= 0) {
            return f22270b.g(iA);
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i11 >= f22270b.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar);
            return cVar;
        }
        float[] fArr = f22269a;
        if (i12 < 0) {
            aVarG = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = f22270b.d(i12) / 100.0f;
            aVarG = f22270b.g(i12);
        }
        float fD2 = f22270b.d(i11) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f10 - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        a aVarG2 = f22270b.g(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f11 = fArr[i13];
            float fB = aVarG.b(f11);
            fArr2[i13] = ((aVarG2.b(f11) - fB) * fMax) + fB;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f10, cVar2);
        return cVar2;
    }

    public static void b(float f10, c cVar) {
        synchronized (f22271c) {
            Y<a> yClone = f22270b.clone();
            yClone.e((int) (f10 * 100.0f), cVar);
            f22270b = yClone;
            r rVar = r.f47939a;
        }
    }
}
