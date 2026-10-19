package io.intercom.android.sdk.models;

import Ba.a;
import I7.b;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PoweredBy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PoweredBy {
    public static final int $stable = 0;

    @b(InAppMessageBase.ICON)
    private final PoweredByIconType icon;

    @b("link_url")
    private final String linkUrl;

    @b(AttributeType.TEXT)
    private final String text;

    /* JADX INFO: compiled from: PoweredBy.kt */
    public enum PoweredByIconType {
        INTERCOM,
        FIN;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

        public static a<PoweredByIconType> getEntries() {
            return $ENTRIES;
        }
    }

    public PoweredBy(PoweredByIconType icon, String linkUrl, String text) {
        i.e(icon, "icon");
        i.e(linkUrl, "linkUrl");
        i.e(text, "text");
        this.icon = icon;
        this.linkUrl = linkUrl;
        this.text = text;
    }

    public static /* synthetic */ PoweredBy copy$default(PoweredBy poweredBy, PoweredByIconType poweredByIconType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            poweredByIconType = poweredBy.icon;
        }
        if ((i10 & 2) != 0) {
            str = poweredBy.linkUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = poweredBy.text;
        }
        return poweredBy.copy(poweredByIconType, str, str2);
    }

    public final PoweredByIconType component1() {
        return this.icon;
    }

    public final String component2() {
        return this.linkUrl;
    }

    public final String component3() {
        return this.text;
    }

    public final PoweredBy copy(PoweredByIconType icon, String linkUrl, String text) {
        i.e(icon, "icon");
        i.e(linkUrl, "linkUrl");
        i.e(text, "text");
        return new PoweredBy(icon, linkUrl, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoweredBy)) {
            return false;
        }
        PoweredBy poweredBy = (PoweredBy) obj;
        return this.icon == poweredBy.icon && i.a(this.linkUrl, poweredBy.linkUrl) && i.a(this.text, poweredBy.text);
    }

    public final PoweredByIconType getIcon() {
        return this.icon;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + B1.a.b(this.linkUrl, this.icon.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PoweredBy(icon=");
        sb2.append(this.icon);
        sb2.append(", linkUrl=");
        sb2.append(this.linkUrl);
        sb2.append(", text=");
        return B7.b.g(sb2, this.text, ')');
    }
}
