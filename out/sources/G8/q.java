package G8;

/* JADX INFO: compiled from: HttpCodeResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3530a;

    public q(int i10) {
        this.f3530a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f3530a == ((q) obj).f3530a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3530a);
    }

    public final String toString() {
        return p005a4.q.c(new StringBuilder("HttpCodeResult(httpStatus="), this.f3530a, ")");
    }
}
