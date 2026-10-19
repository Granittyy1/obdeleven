package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: ConversationBottomBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationBottomBarKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ConversationBottomBarKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationBottomBarKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(String str, TextInputSource textInputSource) {
        kotlin.jvm.internal.i.e(str, "<unused var>");
        kotlin.jvm.internal.i.e(textInputSource, "<unused var>");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$1(ComposerInputType it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$5(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        int i11 = 2;
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        ComposerState.TextInput textInput = new ComposerState.TextInput("Wubba Lubba Dub Dub!", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, 4, null);
        Avatar avatarCreate = Avatar.create("", "PR");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        boolean z10 = false;
        StringProvider stringProvider = null;
        ConversationBottomBarKt.m204ConversationBottomBarwn8IZOc(null, new BottomBarUiState(textInput, new CurrentlyTypingState(new AvatarWrapper(avatarCreate, false, i11, null), z10, stringProvider, TypingIndicatorType.ADMIN, 6, null), InputTypeState.Companion.getDEFAULT(), null, false, null, 56, null), new C2339j(), new C2340k(), new C2341l(), new C2342m(), new C2343n(), null, 0.0f, new C2344o(), new C2345p(), null, interfaceC1084f, 807103936, 6, 2433);
    }
}
