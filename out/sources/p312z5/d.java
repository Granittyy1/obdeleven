package p312z5;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: CarouselOrientationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f48842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f48842b = carouselLayoutManager;
    }

    @Override // p312z5.e
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.left;
        float f11 = rectF3.left;
        if (f10 < f11 && rectF2.right > f11) {
            float f12 = f11 - f10;
            rectF.left += f12;
            rectF2.left += f12;
        }
        float f13 = rectF2.right;
        float f14 = rectF3.right;
        if (f13 <= f14 || rectF2.left >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.right = Math.max(rectF.right - f15, rectF.left);
        rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
    }

    @Override // p312z5.e
    public final float b(RecyclerView.m mVar) {
        return ((ViewGroup.MarginLayoutParams) mVar).rightMargin + ((ViewGroup.MarginLayoutParams) mVar).leftMargin;
    }

    @Override // p312z5.e
    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(f13, 0.0f, f11 - f13, f10);
    }

    @Override // p312z5.e
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f48842b;
        return carouselLayoutManager.f19694o - carouselLayoutManager.H();
    }

    @Override // p312z5.e
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f48842b;
        if (carouselLayoutManager.U0()) {
            return 0;
        }
        return carouselLayoutManager.f19693n;
    }

    @Override // p312z5.e
    public final int f() {
        return 0;
    }

    @Override // p312z5.e
    public final int g() {
        return this.f48842b.f19693n;
    }

    @Override // p312z5.e
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.f48842b;
        if (carouselLayoutManager.U0()) {
            return carouselLayoutManager.f19693n;
        }
        return 0;
    }

    @Override // p312z5.e
    public final int i() {
        return this.f48842b.K();
    }

    @Override // p312z5.e
    public final void j(View view, int i10, int i11) {
        RecyclerView.l.R(view, i10, this.f48842b.K(), i11, d());
    }

    @Override // p312z5.e
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // p312z5.e
    public final void l(View view, Rect rect, float f10, float f11) {
        view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
    }
}
