package io.intercom.android.sdk.overlay;

import Ia.p;
import P3.d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.InterfaceC1376t;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ComposeCompatibilityUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposeCompatibilityUtilKt {
    public static final void addAvatarIconToCompose(ComposeView composeView, final Participant lastAdmin, final AppConfig appConfig) {
        i.e(lastAdmin, "lastAdmin");
        i.e(appConfig, "appConfig");
        if (composeView == null || isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new ComposableLambdaImpl(true, 421691537, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                AppConfig appConfig2 = appConfig;
                final Participant participant = lastAdmin;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig2, a.b(2111948784, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1.1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                        if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Avatar avatar = participant.getAvatar();
                        i.d(avatar, "getAvatar(...)");
                        Boolean boolIsBot = participant.isBot();
                        i.d(boolIsBot, "isBot(...)");
                        AvatarIconKt.m131AvatarIconRd90Nhg(null, new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, interfaceC1084f2, 64, 61);
                    }
                }, interfaceC1084f), interfaceC1084f, 56);
            }
        }));
    }

    public static final boolean isLegacyActivity(ComposeView composeView) {
        InterfaceC1376t interfaceC1376tG;
        boolean z10 = ((composeView == null || (interfaceC1376tG = d.g(composeView)) == null) ? null : interfaceC1376tG.getLifecycle()) == null;
        if (z10) {
            Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
        }
        return z10;
    }
}
