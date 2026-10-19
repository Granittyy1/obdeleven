package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2369a implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38859b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38863f;

    public /* synthetic */ C2369a(androidx.compose.ui.h hVar, Part part, int i10, int i11) {
        this.f38860c = hVar;
        this.f38863f = part;
        this.f38861d = i10;
        this.f38862e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38859b) {
            case 0:
                return AskedAboutRowKt.AskedAboutRow$lambda$3(this.f38860c, (Part) this.f38863f, this.f38861d, this.f38862e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return TicketTimelineCardKt.TicketTimelineCard$lambda$2((TicketTimelineCardState) this.f38863f, this.f38860c, this.f38861d, this.f38862e, interfaceC1084f, iIntValue);
        }
    }

    public /* synthetic */ C2369a(TicketTimelineCardState ticketTimelineCardState, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f38863f = ticketTimelineCardState;
        this.f38860c = hVar;
        this.f38861d = i10;
        this.f38862e = i11;
    }
}
