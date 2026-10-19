package p293xa;

import Ha.a;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class k implements Comparable<k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47926b;

    @Override // java.lang.Comparable
    public final int compareTo(k kVar) {
        return i.g(this.f47926b ^ Integer.MIN_VALUE, kVar.f47926b ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f47926b == ((k) obj).f47926b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47926b);
    }

    public final String toString() {
        return String.valueOf(((long) this.f47926b) & 4294967295L);
    }
}
