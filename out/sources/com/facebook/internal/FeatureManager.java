package com.facebook.internal;

import Z3.q;
import android.R;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FeatureManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FeatureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FeatureManager f24975a = new FeatureManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f24976b = new HashMap();

    /* JADX INFO: compiled from: FeatureManager.kt */
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        /* JADX INFO: Fake field, exist only in values array */
        Login(262144),
        /* JADX INFO: Fake field, exist only in values array */
        Elora(327680),
        /* JADX INFO: Fake field, exist only in values array */
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        /* JADX INFO: Fake field, exist only in values array */
        Share(33554432);

        private final int code;

        /* JADX INFO: compiled from: FeatureManager.kt */
        public static final class a {
            public static Feature a(int i10) {
                Feature[] featureArrValuesCustom = Feature.valuesCustom();
                int length = featureArrValuesCustom.length;
                int i11 = 0;
                while (i11 < length) {
                    Feature feature = featureArrValuesCustom[i11];
                    i11++;
                    if (feature.code == i10) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }

        Feature(int i10) {
            this.code = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Feature[] valuesCustom() {
            return (Feature[]) Arrays.copyOf(values(), 33);
        }

        public final Feature b() {
            int i10 = this.code;
            if ((i10 & 255) > 0) {
                return a.a(i10 & (-256));
            }
            if ((65280 & i10) > 0) {
                return a.a(i10 & (-65536));
            }
            return (16711680 & i10) > 0 ? a.a(i10 & (-16777216)) : a.a(0);
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (ordinal()) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "AppEventsCloudbridge";
                case 5:
                    return "RestrictiveDataFiltering";
                case 6:
                    return "AAM";
                case 7:
                    return "PrivacyProtection";
                case 8:
                    return "SuggestedEvents";
                case 9:
                    return "IntelligentIntegrity";
                case 10:
                    return "ModelRequest";
                case 11:
                    return "ProtectedMode";
                case 12:
                    return "MACARuleMatching";
                case 13:
                    return "EventDeactivation";
                case 14:
                    return "OnDeviceEventProcessing";
                case 15:
                    return "OnDevicePostInstallEventProcessing";
                case 16:
                    return "IAPLogging";
                case 17:
                    return "IAPLoggingLib2";
                case 18:
                    return "Instrument";
                case 19:
                    return "CrashReport";
                case 20:
                    return "CrashShield";
                case 21:
                    return "ThreadCheck";
                case 22:
                    return "ErrorReport";
                case 23:
                    return "AnrReport";
                case 24:
                    return "Monitoring";
                case 25:
                    return "ServiceUpdateCompliance";
                case 26:
                    return "Megatron";
                case 27:
                    return "Elora";
                case 28:
                    return "LoginKit";
                case 29:
                    return "ChromeCustomTabsPrefetching";
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    return "IgnoreAppSwitchToLoggedOut";
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    return "BypassAppSwitch";
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* JADX INFO: compiled from: FeatureManager.kt */
    public interface a {
        void e(boolean z10);
    }

    public static final void a(a aVar, Feature feature) {
        i.e(feature, "feature");
        p165n4.i.c(new com.facebook.internal.a(aVar, feature));
    }

    public static final boolean b(Feature feature) {
        boolean z10;
        i.e(feature, "feature");
        boolean z11 = false;
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = q.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(i.k(feature, "FBSDKFeature"), null);
        if (string != null && string.equals("16.2.0")) {
            return false;
        }
        Feature featureB = feature.b();
        if (featureB == feature) {
            switch (feature.ordinal()) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 29:
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    break;
                case 25:
                case 26:
                case 27:
                case 28:
                default:
                    z11 = true;
                    break;
            }
            p165n4.i iVar = p165n4.i.f44889a;
            return p165n4.i.b(i.k(feature, "FBSDKFeature"), q.b(), z11);
        }
        if (!b(featureB)) {
            return false;
        }
        switch (feature.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 29:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                z10 = false;
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                z10 = true;
                break;
        }
        p165n4.i iVar2 = p165n4.i.f44889a;
        return p165n4.i.b(i.k(feature, "FBSDKFeature"), q.b(), z10);
    }
}
