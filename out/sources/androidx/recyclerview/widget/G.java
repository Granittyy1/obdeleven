package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: PagerSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class G extends z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H f19496p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h8, Context context) {
        super(context);
        this.f19496p = h8;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.RecyclerView.w
    public final void c(View view, RecyclerView.w.a aVar) {
        H h8 = this.f19496p;
        int[] iArrA = h8.a(h8.f19556a.getLayoutManager(), view);
        int i10 = iArrA[0];
        int i11 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) i(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f20050i;
            aVar.f19729a = i10;
            aVar.f19730b = i11;
            aVar.f19731c = iCeil;
            aVar.f19733e = decelerateInterpolator;
            aVar.f19734f = true;
        }
    }

    @Override // androidx.recyclerview.widget.z
    public final float h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.z
    public final int i(int i10) {
        return Math.min(100, super.i(i10));
    }
}
