package io.intercom.android.sdk.m5.conversation.states;

import Z3.o;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedTeamPresenceState {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ExpandedTeamPresenceState f80default;
    private final AvatarType avatarType;
    private final List<AvatarWrapper> avatars;
    private final List<Header.Expanded.Body> body;
    private final boolean displayActiveIndicator;
    private final List<Header.Expanded.Footer> footers;
    private final List<Header.Expanded.SocialAccount> socialAccounts;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ExpandedTeamPresenceState getDefault() {
            return ExpandedTeamPresenceState.f80default;
        }

        private Companion() {
        }
    }

    static {
        EmptyList emptyList = EmptyList.f42983b;
        f80default = new ExpandedTeamPresenceState("", emptyList, AvatarType.UNKNOWN, emptyList, emptyList, emptyList, false);
    }

    public ExpandedTeamPresenceState(String title, List<Header.Expanded.Body> body, AvatarType avatarType, List<AvatarWrapper> avatars, List<Header.Expanded.Footer> footers, List<Header.Expanded.SocialAccount> socialAccounts, boolean z10) {
        i.e(title, "title");
        i.e(body, "body");
        i.e(avatarType, "avatarType");
        i.e(avatars, "avatars");
        i.e(footers, "footers");
        i.e(socialAccounts, "socialAccounts");
        this.title = title;
        this.body = body;
        this.avatarType = avatarType;
        this.avatars = avatars;
        this.footers = footers;
        this.socialAccounts = socialAccounts;
        this.displayActiveIndicator = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandedTeamPresenceState copy$default(ExpandedTeamPresenceState expandedTeamPresenceState, String str, List list, AvatarType avatarType, List list2, List list3, List list4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = expandedTeamPresenceState.title;
        }
        if ((i10 & 2) != 0) {
            list = expandedTeamPresenceState.body;
        }
        List list5 = list;
        if ((i10 & 4) != 0) {
            avatarType = expandedTeamPresenceState.avatarType;
        }
        AvatarType avatarType2 = avatarType;
        if ((i10 & 8) != 0) {
            list2 = expandedTeamPresenceState.avatars;
        }
        List list6 = list2;
        if ((i10 & 16) != 0) {
            list3 = expandedTeamPresenceState.footers;
        }
        List list7 = list3;
        if ((i10 & 32) != 0) {
            list4 = expandedTeamPresenceState.socialAccounts;
        }
        List list8 = list4;
        if ((i10 & 64) != 0) {
            z10 = expandedTeamPresenceState.displayActiveIndicator;
        }
        return expandedTeamPresenceState.copy(str, list5, avatarType2, list6, list7, list8, z10);
    }

    public final String component1() {
        return this.title;
    }

    public final List<Header.Expanded.Body> component2() {
        return this.body;
    }

    public final AvatarType component3() {
        return this.avatarType;
    }

    public final List<AvatarWrapper> component4() {
        return this.avatars;
    }

    public final List<Header.Expanded.Footer> component5() {
        return this.footers;
    }

    public final List<Header.Expanded.SocialAccount> component6() {
        return this.socialAccounts;
    }

    public final boolean component7() {
        return this.displayActiveIndicator;
    }

    public final ExpandedTeamPresenceState copy(String title, List<Header.Expanded.Body> body, AvatarType avatarType, List<AvatarWrapper> avatars, List<Header.Expanded.Footer> footers, List<Header.Expanded.SocialAccount> socialAccounts, boolean z10) {
        i.e(title, "title");
        i.e(body, "body");
        i.e(avatarType, "avatarType");
        i.e(avatars, "avatars");
        i.e(footers, "footers");
        i.e(socialAccounts, "socialAccounts");
        return new ExpandedTeamPresenceState(title, body, avatarType, avatars, footers, socialAccounts, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandedTeamPresenceState)) {
            return false;
        }
        ExpandedTeamPresenceState expandedTeamPresenceState = (ExpandedTeamPresenceState) obj;
        return i.a(this.title, expandedTeamPresenceState.title) && i.a(this.body, expandedTeamPresenceState.body) && this.avatarType == expandedTeamPresenceState.avatarType && i.a(this.avatars, expandedTeamPresenceState.avatars) && i.a(this.footers, expandedTeamPresenceState.footers) && i.a(this.socialAccounts, expandedTeamPresenceState.socialAccounts) && this.displayActiveIndicator == expandedTeamPresenceState.displayActiveIndicator;
    }

    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    public final List<Header.Expanded.Body> getBody() {
        return this.body;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<Header.Expanded.Footer> getFooters() {
        return this.footers;
    }

    public final List<Header.Expanded.SocialAccount> getSocialAccounts() {
        return this.socialAccounts;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.displayActiveIndicator) + p.d(p.d(p.d((this.avatarType.hashCode() + p.d(this.title.hashCode() * 31, 31, this.body)) * 31, 31, this.avatars), 31, this.footers), 31, this.socialAccounts);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandedTeamPresenceState(title=");
        sb2.append(this.title);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", avatarType=");
        sb2.append(this.avatarType);
        sb2.append(", avatars=");
        sb2.append(this.avatars);
        sb2.append(", footers=");
        sb2.append(this.footers);
        sb2.append(", socialAccounts=");
        sb2.append(this.socialAccounts);
        sb2.append(", displayActiveIndicator=");
        return o.d(sb2, this.displayActiveIndicator, ')');
    }
}
