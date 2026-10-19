package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1956c extends IInterface {
    Bundle L(String str, String str2) throws RemoteException;

    Bundle S(String str, String str2, String str3) throws RemoteException;

    Bundle T(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException;

    Bundle W(int i10, Bundle bundle, String str, String str2) throws RemoteException;

    int Y(int i10, String str, String str2) throws RemoteException;

    int i(String str, String str2) throws RemoteException;

    Bundle j(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    int q(int i10, Bundle bundle, String str, String str2) throws RemoteException;

    Bundle v(Bundle bundle, String str, String str2) throws RemoteException;
}
