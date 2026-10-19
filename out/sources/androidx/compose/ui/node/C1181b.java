package androidx.compose.ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1181b implements androidx.compose.ui.focus.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1181b f14576a = new C1181b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f14577b;

    @Override // androidx.compose.ui.focus.q
    public final boolean b() {
        Boolean bool = f14577b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw C4.v.g("canFocus is read before it is written");
    }

    @Override // androidx.compose.ui.focus.q
    public final void c(boolean z10) {
        f14577b = Boolean.valueOf(z10);
    }
}
