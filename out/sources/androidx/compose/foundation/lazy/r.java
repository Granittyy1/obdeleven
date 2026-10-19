package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.K;
import java.util.List;

/* JADX INFO: compiled from: LazyListScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r implements K, androidx.compose.foundation.gestures.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.s f10778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f10779b;

    public r(androidx.compose.foundation.gestures.s sVar, LazyListState lazyListState) {
        this.f10779b = lazyListState;
        this.f10778a = sVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int a() {
        g gVar = (g) kotlin.collections.q.W(this.f10779b.j().f());
        if (gVar != null) {
            return gVar.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int b() {
        return this.f10779b.j().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int c(int i10, int i11) {
        g gVar;
        LazyListState lazyListState = this.f10779b;
        k kVarJ = lazyListState.j();
        int iH = 0;
        if (kVarJ.f().isEmpty()) {
            return 0;
        }
        int iH2 = lazyListState.h();
        if (i10 > a() || iH2 > i10) {
            iH = ((i10 - lazyListState.h()) * H3.c.m(kVarJ)) - lazyListState.i();
        } else {
            List<g> listF = kVarJ.f();
            int size = listF.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    gVar = null;
                    break;
                }
                gVar = listF.get(i12);
                if (gVar.getIndex() == i10) {
                    break;
                }
                i12++;
            }
            g gVar2 = gVar;
            if (gVar2 != null) {
                iH = gVar2.getOffset();
            }
        }
        return iH + i11;
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final void d(int i10, int i11) {
        this.f10779b.l(i10, i11);
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int e() {
        return this.f10779b.i();
    }

    @Override // androidx.compose.foundation.gestures.s
    public final float f(float f10) {
        return this.f10778a.f(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int g() {
        return this.f10779b.h();
    }
}
