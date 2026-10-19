package p106i5;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.j;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        WorkSource workSource = new WorkSource();
        j jVar = null;
        boolean zG = false;
        int i10 = 0;
        int i11 = 0;
        boolean zG2 = false;
        long j = -1;
        float f10 = 0.0f;
        int i12 = Integer.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        long j12 = 0;
        long j13 = 600000;
        long j14 = 3600000;
        int i13 = 102;
        while (parcel.dataPosition() < iM) {
            int i14 = parcel.readInt();
            switch ((char) i14) {
                case 1:
                    i13 = SafeParcelReader.i(parcel, i14);
                    break;
                case 2:
                    j14 = SafeParcelReader.j(parcel, i14);
                    break;
                case 3:
                    j13 = SafeParcelReader.j(parcel, i14);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.l(parcel, i14);
                    break;
                case 5:
                    j10 = SafeParcelReader.j(parcel, i14);
                    break;
                case 6:
                    i12 = SafeParcelReader.i(parcel, i14);
                    break;
                case 7:
                    SafeParcelReader.n(parcel, i14, 4);
                    f10 = parcel.readFloat();
                    break;
                case '\b':
                    j12 = SafeParcelReader.j(parcel, i14);
                    break;
                case '\t':
                    zG = SafeParcelReader.g(parcel, i14);
                    break;
                case '\n':
                    j11 = SafeParcelReader.j(parcel, i14);
                    break;
                case 11:
                    j = SafeParcelReader.j(parcel, i14);
                    break;
                case '\f':
                    i10 = SafeParcelReader.i(parcel, i14);
                    break;
                case '\r':
                    i11 = SafeParcelReader.i(parcel, i14);
                    break;
                case 15:
                    zG2 = SafeParcelReader.g(parcel, i14);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.b(parcel, i14, WorkSource.CREATOR);
                    break;
                case 17:
                    jVar = (j) SafeParcelReader.b(parcel, i14, j.CREATOR);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new LocationRequest(i13, j14, j13, j12, j10, j11, i12, f10, zG, j, i10, i11, zG2, workSource, jVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
