package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3 extends Lambda implements Ia.l<Integer, androidx.compose.foundation.lazy.staggeredgrid.x> {
    final /* synthetic */ List $items;
    final /* synthetic */ Ia.p $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3(Ia.p pVar, List list) {
        super(1);
        this.$span = pVar;
        this.$items = list;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.x invoke(int i10) {
        return (androidx.compose.foundation.lazy.staggeredgrid.x) this.$span.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }

    @Override // Ia.l
    public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.x invoke(Integer num) {
        return invoke(num.intValue());
    }
}
