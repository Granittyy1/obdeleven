package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1213c0 implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.text.input.y f15034a;

    public C1213c0(androidx.compose.ui.text.input.y yVar) {
        this.f15034a = yVar;
    }

    @Override // androidx.compose.ui.platform.M0
    public final void a() {
        androidx.compose.ui.text.input.y yVar = this.f15034a;
        if (yVar.f15580b.get() != null) {
            yVar.f15579a.c();
        }
    }

    @Override // androidx.compose.ui.platform.M0
    public final void b() {
        this.f15034a.f15579a.g();
    }
}
