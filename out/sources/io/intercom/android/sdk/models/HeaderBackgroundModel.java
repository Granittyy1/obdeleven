package io.intercom.android.sdk.models;

import I7.b;
import Z3.o;
import androidx.compose.animation.D;
import com.braze.models.FeatureFlag;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderBackgroundModel {
    public static final int $stable = 8;

    @b("color")
    private final String color;

    @b("color_dark")
    private final String colorDark;

    @b(FeatureFlag.ENABLED)
    private final boolean enabled;

    @b("fade_to_white")
    private final boolean fade;

    @b("fade_to_dark")
    private final Boolean fadeToDark;

    @b("gradient")
    private final List<String> gradient;

    @b("gradient_dark")
    private final List<String> gradientDark;

    @b("image_dark_url")
    private final String imageDarkUrl;

    @b("image_url")
    private final String imageUrl;

    @b("type")
    private final HeaderBackdropType type;

    @b("type_dark")
    private final HeaderBackdropType typeDark;

    public HeaderBackgroundModel() {
        this(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
    }

    public final String component1() {
        return this.color;
    }

    public final HeaderBackdropType component10() {
        return this.typeDark;
    }

    public final boolean component11() {
        return this.enabled;
    }

    public final String component2() {
        return this.colorDark;
    }

    public final List<String> component3() {
        return this.gradient;
    }

    public final List<String> component4() {
        return this.gradientDark;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final String component6() {
        return this.imageDarkUrl;
    }

    public final boolean component7() {
        return this.fade;
    }

    public final Boolean component8() {
        return this.fadeToDark;
    }

    public final HeaderBackdropType component9() {
        return this.type;
    }

    public final HeaderBackgroundModel copy(String color, String str, List<String> list, List<String> list2, String str2, String str3, boolean z10, Boolean bool, HeaderBackdropType type, HeaderBackdropType headerBackdropType, boolean z11) {
        i.e(color, "color");
        i.e(type, "type");
        return new HeaderBackgroundModel(color, str, list, list2, str2, str3, z10, bool, type, headerBackdropType, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBackgroundModel)) {
            return false;
        }
        HeaderBackgroundModel headerBackgroundModel = (HeaderBackgroundModel) obj;
        return i.a(this.color, headerBackgroundModel.color) && i.a(this.colorDark, headerBackgroundModel.colorDark) && i.a(this.gradient, headerBackgroundModel.gradient) && i.a(this.gradientDark, headerBackgroundModel.gradientDark) && i.a(this.imageUrl, headerBackgroundModel.imageUrl) && i.a(this.imageDarkUrl, headerBackgroundModel.imageDarkUrl) && this.fade == headerBackgroundModel.fade && i.a(this.fadeToDark, headerBackgroundModel.fadeToDark) && this.type == headerBackgroundModel.type && this.typeDark == headerBackgroundModel.typeDark && this.enabled == headerBackgroundModel.enabled;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorDark() {
        return this.colorDark;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFade() {
        return this.fade;
    }

    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    public final List<String> getGradient() {
        return this.gradient;
    }

    public final List<String> getGradientDark() {
        return this.gradientDark;
    }

    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final HeaderBackdropType getType() {
        return this.type;
    }

    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        String str = this.colorDark;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.gradient;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.gradientDark;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageDarkUrl;
        int iB = D.b((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.fade);
        Boolean bool = this.fadeToDark;
        int iHashCode6 = (this.type.hashCode() + ((iB + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        HeaderBackdropType headerBackdropType = this.typeDark;
        return Boolean.hashCode(this.enabled) + ((iHashCode6 + (headerBackdropType != null ? headerBackdropType.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderBackgroundModel(color=");
        sb2.append(this.color);
        sb2.append(", colorDark=");
        sb2.append(this.colorDark);
        sb2.append(", gradient=");
        sb2.append(this.gradient);
        sb2.append(", gradientDark=");
        sb2.append(this.gradientDark);
        sb2.append(", imageUrl=");
        sb2.append(this.imageUrl);
        sb2.append(", imageDarkUrl=");
        sb2.append(this.imageDarkUrl);
        sb2.append(", fade=");
        sb2.append(this.fade);
        sb2.append(", fadeToDark=");
        sb2.append(this.fadeToDark);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", typeDark=");
        sb2.append(this.typeDark);
        sb2.append(", enabled=");
        return o.d(sb2, this.enabled, ')');
    }

    public HeaderBackgroundModel(String color, String str, List<String> list, List<String> list2, String str2, String str3, boolean z10, Boolean bool, HeaderBackdropType type, HeaderBackdropType headerBackdropType, boolean z11) {
        i.e(color, "color");
        i.e(type, "type");
        this.color = color;
        this.colorDark = str;
        this.gradient = list;
        this.gradientDark = list2;
        this.imageUrl = str2;
        this.imageDarkUrl = str3;
        this.fade = z10;
        this.fadeToDark = bool;
        this.type = type;
        this.typeDark = headerBackdropType;
        this.enabled = z11;
    }

    public /* synthetic */ HeaderBackgroundModel(String str, String str2, List list, List list2, String str3, String str4, boolean z10, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z11, int i10, e eVar) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? true : z10, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? HeaderBackdropType.SOLID : headerBackdropType, (i10 & 512) == 0 ? headerBackdropType2 : null, (i10 & 1024) != 0 ? false : z11);
    }
}
