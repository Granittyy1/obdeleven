package com.voltasit.obdeleven.presentation.oca;

import com.voltasit.obdeleven.core.app.C2098m;
import p005a4.q;
import p255u9.E;

/* JADX INFO: compiled from: WriteValueData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2098m f32786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f32789d;

    public m(C2098m appWorker, int i10, int i11, E vehicle) {
        kotlin.jvm.internal.i.e(appWorker, "appWorker");
        kotlin.jvm.internal.i.e(vehicle, "vehicle");
        this.f32786a = appWorker;
        this.f32787b = i10;
        this.f32788c = i11;
        this.f32789d = vehicle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.i.a(this.f32786a, mVar.f32786a) && this.f32787b == mVar.f32787b && this.f32788c == mVar.f32788c && kotlin.jvm.internal.i.a(this.f32789d, mVar.f32789d);
    }

    public final int hashCode() {
        return this.f32789d.hashCode() + q.b(this.f32788c, q.b(this.f32787b, this.f32786a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "WriteValueData(appWorker=" + this.f32786a + ", position=" + this.f32787b + ", oldPosition=" + this.f32788c + ", vehicle=" + this.f32789d + ")";
    }
}
