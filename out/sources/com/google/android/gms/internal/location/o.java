package com.google.android.gms.internal.location;

import S4.C0762d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        ArrayList arrayListE = null;
        j jVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 == 3) {
                strC = SafeParcelReader.c(parcel, i11);
            } else if (c10 == 4) {
                strC2 = SafeParcelReader.c(parcel, i11);
            } else if (c10 == 6) {
                strC3 = SafeParcelReader.c(parcel, i11);
            } else if (c10 == 7) {
                jVar = (j) SafeParcelReader.b(parcel, i11, j.CREATOR);
            } else if (c10 != '\b') {
                SafeParcelReader.l(parcel, i11);
            } else {
                arrayListE = SafeParcelReader.e(parcel, i11, C0762d.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new j(i10, strC, strC2, strC3, arrayListE, jVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
