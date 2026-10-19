package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1098m implements H.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1100n f13077b;

    public C1098m(C1100n c1100n) {
        this.f13077b = c1100n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1098m) {
            if (this.f13077b.equals(((C1098m) obj).f13077b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13077b.hashCode() * 31;
    }
}
