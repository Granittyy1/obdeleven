package R2;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: PackageManagerHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    static {
        androidx.work.k.d("PackageManagerHelper");
    }

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            if (z10 == z11) {
                androidx.work.k.c().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
                androidx.work.k.c().getClass();
            }
        } catch (Exception unused) {
            androidx.work.k.c().getClass();
        }
    }
}
