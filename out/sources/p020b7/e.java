package p020b7;

import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: compiled from: ViewMeasure.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f20613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20615c;

    public final int a() {
        View view = this.f20613a;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom();
    }
}
