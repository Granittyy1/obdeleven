package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: LinearSmoothScroller.java */
/* JADX INFO: loaded from: classes.dex */
public class z extends RecyclerView.w {
    public PointF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DisplayMetrics f20051k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f20053m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearInterpolator f20049h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DecelerateInterpolator f20050i = new DecelerateInterpolator();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20052l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20054n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20055o = 0;

    public z(Context context) {
        this.f20051k = context.getResources().getDisplayMetrics();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.w.a aVar) {
        int i10;
        PointF pointF = this.j;
        int i11 = 0;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 == 0.0f) {
                i10 = 0;
            } else {
                i10 = f10 > 0.0f ? 1 : -1;
            }
        } else {
            i10 = 0;
        }
        int iF = f(i10, view);
        PointF pointF2 = this.j;
        if (pointF2 != null) {
            float f11 = pointF2.y;
            if (f11 != 0.0f) {
                i11 = f11 > 0.0f ? 1 : -1;
            }
        }
        int iG = g(i11, view);
        int iCeil = (int) Math.ceil(((double) i((int) Math.sqrt((iG * iG) + (iF * iF)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f20050i;
            aVar.f19729a = -iF;
            aVar.f19730b = -iG;
            aVar.f19731c = iCeil;
            aVar.f19733e = decelerateInterpolator;
            aVar.f19734f = true;
        }
    }

    public int f(int i10, View view) {
        RecyclerView.l lVar = this.f19724c;
        if (lVar == null || !lVar.f()) {
            return 0;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return e(RecyclerView.l.C(view) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, RecyclerView.l.D(view) + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, lVar.I(), lVar.f19693n - lVar.J(), i10);
    }

    public int g(int i10, View view) {
        RecyclerView.l lVar = this.f19724c;
        if (lVar == null || !lVar.g()) {
            return 0;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return e(RecyclerView.l.E(view) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, RecyclerView.l.A(view) + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin, lVar.K(), lVar.f19694o - lVar.H(), i10);
    }

    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f20052l) {
            this.f20053m = h(this.f20051k);
            this.f20052l = true;
        }
        return (int) Math.ceil(fAbs * this.f20053m);
    }
}
