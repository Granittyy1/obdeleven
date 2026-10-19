package androidx.compose.ui.window;

import androidx.compose.animation.D;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureFlagPolicy f15835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15837e;

    public f(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13) {
        this.f15833a = z10;
        this.f15834b = z11;
        this.f15835c = secureFlagPolicy;
        this.f15836d = z12;
        this.f15837e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15833a == fVar.f15833a && this.f15834b == fVar.f15834b && this.f15835c == fVar.f15835c && this.f15836d == fVar.f15836d && this.f15837e == fVar.f15837e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15837e) + D.b((this.f15835c.hashCode() + D.b(Boolean.hashCode(this.f15833a) * 31, 31, this.f15834b)) * 31, 31, this.f15836d);
    }

    public f() {
        this(true, true, SecureFlagPolicy.f15821b, true, true);
    }

    public f(int i10) {
        this(true, (i10 & 2) != 0, SecureFlagPolicy.f15821b, (i10 & 4) != 0, true);
    }
}
