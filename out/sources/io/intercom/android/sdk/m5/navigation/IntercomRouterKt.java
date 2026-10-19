package io.intercom.android.sdk.m5.navigation;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;

/* JADX INFO: compiled from: IntercomRouter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRouterKt {
    public static final void openConversation(p141l2.H h8, String str, String str2, boolean z10, String str3, p141l2.J j, TransitionArgs transitionArgs) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        p141l2.w.d(h8, new IntercomRootActivityArgs.ConversationScreenArgs(str, str2 == null ? "" : str2, z10, str3, null, transitionArgs, 16, null).getRoute(), j, 4);
    }

    public static /* synthetic */ void openConversation$default(p141l2.H h8, String str, String str2, boolean z10, String str3, p141l2.J j, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            j = null;
        }
        if ((i10 & 32) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openConversation(h8, str, str2, z10, str3, j, transitionArgs);
    }

    public static final void openCreateTicketsScreen(p141l2.H h8, TicketType ticketTypeData, String str, String from) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(ticketTypeData, "ticketTypeData");
        kotlin.jvm.internal.i.e(from, "from");
        p141l2.w.d(h8, "CREATE_TICKET/" + ticketTypeData.getId() + "?conversation_id=" + str + "?from=" + from, null, 6);
    }

    public static final void openHelpCenter(p141l2.H h8, TransitionArgs transitionArgs, boolean z10) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        p141l2.w.d(h8, "HELP_CENTER?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, 6);
    }

    public static /* synthetic */ void openHelpCenter$default(p141l2.H h8, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openHelpCenter(h8, transitionArgs, z10);
    }

    public static final void openMessages(p141l2.H h8, TransitionArgs transitionArgs, boolean z10) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        p141l2.w.d(h8, "MESSAGES?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, 6);
    }

    public static /* synthetic */ void openMessages$default(p141l2.H h8, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openMessages(h8, transitionArgs, z10);
    }

    public static final void openNewConversation(p141l2.H h8, boolean z10, p141l2.J j, TransitionArgs transitionArgs) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        openConversation$default(h8, null, null, z10, null, j, transitionArgs, 11, null);
    }

    public static /* synthetic */ void openNewConversation$default(p141l2.H h8, boolean z10, p141l2.J j, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            j = null;
        }
        if ((i10 & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openNewConversation(h8, z10, j, transitionArgs);
    }

    public static final void openTicketDetailScreen(p141l2.H h8, boolean z10, TransitionArgs transitionArgs, boolean z11) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        p141l2.w.d(h8, "TICKET_DETAIL?show_submission_card=" + z10 + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z11, null, 6);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(p141l2.H h8, boolean z10, TransitionArgs transitionArgs, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        openTicketDetailScreen(h8, z10, transitionArgs, z11);
    }

    public static final void openTicketList(p141l2.H h8, TransitionArgs transitionArgs, boolean z10) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        p141l2.w.d(h8, "TICKETS?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, 6);
    }

    public static /* synthetic */ void openTicketList$default(p141l2.H h8, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openTicketList(h8, transitionArgs, z10);
    }

    public static final void openTicketDetailScreen(p141l2.H h8, String ticketId, String from, TransitionArgs transitionArgs, boolean z10) {
        kotlin.jvm.internal.i.e(h8, "<this>");
        kotlin.jvm.internal.i.e(ticketId, "ticketId");
        kotlin.jvm.internal.i.e(from, "from");
        kotlin.jvm.internal.i.e(transitionArgs, "transitionArgs");
        p141l2.w.d(h8, "TICKET_DETAIL/" + ticketId + "?from=" + from + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, 6);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(p141l2.H h8, String str, String str2, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        openTicketDetailScreen(h8, str, str2, transitionArgs, z10);
    }
}
