package K2;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: K2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkDatabasePathHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0708a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0708a f4188a = new C0708a();

    public final File a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
