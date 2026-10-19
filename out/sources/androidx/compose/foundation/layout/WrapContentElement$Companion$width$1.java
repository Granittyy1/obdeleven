package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement$Companion$width$1 extends Lambda implements Ia.p<p013b0.l, LayoutDirection, p013b0.j> {
    final /* synthetic */ androidx.compose.ui.d.b $align;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$width$1(androidx.compose.ui.d.b bVar) {
        super(2);
        this.$align = bVar;
    }

    @Override // Ia.p
    public final p013b0.j invoke(p013b0.l lVar, LayoutDirection layoutDirection) {
        long j = lVar.f20490a;
        return new p013b0.j((((long) this.$align.a(0, (int) (j >> 32), layoutDirection)) << 32) | (((long) 0) & 4294967295L));
    }
}
