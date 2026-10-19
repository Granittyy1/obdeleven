package androidx.media3.exoplayer.source;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.r;
import com.google.common.collect.s;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p078g1.p;
import p078g1.x;
import p114j1.A;

/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends c<Integer> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p f18625t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h[] f18626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f18627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x[] f18628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<h> f18629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q3.d f18630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r<Object, b> f18631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[][] f18633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IllegalMergeException f18634s;

    public static final class IllegalMergeException extends IOException {
        public final int reason = 0;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h.b f18635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f18636b;

        public a(h.b bVar, g gVar) {
            this.f18635a = bVar;
            this.f18636b = gVar;
        }
    }

    static {
        p.b.a aVar = new p.b.a();
        ImmutableMap.h();
        ImmutableList.K();
        Collections.emptyList();
        ImmutableList.K();
        p.e.a aVar2 = new p.e.a();
        f18625t = new p("MergingMediaSource", new p.c(aVar), null, new p.e(aVar2), p078g1.r.f35393B, p.g.f35390a);
    }

    public MergingMediaSource(h... hVarArr) {
        Q3.d dVar = new Q3.d();
        this.f18626k = hVarArr;
        this.f18630o = dVar;
        this.f18629n = new ArrayList<>(Arrays.asList(hVarArr));
        this.f18632q = -1;
        this.f18627l = new ArrayList(hVarArr.length);
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            this.f18627l.add(new ArrayList());
        }
        this.f18628m = new x[hVarArr.length];
        this.f18633r = new long[0][];
        new HashMap();
        P3.d.e(8, "expectedKeys");
        new s().a().b();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g g(h.b bVar, p272w1.d dVar, long j) {
        h[] hVarArr = this.f18626k;
        int length = hVarArr.length;
        g[] gVarArr = new g[length];
        x[] xVarArr = this.f18628m;
        int iB = xVarArr[0].b(bVar.f18698a);
        for (int i10 = 0; i10 < length; i10++) {
            h.b bVarA = bVar.a(xVarArr[i10].l(iB));
            gVarArr[i10] = hVarArr[i10].g(bVarA, dVar, j - this.f18633r[iB][i10]);
            ((List) this.f18627l.get(i10)).add(new a(bVarA, gVarArr[i10]));
        }
        return new j(this.f18630o, this.f18633r[iB], gVarArr);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final p h() {
        h[] hVarArr = this.f18626k;
        return hVarArr.length > 0 ? hVarArr[0].h() : f18625t;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.h
    public final void i() throws IOException {
        IllegalMergeException illegalMergeException = this.f18634s;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.i();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void l(p pVar) {
        this.f18626k[0].l(pVar);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void o(g gVar) {
        j jVar = (j) gVar;
        int i10 = 0;
        while (true) {
            h[] hVarArr = this.f18626k;
            if (i10 >= hVarArr.length) {
                return;
            }
            List list = (List) this.f18627l.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((a) list.get(i11)).f18636b.equals(gVar)) {
                    list.remove(i11);
                    break;
                }
            }
            h hVar = hVarArr[i10];
            g gVar2 = jVar.f18708b[i10];
            if (gVar2 instanceof n) {
                gVar2 = ((n) gVar2).f18798b;
            }
            hVar.o(gVar2);
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(p140l1.l lVar) {
        this.j = lVar;
        this.f18655i = A.k(null);
        int i10 = 0;
        while (true) {
            h[] hVarArr = this.f18626k;
            if (i10 >= hVarArr.length) {
                return;
            }
            y(Integer.valueOf(i10), hVarArr[i10]);
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        super.t();
        Arrays.fill(this.f18628m, (Object) null);
        this.f18632q = -1;
        this.f18634s = null;
        ArrayList<h> arrayList = this.f18629n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f18626k);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final h.b u(Integer num, h.b bVar) {
        ArrayList arrayList = this.f18627l;
        List list = (List) arrayList.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((a) list.get(i10)).f18635a.equals(bVar)) {
                return ((a) ((List) arrayList.get(0)).get(i10)).f18635a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void x(Object obj, androidx.media3.exoplayer.source.a aVar, x xVar) {
        Integer num = (Integer) obj;
        if (this.f18634s != null) {
            return;
        }
        if (this.f18632q == -1) {
            this.f18632q = xVar.h();
        } else if (xVar.h() != this.f18632q) {
            this.f18634s = new IllegalMergeException();
            return;
        }
        int length = this.f18633r.length;
        x[] xVarArr = this.f18628m;
        if (length == 0) {
            this.f18633r = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f18632q, xVarArr.length);
        }
        ArrayList<h> arrayList = this.f18629n;
        arrayList.remove(aVar);
        xVarArr[num.intValue()] = xVar;
        if (arrayList.isEmpty()) {
            s(xVarArr[0]);
        }
    }
}
