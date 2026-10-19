package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.AbstractComposeView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;

/* JADX INFO: compiled from: TeamPresenceComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceComponent extends AbstractComposeView {
    public static final int $stable = 0;
    private final X needsChatBubble$delegate;
    private final X teamPresenceState$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r Content$lambda$1(TeamPresenceComponent tmp1_rcvr, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(tmp1_rcvr, "$tmp1_rcvr");
        tmp1_rcvr.Content(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1850798977);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final ArticleViewState.TeamPresenceState teamPresenceState = getTeamPresenceState();
            if (teamPresenceState != null) {
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                kotlin.jvm.internal.i.d(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, androidx.compose.runtime.internal.a.b(-1302062926, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent$Content$1$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                        if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        if (this.this$0.getNeedsChatBubble()) {
                            interfaceC1084f2.L(-365619251);
                            TeamPresenceComponentKt.TeamPresenceComponentWithBubble(teamPresenceState, interfaceC1084f2, 0);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-365539209);
                            TeamPresenceComponentKt.TeamPresenceComponent(teamPresenceState, false, null, interfaceC1084f2, 0, 6);
                            interfaceC1084f2.D();
                        }
                    }
                }, c1086gP), c1086gP, 56);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceComponent.Content$lambda$1(this.f39142b, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getNeedsChatBubble() {
        return ((Boolean) this.needsChatBubble$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.teamPresenceState$delegate.getValue();
    }

    public final void setNeedsChatBubble(boolean z10) {
        this.needsChatBubble$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setTeamPresenceState(ArticleViewState.TeamPresenceState teamPresenceState) {
        this.teamPresenceState$delegate.setValue(teamPresenceState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    public /* synthetic */ TeamPresenceComponent(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.e eVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.i.e(context, "context");
        this.teamPresenceState$delegate = J0.f(null);
        this.needsChatBubble$delegate = J0.f(Boolean.FALSE);
    }
}
