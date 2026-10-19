package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.navigation.IntercomTransitionsKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;
import io.intercom.android.sdk.models.Part;
import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2410z implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39104b;

    public /* synthetic */ C2410z(int i10) {
        this.f39104b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39104b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$60((Part) obj);
            case 1:
                return IntercomTransitionsKt.slideDownExitTransition$lambda$1((InterfaceC0927e) obj);
            case 2:
                return TicketsDestinationKt.ticketsDestination$lambda$0((C2748s) obj);
            default:
                p141l2.K navOptions = (p141l2.K) obj;
                kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
                navOptions.f44258b = true;
                return p293xa.r.f47939a;
        }
    }
}
