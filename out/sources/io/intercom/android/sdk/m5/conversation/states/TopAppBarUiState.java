package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.animation.D;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TopAppBarUiState {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final TopAppBarUiState f81default;
    private final List<AvatarWrapper> avatars;
    private final H backgroundColor;
    private final H backgroundColorDark;
    private final H contentColor;
    private final H contentColorDark;
    private final boolean displayActiveIndicator;
    private final List<HeaderMenuItem> headerMenuItems;
    private final Integer navIcon;
    private final StringProvider subTitle;
    private final H subTitleColor;
    private final H subTitleColorDark;
    private final Integer subTitleLeadingIcon;
    private final TicketProgressRowState ticketStatusState;
    private final StringProvider title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.f81default;
        }

        private Companion() {
        }
    }

    static {
        StringProvider.ActualString actualString = new StringProvider.ActualString("");
        EmptyList emptyList = EmptyList.f42983b;
        f81default = new TopAppBarUiState(actualString, null, null, null, emptyList, false, null, emptyList, null, null, null, null, null, null, 16130, null);
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z10, TicketProgressRowState ticketProgressRowState, List list2, H h8, H h10, H h11, H h12, H h13, H h14, e eVar) {
        this(stringProvider, num, stringProvider2, num2, list, z10, ticketProgressRowState, list2, h8, h10, h11, h12, h13, h14);
    }

    public final StringProvider component1() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10-QN2ZGVo, reason: not valid java name */
    public final H m140component10QN2ZGVo() {
        return this.backgroundColorDark;
    }

    /* JADX INFO: renamed from: component11-QN2ZGVo, reason: not valid java name */
    public final H m141component11QN2ZGVo() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: component12-QN2ZGVo, reason: not valid java name */
    public final H m142component12QN2ZGVo() {
        return this.contentColorDark;
    }

    /* JADX INFO: renamed from: component13-QN2ZGVo, reason: not valid java name */
    public final H m143component13QN2ZGVo() {
        return this.subTitleColor;
    }

    /* JADX INFO: renamed from: component14-QN2ZGVo, reason: not valid java name */
    public final H m144component14QN2ZGVo() {
        return this.subTitleColorDark;
    }

    public final Integer component2() {
        return this.navIcon;
    }

    public final StringProvider component3() {
        return this.subTitle;
    }

    public final Integer component4() {
        return this.subTitleLeadingIcon;
    }

    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    public final boolean component6() {
        return this.displayActiveIndicator;
    }

    public final TicketProgressRowState component7() {
        return this.ticketStatusState;
    }

    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    /* JADX INFO: renamed from: component9-QN2ZGVo, reason: not valid java name */
    public final H m145component9QN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: copy-nf2GS8Y, reason: not valid java name */
    public final TopAppBarUiState m146copynf2GS8Y(StringProvider title, Integer num, StringProvider stringProvider, Integer num2, List<AvatarWrapper> avatars, boolean z10, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> headerMenuItems, H h8, H h10, H h11, H h12, H h13, H h14) {
        i.e(title, "title");
        i.e(avatars, "avatars");
        i.e(headerMenuItems, "headerMenuItems");
        return new TopAppBarUiState(title, num, stringProvider, num2, avatars, z10, ticketProgressRowState, headerMenuItems, h8, h10, h11, h12, h13, h14, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) obj;
        return i.a(this.title, topAppBarUiState.title) && i.a(this.navIcon, topAppBarUiState.navIcon) && i.a(this.subTitle, topAppBarUiState.subTitle) && i.a(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && i.a(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && i.a(this.ticketStatusState, topAppBarUiState.ticketStatusState) && i.a(this.headerMenuItems, topAppBarUiState.headerMenuItems) && i.a(this.backgroundColor, topAppBarUiState.backgroundColor) && i.a(this.backgroundColorDark, topAppBarUiState.backgroundColorDark) && i.a(this.contentColor, topAppBarUiState.contentColor) && i.a(this.contentColorDark, topAppBarUiState.contentColorDark) && i.a(this.subTitleColor, topAppBarUiState.subTitleColor) && i.a(this.subTitleColorDark, topAppBarUiState.subTitleColorDark);
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final H m147getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getBackgroundColorDark-QN2ZGVo, reason: not valid java name */
    public final H m148getBackgroundColorDarkQN2ZGVo() {
        return this.backgroundColorDark;
    }

    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final H m149getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getContentColorDark-QN2ZGVo, reason: not valid java name */
    public final H m150getContentColorDarkQN2ZGVo() {
        return this.contentColorDark;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final H m151getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    /* JADX INFO: renamed from: getSubTitleColorDark-QN2ZGVo, reason: not valid java name */
    public final H m152getSubTitleColorDarkQN2ZGVo() {
        return this.subTitleColorDark;
    }

    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public final StringProvider getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StringProvider stringProvider = this.subTitle;
        int iHashCode3 = (iHashCode2 + (stringProvider == null ? 0 : stringProvider.hashCode())) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        int iB = D.b(p.d((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.avatars), 31, this.displayActiveIndicator);
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        int iD = p.d((iB + (ticketProgressRowState == null ? 0 : ticketProgressRowState.hashCode())) * 31, 31, this.headerMenuItems);
        H h8 = this.backgroundColor;
        int iHashCode4 = (iD + (h8 == null ? 0 : Long.hashCode(h8.f13506a))) * 31;
        H h10 = this.backgroundColorDark;
        int iHashCode5 = (iHashCode4 + (h10 == null ? 0 : Long.hashCode(h10.f13506a))) * 31;
        H h11 = this.contentColor;
        int iHashCode6 = (iHashCode5 + (h11 == null ? 0 : Long.hashCode(h11.f13506a))) * 31;
        H h12 = this.contentColorDark;
        int iHashCode7 = (iHashCode6 + (h12 == null ? 0 : Long.hashCode(h12.f13506a))) * 31;
        H h13 = this.subTitleColor;
        int iHashCode8 = (iHashCode7 + (h13 == null ? 0 : Long.hashCode(h13.f13506a))) * 31;
        H h14 = this.subTitleColorDark;
        return iHashCode8 + (h14 != null ? Long.hashCode(h14.f13506a) : 0);
    }

    public String toString() {
        return "TopAppBarUiState(title=" + this.title + ", navIcon=" + this.navIcon + ", subTitle=" + this.subTitle + ", subTitleLeadingIcon=" + this.subTitleLeadingIcon + ", avatars=" + this.avatars + ", displayActiveIndicator=" + this.displayActiveIndicator + ", ticketStatusState=" + this.ticketStatusState + ", headerMenuItems=" + this.headerMenuItems + ", backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", contentColor=" + this.contentColor + ", contentColorDark=" + this.contentColorDark + ", subTitleColor=" + this.subTitleColor + ", subTitleColorDark=" + this.subTitleColorDark + ')';
    }

    public TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z10, TicketProgressRowState ticketProgressRowState, List list2, H h8, H h10, H h11, H h12, H h13, H h14, int i10, e eVar) {
        this(stringProvider, (i10 & 2) != 0 ? null : num, stringProvider2, num2, list, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : ticketProgressRowState, (i10 & 128) != 0 ? EmptyList.f42983b : list2, (i10 & 256) != 0 ? null : h8, (i10 & 512) != 0 ? null : h10, (i10 & 1024) != 0 ? null : h11, (i10 & 2048) != 0 ? null : h12, (i10 & 4096) != 0 ? null : h13, (i10 & 8192) != 0 ? null : h14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TopAppBarUiState(StringProvider title, Integer num, StringProvider stringProvider, Integer num2, List<AvatarWrapper> avatars, boolean z10, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> headerMenuItems, H h8, H h10, H h11, H h12, H h13, H h14) {
        i.e(title, "title");
        i.e(avatars, "avatars");
        i.e(headerMenuItems, "headerMenuItems");
        this.title = title;
        this.navIcon = num;
        this.subTitle = stringProvider;
        this.subTitleLeadingIcon = num2;
        this.avatars = avatars;
        this.displayActiveIndicator = z10;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = headerMenuItems;
        this.backgroundColor = h8;
        this.backgroundColorDark = h10;
        this.contentColor = h11;
        this.contentColorDark = h12;
        this.subTitleColor = h13;
        this.subTitleColorDark = h14;
    }
}
