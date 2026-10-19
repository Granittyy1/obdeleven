package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.ui.ConversationErrorScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38204b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38209g;

    public /* synthetic */ L0(androidx.compose.ui.h hVar, String str, androidx.compose.ui.text.font.l lVar, int i10, int i11) {
        this.f38205c = hVar;
        this.f38208f = str;
        this.f38209g = lVar;
        this.f38206d = i10;
        this.f38207e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38204b) {
            case 0:
                return TicketHeaderKt.SimpleTicketHeader$lambda$2(this.f38205c, (String) this.f38208f, (androidx.compose.ui.text.font.l) this.f38209g, this.f38206d, this.f38207e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return ConversationErrorScreenKt.ConversationErrorScreen$lambda$0((ConversationUiState.Error) this.f38208f, (Ia.a) this.f38209g, this.f38205c, this.f38206d, this.f38207e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ L0(ConversationUiState.Error error, Ia.a aVar, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f38208f = error;
        this.f38209g = aVar;
        this.f38205c = hVar;
        this.f38206d = i10;
        this.f38207e = i11;
    }
}
