package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Pair;

/* JADX INFO: compiled from: BotAndHumansFacePile.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BotAndHumansFacePileKt {
    public static final ComposableSingletons$BotAndHumansFacePileKt INSTANCE = new ComposableSingletons$BotAndHumansFacePileKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f14lambda1 = new ComposableLambdaImpl(false, 1717496869, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-1$1
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
            BotAndHumansFacePileKt.m61BotAndHumansFacePilehGBTI10(null, avatarCreate, new Pair(Avatar.create("", "SK"), Avatar.create("", "RS")), 64, "Fin", interfaceC1084f, 28224, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f15lambda2 = new ComposableLambdaImpl(false, -1080506615, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-2$1
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
            BotAndHumansFacePileKt.m61BotAndHumansFacePilehGBTI10(null, avatarCreate, new Pair(null, Avatar.create("", "SK")), 32, "Fin", interfaceC1084f, 28224, 1);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m67getLambda1$intercom_sdk_base_release() {
        return f14lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m68getLambda2$intercom_sdk_base_release() {
        return f15lambda2;
    }
}
