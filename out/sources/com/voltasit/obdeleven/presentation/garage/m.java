package com.voltasit.obdeleven.presentation.garage;

import D2.F;

/* JADX INFO: compiled from: GarageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements F.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarageFragment f32378b;

    public m(GarageFragment garageFragment) {
        this.f32378b = garageFragment;
    }

    @Override // D2.F.e
    public final void a(F transition) {
        kotlin.jvm.internal.i.e(transition, "transition");
    }

    @Override // D2.F.e
    public final void b(F transition) {
        kotlin.jvm.internal.i.e(transition, "transition");
    }

    @Override // D2.F.e
    public final void c(F transition) {
        kotlin.jvm.internal.i.e(transition, "transition");
    }

    @Override // D2.F.e
    public final void d(F transition) {
        kotlin.jvm.internal.i.e(transition, "transition");
        a aVar = this.f32378b.f32303p;
        if (aVar != null) {
            aVar.b(false);
        } else {
            kotlin.jvm.internal.i.m("garageAdapter");
            throw null;
        }
    }

    @Override // D2.F.e
    public final void e(F transition) {
        kotlin.jvm.internal.i.e(transition, "transition");
        a aVar = this.f32378b.f32303p;
        if (aVar != null) {
            aVar.f32356e = true;
        } else {
            kotlin.jvm.internal.i.m("garageAdapter");
            throw null;
        }
    }
}
