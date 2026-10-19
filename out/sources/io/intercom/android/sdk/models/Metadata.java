package io.intercom.android.sdk.models;

import I7.b;
import Q8.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Metadata.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Metadata implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Metadata> CREATOR = new Creator();

    @b("avatars")
    private final List<Avatar.Builder> _avatars;

    @b("suffix")
    private final String suffix;

    @b("timestamp")
    private final Long timestamp;

    @b("title")
    private final String title;

    /* JADX INFO: compiled from: Metadata.kt */
    public static final class Creator implements Parcelable.Creator<Metadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new Metadata(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), null, 8, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata() {
        this(null, null, null, null, 15, null);
    }

    private final List<Avatar.Builder> component4() {
        return this._avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, Long l10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metadata.title;
        }
        if ((i10 & 2) != 0) {
            str2 = metadata.suffix;
        }
        if ((i10 & 4) != 0) {
            l10 = metadata.timestamp;
        }
        if ((i10 & 8) != 0) {
            list = metadata._avatars;
        }
        return metadata.copy(str, str2, l10, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.suffix;
    }

    public final Long component3() {
        return this.timestamp;
    }

    public final Metadata copy(String title, String str, Long l10, List<Avatar.Builder> list) {
        i.e(title, "title");
        return new Metadata(title, str, l10, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return i.a(this.title, metadata.title) && i.a(this.suffix, metadata.suffix) && i.a(this.timestamp, metadata.timestamp) && i.a(this._avatars, metadata._avatars);
    }

    public final List<Avatar> getAvatars() {
        List<Avatar.Builder> list = this._avatars;
        if (list == null) {
            return EmptyList.f42983b;
        }
        List<Avatar.Builder> list2 = list;
        ArrayList arrayList = new ArrayList(m.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Avatar.Builder) it.next()).build());
        }
        return arrayList;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.suffix;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.timestamp;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<Avatar.Builder> list = this._avatars;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(title=");
        sb2.append(this.title);
        sb2.append(", suffix=");
        sb2.append(this.suffix);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", _avatars=");
        return d.b(sb2, this._avatars, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.suffix);
        Long l10 = this.timestamp;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l10.longValue());
        }
    }

    public Metadata(String title, String str, Long l10, List<Avatar.Builder> list) {
        i.e(title, "title");
        this.title = title;
        this.suffix = str;
        this.timestamp = l10;
        this._avatars = list;
    }

    public /* synthetic */ Metadata(String str, String str2, Long l10, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : list);
    }

    private static /* synthetic */ void get_avatars$annotations() {
    }
}
