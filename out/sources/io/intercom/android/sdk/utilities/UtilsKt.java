package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UtilsKt {
    public static final Locale getLocaleCompat(Context context) {
        i.e(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        i.b(locale);
        return locale;
    }

    public static final int getRegionCode(Context context, int i10) {
        i.e(context, "context");
        return context.getResources().getInteger(i10);
    }

    public static final int getServerRegionFromManifest(Context context) throws PackageManager.NameNotFoundException {
        i.e(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        i.d(applicationInfo, "getApplicationInfo(...)");
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            return bundle.getInt("io.intercom.android.sdk.server.region");
        }
        return 0;
    }

    public static final String readHostFromManifest(Context context) {
        i.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            i.d(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getString("io.intercom.android.sdk.host");
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
