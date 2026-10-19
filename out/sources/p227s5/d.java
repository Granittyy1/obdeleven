package p227s5;

import S4.o;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: HeaderScrollingViewBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends e<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f46919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f46920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46922g;

    public d() {
        this.f46919d = new Rect();
        this.f46920e = new Rect();
        this.f46921f = 0;
    }

    public float A(View view) {
        return 1.0f;
    }

    public int B(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout appBarLayoutZ;
        n0 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 != -1 && i13 != -2) || (appBarLayoutZ = z(coordinatorLayout.e(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (appBarLayoutZ.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iB = B(appBarLayoutZ) + size;
        int measuredHeight = appBarLayoutZ.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iB -= measuredHeight;
        }
        coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iB, i13 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // p227s5.e
    public final void y(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout appBarLayoutZ = z(coordinatorLayout.e(view));
        int iD = 0;
        if (appBarLayoutZ == null) {
            coordinatorLayout.r(i10, view);
            this.f46921f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.f46919d;
        rect.set(paddingLeft, bottom, width, bottom2);
        n0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i11 = fVar.f16651c;
        if (i11 == 0) {
            i11 = 8388659;
        }
        int i12 = i11;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f46920e;
        Gravity.apply(i12, measuredWidth, measuredHeight, rect, rect2, i10);
        if (this.f46922g != 0) {
            float fA = A(appBarLayoutZ);
            int i13 = this.f46922g;
            iD = o.d((int) (fA * i13), 0, i13);
        }
        view.layout(rect2.left, rect2.top - iD, rect2.right, rect2.bottom - iD);
        this.f46921f = rect2.top - appBarLayoutZ.getBottom();
    }

    public abstract AppBarLayout z(ArrayList arrayList);

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46919d = new Rect();
        this.f46920e = new Rect();
        this.f46921f = 0;
    }
}
