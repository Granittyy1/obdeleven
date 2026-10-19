package androidx.compose.foundation.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0955o implements InterfaceC0954n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0955o f10310a = new C0955o();

    @Override // androidx.compose.foundation.layout.InterfaceC0954n
    public final androidx.compose.ui.h a(boolean z10) {
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        return new LayoutWeightElement(z10, Na.l.z(1.0f, Float.MAX_VALUE));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0954n
    public final androidx.compose.ui.h b(androidx.compose.ui.h hVar, androidx.compose.ui.d.b bVar) {
        return hVar.i(new HorizontalAlignElement(bVar));
    }
}
