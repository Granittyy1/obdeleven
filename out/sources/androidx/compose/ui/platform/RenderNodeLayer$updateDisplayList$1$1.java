package androidx.compose.ui.platform;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RenderNodeLayer$updateDisplayList$1$1 extends Lambda implements Ia.l<androidx.compose.ui.graphics.E, p293xa.r> {
    final /* synthetic */ Ia.p<androidx.compose.ui.graphics.E, androidx.compose.ui.graphics.layer.b, p293xa.r> $drawBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RenderNodeLayer$updateDisplayList$1$1(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar) {
        super(1);
        this.$drawBlock = pVar;
    }

    @Override // Ia.l
    public final p293xa.r invoke(androidx.compose.ui.graphics.E e10) {
        this.$drawBlock.invoke(e10, null);
        return p293xa.r.f47939a;
    }
}
