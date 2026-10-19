package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FinData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AiAnswerInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AiAnswerInfo> CREATOR = new Creator();
    private final String text;
    private final String url;

    /* JADX INFO: compiled from: FinData.kt */
    public static final class Creator implements Parcelable.Creator<AiAnswerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiAnswerInfo createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new AiAnswerInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiAnswerInfo[] newArray(int i10) {
            return new AiAnswerInfo[i10];
        }
    }

    public AiAnswerInfo(String text, String str) {
        i.e(text, "text");
        this.text = text;
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isEmpty() {
        String str;
        return this.text.length() == 0 && ((str = this.url) == null || str.length() == 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.url);
    }
}
