package com.voltasit.obdeleven.presentation.vehicle;

import androidx.compose.animation.D;
import kotlin.jvm.internal.i;
import p255u9.E;

/* JADX INFO: compiled from: VehicleParameters.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f33432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33434d;

    public e() {
        this("", null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.a(this.f33431a, eVar.f33431a) && i.a(this.f33432b, eVar.f33432b) && this.f33433c == eVar.f33433c && this.f33434d == eVar.f33434d;
    }

    public final int hashCode() {
        int iHashCode = this.f33431a.hashCode() * 31;
        E e10 = this.f33432b;
        return Boolean.hashCode(this.f33434d) + D.b((iHashCode + (e10 == null ? 0 : e10.hashCode())) * 31, 31, this.f33433c);
    }

    public final String toString() {
        return "VehicleParameters(vehicleId=" + this.f33431a + ", vehicleDB=" + this.f33432b + ", isPictureCheckDisabled=" + this.f33433c + ", isFromStart=" + this.f33434d + ")";
    }

    public e(String vehicleId, E e10, boolean z10, boolean z11) {
        i.e(vehicleId, "vehicleId");
        this.f33431a = vehicleId;
        this.f33432b = e10;
        this.f33433c = z10;
        this.f33434d = z11;
    }
}
