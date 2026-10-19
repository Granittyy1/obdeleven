package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1950a extends C1959d implements InterfaceC1956c {
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final Bundle L(String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(3);
        parcelE.writeString(str);
        parcelE.writeString("inapp");
        parcelE.writeString(str2);
        Parcel parcelG = g(parcelE, 4);
        Bundle bundle = (Bundle) C1965f.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final Bundle S(String str, String str2, String str3) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(3);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        parcelE.writeString(null);
        Parcel parcelG = g(parcelE, 3);
        Bundle bundle = (Bundle) C1965f.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final Bundle T(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(i10);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        int i11 = C1965f.f26182a;
        parcelE.writeInt(1);
        bundle.writeToParcel(parcelE, 0);
        parcelE.writeInt(1);
        bundle2.writeToParcel(parcelE, 0);
        Parcel parcelG = g(parcelE, 901);
        Bundle bundle3 = (Bundle) C1965f.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final Bundle W(int i10, Bundle bundle, String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(i10);
        parcelE.writeString(str);
        parcelE.writeString("inapp");
        parcelE.writeString(str2);
        int i11 = C1965f.f26182a;
        parcelE.writeInt(1);
        bundle.writeToParcel(parcelE, 0);
        Parcel parcelG = g(parcelE, 11);
        Bundle bundle2 = (Bundle) C1965f.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final int Y(int i10, String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(i10);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        Parcel parcelG = g(parcelE, 1);
        int i11 = parcelG.readInt();
        parcelG.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final int i(String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(3);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        Parcel parcelG = g(parcelE, 5);
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final Bundle j(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(i10);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        parcelE.writeString(null);
        int i11 = C1965f.f26182a;
        parcelE.writeInt(1);
        bundle.writeToParcel(parcelE, 0);
        Parcel parcelG = g(parcelE, 8);
        Bundle bundle2 = (Bundle) C1965f.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final int q(int i10, Bundle bundle, String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(i10);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        int i11 = C1965f.f26182a;
        parcelE.writeInt(1);
        bundle.writeToParcel(parcelE, 0);
        Parcel parcelG = g(parcelE, 10);
        int i12 = parcelG.readInt();
        parcelG.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1956c
    public final Bundle v(Bundle bundle, String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(9);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        int i10 = C1965f.f26182a;
        parcelE.writeInt(1);
        bundle.writeToParcel(parcelE, 0);
        Parcel parcelG = g(parcelE, 12);
        Bundle bundle2 = (Bundle) C1965f.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
