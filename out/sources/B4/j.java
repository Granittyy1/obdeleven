package B4;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_LogResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1587a;

    public j(long j) {
        this.f1587a = j;
    }

    @Override // B4.n
    public final long b() {
        return this.f1587a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f1587a == ((n) obj).b();
    }

    public final int hashCode() {
        long j = this.f1587a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return o.d(this.f1587a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
