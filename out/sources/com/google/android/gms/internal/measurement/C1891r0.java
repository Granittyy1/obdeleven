package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1891r0 implements Parcelable.Creator<C1898s0> {
    @Override // android.os.Parcelable.Creator
    public final C1898s0 createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        long j = 0;
        long j10 = 0;
        boolean zG = false;
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        Bundle bundleA = null;
        String strC4 = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    j = SafeParcelReader.j(parcel, i10);
                    break;
                case 2:
                    j10 = SafeParcelReader.j(parcel, i10);
                    break;
                case 3:
                    zG = SafeParcelReader.g(parcel, i10);
                    break;
                case 4:
                    strC = SafeParcelReader.c(parcel, i10);
                    break;
                case 5:
                    strC2 = SafeParcelReader.c(parcel, i10);
                    break;
                case 6:
                    strC3 = SafeParcelReader.c(parcel, i10);
                    break;
                case 7:
                    bundleA = SafeParcelReader.a(parcel, i10);
                    break;
                case '\b':
                    strC4 = SafeParcelReader.c(parcel, i10);
                    break;
                default:
                    SafeParcelReader.l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C1898s0(j, j10, zG, strC, strC2, strC3, bundleA, strC4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1898s0[] newArray(int i10) {
        return new C1898s0[i10];
    }
}
