package io.intercom.android.sdk.ui.component;

/* JADX INFO: compiled from: IntercomTopBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomTopBarIcon {
    public static final int $stable = 0;
    private final String contentDescription;
    private final int iconRes;
    private final Ia.a<p293xa.r> onClick;

    public IntercomTopBarIcon(int i10, String str, Ia.a<p293xa.r> onClick) {
        kotlin.jvm.internal.i.e(onClick, "onClick");
        this.iconRes = i10;
        this.contentDescription = str;
        this.onClick = onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomTopBarIcon copy$default(IntercomTopBarIcon intercomTopBarIcon, int i10, String str, Ia.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = intercomTopBarIcon.iconRes;
        }
        if ((i11 & 2) != 0) {
            str = intercomTopBarIcon.contentDescription;
        }
        if ((i11 & 4) != 0) {
            aVar = intercomTopBarIcon.onClick;
        }
        return intercomTopBarIcon.copy(i10, str, aVar);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final String component2() {
        return this.contentDescription;
    }

    public final Ia.a<p293xa.r> component3() {
        return this.onClick;
    }

    public final IntercomTopBarIcon copy(int i10, String str, Ia.a<p293xa.r> onClick) {
        kotlin.jvm.internal.i.e(onClick, "onClick");
        return new IntercomTopBarIcon(i10, str, onClick);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarIcon)) {
            return false;
        }
        IntercomTopBarIcon intercomTopBarIcon = (IntercomTopBarIcon) obj;
        return this.iconRes == intercomTopBarIcon.iconRes && kotlin.jvm.internal.i.a(this.contentDescription, intercomTopBarIcon.contentDescription) && kotlin.jvm.internal.i.a(this.onClick, intercomTopBarIcon.onClick);
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final Ia.a<p293xa.r> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.iconRes) * 31;
        String str = this.contentDescription;
        return this.onClick.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "IntercomTopBarIcon(iconRes=" + this.iconRes + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }
}
