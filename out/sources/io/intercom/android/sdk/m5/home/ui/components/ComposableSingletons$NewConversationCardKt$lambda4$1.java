package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.Action;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: NewConversationCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$NewConversationCardKt$lambda4$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$NewConversationCardKt$lambda4$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda4$1();

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
        kotlin.jvm.internal.e eVar = null;
        HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Ask a question", IconType.FIN, null), false, EmptyList.f42983b, true, true, null);
        Avatar avatarCreate = Avatar.create("", "VR");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        boolean z10 = false;
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, z10, i11, eVar);
        Avatar avatarCreate2 = Avatar.create("", "PR");
        kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, z10, i11, eVar);
        Avatar avatarCreate3 = Avatar.create("", "SK");
        kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
        AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, z10, i11, eVar);
        Avatar avatarCreate4 = Avatar.create("", "LD");
        kotlin.jvm.internal.i.d(avatarCreate4, "create(...)");
        List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, z10, i11, eVar));
        Avatar avatarCreate5 = Avatar.create("", "B");
        kotlin.jvm.internal.i.d(avatarCreate5, "create(...)");
        NewConversationCardKt.NewConversationCard(homeNewConversationData, listS, new AvatarWrapper(avatarCreate5, z10, i11, eVar), new d(), interfaceC1084f, 3656, 0);
    }
}
