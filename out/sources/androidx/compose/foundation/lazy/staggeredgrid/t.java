package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.p<p013b0.c, p013b0.a, u> f10896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10897b = p013b0.b.b(0, 0, 15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f10899d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Ia.p<? super p013b0.c, ? super p013b0.a, u> pVar) {
        this.f10896a = pVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.a
    public final u a(InterfaceC0988x interfaceC0988x, long j) {
        if (this.f10899d != null && p013b0.a.b(this.f10897b, j) && this.f10898c == interfaceC0988x.getDensity()) {
            u uVar = this.f10899d;
            kotlin.jvm.internal.i.b(uVar);
            return uVar;
        }
        this.f10897b = j;
        this.f10898c = interfaceC0988x.getDensity();
        LazyStaggeredGridDslKt$rememberColumnSlots$1$1 lazyStaggeredGridDslKt$rememberColumnSlots$1$1 = (LazyStaggeredGridDslKt$rememberColumnSlots$1$1) this.f10896a;
        if (p013b0.a.h(j) == Integer.MAX_VALUE) {
            p245u.c.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        L l10 = lazyStaggeredGridDslKt$rememberColumnSlots$1$1.$contentPadding;
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        int iH = p013b0.a.h(j) - interfaceC0988x.e1(PaddingKt.c(lazyStaggeredGridDslKt$rememberColumnSlots$1$1.$contentPadding, layoutDirection) + PaddingKt.d(l10, layoutDirection));
        w wVar = lazyStaggeredGridDslKt$rememberColumnSlots$1$1.$columns;
        C0945e.InterfaceC0129e interfaceC0129e = lazyStaggeredGridDslKt$rememberColumnSlots$1$1.$horizontalArrangement;
        int[] iArrA = wVar.a(iH, interfaceC0988x.e1(interfaceC0129e.mo1getSpacingD9Ej5fM()));
        int[] iArr = new int[iArrA.length];
        interfaceC0129e.a(interfaceC0988x, iH, iArrA, layoutDirection, iArr);
        u uVar2 = new u(iArr, iArrA);
        this.f10899d = uVar2;
        return uVar2;
    }
}
