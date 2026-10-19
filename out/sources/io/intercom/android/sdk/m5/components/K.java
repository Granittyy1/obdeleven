package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38191g;

    public /* synthetic */ K(androidx.compose.ui.h hVar, Object obj, Object obj2, int i10, int i11, int i12) {
        this.f38186b = i12;
        this.f38187c = hVar;
        this.f38190f = obj;
        this.f38191g = obj2;
        this.f38188d = i10;
        this.f38189e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38186b) {
            case 0:
                return ConversationEndedCardKt.ConversationEndedCard$lambda$0(this.f38187c, (Ia.a) this.f38190f, (ComposerState.ConversationEnded) this.f38191g, this.f38188d, this.f38189e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            case 1:
                return EventRowKt.EventRow$lambda$1(this.f38187c, (String) this.f38190f, (AvatarWrapper) this.f38191g, this.f38188d, this.f38189e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return SurveyTopBarComponentKt.SurveyTopBar$lambda$8((TopBarState) this.f38191g, (Ia.a) this.f38190f, this.f38187c, this.f38188d, this.f38189e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ K(TopBarState topBarState, Ia.a aVar, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f38186b = 2;
        this.f38191g = topBarState;
        this.f38190f = aVar;
        this.f38187c = hVar;
        this.f38188d = i10;
        this.f38189e = i11;
    }
}
