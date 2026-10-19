package S4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        boolean zG = false;
        boolean zG2 = false;
        boolean zG3 = false;
        boolean zG4 = false;
        boolean zG5 = false;
        String strC = null;
        IBinder iBinderH = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strC = SafeParcelReader.c(parcel, i10);
                    break;
                case 2:
                    zG = SafeParcelReader.g(parcel, i10);
                    break;
                case 3:
                    zG2 = SafeParcelReader.g(parcel, i10);
                    break;
                case 4:
                    iBinderH = SafeParcelReader.h(parcel, i10);
                    break;
                case 5:
                    zG3 = SafeParcelReader.g(parcel, i10);
                    break;
                case 6:
                    zG4 = SafeParcelReader.g(parcel, i10);
                    break;
                case 7:
                default:
                    SafeParcelReader.l(parcel, i10);
                    break;
                case '\b':
                    zG5 = SafeParcelReader.g(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new B(strC, zG, zG2, iBinderH, zG3, zG4, zG5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B[i10];
    }
}
