package androidx.compose.material;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L implements androidx.compose.foundation.layout.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1085f0 f11771a;

    public L() {
        float f10 = 0;
        this.f11771a = J0.f(new androidx.compose.foundation.layout.N(f10, f10, f10, f10));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float a() {
        return ((androidx.compose.foundation.layout.L) this.f11771a.getValue()).a();
    }

    @Override // androidx.compose.foundation.layout.L
    public final float b(LayoutDirection layoutDirection) {
        return ((androidx.compose.foundation.layout.L) this.f11771a.getValue()).b(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.L
    public final float c(LayoutDirection layoutDirection) {
        return ((androidx.compose.foundation.layout.L) this.f11771a.getValue()).c(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.L
    public final float d() {
        return ((androidx.compose.foundation.layout.L) this.f11771a.getValue()).d();
    }
}
