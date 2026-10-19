package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC1829i0 extends T implements InterfaceC1808f0 {
    public AbstractBinderC1829i0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1808f0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1808f0 ? (InterfaceC1808f0) iInterfaceQueryLocalInterface : new C1822h0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final boolean e(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        boolean z10;
        InterfaceC1843k0 c1857m0 = null;
        InterfaceC1843k0 c1857m1 = null;
        InterfaceC1843k0 c1857m2 = null;
        InterfaceC1843k0 c1857m3 = null;
        InterfaceC1850l0 c1864n0 = null;
        InterfaceC1850l0 c1864n1 = null;
        InterfaceC1850l0 c1864n2 = null;
        InterfaceC1843k0 c1857m4 = null;
        InterfaceC1843k0 c1857m5 = null;
        InterfaceC1843k0 c1857m6 = null;
        InterfaceC1843k0 c1857m7 = null;
        InterfaceC1843k0 c1857m8 = null;
        InterfaceC1843k0 c1857m9 = null;
        InterfaceC1885q0 c1878p0 = null;
        InterfaceC1843k0 c1857m10 = null;
        InterfaceC1843k0 c1857m11 = null;
        InterfaceC1843k0 c1857m12 = null;
        InterfaceC1843k0 c1857m13 = null;
        InterfaceC1843k0 c1857m14 = null;
        switch (i10) {
            case 1:
                p018b5.a aVarG = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                C1898s0 c1898s0 = (C1898s0) S.a(parcel, C1898s0.CREATOR);
                long j = parcel.readLong();
                S.d(parcel);
                initialize(aVarG, c1898s0, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                long j10 = parcel.readLong();
                S.d(parcel);
                logEvent(string, string2, bundle, z11, z12, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) S.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m0 = iInterfaceQueryLocalInterface instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface : new C1857m0(strongBinder);
                }
                long j11 = parcel.readLong();
                S.d(parcel);
                logEventAndBundle(string3, string4, bundle2, c1857m0, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                p018b5.a aVarG2 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                ClassLoader classLoader = S.f25582a;
                boolean z13 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                S.d(parcel);
                setUserProperty(string5, string6, aVarG2, z13, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = S.f25582a;
                z10 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m14 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface2 : new C1857m0(strongBinder2);
                }
                S.d(parcel);
                getUserProperties(string7, string8, z10, c1857m14);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m13 = iInterfaceQueryLocalInterface3 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface3 : new C1857m0(strongBinder3);
                }
                S.d(parcel);
                getMaxUserProperties(string9, c1857m13);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                S.d(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                S.d(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) S.a(parcel, Bundle.CREATOR);
                S.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m12 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface4 : new C1857m0(strongBinder4);
                }
                S.d(parcel);
                getConditionalUserProperties(string13, string14, c1857m12);
                break;
            case 11:
                ClassLoader classLoader3 = S.f25582a;
                z10 = parcel.readInt() != 0;
                long j15 = parcel.readLong();
                S.d(parcel);
                setMeasurementEnabled(z10, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                S.d(parcel);
                resetAnalyticsData(j16);
                break;
            case 13:
                long j17 = parcel.readLong();
                S.d(parcel);
                setMinimumSessionDuration(j17);
                break;
            case 14:
                long j18 = parcel.readLong();
                S.d(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case 15:
                p018b5.a aVarG3 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                S.d(parcel);
                setCurrentScreen(aVarG3, string15, string16, j19);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m11 = iInterfaceQueryLocalInterface5 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface5 : new C1857m0(strongBinder5);
                }
                S.d(parcel);
                getCurrentScreenName(c1857m11);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m10 = iInterfaceQueryLocalInterface6 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface6 : new C1857m0(strongBinder6);
                }
                S.d(parcel);
                getCurrentScreenClass(c1857m10);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c1878p0 = iInterfaceQueryLocalInterface7 instanceof InterfaceC1885q0 ? (InterfaceC1885q0) iInterfaceQueryLocalInterface7 : new C1878p0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                S.d(parcel);
                setInstanceIdProvider(c1878p0);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m9 = iInterfaceQueryLocalInterface8 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface8 : new C1857m0(strongBinder8);
                }
                S.d(parcel);
                getCachedAppInstanceId(c1857m9);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m8 = iInterfaceQueryLocalInterface9 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface9 : new C1857m0(strongBinder9);
                }
                S.d(parcel);
                getAppInstanceId(c1857m8);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m7 = iInterfaceQueryLocalInterface10 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface10 : new C1857m0(strongBinder10);
                }
                S.d(parcel);
                getGmpAppId(c1857m7);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m6 = iInterfaceQueryLocalInterface11 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface11 : new C1857m0(strongBinder11);
                }
                S.d(parcel);
                generateEventId(c1857m6);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                S.d(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                S.d(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                p018b5.a aVarG4 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                S.d(parcel);
                onActivityStarted(aVarG4, j22);
                break;
            case 26:
                p018b5.a aVarG5 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                S.d(parcel);
                onActivityStopped(aVarG5, j23);
                break;
            case 27:
                p018b5.a aVarG6 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                S.d(parcel);
                onActivityCreated(aVarG6, bundle5, j24);
                break;
            case 28:
                p018b5.a aVarG7 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                S.d(parcel);
                onActivityDestroyed(aVarG7, j25);
                break;
            case 29:
                p018b5.a aVarG8 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                S.d(parcel);
                onActivityPaused(aVarG8, j26);
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                p018b5.a aVarG9 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                S.d(parcel);
                onActivityResumed(aVarG9, j27);
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                p018b5.a aVarG10 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m5 = iInterfaceQueryLocalInterface12 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface12 : new C1857m0(strongBinder12);
                }
                long j28 = parcel.readLong();
                S.d(parcel);
                onActivitySaveInstanceState(aVarG10, c1857m5, j28);
                break;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                Bundle bundle6 = (Bundle) S.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m4 = iInterfaceQueryLocalInterface13 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface13 : new C1857m0(strongBinder13);
                }
                long j29 = parcel.readLong();
                S.d(parcel);
                performAction(bundle6, c1857m4, j29);
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                p018b5.a aVarG11 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                p018b5.a aVarG12 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                p018b5.a aVarG13 = p018b5.a.AbstractBinderC0208a.g(parcel.readStrongBinder());
                S.d(parcel);
                logHealthData(i11, string19, aVarG11, aVarG12, aVarG13);
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1864n2 = iInterfaceQueryLocalInterface14 instanceof InterfaceC1850l0 ? (InterfaceC1850l0) iInterfaceQueryLocalInterface14 : new C1864n0(strongBinder14);
                }
                S.d(parcel);
                setEventInterceptor(c1864n2);
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1864n1 = iInterfaceQueryLocalInterface15 instanceof InterfaceC1850l0 ? (InterfaceC1850l0) iInterfaceQueryLocalInterface15 : new C1864n0(strongBinder15);
                }
                S.d(parcel);
                registerOnMeasurementEventListener(c1864n1);
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1864n0 = iInterfaceQueryLocalInterface16 instanceof InterfaceC1850l0 ? (InterfaceC1850l0) iInterfaceQueryLocalInterface16 : new C1864n0(strongBinder16);
                }
                S.d(parcel);
                unregisterOnMeasurementEventListener(c1864n0);
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                HashMap hashMap = parcel.readHashMap(S.f25582a);
                S.d(parcel);
                initForTests(hashMap);
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m3 = iInterfaceQueryLocalInterface17 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface17 : new C1857m0(strongBinder17);
                }
                int i12 = parcel.readInt();
                S.d(parcel);
                getTestFlag(c1857m3, i12);
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                ClassLoader classLoader4 = S.f25582a;
                z10 = parcel.readInt() != 0;
                S.d(parcel);
                setDataCollectionEnabled(z10);
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m2 = iInterfaceQueryLocalInterface18 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface18 : new C1857m0(strongBinder18);
                }
                S.d(parcel);
                isDataCollectionEnabled(c1857m2);
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            default:
                return false;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                Bundle bundle7 = (Bundle) S.a(parcel, Bundle.CREATOR);
                S.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                long j30 = parcel.readLong();
                S.d(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                Bundle bundle8 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                S.d(parcel);
                setConsent(bundle8, j31);
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                Bundle bundle9 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                S.d(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1857m1 = iInterfaceQueryLocalInterface19 instanceof InterfaceC1843k0 ? (InterfaceC1843k0) iInterfaceQueryLocalInterface19 : new C1857m0(strongBinder19);
                }
                S.d(parcel);
                getSessionId(c1857m1);
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                Intent intent = (Intent) S.a(parcel, Intent.CREATOR);
                S.d(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
