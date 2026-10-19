package p293xa;

import C6.b;
import Ha.a;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class m implements Comparable<m> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47930b;

    public /* synthetic */ m(long j) {
        this.f47930b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(m mVar) {
        return i.h(this.f47930b ^ Long.MIN_VALUE, mVar.f47930b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f47930b == ((m) obj).f47930b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47930b);
    }

    public final String toString() {
        return b.e(10, this.f47930b);
    }
}
