package com.voltasit.obdeleven.domain.usecases.permissions;

import Ia.l;
import android.os.Build;
import android.os.Bundle;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2171t0;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: AskDeviceConnectPermissionsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(MainActivity activity, final l lVar) {
        i.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 31) {
            if (!activity.shouldShowRequestPermissionRationale("android.permission.BLUETOOTH_SCAN") && !activity.shouldShowRequestPermissionRationale("android.permission.BLUETOOTH_CONNECT")) {
                activity.M(new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, new l<Boolean, r>() { // from class: com.voltasit.obdeleven.domain.usecases.permissions.AskDeviceConnectPermissionsUC$requestPermissionsAndroidS$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        lVar.invoke(bool2);
                        return r.f47939a;
                    }
                });
                return;
            }
            String string = activity.getString(R.string.view_nearby_devices_permission_description);
            C2171t0 c2171t0 = new C2171t0();
            Bundle bundle = new Bundle();
            bundle.putString("key_description", string);
            c2171t0.setArguments(bundle);
            c2171t0.f32261r = activity.getSupportFragmentManager();
            c2171t0.A();
            W7.c.g(0);
            return;
        }
        if (!activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION") && !activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION")) {
            activity.M(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, new l<Boolean, r>() { // from class: com.voltasit.obdeleven.domain.usecases.permissions.AskDeviceConnectPermissionsUC$requestPermissionsAndroidL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    lVar.invoke(bool2);
                    return r.f47939a;
                }
            });
            return;
        }
        String string2 = activity.getString(R.string.view_device_location_permission_description);
        C2171t0 c2171t1 = new C2171t0();
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_description", string2);
        c2171t1.setArguments(bundle2);
        c2171t1.f32261r = activity.getSupportFragmentManager();
        c2171t1.A();
        W7.c.g(0);
    }
}
