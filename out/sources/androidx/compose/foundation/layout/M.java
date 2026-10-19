package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class M implements androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f10167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f10168c;

    public M(L l10) {
        this();
        this.f10168c = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return kotlin.jvm.internal.i.a(((M) obj).f10168c, this.f10168c);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.f
    public final androidx.compose.ui.modifier.h getKey() {
        return WindowInsetsPaddingKt.f10233a;
    }

    public final int hashCode() {
        return this.f10168c.hashCode();
    }

    @Override // androidx.compose.ui.modifier.f
    public final a0 j() {
        return (a0) this.f10167b.getValue();
    }

    @Override // androidx.compose.ui.modifier.d
    public final void m(androidx.compose.ui.modifier.g gVar) {
        this.f10167b.setValue(new C0941a(new O(this.f10168c), (a0) gVar.s(WindowInsetsPaddingKt.f10233a)));
    }

    public M() {
        this.f10167b = J0.f(new C0960u());
    }
}
