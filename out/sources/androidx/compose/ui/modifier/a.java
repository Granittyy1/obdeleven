package androidx.compose.ui.modifier;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f<?> f14300c;

    @Override // C.g
    public final boolean I(c<?> cVar) {
        return cVar == this.f14300c.getKey();
    }

    @Override // C.g
    public final Object M(h hVar) {
        if (hVar != this.f14300c.getKey()) {
            R.a.b("Check failed.");
        }
        return this.f14300c.j();
    }
}
