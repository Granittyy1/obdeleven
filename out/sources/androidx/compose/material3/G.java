package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f12180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposableLambdaImpl f12181b;

    public G(f0 f0Var, ComposableLambdaImpl composableLambdaImpl) {
        this.f12180a = f0Var;
        this.f12181b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return kotlin.jvm.internal.i.a(this.f12180a, g10.f12180a) && this.f12181b.equals(g10.f12181b);
    }

    public final int hashCode() {
        f0 f0Var = this.f12180a;
        return this.f12181b.hashCode() + ((f0Var == null ? 0 : f0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12180a + ", transition=" + this.f12181b + ')';
    }
}
