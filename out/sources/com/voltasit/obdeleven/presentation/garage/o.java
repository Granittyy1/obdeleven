package com.voltasit.obdeleven.presentation.garage;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: compiled from: GarageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends Snackbar.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GarageFragment f32381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f32382b;

    public o(GarageFragment garageFragment, t tVar) {
        this.f32381a = garageFragment;
        this.f32382b = tVar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e
    public final void a(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        if (i10 != 1) {
            a aVar = this.f32381a.f32303p;
            if (aVar != null) {
                aVar.notifyItemChanged(this.f32382b.f32393a);
            } else {
                kotlin.jvm.internal.i.m("garageAdapter");
                throw null;
            }
        }
    }
}
