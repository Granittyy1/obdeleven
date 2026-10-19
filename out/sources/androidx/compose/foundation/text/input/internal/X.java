package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.M0;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class X implements androidx.compose.ui.text.input.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f11328a;

    /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.kt */
    public interface a {
        InterfaceC1170p Y();
    }

    @Override // androidx.compose.ui.text.input.t
    public final void c() {
        M0 m0Q1;
        T t8 = this.f11328a;
        if (t8 == null || (m0Q1 = t8.Q1()) == null) {
            return;
        }
        m0Q1.a();
    }

    @Override // androidx.compose.ui.text.input.t
    public final void g() {
        M0 m0Q1;
        T t8 = this.f11328a;
        if (t8 == null || (m0Q1 = t8.Q1()) == null) {
            return;
        }
        m0Q1.b();
    }

    public abstract void i();

    public final void j(T t8) {
        if (this.f11328a != t8) {
            p245u.c.c("Expected textInputModifierNode to be " + t8 + " but was " + this.f11328a);
        }
        this.f11328a = null;
    }
}
