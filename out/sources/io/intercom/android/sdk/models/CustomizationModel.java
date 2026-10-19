package io.intercom.android.sdk.models;

import A1.C0575j;
import B1.a;
import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomizationModel {
    public static final int $stable = 0;

    @b("action")
    private final CustomizationColorsModel action;

    @b("action_contrast_dark")
    private final CustomizationColorsModel actionContrastDark;

    @b("action_contrast_white")
    private final CustomizationColorsModel actionContrastWhite;

    @b("alignment")
    private final String alignment;

    @b("brand_name")
    private final String brandName;

    @b("header")
    private final CustomizationColorsModel header;

    @b("horizontal_padding")
    private final int horizontalPadding;

    @b("launcher_logo_dark_url")
    private final String launcherLogoDarkUrl;

    @b("launcher_logo_url")
    private final String launcherLogoUrl;

    @b("messenger_wallpaper")
    private final String messengerWallpaper;

    @b("theme_mode")
    private final String themeMode;

    @b("vertical_padding")
    private final int verticalPadding;

    public CustomizationModel(CustomizationColorsModel action, CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, String alignment, String brandName, CustomizationColorsModel header, int i10, String str, String str2, String messengerWallpaper, String str3, int i11) {
        i.e(action, "action");
        i.e(alignment, "alignment");
        i.e(brandName, "brandName");
        i.e(header, "header");
        i.e(messengerWallpaper, "messengerWallpaper");
        this.action = action;
        this.actionContrastWhite = customizationColorsModel;
        this.actionContrastDark = customizationColorsModel2;
        this.alignment = alignment;
        this.brandName = brandName;
        this.header = header;
        this.horizontalPadding = i10;
        this.launcherLogoUrl = str;
        this.launcherLogoDarkUrl = str2;
        this.messengerWallpaper = messengerWallpaper;
        this.themeMode = str3;
        this.verticalPadding = i11;
    }

    public final CustomizationColorsModel component1() {
        return this.action;
    }

    public final String component10() {
        return this.messengerWallpaper;
    }

    public final String component11() {
        return this.themeMode;
    }

    public final int component12() {
        return this.verticalPadding;
    }

    public final CustomizationColorsModel component2() {
        return this.actionContrastWhite;
    }

    public final CustomizationColorsModel component3() {
        return this.actionContrastDark;
    }

    public final String component4() {
        return this.alignment;
    }

    public final String component5() {
        return this.brandName;
    }

    public final CustomizationColorsModel component6() {
        return this.header;
    }

    public final int component7() {
        return this.horizontalPadding;
    }

    public final String component8() {
        return this.launcherLogoUrl;
    }

    public final String component9() {
        return this.launcherLogoDarkUrl;
    }

    public final CustomizationModel copy(CustomizationColorsModel action, CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, String alignment, String brandName, CustomizationColorsModel header, int i10, String str, String str2, String messengerWallpaper, String str3, int i11) {
        i.e(action, "action");
        i.e(alignment, "alignment");
        i.e(brandName, "brandName");
        i.e(header, "header");
        i.e(messengerWallpaper, "messengerWallpaper");
        return new CustomizationModel(action, customizationColorsModel, customizationColorsModel2, alignment, brandName, header, i10, str, str2, messengerWallpaper, str3, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationModel)) {
            return false;
        }
        CustomizationModel customizationModel = (CustomizationModel) obj;
        return i.a(this.action, customizationModel.action) && i.a(this.actionContrastWhite, customizationModel.actionContrastWhite) && i.a(this.actionContrastDark, customizationModel.actionContrastDark) && i.a(this.alignment, customizationModel.alignment) && i.a(this.brandName, customizationModel.brandName) && i.a(this.header, customizationModel.header) && this.horizontalPadding == customizationModel.horizontalPadding && i.a(this.launcherLogoUrl, customizationModel.launcherLogoUrl) && i.a(this.launcherLogoDarkUrl, customizationModel.launcherLogoDarkUrl) && i.a(this.messengerWallpaper, customizationModel.messengerWallpaper) && i.a(this.themeMode, customizationModel.themeMode) && this.verticalPadding == customizationModel.verticalPadding;
    }

    public final CustomizationColorsModel getAction() {
        return this.action;
    }

    public final CustomizationColorsModel getActionContrastDark() {
        return this.actionContrastDark;
    }

    public final CustomizationColorsModel getActionContrastWhite() {
        return this.actionContrastWhite;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final CustomizationColorsModel getHeader() {
        return this.header;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final String getLauncherLogoDarkUrl() {
        return this.launcherLogoDarkUrl;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getMessengerWallpaper() {
        return this.messengerWallpaper;
    }

    public final String getThemeMode() {
        return this.themeMode;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        CustomizationColorsModel customizationColorsModel = this.actionContrastWhite;
        int iHashCode2 = (iHashCode + (customizationColorsModel == null ? 0 : customizationColorsModel.hashCode())) * 31;
        CustomizationColorsModel customizationColorsModel2 = this.actionContrastDark;
        int iB = q.b(this.horizontalPadding, (this.header.hashCode() + a.b(this.brandName, a.b(this.alignment, (iHashCode2 + (customizationColorsModel2 == null ? 0 : customizationColorsModel2.hashCode())) * 31, 31), 31)) * 31, 31);
        String str = this.launcherLogoUrl;
        int iHashCode3 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.launcherLogoDarkUrl;
        int iB2 = a.b(this.messengerWallpaper, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.themeMode;
        return Integer.hashCode(this.verticalPadding) + ((iB2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomizationModel(action=");
        sb2.append(this.action);
        sb2.append(", actionContrastWhite=");
        sb2.append(this.actionContrastWhite);
        sb2.append(", actionContrastDark=");
        sb2.append(this.actionContrastDark);
        sb2.append(", alignment=");
        sb2.append(this.alignment);
        sb2.append(", brandName=");
        sb2.append(this.brandName);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", horizontalPadding=");
        sb2.append(this.horizontalPadding);
        sb2.append(", launcherLogoUrl=");
        sb2.append(this.launcherLogoUrl);
        sb2.append(", launcherLogoDarkUrl=");
        sb2.append(this.launcherLogoDarkUrl);
        sb2.append(", messengerWallpaper=");
        sb2.append(this.messengerWallpaper);
        sb2.append(", themeMode=");
        sb2.append(this.themeMode);
        sb2.append(", verticalPadding=");
        return C0575j.b(sb2, this.verticalPadding, ')');
    }

    public /* synthetic */ CustomizationModel(CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i10, String str3, String str4, String str5, String str6, int i11, int i12, e eVar) {
        this(customizationColorsModel, customizationColorsModel2, (i12 & 4) != 0 ? null : customizationColorsModel3, str, str2, customizationColorsModel4, i10, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : str4, str5, (i12 & 1024) != 0 ? null : str6, i11);
    }
}
