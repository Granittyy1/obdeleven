package io.intercom.android.sdk.m5.home.data;

import I7.b;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Action {
    public static final int $stable = 0;

    @b(InAppMessageBase.ICON)
    private final IconType icon;

    @b("label")
    private final String label;

    @b("subtitle")
    private final String subtitle;

    public Action(String label, IconType iconType, String str) {
        i.e(label, "label");
        this.label = label;
        this.icon = iconType;
        this.subtitle = str;
    }

    public static /* synthetic */ Action copy$default(Action action, String str, IconType iconType, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = action.label;
        }
        if ((i10 & 2) != 0) {
            iconType = action.icon;
        }
        if ((i10 & 4) != 0) {
            str2 = action.subtitle;
        }
        return action.copy(str, iconType, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final IconType component2() {
        return this.icon;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final Action copy(String label, IconType iconType, String str) {
        i.e(label, "label");
        return new Action(label, iconType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return i.a(this.label, action.label) && this.icon == action.icon && i.a(this.subtitle, action.subtitle);
    }

    public final IconType getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        IconType iconType = this.icon;
        int iHashCode2 = (iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str = this.subtitle;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Action(label=");
        sb2.append(this.label);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", subtitle=");
        return B7.b.g(sb2, this.subtitle, ')');
    }
}
