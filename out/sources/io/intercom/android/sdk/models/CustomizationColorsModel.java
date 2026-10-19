package io.intercom.android.sdk.models;

import B1.a;
import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomizationColorsModel {
    public static final int $stable = 0;

    @b("background_color")
    private final String backgroundColor;

    @b("background_color_dark")
    private final String backgroundColorDark;

    @b("foreground_color")
    private final String foregroundColor;

    @b("foreground_color_dark")
    private final String foregroundColorDark;

    @b("foreground_color_low_contrast")
    private final String foregroundLowContrastColor;

    @b("foreground_color_low_contrast_dark")
    private final String foregroundLowContrastColorDark;

    public CustomizationColorsModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CustomizationColorsModel copy$default(CustomizationColorsModel customizationColorsModel, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customizationColorsModel.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = customizationColorsModel.foregroundColor;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = customizationColorsModel.foregroundLowContrastColor;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = customizationColorsModel.backgroundColorDark;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = customizationColorsModel.foregroundColorDark;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = customizationColorsModel.foregroundLowContrastColorDark;
        }
        return customizationColorsModel.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.foregroundColor;
    }

    public final String component3() {
        return this.foregroundLowContrastColor;
    }

    public final String component4() {
        return this.backgroundColorDark;
    }

    public final String component5() {
        return this.foregroundColorDark;
    }

    public final String component6() {
        return this.foregroundLowContrastColorDark;
    }

    public final CustomizationColorsModel copy(String backgroundColor, String foregroundColor, String foregroundLowContrastColor, String str, String str2, String str3) {
        i.e(backgroundColor, "backgroundColor");
        i.e(foregroundColor, "foregroundColor");
        i.e(foregroundLowContrastColor, "foregroundLowContrastColor");
        return new CustomizationColorsModel(backgroundColor, foregroundColor, foregroundLowContrastColor, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationColorsModel)) {
            return false;
        }
        CustomizationColorsModel customizationColorsModel = (CustomizationColorsModel) obj;
        return i.a(this.backgroundColor, customizationColorsModel.backgroundColor) && i.a(this.foregroundColor, customizationColorsModel.foregroundColor) && i.a(this.foregroundLowContrastColor, customizationColorsModel.foregroundLowContrastColor) && i.a(this.backgroundColorDark, customizationColorsModel.backgroundColorDark) && i.a(this.foregroundColorDark, customizationColorsModel.foregroundColorDark) && i.a(this.foregroundLowContrastColorDark, customizationColorsModel.foregroundLowContrastColorDark);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getForegroundColorDark() {
        return this.foregroundColorDark;
    }

    public final String getForegroundLowContrastColor() {
        return this.foregroundLowContrastColor;
    }

    public final String getForegroundLowContrastColorDark() {
        return this.foregroundLowContrastColorDark;
    }

    public int hashCode() {
        int iB = a.b(this.foregroundLowContrastColor, a.b(this.foregroundColor, this.backgroundColor.hashCode() * 31, 31), 31);
        String str = this.backgroundColorDark;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.foregroundColorDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foregroundLowContrastColorDark;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomizationColorsModel(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", foregroundColor=");
        sb2.append(this.foregroundColor);
        sb2.append(", foregroundLowContrastColor=");
        sb2.append(this.foregroundLowContrastColor);
        sb2.append(", backgroundColorDark=");
        sb2.append(this.backgroundColorDark);
        sb2.append(", foregroundColorDark=");
        sb2.append(this.foregroundColorDark);
        sb2.append(", foregroundLowContrastColorDark=");
        return B7.b.g(sb2, this.foregroundLowContrastColorDark, ')');
    }

    public CustomizationColorsModel(String backgroundColor, String foregroundColor, String foregroundLowContrastColor, String str, String str2, String str3) {
        i.e(backgroundColor, "backgroundColor");
        i.e(foregroundColor, "foregroundColor");
        i.e(foregroundLowContrastColor, "foregroundLowContrastColor");
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.foregroundLowContrastColor = foregroundLowContrastColor;
        this.backgroundColorDark = str;
        this.foregroundColorDark = str2;
        this.foregroundLowContrastColorDark = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomizationColorsModel(String str, String str2, String str3, String str4, String str5, String str6, int i10, e eVar) {
        str = (i10 & 1) != 0 ? "#FFFFFF" : str;
        String str7 = (i10 & 2) != 0 ? "#000000" : str2;
        this(str, str7, (i10 & 4) != 0 ? str7 : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }
}
