package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.m5.utils.TextFieldSaver;
import java.util.List;
import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2365n implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38794b;

    public /* synthetic */ C2365n(int i10) {
        this.f38794b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38794b) {
            case 0:
                return ConversationTopAppBarKt.ConversationTopAppBar$lambda$2((HeaderMenuItem) obj);
            case 1:
                return CreateTicketDestinationKt.createTicketDestination$lambda$0((C2748s) obj);
            case 2:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$14((InterfaceC0927e) obj);
            default:
                return TextFieldSaver.textFieldValueSaver$lambda$1((List) obj);
        }
    }
}
