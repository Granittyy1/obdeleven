package H3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f.d<InputStream> {
    @Override // H3.f.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // H3.f.d
    public final void b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // H3.f.d
    public final InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
