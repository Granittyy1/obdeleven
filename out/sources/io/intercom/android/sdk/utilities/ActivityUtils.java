package io.intercom.android.sdk.utilities;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: compiled from: ActivityUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityUtils {
    public static final int $stable;
    public static final ActivityUtils INSTANCE = new ActivityUtils();
    private static final String[] INTERCOM_PACKAGES;
    private static final String PACKAGE_NAME;

    static {
        String name = Intercom.class.getPackage().getName();
        PACKAGE_NAME = name;
        INTERCOM_PACKAGES = new String[]{name};
        $stable = 8;
    }

    private ActivityUtils() {
    }

    public static final boolean isHostActivity(Activity activity) {
        return activity != null && INSTANCE.isInHostAppPackage(activity.getClass().getName());
    }

    private final boolean isInHostAppPackage(String str) {
        for (String str2 : INTERCOM_PACKAGES) {
            i.b(str2);
            if (m.I(str, str2, false)) {
                return false;
            }
        }
        return true;
    }
}
