package io.intercom.android.sdk.models;

import Ba.a;
import I7.b;
import Z3.o;
import androidx.compose.animation.D;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: OpenMessengerResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Header {
    public static final int $stable = 8;

    @b("background_color")
    private final String backgroundColor;

    @b("background_color_dark")
    private final String backgroundColorDark;

    @b("collapsed")
    private final Collapsed collapsed;

    @b("display_active_indicator")
    private final boolean displayActiveIndicator;

    @b("expanded")
    private final Expanded expanded;

    @b("foreground_primary_color")
    private final String foregroundPrimaryColor;

    @b("foreground_primary_color_dark")
    private final String foregroundPrimaryColorDark;

    @b("foreground_secondary_color")
    private final String foregroundSecondaryColor;

    @b("foreground_secondary_color_dark")
    private final String foregroundSecondaryColorDark;

    @b("hide_greeting")
    private final boolean hideGreeting;

    @b("use_bot_header")
    private final boolean useBotHeader;

    /* JADX INFO: compiled from: OpenMessengerResponse.kt */
    public static final class Collapsed {
        public static final int $stable = 8;

        @b("avatar_details")
        private final AvatarDetails avatarDetails;

        @b(InAppMessageBase.ICON)
        private final HeaderIconType icon;

        @b("subtitle")
        private final String subtitle;

        @b("title")
        private final String title;

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public enum HeaderIconType {
            CLOCK,
            AI;

            private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

            public static a<HeaderIconType> getEntries() {
                return $ENTRIES;
            }
        }

        public Collapsed(AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String title) {
            i.e(title, "title");
            this.avatarDetails = avatarDetails;
            this.icon = headerIconType;
            this.subtitle = str;
            this.title = title;
        }

        public static /* synthetic */ Collapsed copy$default(Collapsed collapsed, AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatarDetails = collapsed.avatarDetails;
            }
            if ((i10 & 2) != 0) {
                headerIconType = collapsed.icon;
            }
            if ((i10 & 4) != 0) {
                str = collapsed.subtitle;
            }
            if ((i10 & 8) != 0) {
                str2 = collapsed.title;
            }
            return collapsed.copy(avatarDetails, headerIconType, str, str2);
        }

        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        public final HeaderIconType component2() {
            return this.icon;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final String component4() {
            return this.title;
        }

        public final Collapsed copy(AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String title) {
            i.e(title, "title");
            return new Collapsed(avatarDetails, headerIconType, str, title);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Collapsed)) {
                return false;
            }
            Collapsed collapsed = (Collapsed) obj;
            return i.a(this.avatarDetails, collapsed.avatarDetails) && this.icon == collapsed.icon && i.a(this.subtitle, collapsed.subtitle) && i.a(this.title, collapsed.title);
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final HeaderIconType getIcon() {
            return this.icon;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            int iHashCode = (avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31;
            HeaderIconType headerIconType = this.icon;
            int iHashCode2 = (iHashCode + (headerIconType == null ? 0 : headerIconType.hashCode())) * 31;
            String str = this.subtitle;
            return this.title.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Collapsed(avatarDetails=");
            sb2.append(this.avatarDetails);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", title=");
            return B7.b.g(sb2, this.title, ')');
        }
    }

    /* JADX INFO: compiled from: OpenMessengerResponse.kt */
    public static final class Expanded {
        public static final int $stable = 8;

        @b("avatar_details")
        private final AvatarDetails avatarDetails;

        @b("body")
        private final List<Body> body;

        @b("footer")
        private final List<Footer> footer;

        @b("social_accounts")
        private final List<SocialAccount> socialAccounts;

        @b("title")
        private final String title;

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class Body {
            public static final int $stable = 8;

            @b("color")
            private String color;

            @b("style")
            private final Style style;

            @b(AttributeType.TEXT)
            private final String text;

            public Body(Style style, String text, String str) {
                i.e(style, "style");
                i.e(text, "text");
                this.style = style;
                this.text = text;
                this.color = str;
            }

            public static /* synthetic */ Body copy$default(Body body, Style style, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    style = body.style;
                }
                if ((i10 & 2) != 0) {
                    str = body.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = body.color;
                }
                return body.copy(style, str, str2);
            }

            public final Style component1() {
                return this.style;
            }

            public final String component2() {
                return this.text;
            }

            public final String component3() {
                return this.color;
            }

            public final Body copy(Style style, String text, String str) {
                i.e(style, "style");
                i.e(text, "text");
                return new Body(style, text, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Body)) {
                    return false;
                }
                Body body = (Body) obj;
                return this.style == body.style && i.a(this.text, body.text) && i.a(this.color, body.color);
            }

            public final String getColor() {
                return this.color;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iB = B1.a.b(this.text, this.style.hashCode() * 31, 31);
                String str = this.color;
                return iB + (str == null ? 0 : str.hashCode());
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Body(style=");
                sb2.append(this.style);
                sb2.append(", text=");
                sb2.append(this.text);
                sb2.append(", color=");
                return B7.b.g(sb2, this.color, ')');
            }
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class Footer {
            public static final int $stable = 8;

            @b("avatar_details")
            private final AvatarDetails avatarDetails;

            @b("color")
            private String color;

            @b("style")
            private final Style style;

            @b(AttributeType.TEXT)
            private final String text;

            public Footer(Style style, String text, String str, AvatarDetails avatarDetails) {
                i.e(style, "style");
                i.e(text, "text");
                this.style = style;
                this.text = text;
                this.color = str;
                this.avatarDetails = avatarDetails;
            }

            public static /* synthetic */ Footer copy$default(Footer footer, Style style, String str, String str2, AvatarDetails avatarDetails, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    style = footer.style;
                }
                if ((i10 & 2) != 0) {
                    str = footer.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = footer.color;
                }
                if ((i10 & 8) != 0) {
                    avatarDetails = footer.avatarDetails;
                }
                return footer.copy(style, str, str2, avatarDetails);
            }

            public final Style component1() {
                return this.style;
            }

            public final String component2() {
                return this.text;
            }

            public final String component3() {
                return this.color;
            }

            public final AvatarDetails component4() {
                return this.avatarDetails;
            }

            public final Footer copy(Style style, String text, String str, AvatarDetails avatarDetails) {
                i.e(style, "style");
                i.e(text, "text");
                return new Footer(style, text, str, avatarDetails);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) obj;
                return this.style == footer.style && i.a(this.text, footer.text) && i.a(this.color, footer.color) && i.a(this.avatarDetails, footer.avatarDetails);
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final String getColor() {
                return this.color;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iB = B1.a.b(this.text, this.style.hashCode() * 31, 31);
                String str = this.color;
                int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                return iHashCode + (avatarDetails != null ? avatarDetails.hashCode() : 0);
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public String toString() {
                return "Footer(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ", avatarDetails=" + this.avatarDetails + ')';
            }
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class SocialAccount {
            public static final int $stable = 0;

            @b("image_url")
            private final String imageUrl;

            @b("profile_url")
            private final String profileUrl;

            @b("provider")
            private final String provider;

            @b("username")
            private final String username;

            public SocialAccount(String provider, String profileUrl, String imageUrl, String username) {
                i.e(provider, "provider");
                i.e(profileUrl, "profileUrl");
                i.e(imageUrl, "imageUrl");
                i.e(username, "username");
                this.provider = provider;
                this.profileUrl = profileUrl;
                this.imageUrl = imageUrl;
                this.username = username;
            }

            public static /* synthetic */ SocialAccount copy$default(SocialAccount socialAccount, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = socialAccount.provider;
                }
                if ((i10 & 2) != 0) {
                    str2 = socialAccount.profileUrl;
                }
                if ((i10 & 4) != 0) {
                    str3 = socialAccount.imageUrl;
                }
                if ((i10 & 8) != 0) {
                    str4 = socialAccount.username;
                }
                return socialAccount.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.provider;
            }

            public final String component2() {
                return this.profileUrl;
            }

            public final String component3() {
                return this.imageUrl;
            }

            public final String component4() {
                return this.username;
            }

            public final SocialAccount copy(String provider, String profileUrl, String imageUrl, String username) {
                i.e(provider, "provider");
                i.e(profileUrl, "profileUrl");
                i.e(imageUrl, "imageUrl");
                i.e(username, "username");
                return new SocialAccount(provider, profileUrl, imageUrl, username);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SocialAccount)) {
                    return false;
                }
                SocialAccount socialAccount = (SocialAccount) obj;
                return i.a(this.provider, socialAccount.provider) && i.a(this.profileUrl, socialAccount.profileUrl) && i.a(this.imageUrl, socialAccount.imageUrl) && i.a(this.username, socialAccount.username);
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final String getProfileUrl() {
                return this.profileUrl;
            }

            public final String getProvider() {
                return this.provider;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.username.hashCode() + B1.a.b(this.imageUrl, B1.a.b(this.profileUrl, this.provider.hashCode() * 31, 31), 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SocialAccount(provider=");
                sb2.append(this.provider);
                sb2.append(", profileUrl=");
                sb2.append(this.profileUrl);
                sb2.append(", imageUrl=");
                sb2.append(this.imageUrl);
                sb2.append(", username=");
                return B7.b.g(sb2, this.username, ')');
            }
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public enum Style {
            UNKNOWN,
            H1,
            PARAGRAPH,
            GREETING,
            INTRO,
            QUOTE,
            CAPTION;

            private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

            public static a<Style> getEntries() {
                return $ENTRIES;
            }
        }

        public Expanded(AvatarDetails avatarDetails, List<Body> body, List<Footer> footer, List<SocialAccount> socialAccounts, String title) {
            i.e(body, "body");
            i.e(footer, "footer");
            i.e(socialAccounts, "socialAccounts");
            i.e(title, "title");
            this.avatarDetails = avatarDetails;
            this.body = body;
            this.footer = footer;
            this.socialAccounts = socialAccounts;
            this.title = title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Expanded copy$default(Expanded expanded, AvatarDetails avatarDetails, List list, List list2, List list3, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatarDetails = expanded.avatarDetails;
            }
            if ((i10 & 2) != 0) {
                list = expanded.body;
            }
            List list4 = list;
            if ((i10 & 4) != 0) {
                list2 = expanded.footer;
            }
            List list5 = list2;
            if ((i10 & 8) != 0) {
                list3 = expanded.socialAccounts;
            }
            List list6 = list3;
            if ((i10 & 16) != 0) {
                str = expanded.title;
            }
            return expanded.copy(avatarDetails, list4, list5, list6, str);
        }

        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        public final List<Body> component2() {
            return this.body;
        }

        public final List<Footer> component3() {
            return this.footer;
        }

        public final List<SocialAccount> component4() {
            return this.socialAccounts;
        }

        public final String component5() {
            return this.title;
        }

        public final Expanded copy(AvatarDetails avatarDetails, List<Body> body, List<Footer> footer, List<SocialAccount> socialAccounts, String title) {
            i.e(body, "body");
            i.e(footer, "footer");
            i.e(socialAccounts, "socialAccounts");
            i.e(title, "title");
            return new Expanded(avatarDetails, body, footer, socialAccounts, title);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) obj;
            return i.a(this.avatarDetails, expanded.avatarDetails) && i.a(this.body, expanded.body) && i.a(this.footer, expanded.footer) && i.a(this.socialAccounts, expanded.socialAccounts) && i.a(this.title, expanded.title);
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final List<Body> getBody() {
            return this.body;
        }

        public final List<Footer> getFooter() {
            return this.footer;
        }

        public final List<SocialAccount> getSocialAccounts() {
            return this.socialAccounts;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            return this.title.hashCode() + p.d(p.d(p.d((avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31, 31, this.body), 31, this.footer), 31, this.socialAccounts);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Expanded(avatarDetails=");
            sb2.append(this.avatarDetails);
            sb2.append(", body=");
            sb2.append(this.body);
            sb2.append(", footer=");
            sb2.append(this.footer);
            sb2.append(", socialAccounts=");
            sb2.append(this.socialAccounts);
            sb2.append(", title=");
            return B7.b.g(sb2, this.title, ')');
        }
    }

    public Header(String backgroundColor, String backgroundColorDark, String foregroundPrimaryColor, String foregroundPrimaryColorDark, String foregroundSecondaryColor, String foregroundSecondaryColorDark, Collapsed collapsed, boolean z10, Expanded expanded, boolean z11, boolean z12) {
        i.e(backgroundColor, "backgroundColor");
        i.e(backgroundColorDark, "backgroundColorDark");
        i.e(foregroundPrimaryColor, "foregroundPrimaryColor");
        i.e(foregroundPrimaryColorDark, "foregroundPrimaryColorDark");
        i.e(foregroundSecondaryColor, "foregroundSecondaryColor");
        i.e(foregroundSecondaryColorDark, "foregroundSecondaryColorDark");
        i.e(collapsed, "collapsed");
        this.backgroundColor = backgroundColor;
        this.backgroundColorDark = backgroundColorDark;
        this.foregroundPrimaryColor = foregroundPrimaryColor;
        this.foregroundPrimaryColorDark = foregroundPrimaryColorDark;
        this.foregroundSecondaryColor = foregroundSecondaryColor;
        this.foregroundSecondaryColorDark = foregroundSecondaryColorDark;
        this.collapsed = collapsed;
        this.displayActiveIndicator = z10;
        this.expanded = expanded;
        this.useBotHeader = z11;
        this.hideGreeting = z12;
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final boolean component10() {
        return this.useBotHeader;
    }

    public final boolean component11() {
        return this.hideGreeting;
    }

    public final String component2() {
        return this.backgroundColorDark;
    }

    public final String component3() {
        return this.foregroundPrimaryColor;
    }

    public final String component4() {
        return this.foregroundPrimaryColorDark;
    }

    public final String component5() {
        return this.foregroundSecondaryColor;
    }

    public final String component6() {
        return this.foregroundSecondaryColorDark;
    }

    public final Collapsed component7() {
        return this.collapsed;
    }

    public final boolean component8() {
        return this.displayActiveIndicator;
    }

    public final Expanded component9() {
        return this.expanded;
    }

    public final Header copy(String backgroundColor, String backgroundColorDark, String foregroundPrimaryColor, String foregroundPrimaryColorDark, String foregroundSecondaryColor, String foregroundSecondaryColorDark, Collapsed collapsed, boolean z10, Expanded expanded, boolean z11, boolean z12) {
        i.e(backgroundColor, "backgroundColor");
        i.e(backgroundColorDark, "backgroundColorDark");
        i.e(foregroundPrimaryColor, "foregroundPrimaryColor");
        i.e(foregroundPrimaryColorDark, "foregroundPrimaryColorDark");
        i.e(foregroundSecondaryColor, "foregroundSecondaryColor");
        i.e(foregroundSecondaryColorDark, "foregroundSecondaryColorDark");
        i.e(collapsed, "collapsed");
        return new Header(backgroundColor, backgroundColorDark, foregroundPrimaryColor, foregroundPrimaryColorDark, foregroundSecondaryColor, foregroundSecondaryColorDark, collapsed, z10, expanded, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return i.a(this.backgroundColor, header.backgroundColor) && i.a(this.backgroundColorDark, header.backgroundColorDark) && i.a(this.foregroundPrimaryColor, header.foregroundPrimaryColor) && i.a(this.foregroundPrimaryColorDark, header.foregroundPrimaryColorDark) && i.a(this.foregroundSecondaryColor, header.foregroundSecondaryColor) && i.a(this.foregroundSecondaryColorDark, header.foregroundSecondaryColorDark) && i.a(this.collapsed, header.collapsed) && this.displayActiveIndicator == header.displayActiveIndicator && i.a(this.expanded, header.expanded) && this.useBotHeader == header.useBotHeader && this.hideGreeting == header.hideGreeting;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final Collapsed getCollapsed() {
        return this.collapsed;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final Expanded getExpanded() {
        return this.expanded;
    }

    public final String getForegroundPrimaryColor() {
        return this.foregroundPrimaryColor;
    }

    public final String getForegroundPrimaryColorDark() {
        return this.foregroundPrimaryColorDark;
    }

    public final String getForegroundSecondaryColor() {
        return this.foregroundSecondaryColor;
    }

    public final String getForegroundSecondaryColorDark() {
        return this.foregroundSecondaryColorDark;
    }

    public final boolean getHideGreeting() {
        return this.hideGreeting;
    }

    public final boolean getUseBotHeader() {
        return this.useBotHeader;
    }

    public int hashCode() {
        int iB = D.b((this.collapsed.hashCode() + B1.a.b(this.foregroundSecondaryColorDark, B1.a.b(this.foregroundSecondaryColor, B1.a.b(this.foregroundPrimaryColorDark, B1.a.b(this.foregroundPrimaryColor, B1.a.b(this.backgroundColorDark, this.backgroundColor.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31, this.displayActiveIndicator);
        Expanded expanded = this.expanded;
        return Boolean.hashCode(this.hideGreeting) + D.b((iB + (expanded == null ? 0 : expanded.hashCode())) * 31, 31, this.useBotHeader);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Header(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", backgroundColorDark=");
        sb2.append(this.backgroundColorDark);
        sb2.append(", foregroundPrimaryColor=");
        sb2.append(this.foregroundPrimaryColor);
        sb2.append(", foregroundPrimaryColorDark=");
        sb2.append(this.foregroundPrimaryColorDark);
        sb2.append(", foregroundSecondaryColor=");
        sb2.append(this.foregroundSecondaryColor);
        sb2.append(", foregroundSecondaryColorDark=");
        sb2.append(this.foregroundSecondaryColorDark);
        sb2.append(", collapsed=");
        sb2.append(this.collapsed);
        sb2.append(", displayActiveIndicator=");
        sb2.append(this.displayActiveIndicator);
        sb2.append(", expanded=");
        sb2.append(this.expanded);
        sb2.append(", useBotHeader=");
        sb2.append(this.useBotHeader);
        sb2.append(", hideGreeting=");
        return o.d(sb2, this.hideGreeting, ')');
    }
}
