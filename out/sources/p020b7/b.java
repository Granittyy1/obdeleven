package p020b7;

import H3.c;
import android.view.View;

/* JADX INFO: compiled from: MeasureUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static void a(View view, int i10, int i11, int i12, int i13) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        c.j();
        if (view.getVisibility() == 8) {
            i10 = 0;
            i11 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, i12), View.MeasureSpec.makeMeasureSpec(i11, i13));
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        c.j();
    }

    public static void b(View view, int i10, int i11) {
        a(view, i10, i11, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
