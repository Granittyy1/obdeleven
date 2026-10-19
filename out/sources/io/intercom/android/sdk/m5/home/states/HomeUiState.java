package io.intercom.android.sdk.m5.home.states;

import B1.a;
import B7.b;
import C4.v;
import Z3.o;
import androidx.compose.animation.D;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: HomeUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeUiState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: HomeUiState.kt */
    public static final class Error extends HomeUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final ErrorHeader header;
        private final PoweredBy poweredBy;

        /* JADX INFO: compiled from: HomeUiState.kt */
        public static final class ErrorHeader {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final String foregroundColor;

            public ErrorHeader(String backgroundColor, String foregroundColor) {
                i.e(backgroundColor, "backgroundColor");
                i.e(foregroundColor, "foregroundColor");
                this.backgroundColor = backgroundColor;
                this.foregroundColor = foregroundColor;
            }

            public static /* synthetic */ ErrorHeader copy$default(ErrorHeader errorHeader, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = errorHeader.backgroundColor;
                }
                if ((i10 & 2) != 0) {
                    str2 = errorHeader.foregroundColor;
                }
                return errorHeader.copy(str, str2);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final String component2() {
                return this.foregroundColor;
            }

            public final ErrorHeader copy(String backgroundColor, String foregroundColor) {
                i.e(backgroundColor, "backgroundColor");
                i.e(foregroundColor, "foregroundColor");
                return new ErrorHeader(backgroundColor, foregroundColor);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorHeader)) {
                    return false;
                }
                ErrorHeader errorHeader = (ErrorHeader) obj;
                return i.a(this.backgroundColor, errorHeader.backgroundColor) && i.a(this.foregroundColor, errorHeader.foregroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getForegroundColor() {
                return this.foregroundColor;
            }

            public int hashCode() {
                return this.foregroundColor.hashCode() + (this.backgroundColor.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ErrorHeader(backgroundColor=");
                sb2.append(this.backgroundColor);
                sb2.append(", foregroundColor=");
                return b.g(sb2, this.foregroundColor, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PoweredBy poweredBy, ErrorState errorState, ErrorHeader header) {
            super(null);
            i.e(errorState, "errorState");
            i.e(header, "header");
            this.poweredBy = poweredBy;
            this.errorState = errorState;
            this.header = header;
        }

        public static /* synthetic */ Error copy$default(Error error, PoweredBy poweredBy, ErrorState errorState, ErrorHeader errorHeader, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy = error.poweredBy;
            }
            if ((i10 & 2) != 0) {
                errorState = error.errorState;
            }
            if ((i10 & 4) != 0) {
                errorHeader = error.header;
            }
            return error.copy(poweredBy, errorState, errorHeader);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final ErrorState component2() {
            return this.errorState;
        }

        public final ErrorHeader component3() {
            return this.header;
        }

        public final Error copy(PoweredBy poweredBy, ErrorState errorState, ErrorHeader header) {
            i.e(errorState, "errorState");
            i.e(header, "header");
            return new Error(poweredBy, errorState, header);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return i.a(this.poweredBy, error.poweredBy) && i.a(this.errorState, error.errorState) && i.a(this.header, error.header);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final ErrorHeader getHeader() {
            return this.header;
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            return this.header.hashCode() + ((this.errorState.hashCode() + ((poweredBy == null ? 0 : poweredBy.hashCode()) * 31)) * 31);
        }

        public String toString() {
            return "Error(poweredBy=" + this.poweredBy + ", errorState=" + this.errorState + ", header=" + this.header + ')';
        }
    }

    /* JADX INFO: compiled from: HomeUiState.kt */
    public static final class Loading extends HomeUiState {
        public static final int $stable = 0;
        private final PoweredBy poweredBy;

        public Loading(PoweredBy poweredBy) {
            super(null);
            this.poweredBy = poweredBy;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, PoweredBy poweredBy, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy = loading.poweredBy;
            }
            return loading.copy(poweredBy);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final Loading copy(PoweredBy poweredBy) {
            return new Loading(poweredBy);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && i.a(this.poweredBy, ((Loading) obj).poweredBy);
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            if (poweredBy == null) {
                return 0;
            }
            return poweredBy.hashCode();
        }

        public String toString() {
            return "Loading(poweredBy=" + this.poweredBy + ')';
        }
    }

    public /* synthetic */ HomeUiState(e eVar) {
        this();
    }

    public abstract PoweredBy getPoweredBy();

    private HomeUiState() {
    }

    /* JADX INFO: compiled from: HomeUiState.kt */
    public static final class Content extends HomeUiState {
        public static final int $stable = 8;
        private final List<AvatarWrapper> adminsAvatars;
        private final AvatarWrapper botAvatar;
        private final List<HomeCards> cards;
        private final ContentHeader header;
        private final PoweredBy poweredBy;
        private final boolean teammateAccessEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(PoweredBy poweredBy, List<? extends HomeCards> cards, List<AvatarWrapper> adminsAvatars, AvatarWrapper avatarWrapper, boolean z10, ContentHeader header) {
            super(null);
            i.e(cards, "cards");
            i.e(adminsAvatars, "adminsAvatars");
            i.e(header, "header");
            this.poweredBy = poweredBy;
            this.cards = cards;
            this.adminsAvatars = adminsAvatars;
            this.botAvatar = avatarWrapper;
            this.teammateAccessEnabled = z10;
            this.header = header;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, PoweredBy poweredBy, List list, List list2, AvatarWrapper avatarWrapper, boolean z10, ContentHeader contentHeader, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy = content.poweredBy;
            }
            if ((i10 & 2) != 0) {
                list = content.cards;
            }
            List list3 = list;
            if ((i10 & 4) != 0) {
                list2 = content.adminsAvatars;
            }
            List list4 = list2;
            if ((i10 & 8) != 0) {
                avatarWrapper = content.botAvatar;
            }
            AvatarWrapper avatarWrapper2 = avatarWrapper;
            if ((i10 & 16) != 0) {
                z10 = content.teammateAccessEnabled;
            }
            boolean z11 = z10;
            if ((i10 & 32) != 0) {
                contentHeader = content.header;
            }
            return content.copy(poweredBy, list3, list4, avatarWrapper2, z11, contentHeader);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final List<HomeCards> component2() {
            return this.cards;
        }

        public final List<AvatarWrapper> component3() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper component4() {
            return this.botAvatar;
        }

        public final boolean component5() {
            return this.teammateAccessEnabled;
        }

        public final ContentHeader component6() {
            return this.header;
        }

        public final Content copy(PoweredBy poweredBy, List<? extends HomeCards> cards, List<AvatarWrapper> adminsAvatars, AvatarWrapper avatarWrapper, boolean z10, ContentHeader header) {
            i.e(cards, "cards");
            i.e(adminsAvatars, "adminsAvatars");
            i.e(header, "header");
            return new Content(poweredBy, cards, adminsAvatars, avatarWrapper, z10, header);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return i.a(this.poweredBy, content.poweredBy) && i.a(this.cards, content.cards) && i.a(this.adminsAvatars, content.adminsAvatars) && i.a(this.botAvatar, content.botAvatar) && this.teammateAccessEnabled == content.teammateAccessEnabled && i.a(this.header, content.header);
        }

        public final List<AvatarWrapper> getAdminsAvatars() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper getBotAvatar() {
            return this.botAvatar;
        }

        public final List<HomeCards> getCards() {
            return this.cards;
        }

        public final ContentHeader getHeader() {
            return this.header;
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final boolean getTeammateAccessEnabled() {
            return this.teammateAccessEnabled;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            int iD = p.d(p.d((poweredBy == null ? 0 : poweredBy.hashCode()) * 31, 31, this.cards), 31, this.adminsAvatars);
            AvatarWrapper avatarWrapper = this.botAvatar;
            return this.header.hashCode() + D.b((iD + (avatarWrapper != null ? avatarWrapper.hashCode() : 0)) * 31, 31, this.teammateAccessEnabled);
        }

        public String toString() {
            return "Content(poweredBy=" + this.poweredBy + ", cards=" + this.cards + ", adminsAvatars=" + this.adminsAvatars + ", botAvatar=" + this.botAvatar + ", teammateAccessEnabled=" + this.teammateAccessEnabled + ", header=" + this.header + ')';
        }

        /* JADX INFO: compiled from: HomeUiState.kt */
        public static final class ContentHeader {
            public static final int $stable = 8;
            private final List<AvatarWrapper> adminsAvatars;
            private final CloseButtonColor closeButtonColor;
            private final ColoredText greeting;
            private final HeaderBackdropStyle headerBackdropStyle;
            private final HeaderBackdropStyle headerBackdropStyleDark;
            private final ColoredText intro;
            private final String logoDarkUrl;
            private final String logoUrl;
            private final boolean showAvatars;
            private final boolean showLogo;

            /* JADX INFO: compiled from: HomeUiState.kt */
            public static abstract class HeaderBackdropStyle {
                public static final int $stable = 0;

                /* JADX INFO: compiled from: HomeUiState.kt */
                public static final class Gradient extends HeaderBackdropStyle {
                    public static final int $stable = 8;
                    private final List<H> colors;
                    private final boolean fade;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Gradient(List<H> colors, boolean z10) {
                        super(null);
                        i.e(colors, "colors");
                        this.colors = colors;
                        this.fade = z10;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            list = gradient.colors;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = gradient.fade;
                        }
                        return gradient.copy(list, z10);
                    }

                    public final List<H> component1() {
                        return this.colors;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    public final Gradient copy(List<H> colors, boolean z10) {
                        i.e(colors, "colors");
                        return new Gradient(colors, z10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Gradient)) {
                            return false;
                        }
                        Gradient gradient = (Gradient) obj;
                        return i.a(this.colors, gradient.colors) && this.fade == gradient.fade;
                    }

                    public final List<H> getColors() {
                        return this.colors;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        return Boolean.hashCode(this.fade) + (this.colors.hashCode() * 31);
                    }

                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("Gradient(colors=");
                        sb2.append(this.colors);
                        sb2.append(", fade=");
                        return o.d(sb2, this.fade, ')');
                    }
                }

                /* JADX INFO: compiled from: HomeUiState.kt */
                public static final class Image extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final boolean fade;
                    private final long fallbackColor;
                    private final String imageUrl;

                    public /* synthetic */ Image(long j, String str, boolean z10, e eVar) {
                        this(j, str, z10);
                    }

                    /* JADX INFO: renamed from: copy-ek8zF_U$default, reason: not valid java name */
                    public static /* synthetic */ Image m291copyek8zF_U$default(Image image, long j, String str, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            j = image.fallbackColor;
                        }
                        if ((i10 & 2) != 0) {
                            str = image.imageUrl;
                        }
                        if ((i10 & 4) != 0) {
                            z10 = image.fade;
                        }
                        return image.m293copyek8zF_U(j, str, z10);
                    }

                    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
                    public final long m292component10d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String component2() {
                        return this.imageUrl;
                    }

                    public final boolean component3() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: copy-ek8zF_U, reason: not valid java name */
                    public final Image m293copyek8zF_U(long j, String str, boolean z10) {
                        return new Image(j, str, z10, null);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Image)) {
                            return false;
                        }
                        Image image = (Image) obj;
                        return H.c(this.fallbackColor, image.fallbackColor) && i.a(this.imageUrl, image.imageUrl) && this.fade == image.fade;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: getFallbackColor-0d7_KjU, reason: not valid java name */
                    public final long m294getFallbackColor0d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String getImageUrl() {
                        return this.imageUrl;
                    }

                    public int hashCode() {
                        long j = this.fallbackColor;
                        int i10 = H.f13505m;
                        int iHashCode = Long.hashCode(j) * 31;
                        String str = this.imageUrl;
                        return Boolean.hashCode(this.fade) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                    }

                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("Image(fallbackColor=");
                        v.h(this.fallbackColor, ", imageUrl=", sb2);
                        sb2.append(this.imageUrl);
                        sb2.append(", fade=");
                        return o.d(sb2, this.fade, ')');
                    }

                    private Image(long j, String str, boolean z10) {
                        super(null);
                        this.fallbackColor = j;
                        this.imageUrl = str;
                        this.fade = z10;
                    }
                }

                /* JADX INFO: compiled from: HomeUiState.kt */
                public static final class Solid extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final long color;
                    private final boolean fade;

                    public /* synthetic */ Solid(long j, boolean z10, e eVar) {
                        this(j, z10);
                    }

                    /* JADX INFO: renamed from: copy-DxMtmZc$default, reason: not valid java name */
                    public static /* synthetic */ Solid m295copyDxMtmZc$default(Solid solid, long j, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            j = solid.color;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = solid.fade;
                        }
                        return solid.m297copyDxMtmZc(j, z10);
                    }

                    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
                    public final long m296component10d7_KjU() {
                        return this.color;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: copy-DxMtmZc, reason: not valid java name */
                    public final Solid m297copyDxMtmZc(long j, boolean z10) {
                        return new Solid(j, z10, null);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Solid)) {
                            return false;
                        }
                        Solid solid = (Solid) obj;
                        return H.c(this.color, solid.color) && this.fade == solid.fade;
                    }

                    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
                    public final long m298getColor0d7_KjU() {
                        return this.color;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        long j = this.color;
                        int i10 = H.f13505m;
                        return Boolean.hashCode(this.fade) + (Long.hashCode(j) * 31);
                    }

                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("Solid(color=");
                        v.h(this.color, ", fade=", sb2);
                        return o.d(sb2, this.fade, ')');
                    }

                    private Solid(long j, boolean z10) {
                        super(null);
                        this.color = j;
                        this.fade = z10;
                    }
                }

                public /* synthetic */ HeaderBackdropStyle(e eVar) {
                    this();
                }

                public abstract boolean getFade();

                private HeaderBackdropStyle() {
                }
            }

            public ContentHeader(boolean z10, String str, String str2, ColoredText greeting, ColoredText intro, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List<AvatarWrapper> adminsAvatars, CloseButtonColor closeButtonColor) {
                i.e(greeting, "greeting");
                i.e(intro, "intro");
                i.e(headerBackdropStyle, "headerBackdropStyle");
                i.e(adminsAvatars, "adminsAvatars");
                i.e(closeButtonColor, "closeButtonColor");
                this.showLogo = z10;
                this.logoUrl = str;
                this.logoDarkUrl = str2;
                this.greeting = greeting;
                this.intro = intro;
                this.headerBackdropStyle = headerBackdropStyle;
                this.headerBackdropStyleDark = headerBackdropStyle2;
                this.showAvatars = z11;
                this.adminsAvatars = adminsAvatars;
                this.closeButtonColor = closeButtonColor;
            }

            public final boolean component1() {
                return this.showLogo;
            }

            public final CloseButtonColor component10() {
                return this.closeButtonColor;
            }

            public final String component2() {
                return this.logoUrl;
            }

            public final String component3() {
                return this.logoDarkUrl;
            }

            public final ColoredText component4() {
                return this.greeting;
            }

            public final ColoredText component5() {
                return this.intro;
            }

            public final HeaderBackdropStyle component6() {
                return this.headerBackdropStyle;
            }

            public final HeaderBackdropStyle component7() {
                return this.headerBackdropStyleDark;
            }

            public final boolean component8() {
                return this.showAvatars;
            }

            public final List<AvatarWrapper> component9() {
                return this.adminsAvatars;
            }

            public final ContentHeader copy(boolean z10, String str, String str2, ColoredText greeting, ColoredText intro, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List<AvatarWrapper> adminsAvatars, CloseButtonColor closeButtonColor) {
                i.e(greeting, "greeting");
                i.e(intro, "intro");
                i.e(headerBackdropStyle, "headerBackdropStyle");
                i.e(adminsAvatars, "adminsAvatars");
                i.e(closeButtonColor, "closeButtonColor");
                return new ContentHeader(z10, str, str2, greeting, intro, headerBackdropStyle, headerBackdropStyle2, z11, adminsAvatars, closeButtonColor);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentHeader)) {
                    return false;
                }
                ContentHeader contentHeader = (ContentHeader) obj;
                return this.showLogo == contentHeader.showLogo && i.a(this.logoUrl, contentHeader.logoUrl) && i.a(this.logoDarkUrl, contentHeader.logoDarkUrl) && i.a(this.greeting, contentHeader.greeting) && i.a(this.intro, contentHeader.intro) && i.a(this.headerBackdropStyle, contentHeader.headerBackdropStyle) && i.a(this.headerBackdropStyleDark, contentHeader.headerBackdropStyleDark) && this.showAvatars == contentHeader.showAvatars && i.a(this.adminsAvatars, contentHeader.adminsAvatars) && i.a(this.closeButtonColor, contentHeader.closeButtonColor);
            }

            public final List<AvatarWrapper> getAdminsAvatars() {
                return this.adminsAvatars;
            }

            public final CloseButtonColor getCloseButtonColor() {
                return this.closeButtonColor;
            }

            public final ColoredText getGreeting() {
                return this.greeting;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyle() {
                return this.headerBackdropStyle;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyleDark() {
                return this.headerBackdropStyleDark;
            }

            public final ColoredText getIntro() {
                return this.intro;
            }

            public final String getLogoDarkUrl() {
                return this.logoDarkUrl;
            }

            public final String getLogoUrl() {
                return this.logoUrl;
            }

            public final boolean getShowAvatars() {
                return this.showAvatars;
            }

            public final boolean getShowLogo() {
                return this.showLogo;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.showLogo) * 31;
                String str = this.logoUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.logoDarkUrl;
                int iHashCode3 = (this.headerBackdropStyle.hashCode() + ((this.intro.hashCode() + ((this.greeting.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
                HeaderBackdropStyle headerBackdropStyle = this.headerBackdropStyleDark;
                return this.closeButtonColor.hashCode() + p.d(D.b((iHashCode3 + (headerBackdropStyle != null ? headerBackdropStyle.hashCode() : 0)) * 31, 31, this.showAvatars), 31, this.adminsAvatars);
            }

            public String toString() {
                return "ContentHeader(showLogo=" + this.showLogo + ", logoUrl=" + this.logoUrl + ", logoDarkUrl=" + this.logoDarkUrl + ", greeting=" + this.greeting + ", intro=" + this.intro + ", headerBackdropStyle=" + this.headerBackdropStyle + ", headerBackdropStyleDark=" + this.headerBackdropStyleDark + ", showAvatars=" + this.showAvatars + ", adminsAvatars=" + this.adminsAvatars + ", closeButtonColor=" + this.closeButtonColor + ')';
            }

            /* JADX INFO: compiled from: HomeUiState.kt */
            public static final class CloseButtonColor {
                public static final int $stable = 0;
                private final String backgroundColor;
                private final float backgroundOpacity;
                private final String foregroundColor;
                private final String foregroundColorDark;

                public CloseButtonColor(String backgroundColor, String foregroundColor, String str, float f10) {
                    i.e(backgroundColor, "backgroundColor");
                    i.e(foregroundColor, "foregroundColor");
                    this.backgroundColor = backgroundColor;
                    this.foregroundColor = foregroundColor;
                    this.foregroundColorDark = str;
                    this.backgroundOpacity = f10;
                }

                public static /* synthetic */ CloseButtonColor copy$default(CloseButtonColor closeButtonColor, String str, String str2, String str3, float f10, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = closeButtonColor.backgroundColor;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = closeButtonColor.foregroundColor;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = closeButtonColor.foregroundColorDark;
                    }
                    if ((i10 & 8) != 0) {
                        f10 = closeButtonColor.backgroundOpacity;
                    }
                    return closeButtonColor.copy(str, str2, str3, f10);
                }

                public final String component1() {
                    return this.backgroundColor;
                }

                public final String component2() {
                    return this.foregroundColor;
                }

                public final String component3() {
                    return this.foregroundColorDark;
                }

                public final float component4() {
                    return this.backgroundOpacity;
                }

                public final CloseButtonColor copy(String backgroundColor, String foregroundColor, String str, float f10) {
                    i.e(backgroundColor, "backgroundColor");
                    i.e(foregroundColor, "foregroundColor");
                    return new CloseButtonColor(backgroundColor, foregroundColor, str, f10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CloseButtonColor)) {
                        return false;
                    }
                    CloseButtonColor closeButtonColor = (CloseButtonColor) obj;
                    return i.a(this.backgroundColor, closeButtonColor.backgroundColor) && i.a(this.foregroundColor, closeButtonColor.foregroundColor) && i.a(this.foregroundColorDark, closeButtonColor.foregroundColorDark) && Float.compare(this.backgroundOpacity, closeButtonColor.backgroundOpacity) == 0;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final float getBackgroundOpacity() {
                    return this.backgroundOpacity;
                }

                public final String getForegroundColor() {
                    return this.foregroundColor;
                }

                public final String getForegroundColorDark() {
                    return this.foregroundColorDark;
                }

                public int hashCode() {
                    int iB = a.b(this.foregroundColor, this.backgroundColor.hashCode() * 31, 31);
                    String str = this.foregroundColorDark;
                    return Float.hashCode(this.backgroundOpacity) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("CloseButtonColor(backgroundColor=");
                    sb2.append(this.backgroundColor);
                    sb2.append(", foregroundColor=");
                    sb2.append(this.foregroundColor);
                    sb2.append(", foregroundColorDark=");
                    sb2.append(this.foregroundColorDark);
                    sb2.append(", backgroundOpacity=");
                    return b.d(sb2, this.backgroundOpacity, ')');
                }

                public /* synthetic */ CloseButtonColor(String str, String str2, String str3, float f10, int i10, e eVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3, f10);
                }
            }

            /* JADX INFO: compiled from: HomeUiState.kt */
            public static final class ColoredText {
                public static final int $stable = 0;
                private final float opacity;
                private final String text;
                private final String textColorDark;
                private final String textColorLight;
                private final String textColorType;
                private final String textColorTypeDark;

                public ColoredText(String text, float f10, String str, String str2, String str3, String textColorLight) {
                    i.e(text, "text");
                    i.e(textColorLight, "textColorLight");
                    this.text = text;
                    this.opacity = f10;
                    this.textColorType = str;
                    this.textColorTypeDark = str2;
                    this.textColorDark = str3;
                    this.textColorLight = textColorLight;
                }

                public static /* synthetic */ ColoredText copy$default(ColoredText coloredText, String str, float f10, String str2, String str3, String str4, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = coloredText.text;
                    }
                    if ((i10 & 2) != 0) {
                        f10 = coloredText.opacity;
                    }
                    float f11 = f10;
                    if ((i10 & 4) != 0) {
                        str2 = coloredText.textColorType;
                    }
                    String str6 = str2;
                    if ((i10 & 8) != 0) {
                        str3 = coloredText.textColorTypeDark;
                    }
                    String str7 = str3;
                    if ((i10 & 16) != 0) {
                        str4 = coloredText.textColorDark;
                    }
                    String str8 = str4;
                    if ((i10 & 32) != 0) {
                        str5 = coloredText.textColorLight;
                    }
                    return coloredText.copy(str, f11, str6, str7, str8, str5);
                }

                public final String component1() {
                    return this.text;
                }

                public final float component2() {
                    return this.opacity;
                }

                public final String component3() {
                    return this.textColorType;
                }

                public final String component4() {
                    return this.textColorTypeDark;
                }

                public final String component5() {
                    return this.textColorDark;
                }

                public final String component6() {
                    return this.textColorLight;
                }

                public final ColoredText copy(String text, float f10, String str, String str2, String str3, String textColorLight) {
                    i.e(text, "text");
                    i.e(textColorLight, "textColorLight");
                    return new ColoredText(text, f10, str, str2, str3, textColorLight);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ColoredText)) {
                        return false;
                    }
                    ColoredText coloredText = (ColoredText) obj;
                    return i.a(this.text, coloredText.text) && Float.compare(this.opacity, coloredText.opacity) == 0 && i.a(this.textColorType, coloredText.textColorType) && i.a(this.textColorTypeDark, coloredText.textColorTypeDark) && i.a(this.textColorDark, coloredText.textColorDark) && i.a(this.textColorLight, coloredText.textColorLight);
                }

                public final float getOpacity() {
                    return this.opacity;
                }

                public final String getText() {
                    return this.text;
                }

                public final String getTextColorDark() {
                    return this.textColorDark;
                }

                public final String getTextColorLight() {
                    return this.textColorLight;
                }

                public final String getTextColorType() {
                    return this.textColorType;
                }

                public final String getTextColorTypeDark() {
                    return this.textColorTypeDark;
                }

                public int hashCode() {
                    int iD = O.a.d(this.opacity, this.text.hashCode() * 31, 31);
                    String str = this.textColorType;
                    int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.textColorTypeDark;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.textColorDark;
                    return this.textColorLight.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("ColoredText(text=");
                    sb2.append(this.text);
                    sb2.append(", opacity=");
                    sb2.append(this.opacity);
                    sb2.append(", textColorType=");
                    sb2.append(this.textColorType);
                    sb2.append(", textColorTypeDark=");
                    sb2.append(this.textColorTypeDark);
                    sb2.append(", textColorDark=");
                    sb2.append(this.textColorDark);
                    sb2.append(", textColorLight=");
                    return b.g(sb2, this.textColorLight, ')');
                }

                public /* synthetic */ ColoredText(String str, float f10, String str2, String str3, String str4, String str5, int i10, e eVar) {
                    this(str, f10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, str5);
                }
            }

            public /* synthetic */ ContentHeader(boolean z10, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List list, CloseButtonColor closeButtonColor, int i10, e eVar) {
                this(z10, str, (i10 & 4) != 0 ? null : str2, coloredText, coloredText2, headerBackdropStyle, (i10 & 64) != 0 ? null : headerBackdropStyle2, z11, list, closeButtonColor);
            }
        }
    }
}
