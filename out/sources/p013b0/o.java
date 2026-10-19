package p013b0;

import Ha.a;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20495a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        if (a(j, 0L)) {
            return "Unspecified";
        }
        if (a(j, 4294967296L)) {
            return "Sp";
        }
        return a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f20495a == ((o) obj).f20495a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20495a);
    }

    public final String toString() {
        return b(this.f20495a);
    }
}
