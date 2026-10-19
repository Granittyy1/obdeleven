package com.voltasit.obdeleven.presentation.garage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: GarageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ GarageFragment f32384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(GarageFragment garageFragment, RecyclerView.l lVar) {
        super(lVar);
        this.f32384g = garageFragment;
    }

    @Override // com.voltasit.obdeleven.presentation.garage.r
    public final void c(int i10, int i11, RecyclerView recyclerView) {
        this.f32384g.O().f(i10, i11);
    }
}
