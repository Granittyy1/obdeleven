package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f10902b;

    public v(LazyStaggeredGridState lazyStaggeredGridState) {
        this.f10902b = lazyStaggeredGridState;
    }

    @Override // androidx.compose.ui.layout.a0
    public final void s(LayoutNode layoutNode) {
        this.f10902b.f10796h = layoutNode;
    }
}
