package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;

/* JADX INFO: compiled from: ExternalLinkCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ExternalLinkCardKt {
    public static final ComposableSingletons$ExternalLinkCardKt INSTANCE = new ComposableSingletons$ExternalLinkCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f193lambda1 = new ComposableLambdaImpl(false, 19664413, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$ExternalLinkCardKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ExternalLinkCardKt.ExternalLinkCard(new HomeCards.HomeExternalLinkData("External Links", HomeCardType.EXTERNAL_LINKS, kotlin.collections.l.s(new Link("Ask the community", "https://stackoverflow.com/"), new Link("Knowledge base", "https://stackoverflow.com/"))), interfaceC1084f, 8);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m302getLambda1$intercom_sdk_base_release() {
        return f193lambda1;
    }
}
