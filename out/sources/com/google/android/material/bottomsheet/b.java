package com.google.android.material.bottomsheet;

import A8.p;
import M5.f;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.D;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.b0;
import androidx.core.view.n0;
import androidx.core.view.v0;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p100i.m;
import p275w5.e;
import p275w5.g;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f26827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f26828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f26829i;
    public FrameLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0267b f26833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f26835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f26836q;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public static class C0267b extends BottomSheetBehavior.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f26838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n0 f26839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f26840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f26841d;

        public C0267b(FrameLayout frameLayout, n0 n0Var) {
            ColorStateList colorStateListG;
            this.f26839b = n0Var;
            S5.f fVar = BottomSheetBehavior.B(frameLayout).j;
            if (fVar != null) {
                colorStateListG = fVar.f5566b.f5591c;
            } else {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                colorStateListG = O.d.g(frameLayout);
            }
            if (colorStateListG != null) {
                this.f26838a = Boolean.valueOf(p.A(colorStateListG.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListA = G5.c.a(frameLayout.getBackground());
            Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
            if (numValueOf != null) {
                this.f26838a = Boolean.valueOf(p.A(numValueOf.intValue()));
            } else {
                this.f26838a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(int i10, View view) {
            d(view);
        }

        public final void d(View view) {
            v0.e cVar;
            v0.e cVar2;
            int top = view.getTop();
            n0 n0Var = this.f26839b;
            if (top < n0Var.d()) {
                Window window = this.f26840c;
                if (window != null) {
                    Boolean bool = this.f26838a;
                    boolean zBooleanValue = bool == null ? this.f26841d : bool.booleanValue();
                    D d10 = new D(window.getDecorView());
                    if (Build.VERSION.SDK_INT >= 30) {
                        v0.d dVar = new v0.d(window.getInsetsController(), d10);
                        dVar.f16996b = window;
                        cVar2 = dVar;
                    } else {
                        cVar2 = new v0.c(window, d10);
                    }
                    cVar2.c(zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), n0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f26840c;
                if (window2 != null) {
                    boolean z10 = this.f26841d;
                    D d11 = new D(window2.getDecorView());
                    if (Build.VERSION.SDK_INT >= 30) {
                        v0.d dVar2 = new v0.d(window2.getInsetsController(), d11);
                        dVar2.f16996b = window2;
                        cVar = dVar2;
                    } else {
                        cVar = new v0.c(window2, d11);
                    }
                    cVar.c(z10);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.f26840c == window) {
                return;
            }
            this.f26840c = window;
            if (window != null) {
                this.f26841d = new v0(window, window.getDecorView()).f16993a.a();
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f26827g == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.f26828h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f26828h = frameLayout;
            this.f26829i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f26828h.findViewById(R.id.design_bottom_sheet);
            this.j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.f26827g = bottomSheetBehaviorB;
            a aVar = this.f26836q;
            ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehaviorB.f26781X;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.f26827g.G(this.f26830k);
            this.f26835p = new f(this.f26827g, this.j);
        }
    }

    public final FrameLayout g(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f26828h.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f26834o) {
            FrameLayout frameLayout = this.j;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.d.u(frameLayout, aVar);
        }
        this.j.removeAllViews();
        if (layoutParams == null) {
            this.j.addView(view);
        } else {
            this.j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new e(this));
        O.n(this.j, new p275w5.f(this));
        this.j.setOnTouchListener(new g());
        return this.f26828h;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f26834o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f26828h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f26829i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            b0.a(window, !z10);
            C0267b c0267b = this.f26833n;
            if (c0267b != null) {
                c0267b.e(window);
            }
        }
        f fVar = this.f26835p;
        if (fVar == null) {
            return;
        }
        if (this.f26830k) {
            fVar.a(false);
            return;
        }
        f.a aVar = fVar.f4573a;
        if (aVar != null) {
            aVar.c(fVar.f4575c);
        }
    }

    @Override // p100i.m, androidx.activity.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        f.a aVar;
        C0267b c0267b = this.f26833n;
        if (c0267b != null) {
            c0267b.e(null);
        }
        f fVar = this.f26835p;
        if (fVar == null || (aVar = fVar.f4573a) == null) {
            return;
        }
        aVar.c(fVar.f4575c);
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f26827g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f26770M != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        f fVar;
        super.setCancelable(z10);
        if (this.f26830k != z10) {
            this.f26830k = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f26827g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z10);
            }
            if (getWindow() == null || (fVar = this.f26835p) == null) {
                return;
            }
            if (this.f26830k) {
                fVar.a(false);
                return;
            }
            f.a aVar = fVar.f4573a;
            if (aVar != null) {
                aVar.c(fVar.f4575c);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f26830k) {
            this.f26830k = true;
        }
        this.f26831l = z10;
        this.f26832m = true;
    }

    @Override // p100i.m, androidx.activity.q, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(g(null, i10, null));
    }

    @Override // p100i.m, androidx.activity.q, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // p100i.m, androidx.activity.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(int i10, View view) {
            if (i10 == 5) {
                b.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
        }
    }
}
