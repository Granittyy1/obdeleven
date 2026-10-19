package io.intercom.android.sdk.blocks.lib.models;

import B1.a;
import Q8.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.D;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketAttribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketAttribute> CREATOR = new Creator();
    private final int id;
    private final String identifier;
    private final String name;
    private final List<String> options;
    private final boolean required;
    private final String type;

    /* JADX INFO: compiled from: TicketType.kt */
    public static final class Creator implements Parcelable.Creator<TicketAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketAttribute createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new TicketAttribute(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketAttribute[] newArray(int i10) {
            return new TicketAttribute[i10];
        }
    }

    public TicketAttribute(int i10, String name, String type, boolean z10, String str, List<String> options) {
        i.e(name, "name");
        i.e(type, "type");
        i.e(options, "options");
        this.id = i10;
        this.name = name;
        this.type = type;
        this.required = z10;
        this.identifier = str;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketAttribute copy$default(TicketAttribute ticketAttribute, int i10, String str, String str2, boolean z10, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketAttribute.id;
        }
        if ((i11 & 2) != 0) {
            str = ticketAttribute.name;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = ticketAttribute.type;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            z10 = ticketAttribute.required;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str3 = ticketAttribute.identifier;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            list = ticketAttribute.options;
        }
        return ticketAttribute.copy(i10, str4, str5, z11, str6, list);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.required;
    }

    public final String component5() {
        return this.identifier;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final TicketAttribute copy(int i10, String name, String type, boolean z10, String str, List<String> options) {
        i.e(name, "name");
        i.e(type, "type");
        i.e(options, "options");
        return new TicketAttribute(i10, name, type, z10, str, options);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttribute)) {
            return false;
        }
        TicketAttribute ticketAttribute = (TicketAttribute) obj;
        return this.id == ticketAttribute.id && i.a(this.name, ticketAttribute.name) && i.a(this.type, ticketAttribute.type) && this.required == ticketAttribute.required && i.a(this.identifier, ticketAttribute.identifier) && i.a(this.options, ticketAttribute.options);
    }

    public final int getId() {
        return this.id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iB = D.b(a.b(this.type, a.b(this.name, Integer.hashCode(this.id) * 31, 31), 31), 31, this.required);
        String str = this.identifier;
        return this.options.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketAttribute(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", identifier=");
        sb2.append(this.identifier);
        sb2.append(", options=");
        return d.b(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeInt(this.required ? 1 : 0);
        dest.writeString(this.identifier);
        dest.writeStringList(this.options);
    }

    public TicketAttribute(int i10, String str, String str2, boolean z10, String str3, List list, int i11, e eVar) {
        this(i10, str, str2, z10, str3, (i11 & 32) != 0 ? EmptyList.f42983b : list);
    }
}
