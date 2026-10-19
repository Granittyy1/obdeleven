package N3;

import D3.o;
import com.google.android.gms.internal.measurement.M1;
import java.io.File;

/* JADX INFO: compiled from: FileResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o<File> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f4643b;

    public b(File file) {
        M1.d(file, "Argument must not be null");
        this.f4643b = file;
    }

    @Override // D3.o
    public final Class<File> c() {
        return this.f4643b.getClass();
    }

    @Override // D3.o
    public final File get() {
        return this.f4643b;
    }

    @Override // D3.o
    public final int getSize() {
        return 1;
    }

    @Override // D3.o
    public final void a() {
    }
}
