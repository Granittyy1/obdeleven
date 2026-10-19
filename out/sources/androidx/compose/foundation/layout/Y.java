package androidx.compose.foundation.layout;

import A1.C0575j;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f10245b;

    public Y(E e10, String str) {
        this.f10244a = str;
        this.f10245b = J0.f(e10);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return e().f10113a;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return e().f10116d;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return e().f10115c;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return e().f10114b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final E e() {
        return (E) this.f10245b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y) {
            return kotlin.jvm.internal.i.a(e(), ((Y) obj).e());
        }
        return false;
    }

    public final void f(E e10) {
        this.f10245b.setValue(e10);
    }

    public final int hashCode() {
        return this.f10244a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10244a);
        sb2.append("(left=");
        sb2.append(e().f10113a);
        sb2.append(", top=");
        sb2.append(e().f10114b);
        sb2.append(", right=");
        sb2.append(e().f10115c);
        sb2.append(", bottom=");
        return C0575j.b(sb2, e().f10116d, ')');
    }
}
