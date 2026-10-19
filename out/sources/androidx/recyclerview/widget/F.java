package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.l f19493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19494b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f19495c = new Rect();

    public F(RecyclerView.l lVar) {
        this.f19493a = lVar;
    }

    public static F a(RecyclerView.l lVar, int i10) {
        if (i10 == 0) {
            return new D(lVar);
        }
        if (i10 == 1) {
            return new E(lVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f19494b) {
            return 0;
        }
        return l() - this.f19494b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
