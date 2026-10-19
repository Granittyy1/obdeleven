package androidx.compose.ui.graphics;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.braze.support.BrazeLogger;
import java.util.List;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<H> f13625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13628f;

    public f0() {
        throw null;
    }

    public f0(List list, long j, float f10, int i10) {
        this.f13625c = list;
        this.f13626d = j;
        this.f13627e = f10;
        this.f13628f = i10;
    }

    @Override // androidx.compose.ui.graphics.j0
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j10 = this.f13626d;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            long jG = Cb.a.g(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
        } else {
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j10 & 4294967295L);
            if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
                i11 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fC = this.f13627e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = I.h.c(j) / 2;
        }
        float f10 = fC;
        List<H> list = this.f13625c;
        C1147x.a(null, list);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = Q3.d.K(list.get(i12).f13506a);
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f10, iArr, (float[]) null, C1148y.a(this.f13628f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.i.a(this.f13625c, f0Var.f13625c) && kotlin.jvm.internal.i.a(null, null) && I.d.b(this.f13626d, f0Var.f13626d) && this.f13627e == f0Var.f13627e && p0.a(this.f13628f, f0Var.f13628f);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13628f) + O.a.d(this.f13627e, C4.b.c(this.f13626d, this.f13625c.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.f13626d;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) I.d.i(j)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f13627e;
        if ((Float.floatToRawIntBits(f10) & BrazeLogger.SUPPRESS) < 2139095040) {
            str2 = "radius=" + f10 + ", ";
        }
        return "RadialGradient(colors=" + this.f13625c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) p0.b(this.f13628f)) + ')';
    }
}
