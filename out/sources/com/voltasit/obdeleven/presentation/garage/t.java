package com.voltasit.obdeleven.presentation.garage;

import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: RemoveVehicleParams.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32393a;

    public t(int i10) {
        this.f32393a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        tVar.getClass();
        return this.f32393a == tVar.f32393a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32393a) + p005a4.q.b(R.string.common_remove, Integer.hashCode(R.string.snackbar_remove_vehicle) * 31, 31);
    }

    public final String toString() {
        return p005a4.q.c(new StringBuilder("RemoveVehicleParams(descriptionText=2131955075, actionText=2131952590, vehicleIndex="), this.f32393a, ")");
    }
}
