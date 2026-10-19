package io.intercom.android.sdk.m5.home.ui;

import Ia.l;
import Ia.p;
import Ia.q;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.k;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.U;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.layout.O;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenKt$HomeScreen$3$2$2 implements q<InterfaceC0928f, InterfaceC1084f, Integer, r> {
    final /* synthetic */ U $headerHeightPx;
    final /* synthetic */ HomeUiState $homeState;
    final /* synthetic */ l<Conversation, r> $onConversationClicked;
    final /* synthetic */ Ia.a<r> $onHelpClicked;
    final /* synthetic */ Ia.a<r> $onMessagesClicked;
    final /* synthetic */ Ia.a<r> $onNewConversationClicked;
    final /* synthetic */ l<String, r> $onTicketItemClicked;
    final /* synthetic */ l<TicketType, r> $onTicketLinkClicked;
    final /* synthetic */ Ia.a<r> $onTicketsClicked;
    final /* synthetic */ ScrollState $scrollState;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeScreenKt$HomeScreen$3$2$2(HomeUiState homeUiState, ScrollState scrollState, U u10, Ia.a<r> aVar, Ia.a<r> aVar2, Ia.a<r> aVar3, l<? super String, r> lVar, Ia.a<r> aVar4, l<? super Conversation, r> lVar2, l<? super TicketType, r> lVar3) {
        this.$homeState = homeUiState;
        this.$scrollState = scrollState;
        this.$headerHeightPx = u10;
        this.$onMessagesClicked = aVar;
        this.$onHelpClicked = aVar2;
        this.$onTicketsClicked = aVar3;
        this.$onTicketItemClicked = lVar;
        this.$onNewConversationClicked = aVar4;
        this.$onConversationClicked = lVar2;
        this.$onTicketLinkClicked = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$2$lambda$1$lambda$0(U headerHeightPx, InterfaceC1170p it) {
        i.e(headerHeightPx, "$headerHeightPx");
        i.e(it, "it");
        headerHeightPx.f((int) (it.a() & 4294967295L));
        return r.f47939a;
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0928f, interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f, int i10) {
        i.e(AnimatedVisibility, "$this$AnimatedVisibility");
        HomeUiState homeUiState = this.$homeState;
        if (homeUiState instanceof HomeUiState.Content) {
            ScrollState scrollState = this.$scrollState;
            final U u10 = this.$headerHeightPx;
            Ia.a<r> aVar = this.$onMessagesClicked;
            Ia.a<r> aVar2 = this.$onHelpClicked;
            Ia.a<r> aVar3 = this.$onTicketsClicked;
            l<String, r> lVar = this.$onTicketItemClicked;
            Ia.a<r> aVar4 = this.$onNewConversationClicked;
            l<Conversation, r> lVar2 = this.$onConversationClicked;
            l<TicketType, r> lVar3 = this.$onTicketLinkClicked;
            androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar5);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar6);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            androidx.compose.ui.h hVarC2 = Cb.a.c(aVar5, HomeScreenKt.getHeaderContentOpacity(scrollState.f9824a.o(), u10.j()));
            interfaceC1084f.L(1117660480);
            Object objF = interfaceC1084f.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new l() { // from class: io.intercom.android.sdk.m5.home.ui.h
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return HomeScreenKt$HomeScreen$3$2$2.invoke$lambda$2$lambda$1$lambda$0(u10, (InterfaceC1170p) obj);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            androidx.compose.ui.h hVarA = O.a(hVarC2, (l) objF);
            HomeUiState.Content content = (HomeUiState.Content) homeUiState;
            HomeHeaderKt.HomeContentHeader(hVarA, content.getHeader(), interfaceC1084f, 64, 0);
            HomeContentScreenKt.HomeContentScreen(null, content, aVar, aVar2, aVar3, lVar, aVar4, lVar2, lVar3, interfaceC1084f, 64, 1);
            interfaceC1084f.J();
        }
    }
}
