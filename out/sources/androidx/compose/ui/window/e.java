package androidx.compose.ui.window;

import Ia.p;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.c0;
import androidx.core.view.n0;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractComposeView implements g, InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f15826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f15827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15831g;

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class a extends c0.b {
        public a() {
            super(1);
        }

        @Override // androidx.core.view.c0.b
        public final n0 c(n0 n0Var, List<c0> list) {
            e eVar = e.this;
            if (eVar.f15829e) {
                return n0Var;
            }
            View childAt = eVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, eVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, eVar.getHeight() - childAt.getBottom());
            return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? n0Var : n0Var.f16948a.n(iMax, iMax2, iMax3, iMax4);
        }

        @Override // androidx.core.view.c0.b
        public final c0.a d(c0.a aVar) {
            e eVar = e.this;
            if (eVar.f15829e) {
                return aVar;
            }
            View childAt = eVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, eVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, eVar.getHeight() - childAt.getBottom());
            if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                return aVar;
            }
            p222s0.b bVarB = p222s0.b.b(iMax, iMax2, iMax3, iMax4);
            p222s0.b bVar = aVar.f16890a;
            int i10 = bVarB.f46851a;
            int i11 = bVarB.f46852b;
            int i12 = bVarB.f46853c;
            int i13 = bVarB.f46854d;
            return new c0.a(n0.e(bVar, i10, i11, i12, i13), n0.e(aVar.f16891b, i10, i11, i12, i13));
        }
    }

    public e(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f15826b = window;
        this.f15827c = J0.f(ComposableSingletons$AndroidDialog_androidKt.f15793a);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(this, this);
        O.p(this, new a());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(1735448596);
        ((p) this.f15827c.getValue()).invoke(interfaceC1084f, 0);
        interfaceC1084f.D();
    }

    @Override // androidx.compose.ui.window.g
    public final Window a() {
        return this.f15826b;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public final n0 g(View view, n0 n0Var) {
        if (this.f15829e) {
            return n0Var;
        }
        View childAt = getChildAt(0);
        int iMax = Math.max(0, childAt.getLeft());
        int iMax2 = Math.max(0, childAt.getTop());
        int iMax3 = Math.max(0, getWidth() - childAt.getRight());
        int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
        return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? n0Var : n0Var.f16948a.n(iMax, iMax2, iMax3, iMax4);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15831g;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i14 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i15 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int i10, int i11) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        Window window = this.f15826b;
        int i12 = (mode != Integer.MIN_VALUE || this.f15828d || this.f15829e || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingBottom;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f15828d || this.f15829e || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
