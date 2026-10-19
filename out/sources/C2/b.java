package C2;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Trace.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f2327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2328b;

    public static boolean a() {
        try {
            if (f2328b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2328b == null) {
                f2327a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2328b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2328b.invoke(null, Long.valueOf(f2327a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
