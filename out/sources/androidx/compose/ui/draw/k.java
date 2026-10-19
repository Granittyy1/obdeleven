package androidx.compose.ui.draw;

import androidx.collection.I;
import androidx.collection.Q;
import androidx.compose.ui.graphics.S;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I<androidx.compose.ui.graphics.layer.b> f13398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S f13399b;

    @Override // androidx.compose.ui.graphics.S
    public final void a(androidx.compose.ui.graphics.layer.b bVar) {
        S s10 = this.f13399b;
        if (s10 != null) {
            s10.a(bVar);
        }
    }

    @Override // androidx.compose.ui.graphics.S
    public final androidx.compose.ui.graphics.layer.b b() {
        S s10 = this.f13399b;
        if (s10 == null) {
            R.a.b("GraphicsContext not provided");
        }
        androidx.compose.ui.graphics.layer.b bVarB = s10.b();
        I<androidx.compose.ui.graphics.layer.b> i10 = this.f13398a;
        if (i10 == null) {
            Object[] objArr = Q.f9119a;
            I<androidx.compose.ui.graphics.layer.b> i11 = new I<>(1);
            i11.g(bVarB);
            this.f13398a = i11;
        } else {
            i10.g(bVarB);
        }
        return bVarB;
    }

    public final void c() {
        I<androidx.compose.ui.graphics.layer.b> i10 = this.f13398a;
        if (i10 != null) {
            Object[] objArr = i10.f9108a;
            int i11 = i10.f9109b;
            for (int i12 = 0; i12 < i11; i12++) {
                a((androidx.compose.ui.graphics.layer.b) objArr[i12]);
            }
            i10.i();
        }
    }
}
