package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConversationHistoryCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationHistoryCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$ConversationHistoryCard$2, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationHistoryCard.kt */
    public static final class AnonymousClass2 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ List<Conversation> $conversations;
        final /* synthetic */ Ia.l<Conversation, p293xa.r> $onConversationClick;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<Conversation> list, Ia.l<? super Conversation, p293xa.r> lVar) {
            this.$conversations = list;
            this.$onConversationClick = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(Ia.l lVar, Conversation it) {
            kotlin.jvm.internal.i.e(it, "$it");
            lVar.invoke(it);
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
            List<Conversation> list = this.$conversations;
            final Ia.l<Conversation, p293xa.r> lVar = this.$onConversationClick;
            for (final Conversation conversation : list) {
                float f10 = 8;
                float f11 = 20;
                ConversationItemKt.ConversationItem(conversation, androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), new androidx.compose.foundation.layout.N(f11, f10, f11, f10), false, new Ia.a() { // from class: io.intercom.android.sdk.m5.components.S
                    @Override // Ia.a
                    public final Object invoke() {
                        return ConversationHistoryCardKt.AnonymousClass2.invoke$lambda$1$lambda$0(lVar, conversation);
                    }
                }, interfaceC1084f, 56, 8);
            }
        }
    }

    public static final void ConversationHistoryCard(androidx.compose.ui.h hVar, final String cardTitle, final List<Conversation> conversations, Ia.l<? super Conversation, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(cardTitle, "cardTitle");
        kotlin.jvm.internal.i.e(conversations, "conversations");
        C1086g c1086gP = interfaceC1084f.p(-1629591433);
        if ((i11 & 1) != 0) {
            hVar = androidx.compose.ui.h.a.f13984b;
        }
        if ((i11 & 8) != 0) {
            lVar = new N(0);
        }
        HomeCardScaffoldKt.HomeCardScaffold(hVar, cardTitle, androidx.compose.runtime.internal.a.b(1614953259, new AnonymousClass2(conversations, lVar), c1086gP), c1086gP, (i10 & 14) | 384 | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar2 = hVar;
            final Ia.l<? super Conversation, p293xa.r> lVar2 = lVar;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.O
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationHistoryCardKt.ConversationHistoryCard$lambda$1(hVar2, cardTitle, conversations, lVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationHistoryCard$lambda$0(Conversation it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationHistoryCard$lambda$1(androidx.compose.ui.h hVar, String cardTitle, List conversations, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(cardTitle, "$cardTitle");
        kotlin.jvm.internal.i.e(conversations, "$conversations");
        ConversationHistoryCard(hVar, cardTitle, conversations, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void RecentConversationsCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(593700998);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m74getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RecentConversationsCardPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        RecentConversationsCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void RecentConversationsCardWithSimpleTicketHeaderPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1823267221);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m73getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        RecentConversationsCardWithSimpleTicketHeaderPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
