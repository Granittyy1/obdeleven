package p037cb;

import Ia.a;
import Ia.l;
import Ya.b;
import android.content.Context;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;

/* JADX INFO: renamed from: cb.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1532j0 implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22621c;

    public /* synthetic */ C1532j0(int i10, Object obj) {
        this.f22620b = i10;
        this.f22621c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        b<?>[] bVarArrChildSerializers;
        switch (this.f22620b) {
            case 0:
                D<?> d10 = ((C1536l0) this.f22621c).f22627b;
                return (d10 == null || (bVarArrChildSerializers = d10.childSerializers()) == null) ? C1538m0.f22638a : bVarArrChildSerializers;
            case 1:
                return AppIdentityInjector.nexusClient_delegate$lambda$14((AppIdentityInjector) this.f22621c);
            case 2:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2((l) this.f22621c);
            case 3:
                return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent$lambda$0((Context) this.f22621c);
            default:
                return TicketsScreenViewModel._init_$lambda$0((TicketRepository) this.f22621c);
        }
    }
}
