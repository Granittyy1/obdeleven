package io.intercom.android.sdk.m5.home.data;

import B1.a;
import I7.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SpaceItem {
    public static final int $stable = 0;

    @b(MetricTracker.Object.BADGE)
    private final Badge badge;

    @b("label")
    private final String label;

    @b("type")
    private final SpaceItemType type;

    public SpaceItem(Badge badge, String label, SpaceItemType type) {
        i.e(label, "label");
        i.e(type, "type");
        this.badge = badge;
        this.label = label;
        this.type = type;
    }

    public static /* synthetic */ SpaceItem copy$default(SpaceItem spaceItem, Badge badge, String str, SpaceItemType spaceItemType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            badge = spaceItem.badge;
        }
        if ((i10 & 2) != 0) {
            str = spaceItem.label;
        }
        if ((i10 & 4) != 0) {
            spaceItemType = spaceItem.type;
        }
        return spaceItem.copy(badge, str, spaceItemType);
    }

    public final Badge component1() {
        return this.badge;
    }

    public final String component2() {
        return this.label;
    }

    public final SpaceItemType component3() {
        return this.type;
    }

    public final SpaceItem copy(Badge badge, String label, SpaceItemType type) {
        i.e(label, "label");
        i.e(type, "type");
        return new SpaceItem(badge, label, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceItem)) {
            return false;
        }
        SpaceItem spaceItem = (SpaceItem) obj;
        return i.a(this.badge, spaceItem.badge) && i.a(this.label, spaceItem.label) && this.type == spaceItem.type;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SpaceItemType getType() {
        return this.type;
    }

    public int hashCode() {
        Badge badge = this.badge;
        return this.type.hashCode() + a.b(this.label, (badge == null ? 0 : badge.hashCode()) * 31, 31);
    }

    public String toString() {
        return "SpaceItem(badge=" + this.badge + ", label=" + this.label + ", type=" + this.type + ')';
    }
}
