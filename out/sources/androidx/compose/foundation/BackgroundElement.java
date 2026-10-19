package androidx.compose.foundation;

import androidx.compose.ui.graphics.Z;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends androidx.compose.ui.node.H<C0933e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.graphics.C f9711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f9713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f9714f;

    public BackgroundElement() {
        throw null;
    }

    public BackgroundElement(long j, Z z10, float f10, l0 l0Var, Ia.l lVar, int i10) {
        j = (i10 & 1) != 0 ? androidx.compose.ui.graphics.H.f13504l : j;
        z10 = (i10 & 2) != 0 ? null : z10;
        this.f9710b = j;
        this.f9711c = z10;
        this.f9712d = f10;
        this.f9713e = l0Var;
        this.f9714f = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        C0933e c0933e = new C0933e();
        c0933e.f9892p = this.f9710b;
        c0933e.f9893q = this.f9711c;
        c0933e.f9894r = this.f9712d;
        c0933e.f9895s = this.f9713e;
        c0933e.f9896t = 9205357640488583168L;
        return c0933e;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        C0933e c0933e = (C0933e) cVar;
        c0933e.f9892p = this.f9710b;
        c0933e.f9893q = this.f9711c;
        c0933e.f9894r = this.f9712d;
        c0933e.f9895s = this.f9713e;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && androidx.compose.ui.graphics.H.c(this.f9710b, backgroundElement.f9710b) && kotlin.jvm.internal.i.a(this.f9711c, backgroundElement.f9711c) && this.f9712d == backgroundElement.f9712d && kotlin.jvm.internal.i.a(this.f9713e, backgroundElement.f9713e);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        int iHashCode = Long.hashCode(this.f9710b) * 31;
        androidx.compose.ui.graphics.C c10 = this.f9711c;
        return this.f9713e.hashCode() + O.a.d(this.f9712d, (iHashCode + (c10 != null ? c10.hashCode() : 0)) * 31, 31);
    }
}
