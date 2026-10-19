package com.google.android.gms.common.api;

import S4.C0760b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        C0760b c0760b = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 == 2) {
                strC = SafeParcelReader.c(parcel, i11);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.b(parcel, i11, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                SafeParcelReader.l(parcel, i11);
            } else {
                c0760b = (C0760b) SafeParcelReader.b(parcel, i11, C0760b.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new Status(i10, strC, pendingIntent, c0760b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
