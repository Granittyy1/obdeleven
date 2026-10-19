package p253u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Counter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0541a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f47438c;

    /* JADX INFO: renamed from: u7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Counter.java */
    public class C0541a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str) {
        this.f47437b = str;
        this.f47438c = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f47437b);
        parcel.writeLong(this.f47438c.get());
    }

    public a(Parcel parcel) {
        this.f47437b = parcel.readString();
        this.f47438c = new AtomicLong(parcel.readLong());
    }
}
