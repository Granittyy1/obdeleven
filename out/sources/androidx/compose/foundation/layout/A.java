package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A implements U, InterfaceC0965z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f10080a = new A();

    @Override // androidx.compose.foundation.layout.U
    public final androidx.compose.ui.h a(androidx.compose.ui.h hVar) {
        return hVar.i(new VerticalAlignElement(androidx.compose.ui.d.a.f13344k));
    }

    @Override // androidx.compose.foundation.layout.U
    public final androidx.compose.ui.h b(androidx.compose.ui.h hVar, boolean z10) {
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        return hVar.i(new LayoutWeightElement(z10, Na.l.z(1.0f, Float.MAX_VALUE)));
    }
}
