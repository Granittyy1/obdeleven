package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OpaqueKey.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1077b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12939a;

    public C1077b0(String str) {
        this.f12939a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1077b0) && kotlin.jvm.internal.i.a(this.f12939a, ((C1077b0) obj).f12939a);
    }

    public final int hashCode() {
        return this.f12939a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("OpaqueKey(key="), this.f12939a, ')');
    }
}
