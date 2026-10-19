package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FooterNotice.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FooterNotice {
    public static final int $stable = 8;

    @b("avatar_details")
    private final AvatarDetails avatarDetails;

    @b("subtitle")
    private final String subtitle;

    @b("title")
    private final String title;

    public FooterNotice(String title, String str, AvatarDetails avatarDetails) {
        i.e(title, "title");
        this.title = title;
        this.subtitle = str;
        this.avatarDetails = avatarDetails;
    }

    public static /* synthetic */ FooterNotice copy$default(FooterNotice footerNotice, String str, String str2, AvatarDetails avatarDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footerNotice.title;
        }
        if ((i10 & 2) != 0) {
            str2 = footerNotice.subtitle;
        }
        if ((i10 & 4) != 0) {
            avatarDetails = footerNotice.avatarDetails;
        }
        return footerNotice.copy(str, str2, avatarDetails);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AvatarDetails component3() {
        return this.avatarDetails;
    }

    public final FooterNotice copy(String title, String str, AvatarDetails avatarDetails) {
        i.e(title, "title");
        return new FooterNotice(title, str, avatarDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNotice)) {
            return false;
        }
        FooterNotice footerNotice = (FooterNotice) obj;
        return i.a(this.title, footerNotice.title) && i.a(this.subtitle, footerNotice.subtitle) && i.a(this.avatarDetails, footerNotice.avatarDetails);
    }

    public final AvatarDetails getAvatarDetails() {
        return this.avatarDetails;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AvatarDetails avatarDetails = this.avatarDetails;
        return iHashCode2 + (avatarDetails != null ? avatarDetails.hashCode() : 0);
    }

    public String toString() {
        return "FooterNotice(title=" + this.title + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ')';
    }
}
