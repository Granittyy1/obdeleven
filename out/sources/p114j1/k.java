package p114j1;

import C4.b;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f41036a = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f41036a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbF = b.f(str, "\n  ");
        sbF.append(strReplace.replace("\n", "\n  "));
        sbF.append('\n');
        return sbF.toString();
    }

    public static void b(String str) {
        synchronized (f41036a) {
            a(str, null);
        }
    }

    public static void c(String str, String str2) {
        synchronized (f41036a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f41036a) {
            Log.e(str, a(str2, th));
        }
    }

    public static void e(String str) {
        synchronized (f41036a) {
            a(str, null);
        }
    }

    public static void f(String str) {
        synchronized (f41036a) {
            a(str, null);
        }
    }

    public static void g(String str, Throwable th) {
        synchronized (f41036a) {
            a(str, th);
        }
    }
}
