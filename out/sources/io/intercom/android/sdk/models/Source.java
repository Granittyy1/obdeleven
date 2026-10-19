package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FinData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Source implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Source> CREATOR = new Creator();
    private final String id;
    private final String title;
    private final String type;
    private final String url;

    /* JADX INFO: compiled from: FinData.kt */
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new Source(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i10) {
            return new Source[i10];
        }
    }

    public Source(String id, String type, String title, String url) {
        i.e(id, "id");
        i.e(type, "type");
        i.e(title, "title");
        i.e(url, "url");
        this.id = id;
        this.type = type;
        this.title = title;
        this.url = url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.url);
    }
}
