package T5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: LeftSheetDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f6023a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f6023a = sideSheetBehavior;
    }

    @Override // T5.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // T5.d
    public final float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // T5.d
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // T5.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6023a;
        return Math.max(0, sideSheetBehavior.f27366o + sideSheetBehavior.f27367p);
    }

    @Override // T5.d
    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6023a;
        return (-sideSheetBehavior.f27364m) - sideSheetBehavior.f27367p;
    }

    @Override // T5.d
    public final int f() {
        return this.f6023a.f27367p;
    }

    @Override // T5.d
    public final int g() {
        return -this.f6023a.f27364m;
    }

    @Override // T5.d
    public final <V extends View> int h(V v10) {
        return v10.getRight() + this.f6023a.f27367p;
    }

    @Override // T5.d
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // T5.d
    public final int j() {
        return 1;
    }

    @Override // T5.d
    public final boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // T5.d
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // T5.d
    public final boolean m(float f10, float f11) {
        if (Math.abs(f10) > Math.abs(f11)) {
            float fAbs = Math.abs(f10);
            this.f6023a.getClass();
            if (fAbs > 500) {
                return true;
            }
        }
        return false;
    }

    @Override // T5.d
    public final boolean n(View view, float f10) {
        float left = view.getLeft();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6023a;
        float fAbs = Math.abs((f10 * sideSheetBehavior.f27363l) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // T5.d
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // T5.d
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f6023a.f27365n) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
