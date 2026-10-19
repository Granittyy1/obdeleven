package H9;

import A8.p;
import D9.m;
import D9.s;
import com.google.protobuf.C2071m;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.J;
import com.google.protobuf.S;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ProtoInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends InputStream implements m, s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S<?> f3742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteArrayInputStream f3743d;

    public a(J j, S<?> s10) {
        this.f3741b = j;
        this.f3742c = s10;
    }

    @Override // java.io.InputStream
    public final int available() {
        J j = this.f3741b;
        if (j != null) {
            return j.c();
        }
        ByteArrayInputStream byteArrayInputStream = this.f3743d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // D9.m
    public final int b(OutputStream outputStream) throws IOException {
        J j = this.f3741b;
        if (j != null) {
            int iC = j.c();
            this.f3741b.f(outputStream);
            this.f3741b = null;
            return iC;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3743d;
        if (byteArrayInputStream == null) {
            return 0;
        }
        C2071m c2071m = b.f3744a;
        p.j(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = byteArrayInputStream.read(bArr);
            if (i10 == -1) {
                int i11 = (int) j10;
                this.f3743d = null;
                return i11;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f3741b != null) {
            this.f3743d = new ByteArrayInputStream(this.f3741b.n());
            this.f3741b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3743d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        J j = this.f3741b;
        if (j != null) {
            int iC = j.c();
            if (iC == 0) {
                this.f3741b = null;
                this.f3743d = null;
                return -1;
            }
            if (i11 >= iC) {
                Logger logger = CodedOutputStream.f29012b;
                CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, i10, iC);
                this.f3741b.g(bVar);
                if (bVar.W() == 0) {
                    this.f3741b = null;
                    this.f3743d = null;
                    return iC;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f3743d = new ByteArrayInputStream(this.f3741b.n());
            this.f3741b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3743d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
