package kotlin.jvm.internal;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f43061b;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f43061b = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f43061b, ((k) obj).f43061b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> h() {
        return this.f43061b;
    }

    public final int hashCode() {
        return this.f43061b.hashCode();
    }

    public final String toString() {
        return this.f43061b.toString() + " (Kotlin reflection is not available)";
    }
}
