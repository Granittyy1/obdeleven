package p293xa;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f47920c = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47921b = 131093;

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f other = fVar;
        i.e(other, "other");
        return this.f47921b - other.f47921b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f47921b == fVar.f47921b;
    }

    public final int hashCode() {
        return this.f47921b;
    }

    public final String toString() {
        return "2.0.21";
    }
}
