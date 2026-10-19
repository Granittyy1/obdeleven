package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: AddFileButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AddFileButtonKt {
    public static final ComposableSingletons$AddFileButtonKt INSTANCE = new ComposableSingletons$AddFileButtonKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f261lambda1 = new ComposableLambdaImpl(false, -1360176596, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$AddFileButtonKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                AddFileButtonKt.AddFileButton(null, R.string.intercom_tickets_add_file, interfaceC1084f, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m428getLambda1$intercom_sdk_base_release() {
        return f261lambda1;
    }
}
