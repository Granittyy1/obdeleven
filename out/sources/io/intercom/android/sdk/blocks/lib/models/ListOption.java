package io.intercom.android.sdk.blocks.lib.models;

import B1.a;
import I7.b;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketTypeV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ListOption {
    public static final int $stable = 0;

    @b("archived")
    private final boolean archived;

    @b("description")
    private final String description;

    @b("id")
    private final String id;

    @b("label")
    private final String label;

    public ListOption(String label, boolean z10, String id, String str) {
        i.e(label, "label");
        i.e(id, "id");
        this.label = label;
        this.archived = z10;
        this.id = id;
        this.description = str;
    }

    public static /* synthetic */ ListOption copy$default(ListOption listOption, String str, boolean z10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = listOption.label;
        }
        if ((i10 & 2) != 0) {
            z10 = listOption.archived;
        }
        if ((i10 & 4) != 0) {
            str2 = listOption.id;
        }
        if ((i10 & 8) != 0) {
            str3 = listOption.description;
        }
        return listOption.copy(str, z10, str2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.archived;
    }

    public final String component3() {
        return this.id;
    }

    public final String component4() {
        return this.description;
    }

    public final ListOption copy(String label, boolean z10, String id, String str) {
        i.e(label, "label");
        i.e(id, "id");
        return new ListOption(label, z10, id, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOption)) {
            return false;
        }
        ListOption listOption = (ListOption) obj;
        return i.a(this.label, listOption.label) && this.archived == listOption.archived && i.a(this.id, listOption.id) && i.a(this.description, listOption.description);
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iB = a.b(this.id, D.b(this.label.hashCode() * 31, 31, this.archived), 31);
        String str = this.description;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ListOption(label=");
        sb2.append(this.label);
        sb2.append(", archived=");
        sb2.append(this.archived);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", description=");
        return B7.b.g(sb2, this.description, ')');
    }

    public /* synthetic */ ListOption(String str, boolean z10, String str2, String str3, int i10, e eVar) {
        this(str, z10, str2, (i10 & 8) != 0 ? null : str3);
    }
}
