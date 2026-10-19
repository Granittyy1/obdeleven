package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: GifGrid.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$GifGridKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$GifGridKt$lambda2$1 INSTANCE = new ComposableSingletons$GifGridKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(Block it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(String it) {
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
            GifGridKt.GifGrid(null, EmptyList.f42983b, new C2352x(), new C2353y(), interfaceC1084f, 3504, 1);
        }
    }
}
