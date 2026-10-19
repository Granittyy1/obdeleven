package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27683b;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f27684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I5.a f27686d;

        public a(View view, int i10, I5.a aVar) {
            this.f27684b = view;
            this.f27685c = i10;
            this.f27686d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f27684b;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f27683b == this.f27685c) {
                I5.a aVar = this.f27686d;
                expandableBehavior.w((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f27683b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        I5.a aVar = (I5.a) view2;
        if (aVar.a()) {
            int i10 = this.f27683b;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f27683b != 1) {
            return false;
        }
        this.f27683b = aVar.a() ? 1 : 2;
        w((View) aVar, view, aVar.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        I5.a aVar;
        int i11;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (!view.isLaidOut()) {
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i12);
                if (f(view, view2)) {
                    aVar = (I5.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null && (!aVar.a() ? this.f27683b == 1 : !((i11 = this.f27683b) != 0 && i11 != 2))) {
                int i13 = aVar.a() ? 1 : 2;
                this.f27683b = i13;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27683b = 0;
    }
}
