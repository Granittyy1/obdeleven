package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement$Companion$size$1 extends Lambda implements Ia.p<p013b0.l, LayoutDirection, p013b0.j> {
    final /* synthetic */ androidx.compose.ui.d $align;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$size$1(androidx.compose.ui.d dVar) {
        super(2);
        this.$align = dVar;
    }

    @Override // Ia.p
    public final p013b0.j invoke(p013b0.l lVar, LayoutDirection layoutDirection) {
        return new p013b0.j(this.$align.a(0L, lVar.f20490a, layoutDirection));
    }
}
