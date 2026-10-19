package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.Action;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: NewConversationCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$NewConversationCardKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$NewConversationCardKt$lambda2$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda2$1();

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
        boolean z10 = false;
        HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Ask a question", IconType.BOT, "Usual reply time is a few minutes"), false, EmptyList.f42983b, false, false, null);
        Avatar avatarCreate = Avatar.create("", "VR");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        kotlin.jvm.internal.e eVar = null;
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, z10, i11, eVar);
        Avatar avatarCreate2 = Avatar.create("", "PR");
        kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, z10, i11, eVar);
        Avatar avatarCreate3 = Avatar.create("", "SK");
        kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
        AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, z10, i11, eVar);
        Avatar avatarCreate4 = Avatar.create("", "LD");
        kotlin.jvm.internal.i.d(avatarCreate4, "create(...)");
        NewConversationCardKt.NewConversationCard(homeNewConversationData, kotlin.collections.l.s(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, z10, i11, eVar)), null, new b(), interfaceC1084f, 3144, 4);
    }
}
