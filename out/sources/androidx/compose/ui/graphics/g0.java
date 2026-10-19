package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: RectHelper.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    @p293xa.d
    public static final Rect a(I.f fVar) {
        return new Rect((int) fVar.f3757a, (int) fVar.f3758b, (int) fVar.f3759c, (int) fVar.f3760d);
    }

    public static final Rect b(p013b0.k kVar) {
        return new Rect(kVar.f20486a, kVar.f20487b, kVar.f20488c, kVar.f20489d);
    }

    public static final RectF c(I.f fVar) {
        return new RectF(fVar.f3757a, fVar.f3758b, fVar.f3759c, fVar.f3760d);
    }

    public static final I.f d(Rect rect) {
        return new I.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final I.f e(RectF rectF) {
        return new I.f(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
