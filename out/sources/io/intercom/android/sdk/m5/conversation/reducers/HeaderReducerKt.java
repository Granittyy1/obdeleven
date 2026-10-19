package io.intercom.android.sdk.m5.conversation.reducers;

import androidx.compose.ui.graphics.H;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.m;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HeaderReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderReducerKt {

    /* JADX INFO: compiled from: HeaderReducer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Header.Collapsed.HeaderIconType.values().length];
            try {
                iArr[Header.Collapsed.HeaderIconType.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Header.Collapsed.HeaderIconType.AI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String getCappedUnreadCountString(int i10) {
        if (i10 > 9) {
            return "9+";
        }
        return i10 == 0 ? "" : String.valueOf(i10);
    }

    private static final int getNavIcon(LaunchMode launchMode) {
        return launchMode == LaunchMode.PROGRAMMATIC ? R.drawable.intercom_ic_close : R.drawable.intercom_ic_back;
    }

    public static final List<HeaderMenuItem> reduceHeaderMenuItems(AppConfig config, int i10, boolean z10, LaunchMode launchMode, int i11) {
        HeaderMenuItem.TotalCountIndicator unreadCountIndicator;
        i.e(config, "config");
        i.e(launchMode, "launchMode");
        ListBuilder listBuilderF = M1.f();
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            String cappedUnreadCountString = getCappedUnreadCountString(i10);
            if (i10 != 0 || i11 <= 0) {
                unreadCountIndicator = i10 > 0 ? new HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator(cappedUnreadCountString) : HeaderMenuItem.TotalCountIndicator.NoIndicator.INSTANCE;
            } else {
                unreadCountIndicator = HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator.INSTANCE;
            }
            HeaderMenuItem.TotalCountIndicator totalCountIndicator = unreadCountIndicator;
            String spaceLabelIfExists = config.getSpaceLabelIfExists(Space.Type.MESSAGES);
            listBuilderF.add(new HeaderMenuItem.Messages(totalCountIndicator, cappedUnreadCountString, false, spaceLabelIfExists != null ? new StringProvider.ActualString(spaceLabelIfExists) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_messages_space_title, null, 2, null), 4, null));
            if (AppConfigExtensionsKt.canStartNewConversation(config)) {
                listBuilderF.add(new HeaderMenuItem.StartNewConversation(!z10, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_new_conversation, null, 2, null)));
            }
            if (config.isSpaceEnabled(Space.Type.HELP)) {
                listBuilderF.add(new HeaderMenuItem.Help(true, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_help_space_title, null, 2, null)));
            }
            Space.Type type = Space.Type.TICKETS;
            if (config.isSpaceEnabled(type)) {
                boolean z11 = i11 > 0;
                String spaceLabelIfExists2 = config.getSpaceLabelIfExists(type);
                listBuilderF.add(new HeaderMenuItem.Tickets(z11, true, spaceLabelIfExists2 != null ? new StringProvider.ActualString(spaceLabelIfExists2) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_tickets_space_title, null, 2, null)));
            }
        }
        return listBuilderF.I();
    }

    public static final TopAppBarUiState reduceTopAppBarUiState(boolean z10, boolean z11, Conversation conversation, Header header, AppConfig config, int i10, int i11, LaunchMode launchMode) {
        Header header2;
        Integer numValueOf;
        long j;
        List arrayList;
        List<Avatar.Builder> avatars;
        int i12;
        i.e(config, "config");
        i.e(launchMode, "launchMode");
        List<HeaderMenuItem> listReduceHeaderMenuItems = reduceHeaderMenuItems(config, i10, z10, launchMode, i11);
        if (z10 && header == null) {
            TopAppBarUiState topAppBarUiState = TopAppBarUiState.Companion.getDefault();
            return topAppBarUiState.m146copynf2GS8Y((16381 & 1) != 0 ? topAppBarUiState.title : null, (16381 & 2) != 0 ? topAppBarUiState.navIcon : Integer.valueOf(getNavIcon(launchMode)), (16381 & 4) != 0 ? topAppBarUiState.subTitle : null, (16381 & 8) != 0 ? topAppBarUiState.subTitleLeadingIcon : null, (16381 & 16) != 0 ? topAppBarUiState.avatars : null, (16381 & 32) != 0 ? topAppBarUiState.displayActiveIndicator : false, (16381 & 64) != 0 ? topAppBarUiState.ticketStatusState : null, (16381 & 128) != 0 ? topAppBarUiState.headerMenuItems : listReduceHeaderMenuItems, (16381 & 256) != 0 ? topAppBarUiState.backgroundColor : null, (16381 & 512) != 0 ? topAppBarUiState.backgroundColorDark : null, (16381 & 1024) != 0 ? topAppBarUiState.contentColor : null, (16381 & 2048) != 0 ? topAppBarUiState.contentColorDark : null, (16381 & 4096) != 0 ? topAppBarUiState.subTitleColor : null, (16381 & 8192) != 0 ? topAppBarUiState.subTitleColorDark : null);
        }
        if (conversation == null || (header2 = conversation.getHeader()) == null) {
            if (header == null) {
                TopAppBarUiState topAppBarUiState2 = TopAppBarUiState.Companion.getDefault();
                return topAppBarUiState2.m146copynf2GS8Y((16381 & 1) != 0 ? topAppBarUiState2.title : null, (16381 & 2) != 0 ? topAppBarUiState2.navIcon : Integer.valueOf(getNavIcon(launchMode)), (16381 & 4) != 0 ? topAppBarUiState2.subTitle : null, (16381 & 8) != 0 ? topAppBarUiState2.subTitleLeadingIcon : null, (16381 & 16) != 0 ? topAppBarUiState2.avatars : null, (16381 & 32) != 0 ? topAppBarUiState2.displayActiveIndicator : false, (16381 & 64) != 0 ? topAppBarUiState2.ticketStatusState : null, (16381 & 128) != 0 ? topAppBarUiState2.headerMenuItems : listReduceHeaderMenuItems, (16381 & 256) != 0 ? topAppBarUiState2.backgroundColor : null, (16381 & 512) != 0 ? topAppBarUiState2.backgroundColorDark : null, (16381 & 1024) != 0 ? topAppBarUiState2.contentColor : null, (16381 & 2048) != 0 ? topAppBarUiState2.contentColorDark : null, (16381 & 4096) != 0 ? topAppBarUiState2.subTitleColor : null, (16381 & 8192) != 0 ? topAppBarUiState2.subTitleColorDark : null);
            }
            header2 = header;
        }
        long composeColor$default = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColor(), 0.0f, 1, null);
        long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColorDark(), 0.0f, 1, null);
        long composeColor$default3 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColor(), 0.0f, 1, null);
        long composeColor$default4 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColorDark(), 0.0f, 1, null);
        long composeColor$default5 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColor(), 0.0f, 1, null);
        long composeColor$default6 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColorDark(), 0.0f, 1, null);
        TicketProgressRowState ticketProgressRowState = ((conversation != null ? conversation.getTicket() : null) == null || (!ConversationExtensionsKt.hasNonTicketParts(conversation) && !z11)) ? null : new TicketProgressRowState(conversation.getTicket().getTitle(), conversation.getTicket().getCurrentStatus().getTitle());
        Header.Collapsed collapsed = header2.getCollapsed();
        StringProvider.ActualString actualString = new StringProvider.ActualString(collapsed.getTitle());
        Integer numValueOf2 = Integer.valueOf(getNavIcon(launchMode));
        String subtitle = collapsed.getSubtitle();
        StringProvider.ActualString actualString2 = subtitle != null ? new StringProvider.ActualString(subtitle) : null;
        Header.Collapsed.HeaderIconType icon = collapsed.getIcon();
        if (icon != null) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i13 == 1) {
                i12 = io.intercom.android.sdk.R.drawable.intercom_clock;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = io.intercom.android.sdk.R.drawable.intercom_ic_ai;
            }
            numValueOf = Integer.valueOf(i12);
        } else {
            numValueOf = null;
        }
        AvatarDetails avatarDetails = collapsed.getAvatarDetails();
        if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
            j = composeColor$default6;
            arrayList = EmptyList.f42983b;
        } else {
            List<Avatar.Builder> list = avatars;
            arrayList = new ArrayList(m.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                i.d(avatarBuild, "build(...)");
                arrayList.add(new AvatarWrapper(avatarBuild, header2.getUseBotHeader()));
                it = it;
                composeColor$default6 = composeColor$default6;
            }
            j = composeColor$default6;
        }
        return new TopAppBarUiState(actualString, numValueOf2, actualString2, numValueOf, arrayList, header2.getDisplayActiveIndicator(), ticketProgressRowState, listReduceHeaderMenuItems, new H(composeColor$default), new H(composeColor$default2), new H(composeColor$default3), new H(composeColor$default4), new H(composeColor$default5), new H(j), null);
    }
}
