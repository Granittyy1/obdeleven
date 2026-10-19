package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1822h0 extends Q implements InterfaceC1808f0 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        b0(parcelE, 23);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        S.c(parcelE, bundle);
        b0(parcelE, 9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        b0(parcelE, 24);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void generateEventId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 22);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getCachedAppInstanceId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 19);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getCurrentScreenClass(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 17);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getCurrentScreenName(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 16);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getGmpAppId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 21);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getMaxUserProperties(String str, InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        ClassLoader classLoader = S.f25582a;
        parcelE.writeInt(z10 ? 1 : 0);
        S.b(parcelE, interfaceC1843k0);
        b0(parcelE, 5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void initialize(p018b5.a aVar, C1898s0 c1898s0, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        S.c(parcelE, c1898s0);
        parcelE.writeLong(j);
        b0(parcelE, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        S.c(parcelE, bundle);
        parcelE.writeInt(z10 ? 1 : 0);
        parcelE.writeInt(1);
        parcelE.writeLong(j);
        b0(parcelE, 2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void logHealthData(int i10, String str, p018b5.a aVar, p018b5.a aVar2, p018b5.a aVar3) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeInt(5);
        parcelE.writeString("Error with data collection. Data lost.");
        S.b(parcelE, aVar);
        S.b(parcelE, aVar2);
        S.b(parcelE, aVar3);
        b0(parcelE, 33);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivityCreated(p018b5.a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        S.c(parcelE, bundle);
        parcelE.writeLong(j);
        b0(parcelE, 27);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivityDestroyed(p018b5.a aVar, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        parcelE.writeLong(j);
        b0(parcelE, 28);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivityPaused(p018b5.a aVar, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        parcelE.writeLong(j);
        b0(parcelE, 29);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivityResumed(p018b5.a aVar, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        parcelE.writeLong(j);
        b0(parcelE, 30);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivitySaveInstanceState(p018b5.a aVar, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        S.b(parcelE, interfaceC1843k0);
        parcelE.writeLong(j);
        b0(parcelE, 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivityStarted(p018b5.a aVar, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        parcelE.writeLong(j);
        b0(parcelE, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void onActivityStopped(p018b5.a aVar, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        parcelE.writeLong(j);
        b0(parcelE, 26);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void registerOnMeasurementEventListener(InterfaceC1850l0 interfaceC1850l0) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, interfaceC1850l0);
        b0(parcelE, 35);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, bundle);
        parcelE.writeLong(j);
        b0(parcelE, 8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void setCurrentScreen(p018b5.a aVar, String str, String str2, long j) throws RemoteException {
        Parcel parcelE = e();
        S.b(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeLong(j);
        b0(parcelE, 15);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        b0(parcelE, 7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public final void setUserProperty(String str, String str2, p018b5.a aVar, boolean z10, long j) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        S.b(parcelE, aVar);
        parcelE.writeInt(z10 ? 1 : 0);
        parcelE.writeLong(j);
        b0(parcelE, 4);
    }
}
