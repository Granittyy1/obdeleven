package D6;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FileStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f2814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f2815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f2816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f2817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f2818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f2819f;

    public f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f2814a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f2815b = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f2816c = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f2817d = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f2818e = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f2819f = file5;
    }

    public static void a(File file) {
        if (file.exists() && d(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public static synchronized void c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> e(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File b(String str, String str2) {
        File file = new File(this.f2816c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
