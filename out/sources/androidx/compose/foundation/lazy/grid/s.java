package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* JADX INFO: compiled from: LazyGridMeasuredLine.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q[] f10517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f10518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10523h;

    public s(int i10, q[] qVarArr, x xVar, List<c> list, boolean z10, int i11) {
        this.f10516a = i10;
        this.f10517b = qVarArr;
        this.f10518c = xVar;
        this.f10519d = list;
        this.f10520e = z10;
        this.f10521f = i11;
        int iMax = 0;
        for (q qVar : qVarArr) {
            iMax = Math.max(iMax, qVar.f10503p);
        }
        this.f10522g = iMax;
        int i12 = iMax + this.f10521f;
        this.f10523h = i12 >= 0 ? i12 : 0;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    public final q[] a(int i10, int i11, int i12) {
        q[] qVarArr = this.f10517b;
        int length = qVarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            q qVar = qVarArr[i13];
            int i16 = i14 + 1;
            int i17 = (int) ((c) this.f10519d.get(i14)).f10449a;
            int i18 = ((int[]) this.f10518c.f10536b)[i15];
            int i19 = this.f10516a;
            boolean z10 = this.f10520e;
            qVar.r(i10, i18, i11, i12, z10 ? i19 : i15, z10 ? i15 : i19);
            p293xa.r rVar = p293xa.r.f47939a;
            i15 += i17;
            i13++;
            i14 = i16;
        }
        return qVarArr;
    }
}
