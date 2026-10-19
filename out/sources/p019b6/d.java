package p019b6;

import G6.b;
import J4.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.runtime.snapshots.j;
import kotlin.text.l;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j f20562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f20563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f20564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f20565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f20566e;

    public static void b(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(i.b(i11, "at index "));
            }
        }
    }

    public static final int c(int i10, String str) {
        String property;
        Integer numA;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numA = l.A(property)) == null) ? i10 : numA.intValue();
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f20563b == null) {
            f20563b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f20563b.booleanValue();
        if (f20564c == null) {
            f20564c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f20564c.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    @Override // G6.b
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }
}
