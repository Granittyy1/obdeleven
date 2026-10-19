package G;

import A1.C0575j;

/* JADX INFO: compiled from: MutableCounter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3348a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3348a == ((a) obj).f3348a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3348a);
    }

    public final String toString() {
        return C0575j.b(new StringBuilder("DeltaCounter(count="), this.f3348a, ')');
    }

    public a(int i10) {
        this.f3348a = 0;
    }
}
