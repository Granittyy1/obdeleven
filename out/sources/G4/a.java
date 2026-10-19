package G4;

import android.util.Log;

/* JADX INFO: compiled from: Logging.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }
}
