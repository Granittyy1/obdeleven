package io.intercom.android.sdk.models;

import I7.b;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderContentModel {
    public static final int $stable = 0;

    @b("close_button")
    private final CloseButtonModel closeButton;

    @b("greeting")
    private final HeaderTextModel greeting;

    @b("introduction")
    private final HeaderTextModel intro;

    @b("logo_dark_url")
    private final String logoDarkUrl;

    @b("logo_url")
    private final String logoUrl;

    @b("show_avatars")
    private final boolean showAvatars;

    @b("text_color_type")
    private final String textColorType;

    @b("text_color_type_dark")
    private final String textColorTypeDark;

    public HeaderContentModel() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }

    public final String component1() {
        return this.logoUrl;
    }

    public final String component2() {
        return this.logoDarkUrl;
    }

    public final boolean component3() {
        return this.showAvatars;
    }

    public final HeaderTextModel component4() {
        return this.greeting;
    }

    public final HeaderTextModel component5() {
        return this.intro;
    }

    public final CloseButtonModel component6() {
        return this.closeButton;
    }

    public final String component7() {
        return this.textColorType;
    }

    public final String component8() {
        return this.textColorTypeDark;
    }

    public final HeaderContentModel copy(String logoUrl, String str, boolean z10, HeaderTextModel greeting, HeaderTextModel intro, CloseButtonModel closeButton, String str2, String str3) {
        i.e(logoUrl, "logoUrl");
        i.e(greeting, "greeting");
        i.e(intro, "intro");
        i.e(closeButton, "closeButton");
        return new HeaderContentModel(logoUrl, str, z10, greeting, intro, closeButton, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderContentModel)) {
            return false;
        }
        HeaderContentModel headerContentModel = (HeaderContentModel) obj;
        return i.a(this.logoUrl, headerContentModel.logoUrl) && i.a(this.logoDarkUrl, headerContentModel.logoDarkUrl) && this.showAvatars == headerContentModel.showAvatars && i.a(this.greeting, headerContentModel.greeting) && i.a(this.intro, headerContentModel.intro) && i.a(this.closeButton, headerContentModel.closeButton) && i.a(this.textColorType, headerContentModel.textColorType) && i.a(this.textColorTypeDark, headerContentModel.textColorTypeDark);
    }

    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    public final HeaderTextModel getIntro() {
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

    public final String getTextColorType() {
        return this.textColorType;
    }

    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }

    public int hashCode() {
        int iHashCode = this.logoUrl.hashCode() * 31;
        String str = this.logoDarkUrl;
        int iHashCode2 = (this.closeButton.hashCode() + ((this.intro.hashCode() + ((this.greeting.hashCode() + D.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showAvatars)) * 31)) * 31)) * 31;
        String str2 = this.textColorType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColorTypeDark;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderContentModel(logoUrl=");
        sb2.append(this.logoUrl);
        sb2.append(", logoDarkUrl=");
        sb2.append(this.logoDarkUrl);
        sb2.append(", showAvatars=");
        sb2.append(this.showAvatars);
        sb2.append(", greeting=");
        sb2.append(this.greeting);
        sb2.append(", intro=");
        sb2.append(this.intro);
        sb2.append(", closeButton=");
        sb2.append(this.closeButton);
        sb2.append(", textColorType=");
        sb2.append(this.textColorType);
        sb2.append(", textColorTypeDark=");
        return B7.b.g(sb2, this.textColorTypeDark, ')');
    }

    public HeaderContentModel(String logoUrl, String str, boolean z10, HeaderTextModel greeting, HeaderTextModel intro, CloseButtonModel closeButton, String str2, String str3) {
        i.e(logoUrl, "logoUrl");
        i.e(greeting, "greeting");
        i.e(intro, "intro");
        i.e(closeButton, "closeButton");
        this.logoUrl = logoUrl;
        this.logoDarkUrl = str;
        this.showAvatars = z10;
        this.greeting = greeting;
        this.intro = intro;
        this.closeButton = closeButton;
        this.textColorType = str2;
        this.textColorTypeDark = str3;
    }

    public /* synthetic */ HeaderContentModel(String str, String str2, boolean z10, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel, (i10 & 16) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel2, (i10 & 32) != 0 ? new CloseButtonModel(null, 0.0f, null, 7, null) : closeButtonModel, (i10 & 64) != 0 ? null : str3, (i10 & 128) == 0 ? str4 : null);
    }
}
