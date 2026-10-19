package androidx.compose.runtime;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class y0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1084f f13256a;

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            return kotlin.jvm.internal.i.a(this.f13256a, ((y0) obj).f13256a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13256a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f13256a + ')';
    }
}
