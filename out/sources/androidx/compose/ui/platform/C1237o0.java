package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayerMatrixCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1237o0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f15074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f15075b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15079f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f15076c = androidx.compose.ui.graphics.a0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f15077d = androidx.compose.ui.graphics.a0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15080g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15081h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1237o0(Ia.p<? super T, ? super Matrix, p293xa.r> pVar) {
        this.f15074a = (Lambda) pVar;
    }

    public final float[] a(T t8) {
        boolean z10 = this.f15079f;
        float[] fArr = this.f15077d;
        if (z10) {
            this.f15080g = A8.A.f(b(t8), fArr);
            this.f15079f = false;
        }
        if (this.f15080g) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ia.p, kotlin.jvm.internal.Lambda] */
    public final float[] b(T t8) {
        boolean z10 = this.f15078e;
        float[] fArr = this.f15076c;
        if (!z10) {
            return fArr;
        }
        Matrix matrix = this.f15075b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f15075b = matrix;
        }
        this.f15074a.invoke(t8, matrix);
        L4.b.i(fArr, matrix);
        this.f15078e = false;
        this.f15081h = F8.a.h(fArr);
        return fArr;
    }

    public final void c() {
        this.f15078e = true;
        this.f15079f = true;
    }
}
