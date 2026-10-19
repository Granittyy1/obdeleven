package U4;

import S4.C0762d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Bundle bundleA = null;
        C0796d c0796d = null;
        int i10 = 0;
        C0762d[] c0762dArr = null;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                bundleA = SafeParcelReader.a(parcel, i11);
            } else if (c10 == 2) {
                c0762dArr = (C0762d[]) SafeParcelReader.d(parcel, i11, C0762d.CREATOR);
            } else if (c10 == 3) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 != 4) {
                SafeParcelReader.l(parcel, i11);
            } else {
                c0796d = (C0796d) SafeParcelReader.b(parcel, i11, C0796d.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        U u10 = new U();
        u10.f6373b = bundleA;
        u10.f6374c = c0762dArr;
        u10.f6375d = i10;
        u10.f6376e = c0796d;
        return u10;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new U[i10];
    }
}
