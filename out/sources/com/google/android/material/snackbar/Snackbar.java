package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f27427E = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AccessibilityManager f27428C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f27429D;

    public static final class SnackbarLayout extends BaseTransientBottomBar.g {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public static class a extends BaseTransientBottomBar.e<Snackbar> {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e
        public final /* bridge */ /* synthetic */ void b(BaseTransientBottomBar baseTransientBottomBar) {
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f27428C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static Snackbar h(View view, CharSequence charSequence, int i10) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f27427E);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.f27396i.getChildAt(0)).getMessageView().setText(charSequence);
        snackbar.f27397k = i10;
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void a() {
        b(3);
    }

    public final void i() {
        h hVarB = h.b();
        int i10 = this.f27397k;
        boolean z10 = false;
        int recommendedTimeoutMillis = -2;
        if (i10 != -2) {
            int i11 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.f27428C;
            if (i11 >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i10, (this.f27429D ? 4 : 0) | 3);
            } else {
                if (this.f27429D && accessibilityManager.isTouchExplorationEnabled()) {
                    i10 = -2;
                }
                recommendedTimeoutMillis = i10;
            }
        }
        BaseTransientBottomBar.c cVar = this.f27409w;
        synchronized (hVarB.f27442a) {
            try {
                if (hVarB.c(cVar)) {
                    h.c cVar2 = hVarB.f27444c;
                    cVar2.f27448b = recommendedTimeoutMillis;
                    hVarB.f27443b.removeCallbacksAndMessages(cVar2);
                    hVarB.f(hVarB.f27444c);
                    return;
                }
                h.c cVar3 = hVarB.f27445d;
                if (cVar3 != null && cVar3.f27447a.get() == cVar) {
                    z10 = true;
                }
                if (z10) {
                    hVarB.f27445d.f27448b = recommendedTimeoutMillis;
                } else {
                    hVarB.f27445d = new h.c(recommendedTimeoutMillis, cVar);
                }
                h.c cVar4 = hVarB.f27444c;
                if (cVar4 == null || !hVarB.a(cVar4, 4)) {
                    hVarB.f27444c = null;
                    h.c cVar5 = hVarB.f27445d;
                    if (cVar5 != null) {
                        hVarB.f27444c = cVar5;
                        hVarB.f27445d = null;
                        h.b bVar = cVar5.f27447a.get();
                        if (bVar != null) {
                            bVar.a();
                        } else {
                            hVarB.f27444c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
