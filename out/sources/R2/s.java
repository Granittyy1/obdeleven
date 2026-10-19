package R2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ProcessUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    static {
        kotlin.jvm.internal.i.d(androidx.work.k.d("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, androidx.work.a configuration) {
        String strA;
        Object next;
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strA = C0748a.f5220a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, androidx.work.o.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                kotlin.jvm.internal.i.b(objInvoke);
                if (objInvoke instanceof String) {
                    strA = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strA = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                androidx.work.k.c().getClass();
            }
        }
        return kotlin.jvm.internal.i.a(strA, context.getApplicationInfo().processName);
    }
}
