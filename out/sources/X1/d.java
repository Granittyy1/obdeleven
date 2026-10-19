package X1;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p114j1.A;

/* JADX INFO: compiled from: CuesWithTimingSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w<c> f7145d = w.c().d(new C4.a(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<ImmutableList<p102i1.a>> f7146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f7147c;

    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<c> list) {
        int i10 = 0;
        if (list.size() == 1) {
            Iterator<T> it = list.iterator();
            Object next = it.next();
            if (it.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i10 < 4 && it.hasNext()) {
                    sb2.append(", ");
                    sb2.append(it.next());
                    i10++;
                }
                if (it.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            c cVar = (c) next;
            long j = cVar.f7142b;
            long j10 = j == -9223372036854775807L ? 0L : j;
            long j11 = cVar.f7143c;
            ImmutableList<p102i1.a> immutableList = cVar.f7141a;
            if (j11 == -9223372036854775807L) {
                this.f7146b = ImmutableList.M(immutableList);
                this.f7147c = new long[]{j10};
                return;
            } else {
                this.f7146b = ImmutableList.N(immutableList, ImmutableList.K());
                this.f7147c = new long[]{j10, j11 + j10};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f7147c = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListO = ImmutableList.O(f7145d, list);
        int i11 = 0;
        while (i10 < immutableListO.size()) {
            c cVar2 = (c) immutableListO.get(i10);
            long j12 = cVar2.f7142b;
            j12 = j12 == -9223372036854775807L ? 0L : j12;
            long j13 = cVar2.f7143c;
            long j14 = j12 + j13;
            ImmutableList<p102i1.a> immutableList2 = cVar2.f7141a;
            if (i11 != 0) {
                int i12 = i11 - 1;
                long j15 = this.f7147c[i12];
                if (j15 < j12) {
                    this.f7147c[i11] = j12;
                    arrayList.add(immutableList2);
                    i11++;
                } else if (j15 == j12 && ((ImmutableList) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, immutableList2);
                } else {
                    p114j1.k.f("Truncating unsupported overlapping cues.");
                    this.f7147c[i12] = j12;
                    arrayList.set(i12, immutableList2);
                }
            } else {
                this.f7147c[i11] = j12;
                arrayList.add(immutableList2);
                i11++;
            }
            if (j13 != -9223372036854775807L) {
                this.f7147c[i11] = j14;
                arrayList.add(ImmutableList.K());
                i11++;
            }
            i10++;
        }
        this.f7146b = ImmutableList.G(arrayList);
    }

    @Override // X1.h
    public final int a(long j) {
        int iA = A.a(this.f7147c, j, false);
        if (iA < this.f7146b.size()) {
            return iA;
        }
        return -1;
    }

    @Override // X1.h
    public final long b(int i10) {
        p241t7.b.e(i10 < this.f7146b.size());
        return this.f7147c[i10];
    }

    @Override // X1.h
    public final List c(long j) {
        int iD = A.d(this.f7147c, j, false);
        return iD == -1 ? ImmutableList.K() : this.f7146b.get(iD);
    }

    @Override // X1.h
    public final int e() {
        return this.f7146b.size();
    }
}
