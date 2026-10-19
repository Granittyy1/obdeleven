package p166n5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        ArrayList<String> arrayList = null;
        String strC = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                int iK = SafeParcelReader.k(parcel, i10);
                int iDataPosition = parcel.dataPosition();
                if (iK == 0) {
                    arrayList = null;
                } else {
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    parcel.setDataPosition(iDataPosition + iK);
                    arrayList = arrayListCreateStringArrayList;
                }
            } else if (c10 != 2) {
                SafeParcelReader.l(parcel, i10);
            } else {
                strC = SafeParcelReader.c(parcel, i10);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new h(strC, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
