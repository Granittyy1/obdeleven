package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement$Companion$height$1 extends Lambda implements Ia.p<p013b0.l, LayoutDirection, p013b0.j> {
    final /* synthetic */ androidx.compose.ui.d.c $align;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$height$1(androidx.compose.ui.d.c cVar) {
        super(2);
        this.$align = cVar;
    }

    @Override // Ia.p
    public final p013b0.j invoke(p013b0.l lVar, LayoutDirection layoutDirection) {
        return new p013b0.j((((long) this.$align.a(0, (int) (lVar.f20490a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
    }
}
