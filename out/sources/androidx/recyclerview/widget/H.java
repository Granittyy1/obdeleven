package androidx.recyclerview.widget;

import android.view.View;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: PagerSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class H extends N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f19509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f19510d;

    public static int c(View view, F f10) {
        return ((f10.c(view) / 2) + f10.e(view)) - ((f10.l() / 2) + f10.k());
    }

    public static View d(RecyclerView.l lVar, F f10) {
        int iX = lVar.x();
        View view = null;
        if (iX == 0) {
            return null;
        }
        int iL = (f10.l() / 2) + f10.k();
        int i10 = BrazeLogger.SUPPRESS;
        for (int i11 = 0; i11 < iX; i11++) {
            View viewW = lVar.w(i11);
            int iAbs = Math.abs(((f10.c(viewW) / 2) + f10.e(viewW)) - iL);
            if (iAbs < i10) {
                view = viewW;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.N
    public final int[] a(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.f()) {
            iArr[0] = c(view, e(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.g()) {
            iArr[1] = c(view, f(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final F e(RecyclerView.l lVar) {
        D d10 = this.f19510d;
        if (d10 == null || d10.f19493a != lVar) {
            this.f19510d = new D(lVar);
        }
        return this.f19510d;
    }

    public final F f(RecyclerView.l lVar) {
        E e10 = this.f19509c;
        if (e10 == null || e10.f19493a != lVar) {
            this.f19509c = new E(lVar);
        }
        return this.f19509c;
    }
}
