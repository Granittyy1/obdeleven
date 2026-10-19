package androidx.media3.exoplayer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AbstractC1383a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f18480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f18481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p078g1.x[] f18482i;
    public final Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<Object, Integer> f18483k;

    public l0(p078g1.x[] xVarArr, Object[] objArr, p235t1.s sVar) {
        super(sVar);
        int length = xVarArr.length;
        this.f18482i = xVarArr;
        this.f18480g = new int[length];
        this.f18481h = new int[length];
        this.j = objArr;
        this.f18483k = new HashMap<>();
        int length2 = xVarArr.length;
        int i10 = 0;
        int iO = 0;
        int iH = 0;
        int i11 = 0;
        while (i10 < length2) {
            p078g1.x xVar = xVarArr[i10];
            this.f18482i[i11] = xVar;
            this.f18481h[i11] = iO;
            this.f18480g[i11] = iH;
            iO += xVar.o();
            iH += this.f18482i[i11].h();
            this.f18483k.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f18478e = iO;
        this.f18479f = iH;
    }

    @Override // p078g1.x
    public final int h() {
        return this.f18479f;
    }

    @Override // p078g1.x
    public final int o() {
        return this.f18478e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(List list, p235t1.s sVar) {
        p078g1.x[] xVarArr = new p078g1.x[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            xVarArr[i11] = ((Z) it.next()).b();
            i11++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((Z) it2.next()).a();
            i10++;
        }
        this(xVarArr, objArr, sVar);
    }
}
