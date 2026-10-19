package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: ConversationEndedCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationEndedCardKt {
    public static final ComposableSingletons$ConversationEndedCardKt INSTANCE = new ComposableSingletons$ConversationEndedCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f16lambda1 = new ComposableLambdaImpl(false, -867938680, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ConversationEndedCardKt.ConversationEndedCard(null, null, new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), null, 2, null), interfaceC1084f, StringProvider.$stable << 6, 3);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f17lambda2 = new ComposableLambdaImpl(false, -1449960304, ComposableSingletons$ConversationEndedCardKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f18lambda3 = new ComposableLambdaImpl(false, -156696201, ComposableSingletons$ConversationEndedCardKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f19lambda4 = new ComposableLambdaImpl(false, -324942016, ComposableSingletons$ConversationEndedCardKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m69getLambda1$intercom_sdk_base_release() {
        return f16lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m70getLambda2$intercom_sdk_base_release() {
        return f17lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m71getLambda3$intercom_sdk_base_release() {
        return f18lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m72getLambda4$intercom_sdk_base_release() {
        return f19lambda4;
    }
}
