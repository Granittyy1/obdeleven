package T5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: RightSheetDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f6024a;

    public b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f6024a = sideSheetBehavior;
    }

    @Override // T5.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // T5.d
    public final float b(int i10) {
        float f10 = this.f6024a.f27365n;
        return (f10 - i10) / (f10 - d());
    }

    @Override // T5.d
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // T5.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6024a;
        return Math.max(0, (sideSheetBehavior.f27365n - sideSheetBehavior.f27364m) - sideSheetBehavior.f27367p);
    }

    @Override // T5.d
    public final int e() {
        return this.f6024a.f27365n;
    }

    @Override // T5.d
    public final int f() {
        return this.f6024a.f27365n;
    }

    @Override // T5.d
    public final int g() {
        return d();
    }

    @Override // T5.d
    public final <V extends View> int h(V v10) {
        return v10.getLeft() - this.f6024a.f27367p;
    }

    @Override // T5.d
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // T5.d
    public final int j() {
        return 0;
    }

    @Override // T5.d
    public final boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // T5.d
    public final boolean l(View view) {
        return view.getLeft() > (d() + this.f6024a.f27365n) / 2;
    }

    @Override // T5.d
    public final boolean m(float f10, float f11) {
        if (Math.abs(f10) > Math.abs(f11)) {
            float fAbs = Math.abs(f10);
            this.f6024a.getClass();
            if (fAbs > 500) {
                return true;
            }
        }
        return false;
    }

    @Override // T5.d
    public final boolean n(View view, float f10) {
        float right = view.getRight();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6024a;
        float fAbs = Math.abs((f10 * sideSheetBehavior.f27363l) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // T5.d
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // T5.d
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int i12 = this.f6024a.f27365n;
        if (i10 <= i12) {
            marginLayoutParams.rightMargin = i12 - i10;
        }
    }
}
