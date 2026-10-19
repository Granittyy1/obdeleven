package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: AvatarGroup.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AvatarGroupKt {
    public static final ComposableSingletons$AvatarGroupKt INSTANCE = new ComposableSingletons$AvatarGroupKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f9lambda1 = new ComposableLambdaImpl(false, 589090506, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarGroupKt$lambda-1$1
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
            Avatar avatarCreate = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "RS");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), null, 0.0f, 0L, interfaceC1084f, 8, 14);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f10lambda2 = new ComposableLambdaImpl(false, -2020495553, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarGroupKt$lambda-2$1
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
            Avatar avatarCreate = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            AvatarShape avatarShape = AvatarShape.SQUIRCLE;
            Avatar avatarCreate2 = Avatar.create("", "RS", avatarShape);
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "VR", avatarShape);
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), null, 0.0f, 0L, interfaceC1084f, 8, 14);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m62getLambda1$intercom_sdk_base_release() {
        return f9lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m63getLambda2$intercom_sdk_base_release() {
        return f10lambda2;
    }
}
