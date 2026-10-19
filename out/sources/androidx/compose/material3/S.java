package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureFlagPolicy f12289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12290b;

    public S(SecureFlagPolicy secureFlagPolicy, boolean z10) {
        this.f12289a = secureFlagPolicy;
        this.f12290b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            return this.f12289a == ((S) obj).f12289a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12290b) + (this.f12289a.hashCode() * 31);
    }

    public S() {
        this(SecureFlagPolicy.f15821b, true);
    }
}
