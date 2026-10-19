package androidx.compose.ui.modifier;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<?> f14303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f14304d = J0.f(null);

    public i(c<?> cVar) {
        this.f14303c = cVar;
    }

    @Override // C.g
    public final boolean I(c<?> cVar) {
        return cVar == this.f14303c;
    }

    @Override // C.g
    public final Object M(h hVar) {
        if (hVar != this.f14303c) {
            R.a.b("Check failed.");
        }
        T value = this.f14304d.getValue();
        if (value == 0) {
            return null;
        }
        return value;
    }
}
