package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        int i10 = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 != 2) {
                SafeParcelReader.l(parcel, i11);
            } else {
                strC = SafeParcelReader.c(parcel, i11);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new Scope(i10, strC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
