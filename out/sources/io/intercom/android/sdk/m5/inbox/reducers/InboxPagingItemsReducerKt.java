package io.intercom.android.sdk.m5.inbox.reducers;

import P9.a;
import Z3.o;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.paging.compose.b;
import androidx.paging.l;
import androidx.paging.m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.io.IOException;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: InboxPagingItemsReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxPagingItemsReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InboxUiState reduceToInboxUiState(b<Conversation> bVar, EmptyState emptyState, AppConfig appConfig, int i10, InterfaceC1084f interfaceC1084f, int i11, int i12) {
        InboxUiState loading;
        i.e(bVar, "<this>");
        i.e(emptyState, "emptyState");
        interfaceC1084f.L(886365946);
        AppConfig appConfig2 = (i12 & 2) != 0 ? (AppConfig) o.b() : appConfig;
        String spaceLabelIfExists = appConfig2.getSpaceLabelIfExists(Space.Type.MESSAGES);
        interfaceC1084f.L(-261437153);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = S4.o.p(interfaceC1084f, R.string.intercom_messages_space_title);
        }
        String str = spaceLabelIfExists;
        interfaceC1084f.D();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        IntercomTopBarState intercomTopBarState = new IntercomTopBarState(Integer.valueOf(i10), str, null, new H(intercomTheme.getColors(interfaceC1084f, i13).m635getHeader0d7_KjU()), new H(intercomTheme.getColors(interfaceC1084f, i13).m642getOnHeader0d7_KjU()), null, 36, null);
        if (((l) bVar.f19335d.getValue()).e() != 0) {
            boolean zShouldShowSendMessageButton = shouldShowSendMessageButton(appConfig2);
            boolean z10 = bVar.c().f19341c instanceof m.b;
            m mVar = bVar.c().f19341c;
            ErrorState withCTA = null;
            m.a aVar = mVar instanceof m.a ? (m.a) mVar : null;
            if (aVar != null) {
                withCTA = aVar.f19371b instanceof IOException ? new ErrorState.WithCTA(0, 0, null, 0, new a(0, bVar), 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null);
            }
            loading = new InboxUiState.Content(intercomTopBarState, bVar, zShouldShowSendMessageButton, z10, withCTA);
        } else if (bVar.c().f19339a instanceof m.a) {
            m mVar2 = bVar.c().f19339a;
            i.c(mVar2, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            loading = ((m.a) mVar2).f19371b instanceof IOException ? new InboxUiState.Error(intercomTopBarState, new ErrorState.WithCTA(0, 0, null, 0, new P9.b(0, bVar), 15, null)) : new InboxUiState.Error(intercomTopBarState, new ErrorState.WithoutCTA(0, 0, null, 7, null));
        } else if (emptyState.equals(EmptyState.Companion.getNULL())) {
            loading = bVar.c().f19339a instanceof m.b ? new InboxUiState.Loading(intercomTopBarState) : new InboxUiState.Initial(intercomTopBarState);
        } else {
            loading = new InboxUiState.Empty(intercomTopBarState, emptyState, shouldShowSendMessageButton(appConfig2));
        }
        interfaceC1084f.D();
        return loading;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r reduceToInboxUiState$lambda$1$lambda$0(b this_reduceToInboxUiState) {
        i.e(this_reduceToInboxUiState, "$this_reduceToInboxUiState");
        b.a aVar = this_reduceToInboxUiState.f19334c;
        aVar.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        aVar.f19295c.a();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r reduceToInboxUiState$lambda$2(b this_reduceToInboxUiState) {
        i.e(this_reduceToInboxUiState, "$this_reduceToInboxUiState");
        this_reduceToInboxUiState.d();
        return r.f47939a;
    }

    private static final boolean shouldShowSendMessageButton(AppConfig appConfig) {
        return AppConfigExtensionsKt.canStartNewConversation(appConfig) && !appConfig.isHelpCenterRequireSearchEnabled();
    }
}
