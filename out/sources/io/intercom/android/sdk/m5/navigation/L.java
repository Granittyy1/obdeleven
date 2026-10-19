package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import java.util.List;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39337b;

    public /* synthetic */ L(int i10) {
        this.f39337b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39337b) {
            case 0:
                return MessagesDestinationKt.messagesDestination$lambda$1((C2748s) obj);
            case 1:
                return TicketsDestinationKt.ticketsDestination$lambda$2((InterfaceC0927e) obj);
            case 2:
                return SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$5((J.e) obj);
            default:
                return FileActionSheetKt.FileActionSheet$lambda$5((List) obj);
        }
    }
}
