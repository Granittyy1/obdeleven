package io.intercom.android.sdk.m5.inbox.ui;

import Ia.r;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.lazy.p;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.paging.PagingData;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.C2281g0;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.InterfaceC2686c;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: InboxContentScreenItems.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxContentScreenItemsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$inboxContentScreenItems$1, reason: invalid class name */
    /* JADX INFO: compiled from: InboxContentScreenItems.kt */
    public static final class AnonymousClass1 implements r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ androidx.paging.compose.b<Conversation> $inboxConversations;
        final /* synthetic */ Ia.l<Conversation, p293xa.r> $onConversationClick;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(androidx.paging.compose.b<Conversation> bVar, Ia.l<? super Conversation, p293xa.r> lVar) {
            this.$inboxConversations = bVar;
            this.$onConversationClick = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(Ia.l onConversationClick, Conversation conversation) {
            kotlin.jvm.internal.i.e(onConversationClick, "$onConversationClick");
            kotlin.jvm.internal.i.e(conversation, "$conversation");
            onConversationClick.invoke(conversation);
            return p293xa.r.f47939a;
        }

        @Override // Ia.r
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
            invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b items, int i10, InterfaceC1084f interfaceC1084f, int i11) {
            kotlin.jvm.internal.i.e(items, "$this$items");
            if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i11 |= interfaceC1084f.h(i10) ? 32 : 16;
            }
            if ((i11 & 721) == 144 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            final Conversation conversationB = this.$inboxConversations.b(i10);
            if (conversationB == null) {
                return;
            }
            final Ia.l<Conversation, p293xa.r> lVar = this.$onConversationClick;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            float f10 = 16;
            ConversationItemKt.ConversationItem(conversationB, W.d(aVar, 1.0f), new N(f10, f10, f10, f10), false, new Ia.a() { // from class: io.intercom.android.sdk.m5.inbox.ui.h
                @Override // Ia.a
                public final Object invoke() {
                    return InboxContentScreenItemsKt.AnonymousClass1.invoke$lambda$1$lambda$0(lVar, conversationB);
                }
            }, interfaceC1084f, 440, 8);
            IntercomDividerKt.IntercomDivider(PaddingKt.h(aVar, f10, 0.0f, 2), interfaceC1084f, 6, 0);
        }
    }

    @IntercomPreviews
    private static final void InboxContentScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1634106166);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            kotlin.jvm.internal.i.d(builderWithAvatar, "withAvatar(...)");
            InboxContentScreenPreview$DisplayPaging(B.a(PagingData.Companion.a(M1.k(new Conversation("123", false, null, M1.k(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048534, null)))), c1086gP, 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 3);
        }
    }

    private static final void InboxContentScreenPreview$DisplayPaging(InterfaceC2686c<PagingData<Conversation>> interfaceC2686c, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(1509694910);
        IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(853574228, new InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(androidx.paging.compose.c.a(interfaceC2686c, interfaceC1084f)), interfaceC1084f), interfaceC1084f, 3072, 7);
        interfaceC1084f.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InboxContentScreenPreview$lambda$0(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InboxContentScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void inboxContentScreenItems(p pVar, androidx.paging.compose.b<Conversation> inboxConversations, Ia.l<? super Conversation, p293xa.r> onConversationClick) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        kotlin.jvm.internal.i.e(inboxConversations, "inboxConversations");
        kotlin.jvm.internal.i.e(onConversationClick, "onConversationClick");
        pVar.g(((androidx.paging.l) inboxConversations.f19335d.getValue()).e(), null, new Ia.l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }, new ComposableLambdaImpl(true, -1371545107, new AnonymousClass1(inboxConversations, onConversationClick)));
    }
}
