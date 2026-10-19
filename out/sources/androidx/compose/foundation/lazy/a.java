package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.H;
import androidx.compose.foundation.lazy.layout.Q;

/* JADX INFO: compiled from: LazyListPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10383b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H.b f10384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10385d;

    public a(int i10) {
        this.f10382a = i10;
    }

    @Override // androidx.compose.foundation.lazy.o
    public final void a(Q q10, int i10) {
        for (int i11 = 0; i11 < this.f10382a; i11++) {
            q10.a(i10 + i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.lazy.o
    public final void b(LazyListState.a aVar, float f10, k kVar) {
        H.b bVar;
        H.b bVar2;
        H.b bVar3;
        if (kVar.f().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((g) kotlin.collections.q.V(kVar.f())).getIndex() + 1 : ((g) kotlin.collections.q.O(kVar.f())).getIndex() - 1;
        if (index < 0 || index >= kVar.d()) {
            return;
        }
        if (index != this.f10383b) {
            if (this.f10385d != z10 && (bVar3 = this.f10384c) != null) {
                bVar3.cancel();
            }
            this.f10385d = z10;
            this.f10383b = index;
            LazyListState lazyListState = LazyListState.this;
            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
            try {
                long j = ((l) lazyListState.f10355e.getValue()).j;
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                this.f10384c = lazyListState.f10364o.a(index, j);
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                throw th;
            }
        }
        if (!z10) {
            if (kVar.h() - ((g) kotlin.collections.q.O(kVar.f())).getOffset() >= f10 || (bVar = this.f10384c) == null) {
                return;
            }
            bVar.b();
            return;
        }
        g gVar = (g) kotlin.collections.q.V(kVar.f());
        if (((gVar.getSize() + gVar.getOffset()) + kVar.e()) - kVar.g() >= (-f10) || (bVar2 = this.f10384c) == null) {
            return;
        }
        bVar2.b();
    }

    @Override // androidx.compose.foundation.lazy.o
    public final void c(l lVar) {
        if (this.f10383b == -1 || lVar.f().isEmpty()) {
            return;
        }
        if (this.f10383b != (this.f10385d ? ((g) kotlin.collections.q.V(lVar.f())).getIndex() + 1 : ((g) kotlin.collections.q.O(lVar.f())).getIndex() - 1)) {
            this.f10383b = -1;
            H.b bVar = this.f10384c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f10384c = null;
        }
    }
}
