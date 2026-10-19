package V5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.X;

/* JADX INFO: compiled from: ExtendableSavedState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends K0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0096a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X<String, Bundle> f6726d;

    /* JADX INFO: renamed from: V5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExtendableSavedState.java */
    public class C0096a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f6726d = new X<>();
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f6726d + "}";
    }

    @Override // K0.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        X<String, Bundle> x10 = this.f6726d;
        int i11 = x10.f9139d;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = x10.h(i12);
            bundleArr[i12] = x10.m(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f6726d = new X<>(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6726d.put(strArr[i11], bundleArr[i11]);
        }
    }
}
