package io.intercom.android.sdk.m5.conversation.states;

import B1.a;
import Q8.d;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FooterNoticeState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> avatars;
    private final String subtitle;
    private final String title;

    public FooterNoticeState(String title, String subtitle, List<AvatarWrapper> avatars) {
        i.e(title, "title");
        i.e(subtitle, "subtitle");
        i.e(avatars, "avatars");
        this.title = title;
        this.subtitle = subtitle;
        this.avatars = avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterNoticeState copy$default(FooterNoticeState footerNoticeState, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footerNoticeState.title;
        }
        if ((i10 & 2) != 0) {
            str2 = footerNoticeState.subtitle;
        }
        if ((i10 & 4) != 0) {
            list = footerNoticeState.avatars;
        }
        return footerNoticeState.copy(str, str2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<AvatarWrapper> component3() {
        return this.avatars;
    }

    public final FooterNoticeState copy(String title, String subtitle, List<AvatarWrapper> avatars) {
        i.e(title, "title");
        i.e(subtitle, "subtitle");
        i.e(avatars, "avatars");
        return new FooterNoticeState(title, subtitle, avatars);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNoticeState)) {
            return false;
        }
        FooterNoticeState footerNoticeState = (FooterNoticeState) obj;
        return i.a(this.title, footerNoticeState.title) && i.a(this.subtitle, footerNoticeState.subtitle) && i.a(this.avatars, footerNoticeState.avatars);
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.avatars.hashCode() + a.b(this.subtitle, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FooterNoticeState(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", avatars=");
        return d.b(sb2, this.avatars, ')');
    }
}
