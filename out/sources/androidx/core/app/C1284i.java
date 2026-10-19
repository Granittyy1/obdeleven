package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: androidx.core.app.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppOpsManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1284i {
    public static <T> T a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
