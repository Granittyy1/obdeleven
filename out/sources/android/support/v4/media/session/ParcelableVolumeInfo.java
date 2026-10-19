package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8151f;

    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
            parcelableVolumeInfo.f8147b = parcel.readInt();
            parcelableVolumeInfo.f8149d = parcel.readInt();
            parcelableVolumeInfo.f8150e = parcel.readInt();
            parcelableVolumeInfo.f8151f = parcel.readInt();
            parcelableVolumeInfo.f8148c = parcel.readInt();
            return parcelableVolumeInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8147b);
        parcel.writeInt(this.f8149d);
        parcel.writeInt(this.f8150e);
        parcel.writeInt(this.f8151f);
        parcel.writeInt(this.f8148c);
    }
}
