package g2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p114j1.A;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements X1.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f35547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f35548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f35549d;

    public h(ArrayList arrayList) {
        this.f35547b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f35548c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d dVar = (d) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f35548c;
            jArr[i11] = dVar.f35520b;
            jArr[i11 + 1] = dVar.f35521c;
        }
        long[] jArr2 = this.f35548c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f35549d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // X1.h
    public final int a(long j) {
        long[] jArr = this.f35549d;
        int iA = A.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // X1.h
    public final long b(int i10) {
        p241t7.b.e(i10 >= 0);
        long[] jArr = this.f35549d;
        p241t7.b.e(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // X1.h
    public final List<p102i1.a> c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List<d> list = this.f35547b;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f35548c;
            if (jArr[i11] <= j && j < jArr[i11 + 1]) {
                d dVar = list.get(i10);
                p102i1.a aVar = dVar.f35519a;
                if (aVar.f36515e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new androidx.compose.foundation.lazy.layout.A(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            p102i1.a.C0382a c0382aA = ((d) arrayList2.get(i12)).f35519a.a();
            c0382aA.f36531e = (-1) - i12;
            c0382aA.f36532f = 1;
            arrayList.add(c0382aA.a());
        }
        return arrayList;
    }

    @Override // X1.h
    public final int e() {
        return this.f35549d.length;
    }
}
