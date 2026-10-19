package io.intercom.android.sdk.blocks.lib.models;

import B1.a;
import I7.b;
import Z3.o;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: TicketType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketType implements Parcelable {

    @b("archived")
    private final boolean archived;

    @b("attributes")
    private final List<TicketAttribute> attributes;

    @b("emoji")
    private final String emoji;

    @b("id")
    private final int id;

    @b("name")
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketType> CREATOR = new Creator();
    private static final TicketType NULL = new TicketType(-1, "", "", EmptyList.f42983b, false);

    /* JADX INFO: compiled from: TicketType.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final TicketType getNULL() {
            return TicketType.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: TicketType.kt */
    public static final class Creator implements Parcelable.Creator<TicketType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(TicketAttribute.CREATOR.createFromParcel(parcel));
            }
            return new TicketType(i10, string, string2, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType[] newArray(int i10) {
            return new TicketType[i10];
        }
    }

    public TicketType(int i10, String name, String emoji, List<TicketAttribute> attributes, boolean z10) {
        i.e(name, "name");
        i.e(emoji, "emoji");
        i.e(attributes, "attributes");
        this.id = i10;
        this.name = name;
        this.emoji = emoji;
        this.attributes = attributes;
        this.archived = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketType copy$default(TicketType ticketType, int i10, String str, String str2, List list, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketType.id;
        }
        if ((i11 & 2) != 0) {
            str = ticketType.name;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = ticketType.emoji;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = ticketType.attributes;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            z10 = ticketType.archived;
        }
        return ticketType.copy(i10, str3, str4, list2, z10);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.emoji;
    }

    public final List<TicketAttribute> component4() {
        return this.attributes;
    }

    public final boolean component5() {
        return this.archived;
    }

    public final TicketType copy(int i10, String name, String emoji, List<TicketAttribute> attributes, boolean z10) {
        i.e(name, "name");
        i.e(emoji, "emoji");
        i.e(attributes, "attributes");
        return new TicketType(i10, name, emoji, attributes, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketType)) {
            return false;
        }
        TicketType ticketType = (TicketType) obj;
        return this.id == ticketType.id && i.a(this.name, ticketType.name) && i.a(this.emoji, ticketType.emoji) && i.a(this.attributes, ticketType.attributes) && this.archived == ticketType.archived;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.archived) + p.d(a.b(this.emoji, a.b(this.name, Integer.hashCode(this.id) * 31, 31), 31), 31, this.attributes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketType(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", emoji=");
        sb2.append(this.emoji);
        sb2.append(", attributes=");
        sb2.append(this.attributes);
        sb2.append(", archived=");
        return o.d(sb2, this.archived, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.emoji);
        List<TicketAttribute> list = this.attributes;
        dest.writeInt(list.size());
        Iterator<TicketAttribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
        dest.writeInt(this.archived ? 1 : 0);
    }
}
