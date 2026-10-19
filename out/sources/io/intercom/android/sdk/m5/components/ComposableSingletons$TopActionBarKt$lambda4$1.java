package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: TopActionBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda4$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$TopActionBarKt$lambda4$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda4$1();

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
        Avatar avatarCreate = Avatar.create("", "HC");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        boolean z10 = false;
        kotlin.jvm.internal.e eVar = null;
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, z10, i11, eVar);
        Avatar avatarCreate2 = Avatar.create("", "AA");
        kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, z10, i11, eVar);
        Avatar avatarCreate3 = Avatar.create("", "SS");
        kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
        TopActionBarKt.m130TopActionBarNpQZenA(null, "Team", null, null, kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, z10, i11, eVar)), new G(), null, true, 0L, 0L, 0L, null, null, interfaceC1084f, 12812336, 0, 8013);
    }
}
