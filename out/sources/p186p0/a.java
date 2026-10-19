package p186p0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.util.WeakHashMap;
import p211r0.f;

/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f45793a = null;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class C0517a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class b {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class c {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) == 0 || str != null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
            }
            String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (Fa.d.b(context, str2) == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
            }
            throw new RuntimeException(androidx.compose.foundation.gestures.d.b("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class e {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.f46250c) {
            try {
                SparseArray<f.c> sparseArray = f.f46249b.get(dVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (cVar = sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (cVar.f46252b.equals(resources.getConfiguration())) {
                        if (theme != null || cVar.f46253c != 0) {
                            if (theme == null || cVar.f46253c != theme.hashCode()) {
                            }
                        }
                        colorStateList = cVar.f46251a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = f.f46248a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = p211r0.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return f.b.b(resources, i10, theme);
        }
        synchronized (f.f46250c) {
            try {
                WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = f.f46249b;
                SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray2);
                }
                sparseArray2.append(i10, new f.c(colorStateListA, dVar.f46254a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        int i11 = i10 & 2;
        if (i11 == 0 && (i10 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            e.a(context, broadcastReceiver, intentFilter, null, null, i10);
        } else {
            d.a(context, broadcastReceiver, intentFilter, null, null, i10);
        }
    }
}
