package p318zb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.p;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public class t extends l {
    @Override // p318zb.l
    public final void a(z path) throws IOException {
        i.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = path.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // p318zb.l
    public final List<z> d(z dir) throws IOException {
        i.e(dir, "dir");
        File fileE = dir.e();
        String[] list = fileE.list();
        if (list == null) {
            if (fileE.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            i.b(str);
            arrayList.add(dir.d(str));
        }
        p.F(arrayList);
        return arrayList;
    }

    @Override // p318zb.l
    public k f(z path) {
        i.e(path, "path");
        File fileE = path.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileE.exists()) {
            return null;
        }
        return new k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // p318zb.l
    public final AbstractC2843j g(z file) {
        i.e(file, "file");
        return new s(new RandomAccessFile(file.e(), "r"));
    }

    @Override // p318zb.l
    public final F h(z file) {
        i.e(file, "file");
        File fileE = file.e();
        Logger logger = w.f49117a;
        return new y(new FileOutputStream(fileE, false), new I());
    }

    @Override // p318zb.l
    public final H i(z file) {
        i.e(file, "file");
        return v.f(file.e());
    }

    public void j(z source, z target) throws IOException {
        i.e(source, "source");
        i.e(target, "target");
        if (source.e().renameTo(target.e())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
