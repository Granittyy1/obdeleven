package io.intercom.android.sdk.m5.inbox.ui;

import Ia.p;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.Conversation;
import p293xa.r;

/* JADX INFO: compiled from: InboxContentScreenItems.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1 implements p<InterfaceC1084f, Integer, r> {
    final /* synthetic */ androidx.paging.compose.b<Conversation> $lazyPagingItems;

    public InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(androidx.paging.compose.b<Conversation> bVar) {
        this.$lazyPagingItems = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$1(androidx.paging.compose.b lazyPagingItems, androidx.compose.foundation.lazy.p LazyColumn) {
        kotlin.jvm.internal.i.e(lazyPagingItems, "$lazyPagingItems");
        kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
        InboxContentScreenItemsKt.inboxContentScreenItems(LazyColumn, lazyPagingItems, new f());
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$1$lambda$0(Conversation it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            final androidx.paging.compose.b<Conversation> bVar = this.$lazyPagingItems;
            LazyDslKt.a(null, null, null, false, null, null, null, false, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.inbox.ui.g
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1.invoke$lambda$1(bVar, (androidx.compose.foundation.lazy.p) obj);
                }
            }, interfaceC1084f, 0, 511);
        }
    }
}
