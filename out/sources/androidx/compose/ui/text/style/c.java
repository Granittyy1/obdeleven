package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements TextForegroundStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15657a;

    public c(long j) {
        this.f15657a = j;
        if (j != 16) {
            return;
        }
        Y.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float a() {
        return H.d(this.f15657a);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final long c() {
        return this.f15657a;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final C e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && H.c(this.f15657a, ((c) obj).f15657a);
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Long.hashCode(this.f15657a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) H.i(this.f15657a)) + ')';
    }
}
