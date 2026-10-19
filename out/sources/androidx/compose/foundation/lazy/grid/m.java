package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0988x f10463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f10464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10468i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, InterfaceC0988x interfaceC0988x, int i10, LazyGridState lazyGridState, boolean z10, boolean z11, int i11, int i12, long j) {
        super(hVar, interfaceC0988x, i10);
        this.f10463d = interfaceC0988x;
        this.f10464e = lazyGridState;
        this.f10465f = z10;
        this.f10466g = z11;
        this.f10467h = i11;
        this.f10468i = i12;
        this.j = j;
    }

    @Override // androidx.compose.foundation.lazy.grid.r
    public final q b(int i10, Object obj, Object obj2, int i11, int i12, List<? extends Y> list, long j, int i13, int i14) {
        LayoutDirection layoutDirection = this.f10463d.getLayoutDirection();
        LazyLayoutItemAnimator<q> lazyLayoutItemAnimator = this.f10464e.f10428m;
        return new q(i10, obj, this.f10465f, i11, i12, this.f10466g, layoutDirection, this.f10467h, this.f10468i, list, this.j, obj2, lazyLayoutItemAnimator, j, i13, i14);
    }
}
