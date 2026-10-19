package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38960b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38965g;

    public /* synthetic */ x(androidx.compose.ui.h hVar, Part part, String str, int i10, int i11) {
        this.f38964f = hVar;
        this.f38965g = part;
        this.f38961c = str;
        this.f38962d = i10;
        this.f38963e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38960b) {
            case 0:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return NoteCardRowKt.NoteCardRow$lambda$0((androidx.compose.ui.h) this.f38964f, (Part) this.f38965g, this.f38961c, this.f38962d, this.f38963e, interfaceC1084f, iIntValue);
            default:
                return InAppNotificationCardKt.TicketInAppNotificationContent$lambda$6(this.f38961c, (String) this.f38964f, (String) this.f38965g, this.f38962d, this.f38963e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ x(String str, String str2, String str3, int i10, int i11) {
        this.f38961c = str;
        this.f38964f = str2;
        this.f38965g = str3;
        this.f38962d = i10;
        this.f38963e = i11;
    }
}
