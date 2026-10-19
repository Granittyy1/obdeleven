package com.voltasit.obdeleven.domain.usecases.permissions;

import android.os.Build;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: GetAreDeviceConnectPermissionsGrantedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static boolean a(MainActivity activity) {
        i.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 31) {
            int iA = p186p0.a.a(activity, "android.permission.BLUETOOTH_SCAN");
            int iA2 = p186p0.a.a(activity, "android.permission.BLUETOOTH_CONNECT");
            if (iA != 0 || iA2 != 0) {
                return false;
            }
        } else {
            int iA3 = p186p0.a.a(activity, "android.permission.ACCESS_FINE_LOCATION");
            int iA4 = p186p0.a.a(activity, "android.permission.ACCESS_COARSE_LOCATION");
            if (iA3 != 0 && iA4 != 0) {
                return false;
            }
        }
        return true;
    }
}
