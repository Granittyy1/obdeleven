package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f11655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposableLambdaImpl f11656b;

    public A(O o10, ComposableLambdaImpl composableLambdaImpl) {
        this.f11655a = o10;
        this.f11656b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return kotlin.jvm.internal.i.a(this.f11655a, a10.f11655a) && this.f11656b.equals(a10.f11656b);
    }

    public final int hashCode() {
        O o10 = this.f11655a;
        return this.f11656b.hashCode() + ((o10 == null ? 0 : o10.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f11655a + ", transition=" + this.f11656b + ')';
    }
}
