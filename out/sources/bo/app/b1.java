package bo.app;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f20743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f20744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f20745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m0.c f20746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f20747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f20749g;

    public b1(String str, int i10, File file) {
        this.f20743a = str;
        this.f20748f = i10;
        this.f20749g = file;
        this.f20744b = new long[i10];
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j : this.f20744b) {
            sb2.append(' ');
            sb2.append(j);
        }
        return sb2.toString();
    }

    public void b(String[] strArr) throws IOException {
        if (strArr.length != this.f20748f) {
            throw a(strArr);
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                this.f20744b[i10] = Long.parseLong(strArr[i10]);
            } catch (NumberFormatException unused) {
                throw a(strArr);
            }
        }
    }

    public IOException a(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    public File a(int i10) {
        return new File(this.f20749g, this.f20743a + "." + i10);
    }

    public File b(int i10) {
        return new File(this.f20749g, this.f20743a + "." + i10 + ".tmp");
    }
}
