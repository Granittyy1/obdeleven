package p227s5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: ViewOffsetBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public class e<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f46923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46924c;

    public e() {
        this.f46924c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        y(coordinatorLayout, v10, i10);
        if (this.f46923b == null) {
            this.f46923b = new f(v10);
        }
        f fVar = this.f46923b;
        View view = fVar.f46925a;
        fVar.f46926b = view.getTop();
        fVar.f46927c = view.getLeft();
        this.f46923b.a();
        int i11 = this.f46924c;
        if (i11 == 0) {
            return true;
        }
        f fVar2 = this.f46923b;
        if (fVar2.f46928d != i11) {
            fVar2.f46928d = i11;
            fVar2.a();
        }
        this.f46924c = 0;
        return true;
    }

    public final int w() {
        f fVar = this.f46923b;
        if (fVar != null) {
            return fVar.f46928d;
        }
        return 0;
    }

    public int x() {
        return w();
    }

    public void y(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.r(i10, v10);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46924c = 0;
    }
}
