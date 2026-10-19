package io.intercom.android.sdk.m5.helpcenter.ui;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1 extends Lambda implements Ia.l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Ia.p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1(Ia.p pVar, List list) {
        super(1);
        this.$key = pVar;
        this.$items = list;
    }

    @Override // Ia.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }
}
