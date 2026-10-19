package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LazyMessageListKt {
    public static final ComposableSingletons$LazyMessageListKt INSTANCE = new ComposableSingletons$LazyMessageListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> f91lambda1 = new ComposableLambdaImpl(false, 1752043673, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(bVar, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(item, "$this$item");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                BoxKt.a(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), interfaceC1084f, 6);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f92lambda2 = new ComposableLambdaImpl(false, 829029502, ComposableSingletons$LazyMessageListKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f93lambda3 = new ComposableLambdaImpl(false, 1588713059, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-3$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m163getLambda2$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> m162getLambda1$intercom_sdk_base_release() {
        return f91lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m163getLambda2$intercom_sdk_base_release() {
        return f92lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m164getLambda3$intercom_sdk_base_release() {
        return f93lambda3;
    }
}
