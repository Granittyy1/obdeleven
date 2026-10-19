package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.p<p013b0.c, p013b0.a, x> f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10451b = p013b0.b.b(0, 0, 15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f10453d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Ia.p<? super p013b0.c, ? super p013b0.a, x> pVar) {
        this.f10450a = pVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.y
    public final x a(InterfaceC0988x interfaceC0988x, long j) {
        if (this.f10453d != null && p013b0.a.b(this.f10451b, j) && this.f10452c == interfaceC0988x.getDensity()) {
            x xVar = this.f10453d;
            kotlin.jvm.internal.i.b(xVar);
            return xVar;
        }
        this.f10451b = j;
        this.f10452c = interfaceC0988x.getDensity();
        LazyGridDslKt$rememberColumnWidthSums$1$1 lazyGridDslKt$rememberColumnWidthSums$1$1 = (LazyGridDslKt$rememberColumnWidthSums$1$1) this.f10450a;
        if (p013b0.a.h(j) == Integer.MAX_VALUE) {
            p245u.c.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int iH = p013b0.a.h(j);
        b bVar = lazyGridDslKt$rememberColumnWidthSums$1$1.$columns;
        C0945e.InterfaceC0129e interfaceC0129e = lazyGridDslKt$rememberColumnWidthSums$1$1.$horizontalArrangement;
        int[] iArrN0 = kotlin.collections.q.n0(bVar.a(iH, interfaceC0988x.e1(interfaceC0129e.mo1getSpacingD9Ej5fM())));
        int[] iArr = new int[iArrN0.length];
        interfaceC0129e.a(interfaceC0988x, iH, iArrN0, LayoutDirection.f15717b, iArr);
        x xVar2 = new x(iArrN0, iArr);
        this.f10453d = xVar2;
        return xVar2;
    }
}
