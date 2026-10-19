package p312z5;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: CarouselLayoutManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f48840p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f48840p = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public final PointF a(int i10) {
        return this.f48840p.a(i10);
    }

    @Override // androidx.recyclerview.widget.z
    public final int f(int i10, View view) {
        CarouselLayoutManager carouselLayoutManager = this.f48840p;
        if (carouselLayoutManager.f26884u == null || !carouselLayoutManager.T0()) {
            return 0;
        }
        int iL = RecyclerView.l.L(view);
        return (int) (carouselLayoutManager.f26879p - carouselLayoutManager.Q0(iL, carouselLayoutManager.P0(iL)));
    }

    @Override // androidx.recyclerview.widget.z
    public final int g(int i10, View view) {
        CarouselLayoutManager carouselLayoutManager = this.f48840p;
        if (carouselLayoutManager.f26884u == null || carouselLayoutManager.T0()) {
            return 0;
        }
        int iL = RecyclerView.l.L(view);
        return (int) (carouselLayoutManager.f26879p - carouselLayoutManager.Q0(iL, carouselLayoutManager.P0(iL)));
    }
}
