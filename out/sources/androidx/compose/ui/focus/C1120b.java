package androidx.compose.ui.focus;

/* JADX INFO: renamed from: androidx.compose.ui.focus.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1120b implements InterfaceC1124f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13446b;

    public C1120b(int i10) {
        this.f13445a = i10;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1124f
    public final int a() {
        return this.f13445a;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1124f
    public final void b() {
        this.f13446b = true;
    }
}
