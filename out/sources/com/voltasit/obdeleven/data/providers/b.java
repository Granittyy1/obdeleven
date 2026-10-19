package com.voltasit.obdeleven.data.providers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.parse.ParseUser;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: AppInfoProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements J8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30257a;

    public b(Context context) {
        this.f30257a = context;
    }

    @Override // J8.b
    public final Map<String, String> a() throws PackageManager.NameNotFoundException {
        Context context = this.f30257a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        int i10 = Build.VERSION.SDK_INT;
        long longVersionCode = i10 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        String str = packageInfo.versionName;
        if (str == null) {
            str = "unknown";
        }
        Pair pair = new Pair(str, Long.valueOf(longVersionCode));
        String str2 = (String) pair.a();
        long jLongValue = ((Number) pair.b()).longValue();
        return kotlin.collections.y.s(new Pair("x-mobile-device-os-type", "android"), new Pair("x-mobile-device-os-version", Build.VERSION.RELEASE + " (" + i10 + ")"), new Pair("x-mobile-device-type", O.a.f(Build.MANUFACTURER, " ", Build.MODEL)), new Pair("x-mobile-app-id", "vag"), new Pair("x-mobile-app-version", str2), new Pair("x-mobile-app-build", String.valueOf(jLongValue)), new Pair("x-mobile-app-source", kotlin.text.n.J("play", "play", false) ? "google-play" : "unknown"));
    }

    @Override // J8.b
    public final String b() {
        String currentSessionToken = ParseUser.getCurrentSessionToken();
        return currentSessionToken == null ? "" : currentSessionToken;
    }
}
