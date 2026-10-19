package p318zb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.i;
import okio.internal.f;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f49101a;

    static {
        t tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f49101a = tVar;
        String str = z.f49122c;
        String property = System.getProperty("java.io.tmpdir");
        i.d(property, "getProperty(...)");
        z.a.a(property, false);
        ClassLoader classLoader = f.class.getClassLoader();
        i.d(classLoader, "getClassLoader(...)");
        new f(classLoader);
    }

    public abstract void a(z zVar) throws IOException;

    public final void b(z path) throws IOException {
        i.e(path, "path");
        a(path);
    }

    public final boolean c(z path) throws IOException {
        i.e(path, "path");
        return f(path) != null;
    }

    public abstract List<z> d(z zVar) throws IOException;

    public final k e(z path) throws IOException {
        i.e(path, "path");
        k kVarF = f(path);
        if (kVarF != null) {
            return kVarF;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract k f(z zVar) throws IOException;

    public abstract AbstractC2843j g(z zVar) throws IOException;

    public abstract F h(z zVar) throws IOException;

    public abstract H i(z zVar) throws IOException;
}
