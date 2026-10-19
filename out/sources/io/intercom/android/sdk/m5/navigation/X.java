package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.block.CodeBlockKt;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39355b;

    public /* synthetic */ X(int i10) {
        this.f39355b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39355b) {
            case 0:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$13((InterfaceC0927e) obj);
            case 1:
                return CodeBlockKt.CodeBlock$lambda$0((androidx.compose.ui.text.B) obj);
            case 2:
                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
            default:
                Context it = (Context) obj;
                kotlin.jvm.internal.i.e(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
        }
    }
}
