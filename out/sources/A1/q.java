package A1;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public interface q extends p078g1.i {
    boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long d();

    void e(int i10) throws IOException;

    long getLength();

    long getPosition();

    void h();

    void i(int i10) throws IOException;

    void j(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
