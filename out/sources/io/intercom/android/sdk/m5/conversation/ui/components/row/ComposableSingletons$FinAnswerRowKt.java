package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: FinAnswerRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FinAnswerRowKt {
    public static final ComposableSingletons$FinAnswerRowKt INSTANCE = new ComposableSingletons$FinAnswerRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f141lambda1 = new ComposableLambdaImpl(false, 966172131, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinAnswerRowKt$lambda-1$1
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
            IconKt.a(U.c.a(R.drawable.intercom_ic_info, interfaceC1084f, 0), S4.o.p(interfaceC1084f, R.string.intercom_ai_answer_information), W.m(androidx.compose.ui.h.a.f13984b, 14), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f, 392, 0);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f142lambda2 = new ComposableLambdaImpl(false, -534585843, ComposableSingletons$FinAnswerRowKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m227getLambda1$intercom_sdk_base_release() {
        return f141lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m228getLambda2$intercom_sdk_base_release() {
        return f142lambda2;
    }
}
