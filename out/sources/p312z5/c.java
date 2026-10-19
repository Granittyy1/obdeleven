package p312z5;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: CarouselOrientationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f48841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f48841b = carouselLayoutManager;
    }

    @Override // p312z5.e
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.top;
        float f11 = rectF3.top;
        if (f10 < f11 && rectF2.bottom > f11) {
            float f12 = f11 - f10;
            rectF.top += f12;
            rectF3.top += f12;
        }
        float f13 = rectF2.bottom;
        float f14 = rectF3.bottom;
        if (f13 <= f14 || rectF2.top >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
    }

    @Override // p312z5.e
    public final float b(RecyclerView.m mVar) {
        return ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // p312z5.e
    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(0.0f, f12, f11, f10 - f12);
    }

    @Override // p312z5.e
    public final int d() {
        return this.f48841b.f19694o;
    }

    @Override // p312z5.e
    public final int e() {
        return this.f48841b.f19694o;
    }

    @Override // p312z5.e
    public final int f() {
        return this.f48841b.I();
    }

    @Override // p312z5.e
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.f48841b;
        return carouselLayoutManager.f19693n - carouselLayoutManager.J();
    }

    @Override // p312z5.e
    public final int h() {
        return 0;
    }

    @Override // p312z5.e
    public final int i() {
        return 0;
    }

    @Override // p312z5.e
    public final void j(View view, int i10, int i11) {
        RecyclerView.l.R(view, this.f48841b.I(), i10, g(), i11);
    }

    @Override // p312z5.e
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // p312z5.e
    public final void l(View view, Rect rect, float f10, float f11) {
        view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
    }
}
