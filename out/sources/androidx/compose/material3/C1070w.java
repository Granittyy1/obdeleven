package androidx.compose.material3;

import androidx.compose.ui.node.C1183d;

/* JADX INFO: renamed from: androidx.compose.material3.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1070w implements androidx.compose.ui.graphics.L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1071x f12762b;

    public C1070w(C1071x c1071x) {
        this.f12762b = c1071x;
    }

    @Override // androidx.compose.ui.graphics.L
    public final long a() {
        C1071x c1071x = this.f12762b;
        long jA = c1071x.f12766u.a();
        if (jA != 16) {
            return jA;
        }
        V v10 = (V) C1183d.a(c1071x, RippleKt.f12284b);
        if (v10 != null) {
            long j = v10.f12411a;
            if (j != 16) {
                return j;
            }
        }
        return ((androidx.compose.ui.graphics.H) C1183d.a(c1071x, ContentColorKt.f12125a)).f13506a;
    }
}
