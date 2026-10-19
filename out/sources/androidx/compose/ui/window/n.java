package androidx.compose.ui.window;

import androidx.compose.animation.D;
import androidx.compose.runtime.C;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15844f;

    public n(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f15839a = i10;
        this.f15840b = z10;
        this.f15841c = z11;
        this.f15842d = z12;
        this.f15843e = z13;
        this.f15844f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f15839a == nVar.f15839a && this.f15840b == nVar.f15840b && this.f15841c == nVar.f15841c && this.f15842d == nVar.f15842d && this.f15843e == nVar.f15843e && this.f15844f == nVar.f15844f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15844f) + D.b(D.b(D.b(D.b(this.f15839a * 31, 31, this.f15840b), 31, this.f15841c), 31, this.f15842d), 31, this.f15843e);
    }

    public n(int i10, boolean z10) {
        this((i10 & 1) != 0 ? false : z10, true, true, SecureFlagPolicy.f15821b, true, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(boolean z10, boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14) {
        C c10 = AndroidPopup_androidKt.f15783a;
        int i10 = !z10 ? 262152 : 262144;
        i10 = secureFlagPolicy == SecureFlagPolicy.f15822c ? i10 | 8192 : i10;
        this(z14 ? i10 : i10 | 512, secureFlagPolicy == SecureFlagPolicy.f15821b, z11, z12, z13, false);
    }
}
