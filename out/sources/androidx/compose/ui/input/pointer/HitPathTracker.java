package androidx.compose.ui.input.pointer;

import androidx.collection.I;
import androidx.compose.ui.node.C1195p;
import java.util.List;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HitPathTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1195p f14017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I<androidx.compose.ui.h.c> f14022f = new I<>((Object) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f14023g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.collection.E<I<h>> f14024h = new androidx.collection.E<>(10);

    public HitPathTracker(C1195p c1195p) {
        this.f14017a = c1195p;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    public final void a(long j, List<? extends androidx.compose.ui.h.c> list, boolean z10) {
        long[] jArr;
        long[] jArr2;
        int i10;
        h hVar;
        I<h> iB;
        h hVar2;
        i iVar = this.f14023g;
        androidx.collection.E<I<h>> e10 = this.f14024h;
        e10.c();
        int size = list.size();
        i iVar2 = iVar;
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            final androidx.compose.ui.h.c cVar = list.get(i11);
            if (cVar.f13997o) {
                cVar.f13996n = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        this.this$0.d(cVar);
                        return p293xa.r.f47939a;
                    }
                };
                if (z11) {
                    androidx.compose.runtime.collection.c<h> cVar2 = iVar2.f14089a;
                    h[] hVarArr = cVar2.f12943b;
                    int i12 = cVar2.f12945d;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            hVar2 = null;
                            break;
                        }
                        hVar2 = hVarArr[i13];
                        if (kotlin.jvm.internal.i.a(hVar2.f14082c, cVar)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    hVar = hVar2;
                    if (hVar != null) {
                        hVar.f14088i = true;
                        hVar.f14083d.a(j);
                        I<h> iB2 = e10.b(j);
                        if (iB2 == null) {
                            iB2 = new I<>((Object) null);
                            e10.g(iB2, j);
                        }
                        iB2.g(hVar);
                    } else {
                        z11 = false;
                        hVar = new h(cVar);
                        hVar.f14083d.a(j);
                        iB = e10.b(j);
                        if (iB == null) {
                            iB = new I<>((Object) null);
                            e10.g(iB, j);
                        }
                        iB.g(hVar);
                        iVar2.f14089a.b(hVar);
                    }
                } else {
                    hVar = new h(cVar);
                    hVar.f14083d.a(j);
                    iB = e10.b(j);
                    if (iB == null) {
                        iB = new I<>((Object) null);
                        e10.g(iB, j);
                    }
                    iB.g(hVar);
                    iVar2.f14089a.b(hVar);
                }
                iVar2 = hVar;
            }
        }
        if (!z10) {
            return;
        }
        long[] jArr3 = e10.f9200b;
        Object[] objArr = e10.f9201c;
        long[] jArr4 = e10.f9199a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j10 = jArr4[i14];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j10) < 128) {
                        int i18 = (i14 << 3) + i17;
                        long j11 = jArr3[i18];
                        I<h> i19 = (I) objArr[i18];
                        androidx.compose.runtime.collection.c<h> cVar3 = iVar.f14089a;
                        h[] hVarArr2 = cVar3.f12943b;
                        int i20 = cVar3.f12945d;
                        int i21 = 0;
                        while (i21 < i20) {
                            hVarArr2[i21].f(j11, i19);
                            i21++;
                            jArr3 = jArr3;
                        }
                        jArr2 = jArr3;
                        i10 = 8;
                    } else {
                        jArr2 = jArr3;
                        i10 = i15;
                    }
                    j10 >>= i10;
                    i17++;
                    i15 = i10;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i16 != i15) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i14 == length) {
                return;
            }
            i14++;
            jArr3 = jArr;
        }
    }

    public final boolean b(C1154e c1154e, boolean z10) {
        i iVar = this.f14023g;
        if (!iVar.a(c1154e.f14073a, this.f14017a, c1154e, z10)) {
            return false;
        }
        boolean z11 = true;
        this.f14018b = true;
        androidx.compose.runtime.collection.c<h> cVar = iVar.f14089a;
        h[] hVarArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = hVarArr[i11].e(c1154e, z10) || z12;
        }
        h[] hVarArr2 = cVar.f12943b;
        int i12 = cVar.f12945d;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = hVarArr2[i13].d(c1154e) || z13;
        }
        iVar.b(c1154e);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f14018b = false;
        if (this.f14021e) {
            this.f14021e = false;
            I<androidx.compose.ui.h.c> i14 = this.f14022f;
            int i15 = i14.f9109b;
            for (int i16 = 0; i16 < i15; i16++) {
                d(i14.b(i16));
            }
            i14.i();
        }
        if (this.f14019c) {
            this.f14019c = false;
            c();
        }
        if (this.f14020d) {
            this.f14020d = false;
            iVar.f14089a.j();
        }
        return z11;
    }

    public final void c() {
        if (this.f14018b) {
            this.f14019c = true;
            return;
        }
        i iVar = this.f14023g;
        androidx.compose.runtime.collection.c<h> cVar = iVar.f14089a;
        h[] hVarArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            hVarArr[i11].c();
        }
        if (this.f14020d) {
            this.f14020d = true;
        } else {
            iVar.f14089a.j();
        }
    }

    public final void d(androidx.compose.ui.h.c cVar) {
        if (this.f14018b) {
            this.f14021e = true;
            this.f14022f.g(cVar);
            return;
        }
        i iVar = this.f14023g;
        I<i> i10 = iVar.f14090b;
        i10.i();
        i10.g(iVar);
        while (i10.e()) {
            i iVarK = i10.k(i10.f9109b - 1);
            int i11 = 0;
            while (true) {
                androidx.compose.runtime.collection.c<h> cVar2 = iVarK.f14089a;
                if (i11 < cVar2.f12945d) {
                    h hVar = cVar2.f12943b[i11];
                    if (kotlin.jvm.internal.i.a(hVar.f14082c, cVar)) {
                        iVarK.f14089a.m(hVar);
                        hVar.c();
                    } else {
                        i10.g(hVar);
                        i11++;
                    }
                }
            }
        }
    }
}
