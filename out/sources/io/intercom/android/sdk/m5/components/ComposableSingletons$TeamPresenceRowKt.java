package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: TeamPresenceRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TeamPresenceRowKt {
    public static final ComposableSingletons$TeamPresenceRowKt INSTANCE = new ComposableSingletons$TeamPresenceRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f61lambda1 = new ComposableLambdaImpl(false, -919412179, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt$lambda-1$1
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
            Avatar avatarCreate = Avatar.create("", "VR");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("", "SK");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("", "PR");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, false, 2, null);
            Avatar avatarCreate4 = Avatar.create("", "LD");
            kotlin.jvm.internal.i.d(avatarCreate4, "create(...)");
            TeamPresenceRowKt.TeamPresenceRow(null, kotlin.collections.l.s(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, false, 2, null)), interfaceC1084f, 64, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f62lambda2 = new ComposableLambdaImpl(false, 225256978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m114getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m114getLambda1$intercom_sdk_base_release() {
        return f61lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m115getLambda2$intercom_sdk_base_release() {
        return f62lambda2;
    }
}
