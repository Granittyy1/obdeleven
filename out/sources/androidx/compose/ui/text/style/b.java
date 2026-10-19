package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.j0;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TextForegroundStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f15655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15656b;

    public b(j0 j0Var, float f10) {
        this.f15655a = j0Var;
        this.f15656b = f10;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float a() {
        return this.f15656b;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final long c() {
        int i10 = H.f13505m;
        return H.f13504l;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final C e() {
        return this.f15655a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.i.a(this.f15655a, bVar.f15655a) && Float.compare(this.f15656b, bVar.f15656b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15656b) + (this.f15655a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f15655a);
        sb2.append(", alpha=");
        return B7.b.d(sb2, this.f15656b, ')');
    }
}
