package com.google.android.material.behavior;

import B0.s;
import L0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.f;
import com.google.android.material.snackbar.h;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f26723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f26724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26727f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26728g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26729h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26730i = 0.5f;
    public final a j = new a();

    public class a extends c.AbstractC0064c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26732b = -1;

        public a() {
        }

        @Override // L0.c.AbstractC0064c
        public final int a(int i10, View view) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i11 = SwipeDismissBehavior.this.f26727f;
            if (i11 == 0) {
                if (z10) {
                    width = this.f26731a - view.getWidth();
                    width2 = this.f26731a;
                } else {
                    width = this.f26731a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 != 1) {
                width = this.f26731a - view.getWidth();
                width2 = view.getWidth() + this.f26731a;
            } else if (z10) {
                width = this.f26731a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f26731a - view.getWidth();
                width2 = this.f26731a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // L0.c.AbstractC0064c
        public final int b(int i10, View view) {
            return view.getTop();
        }

        @Override // L0.c.AbstractC0064c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // L0.c.AbstractC0064c
        public final void g(int i10, View view) {
            this.f26732b = i10;
            this.f26731a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f26726e = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f26726e = false;
            }
        }

        @Override // L0.c.AbstractC0064c
        public final void h(int i10) {
            f fVar = SwipeDismissBehavior.this.f26724c;
            if (fVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = fVar.f27439a;
                if (i10 == 0) {
                    h.b().e(baseTransientBottomBar.f27409w);
                } else if (i10 == 1 || i10 == 2) {
                    h.b().d(baseTransientBottomBar.f27409w);
                }
            }
        }

        @Override // L0.c.AbstractC0064c
        public final void i(View view, int i10, int i11) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f10 = width * swipeDismissBehavior.f26729h;
            float width2 = view.getWidth() * swipeDismissBehavior.f26730i;
            float fAbs = Math.abs(i10 - this.f26731a);
            if (fAbs <= f10) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0052  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        /* JADX WARN: Code duplicated, block: B:32:0x005f  */
        /* JADX WARN: Code duplicated, block: B:33:0x0061  */
        /* JADX WARN: Code duplicated, block: B:34:0x0066  */
        @Override // L0.c.AbstractC0064c
        public final void j(View view, float f10, float f11) {
            int i10;
            int left;
            int i11;
            f fVar;
            this.f26732b = -1;
            int width = view.getWidth();
            boolean z10 = true;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f10 != 0.0f) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                boolean z11 = view.getLayoutDirection() == 1;
                int i12 = swipeDismissBehavior.f26727f;
                if (i12 != 2 && (i12 != 0 ? i12 != 1 || (!z11 ? f10 < 0.0f : f10 > 0.0f) : !z11 ? f10 > 0.0f : f10 < 0.0f)) {
                    i10 = this.f26731a;
                    z10 = false;
                } else if (f10 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f26731a;
                    if (left < i11) {
                        i10 = this.f26731a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f26731a - width;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f26731a) < Math.round(view.getWidth() * swipeDismissBehavior.f26728g)) {
                    i10 = this.f26731a;
                    z10 = false;
                } else if (f10 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f26731a;
                    if (left < i11) {
                        i10 = this.f26731a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f26731a - width;
                }
            }
            if (swipeDismissBehavior.f26723b.q(i10, view.getTop())) {
                b bVar = new b(view, z10);
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                view.postOnAnimation(bVar);
            } else {
                if (!z10 || (fVar = swipeDismissBehavior.f26724c) == null) {
                    return;
                }
                fVar.a(view);
            }
        }

        @Override // L0.c.AbstractC0064c
        public final boolean k(int i10, View view) {
            int i11 = this.f26732b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.w(view);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26735c;

        public b(View view, boolean z10) {
            this.f26734b = view;
            this.f26735c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            c cVar = swipeDismissBehavior.f26723b;
            View view = this.f26734b;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                view.postOnAnimation(this);
            } else {
                if (!this.f26735c || (fVar = swipeDismissBehavior.f26724c) == null) {
                    return;
                }
                fVar.a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zP = this.f26725d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f26725d = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f26725d = false;
        }
        if (!zP) {
            return false;
        }
        if (this.f26723b == null) {
            this.f26723b = new c(coordinatorLayout.getContext(), coordinatorLayout, this.j);
        }
        return !this.f26726e && this.f26723b.r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (v10.getImportantForAccessibility() == 0) {
            v10.setImportantForAccessibility(1);
            O.k(1048576, v10);
            O.h(0, v10);
            if (w(v10)) {
                O.l(v10, s.a.f1423o, new p251u5.b(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f26723b == null) {
            return false;
        }
        if (this.f26726e && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f26723b.k(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
