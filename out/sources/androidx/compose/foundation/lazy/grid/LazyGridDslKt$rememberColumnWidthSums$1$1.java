package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends Lambda implements Ia.p<p013b0.c, p013b0.a, x> {
    final /* synthetic */ b $columns;
    final /* synthetic */ C0945e.InterfaceC0129e $horizontalArrangement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(b bVar, C0945e.InterfaceC0129e interfaceC0129e) {
        super(2);
        this.$columns = bVar;
        this.$horizontalArrangement = interfaceC0129e;
    }

    @Override // Ia.p
    public final x invoke(p013b0.c cVar, p013b0.a aVar) {
        p013b0.c cVar2 = cVar;
        long j = aVar.f20475a;
        if (p013b0.a.h(j) == Integer.MAX_VALUE) {
            p245u.c.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int iH = p013b0.a.h(j);
        b bVar = this.$columns;
        C0945e.InterfaceC0129e interfaceC0129e = this.$horizontalArrangement;
        int[] iArrN0 = kotlin.collections.q.n0(bVar.a(iH, cVar2.e1(interfaceC0129e.mo1getSpacingD9Ej5fM())));
        int[] iArr = new int[iArrN0.length];
        interfaceC0129e.a(cVar2, iH, iArrN0, LayoutDirection.f15717b, iArr);
        return new x(iArrN0, iArr);
    }
}
