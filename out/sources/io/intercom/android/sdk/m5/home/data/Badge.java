package io.intercom.android.sdk.m5.home.data;

import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Badge {
    public static final int $stable = 0;

    @b("badge_type")
    private final BadgeType badgeType;

    @b("label")
    private final String label;

    public Badge(BadgeType badgeType, String str) {
        i.e(badgeType, "badgeType");
        this.badgeType = badgeType;
        this.label = str;
    }

    public static /* synthetic */ Badge copy$default(Badge badge, BadgeType badgeType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            badgeType = badge.badgeType;
        }
        if ((i10 & 2) != 0) {
            str = badge.label;
        }
        return badge.copy(badgeType, str);
    }

    public final BadgeType component1() {
        return this.badgeType;
    }

    public final String component2() {
        return this.label;
    }

    public final Badge copy(BadgeType badgeType, String str) {
        i.e(badgeType, "badgeType");
        return new Badge(badgeType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.badgeType == badge.badgeType && i.a(this.label, badge.label);
    }

    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.badgeType.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Badge(badgeType=");
        sb2.append(this.badgeType);
        sb2.append(", label=");
        return B7.b.g(sb2, this.label, ')');
    }
}
