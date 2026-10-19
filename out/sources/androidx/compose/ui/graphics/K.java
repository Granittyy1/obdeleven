package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f13508b;

    public final float[] a() {
        float[] fArr = this.f13508b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f13507a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f13508b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && Arrays.equals(a(), ((K) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.f13508b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f13508b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
