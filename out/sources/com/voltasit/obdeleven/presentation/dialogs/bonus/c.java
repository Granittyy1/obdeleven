package com.voltasit.obdeleven.presentation.dialogs.bonus;

import androidx.compose.animation.D;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: BonusDialogParameters.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SubscriptionType f32223f;

    public c(String cpuId, String mac, String serial, int i10, boolean z10, SubscriptionType subscriptionType) {
        i.e(cpuId, "cpuId");
        i.e(mac, "mac");
        i.e(serial, "serial");
        i.e(subscriptionType, "subscriptionType");
        this.f32218a = cpuId;
        this.f32219b = mac;
        this.f32220c = serial;
        this.f32221d = i10;
        this.f32222e = z10;
        this.f32223f = subscriptionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f32218a, cVar.f32218a) && i.a(this.f32219b, cVar.f32219b) && i.a(this.f32220c, cVar.f32220c) && this.f32221d == cVar.f32221d && this.f32222e == cVar.f32222e && this.f32223f == cVar.f32223f;
    }

    public final int hashCode() {
        return this.f32223f.hashCode() + D.b(q.b(this.f32221d, B1.a.b(this.f32220c, B1.a.b(this.f32219b, this.f32218a.hashCode() * 31, 31), 31), 31), 31, this.f32222e);
    }

    public final String toString() {
        return "BonusDialogParameters(cpuId=" + this.f32218a + ", mac=" + this.f32219b + ", serial=" + this.f32220c + ", creditsFromDevice=" + this.f32221d + ", canConsumePro=" + this.f32222e + ", subscriptionType=" + this.f32223f + ")";
    }
}
