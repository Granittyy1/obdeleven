package X5;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: CutoutDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class j extends S5.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f7250A = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f7251z;

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static class b extends j {
        @Override // S5.f
        public final void f(Canvas canvas) {
            if (this.f7251z.f7252r.isEmpty()) {
                super.f(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f7251z.f7252r);
            super.f(canvas);
            canvas.restore();
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f7251z = new a(this.f7251z);
        return this;
    }

    public final void o(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f7251z.f7252r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static final class a extends S5.f.b {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final RectF f7252r;

        public a(S5.i iVar, RectF rectF) {
            super(iVar);
            this.f7252r = rectF;
        }

        @Override // S5.f.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.f7251z = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f7252r = aVar.f7252r;
        }
    }
}
