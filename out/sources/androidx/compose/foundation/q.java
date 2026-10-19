package androidx.compose.foundation;

import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.e0;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.compose.ui.h.c implements e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f11018r = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Ia.l<? super InterfaceC1170p, p293xa.r> f11019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f11020q = f11018r;

    /* JADX INFO: compiled from: FocusedBounds.kt */
    public static final class a {
    }

    public q(Ia.l<? super InterfaceC1170p, p293xa.r> lVar) {
        this.f11019p = lVar;
    }

    @Override // androidx.compose.ui.node.e0
    public final Object J() {
        return this.f11020q;
    }

    public final void Q1(InterfaceC1170p interfaceC1170p) {
        this.f11019p.invoke(interfaceC1170p);
        q qVar = (q) Cb.a.f(this);
        if (qVar != null) {
            qVar.Q1(interfaceC1170p);
        }
    }
}
