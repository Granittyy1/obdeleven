package S5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: RelativeCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5605a;

    public g(float f10) {
        this.f5605a = f10;
    }

    @Override // S5.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f5605a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f5605a == ((g) obj).f5605a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5605a)});
    }
}
