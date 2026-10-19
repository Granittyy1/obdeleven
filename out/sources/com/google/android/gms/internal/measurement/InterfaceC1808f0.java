package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1808f0 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getAppInstanceId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getCurrentScreenClass(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getCurrentScreenName(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getGmpAppId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getSessionId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void getTestFlag(InterfaceC1843k0 interfaceC1843k0, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(p018b5.a aVar, C1898s0 c1898s0, long j) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC1843k0 interfaceC1843k0) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException;

    void logHealthData(int i10, String str, p018b5.a aVar, p018b5.a aVar2, p018b5.a aVar3) throws RemoteException;

    void onActivityCreated(p018b5.a aVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(p018b5.a aVar, long j) throws RemoteException;

    void onActivityPaused(p018b5.a aVar, long j) throws RemoteException;

    void onActivityResumed(p018b5.a aVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(p018b5.a aVar, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException;

    void onActivityStarted(p018b5.a aVar, long j) throws RemoteException;

    void onActivityStopped(p018b5.a aVar, long j) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC1850l0 interfaceC1850l0) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(p018b5.a aVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC1850l0 interfaceC1850l0) throws RemoteException;

    void setInstanceIdProvider(InterfaceC1885q0 interfaceC1885q0) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, p018b5.a aVar, boolean z10, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC1850l0 interfaceC1850l0) throws RemoteException;
}
