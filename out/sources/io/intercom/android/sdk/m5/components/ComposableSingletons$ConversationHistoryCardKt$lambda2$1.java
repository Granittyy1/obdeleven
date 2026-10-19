package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: ConversationHistoryCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationHistoryCardKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ConversationHistoryCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationHistoryCardKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$3(Conversation it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
        ListBuilder listBuilderF = M1.f();
        int i11 = 0;
        while (i11 < 2) {
            boolean z10 = i11 == 0;
            Ticket ticket = new Ticket(null, null, "Export button not working", null, null, null, null, null, null, 0, null, null, null, null, 0L, 32763, null);
            LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            kotlin.jvm.internal.i.d(builderWithAvatar, "withAvatar(...)");
            listBuilderF.add(new Conversation("123", z10, null, M1.k(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044436, null));
            i11++;
        }
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            boolean z11 = i12 == 0;
            LastParticipatingAdmin.Builder builderWithAvatar2 = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            kotlin.jvm.internal.i.d(builderWithAvatar2, "withAvatar(...)");
            listBuilderF.add(new Conversation("123", z11, null, M1.k(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar2, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048532, null));
            i12++;
        }
        p293xa.r rVar = p293xa.r.f47939a;
        ConversationHistoryCardKt.ConversationHistoryCard(hVarD, "Your recent conversations", listBuilderF.I(), new C2298p(), interfaceC1084f, 3638, 0);
    }
}
