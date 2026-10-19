package p127k1;

import com.google.common.primitives.a;
import p078g1.s;

/* JADX INFO: compiled from: Mp4TimestampData.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41398c;

    public d(long j, long j10, long j11) {
        this.f41396a = j;
        this.f41397b = j10;
        this.f41398c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f41396a == dVar.f41396a && this.f41397b == dVar.f41397b && this.f41398c == dVar.f41398c;
    }

    public final int hashCode() {
        return a.a(this.f41398c) + ((a.a(this.f41397b) + ((a.a(this.f41396a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f41396a + ", modification time=" + this.f41397b + ", timescale=" + this.f41398c;
    }
}
