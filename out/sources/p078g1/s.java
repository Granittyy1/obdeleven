package p078g1;

import java.util.Arrays;
import java.util.List;
import p114j1.A;

/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f35445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35446b;

    public s() {
        throw null;
    }

    public s(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public final s a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        int i10 = A.f40996a;
        a[] aVarArr2 = this.f35445a;
        Object[] objArrCopyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, objArrCopyOf, aVarArr2.length, aVarArr.length);
        return new s(this.f35446b, (a[]) objArrCopyOf);
    }

    public final s b(s sVar) {
        return sVar == null ? this : a(sVar.f35445a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return Arrays.equals(this.f35445a, sVar.f35445a) && this.f35446b == sVar.f35446b;
    }

    public final int hashCode() {
        return com.google.common.primitives.a.a(this.f35446b) + (Arrays.hashCode(this.f35445a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f35445a));
        long j = this.f35446b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public s(long j, a... aVarArr) {
        this.f35446b = j;
        this.f35445a = aVarArr;
    }

    public s(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    /* JADX INFO: compiled from: Metadata.java */
    public interface a {
        default n a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(r.a aVar) {
        }
    }
}
