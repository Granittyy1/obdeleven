package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.helpcenter.sections.Avatar;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: CollectionSummaryComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CollectionSummaryComponentKt {
    public static final ComposableSingletons$CollectionSummaryComponentKt INSTANCE = new ComposableSingletons$CollectionSummaryComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f184lambda1 = new ComposableLambdaImpl(false, 309452486, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionSummaryComponentKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                CollectionSummaryComponentKt.CollectionSummaryComponent(new CollectionDetailsUiState.Content("123456", "Recording videos", "How to set up screen and camera recording through our app or Chrome extension.", 5, kotlin.collections.l.s(new Author("", "Hannah", new Avatar("", "SK")), new Author("", "Bob", new Avatar("", "PS")), new Author("", "Anna", new Avatar("", "VR"))), EmptyList.f42983b), null, interfaceC1084f, 8, 2);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m284getLambda1$intercom_sdk_base_release() {
        return f184lambda1;
    }
}
