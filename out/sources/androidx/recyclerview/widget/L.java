package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: ScrollbarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class L {
    public static int a(RecyclerView.x xVar, F f10, View view, View view2, RecyclerView.l lVar, boolean z10) {
        if (lVar.x() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(RecyclerView.l.L(view) - RecyclerView.l.L(view2)) + 1;
        }
        return Math.min(f10.l(), f10.b(view2) - f10.e(view));
    }

    public static int b(RecyclerView.x xVar, F f10, View view, View view2, RecyclerView.l lVar, boolean z10, boolean z11) {
        if (lVar.x() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (xVar.b() - Math.max(RecyclerView.l.L(view), RecyclerView.l.L(view2))) - 1) : Math.max(0, Math.min(RecyclerView.l.L(view), RecyclerView.l.L(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(f10.b(view2) - f10.e(view)) / (Math.abs(RecyclerView.l.L(view) - RecyclerView.l.L(view2)) + 1))) + (f10.k() - f10.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.x xVar, F f10, View view, View view2, RecyclerView.l lVar, boolean z10) {
        if (lVar.x() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return xVar.b();
        }
        return (int) (((f10.b(view2) - f10.e(view)) / (Math.abs(RecyclerView.l.L(view) - RecyclerView.l.L(view2)) + 1)) * xVar.b());
    }
}
