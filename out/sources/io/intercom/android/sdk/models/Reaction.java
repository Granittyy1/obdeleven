package io.intercom.android.sdk.models;

import I7.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Reaction.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Reaction implements Parcelable {
    public static final int $stable = 0;

    @b("image_url")
    private final String _imageUrl;

    @b("index")
    private final int index;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

    /* JADX INFO: compiled from: Reaction.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Reaction create(int i10, String imageUrl) {
            i.e(imageUrl, "imageUrl");
            return new Reaction(i10, imageUrl);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Reaction.kt */
    public static final class Creator implements Parcelable.Creator<Reaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new Reaction(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction[] newArray(int i10) {
            return new Reaction[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Reaction() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    private final String component2() {
        return this._imageUrl;
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = reaction.index;
        }
        if ((i11 & 2) != 0) {
            str = reaction._imageUrl;
        }
        return reaction.copy(i10, str);
    }

    public static final Reaction create(int i10, String str) {
        return Companion.create(i10, str);
    }

    public final int component1() {
        return this.index;
    }

    public final Reaction copy(int i10, String str) {
        return new Reaction(i10, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        return this.index == reaction.index && i.a(this._imageUrl, reaction._imageUrl);
    }

    public final String getImageUrl() {
        String str = this._imageUrl;
        return str == null ? "" : str;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        String str = this._imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Reaction(index=");
        sb2.append(this.index);
        sb2.append(", _imageUrl=");
        return B7.b.g(sb2, this._imageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeInt(this.index);
        dest.writeString(this._imageUrl);
    }

    public Reaction(int i10, String str) {
        this.index = i10;
        this._imageUrl = str;
    }

    public /* synthetic */ Reaction(int i10, String str, int i11, e eVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : str);
    }
}
