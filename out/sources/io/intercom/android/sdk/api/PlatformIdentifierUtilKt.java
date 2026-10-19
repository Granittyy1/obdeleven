package io.intercom.android.sdk.api;

import android.content.Context;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PlatformIdentifierUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PlatformIdentifierUtilKt {
    public static final String ANDROID_HEADER = "intercom-android-sdk";
    public static final String CORDOVA_HEADER = "intercom-sdk-cordova";
    public static final String CORDOVA_VERSION = "cordova_version";
    public static final String FLUTTER_HEADER = "intercom-sdk-flutter";
    public static final String NATIVE_SDK = "intercom-sdk-native";
    public static final String REACT_NATIVE_HEADER = "intercom-sdk-react-native";
    public static final String REACT_NATIVE_VERSION = "react_native_version";
    public static final String WRAPPER_PREFS = "intercomsdk_wrapper_prefs";

    private static final Platform getPlatform(Context context) {
        String string = context.getSharedPreferences(WRAPPER_PREFS, 0).getString(CORDOVA_VERSION, "");
        String str = isReactNativeApp() ? REACT_NATIVE_HEADER : "";
        String str2 = isFlutterApp() ? FLUTTER_HEADER : "";
        if (!i.a(string, "")) {
            return Platform.Cordova;
        }
        if (str.equals("")) {
            return !str2.equals("") ? Platform.Flutter : Platform.Native;
        }
        return Platform.ReactNative;
    }

    public static final String getPlatformIdentifier(Context context) {
        i.e(context, "context");
        return getPlatform(context).getIdentifier();
    }

    private static final boolean isFlutterApp() {
        try {
            Class.forName("io.maido.intercom.IntercomFlutterPlugin");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean isReactNativeApp() {
        try {
            Class.forName("com.intercom.reactnative.IntercomModule");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
