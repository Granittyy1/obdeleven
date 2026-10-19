package p232sb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import p318zb.I;
import p318zb.w;
import p318zb.y;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46995a = new a();

    public final void a(File file) throws IOException {
        i.e(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public final void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }

    public final boolean c(File file) {
        i.e(file, "file");
        return file.exists();
    }

    public final void d(File from, File to) throws IOException {
        i.e(from, "from");
        i.e(to, "to");
        a(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    public final y e(File file) throws FileNotFoundException {
        i.e(file, "file");
        try {
            Logger logger = w.f49117a;
            return new y(new FileOutputStream(file, false), new I());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = w.f49117a;
            return new y(new FileOutputStream(file, false), new I());
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
