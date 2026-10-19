package p008a7;

import H3.c;
import J4.i;
import U6.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseModalLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DisplayMetrics f8063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8064e;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8064e = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f6555a, 0, 0);
        try {
            this.f8061b = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            this.f8062c = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f8063d = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static int d(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static int e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    public static void f(View view, int i10, int i11, int i12, int i13) {
        c.j();
        c.j();
        view.layout(i10, i11, i12, i13);
    }

    public final int a(int i10) {
        if (getMaxHeightPct() <= 0.0f) {
            c.j();
            return View.MeasureSpec.getSize(i10);
        }
        c.j();
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4) * 4;
    }

    public final int b(int i10) {
        if (getMaxWidthPct() <= 0.0f) {
            c.j();
            return View.MeasureSpec.getSize(i10);
        }
        c.j();
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4) * 4;
    }

    public final View c(int i10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(i.b(i10, "No such child: "));
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f8063d;
    }

    public float getMaxHeightPct() {
        return this.f8062c;
    }

    public float getMaxWidthPct() {
        return this.f8061b;
    }

    public List<View> getVisibleChildren() {
        return this.f8064e;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        c.j();
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        c.j();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c.j();
        c.j();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        c.j();
        int i12 = getDisplayMetrics().widthPixels;
        int i13 = getDisplayMetrics().heightPixels;
        c.j();
        ArrayList arrayList = this.f8064e;
        arrayList.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            } else {
                c.j();
            }
        }
    }
}
