package io.intercom.android.sdk.models;

import B7.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ReplyOption.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplyOption implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReplyOption> CREATOR = new Creator();
    private final String text;
    private final String uuid;

    /* JADX INFO: compiled from: ReplyOption.kt */
    public static final class Creator implements Parcelable.Creator<ReplyOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyOption createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ReplyOption(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyOption[] newArray(int i10) {
            return new ReplyOption[i10];
        }
    }

    public ReplyOption(String text, String uuid) {
        i.e(text, "text");
        i.e(uuid, "uuid");
        this.text = text;
        this.uuid = uuid;
    }

    public static /* synthetic */ ReplyOption copy$default(ReplyOption replyOption, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replyOption.text;
        }
        if ((i10 & 2) != 0) {
            str2 = replyOption.uuid;
        }
        return replyOption.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.uuid;
    }

    public final ReplyOption copy(String text, String uuid) {
        i.e(text, "text");
        i.e(uuid, "uuid");
        return new ReplyOption(text, uuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyOption)) {
            return false;
        }
        ReplyOption replyOption = (ReplyOption) obj;
        return i.a(this.text, replyOption.text) && i.a(this.uuid, replyOption.uuid);
    }

    public final String getText() {
        return this.text;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplyOption(text=");
        sb2.append(this.text);
        sb2.append(", uuid=");
        return b.g(sb2, this.uuid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.uuid);
    }
}
