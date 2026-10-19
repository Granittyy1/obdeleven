package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
final class LazyStaggeredGridDslKt$rememberColumnSlots$1$1 extends Lambda implements Ia.p<p013b0.c, p013b0.a, u> {
    final /* synthetic */ w $columns;
    final /* synthetic */ L $contentPadding;
    final /* synthetic */ C0945e.InterfaceC0129e $horizontalArrangement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberColumnSlots$1$1(L l10, w wVar, C0945e.InterfaceC0129e interfaceC0129e) {
        super(2);
        this.$contentPadding = l10;
        this.$columns = wVar;
        this.$horizontalArrangement = interfaceC0129e;
    }

    @Override // Ia.p
    public final u invoke(p013b0.c cVar, p013b0.a aVar) {
        p013b0.c cVar2 = cVar;
        long j = aVar.f20475a;
        if (p013b0.a.h(j) == Integer.MAX_VALUE) {
            p245u.c.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        L l10 = this.$contentPadding;
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        int iH = p013b0.a.h(j) - cVar2.e1(PaddingKt.c(this.$contentPadding, layoutDirection) + PaddingKt.d(l10, layoutDirection));
        w wVar = this.$columns;
        C0945e.InterfaceC0129e interfaceC0129e = this.$horizontalArrangement;
        int[] iArrA = wVar.a(iH, cVar2.e1(interfaceC0129e.mo1getSpacingD9Ej5fM()));
        int[] iArr = new int[iArrA.length];
        interfaceC0129e.a(cVar2, iH, iArrA, layoutDirection, iArr);
        return new u(iArr, iArrA);
    }
}
