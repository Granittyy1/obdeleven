package androidx.collection;

import A1.C0575j;

/* JADX INFO: renamed from: androidx.collection.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntIntPair.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class C0880h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9182a;

    public /* synthetic */ C0880h(long j) {
        this.f9182a = j;
    }

    public static long a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0880h) {
            return this.f9182a == ((C0880h) obj).f9182a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9182a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j = this.f9182a;
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return C0575j.b(sb2, (int) (j & 4294967295L), ')');
    }
}
