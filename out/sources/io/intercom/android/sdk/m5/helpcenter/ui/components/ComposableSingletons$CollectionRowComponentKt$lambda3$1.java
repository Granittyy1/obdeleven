package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: CollectionRowComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CollectionRowComponentKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$CollectionRowComponentKt$lambda3$1 INSTANCE = new ComposableSingletons$CollectionRowComponentKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            CollectionRowComponentKt.CollectionRowComponent(new CollectionRowData("", "Lorem Ipsum Dolor Sit", 0, "", 3, 2), new h(), null, interfaceC1084f, 48, 4);
        }
    }
}
