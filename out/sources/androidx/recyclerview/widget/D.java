package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class D extends F {
    @Override // androidx.recyclerview.widget.F
    public final int b(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        return RecyclerView.l.D(view) + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f19702b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f19702b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int e(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        return RecyclerView.l.C(view) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int f() {
        return this.f19493a.f19693n;
    }

    @Override // androidx.recyclerview.widget.F
    public final int g() {
        RecyclerView.l lVar = this.f19493a;
        return lVar.f19693n - lVar.J();
    }

    @Override // androidx.recyclerview.widget.F
    public final int h() {
        return this.f19493a.J();
    }

    @Override // androidx.recyclerview.widget.F
    public final int i() {
        return this.f19493a.f19691l;
    }

    @Override // androidx.recyclerview.widget.F
    public final int j() {
        return this.f19493a.f19692m;
    }

    @Override // androidx.recyclerview.widget.F
    public final int k() {
        return this.f19493a.I();
    }

    @Override // androidx.recyclerview.widget.F
    public final int l() {
        RecyclerView.l lVar = this.f19493a;
        return (lVar.f19693n - lVar.I()) - lVar.J();
    }

    @Override // androidx.recyclerview.widget.F
    public final int n(View view) {
        RecyclerView.l lVar = this.f19493a;
        Rect rect = this.f19495c;
        lVar.O(rect, view);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.F
    public final int o(View view) {
        RecyclerView.l lVar = this.f19493a;
        Rect rect = this.f19495c;
        lVar.O(rect, view);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.F
    public final void p(int i10) {
        this.f19493a.S(i10);
    }
}
