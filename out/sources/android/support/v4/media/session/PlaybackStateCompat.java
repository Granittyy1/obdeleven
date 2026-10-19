package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p005a4.o;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f8158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8159i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f8160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f8161l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f8163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f8165e;

        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f8162b = parcel.readString();
            this.f8163c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8164d = parcel.readInt();
            this.f8165e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f8163c) + ", mIcon=" + this.f8164d + ", mExtras=" + this.f8165e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f8162b);
            TextUtils.writeToParcel(this.f8163c, parcel, i10);
            parcel.writeInt(this.f8164d);
            parcel.writeBundle(this.f8165e);
        }
    }

    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f8152b = parcel.readInt();
        this.f8153c = parcel.readLong();
        this.f8155e = parcel.readFloat();
        this.f8159i = parcel.readLong();
        this.f8154d = parcel.readLong();
        this.f8156f = parcel.readLong();
        this.f8158h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f8160k = parcel.readLong();
        this.f8161l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f8157g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f8152b);
        sb2.append(", position=");
        sb2.append(this.f8153c);
        sb2.append(", buffered position=");
        sb2.append(this.f8154d);
        sb2.append(", speed=");
        sb2.append(this.f8155e);
        sb2.append(", updated=");
        sb2.append(this.f8159i);
        sb2.append(", actions=");
        sb2.append(this.f8156f);
        sb2.append(", error code=");
        sb2.append(this.f8157g);
        sb2.append(", error message=");
        sb2.append(this.f8158h);
        sb2.append(", custom actions=");
        sb2.append(this.j);
        sb2.append(", active item id=");
        return o.d(this.f8160k, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8152b);
        parcel.writeLong(this.f8153c);
        parcel.writeFloat(this.f8155e);
        parcel.writeLong(this.f8159i);
        parcel.writeLong(this.f8154d);
        parcel.writeLong(this.f8156f);
        TextUtils.writeToParcel(this.f8158h, parcel, i10);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.f8160k);
        parcel.writeBundle(this.f8161l);
        parcel.writeInt(this.f8157g);
    }
}
