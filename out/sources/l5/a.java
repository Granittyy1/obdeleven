package l5;

import S4.C0764f;
import U4.C0804l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.g;
import com.google.android.gms.internal.common.h;
import com.google.android.gms.internal.common.i;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.a f44376a = com.google.android.gms.common.a.f25299b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f44377b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f44378c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f44379d = false;

    /* JADX WARN: Code duplicated, block: B:31:0x008e A[Catch: all -> 0x0066, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x0078, B:23:0x007d, B:20:0x006a, B:25:0x007f, B:26:0x0083, B:31:0x008e, B:33:0x0092, B:36:0x00cc, B:39:0x00d6, B:40:0x00db, B:42:0x00dd, B:43:0x00eb), top: B:50:0x0054, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[Catch: all -> 0x0066, TryCatch #2 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x0078, B:23:0x007d, B:20:0x006a, B:25:0x007f, B:26:0x0083, B:31:0x008e, B:33:0x0092, B:36:0x00cc, B:39:0x00d6, B:40:0x00db, B:42:0x00dd, B:43:0x00eb), top: B:50:0x0054, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[Catch: all -> 0x0066, TryCatch #2 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x0078, B:23:0x007d, B:20:0x006a, B:25:0x007f, B:26:0x0083, B:31:0x008e, B:33:0x0092, B:36:0x00cc, B:39:0x00d6, B:40:0x00db, B:42:0x00dd, B:43:0x00eb), top: B:50:0x0054, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        boolean z10;
        Context contextCreatePackageContext;
        Context context2;
        C0804l.i(context, "Context must not be null");
        f44376a.getClass();
        AtomicBoolean atomicBoolean = C0764f.f5539a;
        com.google.android.gms.common.a aVar = com.google.android.gms.common.a.f25299b;
        int iB = aVar.b(context, 11925000);
        if (iB != 0) {
            Intent intentA = aVar.a(context, "e", iB);
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iB);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentA != null) {
                throw new GooglePlayServicesRepairableException(iB, intentA);
            }
            throw new GooglePlayServicesNotAvailableException(iB);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f44377b) {
            Context context3 = null;
            if (f44379d) {
                z10 = f44379d;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    f44379d = true;
                    if (!z10) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        h hVar = new h(Context.class, context);
                        Class cls = Long.TYPE;
                        i.a(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", hVar, new g(cls, Long.valueOf(jUptimeMillis)), new g(cls, Long.valueOf(jUptimeMillis2)));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
            try {
                context2 = DynamiteModule.c(context, DynamiteModule.f25336c, "com.google.android.gms.providerinstaller.dynamite").f25346a;
            } catch (DynamiteModule.LoadingException e10) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage()));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z10 = f44379d;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                f44379d = true;
                if (!z10) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        h hVar2 = new h(Context.class, context);
                        Class cls2 = Long.TYPE;
                        i.a(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", hVar2, new g(cls2, Long.valueOf(jUptimeMillis)), new g(cls2, Long.valueOf(jUptimeMillis3)));
                    } catch (Exception e11) {
                        "Failed to report request stats: ".concat(e11.toString());
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
            throw th;
        }
    }

    public static void b(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f44378c == null) {
                f44378c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f44378c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
