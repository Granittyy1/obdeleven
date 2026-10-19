package com.voltasit.obdeleven.presentation.garage;

import G8.H;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: GarageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends androidx.recyclerview.widget.t.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarageFragment f32383b;

    public p(GarageFragment garageFragment) {
        this.f32383b = garageFragment;
        this.f20034a = 4;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.B viewHolder, RecyclerView.B target) {
        kotlin.jvm.internal.i.e(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.e(viewHolder, "viewHolder");
        kotlin.jvm.internal.i.e(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final void onSwiped(RecyclerView.B viewHolder, int i10) {
        kotlin.jvm.internal.i.e(viewHolder, "viewHolder");
        GarageViewModel garageViewModelO = this.f32383b.O();
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        List<H> listD = garageViewModelO.f32348y.d();
        if (listD != null) {
            if (bindingAdapterPosition >= listD.size()) {
                garageViewModelO.f32338o.b("GarageViewModel", "Vehicle index bigger than vehicle count");
            } else {
                garageViewModelO.f32329V.j(new t(bindingAdapterPosition));
            }
        }
    }
}
