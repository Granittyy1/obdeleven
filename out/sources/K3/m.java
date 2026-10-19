package K3;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: HardwareConfigState.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final File f4258f = new File("/proc/self/fd");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile m f4259g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4264e = true;

    public m() {
        boolean z10 = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String strSubstring = str.substring(0, 7);
            strSubstring.getClass();
            switch (strSubstring) {
                case "SM-A520":
                case "SM-G930":
                case "SM-G935":
                case "SM-G960":
                case "SM-G965":
                case "SM-J720":
                case "SM-N935":
                    if (Build.VERSION.SDK_INT == 26) {
                        z10 = false;
                        break;
                    }
                    break;
            }
        }
        this.f4260a = z10;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4261b = 20000;
            this.f4262c = 0;
        } else {
            this.f4261b = 700;
            this.f4262c = 128;
        }
    }

    public static m a() {
        if (f4259g == null) {
            synchronized (m.class) {
                try {
                    if (f4259g == null) {
                        f4259g = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4259g;
    }
}
