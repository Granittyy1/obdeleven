package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.ui.layout.Y;
import java.util.List;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0988x f10543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d.b f10546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d.c f10547i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f10550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LazyListState f10551n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j, boolean z10, h hVar, InterfaceC0988x interfaceC0988x, int i10, int i11, androidx.compose.ui.d.b bVar, androidx.compose.ui.d.c cVar, boolean z11, int i12, int i13, long j10, LazyListState lazyListState) {
        super(j, z10, hVar, interfaceC0988x);
        this.f10542d = z10;
        this.f10543e = interfaceC0988x;
        this.f10544f = i10;
        this.f10545g = i11;
        this.f10546h = bVar;
        this.f10547i = cVar;
        this.j = z11;
        this.f10548k = i12;
        this.f10549l = i13;
        this.f10550m = j10;
        this.f10551n = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.n
    public final m b(int i10, Object obj, Object obj2, List<? extends Y> list, long j) {
        int i11 = i10 == this.f10544f + (-1) ? 0 : this.f10545g;
        return new m(i10, list, this.f10542d, this.f10546h, this.f10547i, this.f10543e.getLayoutDirection(), this.j, this.f10548k, this.f10549l, i11, this.f10550m, obj, obj2, this.f10551n.f10362m, j);
    }
}
