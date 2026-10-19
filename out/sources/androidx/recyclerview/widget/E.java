package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class E extends F {
    @Override // androidx.recyclerview.widget.F
    public final int b(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        return RecyclerView.l.A(view) + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f19702b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f19702b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int e(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f19493a.getClass();
        return RecyclerView.l.E(view) - ((ViewGroup.MarginLayoutParams) mVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.F
    public final int f() {
        return this.f19493a.f19694o;
    }

    @Override // androidx.recyclerview.widget.F
    public final int g() {
        RecyclerView.l lVar = this.f19493a;
        return lVar.f19694o - lVar.H();
    }

    @Override // androidx.recyclerview.widget.F
    public final int h() {
        return this.f19493a.H();
    }

    @Override // androidx.recyclerview.widget.F
    public final int i() {
        return this.f19493a.f19692m;
    }

    @Override // androidx.recyclerview.widget.F
    public final int j() {
        return this.f19493a.f19691l;
    }

    @Override // androidx.recyclerview.widget.F
    public final int k() {
        return this.f19493a.K();
    }

    @Override // androidx.recyclerview.widget.F
    public final int l() {
        RecyclerView.l lVar = this.f19493a;
        return (lVar.f19694o - lVar.K()) - lVar.H();
    }

    @Override // androidx.recyclerview.widget.F
    public final int n(View view) {
        RecyclerView.l lVar = this.f19493a;
        Rect rect = this.f19495c;
        lVar.O(rect, view);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.F
    public final int o(View view) {
        RecyclerView.l lVar = this.f19493a;
        Rect rect = this.f19495c;
        lVar.O(rect, view);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.F
    public final void p(int i10) {
        this.f19493a.T(i10);
    }
}
