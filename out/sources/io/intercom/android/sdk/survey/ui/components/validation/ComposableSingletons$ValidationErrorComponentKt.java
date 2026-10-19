package io.intercom.android.sdk.survey.ui.components.validation;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import p293xa.r;

/* JADX INFO: compiled from: ValidationErrorComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ValidationErrorComponentKt {
    public static final ComposableSingletons$ValidationErrorComponentKt INSTANCE = new ComposableSingletons$ValidationErrorComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f242lambda1 = new ComposableLambdaImpl(false, 39859331, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.validation.ComposableSingletons$ValidationErrorComponentKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ValidationErrorComponentKt.m406ValidationErrorComponentFNF3uiM(null, new ValidationError.ValidationStringError(R.string.intercom_inbox_error_state_title, null, 2, null), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m633getError0d7_KjU(), interfaceC1084f, 64, 1);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m405getLambda1$intercom_sdk_base_release() {
        return f242lambda1;
    }
}
