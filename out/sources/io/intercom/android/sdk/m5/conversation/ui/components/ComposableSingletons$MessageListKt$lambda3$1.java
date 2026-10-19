package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.models.ReplyOption;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MessageListKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$MessageListKt$lambda3$1 INSTANCE = new ComposableSingletons$MessageListKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(ReplyOption it) {
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
            return;
        }
        ListBuilder listBuilderF = M1.f();
        listBuilderF.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
        MessageListKt.MessageList(null, listBuilderF.I(), null, null, new C2357f(0), null, null, null, null, null, false, null, null, interfaceC1084f, 24640, 0, 8173);
    }
}
