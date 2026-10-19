package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: BrowseAllHelpTopicsComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BrowseAllHelpTopicsComponentKt {
    public static final ComposableSingletons$BrowseAllHelpTopicsComponentKt INSTANCE = new ComposableSingletons$BrowseAllHelpTopicsComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<U, InterfaceC1084f, Integer, p293xa.r> f177lambda1 = new ComposableLambdaImpl(false, 1224833391, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(u10, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(U OutlinedButton, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            IconKt.a(U.c.a(R.drawable.intercom_article_book_icon, interfaceC1084f, 0), null, null, 0L, interfaceC1084f, 56, 12);
            Lb.a.a(interfaceC1084f, W.q(androidx.compose.ui.h.a.f13984b, 6));
            String strP = S4.o.p(interfaceC1084f, R.string.intercom_browse_all_help_topics);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TextKt.b(strP, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(intercomTheme.getTypography(interfaceC1084f, i11).getType04Point5(), intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU(), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), interfaceC1084f, 0, 0, 65534);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f178lambda2 = new ComposableLambdaImpl(false, -1938885306, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(null, interfaceC1084f, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f179lambda3 = new ComposableLambdaImpl(false, 612498774, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-3$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, interfaceC1084f, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<U, InterfaceC1084f, Integer, p293xa.r> m277getLambda1$intercom_sdk_base_release() {
        return f177lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m278getLambda2$intercom_sdk_base_release() {
        return f178lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m279getLambda3$intercom_sdk_base_release() {
        return f179lambda3;
    }
}
