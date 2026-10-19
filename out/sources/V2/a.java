package V2;

import coil.request.k;
import java.io.File;

/* JADX INFO: compiled from: FileKeyer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6724a;

    public a(boolean z10) {
        this.f6724a = z10;
    }

    @Override // V2.b
    public final String a(File file, k kVar) {
        File file2 = file;
        if (!this.f6724a) {
            return file2.getPath();
        }
        return file2.getPath() + ':' + file2.lastModified();
    }
}
