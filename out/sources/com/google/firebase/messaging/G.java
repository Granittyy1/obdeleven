package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: RemoteMessageCreator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements Parcelable.Creator<F> {
    @Override // android.os.Parcelable.Creator
    public final F createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                SafeParcelReader.l(parcel, i10);
            } else {
                bundleA = SafeParcelReader.a(parcel, i10);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new F(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final F[] newArray(int i10) {
        return new F[i10];
    }
}
