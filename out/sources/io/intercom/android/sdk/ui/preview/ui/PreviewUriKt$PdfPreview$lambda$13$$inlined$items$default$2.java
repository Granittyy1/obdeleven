package io.intercom.android.sdk.ui.preview.ui;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$2 extends Lambda implements Ia.l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Ia.l $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$2(Ia.l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    @Override // Ia.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(this.$items.get(i10));
    }
}
