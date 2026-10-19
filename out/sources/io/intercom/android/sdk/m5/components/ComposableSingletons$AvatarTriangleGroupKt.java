package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: AvatarTriangleGroup.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AvatarTriangleGroupKt {
    public static final ComposableSingletons$AvatarTriangleGroupKt INSTANCE = new ComposableSingletons$AvatarTriangleGroupKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f11lambda1 = new ComposableLambdaImpl(false, -1436103865, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-1$1
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
            AvatarTriangleGroupKt.m60AvatarTriangleGroupjt2gSs(M1.k(new AvatarWrapper(avatarCreate, false, 2, null)), null, null, 0.0f, interfaceC1084f, 8, 14);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f12lambda2 = new ComposableLambdaImpl(false, -549018737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-2$1
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
            AvatarTriangleGroupKt.m60AvatarTriangleGroupjt2gSs(kotlin.collections.l.s(avatarWrapper, new AvatarWrapper(avatarCreate2, false, 2, null)), null, null, 0.0f, interfaceC1084f, 8, 14);
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f13lambda3 = new ComposableLambdaImpl(false, 848463324, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-3$1
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
            AvatarTriangleGroupKt.m60AvatarTriangleGroupjt2gSs(kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), null, null, 0.0f, interfaceC1084f, 8, 14);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m64getLambda1$intercom_sdk_base_release() {
        return f11lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m65getLambda2$intercom_sdk_base_release() {
        return f12lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m66getLambda3$intercom_sdk_base_release() {
        return f13lambda3;
    }
}
