package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.H;
import androidx.compose.foundation.lazy.layout.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: LazyGridPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10446b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<H.b> f10447c = new androidx.compose.runtime.collection.c<>(new H.b[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10448d;

    public a(int i10) {
        this.f10445a = i10;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    public final void a(Q q10, int i10) {
        for (int i11 = 0; i11 < this.f10445a; i11++) {
            q10.a(i10 + i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.lazy.grid.u
    public final void b(LazyGridState.a aVar, float f10, o oVar) {
        int iK;
        int index;
        boolean z10;
        if (oVar.f().isEmpty()) {
            return;
        }
        boolean z11 = f10 < 0.0f;
        if (z11) {
            g gVar = (g) kotlin.collections.q.V(oVar.f());
            iK = (oVar.getOrientation() == Orientation.f9957b ? gVar.k() : gVar.o()) + 1;
            index = ((g) kotlin.collections.q.V(oVar.f())).getIndex() + 1;
        } else {
            g gVar2 = (g) kotlin.collections.q.O(oVar.f());
            iK = (oVar.getOrientation() == Orientation.f9957b ? gVar2.k() : gVar2.o()) - 1;
            index = ((g) kotlin.collections.q.O(oVar.f())).getIndex() - 1;
        }
        if (index < 0 || index >= oVar.d()) {
            return;
        }
        int i10 = this.f10446b;
        androidx.compose.runtime.collection.c<H.b> cVar = this.f10447c;
        if (iK == i10 || iK < 0) {
            z10 = z11;
        } else {
            if (this.f10448d != z11) {
                H.b[] bVarArr = cVar.f12943b;
                int i11 = cVar.f12945d;
                for (int i12 = 0; i12 < i11; i12++) {
                    bVarArr[i12].cancel();
                }
            }
            this.f10448d = z11;
            this.f10446b = iK;
            cVar.j();
            aVar.getClass();
            ArrayList arrayList = new ArrayList();
            LazyGridState lazyGridState = LazyGridState.this;
            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
            try {
                p pVar = lazyGridState.f10418b ? lazyGridState.f10419c : (p) lazyGridState.f10421e.getValue();
                if (pVar != null) {
                    List list = (List) pVar.f10480k.invoke(Integer.valueOf(iK));
                    int size = list.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Pair pair = (Pair) list.get(i13);
                        arrayList.add(lazyGridState.f10430o.a(((Number) pair.c()).intValue(), ((p013b0.a) pair.d()).f20475a));
                        i13++;
                        z11 = z11;
                    }
                    z10 = z11;
                    p293xa.r rVar = p293xa.r.f47939a;
                } else {
                    z10 = z11;
                }
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                cVar.e(cVar.f12945d, arrayList);
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                throw th;
            }
        }
        if (!z10) {
            if (oVar.h() - androidx.compose.foundation.gestures.snapping.e.a((g) kotlin.collections.q.O(oVar.f()), oVar.getOrientation()) < f10) {
                H.b[] bVarArr2 = cVar.f12943b;
                int i14 = cVar.f12945d;
                for (int i15 = 0; i15 < i14; i15++) {
                    bVarArr2[i15].b();
                }
                return;
            }
            return;
        }
        g gVar3 = (g) kotlin.collections.q.V(oVar.f());
        if (((androidx.compose.foundation.gestures.snapping.e.a(gVar3, oVar.getOrientation()) + ((int) (oVar.getOrientation() == Orientation.f9957b ? gVar3.a() & 4294967295L : gVar3.a() >> 32))) + oVar.e()) - oVar.g() < (-f10)) {
            H.b[] bVarArr3 = cVar.f12943b;
            int i16 = cVar.f12945d;
            for (int i17 = 0; i17 < i16; i17++) {
                bVarArr3[i17].b();
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    public final void c(p pVar) {
        int iK;
        if (this.f10446b == -1 || pVar.f().isEmpty()) {
            return;
        }
        boolean z10 = this.f10448d;
        Orientation orientation = pVar.f10486q;
        if (z10) {
            g gVar = (g) kotlin.collections.q.V(pVar.f());
            iK = (orientation == Orientation.f9957b ? gVar.k() : gVar.o()) + 1;
        } else {
            g gVar2 = (g) kotlin.collections.q.O(pVar.f());
            iK = (orientation == Orientation.f9957b ? gVar2.k() : gVar2.o()) - 1;
        }
        if (this.f10446b != iK) {
            this.f10446b = -1;
            androidx.compose.runtime.collection.c<H.b> cVar = this.f10447c;
            H.b[] bVarArr = cVar.f12943b;
            int i10 = cVar.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                bVarArr[i11].cancel();
            }
            cVar.j();
        }
    }
}
