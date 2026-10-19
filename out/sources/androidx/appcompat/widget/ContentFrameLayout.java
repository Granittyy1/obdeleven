package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f8666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f8668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f8669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f8670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f8671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f8672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f8673i;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8672h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f8670f == null) {
            this.f8670f = new TypedValue();
        }
        return this.f8670f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f8671g == null) {
            this.f8671g = new TypedValue();
        }
        return this.f8671g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f8668d == null) {
            this.f8668d = new TypedValue();
        }
        return this.f8668d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8669e == null) {
            this.f8669e = new TypedValue();
        }
        return this.f8669e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f8666b == null) {
            this.f8666b = new TypedValue();
        }
        return this.f8666b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f8667c == null) {
            this.f8667c = new TypedValue();
        }
        return this.f8667c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f8673i;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f8673i;
        if (aVar != null) {
            p100i.g gVar = ((p100i.h) aVar).f36383a;
            B b10 = gVar.f36336s;
            if (b10 != null) {
                b10.i();
            }
            if (gVar.f36345x != null) {
                gVar.f36327m.getDecorView().removeCallbacks(gVar.f36347y);
                if (gVar.f36345x.isShowing()) {
                    try {
                        gVar.f36345x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                gVar.f36345x = null;
            }
            androidx.core.view.Z z10 = gVar.f36348z;
            if (z10 != null) {
                z10.b();
            }
            androidx.appcompat.view.menu.f fVar = gVar.Q(0).f36374h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f8672h;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f8669e : this.f8668d;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z10 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z12 ? this.f8670f : this.f8671g;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f8667c : this.f8666b;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(a aVar) {
        this.f8673i = aVar;
    }
}
