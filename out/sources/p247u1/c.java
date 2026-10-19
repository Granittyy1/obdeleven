package p247u1;

import A8.f;
import B6.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.w;
import java.util.ArrayList;
import p241t7.b;

/* JADX INFO: compiled from: MergingCuesResolver.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w<X1.c> f47388c = w.c().d(new a()).a(w.c().e().d(new f(11)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f47389b = new ArrayList();

    @Override // p247u1.a
    public final long a(long j) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f47389b;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j10 = ((X1.c) arrayList.get(i10)).f7142b;
            long j11 = ((X1.c) arrayList.get(i10)).f7144d;
            if (j < j10) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j10);
                    break;
                }
                jMin = j10;
                break;
            }
            if (j < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            }
            i10++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p247u1.a
    public final boolean b(X1.c cVar, long j) {
        long j10 = cVar.f7142b;
        b.e(j10 != -9223372036854775807L);
        b.e(cVar.f7143c != -9223372036854775807L);
        boolean z10 = j10 <= j && j < cVar.f7144d;
        ArrayList arrayList = this.f47389b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((X1.c) arrayList.get(size)).f7142b) {
                arrayList.add(size + 1, cVar);
                return z10;
            }
        }
        arrayList.add(0, cVar);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p247u1.a
    public final ImmutableList<p102i1.a> c(long j) {
        ArrayList arrayList = this.f47389b;
        if (!arrayList.isEmpty()) {
            if (j >= ((X1.c) arrayList.get(0)).f7142b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    X1.c cVar = (X1.c) arrayList.get(i10);
                    if (j >= cVar.f7142b && j < cVar.f7144d) {
                        arrayList2.add(cVar);
                    }
                    if (j < cVar.f7142b) {
                        break;
                    }
                }
                ImmutableList immutableListO = ImmutableList.O(f47388c, arrayList2);
                ImmutableList.a aVarB = ImmutableList.B();
                for (int i11 = 0; i11 < immutableListO.size(); i11++) {
                    aVarB.f(((X1.c) immutableListO.get(i11)).f7141a);
                }
                return aVarB.h();
            }
        }
        return ImmutableList.K();
    }

    @Override // p247u1.a
    public final void clear() {
        this.f47389b.clear();
    }

    @Override // p247u1.a
    public final long d(long j) {
        ArrayList arrayList = this.f47389b;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((X1.c) arrayList.get(0)).f7142b) {
            return -9223372036854775807L;
        }
        long jMax = ((X1.c) arrayList.get(0)).f7142b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j10 = ((X1.c) arrayList.get(i10)).f7142b;
            long j11 = ((X1.c) arrayList.get(i10)).f7144d;
            if (j11 > j) {
                if (j10 > j) {
                    break;
                }
                jMax = Math.max(jMax, j10);
            } else {
                jMax = Math.max(jMax, j11);
            }
        }
        return jMax;
    }

    @Override // p247u1.a
    public final void f(long j) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47389b;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j10 = ((X1.c) arrayList.get(i10)).f7142b;
            if (j > j10 && j > ((X1.c) arrayList.get(i10)).f7144d) {
                arrayList.remove(i10);
                i10--;
            } else if (j < j10) {
                return;
            }
            i10++;
        }
    }
}
