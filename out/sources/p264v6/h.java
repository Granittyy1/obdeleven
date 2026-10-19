package p264v6;

import A6.T;
import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static T a(String str, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        T.a aVar = new T.a();
        aVar.f779a = str;
        aVar.f780b = Integer.valueOf(i10);
        aVar.f781c = Integer.valueOf(i11);
        aVar.f782d = false;
        return aVar.a();
    }

    public static ArrayList b(Context context) {
        i.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.f42983b;
        }
        ArrayList arrayListM = q.M(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            T.a aVar = new T.a();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            aVar.f779a = str2;
            aVar.f780b = Integer.valueOf(runningAppProcessInfo.pid);
            aVar.f781c = Integer.valueOf(runningAppProcessInfo.importance);
            aVar.f782d = Boolean.valueOf(i.a(runningAppProcessInfo.processName, str));
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }
}
