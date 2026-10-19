package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.ui.layout.Y;
import java.util.List;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f10822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, boolean z10, f fVar, InterfaceC0988x interfaceC0988x, u uVar) {
        super(z10, fVar, interfaceC0988x, uVar);
        this.f10822e = lVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.m
    public final p b(int i10, int i11, int i12, Object obj, Object obj2, List<? extends Y> list, long j) {
        l lVar = this.f10822e;
        return new p(i10, obj, list, lVar.f10828f, lVar.f10834m, i11, i12, lVar.j, lVar.f10832k, obj2, lVar.f10823a.f10807t, j);
    }
}
