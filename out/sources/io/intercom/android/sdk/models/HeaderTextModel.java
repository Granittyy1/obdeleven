package io.intercom.android.sdk.models;

import B1.a;
import I7.b;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderTextModel {
    public static final int $stable = 0;

    @b(InAppMessageBase.MESSAGE_TEXT_COLOR)
    private final String color;

    @b("text_color_dark")
    private final String colorDark;

    @b("opacity")
    private final float opacity;

    @b("content")
    private final String text;

    public HeaderTextModel() {
        this(null, 0.0f, null, null, 15, null);
    }

    public static /* synthetic */ HeaderTextModel copy$default(HeaderTextModel headerTextModel, String str, float f10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerTextModel.text;
        }
        if ((i10 & 2) != 0) {
            f10 = headerTextModel.opacity;
        }
        if ((i10 & 4) != 0) {
            str2 = headerTextModel.color;
        }
        if ((i10 & 8) != 0) {
            str3 = headerTextModel.colorDark;
        }
        return headerTextModel.copy(str, f10, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final float component2() {
        return this.opacity;
    }

    public final String component3() {
        return this.color;
    }

    public final String component4() {
        return this.colorDark;
    }

    public final HeaderTextModel copy(String text, float f10, String color, String str) {
        i.e(text, "text");
        i.e(color, "color");
        return new HeaderTextModel(text, f10, color, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextModel)) {
            return false;
        }
        HeaderTextModel headerTextModel = (HeaderTextModel) obj;
        return i.a(this.text, headerTextModel.text) && Float.compare(this.opacity, headerTextModel.opacity) == 0 && i.a(this.color, headerTextModel.color) && i.a(this.colorDark, headerTextModel.colorDark);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorDark() {
        return this.colorDark;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iB = a.b(this.color, O.a.d(this.opacity, this.text.hashCode() * 31, 31), 31);
        String str = this.colorDark;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderTextModel(text=");
        sb2.append(this.text);
        sb2.append(", opacity=");
        sb2.append(this.opacity);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", colorDark=");
        return B7.b.g(sb2, this.colorDark, ')');
    }

    public HeaderTextModel(String text, float f10, String color, String str) {
        i.e(text, "text");
        i.e(color, "color");
        this.text = text;
        this.opacity = f10;
        this.color = color;
        this.colorDark = str;
    }

    public /* synthetic */ HeaderTextModel(String str, float f10, String str2, String str3, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? "#000000" : str2, (i10 & 8) != 0 ? null : str3);
    }
}
