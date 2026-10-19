package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.ui.graphics.S;
import java.util.List;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f10825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f10826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0988x f10829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10831i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A f10835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f10837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S f10838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f10839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LazyStaggeredGridLaneInfo f10840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10841t;

    public l(LazyStaggeredGridState lazyStaggeredGridState, List list, f fVar, u uVar, long j, boolean z10, InterfaceC0988x interfaceC0988x, int i10, long j10, int i11, int i12, boolean z11, int i13, A a10, boolean z12, n nVar, S s10) {
        this.f10823a = lazyStaggeredGridState;
        this.f10824b = list;
        this.f10825c = fVar;
        this.f10826d = uVar;
        this.f10827e = j;
        this.f10828f = z10;
        this.f10829g = interfaceC0988x;
        this.f10830h = i10;
        this.f10831i = j10;
        this.j = i11;
        this.f10832k = i12;
        this.f10833l = z11;
        this.f10834m = i13;
        this.f10835n = a10;
        this.f10836o = z12;
        this.f10837p = nVar;
        this.f10838q = s10;
        this.f10839r = new k(this, z10, fVar, interfaceC0988x, uVar);
        this.f10840s = lazyStaggeredGridState.f10793e;
        this.f10841t = ((int[]) uVar.f10901c).length;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<java.lang.Integer>] */
    public final List<Integer> a() {
        return this.f10824b;
    }

    public final long b(f fVar, int i10, int i11) {
        fVar.g().f(i10);
        return (((long) i11) << 32) | (((long) (i11 + 1)) & 4294967295L);
    }
}
