package io.intercom.android.sdk.models;

import I7.b;
import O.a;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CloseButtonModel {
    public static final int $stable = 0;

    @b("background_color")
    private final String backgroundColor;

    @b("background_opacity")
    private final float backgroundOpacity;

    @b("foreground_color")
    private final String foregroundColor;

    public CloseButtonModel() {
        this(null, 0.0f, null, 7, null);
    }

    public static /* synthetic */ CloseButtonModel copy$default(CloseButtonModel closeButtonModel, String str, float f10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = closeButtonModel.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            f10 = closeButtonModel.backgroundOpacity;
        }
        if ((i10 & 4) != 0) {
            str2 = closeButtonModel.foregroundColor;
        }
        return closeButtonModel.copy(str, f10, str2);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final float component2() {
        return this.backgroundOpacity;
    }

    public final String component3() {
        return this.foregroundColor;
    }

    public final CloseButtonModel copy(String backgroundColor, float f10, String foregroundColor) {
        i.e(backgroundColor, "backgroundColor");
        i.e(foregroundColor, "foregroundColor");
        return new CloseButtonModel(backgroundColor, f10, foregroundColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseButtonModel)) {
            return false;
        }
        CloseButtonModel closeButtonModel = (CloseButtonModel) obj;
        return i.a(this.backgroundColor, closeButtonModel.backgroundColor) && Float.compare(this.backgroundOpacity, closeButtonModel.backgroundOpacity) == 0 && i.a(this.foregroundColor, closeButtonModel.foregroundColor);
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

    public int hashCode() {
        return this.foregroundColor.hashCode() + a.d(this.backgroundOpacity, this.backgroundColor.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CloseButtonModel(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", backgroundOpacity=");
        sb2.append(this.backgroundOpacity);
        sb2.append(", foregroundColor=");
        return B7.b.g(sb2, this.foregroundColor, ')');
    }

    public CloseButtonModel(String backgroundColor, float f10, String foregroundColor) {
        i.e(backgroundColor, "backgroundColor");
        i.e(foregroundColor, "foregroundColor");
        this.backgroundColor = backgroundColor;
        this.backgroundOpacity = f10;
        this.foregroundColor = foregroundColor;
    }

    public /* synthetic */ CloseButtonModel(String str, float f10, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? "#000000" : str2);
    }
}
